/**
 * 
 */
package com.cloderia.helion.client.local.invoiceterm;

import java.util.List;
import java.util.Date;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.DateInput;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.jboss.errai.ui.nav.client.local.TransitionTo;

import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Termtype;
import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.user.client.DOM;
import com.google.gwt.core.client.JsDate;

/**
 * @author Edward Banfa
 *
 */
@Templated(value = "edit-invoiceterm-page.html#invoicetermEditor")
public class InvoicetermEditor extends InvoicetermPresenter implements IsElement {

	@Inject
	@DataField
	private Div invoicetermEditor;
	
	@Inject
	@DataField
	private ListBox termTy;
	@Inject
	@DataField
	private ListBox invoiceItem;
	@Inject
	@DataField
	private ListBox invoice;
	@Inject
	@DataField
	private ListBox universe;

	@Inject
	@Bound
	@DataField
	private TextBox entityCode;
	@Inject
	@Bound
	@DataField
	private TextBox name;
	@Inject
	@Bound
	@DataField
	private TextBox termValue;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editInvoicetermBtn = new Button();

	@Inject
	@EditEntity
	private Event<InvoicetermEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<InvoicetermEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListInvoicetermPage> listInvoicetermsPage;
	
	@DataField
	protected AnchorElement listInvoicetermsPageLink = DOM.createAnchor().cast();

	@EventHandler("editInvoicetermBtn")
	public void editInvoiceterm(ClickEvent e) {
	Long termTyId = Long.valueOf(termTy.getSelectedValue());
	Long invoiceItemId = Long.valueOf(invoiceItem.getSelectedValue());
	Long invoiceId = Long.valueOf(invoice.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		InvoicetermOperation invoicetermOperation = initOps();
	    invoicetermOperation.setTermTyId(termTyId);
	    invoicetermOperation.setInvoiceItemId(invoiceItemId);
	    invoicetermOperation.setInvoiceId(invoiceId);
	    invoicetermOperation.setUniverseId(universeId);
		if (getEditMode())
			editEntityEvent.fire(this);
		else
			createEntityEvent.fire(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {
		return invoicetermEditor;
	}

	/**
	 * @return the editMode
	 */
	public Boolean getEditMode() {
		return editMode;
	}

	/**
	 * @param editMode
	 *            the editMode to set
	 */
	public void setEditMode(Boolean editMode) {
		this.editMode = editMode;
	}
	public void loadTermTys(List<Termtype> termTys) {
		termTy.addItem("", "Select Termtype");
		for (Termtype termTyEntity : termTys) {
			termTy.addItem(termTyEntity.getName(), termTyEntity.getId().toString());
		}
	}
	public void loadInvoiceItems(List<Invoiceitem> invoiceItems) {
		invoiceItem.addItem("", "Select Invoiceitem");
		for (Invoiceitem invoiceItemEntity : invoiceItems) {
			invoiceItem.addItem(invoiceItemEntity.getName(), invoiceItemEntity.getId().toString());
		}
	}
	public void loadInvoices(List<Invoice> invoices) {
		invoice.addItem("", "Select Invoice");
		for (Invoice invoiceEntity : invoices) {
			invoice.addItem(invoiceEntity.getName(), invoiceEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}

	@EventHandler("listInvoicetermsPageLink")
	public void submit(ClickEvent e) {
		listInvoicetermsPage.go();
	}

}

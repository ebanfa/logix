/**
 * 
 */
package com.cloderia.helion.client.local.invoice;

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
import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Billingaccount;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;
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
@Templated(value = "edit-invoice-page.html#invoiceEditor")
public class InvoiceEditor extends InvoicePresenter implements IsElement {

	@Inject
	@DataField
	private Div invoiceEditor;
	
	@Inject
	@DataField
	private ListBox fromContMech;
	@Inject
	@DataField
	private ListBox toParty;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox billingAcct;

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
	private TextBox description;
	@Inject
	@Bound
	@DataField
	private TextBox message;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editInvoiceBtn = new Button();

	@Inject
	@EditEntity
	private Event<InvoiceEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<InvoiceEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListInvoicePage> listInvoicesPage;
	
	@DataField
	protected AnchorElement listInvoicesPageLink = DOM.createAnchor().cast();

	@EventHandler("editInvoiceBtn")
	public void editInvoice(ClickEvent e) {
	Long fromContMechId = Long.valueOf(fromContMech.getSelectedValue());
	Long toPartyId = Long.valueOf(toParty.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long billingAcctId = Long.valueOf(billingAcct.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		InvoiceOperation invoiceOperation = initOps();
	    invoiceOperation.setFromContMechId(fromContMechId);
	    invoiceOperation.setToPartyId(toPartyId);
	    invoiceOperation.setUniverseId(universeId);
	    invoiceOperation.setBillingAcctId(billingAcctId);
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
		return invoiceEditor;
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
	public void loadFromContMechs(List<Contactmechanism> fromContMechs) {
		fromContMech.addItem("", "Select Contactmechanism");
		for (Contactmechanism fromContMechEntity : fromContMechs) {
			fromContMech.addItem(fromContMechEntity.getName(), fromContMechEntity.getId().toString());
		}
	}
	public void loadToPartys(List<Party> toPartys) {
		toParty.addItem("", "Select Party");
		for (Party toPartyEntity : toPartys) {
			toParty.addItem(toPartyEntity.getName(), toPartyEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadBillingAccts(List<Billingaccount> billingAccts) {
		billingAcct.addItem("", "Select Billingaccount");
		for (Billingaccount billingAcctEntity : billingAccts) {
			billingAcct.addItem(billingAcctEntity.getName(), billingAcctEntity.getId().toString());
		}
	}

	@EventHandler("listInvoicesPageLink")
	public void submit(ClickEvent e) {
		listInvoicesPage.go();
	}

}

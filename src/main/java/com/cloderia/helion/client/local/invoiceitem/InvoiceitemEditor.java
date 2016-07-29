/**
 * 
 */
package com.cloderia.helion.client.local.invoiceitem;

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
import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;
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
@Templated(value = "edit-invoiceitem-page.html#invoiceitemEditor")
public class InvoiceitemEditor extends InvoiceitemPresenter implements IsElement {

	@Inject
	@DataField
	private Div invoiceitemEditor;
	
	@Inject
	@DataField
	private ListBox itemTy;
	@Inject
	@DataField
	private ListBox prodFeat;
	@Inject
	@DataField
	private ListBox soldWithItem;
	@Inject
	@DataField
	private ListBox invoice;
	@Inject
	@DataField
	private ListBox inventoryItem;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox prod;

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
	private TextBox itemDescription;
	@Inject
	@Bound
	@DataField
	private TextBox quantity;
	@Inject
	@Bound
	@DataField
	private TextBox amount;
	@Inject
	@Bound
	@DataField
	private TextBox unitPrice;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editInvoiceitemBtn = new Button();

	@Inject
	@EditEntity
	private Event<InvoiceitemEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<InvoiceitemEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListInvoiceitemPage> listInvoiceitemsPage;
	
	@DataField
	protected AnchorElement listInvoiceitemsPageLink = DOM.createAnchor().cast();

	@EventHandler("editInvoiceitemBtn")
	public void editInvoiceitem(ClickEvent e) {
	Long itemTyId = Long.valueOf(itemTy.getSelectedValue());
	Long prodFeatId = Long.valueOf(prodFeat.getSelectedValue());
	Long soldWithItemId = Long.valueOf(soldWithItem.getSelectedValue());
	Long invoiceId = Long.valueOf(invoice.getSelectedValue());
	Long inventoryItemId = Long.valueOf(inventoryItem.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long prodId = Long.valueOf(prod.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		InvoiceitemOperation invoiceitemOperation = initOps();
	    invoiceitemOperation.setItemTyId(itemTyId);
	    invoiceitemOperation.setProdFeatId(prodFeatId);
	    invoiceitemOperation.setSoldWithItemId(soldWithItemId);
	    invoiceitemOperation.setInvoiceId(invoiceId);
	    invoiceitemOperation.setInventoryItemId(inventoryItemId);
	    invoiceitemOperation.setUniverseId(universeId);
	    invoiceitemOperation.setProdId(prodId);
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
		return invoiceitemEditor;
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
	public void loadItemTys(List<Invoiceitemtype> itemTys) {
		itemTy.addItem("", "Select Invoiceitemtype");
		for (Invoiceitemtype itemTyEntity : itemTys) {
			itemTy.addItem(itemTyEntity.getName(), itemTyEntity.getId().toString());
		}
	}
	public void loadProdFeats(List<Productfeature> prodFeats) {
		prodFeat.addItem("", "Select Productfeature");
		for (Productfeature prodFeatEntity : prodFeats) {
			prodFeat.addItem(prodFeatEntity.getName(), prodFeatEntity.getId().toString());
		}
	}
	public void loadSoldWithItems(List<Invoiceitem> soldWithItems) {
		soldWithItem.addItem("", "Select Invoiceitem");
		for (Invoiceitem soldWithItemEntity : soldWithItems) {
			soldWithItem.addItem(soldWithItemEntity.getName(), soldWithItemEntity.getId().toString());
		}
	}
	public void loadInvoices(List<Invoice> invoices) {
		invoice.addItem("", "Select Invoice");
		for (Invoice invoiceEntity : invoices) {
			invoice.addItem(invoiceEntity.getName(), invoiceEntity.getId().toString());
		}
	}
	public void loadInventoryItems(List<Inventoryitem> inventoryItems) {
		inventoryItem.addItem("", "Select Inventoryitem");
		for (Inventoryitem inventoryItemEntity : inventoryItems) {
			inventoryItem.addItem(inventoryItemEntity.getName(), inventoryItemEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadProds(List<Product> prods) {
		prod.addItem("", "Select Product");
		for (Product prodEntity : prods) {
			prod.addItem(prodEntity.getName(), prodEntity.getId().toString());
		}
	}

	@EventHandler("listInvoiceitemsPageLink")
	public void submit(ClickEvent e) {
		listInvoiceitemsPage.go();
	}

}

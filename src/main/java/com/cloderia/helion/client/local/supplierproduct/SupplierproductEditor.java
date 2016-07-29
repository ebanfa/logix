/**
 * 
 */
package com.cloderia.helion.client.local.supplierproduct;

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
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Ratingtype;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.model.Preferencetype;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;
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
@Templated(value = "edit-supplierproduct-page.html#supplierproductEditor")
public class SupplierproductEditor extends SupplierproductPresenter implements IsElement {

	@Inject
	@DataField
	private Div supplierproductEditor;
	
	@Inject
	@DataField
	private ListBox supplier;
	@Inject
	@DataField
	private ListBox rating;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox prod;
	@Inject
	@DataField
	private ListBox pref;

	@Inject
	@Bound
	@DataField
	private TextBox entityCode;
	@Inject
	@Bound
	@DataField
	private TextBox name;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox availFromDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox availToDt;
	@Inject
	@Bound
	@DataField
	private TextBox remarks;
	@DataField
	private Button editSupplierproductBtn = new Button();

	@Inject
	@EditEntity
	private Event<SupplierproductEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<SupplierproductEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListSupplierproductPage> listSupplierproductsPage;
	
	@DataField
	protected AnchorElement listSupplierproductsPageLink = DOM.createAnchor().cast();

	@EventHandler("editSupplierproductBtn")
	public void editSupplierproduct(ClickEvent e) {
	Long supplierId = Long.valueOf(supplier.getSelectedValue());
	Long ratingId = Long.valueOf(rating.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long prodId = Long.valueOf(prod.getSelectedValue());
	Long prefId = Long.valueOf(pref.getSelectedValue());
       	final JsDate availFromDtDate = JsDate.create(availFromDt.getValue());
       	this.getValue().setAvailFromDt(new Date((long) availFromDtDate.getTime()));
       	final JsDate availToDtDate = JsDate.create(availToDt.getValue());
       	this.getValue().setAvailToDt(new Date((long) availToDtDate.getTime()));
       	
		SupplierproductOperation supplierproductOperation = initOps();
	    supplierproductOperation.setSupplierId(supplierId);
	    supplierproductOperation.setRatingId(ratingId);
	    supplierproductOperation.setUniverseId(universeId);
	    supplierproductOperation.setProdId(prodId);
	    supplierproductOperation.setPrefId(prefId);
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
		return supplierproductEditor;
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
	public void loadSuppliers(List<Party> suppliers) {
		supplier.addItem("", "Select Party");
		for (Party supplierEntity : suppliers) {
			supplier.addItem(supplierEntity.getName(), supplierEntity.getId().toString());
		}
	}
	public void loadRatings(List<Ratingtype> ratings) {
		rating.addItem("", "Select Ratingtype");
		for (Ratingtype ratingEntity : ratings) {
			rating.addItem(ratingEntity.getName(), ratingEntity.getId().toString());
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
	public void loadPrefs(List<Preferencetype> prefs) {
		pref.addItem("", "Select Preferencetype");
		for (Preferencetype prefEntity : prefs) {
			pref.addItem(prefEntity.getName(), prefEntity.getId().toString());
		}
	}

	@EventHandler("listSupplierproductsPageLink")
	public void submit(ClickEvent e) {
		listSupplierproductsPage.go();
	}

}

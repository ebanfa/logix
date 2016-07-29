/**
 * 
 */
package com.cloderia.helion.client.local.product;

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
import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Producttype;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.ProductOperation;
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
@Templated(value = "edit-product-page.html#productEditor")
public class ProductEditor extends ProductPresenter implements IsElement {

	@Inject
	@DataField
	private Div productEditor;
	
	@Inject
	@DataField
	private ListBox uom;
	@Inject
	@DataField
	private ListBox manufacturer;
	@Inject
	@DataField
	private ListBox prodTy;
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
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox introductionDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox salesDiscDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox supportDiscDt;
	@Inject
	@Bound
	@DataField
	private TextBox remarks;
	@DataField
	private Button editProductBtn = new Button();

	@Inject
	@EditEntity
	private Event<ProductEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<ProductEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListProductPage> listProductsPage;
	
	@DataField
	protected AnchorElement listProductsPageLink = DOM.createAnchor().cast();

	@EventHandler("editProductBtn")
	public void editProduct(ClickEvent e) {
	Long uomId = Long.valueOf(uom.getSelectedValue());
	Long manufacturerId = Long.valueOf(manufacturer.getSelectedValue());
	Long prodTyId = Long.valueOf(prodTy.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
       	final JsDate introductionDtDate = JsDate.create(introductionDt.getValue());
       	this.getValue().setIntroductionDt(new Date((long) introductionDtDate.getTime()));
       	final JsDate salesDiscDtDate = JsDate.create(salesDiscDt.getValue());
       	this.getValue().setSalesDiscDt(new Date((long) salesDiscDtDate.getTime()));
       	final JsDate supportDiscDtDate = JsDate.create(supportDiscDt.getValue());
       	this.getValue().setSupportDiscDt(new Date((long) supportDiscDtDate.getTime()));
       	
		ProductOperation productOperation = initOps();
	    productOperation.setUomId(uomId);
	    productOperation.setManufacturerId(manufacturerId);
	    productOperation.setProdTyId(prodTyId);
	    productOperation.setUniverseId(universeId);
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
		return productEditor;
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
	public void loadUoms(List<Uom> uoms) {
		uom.addItem("", "Select Uom");
		for (Uom uomEntity : uoms) {
			uom.addItem(uomEntity.getName(), uomEntity.getId().toString());
		}
	}
	public void loadManufacturers(List<Party> manufacturers) {
		manufacturer.addItem("", "Select Party");
		for (Party manufacturerEntity : manufacturers) {
			manufacturer.addItem(manufacturerEntity.getName(), manufacturerEntity.getId().toString());
		}
	}
	public void loadProdTys(List<Producttype> prodTys) {
		prodTy.addItem("", "Select Producttype");
		for (Producttype prodTyEntity : prodTys) {
			prodTy.addItem(prodTyEntity.getName(), prodTyEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}

	@EventHandler("listProductsPageLink")
	public void submit(ClickEvent e) {
		listProductsPage.go();
	}

}

/**
 * 
 */
package com.cloderia.helion.client.local.productfeature;

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
import com.cloderia.helion.client.shared.model.Productfeaturecategory;
import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;
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
@Templated(value = "edit-productfeature-page.html#productfeatureEditor")
public class ProductfeatureEditor extends ProductfeaturePresenter implements IsElement {

	@Inject
	@DataField
	private Div productfeatureEditor;
	
	@Inject
	@DataField
	private ListBox prodFeatCat;
	@Inject
	@DataField
	private ListBox uom;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox prodFeatTy;

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
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editProductfeatureBtn = new Button();

	@Inject
	@EditEntity
	private Event<ProductfeatureEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<ProductfeatureEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListProductfeaturePage> listProductfeaturesPage;
	
	@DataField
	protected AnchorElement listProductfeaturesPageLink = DOM.createAnchor().cast();

	@EventHandler("editProductfeatureBtn")
	public void editProductfeature(ClickEvent e) {
	Long prodFeatCatId = Long.valueOf(prodFeatCat.getSelectedValue());
	Long uomId = Long.valueOf(uom.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long prodFeatTyId = Long.valueOf(prodFeatTy.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		ProductfeatureOperation productfeatureOperation = initOps();
	    productfeatureOperation.setProdFeatCatId(prodFeatCatId);
	    productfeatureOperation.setUomId(uomId);
	    productfeatureOperation.setUniverseId(universeId);
	    productfeatureOperation.setProdFeatTyId(prodFeatTyId);
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
		return productfeatureEditor;
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
	public void loadProdFeatCats(List<Productfeaturecategory> prodFeatCats) {
		prodFeatCat.addItem("", "Select Productfeaturecategory");
		for (Productfeaturecategory prodFeatCatEntity : prodFeatCats) {
			prodFeatCat.addItem(prodFeatCatEntity.getName(), prodFeatCatEntity.getId().toString());
		}
	}
	public void loadUoms(List<Uom> uoms) {
		uom.addItem("", "Select Uom");
		for (Uom uomEntity : uoms) {
			uom.addItem(uomEntity.getName(), uomEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadProdFeatTys(List<Productfeaturetype> prodFeatTys) {
		prodFeatTy.addItem("", "Select Productfeaturetype");
		for (Productfeaturetype prodFeatTyEntity : prodFeatTys) {
			prodFeatTy.addItem(prodFeatTyEntity.getName(), prodFeatTyEntity.getId().toString());
		}
	}

	@EventHandler("listProductfeaturesPageLink")
	public void submit(ClickEvent e) {
		listProductfeaturesPage.go();
	}

}

/**
 * 
 */
package com.cloderia.helion.client.local.facility;

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
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Facilitytype;
import com.cloderia.helion.client.shared.ops.FacilityOperation;
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
@Templated(value = "edit-facility-page.html#facilityEditor")
public class FacilityEditor extends FacilityPresenter implements IsElement {

	@Inject
	@DataField
	private Div facilityEditor;
	
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox facilityTy;

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
	private Button editFacilityBtn = new Button();

	@Inject
	@EditEntity
	private Event<FacilityEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<FacilityEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListFacilityPage> listFacilitysPage;
	
	@DataField
	protected AnchorElement listFacilitysPageLink = DOM.createAnchor().cast();

	@EventHandler("editFacilityBtn")
	public void editFacility(ClickEvent e) {
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long facilityTyId = Long.valueOf(facilityTy.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		FacilityOperation facilityOperation = initOps();
	    facilityOperation.setUniverseId(universeId);
	    facilityOperation.setFacilityTyId(facilityTyId);
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
		return facilityEditor;
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
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadFacilityTys(List<Facilitytype> facilityTys) {
		facilityTy.addItem("", "Select Facilitytype");
		for (Facilitytype facilityTyEntity : facilityTys) {
			facilityTy.addItem(facilityTyEntity.getName(), facilityTyEntity.getId().toString());
		}
	}

	@EventHandler("listFacilitysPageLink")
	public void submit(ClickEvent e) {
		listFacilitysPage.go();
	}

}

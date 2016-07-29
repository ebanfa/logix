/**
 * 
 */
package com.cloderia.helion.client.local.inventoryitem;

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
import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;
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
@Templated(value = "edit-inventoryitem-page.html#inventoryitemEditor")
public class InventoryitemEditor extends InventoryitemPresenter implements IsElement {

	@Inject
	@DataField
	private Div inventoryitemEditor;
	
	@Inject
	@DataField
	private ListBox lot;
	@Inject
	@DataField
	private ListBox container;
	@Inject
	@DataField
	private ListBox status;
	@Inject
	@DataField
	private ListBox itemTy;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox prod;
	@Inject
	@DataField
	private ListBox facility;

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
	private TextBox quantityOnHand;
	@Inject
	@Bound
	@DataField
	private TextBox serialNum;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editInventoryitemBtn = new Button();

	@Inject
	@EditEntity
	private Event<InventoryitemEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<InventoryitemEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListInventoryitemPage> listInventoryitemsPage;
	
	@DataField
	protected AnchorElement listInventoryitemsPageLink = DOM.createAnchor().cast();

	@EventHandler("editInventoryitemBtn")
	public void editInventoryitem(ClickEvent e) {
	Long lotId = Long.valueOf(lot.getSelectedValue());
	Long containerId = Long.valueOf(container.getSelectedValue());
	Long statusId = Long.valueOf(status.getSelectedValue());
	Long itemTyId = Long.valueOf(itemTy.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long prodId = Long.valueOf(prod.getSelectedValue());
	Long facilityId = Long.valueOf(facility.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		InventoryitemOperation inventoryitemOperation = initOps();
	    inventoryitemOperation.setLotId(lotId);
	    inventoryitemOperation.setContainerId(containerId);
	    inventoryitemOperation.setStatusId(statusId);
	    inventoryitemOperation.setItemTyId(itemTyId);
	    inventoryitemOperation.setUniverseId(universeId);
	    inventoryitemOperation.setProdId(prodId);
	    inventoryitemOperation.setFacilityId(facilityId);
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
		return inventoryitemEditor;
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
	public void loadLots(List<Lot> lots) {
		lot.addItem("", "Select Lot");
		for (Lot lotEntity : lots) {
			lot.addItem(lotEntity.getName(), lotEntity.getId().toString());
		}
	}
	public void loadContainers(List<Container> containers) {
		container.addItem("", "Select Container");
		for (Container containerEntity : containers) {
			container.addItem(containerEntity.getName(), containerEntity.getId().toString());
		}
	}
	public void loadStatuss(List<Inventoryitemstatus> statuss) {
		status.addItem("", "Select Inventoryitemstatus");
		for (Inventoryitemstatus statusEntity : statuss) {
			status.addItem(statusEntity.getName(), statusEntity.getId().toString());
		}
	}
	public void loadItemTys(List<Inventoryitemtype> itemTys) {
		itemTy.addItem("", "Select Inventoryitemtype");
		for (Inventoryitemtype itemTyEntity : itemTys) {
			itemTy.addItem(itemTyEntity.getName(), itemTyEntity.getId().toString());
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
	public void loadFacilitys(List<Facility> facilitys) {
		facility.addItem("", "Select Facility");
		for (Facility facilityEntity : facilitys) {
			facility.addItem(facilityEntity.getName(), facilityEntity.getId().toString());
		}
	}

	@EventHandler("listInventoryitemsPageLink")
	public void submit(ClickEvent e) {
		listInventoryitemsPage.go();
	}

}

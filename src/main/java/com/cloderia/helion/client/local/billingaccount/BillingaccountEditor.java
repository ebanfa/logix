/**
 * 
 */
package com.cloderia.helion.client.local.billingaccount;

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
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;
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
@Templated(value = "edit-billingaccount-page.html#billingaccountEditor")
public class BillingaccountEditor extends BillingaccountPresenter implements IsElement {

	@Inject
	@DataField
	private Div billingaccountEditor;
	
	@Inject
	@DataField
	private ListBox toContMech;
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
	private TextBox description;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox fromDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox toDt;
	@DataField
	private Button editBillingaccountBtn = new Button();

	@Inject
	@EditEntity
	private Event<BillingaccountEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<BillingaccountEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListBillingaccountPage> listBillingaccountsPage;
	
	@DataField
	protected AnchorElement listBillingaccountsPageLink = DOM.createAnchor().cast();

	@EventHandler("editBillingaccountBtn")
	public void editBillingaccount(ClickEvent e) {
	Long toContMechId = Long.valueOf(toContMech.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
       	final JsDate fromDtDate = JsDate.create(fromDt.getValue());
       	this.getValue().setFromDt(new Date((long) fromDtDate.getTime()));
       	final JsDate toDtDate = JsDate.create(toDt.getValue());
       	this.getValue().setToDt(new Date((long) toDtDate.getTime()));
       	
		BillingaccountOperation billingaccountOperation = initOps();
	    billingaccountOperation.setToContMechId(toContMechId);
	    billingaccountOperation.setUniverseId(universeId);
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
		return billingaccountEditor;
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
	public void loadToContMechs(List<Contactmechanism> toContMechs) {
		toContMech.addItem("", "Select Contactmechanism");
		for (Contactmechanism toContMechEntity : toContMechs) {
			toContMech.addItem(toContMechEntity.getName(), toContMechEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}

	@EventHandler("listBillingaccountsPageLink")
	public void submit(ClickEvent e) {
		listBillingaccountsPage.go();
	}

}

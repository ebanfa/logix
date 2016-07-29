/**
 * 
 */
package com.cloderia.helion.client.local.party;

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
import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.ops.PartyOperation;
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
@Templated(value = "edit-party-page.html#partyEditor")
public class PartyEditor extends PartyPresenter implements IsElement {

	@Inject
	@DataField
	private Div partyEditor;
	
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox partyTy;

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
	private Button editPartyBtn = new Button();

	@Inject
	@EditEntity
	private Event<PartyEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<PartyEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListPartyPage> listPartysPage;
	
	@DataField
	protected AnchorElement listPartysPageLink = DOM.createAnchor().cast();

	@EventHandler("editPartyBtn")
	public void editParty(ClickEvent e) {
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long partyTyId = Long.valueOf(partyTy.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		PartyOperation partyOperation = initOps();
	    partyOperation.setUniverseId(universeId);
	    partyOperation.setPartyTyId(partyTyId);
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
		return partyEditor;
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
	public void loadPartyTys(List<Partytype> partyTys) {
		partyTy.addItem("", "Select Partytype");
		for (Partytype partyTyEntity : partyTys) {
			partyTy.addItem(partyTyEntity.getName(), partyTyEntity.getId().toString());
		}
	}

	@EventHandler("listPartysPageLink")
	public void submit(ClickEvent e) {
		listPartysPage.go();
	}

}

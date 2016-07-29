/**
 * 
 */
package com.cloderia.helion.client.local.person;

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
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.PersonOperation;
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
@Templated(value = "edit-person-page.html#personEditor")
public class PersonEditor extends PersonPresenter implements IsElement {

	@Inject
	@DataField
	private Div personEditor;
	
	@Inject
	@DataField
	private ListBox party;
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
	private TextBox firstNm;
	@Inject
	@Bound
	@DataField
	private TextBox middleNm;
	@Inject
	@Bound
	@DataField
	private TextBox lastNm;
	@Inject
	@Bound
	@DataField
	private TextBox height;
	@Inject
	@Bound
	@DataField
	private TextBox weigth;
	@Inject
	@Bound
	@DataField
	private TextBox taxPin;
	@Inject
	@Bound
	@DataField
	private TextBox passportNo;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox passportExpDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editPersonBtn = new Button();

	@Inject
	@EditEntity
	private Event<PersonEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<PersonEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListPersonPage> listPersonsPage;
	
	@DataField
	protected AnchorElement listPersonsPageLink = DOM.createAnchor().cast();

	@EventHandler("editPersonBtn")
	public void editPerson(ClickEvent e) {
	Long partyId = Long.valueOf(party.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
       	final JsDate passportExpDtDate = JsDate.create(passportExpDt.getValue());
       	this.getValue().setPassportExpDt(new Date((long) passportExpDtDate.getTime()));
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		PersonOperation personOperation = initOps();
	    personOperation.setPartyId(partyId);
	    personOperation.setUniverseId(universeId);
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
		return personEditor;
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
	public void loadPartys(List<Party> partys) {
		party.addItem("", "Select Party");
		for (Party partyEntity : partys) {
			party.addItem(partyEntity.getName(), partyEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}

	@EventHandler("listPersonsPageLink")
	public void submit(ClickEvent e) {
		listPersonsPage.go();
	}

}

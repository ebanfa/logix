/**
 * 
 */
package com.cloderia.helion.client.local.partyrole;

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
import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;
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
@Templated(value = "edit-partyrole-page.html#partyroleEditor")
public class PartyroleEditor extends PartyrolePresenter implements IsElement {

	@Inject
	@DataField
	private Div partyroleEditor;
	
	@Inject
	@DataField
	private ListBox party;
	@Inject
	@DataField
	private ListBox partyRoleTy;
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
	private Button editPartyroleBtn = new Button();

	@Inject
	@EditEntity
	private Event<PartyroleEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<PartyroleEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListPartyrolePage> listPartyrolesPage;
	
	@DataField
	protected AnchorElement listPartyrolesPageLink = DOM.createAnchor().cast();

	@EventHandler("editPartyroleBtn")
	public void editPartyrole(ClickEvent e) {
	Long partyId = Long.valueOf(party.getSelectedValue());
	Long partyRoleTyId = Long.valueOf(partyRoleTy.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
       	final JsDate fromDtDate = JsDate.create(fromDt.getValue());
       	this.getValue().setFromDt(new Date((long) fromDtDate.getTime()));
       	final JsDate toDtDate = JsDate.create(toDt.getValue());
       	this.getValue().setToDt(new Date((long) toDtDate.getTime()));
       	
		PartyroleOperation partyroleOperation = initOps();
	    partyroleOperation.setPartyId(partyId);
	    partyroleOperation.setPartyRoleTyId(partyRoleTyId);
	    partyroleOperation.setUniverseId(universeId);
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
		return partyroleEditor;
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
	public void loadPartyRoleTys(List<Partyroletype> partyRoleTys) {
		partyRoleTy.addItem("", "Select Partyroletype");
		for (Partyroletype partyRoleTyEntity : partyRoleTys) {
			partyRoleTy.addItem(partyRoleTyEntity.getName(), partyRoleTyEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}

	@EventHandler("listPartyrolesPageLink")
	public void submit(ClickEvent e) {
		listPartyrolesPage.go();
	}

}

/**
 * 
 */
package com.cloderia.helion.client.local.organization;

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
import com.cloderia.helion.client.shared.ops.OrganizationOperation;
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
@Templated(value = "edit-organization-page.html#organizationEditor")
public class OrganizationEditor extends OrganizationPresenter implements IsElement {

	@Inject
	@DataField
	private Div organizationEditor;
	
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
	private TextBox description;
	@Inject
	@Bound
	@DataField
	private TextBox businessNo;
	@Inject
	@Bound
	@DataField
	private TextBox tax;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editOrganizationBtn = new Button();

	@Inject
	@EditEntity
	private Event<OrganizationEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<OrganizationEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListOrganizationPage> listOrganizationsPage;
	
	@DataField
	protected AnchorElement listOrganizationsPageLink = DOM.createAnchor().cast();

	@EventHandler("editOrganizationBtn")
	public void editOrganization(ClickEvent e) {
	Long partyId = Long.valueOf(party.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		OrganizationOperation organizationOperation = initOps();
	    organizationOperation.setPartyId(partyId);
	    organizationOperation.setUniverseId(universeId);
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
		return organizationEditor;
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

	@EventHandler("listOrganizationsPageLink")
	public void submit(ClickEvent e) {
		listOrganizationsPage.go();
	}

}

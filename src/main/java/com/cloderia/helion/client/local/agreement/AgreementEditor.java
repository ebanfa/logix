/**
 * 
 */
package com.cloderia.helion.client.local.agreement;

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
import com.cloderia.helion.client.shared.model.Agreementtype;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Partyrelationship;
import com.cloderia.helion.client.shared.ops.AgreementOperation;
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
@Templated(value = "edit-agreement-page.html#agreementEditor")
public class AgreementEditor extends AgreementPresenter implements IsElement {

	@Inject
	@DataField
	private Div agreementEditor;
	
	@Inject
	@DataField
	private ListBox agreementTy;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox partyRel;

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
	private TextBox agreementDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox fromDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox toDt;
	@DataField
	private Button editAgreementBtn = new Button();

	@Inject
	@EditEntity
	private Event<AgreementEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<AgreementEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListAgreementPage> listAgreementsPage;
	
	@DataField
	protected AnchorElement listAgreementsPageLink = DOM.createAnchor().cast();

	@EventHandler("editAgreementBtn")
	public void editAgreement(ClickEvent e) {
	Long agreementTyId = Long.valueOf(agreementTy.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long partyRelId = Long.valueOf(partyRel.getSelectedValue());
       	final JsDate agreementDtDate = JsDate.create(agreementDt.getValue());
       	this.getValue().setAgreementDt(new Date((long) agreementDtDate.getTime()));
       	final JsDate fromDtDate = JsDate.create(fromDt.getValue());
       	this.getValue().setFromDt(new Date((long) fromDtDate.getTime()));
       	final JsDate toDtDate = JsDate.create(toDt.getValue());
       	this.getValue().setToDt(new Date((long) toDtDate.getTime()));
       	
		AgreementOperation agreementOperation = initOps();
	    agreementOperation.setAgreementTyId(agreementTyId);
	    agreementOperation.setUniverseId(universeId);
	    agreementOperation.setPartyRelId(partyRelId);
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
		return agreementEditor;
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
	public void loadAgreementTys(List<Agreementtype> agreementTys) {
		agreementTy.addItem("", "Select Agreementtype");
		for (Agreementtype agreementTyEntity : agreementTys) {
			agreementTy.addItem(agreementTyEntity.getName(), agreementTyEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadPartyRels(List<Partyrelationship> partyRels) {
		partyRel.addItem("", "Select Partyrelationship");
		for (Partyrelationship partyRelEntity : partyRels) {
			partyRel.addItem(partyRelEntity.getName(), partyRelEntity.getId().toString());
		}
	}

	@EventHandler("listAgreementsPageLink")
	public void submit(ClickEvent e) {
		listAgreementsPage.go();
	}

}

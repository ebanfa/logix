/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;

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
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Accountingperiod;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
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
@Templated(value = "edit-organizationglaccountbalance-page.html#organizationglaccountbalanceEditor")
public class OrganizationglaccountbalanceEditor extends OrganizationglaccountbalancePresenter implements IsElement {

	@Inject
	@DataField
	private Div organizationglaccountbalanceEditor;
	
	@Inject
	@DataField
	private ListBox glAccount;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox accountingPeriod;

	@Inject
	@Bound
	@DataField
	private TextBox entityCode;
	@Inject
	@Bound
	@DataField
	private TextBox amount;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editOrganizationglaccountbalanceBtn = new Button();

	@Inject
	@EditEntity
	private Event<OrganizationglaccountbalanceEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<OrganizationglaccountbalanceEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListOrganizationglaccountbalancePage> listOrganizationglaccountbalancesPage;
	
	@DataField
	protected AnchorElement listOrganizationglaccountbalancesPageLink = DOM.createAnchor().cast();

	@EventHandler("editOrganizationglaccountbalanceBtn")
	public void editOrganizationglaccountbalance(ClickEvent e) {
	Long glAccountId = Long.valueOf(glAccount.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long accountingPeriodId = Long.valueOf(accountingPeriod.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		OrganizationglaccountbalanceOperation organizationglaccountbalanceOperation = initOps();
	    organizationglaccountbalanceOperation.setGlAccountId(glAccountId);
	    organizationglaccountbalanceOperation.setUniverseId(universeId);
	    organizationglaccountbalanceOperation.setAccountingPeriodId(accountingPeriodId);
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
		return organizationglaccountbalanceEditor;
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
	public void loadGlAccounts(List<Organizationgeneralledgeraccount> glAccounts) {
		glAccount.addItem("", "Select Organizationgeneralledgeraccount");
		for (Organizationgeneralledgeraccount glAccountEntity : glAccounts) {
			glAccount.addItem(glAccountEntity.getName(), glAccountEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadAccountingPeriods(List<Accountingperiod> accountingPeriods) {
		accountingPeriod.addItem("", "Select Accountingperiod");
		for (Accountingperiod accountingPeriodEntity : accountingPeriods) {
			accountingPeriod.addItem(accountingPeriodEntity.getName(), accountingPeriodEntity.getId().toString());
		}
	}

	@EventHandler("listOrganizationglaccountbalancesPageLink")
	public void submit(ClickEvent e) {
		listOrganizationglaccountbalancesPage.go();
	}

}

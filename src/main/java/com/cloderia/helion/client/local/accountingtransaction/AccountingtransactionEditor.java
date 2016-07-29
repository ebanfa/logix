/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

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
import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Accountingtransactiontype;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
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
@Templated(value = "edit-accountingtransaction-page.html#accountingtransactionEditor")
public class AccountingtransactionEditor extends AccountingtransactionPresenter implements IsElement {

	@Inject
	@DataField
	private Div accountingtransactionEditor;
	
	@Inject
	@DataField
	private ListBox payment;
	@Inject
	@DataField
	private ListBox fromParty;
	@Inject
	@DataField
	private ListBox invoice;
	@Inject
	@DataField
	private ListBox fixedAsset;
	@Inject
	@DataField
	private ListBox partyRole;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox transactionTy;

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
	private TextBox transactionDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox entryDt;
	@DataField
	private Button editAccountingtransactionBtn = new Button();

	@Inject
	@EditEntity
	private Event<AccountingtransactionEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<AccountingtransactionEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListAccountingtransactionPage> listAccountingtransactionsPage;
	
	@DataField
	protected AnchorElement listAccountingtransactionsPageLink = DOM.createAnchor().cast();

	@EventHandler("editAccountingtransactionBtn")
	public void editAccountingtransaction(ClickEvent e) {
	Long paymentId = Long.valueOf(payment.getSelectedValue());
	Long fromPartyId = Long.valueOf(fromParty.getSelectedValue());
	Long invoiceId = Long.valueOf(invoice.getSelectedValue());
	Long fixedAssetId = Long.valueOf(fixedAsset.getSelectedValue());
	Long partyRoleId = Long.valueOf(partyRole.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long transactionTyId = Long.valueOf(transactionTy.getSelectedValue());
       	final JsDate transactionDtDate = JsDate.create(transactionDt.getValue());
       	this.getValue().setTransactionDt(new Date((long) transactionDtDate.getTime()));
       	final JsDate entryDtDate = JsDate.create(entryDt.getValue());
       	this.getValue().setEntryDt(new Date((long) entryDtDate.getTime()));
       	
		AccountingtransactionOperation accountingtransactionOperation = initOps();
	    accountingtransactionOperation.setPaymentId(paymentId);
	    accountingtransactionOperation.setFromPartyId(fromPartyId);
	    accountingtransactionOperation.setInvoiceId(invoiceId);
	    accountingtransactionOperation.setFixedAssetId(fixedAssetId);
	    accountingtransactionOperation.setPartyRoleId(partyRoleId);
	    accountingtransactionOperation.setUniverseId(universeId);
	    accountingtransactionOperation.setTransactionTyId(transactionTyId);
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
		return accountingtransactionEditor;
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
	public void loadPayments(List<Payment> payments) {
		payment.addItem("", "Select Payment");
		for (Payment paymentEntity : payments) {
			payment.addItem(paymentEntity.getName(), paymentEntity.getId().toString());
		}
	}
	public void loadFromPartys(List<Party> fromPartys) {
		fromParty.addItem("", "Select Party");
		for (Party fromPartyEntity : fromPartys) {
			fromParty.addItem(fromPartyEntity.getName(), fromPartyEntity.getId().toString());
		}
	}
	public void loadInvoices(List<Invoice> invoices) {
		invoice.addItem("", "Select Invoice");
		for (Invoice invoiceEntity : invoices) {
			invoice.addItem(invoiceEntity.getName(), invoiceEntity.getId().toString());
		}
	}
	public void loadFixedAssets(List<Fixedasset> fixedAssets) {
		fixedAsset.addItem("", "Select Fixedasset");
		for (Fixedasset fixedAssetEntity : fixedAssets) {
			fixedAsset.addItem(fixedAssetEntity.getName(), fixedAssetEntity.getId().toString());
		}
	}
	public void loadPartyRoles(List<Partyrole> partyRoles) {
		partyRole.addItem("", "Select Partyrole");
		for (Partyrole partyRoleEntity : partyRoles) {
			partyRole.addItem(partyRoleEntity.getName(), partyRoleEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadTransactionTys(List<Accountingtransactiontype> transactionTys) {
		transactionTy.addItem("", "Select Accountingtransactiontype");
		for (Accountingtransactiontype transactionTyEntity : transactionTys) {
			transactionTy.addItem(transactionTyEntity.getName(), transactionTyEntity.getId().toString());
		}
	}

	@EventHandler("listAccountingtransactionsPageLink")
	public void submit(ClickEvent e) {
		listAccountingtransactionsPage.go();
	}

}

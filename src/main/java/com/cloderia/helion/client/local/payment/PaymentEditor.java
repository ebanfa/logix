/**
 * 
 */
package com.cloderia.helion.client.local.payment;

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
import com.cloderia.helion.client.shared.model.Paymenttype;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Paymentmethodtype;
import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.ops.PaymentOperation;
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
@Templated(value = "edit-payment-page.html#paymentEditor")
public class PaymentEditor extends PaymentPresenter implements IsElement {

	@Inject
	@DataField
	private Div paymentEditor;
	
	@Inject
	@DataField
	private ListBox paymentTy;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox methodTy;
	@Inject
	@DataField
	private ListBox finAcct;

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
	private TextBox amount;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editPaymentBtn = new Button();

	@Inject
	@EditEntity
	private Event<PaymentEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<PaymentEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListPaymentPage> listPaymentsPage;
	
	@DataField
	protected AnchorElement listPaymentsPageLink = DOM.createAnchor().cast();

	@EventHandler("editPaymentBtn")
	public void editPayment(ClickEvent e) {
	Long paymentTyId = Long.valueOf(paymentTy.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long methodTyId = Long.valueOf(methodTy.getSelectedValue());
	Long finAcctId = Long.valueOf(finAcct.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		PaymentOperation paymentOperation = initOps();
	    paymentOperation.setPaymentTyId(paymentTyId);
	    paymentOperation.setUniverseId(universeId);
	    paymentOperation.setMethodTyId(methodTyId);
	    paymentOperation.setFinAcctId(finAcctId);
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
		return paymentEditor;
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
	public void loadPaymentTys(List<Paymenttype> paymentTys) {
		paymentTy.addItem("", "Select Paymenttype");
		for (Paymenttype paymentTyEntity : paymentTys) {
			paymentTy.addItem(paymentTyEntity.getName(), paymentTyEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadMethodTys(List<Paymentmethodtype> methodTys) {
		methodTy.addItem("", "Select Paymentmethodtype");
		for (Paymentmethodtype methodTyEntity : methodTys) {
			methodTy.addItem(methodTyEntity.getName(), methodTyEntity.getId().toString());
		}
	}
	public void loadFinAccts(List<Financialaccount> finAccts) {
		finAcct.addItem("", "Select Financialaccount");
		for (Financialaccount finAcctEntity : finAccts) {
			finAcct.addItem(finAcctEntity.getName(), finAcctEntity.getId().toString());
		}
	}

	@EventHandler("listPaymentsPageLink")
	public void submit(ClickEvent e) {
		listPaymentsPage.go();
	}

}

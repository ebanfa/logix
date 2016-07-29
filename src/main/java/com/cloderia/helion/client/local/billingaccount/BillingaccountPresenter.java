/**
 * 
 */
package com.cloderia.helion.client.local.billingaccount;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Billingaccount;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.BillingaccountOperation;

/**
 * @author adrian
 *
 */
public class BillingaccountPresenter implements TakesValue<Billingaccount> {

	@Inject
	@AutoBound
	protected DataBinder<Billingaccount> binder;

	private BillingaccountOperation billingaccountOps;

	@Override
	public Billingaccount getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Billingaccount model) {
		binder.setModel(model);
	}

	/**
	 * @return the billingaccountOps
	 */
	public BillingaccountOperation getBillingaccountOps() {
		return billingaccountOps;
	}

	/**
	 * @param billingaccountOps
	 *            the billingaccountOps to set
	 */
	public void setBillingaccountOps(BillingaccountOperation billingaccountOps) {
		this.billingaccountOps = billingaccountOps;
	}
	
	/**
	 * 
	 */
	protected BillingaccountOperation initOps() {
		BillingaccountOperation billingaccountOperation = new BillingaccountOperation(this.getValue());
		this.setBillingaccountOps(billingaccountOperation);
		return billingaccountOperation;
	}

}

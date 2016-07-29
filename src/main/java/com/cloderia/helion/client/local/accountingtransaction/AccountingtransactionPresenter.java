/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;

/**
 * @author adrian
 *
 */
public class AccountingtransactionPresenter implements TakesValue<Accountingtransaction> {

	@Inject
	@AutoBound
	protected DataBinder<Accountingtransaction> binder;

	private AccountingtransactionOperation accountingtransactionOps;

	@Override
	public Accountingtransaction getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Accountingtransaction model) {
		binder.setModel(model);
	}

	/**
	 * @return the accountingtransactionOps
	 */
	public AccountingtransactionOperation getAccountingtransactionOps() {
		return accountingtransactionOps;
	}

	/**
	 * @param accountingtransactionOps
	 *            the accountingtransactionOps to set
	 */
	public void setAccountingtransactionOps(AccountingtransactionOperation accountingtransactionOps) {
		this.accountingtransactionOps = accountingtransactionOps;
	}
	
	/**
	 * 
	 */
	protected AccountingtransactionOperation initOps() {
		AccountingtransactionOperation accountingtransactionOperation = new AccountingtransactionOperation(this.getValue());
		this.setAccountingtransactionOps(accountingtransactionOperation);
		return accountingtransactionOperation;
	}

}

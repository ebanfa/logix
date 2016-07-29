/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;

/**
 * @author adrian
 *
 */
public class OrganizationglaccountbalancePresenter implements TakesValue<Organizationglaccountbalance> {

	@Inject
	@AutoBound
	protected DataBinder<Organizationglaccountbalance> binder;

	private OrganizationglaccountbalanceOperation organizationglaccountbalanceOps;

	@Override
	public Organizationglaccountbalance getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Organizationglaccountbalance model) {
		binder.setModel(model);
	}

	/**
	 * @return the organizationglaccountbalanceOps
	 */
	public OrganizationglaccountbalanceOperation getOrganizationglaccountbalanceOps() {
		return organizationglaccountbalanceOps;
	}

	/**
	 * @param organizationglaccountbalanceOps
	 *            the organizationglaccountbalanceOps to set
	 */
	public void setOrganizationglaccountbalanceOps(OrganizationglaccountbalanceOperation organizationglaccountbalanceOps) {
		this.organizationglaccountbalanceOps = organizationglaccountbalanceOps;
	}
	
	/**
	 * 
	 */
	protected OrganizationglaccountbalanceOperation initOps() {
		OrganizationglaccountbalanceOperation organizationglaccountbalanceOperation = new OrganizationglaccountbalanceOperation(this.getValue());
		this.setOrganizationglaccountbalanceOps(organizationglaccountbalanceOperation);
		return organizationglaccountbalanceOperation;
	}

}

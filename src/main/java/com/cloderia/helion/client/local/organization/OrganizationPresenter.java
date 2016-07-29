/**
 * 
 */
package com.cloderia.helion.client.local.organization;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Organization;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.OrganizationOperation;

/**
 * @author adrian
 *
 */
public class OrganizationPresenter implements TakesValue<Organization> {

	@Inject
	@AutoBound
	protected DataBinder<Organization> binder;

	private OrganizationOperation organizationOps;

	@Override
	public Organization getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Organization model) {
		binder.setModel(model);
	}

	/**
	 * @return the organizationOps
	 */
	public OrganizationOperation getOrganizationOps() {
		return organizationOps;
	}

	/**
	 * @param organizationOps
	 *            the organizationOps to set
	 */
	public void setOrganizationOps(OrganizationOperation organizationOps) {
		this.organizationOps = organizationOps;
	}
	
	/**
	 * 
	 */
	protected OrganizationOperation initOps() {
		OrganizationOperation organizationOperation = new OrganizationOperation(this.getValue());
		this.setOrganizationOps(organizationOperation);
		return organizationOperation;
	}

}

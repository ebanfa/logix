/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;

/**
 * @author adrian
 *
 */
public class OrganizationgeneralledgeraccountPresenter implements TakesValue<Organizationgeneralledgeraccount> {

	@Inject
	@AutoBound
	protected DataBinder<Organizationgeneralledgeraccount> binder;

	private OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOps;

	@Override
	public Organizationgeneralledgeraccount getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Organizationgeneralledgeraccount model) {
		binder.setModel(model);
	}

	/**
	 * @return the organizationgeneralledgeraccountOps
	 */
	public OrganizationgeneralledgeraccountOperation getOrganizationgeneralledgeraccountOps() {
		return organizationgeneralledgeraccountOps;
	}

	/**
	 * @param organizationgeneralledgeraccountOps
	 *            the organizationgeneralledgeraccountOps to set
	 */
	public void setOrganizationgeneralledgeraccountOps(OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOps) {
		this.organizationgeneralledgeraccountOps = organizationgeneralledgeraccountOps;
	}
	
	/**
	 * 
	 */
	protected OrganizationgeneralledgeraccountOperation initOps() {
		OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOperation = new OrganizationgeneralledgeraccountOperation(this.getValue());
		this.setOrganizationgeneralledgeraccountOps(organizationgeneralledgeraccountOperation);
		return organizationgeneralledgeraccountOperation;
	}

}

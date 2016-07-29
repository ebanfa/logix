/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccount;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;

/**
 * @author adrian
 *
 */
public class GeneralledgeraccountPresenter implements TakesValue<Generalledgeraccount> {

	@Inject
	@AutoBound
	protected DataBinder<Generalledgeraccount> binder;

	private GeneralledgeraccountOperation generalledgeraccountOps;

	@Override
	public Generalledgeraccount getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Generalledgeraccount model) {
		binder.setModel(model);
	}

	/**
	 * @return the generalledgeraccountOps
	 */
	public GeneralledgeraccountOperation getGeneralledgeraccountOps() {
		return generalledgeraccountOps;
	}

	/**
	 * @param generalledgeraccountOps
	 *            the generalledgeraccountOps to set
	 */
	public void setGeneralledgeraccountOps(GeneralledgeraccountOperation generalledgeraccountOps) {
		this.generalledgeraccountOps = generalledgeraccountOps;
	}
	
	/**
	 * 
	 */
	protected GeneralledgeraccountOperation initOps() {
		GeneralledgeraccountOperation generalledgeraccountOperation = new GeneralledgeraccountOperation(this.getValue());
		this.setGeneralledgeraccountOps(generalledgeraccountOperation);
		return generalledgeraccountOperation;
	}

}

/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;

/**
 * @author adrian
 *
 */
public class GeneralledgeraccounttypePresenter implements TakesValue<Generalledgeraccounttype> {

	@Inject
	@AutoBound
	protected DataBinder<Generalledgeraccounttype> binder;

	private GeneralledgeraccounttypeOperation generalledgeraccounttypeOps;

	@Override
	public Generalledgeraccounttype getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Generalledgeraccounttype model) {
		binder.setModel(model);
	}

	/**
	 * @return the generalledgeraccounttypeOps
	 */
	public GeneralledgeraccounttypeOperation getGeneralledgeraccounttypeOps() {
		return generalledgeraccounttypeOps;
	}

	/**
	 * @param generalledgeraccounttypeOps
	 *            the generalledgeraccounttypeOps to set
	 */
	public void setGeneralledgeraccounttypeOps(GeneralledgeraccounttypeOperation generalledgeraccounttypeOps) {
		this.generalledgeraccounttypeOps = generalledgeraccounttypeOps;
	}
	
	/**
	 * 
	 */
	protected GeneralledgeraccounttypeOperation initOps() {
		GeneralledgeraccounttypeOperation generalledgeraccounttypeOperation = new GeneralledgeraccounttypeOperation(this.getValue());
		this.setGeneralledgeraccounttypeOps(generalledgeraccounttypeOperation);
		return generalledgeraccounttypeOperation;
	}

}

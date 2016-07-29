/**
 * 
 */
package com.cloderia.helion.client.local.agreement;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Agreement;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.AgreementOperation;

/**
 * @author adrian
 *
 */
public class AgreementPresenter implements TakesValue<Agreement> {

	@Inject
	@AutoBound
	protected DataBinder<Agreement> binder;

	private AgreementOperation agreementOps;

	@Override
	public Agreement getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Agreement model) {
		binder.setModel(model);
	}

	/**
	 * @return the agreementOps
	 */
	public AgreementOperation getAgreementOps() {
		return agreementOps;
	}

	/**
	 * @param agreementOps
	 *            the agreementOps to set
	 */
	public void setAgreementOps(AgreementOperation agreementOps) {
		this.agreementOps = agreementOps;
	}
	
	/**
	 * 
	 */
	protected AgreementOperation initOps() {
		AgreementOperation agreementOperation = new AgreementOperation(this.getValue());
		this.setAgreementOps(agreementOperation);
		return agreementOperation;
	}

}

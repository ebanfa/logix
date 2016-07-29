/**
 * 
 */
package com.cloderia.helion.client.local.systemuser;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Systemuser;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.SystemuserOperation;

/**
 * @author adrian
 *
 */
public class SystemuserPresenter implements TakesValue<Systemuser> {

	@Inject
	@AutoBound
	protected DataBinder<Systemuser> binder;

	private SystemuserOperation systemuserOps;

	@Override
	public Systemuser getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Systemuser model) {
		binder.setModel(model);
	}

	/**
	 * @return the systemuserOps
	 */
	public SystemuserOperation getSystemuserOps() {
		return systemuserOps;
	}

	/**
	 * @param systemuserOps
	 *            the systemuserOps to set
	 */
	public void setSystemuserOps(SystemuserOperation systemuserOps) {
		this.systemuserOps = systemuserOps;
	}
	
	/**
	 * 
	 */
	protected SystemuserOperation initOps() {
		SystemuserOperation systemuserOperation = new SystemuserOperation(this.getValue());
		this.setSystemuserOps(systemuserOperation);
		return systemuserOperation;
	}

}

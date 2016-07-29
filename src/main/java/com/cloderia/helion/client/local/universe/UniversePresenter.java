/**
 * 
 */
package com.cloderia.helion.client.local.universe;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Universe;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.UniverseOperation;

/**
 * @author adrian
 *
 */
public class UniversePresenter implements TakesValue<Universe> {

	@Inject
	@AutoBound
	protected DataBinder<Universe> binder;

	private UniverseOperation universeOps;

	@Override
	public Universe getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Universe model) {
		binder.setModel(model);
	}

	/**
	 * @return the universeOps
	 */
	public UniverseOperation getUniverseOps() {
		return universeOps;
	}

	/**
	 * @param universeOps
	 *            the universeOps to set
	 */
	public void setUniverseOps(UniverseOperation universeOps) {
		this.universeOps = universeOps;
	}
	
	/**
	 * 
	 */
	protected UniverseOperation initOps() {
		UniverseOperation universeOperation = new UniverseOperation(this.getValue());
		this.setUniverseOps(universeOperation);
		return universeOperation;
	}

}

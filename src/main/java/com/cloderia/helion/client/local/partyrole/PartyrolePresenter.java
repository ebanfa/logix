/**
 * 
 */
package com.cloderia.helion.client.local.partyrole;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Partyrole;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.PartyroleOperation;

/**
 * @author adrian
 *
 */
public class PartyrolePresenter implements TakesValue<Partyrole> {

	@Inject
	@AutoBound
	protected DataBinder<Partyrole> binder;

	private PartyroleOperation partyroleOps;

	@Override
	public Partyrole getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Partyrole model) {
		binder.setModel(model);
	}

	/**
	 * @return the partyroleOps
	 */
	public PartyroleOperation getPartyroleOps() {
		return partyroleOps;
	}

	/**
	 * @param partyroleOps
	 *            the partyroleOps to set
	 */
	public void setPartyroleOps(PartyroleOperation partyroleOps) {
		this.partyroleOps = partyroleOps;
	}
	
	/**
	 * 
	 */
	protected PartyroleOperation initOps() {
		PartyroleOperation partyroleOperation = new PartyroleOperation(this.getValue());
		this.setPartyroleOps(partyroleOperation);
		return partyroleOperation;
	}

}

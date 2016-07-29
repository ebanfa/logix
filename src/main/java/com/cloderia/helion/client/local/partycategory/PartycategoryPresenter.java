/**
 * 
 */
package com.cloderia.helion.client.local.partycategory;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Partycategory;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.PartycategoryOperation;

/**
 * @author adrian
 *
 */
public class PartycategoryPresenter implements TakesValue<Partycategory> {

	@Inject
	@AutoBound
	protected DataBinder<Partycategory> binder;

	private PartycategoryOperation partycategoryOps;

	@Override
	public Partycategory getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Partycategory model) {
		binder.setModel(model);
	}

	/**
	 * @return the partycategoryOps
	 */
	public PartycategoryOperation getPartycategoryOps() {
		return partycategoryOps;
	}

	/**
	 * @param partycategoryOps
	 *            the partycategoryOps to set
	 */
	public void setPartycategoryOps(PartycategoryOperation partycategoryOps) {
		this.partycategoryOps = partycategoryOps;
	}
	
	/**
	 * 
	 */
	protected PartycategoryOperation initOps() {
		PartycategoryOperation partycategoryOperation = new PartycategoryOperation(this.getValue());
		this.setPartycategoryOps(partycategoryOperation);
		return partycategoryOperation;
	}

}

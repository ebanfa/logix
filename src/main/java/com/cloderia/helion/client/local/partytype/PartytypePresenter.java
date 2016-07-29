/**
 * 
 */
package com.cloderia.helion.client.local.partytype;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Partytype;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.PartytypeOperation;

/**
 * @author adrian
 *
 */
public class PartytypePresenter implements TakesValue<Partytype> {

	@Inject
	@AutoBound
	protected DataBinder<Partytype> binder;

	private PartytypeOperation partytypeOps;

	@Override
	public Partytype getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Partytype model) {
		binder.setModel(model);
	}

	/**
	 * @return the partytypeOps
	 */
	public PartytypeOperation getPartytypeOps() {
		return partytypeOps;
	}

	/**
	 * @param partytypeOps
	 *            the partytypeOps to set
	 */
	public void setPartytypeOps(PartytypeOperation partytypeOps) {
		this.partytypeOps = partytypeOps;
	}
	
	/**
	 * 
	 */
	protected PartytypeOperation initOps() {
		PartytypeOperation partytypeOperation = new PartytypeOperation(this.getValue());
		this.setPartytypeOps(partytypeOperation);
		return partytypeOperation;
	}

}

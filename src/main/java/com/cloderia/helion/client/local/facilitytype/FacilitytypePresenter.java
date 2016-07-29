/**
 * 
 */
package com.cloderia.helion.client.local.facilitytype;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Facilitytype;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.FacilitytypeOperation;

/**
 * @author adrian
 *
 */
public class FacilitytypePresenter implements TakesValue<Facilitytype> {

	@Inject
	@AutoBound
	protected DataBinder<Facilitytype> binder;

	private FacilitytypeOperation facilitytypeOps;

	@Override
	public Facilitytype getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Facilitytype model) {
		binder.setModel(model);
	}

	/**
	 * @return the facilitytypeOps
	 */
	public FacilitytypeOperation getFacilitytypeOps() {
		return facilitytypeOps;
	}

	/**
	 * @param facilitytypeOps
	 *            the facilitytypeOps to set
	 */
	public void setFacilitytypeOps(FacilitytypeOperation facilitytypeOps) {
		this.facilitytypeOps = facilitytypeOps;
	}
	
	/**
	 * 
	 */
	protected FacilitytypeOperation initOps() {
		FacilitytypeOperation facilitytypeOperation = new FacilitytypeOperation(this.getValue());
		this.setFacilitytypeOps(facilitytypeOperation);
		return facilitytypeOperation;
	}

}

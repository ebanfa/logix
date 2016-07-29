/**
 * 
 */
package com.cloderia.helion.client.local.facility;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Facility;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.FacilityOperation;

/**
 * @author adrian
 *
 */
public class FacilityPresenter implements TakesValue<Facility> {

	@Inject
	@AutoBound
	protected DataBinder<Facility> binder;

	private FacilityOperation facilityOps;

	@Override
	public Facility getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Facility model) {
		binder.setModel(model);
	}

	/**
	 * @return the facilityOps
	 */
	public FacilityOperation getFacilityOps() {
		return facilityOps;
	}

	/**
	 * @param facilityOps
	 *            the facilityOps to set
	 */
	public void setFacilityOps(FacilityOperation facilityOps) {
		this.facilityOps = facilityOps;
	}
	
	/**
	 * 
	 */
	protected FacilityOperation initOps() {
		FacilityOperation facilityOperation = new FacilityOperation(this.getValue());
		this.setFacilityOps(facilityOperation);
		return facilityOperation;
	}

}

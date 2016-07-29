/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Standardtimeperiod;

/**
 * @author adrian
 *
 */
@Portable
public class StandardtimeperiodOperation  extends BaseOperation<Standardtimeperiod> {

	private Standardtimeperiod standardtimeperiod;
	private Long universeId;
	private Long periodTyId;

	/**
	 * 
	 */
	public StandardtimeperiodOperation() {
	}
	
	/**
	 * @param standardtimeperiod
	 */
	public StandardtimeperiodOperation(Standardtimeperiod standardtimeperiod) {
		super();
		this.standardtimeperiod = standardtimeperiod;
		this.setEntity(standardtimeperiod);
		if(standardtimeperiod.getUniverse() != null)this.setUniverseId(standardtimeperiod.getUniverse().getId());
		if(standardtimeperiod.getPeriodTy() != null)this.setPeriodTyId(standardtimeperiod.getPeriodTy().getId());
	}
	
	/**
	 * @return the UniverseId
	 */
	public Long getUniverseId() {
		return universeId;
	}

	/**
	 * @param universeId
	 *            the universeId to set
	 */
	public void setUniverseId(Long universeId) {
		this.universeId = universeId;
	}
	            
	/**
	 * @return the PeriodTyId
	 */
	public Long getPeriodTyId() {
		return periodTyId;
	}

	/**
	 * @param periodTyId
	 *            the periodTyId to set
	 */
	public void setPeriodTyId(Long periodTyId) {
		this.periodTyId = periodTyId;
	}
	            

	/**
	 * @return the standardtimeperiod
	 */
	public Standardtimeperiod getStandardtimeperiod() {
		return standardtimeperiod;
	}

	/**
	 * @param standardtimeperiod
	 *            the standardtimeperiod to set
	 */
	public void setStandardtimeperiod(Standardtimeperiod standardtimeperiod) {
		this.standardtimeperiod = standardtimeperiod;
	}

}

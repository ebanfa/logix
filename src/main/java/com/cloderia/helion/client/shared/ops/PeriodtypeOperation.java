/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Periodtype;

/**
 * @author adrian
 *
 */
@Portable
public class PeriodtypeOperation  extends BaseOperation<Periodtype> {

	private Periodtype periodtype;
	private Long universeId;

	/**
	 * 
	 */
	public PeriodtypeOperation() {
	}
	
	/**
	 * @param periodtype
	 */
	public PeriodtypeOperation(Periodtype periodtype) {
		super();
		this.periodtype = periodtype;
		this.setEntity(periodtype);
		if(periodtype.getUniverse() != null)this.setUniverseId(periodtype.getUniverse().getId());
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
	 * @return the periodtype
	 */
	public Periodtype getPeriodtype() {
		return periodtype;
	}

	/**
	 * @param periodtype
	 *            the periodtype to set
	 */
	public void setPeriodtype(Periodtype periodtype) {
		this.periodtype = periodtype;
	}

}

/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;

/**
 * @author adrian
 *
 */
@Portable
public class GeneralledgeraccounttypeOperation  extends BaseOperation<Generalledgeraccounttype> {

	private Generalledgeraccounttype generalledgeraccounttype;
	private Long universeId;

	/**
	 * 
	 */
	public GeneralledgeraccounttypeOperation() {
	}
	
	/**
	 * @param generalledgeraccounttype
	 */
	public GeneralledgeraccounttypeOperation(Generalledgeraccounttype generalledgeraccounttype) {
		super();
		this.generalledgeraccounttype = generalledgeraccounttype;
		this.setEntity(generalledgeraccounttype);
		if(generalledgeraccounttype.getUniverse() != null)this.setUniverseId(generalledgeraccounttype.getUniverse().getId());
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
	 * @return the generalledgeraccounttype
	 */
	public Generalledgeraccounttype getGeneralledgeraccounttype() {
		return generalledgeraccounttype;
	}

	/**
	 * @param generalledgeraccounttype
	 *            the generalledgeraccounttype to set
	 */
	public void setGeneralledgeraccounttype(Generalledgeraccounttype generalledgeraccounttype) {
		this.generalledgeraccounttype = generalledgeraccounttype;
	}

}

/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;

/**
 * @author adrian
 *
 */
@Portable
public class GeneralledgeraccountOperation  extends BaseOperation<Generalledgeraccount> {

	private Generalledgeraccount generalledgeraccount;
	private Long universeId;
	private Long glAcctTyId;

	/**
	 * 
	 */
	public GeneralledgeraccountOperation() {
	}
	
	/**
	 * @param generalledgeraccount
	 */
	public GeneralledgeraccountOperation(Generalledgeraccount generalledgeraccount) {
		super();
		this.generalledgeraccount = generalledgeraccount;
		this.setEntity(generalledgeraccount);
		if(generalledgeraccount.getUniverse() != null)this.setUniverseId(generalledgeraccount.getUniverse().getId());
		if(generalledgeraccount.getGlAcctTy() != null)this.setGlAcctTyId(generalledgeraccount.getGlAcctTy().getId());
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
	 * @return the GlAcctTyId
	 */
	public Long getGlAcctTyId() {
		return glAcctTyId;
	}

	/**
	 * @param glAcctTyId
	 *            the glAcctTyId to set
	 */
	public void setGlAcctTyId(Long glAcctTyId) {
		this.glAcctTyId = glAcctTyId;
	}
	            

	/**
	 * @return the generalledgeraccount
	 */
	public Generalledgeraccount getGeneralledgeraccount() {
		return generalledgeraccount;
	}

	/**
	 * @param generalledgeraccount
	 *            the generalledgeraccount to set
	 */
	public void setGeneralledgeraccount(Generalledgeraccount generalledgeraccount) {
		this.generalledgeraccount = generalledgeraccount;
	}

}

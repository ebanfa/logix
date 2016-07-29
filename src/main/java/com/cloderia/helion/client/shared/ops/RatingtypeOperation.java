/**
 * 
 */
package com.cloderia.helion.client.shared.ops;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

import com.cloderia.helion.client.shared.model.Ratingtype;

/**
 * @author adrian
 *
 */
@Portable
public class RatingtypeOperation  extends BaseOperation<Ratingtype> {

	private Ratingtype ratingtype;
	private Long universeId;

	/**
	 * 
	 */
	public RatingtypeOperation() {
	}
	
	/**
	 * @param ratingtype
	 */
	public RatingtypeOperation(Ratingtype ratingtype) {
		super();
		this.ratingtype = ratingtype;
		this.setEntity(ratingtype);
		if(ratingtype.getUniverse() != null)this.setUniverseId(ratingtype.getUniverse().getId());
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
	 * @return the ratingtype
	 */
	public Ratingtype getRatingtype() {
		return ratingtype;
	}

	/**
	 * @param ratingtype
	 *            the ratingtype to set
	 */
	public void setRatingtype(Ratingtype ratingtype) {
		this.ratingtype = ratingtype;
	}

}

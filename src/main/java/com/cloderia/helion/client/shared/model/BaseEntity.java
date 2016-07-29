/**
 * 
 */
package com.cloderia.helion.client.shared.model;

import java.util.Date;

/**
 * @author adrian
 *
 */
public class BaseEntity {
	public static String ALL_ENTITIES_QUERY = "allContacts";
	
	private Long id;
	private String entityCode;
	private String name;
	private Date effectiveDt;
	private String recSt;
	private Integer versionNo;
	private Date rowTs;
	private Date createdDt;
	private String createdByUsr;
	private Date lastModifiedDt;
	private String lastModifiedUsr;
    private Universe universe;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the entityCode
	 */
	public String getEntityCode() {
		return entityCode;
	}
	/**
	 * @param entityCode the entityCode to set
	 */
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the effectiveDt
	 */
	public Date getEffectiveDt() {
		return effectiveDt;
	}
	/**
	 * @param effectiveDt the effectiveDt to set
	 */
	public void setEffectiveDt(Date effectiveDt) {
		this.effectiveDt = effectiveDt;
	}
	/**
	 * @return the recSt
	 */
	public String getRecSt() {
		return recSt;
	}
	/**
	 * @param recSt the recSt to set
	 */
	public void setRecSt(String recSt) {
		this.recSt = recSt;
	}
	/**
	 * @return the versionNo
	 */
	public Integer getVersionNo() {
		return versionNo;
	}
	/**
	 * @param versionNo the versionNo to set
	 */
	public void setVersionNo(Integer versionNo) {
		this.versionNo = versionNo;
	}
	/**
	 * @return the rowTs
	 */
	public Date getRowTs() {
		return rowTs;
	}
	/**
	 * @param rowTs the rowTs to set
	 */
	public void setRowTs(Date rowTs) {
		this.rowTs = rowTs;
	}
	/**
	 * @return the createdDt
	 */
	public Date getCreatedDt() {
		return createdDt;
	}
	/**
	 * @param createdDt the createdDt to set
	 */
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	/**
	 * @return the createdByUsr
	 */
	public String getCreatedByUsr() {
		return createdByUsr;
	}
	/**
	 * @param createdByUsr the createdByUsr to set
	 */
	public void setCreatedByUsr(String createdByUsr) {
		this.createdByUsr = createdByUsr;
	}
	/**
	 * @return the lastModifiedDt
	 */
	public Date getLastModifiedDt() {
		return lastModifiedDt;
	}
	/**
	 * @param lastModifiedDt the lastModifiedDt to set
	 */
	public void setLastModifiedDt(Date lastModifiedDt) {
		this.lastModifiedDt = lastModifiedDt;
	}
	/**
	 * @return the lastModifiedUsr
	 */
	public String getLastModifiedUsr() {
		return lastModifiedUsr;
	}
	/**
	 * @param lastModifiedUsr the lastModifiedUsr to set
	 */
	public void setLastModifiedUsr(String lastModifiedUsr) {
		this.lastModifiedUsr = lastModifiedUsr;
	}
	/**
	 * @return the universe
	 */
	public Universe getUniverse() {
		return universe;
	}
	/**
	 * @param universe the universe to set
	 */
	public void setUniverse(Universe universe) {
		this.universe = universe;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", entityCode=" + entityCode + ", name=" + name + ", effectiveDt=" + effectiveDt
				+ ", recSt=" + recSt + ", versionNo=" + versionNo + ", rowTs=" + rowTs + ", createdDt=" + createdDt
				+ ", createdByUsr=" + createdByUsr + ", lastModifiedDt=" + lastModifiedDt + ", lastModifiedUsr="
				+ lastModifiedUsr + ", universe=" + universe + "]";
	}

	
}

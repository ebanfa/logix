package com.cloderia.helion.client.shared.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.jboss.errai.databinding.client.api.Bindable;

import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * Fixedasset generated by hbm2java
 */
@Bindable
@Portable
@Entity
@NamedQueries({
  @NamedQuery(name = Fixedasset.ALL_FIXEDASSET_QUERY, query = "SELECT e FROM Fixedasset e ORDER BY e.id"),
  @NamedQuery(name = Fixedasset.FIND_FIXEDASSET_BY_CODE_QUERY, query = "SELECT e FROM Fixedasset e where e.entityCode = :entityCode ORDER  BY e.id")
})
@Table(name="fixed_asset")
public class Fixedasset extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public static final String ALL_FIXEDASSET_QUERY = "allFixedassets";
	public static final String FIND_FIXEDASSET_BY_CODE_QUERY = "findFixedassetsByCode";
	
    private Long id;

    private Universe universe;
    private Uom uom;
    private Fixedassettype fixedAssetTy;
	private String entityCode;
	private String name;
	private String description;
	private Date aquiredDt;
	private Date lastServicedDt;
	private Date nextServicedDt;
	private Integer productionCapacity;
	private Date effectiveDt;
	private String recSt;
	private Integer versionNo;
	private Date rowTs;
	private Date createdDt;
	private String createdByUsr;
	private Date lastModifiedDt;
	private String lastModifiedUsr;

    public Fixedasset() {
    }

    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="universe", nullable=false)
    public Universe getUniverse() {
        return this.universe;
    }
    
    public void setUniverse(Universe universe) {
        this.universe = universe;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="uom", nullable=true)
    public Uom getUom() {
        return this.uom;
    }
    
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fixed_asset_ty", nullable=false)
    public Fixedassettype getFixedAssetTy() {
        return this.fixedAssetTy;
    }
    
    public void setFixedAssetTy(Fixedassettype fixedAssetTy) {
        this.fixedAssetTy = fixedAssetTy;
    }
    @Column(name="entity_code", nullable=false, length=35)
    public String getEntityCode() {
        return this.entityCode;
    }
    
    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }
    @Column(name="name", nullable=false, length=75)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    @Column(name="description", nullable=true, length=150)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name="aquired_dt", nullable=false, length=10)
    public Date getAquiredDt() {
        return this.aquiredDt;
    }
    
    public void setAquiredDt(Date aquiredDt) {
        this.aquiredDt = aquiredDt;
    }
    @Column(name="last_serviced_dt", nullable=true, length=10)
    public Date getLastServicedDt() {
        return this.lastServicedDt;
    }
    
    public void setLastServicedDt(Date lastServicedDt) {
        this.lastServicedDt = lastServicedDt;
    }
    @Column(name="next_serviced_dt", nullable=true, length=10)
    public Date getNextServicedDt() {
        return this.nextServicedDt;
    }
    
    public void setNextServicedDt(Date nextServicedDt) {
        this.nextServicedDt = nextServicedDt;
    }
    @Column(name="production_capacity", nullable=false, length=10)
    public Integer getProductionCapacity() {
        return this.productionCapacity;
    }
    
    public void setProductionCapacity(Integer productionCapacity) {
        this.productionCapacity = productionCapacity;
    }
    @Column(name="effective_dt", nullable=false, length=10)
    public Date getEffectiveDt() {
        return this.effectiveDt;
    }
    
    public void setEffectiveDt(Date effectiveDt) {
        this.effectiveDt = effectiveDt;
    }
    @Column(name="rec_st", nullable=false, length=1)
    public String getRecSt() {
        return this.recSt;
    }
    
    public void setRecSt(String recSt) {
        this.recSt = recSt;
    }
    @Column(name="version_no", nullable=true, length=10)
    public Integer getVersionNo() {
        return this.versionNo;
    }
    
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }
    @Column(name="row_ts", nullable=true, length=19)
    public Date getRowTs() {
        return this.rowTs;
    }
    
    public void setRowTs(Date rowTs) {
        this.rowTs = rowTs;
    }
    @Column(name="created_dt", nullable=false, length=10)
    public Date getCreatedDt() {
        return this.createdDt;
    }
    
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }
    @Column(name="created_by_usr", nullable=false, length=35)
    public String getCreatedByUsr() {
        return this.createdByUsr;
    }
    
    public void setCreatedByUsr(String createdByUsr) {
        this.createdByUsr = createdByUsr;
    }
    @Column(name="last_modified_dt", nullable=true, length=19)
    public Date getLastModifiedDt() {
        return this.lastModifiedDt;
    }
    
    public void setLastModifiedDt(Date lastModifiedDt) {
        this.lastModifiedDt = lastModifiedDt;
    }
    @Column(name="last_modified_usr", nullable=true, length=35)
    public String getLastModifiedUsr() {
        return this.lastModifiedUsr;
    }
    
    public void setLastModifiedUsr(String lastModifiedUsr) {
        this.lastModifiedUsr = lastModifiedUsr;
    }

}



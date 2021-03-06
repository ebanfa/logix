package com.cloderia.helion.client.shared.model;

import java.math.BigDecimal;
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
 * Glbudgetxref generated by hbm2java
 */
@Bindable
@Portable
@Entity
@NamedQueries({
  @NamedQuery(name = Glbudgetxref.ALL_GLBUDGETXREF_QUERY, query = "SELECT e FROM Glbudgetxref e ORDER BY e.id"),
  @NamedQuery(name = Glbudgetxref.FIND_GLBUDGETXREF_BY_CODE_QUERY, query = "SELECT e FROM Glbudgetxref e where e.entityCode = :entityCode ORDER  BY e.id")
})
@Table(name="gl_budget_xref")
public class Glbudgetxref extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public static final String ALL_GLBUDGETXREF_QUERY = "allGlbudgetxrefs";
	public static final String FIND_GLBUDGETXREF_BY_CODE_QUERY = "findGlbudgetxrefsByCode";
	
    private Long id;

    private Universe universe;
    private Budgetitemtype budgetItemTy;
    private Generalledgeraccount glAccount;
	private String entityCode;
	private String name;
	private BigDecimal amount;
	private Date fromDt;
	private Date toDt;
	private Integer allocPercentage;
	private String recSt;
	private Integer versionNo;
	private Date rowTs;
	private Date createdDt;
	private String createdByUsr;
	private Date lastModifiedDt;
	private String lastModifiedUsr;

    public Glbudgetxref() {
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
    @JoinColumn(name="budget_item_ty", nullable=false)
    public Budgetitemtype getBudgetItemTy() {
        return this.budgetItemTy;
    }
    
    public void setBudgetItemTy(Budgetitemtype budgetItemTy) {
        this.budgetItemTy = budgetItemTy;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="gl_account", nullable=false)
    public Generalledgeraccount getGlAccount() {
        return this.glAccount;
    }
    
    public void setGlAccount(Generalledgeraccount glAccount) {
        this.glAccount = glAccount;
    }
    @Column(name="entity_code", nullable=false, length=35)
    public String getEntityCode() {
        return this.entityCode;
    }
    
    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }
    @Column(name="name", nullable=true, length=75)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    @Column(name="amount", nullable=false, length=32)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    @Column(name="from_dt", nullable=false, length=10)
    public Date getFromDt() {
        return this.fromDt;
    }
    
    public void setFromDt(Date fromDt) {
        this.fromDt = fromDt;
    }
    @Column(name="to_dt", nullable=true, length=10)
    public Date getToDt() {
        return this.toDt;
    }
    
    public void setToDt(Date toDt) {
        this.toDt = toDt;
    }
    @Column(name="alloc_percentage", nullable=false, length=10)
    public Integer getAllocPercentage() {
        return this.allocPercentage;
    }
    
    public void setAllocPercentage(Integer allocPercentage) {
        this.allocPercentage = allocPercentage;
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



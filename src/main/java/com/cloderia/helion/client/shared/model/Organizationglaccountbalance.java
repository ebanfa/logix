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
 * Organizationglaccountbalance generated by hbm2java
 */
@Bindable
@Portable
@Entity
@NamedQueries({
  @NamedQuery(name = Organizationglaccountbalance.ALL_ORGANIZATIONGLACCOUNTBALANCE_QUERY, query = "SELECT e FROM Organizationglaccountbalance e ORDER BY e.id"),
  @NamedQuery(name = Organizationglaccountbalance.FIND_ORGANIZATIONGLACCOUNTBALANCE_BY_CODE_QUERY, query = "SELECT e FROM Organizationglaccountbalance e where e.entityCode = :entityCode ORDER  BY e.id")
})
@Table(name="organization_gl_account_balance")
public class Organizationglaccountbalance extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public static final String ALL_ORGANIZATIONGLACCOUNTBALANCE_QUERY = "allOrganizationglaccountbalances";
	public static final String FIND_ORGANIZATIONGLACCOUNTBALANCE_BY_CODE_QUERY = "findOrganizationglaccountbalancesByCode";
	
    private Long id;

    private Universe universe;
    private Organizationgeneralledgeraccount glAccount;
    private Accountingperiod accountingPeriod;
	private String entityCode;
	private BigDecimal amount;
	private Date effectiveDt;
	private String recSt;
	private Integer versionNo;
	private Date rowTs;
	private Date createdDt;
	private String createdByUsr;
	private Date lastModifiedDt;
	private String lastModifiedUsr;

    public Organizationglaccountbalance() {
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
    @JoinColumn(name="gl_account", nullable=false)
    public Organizationgeneralledgeraccount getGlAccount() {
        return this.glAccount;
    }
    
    public void setGlAccount(Organizationgeneralledgeraccount glAccount) {
        this.glAccount = glAccount;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="accounting_period", nullable=false)
    public Accountingperiod getAccountingPeriod() {
        return this.accountingPeriod;
    }
    
    public void setAccountingPeriod(Accountingperiod accountingPeriod) {
        this.accountingPeriod = accountingPeriod;
    }
    @Column(name="entity_code", nullable=false, length=35)
    public String getEntityCode() {
        return this.entityCode;
    }
    
    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }
    @Column(name="amount", nullable=false, length=32)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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



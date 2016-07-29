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
 * Financialaccountrole generated by hbm2java
 */
@Bindable
@Portable
@Entity
@NamedQueries({
  @NamedQuery(name = Financialaccountrole.ALL_FINANCIALACCOUNTROLE_QUERY, query = "SELECT e FROM Financialaccountrole e ORDER BY e.id"),
  @NamedQuery(name = Financialaccountrole.FIND_FINANCIALACCOUNTROLE_BY_CODE_QUERY, query = "SELECT e FROM Financialaccountrole e where e.entityCode = :entityCode ORDER  BY e.id")
})
@Table(name="financial_account_role")
public class Financialaccountrole extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public static final String ALL_FINANCIALACCOUNTROLE_QUERY = "allFinancialaccountroles";
	public static final String FIND_FINANCIALACCOUNTROLE_BY_CODE_QUERY = "findFinancialaccountrolesByCode";
	
    private Long id;

    private Universe universe;
    private Party party;
    private Financialaccount finAcct;
    private Financialaccountroletype roleTy;
	private String entityCode;
	private String name;
	private Date fromDt;
	private Date toDt;
	private String recSt;
	private Integer versionNo;
	private Date rowTs;
	private Date createdDt;
	private String createdByUsr;
	private Date lastModifiedDt;
	private String lastModifiedUsr;

    public Financialaccountrole() {
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
    @JoinColumn(name="party", nullable=false)
    public Party getParty() {
        return this.party;
    }
    
    public void setParty(Party party) {
        this.party = party;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fin_acct", nullable=false)
    public Financialaccount getFinAcct() {
        return this.finAcct;
    }
    
    public void setFinAcct(Financialaccount finAcct) {
        this.finAcct = finAcct;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="role_ty", nullable=false)
    public Financialaccountroletype getRoleTy() {
        return this.roleTy;
    }
    
    public void setRoleTy(Financialaccountroletype roleTy) {
        this.roleTy = roleTy;
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



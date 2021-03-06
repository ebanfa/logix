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
 * Accountingtransaction generated by hbm2java
 */
@Bindable
@Portable
@Entity
@NamedQueries({
  @NamedQuery(name = Accountingtransaction.ALL_ACCOUNTINGTRANSACTION_QUERY, query = "SELECT e FROM Accountingtransaction e ORDER BY e.id"),
  @NamedQuery(name = Accountingtransaction.FIND_ACCOUNTINGTRANSACTION_BY_CODE_QUERY, query = "SELECT e FROM Accountingtransaction e where e.entityCode = :entityCode ORDER  BY e.id")
})
@Table(name="accounting_transaction")
public class Accountingtransaction extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public static final String ALL_ACCOUNTINGTRANSACTION_QUERY = "allAccountingtransactions";
	public static final String FIND_ACCOUNTINGTRANSACTION_BY_CODE_QUERY = "findAccountingtransactionsByCode";
	
    private Long id;

    private Universe universe;
    private Accountingtransactiontype transactionTy;
    private Partyrole partyRole;
    private Party fromParty;
    private Party toParty;
    private Invoice invoice;
    private Payment payment;
    private Fixedasset fixedAsset;
	private String entityCode;
	private String name;
	private String description;
	private Date transactionDt;
	private Date entryDt;
	private String recSt;
	private Integer versionNo;
	private Date rowTs;
	private Date createdDt;
	private String createdByUsr;
	private Date lastModifiedDt;
	private String lastModifiedUsr;

    public Accountingtransaction() {
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
    @JoinColumn(name="transaction_ty", nullable=false)
    public Accountingtransactiontype getTransactionTy() {
        return this.transactionTy;
    }
    
    public void setTransactionTy(Accountingtransactiontype transactionTy) {
        this.transactionTy = transactionTy;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="party_role", nullable=true)
    public Partyrole getPartyRole() {
        return this.partyRole;
    }
    
    public void setPartyRole(Partyrole partyRole) {
        this.partyRole = partyRole;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="from_party", nullable=true)
    public Party getFromParty() {
        return this.fromParty;
    }
    
    public void setFromParty(Party fromParty) {
        this.fromParty = fromParty;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="to_party", nullable=true)
    public Party getToParty() {
        return this.toParty;
    }
    
    public void setToParty(Party toParty) {
        this.toParty = toParty;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="invoice", nullable=true)
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="payment", nullable=true)
    public Payment getPayment() {
        return this.payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fixed_asset", nullable=true)
    public Fixedasset getFixedAsset() {
        return this.fixedAsset;
    }
    
    public void setFixedAsset(Fixedasset fixedAsset) {
        this.fixedAsset = fixedAsset;
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
    @Column(name="description", nullable=false, length=150)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name="transaction_dt", nullable=false, length=10)
    public Date getTransactionDt() {
        return this.transactionDt;
    }
    
    public void setTransactionDt(Date transactionDt) {
        this.transactionDt = transactionDt;
    }
    @Column(name="entry_dt", nullable=false, length=10)
    public Date getEntryDt() {
        return this.entryDt;
    }
    
    public void setEntryDt(Date entryDt) {
        this.entryDt = entryDt;
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



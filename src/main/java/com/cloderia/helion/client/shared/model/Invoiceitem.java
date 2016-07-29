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
 * Invoiceitem generated by hbm2java
 */
@Bindable
@Portable
@Entity
@NamedQueries({
  @NamedQuery(name = Invoiceitem.ALL_INVOICEITEM_QUERY, query = "SELECT e FROM Invoiceitem e ORDER BY e.id"),
  @NamedQuery(name = Invoiceitem.FIND_INVOICEITEM_BY_CODE_QUERY, query = "SELECT e FROM Invoiceitem e where e.entityCode = :entityCode ORDER  BY e.id")
})
@Table(name="invoice_item")
public class Invoiceitem extends BaseEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public static final String ALL_INVOICEITEM_QUERY = "allInvoiceitems";
	public static final String FIND_INVOICEITEM_BY_CODE_QUERY = "findInvoiceitemsByCode";
	
    private Long id;

    private Universe universe;
    private Invoiceitemtype itemTy;
    private Invoice invoice;
    private Inventoryitem inventoryItem;
    private Invoiceitem soldWithItem;
    private Invoiceitem adjByItem;
    private Product prod;
    private Productfeature prodFeat;
	private String entityCode;
	private String name;
	private String itemDescription;
	private Boolean taxableFg;
	private Integer quantity;
	private BigDecimal amount;
	private BigDecimal unitPrice;
	private Date effectiveDt;
	private String recSt;
	private Integer versionNo;
	private Date rowTs;
	private Date createdDt;
	private String createdByUsr;
	private Date lastModifiedDt;
	private String lastModifiedUsr;

    public Invoiceitem() {
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
    @JoinColumn(name="item_ty", nullable=false)
    public Invoiceitemtype getItemTy() {
        return this.itemTy;
    }
    
    public void setItemTy(Invoiceitemtype itemTy) {
        this.itemTy = itemTy;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="invoice", nullable=false)
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="inventory_item", nullable=false)
    public Inventoryitem getInventoryItem() {
        return this.inventoryItem;
    }
    
    public void setInventoryItem(Inventoryitem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="sold_with_item", nullable=true)
    public Invoiceitem getSoldWithItem() {
        return this.soldWithItem;
    }
    
    public void setSoldWithItem(Invoiceitem soldWithItem) {
        this.soldWithItem = soldWithItem;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="adj_by_item", nullable=true)
    public Invoiceitem getAdjByItem() {
        return this.adjByItem;
    }
    
    public void setAdjByItem(Invoiceitem adjByItem) {
        this.adjByItem = adjByItem;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="prod", nullable=true)
    public Product getProd() {
        return this.prod;
    }
    
    public void setProd(Product prod) {
        this.prod = prod;
    }
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="prod_feat", nullable=true)
    public Productfeature getProdFeat() {
        return this.prodFeat;
    }
    
    public void setProdFeat(Productfeature prodFeat) {
        this.prodFeat = prodFeat;
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
    @Column(name="item_description", nullable=true, length=150)
    public String getItemDescription() {
        return this.itemDescription;
    }
    
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    @Column(name="taxable_fg", nullable=false, length=1)
    public Boolean getTaxableFg() {
        return this.taxableFg;
    }
    
    public void setTaxableFg(Boolean taxableFg) {
        this.taxableFg = taxableFg;
    }
    @Column(name="quantity", nullable=false, length=10)
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    @Column(name="amount", nullable=true, length=32)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    @Column(name="unit_price", nullable=false, length=32)
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
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


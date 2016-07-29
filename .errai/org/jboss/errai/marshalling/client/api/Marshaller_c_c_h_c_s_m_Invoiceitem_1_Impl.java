package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.model.Universe;
import java.math.BigDecimal;
import java.util.Date;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_m_Invoiceitem_1_Impl implements GeneratedMarshaller<Invoiceitem> {
  private Invoiceitem[] EMPTY_ARRAY = new Invoiceitem[0];
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  private Marshaller<Universe> com_cloderia_helion_client_shared_model_Universe = null;
  private Marshaller<Invoiceitemtype> com_cloderia_helion_client_shared_model_Invoiceitemtype = null;
  private Marshaller<Invoice> com_cloderia_helion_client_shared_model_Invoice = null;
  private Marshaller<Inventoryitem> com_cloderia_helion_client_shared_model_Inventoryitem = null;
  private Marshaller<Invoiceitem> com_cloderia_helion_client_shared_model_Invoiceitem = null;
  private Marshaller<Product> com_cloderia_helion_client_shared_model_Product = null;
  private Marshaller<Productfeature> com_cloderia_helion_client_shared_model_Productfeature = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<BigDecimal> java_math_BigDecimal = Marshalling.getMarshaller(BigDecimal.class);
  private Marshaller<Date> java_util_Date = Marshalling.getMarshaller(Date.class);
  public Invoiceitem[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Invoiceitem demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(Invoiceitem.class, objId);
    }
    Invoiceitem entity = new Invoiceitem();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("id")) && (!obj.get("id").isNull())) {
      entity.setId(java_lang_Long.demarshall(obj.get("id"), a1));
    }
    if ((obj.containsKey("universe")) && (!obj.get("universe").isNull())) {
      entity.setUniverse(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("universe"), a1));
    }
    if ((obj.containsKey("itemTy")) && (!obj.get("itemTy").isNull())) {
      entity.setItemTy(com_cloderia_helion_client_shared_model_Invoiceitemtype.demarshall(obj.get("itemTy"), a1));
    }
    if ((obj.containsKey("invoice")) && (!obj.get("invoice").isNull())) {
      entity.setInvoice(com_cloderia_helion_client_shared_model_Invoice.demarshall(obj.get("invoice"), a1));
    }
    if ((obj.containsKey("inventoryItem")) && (!obj.get("inventoryItem").isNull())) {
      entity.setInventoryItem(com_cloderia_helion_client_shared_model_Inventoryitem.demarshall(obj.get("inventoryItem"), a1));
    }
    if ((obj.containsKey("soldWithItem")) && (!obj.get("soldWithItem").isNull())) {
      entity.setSoldWithItem(com_cloderia_helion_client_shared_model_Invoiceitem.demarshall(obj.get("soldWithItem"), a1));
    }
    if ((obj.containsKey("adjByItem")) && (!obj.get("adjByItem").isNull())) {
      entity.setAdjByItem(com_cloderia_helion_client_shared_model_Invoiceitem.demarshall(obj.get("adjByItem"), a1));
    }
    if ((obj.containsKey("prod")) && (!obj.get("prod").isNull())) {
      entity.setProd(com_cloderia_helion_client_shared_model_Product.demarshall(obj.get("prod"), a1));
    }
    if ((obj.containsKey("prodFeat")) && (!obj.get("prodFeat").isNull())) {
      entity.setProdFeat(com_cloderia_helion_client_shared_model_Productfeature.demarshall(obj.get("prodFeat"), a1));
    }
    if ((obj.containsKey("entityCode")) && (!obj.get("entityCode").isNull())) {
      entity.setEntityCode(java_lang_String.demarshall(obj.get("entityCode"), a1));
    }
    if ((obj.containsKey("name")) && (!obj.get("name").isNull())) {
      entity.setName(java_lang_String.demarshall(obj.get("name"), a1));
    }
    if ((obj.containsKey("itemDescription")) && (!obj.get("itemDescription").isNull())) {
      entity.setItemDescription(java_lang_String.demarshall(obj.get("itemDescription"), a1));
    }
    if ((obj.containsKey("taxableFg")) && (!obj.get("taxableFg").isNull())) {
      entity.setTaxableFg(java_lang_Boolean.demarshall(obj.get("taxableFg"), a1));
    }
    if ((obj.containsKey("quantity")) && (!obj.get("quantity").isNull())) {
      entity.setQuantity(java_lang_Integer.demarshall(obj.get("quantity"), a1));
    }
    if ((obj.containsKey("amount")) && (!obj.get("amount").isNull())) {
      entity.setAmount(java_math_BigDecimal.demarshall(obj.get("amount"), a1));
    }
    if ((obj.containsKey("unitPrice")) && (!obj.get("unitPrice").isNull())) {
      entity.setUnitPrice(java_math_BigDecimal.demarshall(obj.get("unitPrice"), a1));
    }
    if ((obj.containsKey("effectiveDt")) && (!obj.get("effectiveDt").isNull())) {
      entity.setEffectiveDt(java_util_Date.demarshall(obj.get("effectiveDt"), a1));
    }
    if ((obj.containsKey("recSt")) && (!obj.get("recSt").isNull())) {
      entity.setRecSt(java_lang_String.demarshall(obj.get("recSt"), a1));
    }
    if ((obj.containsKey("versionNo")) && (!obj.get("versionNo").isNull())) {
      entity.setVersionNo(java_lang_Integer.demarshall(obj.get("versionNo"), a1));
    }
    if ((obj.containsKey("rowTs")) && (!obj.get("rowTs").isNull())) {
      entity.setRowTs(java_util_Date.demarshall(obj.get("rowTs"), a1));
    }
    if ((obj.containsKey("createdDt")) && (!obj.get("createdDt").isNull())) {
      entity.setCreatedDt(java_util_Date.demarshall(obj.get("createdDt"), a1));
    }
    if ((obj.containsKey("createdByUsr")) && (!obj.get("createdByUsr").isNull())) {
      entity.setCreatedByUsr(java_lang_String.demarshall(obj.get("createdByUsr"), a1));
    }
    if ((obj.containsKey("lastModifiedDt")) && (!obj.get("lastModifiedDt").isNull())) {
      entity.setLastModifiedDt(java_util_Date.demarshall(obj.get("lastModifiedDt"), a1));
    }
    if ((obj.containsKey("lastModifiedUsr")) && (!obj.get("lastModifiedUsr").isNull())) {
      entity.setLastModifiedUsr(java_lang_String.demarshall(obj.get("lastModifiedUsr"), a1));
    }
    if ((obj.containsKey("id")) && (!obj.get("id").isNull())) {
      entity.setId(java_lang_Long.demarshall(obj.get("id"), a1));
    }
    if ((obj.containsKey("entityCode")) && (!obj.get("entityCode").isNull())) {
      entity.setEntityCode(java_lang_String.demarshall(obj.get("entityCode"), a1));
    }
    if ((obj.containsKey("name")) && (!obj.get("name").isNull())) {
      entity.setName(java_lang_String.demarshall(obj.get("name"), a1));
    }
    if ((obj.containsKey("effectiveDt")) && (!obj.get("effectiveDt").isNull())) {
      entity.setEffectiveDt(java_util_Date.demarshall(obj.get("effectiveDt"), a1));
    }
    if ((obj.containsKey("recSt")) && (!obj.get("recSt").isNull())) {
      entity.setRecSt(java_lang_String.demarshall(obj.get("recSt"), a1));
    }
    if ((obj.containsKey("versionNo")) && (!obj.get("versionNo").isNull())) {
      entity.setVersionNo(java_lang_Integer.demarshall(obj.get("versionNo"), a1));
    }
    if ((obj.containsKey("rowTs")) && (!obj.get("rowTs").isNull())) {
      entity.setRowTs(java_util_Date.demarshall(obj.get("rowTs"), a1));
    }
    if ((obj.containsKey("createdDt")) && (!obj.get("createdDt").isNull())) {
      entity.setCreatedDt(java_util_Date.demarshall(obj.get("createdDt"), a1));
    }
    if ((obj.containsKey("createdByUsr")) && (!obj.get("createdByUsr").isNull())) {
      entity.setCreatedByUsr(java_lang_String.demarshall(obj.get("createdByUsr"), a1));
    }
    if ((obj.containsKey("lastModifiedDt")) && (!obj.get("lastModifiedDt").isNull())) {
      entity.setLastModifiedDt(java_util_Date.demarshall(obj.get("lastModifiedDt"), a1));
    }
    if ((obj.containsKey("lastModifiedUsr")) && (!obj.get("lastModifiedUsr").isNull())) {
      entity.setLastModifiedUsr(java_lang_String.demarshall(obj.get("lastModifiedUsr"), a1));
    }
    if ((obj.containsKey("universe")) && (!obj.get("universe").isNull())) {
      entity.setUniverse(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("universe"), a1));
    }
    return entity;
  }

  public String marshall(Invoiceitem a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.model.Invoiceitem\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append(",").append("\"itemTy\":").append(com_cloderia_helion_client_shared_model_Invoiceitemtype.marshall(a0.getItemTy(), a1)).append(",").append("\"invoice\":").append(com_cloderia_helion_client_shared_model_Invoice.marshall(a0.getInvoice(), a1)).append(",").append("\"inventoryItem\":").append(com_cloderia_helion_client_shared_model_Inventoryitem.marshall(a0.getInventoryItem(), a1)).append(",").append("\"soldWithItem\":").append(com_cloderia_helion_client_shared_model_Invoiceitem.marshall(a0.getSoldWithItem(), a1)).append(",").append("\"adjByItem\":").append(com_cloderia_helion_client_shared_model_Invoiceitem.marshall(a0.getAdjByItem(), a1)).append(",").append("\"prod\":").append(com_cloderia_helion_client_shared_model_Product.marshall(a0.getProd(), a1)).append(",").append("\"prodFeat\":").append(com_cloderia_helion_client_shared_model_Productfeature.marshall(a0.getProdFeat(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"itemDescription\":").append(java_lang_String.marshall(a0.getItemDescription(), a1)).append(",").append("\"taxableFg\":").append(java_lang_Boolean.marshall(a0.getTaxableFg(), a1)).append(",").append("\"quantity\":").append(java_lang_Integer.marshall(a0.getQuantity(), a1)).append(",").append("\"amount\":").append(java_math_BigDecimal.marshall(a0.getAmount(), a1)).append(",").append("\"unitPrice\":").append(java_math_BigDecimal.marshall(a0.getUnitPrice(), a1)).append(",").append("\"effectiveDt\":").append(java_util_Date.marshall(a0.getEffectiveDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"effectiveDt\":").append(java_util_Date.marshall(a0.getEffectiveDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Universe == null) {
      com_cloderia_helion_client_shared_model_Universe = Marshalling.getMarshaller(Universe.class);
    }
    if (com_cloderia_helion_client_shared_model_Invoiceitemtype == null) {
      com_cloderia_helion_client_shared_model_Invoiceitemtype = Marshalling.getMarshaller(Invoiceitemtype.class);
    }
    if (com_cloderia_helion_client_shared_model_Invoice == null) {
      com_cloderia_helion_client_shared_model_Invoice = Marshalling.getMarshaller(Invoice.class);
    }
    if (com_cloderia_helion_client_shared_model_Inventoryitem == null) {
      com_cloderia_helion_client_shared_model_Inventoryitem = Marshalling.getMarshaller(Inventoryitem.class);
    }
    if (com_cloderia_helion_client_shared_model_Invoiceitem == null) {
      com_cloderia_helion_client_shared_model_Invoiceitem = this;
    }
    if (com_cloderia_helion_client_shared_model_Product == null) {
      com_cloderia_helion_client_shared_model_Product = Marshalling.getMarshaller(Product.class);
    }
    if (com_cloderia_helion_client_shared_model_Productfeature == null) {
      com_cloderia_helion_client_shared_model_Productfeature = Marshalling.getMarshaller(Productfeature.class);
    }
  }
}
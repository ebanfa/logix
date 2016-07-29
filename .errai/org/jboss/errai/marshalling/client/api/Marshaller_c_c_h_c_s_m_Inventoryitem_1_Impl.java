package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.model.Universe;
import java.util.Date;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_m_Inventoryitem_1_Impl implements GeneratedMarshaller<Inventoryitem> {
  private Inventoryitem[] EMPTY_ARRAY = new Inventoryitem[0];
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  private Marshaller<Universe> com_cloderia_helion_client_shared_model_Universe = null;
  private Marshaller<Lot> com_cloderia_helion_client_shared_model_Lot = null;
  private Marshaller<Product> com_cloderia_helion_client_shared_model_Product = null;
  private Marshaller<Inventoryitemstatus> com_cloderia_helion_client_shared_model_Inventoryitemstatus = null;
  private Marshaller<Container> com_cloderia_helion_client_shared_model_Container = null;
  private Marshaller<Facility> com_cloderia_helion_client_shared_model_Facility = null;
  private Marshaller<Inventoryitemtype> com_cloderia_helion_client_shared_model_Inventoryitemtype = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<Date> java_util_Date = Marshalling.getMarshaller(Date.class);
  public Inventoryitem[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Inventoryitem demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(Inventoryitem.class, objId);
    }
    Inventoryitem entity = new Inventoryitem();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("id")) && (!obj.get("id").isNull())) {
      entity.setId(java_lang_Long.demarshall(obj.get("id"), a1));
    }
    if ((obj.containsKey("universe")) && (!obj.get("universe").isNull())) {
      entity.setUniverse(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("universe"), a1));
    }
    if ((obj.containsKey("lot")) && (!obj.get("lot").isNull())) {
      entity.setLot(com_cloderia_helion_client_shared_model_Lot.demarshall(obj.get("lot"), a1));
    }
    if ((obj.containsKey("prod")) && (!obj.get("prod").isNull())) {
      entity.setProd(com_cloderia_helion_client_shared_model_Product.demarshall(obj.get("prod"), a1));
    }
    if ((obj.containsKey("status")) && (!obj.get("status").isNull())) {
      entity.setStatus(com_cloderia_helion_client_shared_model_Inventoryitemstatus.demarshall(obj.get("status"), a1));
    }
    if ((obj.containsKey("container")) && (!obj.get("container").isNull())) {
      entity.setContainer(com_cloderia_helion_client_shared_model_Container.demarshall(obj.get("container"), a1));
    }
    if ((obj.containsKey("facility")) && (!obj.get("facility").isNull())) {
      entity.setFacility(com_cloderia_helion_client_shared_model_Facility.demarshall(obj.get("facility"), a1));
    }
    if ((obj.containsKey("itemTy")) && (!obj.get("itemTy").isNull())) {
      entity.setItemTy(com_cloderia_helion_client_shared_model_Inventoryitemtype.demarshall(obj.get("itemTy"), a1));
    }
    if ((obj.containsKey("entityCode")) && (!obj.get("entityCode").isNull())) {
      entity.setEntityCode(java_lang_String.demarshall(obj.get("entityCode"), a1));
    }
    if ((obj.containsKey("name")) && (!obj.get("name").isNull())) {
      entity.setName(java_lang_String.demarshall(obj.get("name"), a1));
    }
    if ((obj.containsKey("description")) && (!obj.get("description").isNull())) {
      entity.setDescription(java_lang_String.demarshall(obj.get("description"), a1));
    }
    if ((obj.containsKey("quantityOnHand")) && (!obj.get("quantityOnHand").isNull())) {
      entity.setQuantityOnHand(java_lang_Integer.demarshall(obj.get("quantityOnHand"), a1));
    }
    if ((obj.containsKey("serialNum")) && (!obj.get("serialNum").isNull())) {
      entity.setSerialNum(java_lang_String.demarshall(obj.get("serialNum"), a1));
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

  public String marshall(Inventoryitem a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.model.Inventoryitem\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append(",").append("\"lot\":").append(com_cloderia_helion_client_shared_model_Lot.marshall(a0.getLot(), a1)).append(",").append("\"prod\":").append(com_cloderia_helion_client_shared_model_Product.marshall(a0.getProd(), a1)).append(",").append("\"status\":").append(com_cloderia_helion_client_shared_model_Inventoryitemstatus.marshall(a0.getStatus(), a1)).append(",").append("\"container\":").append(com_cloderia_helion_client_shared_model_Container.marshall(a0.getContainer(), a1)).append(",").append("\"facility\":").append(com_cloderia_helion_client_shared_model_Facility.marshall(a0.getFacility(), a1)).append(",").append("\"itemTy\":").append(com_cloderia_helion_client_shared_model_Inventoryitemtype.marshall(a0.getItemTy(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"description\":").append(java_lang_String.marshall(a0.getDescription(), a1)).append(",").append("\"quantityOnHand\":").append(java_lang_Integer.marshall(a0.getQuantityOnHand(), a1)).append(",").append("\"serialNum\":").append(java_lang_String.marshall(a0.getSerialNum(), a1)).append(",").append("\"effectiveDt\":").append(java_util_Date.marshall(a0.getEffectiveDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"effectiveDt\":").append(java_util_Date.marshall(a0.getEffectiveDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Universe == null) {
      com_cloderia_helion_client_shared_model_Universe = Marshalling.getMarshaller(Universe.class);
    }
    if (com_cloderia_helion_client_shared_model_Lot == null) {
      com_cloderia_helion_client_shared_model_Lot = Marshalling.getMarshaller(Lot.class);
    }
    if (com_cloderia_helion_client_shared_model_Product == null) {
      com_cloderia_helion_client_shared_model_Product = Marshalling.getMarshaller(Product.class);
    }
    if (com_cloderia_helion_client_shared_model_Inventoryitemstatus == null) {
      com_cloderia_helion_client_shared_model_Inventoryitemstatus = Marshalling.getMarshaller(Inventoryitemstatus.class);
    }
    if (com_cloderia_helion_client_shared_model_Container == null) {
      com_cloderia_helion_client_shared_model_Container = Marshalling.getMarshaller(Container.class);
    }
    if (com_cloderia_helion_client_shared_model_Facility == null) {
      com_cloderia_helion_client_shared_model_Facility = Marshalling.getMarshaller(Facility.class);
    }
    if (com_cloderia_helion_client_shared_model_Inventoryitemtype == null) {
      com_cloderia_helion_client_shared_model_Inventoryitemtype = Marshalling.getMarshaller(Inventoryitemtype.class);
    }
  }
}
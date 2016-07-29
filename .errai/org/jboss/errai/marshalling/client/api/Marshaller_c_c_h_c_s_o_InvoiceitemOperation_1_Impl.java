package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InvoiceitemOperation_1_Impl implements GeneratedMarshaller<InvoiceitemOperation> {
  private InvoiceitemOperation[] EMPTY_ARRAY = new InvoiceitemOperation[0];
  private Marshaller<Invoiceitem> com_cloderia_helion_client_shared_model_Invoiceitem = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InvoiceitemOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InvoiceitemOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InvoiceitemOperation.class, objId);
    }
    InvoiceitemOperation entity = new InvoiceitemOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("invoiceitem")) && (!obj.get("invoiceitem").isNull())) {
      entity.setInvoiceitem(com_cloderia_helion_client_shared_model_Invoiceitem.demarshall(obj.get("invoiceitem"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("itemTyId")) && (!obj.get("itemTyId").isNull())) {
      entity.setItemTyId(java_lang_Long.demarshall(obj.get("itemTyId"), a1));
    }
    if ((obj.containsKey("invoiceId")) && (!obj.get("invoiceId").isNull())) {
      entity.setInvoiceId(java_lang_Long.demarshall(obj.get("invoiceId"), a1));
    }
    if ((obj.containsKey("inventoryItemId")) && (!obj.get("inventoryItemId").isNull())) {
      entity.setInventoryItemId(java_lang_Long.demarshall(obj.get("inventoryItemId"), a1));
    }
    if ((obj.containsKey("soldWithItemId")) && (!obj.get("soldWithItemId").isNull())) {
      entity.setSoldWithItemId(java_lang_Long.demarshall(obj.get("soldWithItemId"), a1));
    }
    if ((obj.containsKey("adjByItemId")) && (!obj.get("adjByItemId").isNull())) {
      entity.setAdjByItemId(java_lang_Long.demarshall(obj.get("adjByItemId"), a1));
    }
    if ((obj.containsKey("prodId")) && (!obj.get("prodId").isNull())) {
      entity.setProdId(java_lang_Long.demarshall(obj.get("prodId"), a1));
    }
    if ((obj.containsKey("prodFeatId")) && (!obj.get("prodFeatId").isNull())) {
      entity.setProdFeatId(java_lang_Long.demarshall(obj.get("prodFeatId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Invoiceitem.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InvoiceitemOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InvoiceitemOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"invoiceitem\":").append(com_cloderia_helion_client_shared_model_Invoiceitem.marshall(a0.getInvoiceitem(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"itemTyId\":").append(java_lang_Long.marshall(a0.getItemTyId(), a1)).append(",").append("\"invoiceId\":").append(java_lang_Long.marshall(a0.getInvoiceId(), a1)).append(",").append("\"inventoryItemId\":").append(java_lang_Long.marshall(a0.getInventoryItemId(), a1)).append(",").append("\"soldWithItemId\":").append(java_lang_Long.marshall(a0.getSoldWithItemId(), a1)).append(",").append("\"adjByItemId\":").append(java_lang_Long.marshall(a0.getAdjByItemId(), a1)).append(",").append("\"prodId\":").append(java_lang_Long.marshall(a0.getProdId(), a1)).append(",").append("\"prodFeatId\":").append(java_lang_Long.marshall(a0.getProdFeatId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Invoiceitem.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Invoiceitem == null) {
      com_cloderia_helion_client_shared_model_Invoiceitem = Marshalling.getMarshaller(Invoiceitem.class);
    }
  }
}
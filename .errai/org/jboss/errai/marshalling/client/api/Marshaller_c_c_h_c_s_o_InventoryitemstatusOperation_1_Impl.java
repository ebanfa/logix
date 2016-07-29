package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.ops.InventoryitemstatusOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InventoryitemstatusOperation_1_Impl implements GeneratedMarshaller<InventoryitemstatusOperation> {
  private InventoryitemstatusOperation[] EMPTY_ARRAY = new InventoryitemstatusOperation[0];
  private Marshaller<Inventoryitemstatus> com_cloderia_helion_client_shared_model_Inventoryitemstatus = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InventoryitemstatusOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InventoryitemstatusOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InventoryitemstatusOperation.class, objId);
    }
    InventoryitemstatusOperation entity = new InventoryitemstatusOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("inventoryitemstatus")) && (!obj.get("inventoryitemstatus").isNull())) {
      entity.setInventoryitemstatus(com_cloderia_helion_client_shared_model_Inventoryitemstatus.demarshall(obj.get("inventoryitemstatus"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Inventoryitemstatus.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InventoryitemstatusOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InventoryitemstatusOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"inventoryitemstatus\":").append(com_cloderia_helion_client_shared_model_Inventoryitemstatus.marshall(a0.getInventoryitemstatus(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Inventoryitemstatus.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Inventoryitemstatus == null) {
      com_cloderia_helion_client_shared_model_Inventoryitemstatus = Marshalling.getMarshaller(Inventoryitemstatus.class);
    }
  }
}
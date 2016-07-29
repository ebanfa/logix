package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.ops.InventoryitemtypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InventoryitemtypeOperation_1_Impl implements GeneratedMarshaller<InventoryitemtypeOperation> {
  private InventoryitemtypeOperation[] EMPTY_ARRAY = new InventoryitemtypeOperation[0];
  private Marshaller<Inventoryitemtype> com_cloderia_helion_client_shared_model_Inventoryitemtype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InventoryitemtypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InventoryitemtypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InventoryitemtypeOperation.class, objId);
    }
    InventoryitemtypeOperation entity = new InventoryitemtypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("inventoryitemtype")) && (!obj.get("inventoryitemtype").isNull())) {
      entity.setInventoryitemtype(com_cloderia_helion_client_shared_model_Inventoryitemtype.demarshall(obj.get("inventoryitemtype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Inventoryitemtype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InventoryitemtypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InventoryitemtypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"inventoryitemtype\":").append(com_cloderia_helion_client_shared_model_Inventoryitemtype.marshall(a0.getInventoryitemtype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Inventoryitemtype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Inventoryitemtype == null) {
      com_cloderia_helion_client_shared_model_Inventoryitemtype = Marshalling.getMarshaller(Inventoryitemtype.class);
    }
  }
}
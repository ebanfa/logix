package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InventoryitemOperation_1_Impl implements GeneratedMarshaller<InventoryitemOperation> {
  private InventoryitemOperation[] EMPTY_ARRAY = new InventoryitemOperation[0];
  private Marshaller<Inventoryitem> com_cloderia_helion_client_shared_model_Inventoryitem = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InventoryitemOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InventoryitemOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InventoryitemOperation.class, objId);
    }
    InventoryitemOperation entity = new InventoryitemOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("inventoryitem")) && (!obj.get("inventoryitem").isNull())) {
      entity.setInventoryitem(com_cloderia_helion_client_shared_model_Inventoryitem.demarshall(obj.get("inventoryitem"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("lotId")) && (!obj.get("lotId").isNull())) {
      entity.setLotId(java_lang_Long.demarshall(obj.get("lotId"), a1));
    }
    if ((obj.containsKey("prodId")) && (!obj.get("prodId").isNull())) {
      entity.setProdId(java_lang_Long.demarshall(obj.get("prodId"), a1));
    }
    if ((obj.containsKey("statusId")) && (!obj.get("statusId").isNull())) {
      entity.setStatusId(java_lang_Long.demarshall(obj.get("statusId"), a1));
    }
    if ((obj.containsKey("containerId")) && (!obj.get("containerId").isNull())) {
      entity.setContainerId(java_lang_Long.demarshall(obj.get("containerId"), a1));
    }
    if ((obj.containsKey("facilityId")) && (!obj.get("facilityId").isNull())) {
      entity.setFacilityId(java_lang_Long.demarshall(obj.get("facilityId"), a1));
    }
    if ((obj.containsKey("itemTyId")) && (!obj.get("itemTyId").isNull())) {
      entity.setItemTyId(java_lang_Long.demarshall(obj.get("itemTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Inventoryitem.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InventoryitemOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InventoryitemOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"inventoryitem\":").append(com_cloderia_helion_client_shared_model_Inventoryitem.marshall(a0.getInventoryitem(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"lotId\":").append(java_lang_Long.marshall(a0.getLotId(), a1)).append(",").append("\"prodId\":").append(java_lang_Long.marshall(a0.getProdId(), a1)).append(",").append("\"statusId\":").append(java_lang_Long.marshall(a0.getStatusId(), a1)).append(",").append("\"containerId\":").append(java_lang_Long.marshall(a0.getContainerId(), a1)).append(",").append("\"facilityId\":").append(java_lang_Long.marshall(a0.getFacilityId(), a1)).append(",").append("\"itemTyId\":").append(java_lang_Long.marshall(a0.getItemTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Inventoryitem.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Inventoryitem == null) {
      com_cloderia_helion_client_shared_model_Inventoryitem = Marshalling.getMarshaller(Inventoryitem.class);
    }
  }
}
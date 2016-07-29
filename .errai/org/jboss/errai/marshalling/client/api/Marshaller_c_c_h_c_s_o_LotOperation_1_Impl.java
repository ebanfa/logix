package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.ops.LotOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_LotOperation_1_Impl implements GeneratedMarshaller<LotOperation> {
  private LotOperation[] EMPTY_ARRAY = new LotOperation[0];
  private Marshaller<Lot> com_cloderia_helion_client_shared_model_Lot = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public LotOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public LotOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LotOperation.class, objId);
    }
    LotOperation entity = new LotOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("lot")) && (!obj.get("lot").isNull())) {
      entity.setLot(com_cloderia_helion_client_shared_model_Lot.demarshall(obj.get("lot"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Lot.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(LotOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.LotOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"lot\":").append(com_cloderia_helion_client_shared_model_Lot.marshall(a0.getLot(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Lot.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Lot == null) {
      com_cloderia_helion_client_shared_model_Lot = Marshalling.getMarshaller(Lot.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PartyroleOperation_1_Impl implements GeneratedMarshaller<PartyroleOperation> {
  private PartyroleOperation[] EMPTY_ARRAY = new PartyroleOperation[0];
  private Marshaller<Partyrole> com_cloderia_helion_client_shared_model_Partyrole = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PartyroleOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PartyroleOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PartyroleOperation.class, objId);
    }
    PartyroleOperation entity = new PartyroleOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("partyrole")) && (!obj.get("partyrole").isNull())) {
      entity.setPartyrole(com_cloderia_helion_client_shared_model_Partyrole.demarshall(obj.get("partyrole"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("partyId")) && (!obj.get("partyId").isNull())) {
      entity.setPartyId(java_lang_Long.demarshall(obj.get("partyId"), a1));
    }
    if ((obj.containsKey("partyRoleTyId")) && (!obj.get("partyRoleTyId").isNull())) {
      entity.setPartyRoleTyId(java_lang_Long.demarshall(obj.get("partyRoleTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Partyrole.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PartyroleOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PartyroleOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"partyrole\":").append(com_cloderia_helion_client_shared_model_Partyrole.marshall(a0.getPartyrole(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"partyId\":").append(java_lang_Long.marshall(a0.getPartyId(), a1)).append(",").append("\"partyRoleTyId\":").append(java_lang_Long.marshall(a0.getPartyRoleTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Partyrole.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Partyrole == null) {
      com_cloderia_helion_client_shared_model_Partyrole = Marshalling.getMarshaller(Partyrole.class);
    }
  }
}
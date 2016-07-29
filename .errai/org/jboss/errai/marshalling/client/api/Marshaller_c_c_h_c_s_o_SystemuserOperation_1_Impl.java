package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Systemuser;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_SystemuserOperation_1_Impl implements GeneratedMarshaller<SystemuserOperation> {
  private SystemuserOperation[] EMPTY_ARRAY = new SystemuserOperation[0];
  private Marshaller<Systemuser> com_cloderia_helion_client_shared_model_Systemuser = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public SystemuserOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public SystemuserOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SystemuserOperation.class, objId);
    }
    SystemuserOperation entity = new SystemuserOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("systemuser")) && (!obj.get("systemuser").isNull())) {
      entity.setSystemuser(com_cloderia_helion_client_shared_model_Systemuser.demarshall(obj.get("systemuser"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("partyId")) && (!obj.get("partyId").isNull())) {
      entity.setPartyId(java_lang_Long.demarshall(obj.get("partyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Systemuser.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(SystemuserOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.SystemuserOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"systemuser\":").append(com_cloderia_helion_client_shared_model_Systemuser.marshall(a0.getSystemuser(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"partyId\":").append(java_lang_Long.marshall(a0.getPartyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Systemuser.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Systemuser == null) {
      com_cloderia_helion_client_shared_model_Systemuser = Marshalling.getMarshaller(Systemuser.class);
    }
  }
}
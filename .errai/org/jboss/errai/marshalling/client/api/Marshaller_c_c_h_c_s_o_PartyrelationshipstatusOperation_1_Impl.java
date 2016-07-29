package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Partyrelationshipstatus;
import com.cloderia.helion.client.shared.ops.PartyrelationshipstatusOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PartyrelationshipstatusOperation_1_Impl implements GeneratedMarshaller<PartyrelationshipstatusOperation> {
  private PartyrelationshipstatusOperation[] EMPTY_ARRAY = new PartyrelationshipstatusOperation[0];
  private Marshaller<Partyrelationshipstatus> com_cloderia_helion_client_shared_model_Partyrelationshipstatus = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PartyrelationshipstatusOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PartyrelationshipstatusOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PartyrelationshipstatusOperation.class, objId);
    }
    PartyrelationshipstatusOperation entity = new PartyrelationshipstatusOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("partyrelationshipstatus")) && (!obj.get("partyrelationshipstatus").isNull())) {
      entity.setPartyrelationshipstatus(com_cloderia_helion_client_shared_model_Partyrelationshipstatus.demarshall(obj.get("partyrelationshipstatus"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Partyrelationshipstatus.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PartyrelationshipstatusOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PartyrelationshipstatusOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"partyrelationshipstatus\":").append(com_cloderia_helion_client_shared_model_Partyrelationshipstatus.marshall(a0.getPartyrelationshipstatus(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Partyrelationshipstatus.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Partyrelationshipstatus == null) {
      com_cloderia_helion_client_shared_model_Partyrelationshipstatus = Marshalling.getMarshaller(Partyrelationshipstatus.class);
    }
  }
}
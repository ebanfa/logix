package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Partyrelationship;
import com.cloderia.helion.client.shared.ops.PartyrelationshipOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PartyrelationshipOperation_1_Impl implements GeneratedMarshaller<PartyrelationshipOperation> {
  private PartyrelationshipOperation[] EMPTY_ARRAY = new PartyrelationshipOperation[0];
  private Marshaller<Partyrelationship> com_cloderia_helion_client_shared_model_Partyrelationship = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PartyrelationshipOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PartyrelationshipOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PartyrelationshipOperation.class, objId);
    }
    PartyrelationshipOperation entity = new PartyrelationshipOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("partyrelationship")) && (!obj.get("partyrelationship").isNull())) {
      entity.setPartyrelationship(com_cloderia_helion_client_shared_model_Partyrelationship.demarshall(obj.get("partyrelationship"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("termTyId")) && (!obj.get("termTyId").isNull())) {
      entity.setTermTyId(java_lang_Long.demarshall(obj.get("termTyId"), a1));
    }
    if ((obj.containsKey("termReasonId")) && (!obj.get("termReasonId").isNull())) {
      entity.setTermReasonId(java_lang_Long.demarshall(obj.get("termReasonId"), a1));
    }
    if ((obj.containsKey("fromPartyRoleId")) && (!obj.get("fromPartyRoleId").isNull())) {
      entity.setFromPartyRoleId(java_lang_Long.demarshall(obj.get("fromPartyRoleId"), a1));
    }
    if ((obj.containsKey("toPartyRoleId")) && (!obj.get("toPartyRoleId").isNull())) {
      entity.setToPartyRoleId(java_lang_Long.demarshall(obj.get("toPartyRoleId"), a1));
    }
    if ((obj.containsKey("partyRelId")) && (!obj.get("partyRelId").isNull())) {
      entity.setPartyRelId(java_lang_Long.demarshall(obj.get("partyRelId"), a1));
    }
    if ((obj.containsKey("partyRelStatId")) && (!obj.get("partyRelStatId").isNull())) {
      entity.setPartyRelStatId(java_lang_Long.demarshall(obj.get("partyRelStatId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Partyrelationship.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PartyrelationshipOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PartyrelationshipOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"partyrelationship\":").append(com_cloderia_helion_client_shared_model_Partyrelationship.marshall(a0.getPartyrelationship(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"termTyId\":").append(java_lang_Long.marshall(a0.getTermTyId(), a1)).append(",").append("\"termReasonId\":").append(java_lang_Long.marshall(a0.getTermReasonId(), a1)).append(",").append("\"fromPartyRoleId\":").append(java_lang_Long.marshall(a0.getFromPartyRoleId(), a1)).append(",").append("\"toPartyRoleId\":").append(java_lang_Long.marshall(a0.getToPartyRoleId(), a1)).append(",").append("\"partyRelId\":").append(java_lang_Long.marshall(a0.getPartyRelId(), a1)).append(",").append("\"partyRelStatId\":").append(java_lang_Long.marshall(a0.getPartyRelStatId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Partyrelationship.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Partyrelationship == null) {
      com_cloderia_helion_client_shared_model_Partyrelationship = Marshalling.getMarshaller(Partyrelationship.class);
    }
  }
}
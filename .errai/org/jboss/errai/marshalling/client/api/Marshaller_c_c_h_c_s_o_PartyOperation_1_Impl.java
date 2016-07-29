package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.ops.PartyOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PartyOperation_1_Impl implements GeneratedMarshaller<PartyOperation> {
  private PartyOperation[] EMPTY_ARRAY = new PartyOperation[0];
  private Marshaller<Party> com_cloderia_helion_client_shared_model_Party = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PartyOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PartyOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PartyOperation.class, objId);
    }
    PartyOperation entity = new PartyOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("party")) && (!obj.get("party").isNull())) {
      entity.setParty(com_cloderia_helion_client_shared_model_Party.demarshall(obj.get("party"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("partyTyId")) && (!obj.get("partyTyId").isNull())) {
      entity.setPartyTyId(java_lang_Long.demarshall(obj.get("partyTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Party.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PartyOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PartyOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"party\":").append(com_cloderia_helion_client_shared_model_Party.marshall(a0.getParty(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"partyTyId\":").append(java_lang_Long.marshall(a0.getPartyTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Party.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Party == null) {
      com_cloderia_helion_client_shared_model_Party = Marshalling.getMarshaller(Party.class);
    }
  }
}
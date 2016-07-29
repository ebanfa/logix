package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PartyroletypeOperation_1_Impl implements GeneratedMarshaller<PartyroletypeOperation> {
  private PartyroletypeOperation[] EMPTY_ARRAY = new PartyroletypeOperation[0];
  private Marshaller<Partyroletype> com_cloderia_helion_client_shared_model_Partyroletype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PartyroletypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PartyroletypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PartyroletypeOperation.class, objId);
    }
    PartyroletypeOperation entity = new PartyroletypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("partyroletype")) && (!obj.get("partyroletype").isNull())) {
      entity.setPartyroletype(com_cloderia_helion_client_shared_model_Partyroletype.demarshall(obj.get("partyroletype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("parentRoleTyId")) && (!obj.get("parentRoleTyId").isNull())) {
      entity.setParentRoleTyId(java_lang_Long.demarshall(obj.get("parentRoleTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Partyroletype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PartyroletypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PartyroletypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"partyroletype\":").append(com_cloderia_helion_client_shared_model_Partyroletype.marshall(a0.getPartyroletype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"parentRoleTyId\":").append(java_lang_Long.marshall(a0.getParentRoleTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Partyroletype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Partyroletype == null) {
      com_cloderia_helion_client_shared_model_Partyroletype = Marshalling.getMarshaller(Partyroletype.class);
    }
  }
}
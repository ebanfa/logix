package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PartytypeOperation_1_Impl implements GeneratedMarshaller<PartytypeOperation> {
  private PartytypeOperation[] EMPTY_ARRAY = new PartytypeOperation[0];
  private Marshaller<Partytype> com_cloderia_helion_client_shared_model_Partytype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PartytypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PartytypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PartytypeOperation.class, objId);
    }
    PartytypeOperation entity = new PartytypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("partytype")) && (!obj.get("partytype").isNull())) {
      entity.setPartytype(com_cloderia_helion_client_shared_model_Partytype.demarshall(obj.get("partytype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("parentCategoryId")) && (!obj.get("parentCategoryId").isNull())) {
      entity.setParentCategoryId(java_lang_Long.demarshall(obj.get("parentCategoryId"), a1));
    }
    if ((obj.containsKey("parentTypeId")) && (!obj.get("parentTypeId").isNull())) {
      entity.setParentTypeId(java_lang_Long.demarshall(obj.get("parentTypeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Partytype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PartytypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PartytypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"partytype\":").append(com_cloderia_helion_client_shared_model_Partytype.marshall(a0.getPartytype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"parentCategoryId\":").append(java_lang_Long.marshall(a0.getParentCategoryId(), a1)).append(",").append("\"parentTypeId\":").append(java_lang_Long.marshall(a0.getParentTypeId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Partytype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Partytype == null) {
      com_cloderia_helion_client_shared_model_Partytype = Marshalling.getMarshaller(Partytype.class);
    }
  }
}
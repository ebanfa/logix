package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Fixedassettype;
import com.cloderia.helion.client.shared.ops.FixedassettypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_FixedassettypeOperation_1_Impl implements GeneratedMarshaller<FixedassettypeOperation> {
  private FixedassettypeOperation[] EMPTY_ARRAY = new FixedassettypeOperation[0];
  private Marshaller<Fixedassettype> com_cloderia_helion_client_shared_model_Fixedassettype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public FixedassettypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public FixedassettypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(FixedassettypeOperation.class, objId);
    }
    FixedassettypeOperation entity = new FixedassettypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("fixedassettype")) && (!obj.get("fixedassettype").isNull())) {
      entity.setFixedassettype(com_cloderia_helion_client_shared_model_Fixedassettype.demarshall(obj.get("fixedassettype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("parentTyId")) && (!obj.get("parentTyId").isNull())) {
      entity.setParentTyId(java_lang_Long.demarshall(obj.get("parentTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Fixedassettype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(FixedassettypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.FixedassettypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"fixedassettype\":").append(com_cloderia_helion_client_shared_model_Fixedassettype.marshall(a0.getFixedassettype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"parentTyId\":").append(java_lang_Long.marshall(a0.getParentTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Fixedassettype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Fixedassettype == null) {
      com_cloderia_helion_client_shared_model_Fixedassettype = Marshalling.getMarshaller(Fixedassettype.class);
    }
  }
}
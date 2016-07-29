package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Fixedassetdepreciationmethod;
import com.cloderia.helion.client.shared.ops.FixedassetdepreciationmethodOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_FixedassetdepreciationmethodOperation_1_Impl implements GeneratedMarshaller<FixedassetdepreciationmethodOperation> {
  private FixedassetdepreciationmethodOperation[] EMPTY_ARRAY = new FixedassetdepreciationmethodOperation[0];
  private Marshaller<Fixedassetdepreciationmethod> com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public FixedassetdepreciationmethodOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public FixedassetdepreciationmethodOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(FixedassetdepreciationmethodOperation.class, objId);
    }
    FixedassetdepreciationmethodOperation entity = new FixedassetdepreciationmethodOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("fixedassetdepreciationmethod")) && (!obj.get("fixedassetdepreciationmethod").isNull())) {
      entity.setFixedassetdepreciationmethod(com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod.demarshall(obj.get("fixedassetdepreciationmethod"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("fixedAssetId")) && (!obj.get("fixedAssetId").isNull())) {
      entity.setFixedAssetId(java_lang_Long.demarshall(obj.get("fixedAssetId"), a1));
    }
    if ((obj.containsKey("depMethodId")) && (!obj.get("depMethodId").isNull())) {
      entity.setDepMethodId(java_lang_Long.demarshall(obj.get("depMethodId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(FixedassetdepreciationmethodOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.FixedassetdepreciationmethodOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"fixedassetdepreciationmethod\":").append(com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod.marshall(a0.getFixedassetdepreciationmethod(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"fixedAssetId\":").append(java_lang_Long.marshall(a0.getFixedAssetId(), a1)).append(",").append("\"depMethodId\":").append(java_lang_Long.marshall(a0.getDepMethodId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod == null) {
      com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod = Marshalling.getMarshaller(Fixedassetdepreciationmethod.class);
    }
  }
}
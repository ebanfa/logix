package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.ops.FixedassetOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_FixedassetOperation_1_Impl implements GeneratedMarshaller<FixedassetOperation> {
  private FixedassetOperation[] EMPTY_ARRAY = new FixedassetOperation[0];
  private Marshaller<Fixedasset> com_cloderia_helion_client_shared_model_Fixedasset = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public FixedassetOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public FixedassetOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(FixedassetOperation.class, objId);
    }
    FixedassetOperation entity = new FixedassetOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("fixedasset")) && (!obj.get("fixedasset").isNull())) {
      entity.setFixedasset(com_cloderia_helion_client_shared_model_Fixedasset.demarshall(obj.get("fixedasset"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("uomId")) && (!obj.get("uomId").isNull())) {
      entity.setUomId(java_lang_Long.demarshall(obj.get("uomId"), a1));
    }
    if ((obj.containsKey("fixedAssetTyId")) && (!obj.get("fixedAssetTyId").isNull())) {
      entity.setFixedAssetTyId(java_lang_Long.demarshall(obj.get("fixedAssetTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Fixedasset.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(FixedassetOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.FixedassetOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"fixedasset\":").append(com_cloderia_helion_client_shared_model_Fixedasset.marshall(a0.getFixedasset(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"uomId\":").append(java_lang_Long.marshall(a0.getUomId(), a1)).append(",").append("\"fixedAssetTyId\":").append(java_lang_Long.marshall(a0.getFixedAssetTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Fixedasset.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Fixedasset == null) {
      com_cloderia_helion_client_shared_model_Fixedasset = Marshalling.getMarshaller(Fixedasset.class);
    }
  }
}
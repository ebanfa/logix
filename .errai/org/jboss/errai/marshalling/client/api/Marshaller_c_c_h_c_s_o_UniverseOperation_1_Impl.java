package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.UniverseOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_UniverseOperation_1_Impl implements GeneratedMarshaller<UniverseOperation> {
  private UniverseOperation[] EMPTY_ARRAY = new UniverseOperation[0];
  private Marshaller<Universe> com_cloderia_helion_client_shared_model_Universe = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public UniverseOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public UniverseOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(UniverseOperation.class, objId);
    }
    UniverseOperation entity = new UniverseOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("universe")) && (!obj.get("universe").isNull())) {
      entity.setUniverse(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("universe"), a1));
    }
    if ((obj.containsKey("parentUniverseId")) && (!obj.get("parentUniverseId").isNull())) {
      entity.setParentUniverseId(java_lang_Long.demarshall(obj.get("parentUniverseId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(UniverseOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.UniverseOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append(",").append("\"parentUniverseId\":").append(java_lang_Long.marshall(a0.getParentUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Universe == null) {
      com_cloderia_helion_client_shared_model_Universe = Marshalling.getMarshaller(Universe.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Geoboundry;
import com.cloderia.helion.client.shared.ops.GeoboundryOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_GeoboundryOperation_1_Impl implements GeneratedMarshaller<GeoboundryOperation> {
  private GeoboundryOperation[] EMPTY_ARRAY = new GeoboundryOperation[0];
  private Marshaller<Geoboundry> com_cloderia_helion_client_shared_model_Geoboundry = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public GeoboundryOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public GeoboundryOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GeoboundryOperation.class, objId);
    }
    GeoboundryOperation entity = new GeoboundryOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("geoboundry")) && (!obj.get("geoboundry").isNull())) {
      entity.setGeoboundry(com_cloderia_helion_client_shared_model_Geoboundry.demarshall(obj.get("geoboundry"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("geoBoundryTyId")) && (!obj.get("geoBoundryTyId").isNull())) {
      entity.setGeoBoundryTyId(java_lang_Long.demarshall(obj.get("geoBoundryTyId"), a1));
    }
    if ((obj.containsKey("parentGeoBoundryId")) && (!obj.get("parentGeoBoundryId").isNull())) {
      entity.setParentGeoBoundryId(java_lang_Long.demarshall(obj.get("parentGeoBoundryId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Geoboundry.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(GeoboundryOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.GeoboundryOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"geoboundry\":").append(com_cloderia_helion_client_shared_model_Geoboundry.marshall(a0.getGeoboundry(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"geoBoundryTyId\":").append(java_lang_Long.marshall(a0.getGeoBoundryTyId(), a1)).append(",").append("\"parentGeoBoundryId\":").append(java_lang_Long.marshall(a0.getParentGeoBoundryId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Geoboundry.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Geoboundry == null) {
      com_cloderia_helion_client_shared_model_Geoboundry = Marshalling.getMarshaller(Geoboundry.class);
    }
  }
}
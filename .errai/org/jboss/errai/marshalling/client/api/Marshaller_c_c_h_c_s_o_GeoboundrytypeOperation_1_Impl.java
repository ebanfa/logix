package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Geoboundrytype;
import com.cloderia.helion.client.shared.ops.GeoboundrytypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_GeoboundrytypeOperation_1_Impl implements GeneratedMarshaller<GeoboundrytypeOperation> {
  private GeoboundrytypeOperation[] EMPTY_ARRAY = new GeoboundrytypeOperation[0];
  private Marshaller<Geoboundrytype> com_cloderia_helion_client_shared_model_Geoboundrytype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public GeoboundrytypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public GeoboundrytypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GeoboundrytypeOperation.class, objId);
    }
    GeoboundrytypeOperation entity = new GeoboundrytypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("geoboundrytype")) && (!obj.get("geoboundrytype").isNull())) {
      entity.setGeoboundrytype(com_cloderia_helion_client_shared_model_Geoboundrytype.demarshall(obj.get("geoboundrytype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Geoboundrytype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(GeoboundrytypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.GeoboundrytypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"geoboundrytype\":").append(com_cloderia_helion_client_shared_model_Geoboundrytype.marshall(a0.getGeoboundrytype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Geoboundrytype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Geoboundrytype == null) {
      com_cloderia_helion_client_shared_model_Geoboundrytype = Marshalling.getMarshaller(Geoboundrytype.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Standardtimeperiod;
import com.cloderia.helion.client.shared.ops.StandardtimeperiodOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_StandardtimeperiodOperation_1_Impl implements GeneratedMarshaller<StandardtimeperiodOperation> {
  private StandardtimeperiodOperation[] EMPTY_ARRAY = new StandardtimeperiodOperation[0];
  private Marshaller<Standardtimeperiod> com_cloderia_helion_client_shared_model_Standardtimeperiod = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public StandardtimeperiodOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public StandardtimeperiodOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(StandardtimeperiodOperation.class, objId);
    }
    StandardtimeperiodOperation entity = new StandardtimeperiodOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("standardtimeperiod")) && (!obj.get("standardtimeperiod").isNull())) {
      entity.setStandardtimeperiod(com_cloderia_helion_client_shared_model_Standardtimeperiod.demarshall(obj.get("standardtimeperiod"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("periodTyId")) && (!obj.get("periodTyId").isNull())) {
      entity.setPeriodTyId(java_lang_Long.demarshall(obj.get("periodTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Standardtimeperiod.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(StandardtimeperiodOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.StandardtimeperiodOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"standardtimeperiod\":").append(com_cloderia_helion_client_shared_model_Standardtimeperiod.marshall(a0.getStandardtimeperiod(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"periodTyId\":").append(java_lang_Long.marshall(a0.getPeriodTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Standardtimeperiod.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Standardtimeperiod == null) {
      com_cloderia_helion_client_shared_model_Standardtimeperiod = Marshalling.getMarshaller(Standardtimeperiod.class);
    }
  }
}
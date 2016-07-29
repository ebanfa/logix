package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Uomconversion;
import com.cloderia.helion.client.shared.ops.UomconversionOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_UomconversionOperation_1_Impl implements GeneratedMarshaller<UomconversionOperation> {
  private UomconversionOperation[] EMPTY_ARRAY = new UomconversionOperation[0];
  private Marshaller<Uomconversion> com_cloderia_helion_client_shared_model_Uomconversion = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public UomconversionOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public UomconversionOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(UomconversionOperation.class, objId);
    }
    UomconversionOperation entity = new UomconversionOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("uomconversion")) && (!obj.get("uomconversion").isNull())) {
      entity.setUomconversion(com_cloderia_helion_client_shared_model_Uomconversion.demarshall(obj.get("uomconversion"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("fromUomId")) && (!obj.get("fromUomId").isNull())) {
      entity.setFromUomId(java_lang_Long.demarshall(obj.get("fromUomId"), a1));
    }
    if ((obj.containsKey("toUomId")) && (!obj.get("toUomId").isNull())) {
      entity.setToUomId(java_lang_Long.demarshall(obj.get("toUomId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Uomconversion.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(UomconversionOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.UomconversionOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"uomconversion\":").append(com_cloderia_helion_client_shared_model_Uomconversion.marshall(a0.getUomconversion(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"fromUomId\":").append(java_lang_Long.marshall(a0.getFromUomId(), a1)).append(",").append("\"toUomId\":").append(java_lang_Long.marshall(a0.getToUomId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Uomconversion.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Uomconversion == null) {
      com_cloderia_helion_client_shared_model_Uomconversion = Marshalling.getMarshaller(Uomconversion.class);
    }
  }
}
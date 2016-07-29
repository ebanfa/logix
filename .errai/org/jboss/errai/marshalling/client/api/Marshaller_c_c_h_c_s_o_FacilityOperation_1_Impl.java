package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.ops.FacilityOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_FacilityOperation_1_Impl implements GeneratedMarshaller<FacilityOperation> {
  private FacilityOperation[] EMPTY_ARRAY = new FacilityOperation[0];
  private Marshaller<Facility> com_cloderia_helion_client_shared_model_Facility = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public FacilityOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public FacilityOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(FacilityOperation.class, objId);
    }
    FacilityOperation entity = new FacilityOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("facility")) && (!obj.get("facility").isNull())) {
      entity.setFacility(com_cloderia_helion_client_shared_model_Facility.demarshall(obj.get("facility"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("facilityTyId")) && (!obj.get("facilityTyId").isNull())) {
      entity.setFacilityTyId(java_lang_Long.demarshall(obj.get("facilityTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Facility.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(FacilityOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.FacilityOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"facility\":").append(com_cloderia_helion_client_shared_model_Facility.marshall(a0.getFacility(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"facilityTyId\":").append(java_lang_Long.marshall(a0.getFacilityTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Facility.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Facility == null) {
      com_cloderia_helion_client_shared_model_Facility = Marshalling.getMarshaller(Facility.class);
    }
  }
}
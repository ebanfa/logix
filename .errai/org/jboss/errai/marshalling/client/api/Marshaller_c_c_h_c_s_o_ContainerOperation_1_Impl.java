package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.ops.ContainerOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_ContainerOperation_1_Impl implements GeneratedMarshaller<ContainerOperation> {
  private ContainerOperation[] EMPTY_ARRAY = new ContainerOperation[0];
  private Marshaller<Container> com_cloderia_helion_client_shared_model_Container = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public ContainerOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ContainerOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ContainerOperation.class, objId);
    }
    ContainerOperation entity = new ContainerOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("container")) && (!obj.get("container").isNull())) {
      entity.setContainer(com_cloderia_helion_client_shared_model_Container.demarshall(obj.get("container"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("facilityId")) && (!obj.get("facilityId").isNull())) {
      entity.setFacilityId(java_lang_Long.demarshall(obj.get("facilityId"), a1));
    }
    if ((obj.containsKey("containerTyId")) && (!obj.get("containerTyId").isNull())) {
      entity.setContainerTyId(java_lang_Long.demarshall(obj.get("containerTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Container.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(ContainerOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.ContainerOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"container\":").append(com_cloderia_helion_client_shared_model_Container.marshall(a0.getContainer(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"facilityId\":").append(java_lang_Long.marshall(a0.getFacilityId(), a1)).append(",").append("\"containerTyId\":").append(java_lang_Long.marshall(a0.getContainerTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Container.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Container == null) {
      com_cloderia_helion_client_shared_model_Container = Marshalling.getMarshaller(Container.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Organization;
import com.cloderia.helion.client.shared.ops.OrganizationOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_OrganizationOperation_1_Impl implements GeneratedMarshaller<OrganizationOperation> {
  private OrganizationOperation[] EMPTY_ARRAY = new OrganizationOperation[0];
  private Marshaller<Organization> com_cloderia_helion_client_shared_model_Organization = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public OrganizationOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public OrganizationOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(OrganizationOperation.class, objId);
    }
    OrganizationOperation entity = new OrganizationOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("organization")) && (!obj.get("organization").isNull())) {
      entity.setOrganization(com_cloderia_helion_client_shared_model_Organization.demarshall(obj.get("organization"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("partyId")) && (!obj.get("partyId").isNull())) {
      entity.setPartyId(java_lang_Long.demarshall(obj.get("partyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Organization.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(OrganizationOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.OrganizationOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"organization\":").append(com_cloderia_helion_client_shared_model_Organization.marshall(a0.getOrganization(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"partyId\":").append(java_lang_Long.marshall(a0.getPartyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Organization.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Organization == null) {
      com_cloderia_helion_client_shared_model_Organization = Marshalling.getMarshaller(Organization.class);
    }
  }
}
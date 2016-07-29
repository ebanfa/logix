package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.ops.ContactmechanismOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_ContactmechanismOperation_1_Impl implements GeneratedMarshaller<ContactmechanismOperation> {
  private ContactmechanismOperation[] EMPTY_ARRAY = new ContactmechanismOperation[0];
  private Marshaller<Contactmechanism> com_cloderia_helion_client_shared_model_Contactmechanism = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public ContactmechanismOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ContactmechanismOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ContactmechanismOperation.class, objId);
    }
    ContactmechanismOperation entity = new ContactmechanismOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("contactmechanism")) && (!obj.get("contactmechanism").isNull())) {
      entity.setContactmechanism(com_cloderia_helion_client_shared_model_Contactmechanism.demarshall(obj.get("contactmechanism"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("contMechTyId")) && (!obj.get("contMechTyId").isNull())) {
      entity.setContMechTyId(java_lang_Long.demarshall(obj.get("contMechTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Contactmechanism.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(ContactmechanismOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.ContactmechanismOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"contactmechanism\":").append(com_cloderia_helion_client_shared_model_Contactmechanism.marshall(a0.getContactmechanism(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"contMechTyId\":").append(java_lang_Long.marshall(a0.getContMechTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Contactmechanism.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Contactmechanism == null) {
      com_cloderia_helion_client_shared_model_Contactmechanism = Marshalling.getMarshaller(Contactmechanism.class);
    }
  }
}
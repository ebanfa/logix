package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Person;
import com.cloderia.helion.client.shared.ops.PersonOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PersonOperation_1_Impl implements GeneratedMarshaller<PersonOperation> {
  private PersonOperation[] EMPTY_ARRAY = new PersonOperation[0];
  private Marshaller<Person> com_cloderia_helion_client_shared_model_Person = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PersonOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PersonOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PersonOperation.class, objId);
    }
    PersonOperation entity = new PersonOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("person")) && (!obj.get("person").isNull())) {
      entity.setPerson(com_cloderia_helion_client_shared_model_Person.demarshall(obj.get("person"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("partyId")) && (!obj.get("partyId").isNull())) {
      entity.setPartyId(java_lang_Long.demarshall(obj.get("partyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Person.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PersonOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PersonOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"person\":").append(com_cloderia_helion_client_shared_model_Person.marshall(a0.getPerson(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"partyId\":").append(java_lang_Long.marshall(a0.getPartyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Person.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Person == null) {
      com_cloderia_helion_client_shared_model_Person = Marshalling.getMarshaller(Person.class);
    }
  }
}
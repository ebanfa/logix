package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.jpa.sync.client.shared.IdChangeResponse;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_j_e_j_s_c_s_IdChangeResponse_1_Impl implements GeneratedMarshaller<IdChangeResponse> {
  private IdChangeResponse[] EMPTY_ARRAY = new IdChangeResponse[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public IdChangeResponse[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public IdChangeResponse demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(IdChangeResponse.class, objId);
    }
    final Object c1 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("entity"), a1);
    final Object c0 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("oldId"), a1);
    IdChangeResponse entity = new IdChangeResponse(c0, c1);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(IdChangeResponse a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"org.jboss.errai.jpa.sync.client.shared.IdChangeResponse\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"entity\":").append(java_lang_Object.marshall(a0.getEntity(), a1)).append(",").append("\"oldId\":").append(java_lang_Object.marshall(a0.getOldId(), a1)).append("}").toString();
  }

  private void lazyInit() {

  }
}
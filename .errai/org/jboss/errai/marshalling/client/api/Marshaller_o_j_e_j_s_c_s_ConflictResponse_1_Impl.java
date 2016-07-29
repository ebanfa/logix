package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.jpa.sync.client.shared.ConflictResponse;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_j_e_j_s_c_s_ConflictResponse_1_Impl implements GeneratedMarshaller<ConflictResponse> {
  private ConflictResponse[] EMPTY_ARRAY = new ConflictResponse[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public ConflictResponse[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ConflictResponse demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ConflictResponse.class, objId);
    }
    final Object c0 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("expected"), a1);
    final Object c1 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("actualNew"), a1);
    final Object c2 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("requestedNew"), a1);
    ConflictResponse entity = new ConflictResponse(c0, c1, c2);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(ConflictResponse a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"org.jboss.errai.jpa.sync.client.shared.ConflictResponse\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"expected\":").append(java_lang_Object.marshall(a0.getExpected(), a1)).append(",").append("\"actualNew\":").append(java_lang_Object.marshall(a0.getActualNew(), a1)).append(",").append("\"requestedNew\":").append(java_lang_Object.marshall(a0.getRequestedNew(), a1)).append("}").toString();
  }

  private void lazyInit() {

  }
}
package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.jpa.sync.client.shared.NewRemoteEntityResponse;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_j_e_j_s_c_s_NewRemoteEntityResponse_1_Impl implements GeneratedMarshaller<NewRemoteEntityResponse> {
  private NewRemoteEntityResponse[] EMPTY_ARRAY = new NewRemoteEntityResponse[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public NewRemoteEntityResponse[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public NewRemoteEntityResponse demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(NewRemoteEntityResponse.class, objId);
    }
    final Object c0 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("entity"), a1);
    NewRemoteEntityResponse entity = new NewRemoteEntityResponse(c0);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(NewRemoteEntityResponse a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"org.jboss.errai.jpa.sync.client.shared.NewRemoteEntityResponse\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"entity\":").append(java_lang_Object.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {

  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.ops.SignUpOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_SignUpOperation_1_Impl implements GeneratedMarshaller<SignUpOperation> {
  private SignUpOperation[] EMPTY_ARRAY = new SignUpOperation[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public SignUpOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public SignUpOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SignUpOperation.class, objId);
    }
    SignUpOperation entity = new SignUpOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("emailAddress")) && (!obj.get("emailAddress").isNull())) {
      entity.setEmailAddress(java_lang_String.demarshall(obj.get("emailAddress"), a1));
    }
    if ((obj.containsKey("password")) && (!obj.get("password").isNull())) {
      entity.setPassword(java_lang_String.demarshall(obj.get("password"), a1));
    }
    if ((obj.containsKey("passwordConfirm")) && (!obj.get("passwordConfirm").isNull())) {
      entity.setPasswordConfirm(java_lang_String.demarshall(obj.get("passwordConfirm"), a1));
    }
    return entity;
  }

  public String marshall(SignUpOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.SignUpOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"emailAddress\":").append(java_lang_String.marshall(a0.getEmailAddress(), a1)).append(",").append("\"password\":").append(java_lang_String.marshall(a0.getPassword(), a1)).append(",").append("\"passwordConfirm\":").append(java_lang_String.marshall(a0.getPasswordConfirm(), a1)).append("}").toString();
  }

  private void lazyInit() {

  }
}
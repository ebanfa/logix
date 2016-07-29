package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.ops.LoginOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_LoginOperation_1_Impl implements GeneratedMarshaller<LoginOperation> {
  private LoginOperation[] EMPTY_ARRAY = new LoginOperation[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public LoginOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public LoginOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LoginOperation.class, objId);
    }
    LoginOperation entity = new LoginOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("userName")) && (!obj.get("userName").isNull())) {
      entity.setUserName(java_lang_String.demarshall(obj.get("userName"), a1));
    }
    if ((obj.containsKey("password")) && (!obj.get("password").isNull())) {
      entity.setPassword(java_lang_String.demarshall(obj.get("password"), a1));
    }
    return entity;
  }

  public String marshall(LoginOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.LoginOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"userName\":").append(java_lang_String.marshall(a0.getUserName(), a1)).append(",").append("\"password\":").append(java_lang_String.marshall(a0.getPassword(), a1)).append("}").toString();
  }

  private void lazyInit() {

  }
}
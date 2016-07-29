package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation.Type;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_j_e_j_s_c_s_SyncRequestOperation_erraiD_Type_Impl implements GeneratedMarshaller<Type> {
  private Type[] EMPTY_ARRAY = new Type[0];
  public Type[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Type demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    Type entity = obj != null ? Enum.valueOf(Type.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(Type.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(Type a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final StringBuilder json = new StringBuilder();
    return json.append(a0 != null ? new StringBuilder(64).append("{\"^EncodedType\":\"org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation$Type\",\"^EnumStringValue\":\"").append(a0.name()).append("\"}") : "null").toString();
  }

  private void lazyInit() {

  }
}
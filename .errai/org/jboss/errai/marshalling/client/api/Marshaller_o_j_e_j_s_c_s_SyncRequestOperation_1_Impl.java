package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation;
import org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation.Type;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_j_e_j_s_c_s_SyncRequestOperation_1_Impl implements GeneratedMarshaller<SyncRequestOperation> {
  private SyncRequestOperation[] EMPTY_ARRAY = new SyncRequestOperation[0];
  private Marshaller<Type> org_jboss_errai_jpa_sync_client_shared_SyncRequestOperation_erraiD_Type = null;
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public SyncRequestOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Object SyncRequestOperation_Object_newState(SyncRequestOperation instance) /*-{
    return instance.@org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation::newState;
  }-*/;

  native static void SyncRequestOperation_Object_newState(SyncRequestOperation instance, Object value) /*-{
    instance.@org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation::newState = value;
  }-*/;

  public SyncRequestOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SyncRequestOperation.class, objId);
    }
    final Type c0 = obj.get("type").isObject() != null ? Enum.valueOf(Type.class, obj.get("type").isObject().get("^EnumStringValue").isString().stringValue()) : obj.get("type").isString() != null ? Enum.valueOf(Type.class, obj.get("type").isString().stringValue()) : null;
    final Object c1 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("newState"), a1);
    final Object c2 = ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("expectedState"), a1);
    SyncRequestOperation entity = new SyncRequestOperation(c0, c1, c2);
    a1.recordObject(objId, entity);
    if ((obj.containsKey("newState")) && (!obj.get("newState").isNull())) {
      SyncRequestOperation_Object_newState(entity, ((ObjectMarshaller) java_lang_Object).demarshall(Object.class, obj.get("newState"), a1));
    }
    return entity;
  }

  public String marshall(SyncRequestOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"type\":").append(a0.getType() != null ? new StringBuilder(64).append("{\"^EncodedType\":\"org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation$Type\",\"^EnumStringValue\":\"").append(a0.getType().name()).append("\"}") : "null").append(",").append("\"newState\":").append(java_lang_Object.marshall(SyncRequestOperation_Object_newState(a0), a1)).append(",").append("\"expectedState\":").append(java_lang_Object.marshall(a0.getExpectedState(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (org_jboss_errai_jpa_sync_client_shared_SyncRequestOperation_erraiD_Type == null) {
      org_jboss_errai_jpa_sync_client_shared_SyncRequestOperation_erraiD_Type = Marshalling.getMarshaller(Type.class);
    }
  }
}
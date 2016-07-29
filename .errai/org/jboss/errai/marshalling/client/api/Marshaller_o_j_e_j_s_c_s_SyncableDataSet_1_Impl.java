package org.jboss.errai.marshalling.client.api;

import java.util.Map;
import org.jboss.errai.jpa.sync.client.shared.SyncableDataSet;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_j_e_j_s_c_s_SyncableDataSet_1_Impl implements GeneratedMarshaller<SyncableDataSet> {
  private SyncableDataSet[] EMPTY_ARRAY = new SyncableDataSet[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  public SyncableDataSet[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public native static SyncableDataSet SyncableDataSet__String_String_Map(String a0, String a1, Map a2) /*-{
    return @org.jboss.errai.jpa.sync.client.shared.SyncableDataSet::new(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)(a0, a1, a2);
  }-*/;

  native static Map SyncableDataSet_Map_params(SyncableDataSet instance) /*-{
    return instance.@org.jboss.errai.jpa.sync.client.shared.SyncableDataSet::params;
  }-*/;

  native static void SyncableDataSet_Map_params(SyncableDataSet instance, Map value) /*-{
    instance.@org.jboss.errai.jpa.sync.client.shared.SyncableDataSet::params = value;
  }-*/;

  native static String SyncableDataSet_String_resultTypeFqcn(SyncableDataSet instance) /*-{
    return instance.@org.jboss.errai.jpa.sync.client.shared.SyncableDataSet::resultTypeFqcn;
  }-*/;

  native static void SyncableDataSet_String_resultTypeFqcn(SyncableDataSet instance, String value) /*-{
    instance.@org.jboss.errai.jpa.sync.client.shared.SyncableDataSet::resultTypeFqcn = value;
  }-*/;

  public SyncableDataSet demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SyncableDataSet.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("queryName"), a1);
    a1.setAssumedMapKeyType("java.lang.String");
    a1.setAssumedMapValueType("java.lang.Object");
    final Map c2 = java_util_Map.demarshall(obj.get("params"), a1);
    a1.resetAssumedTypes();
    final String c1 = java_lang_String.demarshall(obj.get("resultTypeFqcn"), a1);
    SyncableDataSet entity = SyncableDataSet__String_String_Map(c0, c1, c2);
    a1.recordObject(objId, entity);
    if ((obj.containsKey("params")) && (!obj.get("params").isNull())) {
      a1.setAssumedMapKeyType("java.lang.String");
      a1.setAssumedMapValueType("java.lang.Object");
      SyncableDataSet_Map_params(entity, java_util_Map.demarshall(obj.get("params"), a1));
      a1.resetAssumedTypes();
    }
    if ((obj.containsKey("resultTypeFqcn")) && (!obj.get("resultTypeFqcn").isNull())) {
      SyncableDataSet_String_resultTypeFqcn(entity, java_lang_String.demarshall(obj.get("resultTypeFqcn"), a1));
    }
    return entity;
  }

  public String marshall(SyncableDataSet a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"org.jboss.errai.jpa.sync.client.shared.SyncableDataSet\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"queryName\":").append(java_lang_String.marshall(a0.getQueryName(), a1)).append(",").append("\"params\":").append(java_util_Map.marshall(SyncableDataSet_Map_params(a0), a1)).append(",").append("\"resultTypeFqcn\":").append(java_lang_String.marshall(SyncableDataSet_String_resultTypeFqcn(a0), a1)).append("}").toString();
  }

  private void lazyInit() {

  }
}
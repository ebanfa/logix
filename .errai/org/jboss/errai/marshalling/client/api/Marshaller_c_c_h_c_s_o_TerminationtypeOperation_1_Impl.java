package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Terminationtype;
import com.cloderia.helion.client.shared.ops.TerminationtypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_TerminationtypeOperation_1_Impl implements GeneratedMarshaller<TerminationtypeOperation> {
  private TerminationtypeOperation[] EMPTY_ARRAY = new TerminationtypeOperation[0];
  private Marshaller<Terminationtype> com_cloderia_helion_client_shared_model_Terminationtype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public TerminationtypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public TerminationtypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(TerminationtypeOperation.class, objId);
    }
    TerminationtypeOperation entity = new TerminationtypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("terminationtype")) && (!obj.get("terminationtype").isNull())) {
      entity.setTerminationtype(com_cloderia_helion_client_shared_model_Terminationtype.demarshall(obj.get("terminationtype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Terminationtype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(TerminationtypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.TerminationtypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"terminationtype\":").append(com_cloderia_helion_client_shared_model_Terminationtype.marshall(a0.getTerminationtype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Terminationtype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Terminationtype == null) {
      com_cloderia_helion_client_shared_model_Terminationtype = Marshalling.getMarshaller(Terminationtype.class);
    }
  }
}
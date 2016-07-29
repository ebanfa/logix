package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Paymenttype;
import com.cloderia.helion.client.shared.ops.PaymenttypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PaymenttypeOperation_1_Impl implements GeneratedMarshaller<PaymenttypeOperation> {
  private PaymenttypeOperation[] EMPTY_ARRAY = new PaymenttypeOperation[0];
  private Marshaller<Paymenttype> com_cloderia_helion_client_shared_model_Paymenttype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PaymenttypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PaymenttypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PaymenttypeOperation.class, objId);
    }
    PaymenttypeOperation entity = new PaymenttypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("paymenttype")) && (!obj.get("paymenttype").isNull())) {
      entity.setPaymenttype(com_cloderia_helion_client_shared_model_Paymenttype.demarshall(obj.get("paymenttype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Paymenttype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PaymenttypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PaymenttypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"paymenttype\":").append(com_cloderia_helion_client_shared_model_Paymenttype.marshall(a0.getPaymenttype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Paymenttype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Paymenttype == null) {
      com_cloderia_helion_client_shared_model_Paymenttype = Marshalling.getMarshaller(Paymenttype.class);
    }
  }
}
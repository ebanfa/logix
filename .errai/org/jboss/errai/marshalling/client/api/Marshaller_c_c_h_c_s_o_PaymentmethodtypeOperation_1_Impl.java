package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Paymentmethodtype;
import com.cloderia.helion.client.shared.ops.PaymentmethodtypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PaymentmethodtypeOperation_1_Impl implements GeneratedMarshaller<PaymentmethodtypeOperation> {
  private PaymentmethodtypeOperation[] EMPTY_ARRAY = new PaymentmethodtypeOperation[0];
  private Marshaller<Paymentmethodtype> com_cloderia_helion_client_shared_model_Paymentmethodtype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PaymentmethodtypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PaymentmethodtypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PaymentmethodtypeOperation.class, objId);
    }
    PaymentmethodtypeOperation entity = new PaymentmethodtypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("paymentmethodtype")) && (!obj.get("paymentmethodtype").isNull())) {
      entity.setPaymentmethodtype(com_cloderia_helion_client_shared_model_Paymentmethodtype.demarshall(obj.get("paymentmethodtype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Paymentmethodtype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PaymentmethodtypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PaymentmethodtypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"paymentmethodtype\":").append(com_cloderia_helion_client_shared_model_Paymentmethodtype.marshall(a0.getPaymentmethodtype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Paymentmethodtype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Paymentmethodtype == null) {
      com_cloderia_helion_client_shared_model_Paymentmethodtype = Marshalling.getMarshaller(Paymentmethodtype.class);
    }
  }
}
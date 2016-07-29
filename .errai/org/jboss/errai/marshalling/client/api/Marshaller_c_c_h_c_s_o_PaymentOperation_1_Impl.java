package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.ops.PaymentOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PaymentOperation_1_Impl implements GeneratedMarshaller<PaymentOperation> {
  private PaymentOperation[] EMPTY_ARRAY = new PaymentOperation[0];
  private Marshaller<Payment> com_cloderia_helion_client_shared_model_Payment = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PaymentOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PaymentOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PaymentOperation.class, objId);
    }
    PaymentOperation entity = new PaymentOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("payment")) && (!obj.get("payment").isNull())) {
      entity.setPayment(com_cloderia_helion_client_shared_model_Payment.demarshall(obj.get("payment"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("methodTyId")) && (!obj.get("methodTyId").isNull())) {
      entity.setMethodTyId(java_lang_Long.demarshall(obj.get("methodTyId"), a1));
    }
    if ((obj.containsKey("paymentTyId")) && (!obj.get("paymentTyId").isNull())) {
      entity.setPaymentTyId(java_lang_Long.demarshall(obj.get("paymentTyId"), a1));
    }
    if ((obj.containsKey("finAcctId")) && (!obj.get("finAcctId").isNull())) {
      entity.setFinAcctId(java_lang_Long.demarshall(obj.get("finAcctId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Payment.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PaymentOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PaymentOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"payment\":").append(com_cloderia_helion_client_shared_model_Payment.marshall(a0.getPayment(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"methodTyId\":").append(java_lang_Long.marshall(a0.getMethodTyId(), a1)).append(",").append("\"paymentTyId\":").append(java_lang_Long.marshall(a0.getPaymentTyId(), a1)).append(",").append("\"finAcctId\":").append(java_lang_Long.marshall(a0.getFinAcctId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Payment.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Payment == null) {
      com_cloderia_helion_client_shared_model_Payment = Marshalling.getMarshaller(Payment.class);
    }
  }
}
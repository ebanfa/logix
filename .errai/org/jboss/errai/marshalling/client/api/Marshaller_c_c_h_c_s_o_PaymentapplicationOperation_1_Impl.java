package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Paymentapplication;
import com.cloderia.helion.client.shared.ops.PaymentapplicationOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_PaymentapplicationOperation_1_Impl implements GeneratedMarshaller<PaymentapplicationOperation> {
  private PaymentapplicationOperation[] EMPTY_ARRAY = new PaymentapplicationOperation[0];
  private Marshaller<Paymentapplication> com_cloderia_helion_client_shared_model_Paymentapplication = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public PaymentapplicationOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PaymentapplicationOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PaymentapplicationOperation.class, objId);
    }
    PaymentapplicationOperation entity = new PaymentapplicationOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("paymentapplication")) && (!obj.get("paymentapplication").isNull())) {
      entity.setPaymentapplication(com_cloderia_helion_client_shared_model_Paymentapplication.demarshall(obj.get("paymentapplication"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("paymentId")) && (!obj.get("paymentId").isNull())) {
      entity.setPaymentId(java_lang_Long.demarshall(obj.get("paymentId"), a1));
    }
    if ((obj.containsKey("billingAcctId")) && (!obj.get("billingAcctId").isNull())) {
      entity.setBillingAcctId(java_lang_Long.demarshall(obj.get("billingAcctId"), a1));
    }
    if ((obj.containsKey("invoiceId")) && (!obj.get("invoiceId").isNull())) {
      entity.setInvoiceId(java_lang_Long.demarshall(obj.get("invoiceId"), a1));
    }
    if ((obj.containsKey("invoiceItemId")) && (!obj.get("invoiceItemId").isNull())) {
      entity.setInvoiceItemId(java_lang_Long.demarshall(obj.get("invoiceItemId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Paymentapplication.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(PaymentapplicationOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.PaymentapplicationOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"paymentapplication\":").append(com_cloderia_helion_client_shared_model_Paymentapplication.marshall(a0.getPaymentapplication(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"paymentId\":").append(java_lang_Long.marshall(a0.getPaymentId(), a1)).append(",").append("\"billingAcctId\":").append(java_lang_Long.marshall(a0.getBillingAcctId(), a1)).append(",").append("\"invoiceId\":").append(java_lang_Long.marshall(a0.getInvoiceId(), a1)).append(",").append("\"invoiceItemId\":").append(java_lang_Long.marshall(a0.getInvoiceItemId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Paymentapplication.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Paymentapplication == null) {
      com_cloderia_helion_client_shared_model_Paymentapplication = Marshalling.getMarshaller(Paymentapplication.class);
    }
  }
}
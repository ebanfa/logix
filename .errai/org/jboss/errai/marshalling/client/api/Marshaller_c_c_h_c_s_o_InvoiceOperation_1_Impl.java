package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InvoiceOperation_1_Impl implements GeneratedMarshaller<InvoiceOperation> {
  private InvoiceOperation[] EMPTY_ARRAY = new InvoiceOperation[0];
  private Marshaller<Invoice> com_cloderia_helion_client_shared_model_Invoice = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InvoiceOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InvoiceOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InvoiceOperation.class, objId);
    }
    InvoiceOperation entity = new InvoiceOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("invoice")) && (!obj.get("invoice").isNull())) {
      entity.setInvoice(com_cloderia_helion_client_shared_model_Invoice.demarshall(obj.get("invoice"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("billingAcctId")) && (!obj.get("billingAcctId").isNull())) {
      entity.setBillingAcctId(java_lang_Long.demarshall(obj.get("billingAcctId"), a1));
    }
    if ((obj.containsKey("toPartyId")) && (!obj.get("toPartyId").isNull())) {
      entity.setToPartyId(java_lang_Long.demarshall(obj.get("toPartyId"), a1));
    }
    if ((obj.containsKey("fromPartyId")) && (!obj.get("fromPartyId").isNull())) {
      entity.setFromPartyId(java_lang_Long.demarshall(obj.get("fromPartyId"), a1));
    }
    if ((obj.containsKey("fromContMechId")) && (!obj.get("fromContMechId").isNull())) {
      entity.setFromContMechId(java_lang_Long.demarshall(obj.get("fromContMechId"), a1));
    }
    if ((obj.containsKey("toContMechId")) && (!obj.get("toContMechId").isNull())) {
      entity.setToContMechId(java_lang_Long.demarshall(obj.get("toContMechId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Invoice.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InvoiceOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InvoiceOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"invoice\":").append(com_cloderia_helion_client_shared_model_Invoice.marshall(a0.getInvoice(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"billingAcctId\":").append(java_lang_Long.marshall(a0.getBillingAcctId(), a1)).append(",").append("\"toPartyId\":").append(java_lang_Long.marshall(a0.getToPartyId(), a1)).append(",").append("\"fromPartyId\":").append(java_lang_Long.marshall(a0.getFromPartyId(), a1)).append(",").append("\"fromContMechId\":").append(java_lang_Long.marshall(a0.getFromContMechId(), a1)).append(",").append("\"toContMechId\":").append(java_lang_Long.marshall(a0.getToContMechId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Invoice.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Invoice == null) {
      com_cloderia_helion_client_shared_model_Invoice = Marshalling.getMarshaller(Invoice.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Invoicestatus;
import com.cloderia.helion.client.shared.ops.InvoicestatusOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InvoicestatusOperation_1_Impl implements GeneratedMarshaller<InvoicestatusOperation> {
  private InvoicestatusOperation[] EMPTY_ARRAY = new InvoicestatusOperation[0];
  private Marshaller<Invoicestatus> com_cloderia_helion_client_shared_model_Invoicestatus = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InvoicestatusOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InvoicestatusOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InvoicestatusOperation.class, objId);
    }
    InvoicestatusOperation entity = new InvoicestatusOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("invoicestatus")) && (!obj.get("invoicestatus").isNull())) {
      entity.setInvoicestatus(com_cloderia_helion_client_shared_model_Invoicestatus.demarshall(obj.get("invoicestatus"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("invoiceId")) && (!obj.get("invoiceId").isNull())) {
      entity.setInvoiceId(java_lang_Long.demarshall(obj.get("invoiceId"), a1));
    }
    if ((obj.containsKey("invoiceStatTyId")) && (!obj.get("invoiceStatTyId").isNull())) {
      entity.setInvoiceStatTyId(java_lang_Long.demarshall(obj.get("invoiceStatTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Invoicestatus.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InvoicestatusOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InvoicestatusOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"invoicestatus\":").append(com_cloderia_helion_client_shared_model_Invoicestatus.marshall(a0.getInvoicestatus(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"invoiceId\":").append(java_lang_Long.marshall(a0.getInvoiceId(), a1)).append(",").append("\"invoiceStatTyId\":").append(java_lang_Long.marshall(a0.getInvoiceStatTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Invoicestatus.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Invoicestatus == null) {
      com_cloderia_helion_client_shared_model_Invoicestatus = Marshalling.getMarshaller(Invoicestatus.class);
    }
  }
}
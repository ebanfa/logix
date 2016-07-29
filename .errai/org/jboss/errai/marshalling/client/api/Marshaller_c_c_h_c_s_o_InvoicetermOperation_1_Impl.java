package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Invoiceterm;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InvoicetermOperation_1_Impl implements GeneratedMarshaller<InvoicetermOperation> {
  private InvoicetermOperation[] EMPTY_ARRAY = new InvoicetermOperation[0];
  private Marshaller<Invoiceterm> com_cloderia_helion_client_shared_model_Invoiceterm = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InvoicetermOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InvoicetermOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InvoicetermOperation.class, objId);
    }
    InvoicetermOperation entity = new InvoicetermOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("invoiceterm")) && (!obj.get("invoiceterm").isNull())) {
      entity.setInvoiceterm(com_cloderia_helion_client_shared_model_Invoiceterm.demarshall(obj.get("invoiceterm"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("termTyId")) && (!obj.get("termTyId").isNull())) {
      entity.setTermTyId(java_lang_Long.demarshall(obj.get("termTyId"), a1));
    }
    if ((obj.containsKey("invoiceId")) && (!obj.get("invoiceId").isNull())) {
      entity.setInvoiceId(java_lang_Long.demarshall(obj.get("invoiceId"), a1));
    }
    if ((obj.containsKey("invoiceItemId")) && (!obj.get("invoiceItemId").isNull())) {
      entity.setInvoiceItemId(java_lang_Long.demarshall(obj.get("invoiceItemId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Invoiceterm.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InvoicetermOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InvoicetermOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"invoiceterm\":").append(com_cloderia_helion_client_shared_model_Invoiceterm.marshall(a0.getInvoiceterm(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"termTyId\":").append(java_lang_Long.marshall(a0.getTermTyId(), a1)).append(",").append("\"invoiceId\":").append(java_lang_Long.marshall(a0.getInvoiceId(), a1)).append(",").append("\"invoiceItemId\":").append(java_lang_Long.marshall(a0.getInvoiceItemId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Invoiceterm.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Invoiceterm == null) {
      com_cloderia_helion_client_shared_model_Invoiceterm = Marshalling.getMarshaller(Invoiceterm.class);
    }
  }
}
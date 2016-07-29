package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Invoicestatustype;
import com.cloderia.helion.client.shared.ops.InvoicestatustypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InvoicestatustypeOperation_1_Impl implements GeneratedMarshaller<InvoicestatustypeOperation> {
  private InvoicestatustypeOperation[] EMPTY_ARRAY = new InvoicestatustypeOperation[0];
  private Marshaller<Invoicestatustype> com_cloderia_helion_client_shared_model_Invoicestatustype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InvoicestatustypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InvoicestatustypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InvoicestatustypeOperation.class, objId);
    }
    InvoicestatustypeOperation entity = new InvoicestatustypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("invoicestatustype")) && (!obj.get("invoicestatustype").isNull())) {
      entity.setInvoicestatustype(com_cloderia_helion_client_shared_model_Invoicestatustype.demarshall(obj.get("invoicestatustype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Invoicestatustype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InvoicestatustypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InvoicestatustypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"invoicestatustype\":").append(com_cloderia_helion_client_shared_model_Invoicestatustype.marshall(a0.getInvoicestatustype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Invoicestatustype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Invoicestatustype == null) {
      com_cloderia_helion_client_shared_model_Invoicestatustype = Marshalling.getMarshaller(Invoicestatustype.class);
    }
  }
}
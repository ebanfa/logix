package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.ops.InvoiceitemtypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_InvoiceitemtypeOperation_1_Impl implements GeneratedMarshaller<InvoiceitemtypeOperation> {
  private InvoiceitemtypeOperation[] EMPTY_ARRAY = new InvoiceitemtypeOperation[0];
  private Marshaller<Invoiceitemtype> com_cloderia_helion_client_shared_model_Invoiceitemtype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public InvoiceitemtypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public InvoiceitemtypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(InvoiceitemtypeOperation.class, objId);
    }
    InvoiceitemtypeOperation entity = new InvoiceitemtypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("invoiceitemtype")) && (!obj.get("invoiceitemtype").isNull())) {
      entity.setInvoiceitemtype(com_cloderia_helion_client_shared_model_Invoiceitemtype.demarshall(obj.get("invoiceitemtype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("parentItemTyId")) && (!obj.get("parentItemTyId").isNull())) {
      entity.setParentItemTyId(java_lang_Long.demarshall(obj.get("parentItemTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Invoiceitemtype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(InvoiceitemtypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.InvoiceitemtypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"invoiceitemtype\":").append(com_cloderia_helion_client_shared_model_Invoiceitemtype.marshall(a0.getInvoiceitemtype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"parentItemTyId\":").append(java_lang_Long.marshall(a0.getParentItemTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Invoiceitemtype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Invoiceitemtype == null) {
      com_cloderia_helion_client_shared_model_Invoiceitemtype = Marshalling.getMarshaller(Invoiceitemtype.class);
    }
  }
}
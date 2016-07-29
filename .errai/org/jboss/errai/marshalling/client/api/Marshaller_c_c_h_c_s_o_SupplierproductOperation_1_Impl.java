package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_SupplierproductOperation_1_Impl implements GeneratedMarshaller<SupplierproductOperation> {
  private SupplierproductOperation[] EMPTY_ARRAY = new SupplierproductOperation[0];
  private Marshaller<Supplierproduct> com_cloderia_helion_client_shared_model_Supplierproduct = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public SupplierproductOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public SupplierproductOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SupplierproductOperation.class, objId);
    }
    SupplierproductOperation entity = new SupplierproductOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("supplierproduct")) && (!obj.get("supplierproduct").isNull())) {
      entity.setSupplierproduct(com_cloderia_helion_client_shared_model_Supplierproduct.demarshall(obj.get("supplierproduct"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("prodId")) && (!obj.get("prodId").isNull())) {
      entity.setProdId(java_lang_Long.demarshall(obj.get("prodId"), a1));
    }
    if ((obj.containsKey("prefId")) && (!obj.get("prefId").isNull())) {
      entity.setPrefId(java_lang_Long.demarshall(obj.get("prefId"), a1));
    }
    if ((obj.containsKey("ratingId")) && (!obj.get("ratingId").isNull())) {
      entity.setRatingId(java_lang_Long.demarshall(obj.get("ratingId"), a1));
    }
    if ((obj.containsKey("supplierId")) && (!obj.get("supplierId").isNull())) {
      entity.setSupplierId(java_lang_Long.demarshall(obj.get("supplierId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Supplierproduct.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(SupplierproductOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.SupplierproductOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"supplierproduct\":").append(com_cloderia_helion_client_shared_model_Supplierproduct.marshall(a0.getSupplierproduct(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"prodId\":").append(java_lang_Long.marshall(a0.getProdId(), a1)).append(",").append("\"prefId\":").append(java_lang_Long.marshall(a0.getPrefId(), a1)).append(",").append("\"ratingId\":").append(java_lang_Long.marshall(a0.getRatingId(), a1)).append(",").append("\"supplierId\":").append(java_lang_Long.marshall(a0.getSupplierId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Supplierproduct.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Supplierproduct == null) {
      com_cloderia_helion_client_shared_model_Supplierproduct = Marshalling.getMarshaller(Supplierproduct.class);
    }
  }
}
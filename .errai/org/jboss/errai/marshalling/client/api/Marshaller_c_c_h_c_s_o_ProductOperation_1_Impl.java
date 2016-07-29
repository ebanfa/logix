package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.ops.ProductOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_ProductOperation_1_Impl implements GeneratedMarshaller<ProductOperation> {
  private ProductOperation[] EMPTY_ARRAY = new ProductOperation[0];
  private Marshaller<Product> com_cloderia_helion_client_shared_model_Product = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public ProductOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProductOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ProductOperation.class, objId);
    }
    ProductOperation entity = new ProductOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("product")) && (!obj.get("product").isNull())) {
      entity.setProduct(com_cloderia_helion_client_shared_model_Product.demarshall(obj.get("product"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("uomId")) && (!obj.get("uomId").isNull())) {
      entity.setUomId(java_lang_Long.demarshall(obj.get("uomId"), a1));
    }
    if ((obj.containsKey("prodTyId")) && (!obj.get("prodTyId").isNull())) {
      entity.setProdTyId(java_lang_Long.demarshall(obj.get("prodTyId"), a1));
    }
    if ((obj.containsKey("manufacturerId")) && (!obj.get("manufacturerId").isNull())) {
      entity.setManufacturerId(java_lang_Long.demarshall(obj.get("manufacturerId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Product.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(ProductOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.ProductOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"product\":").append(com_cloderia_helion_client_shared_model_Product.marshall(a0.getProduct(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"uomId\":").append(java_lang_Long.marshall(a0.getUomId(), a1)).append(",").append("\"prodTyId\":").append(java_lang_Long.marshall(a0.getProdTyId(), a1)).append(",").append("\"manufacturerId\":").append(java_lang_Long.marshall(a0.getManufacturerId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Product.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Product == null) {
      com_cloderia_helion_client_shared_model_Product = Marshalling.getMarshaller(Product.class);
    }
  }
}
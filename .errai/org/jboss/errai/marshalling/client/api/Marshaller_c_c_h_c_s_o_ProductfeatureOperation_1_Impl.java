package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_ProductfeatureOperation_1_Impl implements GeneratedMarshaller<ProductfeatureOperation> {
  private ProductfeatureOperation[] EMPTY_ARRAY = new ProductfeatureOperation[0];
  private Marshaller<Productfeature> com_cloderia_helion_client_shared_model_Productfeature = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public ProductfeatureOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProductfeatureOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ProductfeatureOperation.class, objId);
    }
    ProductfeatureOperation entity = new ProductfeatureOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("productfeature")) && (!obj.get("productfeature").isNull())) {
      entity.setProductfeature(com_cloderia_helion_client_shared_model_Productfeature.demarshall(obj.get("productfeature"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("prodFeatTyId")) && (!obj.get("prodFeatTyId").isNull())) {
      entity.setProdFeatTyId(java_lang_Long.demarshall(obj.get("prodFeatTyId"), a1));
    }
    if ((obj.containsKey("prodFeatCatId")) && (!obj.get("prodFeatCatId").isNull())) {
      entity.setProdFeatCatId(java_lang_Long.demarshall(obj.get("prodFeatCatId"), a1));
    }
    if ((obj.containsKey("uomId")) && (!obj.get("uomId").isNull())) {
      entity.setUomId(java_lang_Long.demarshall(obj.get("uomId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Productfeature.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(ProductfeatureOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.ProductfeatureOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"productfeature\":").append(com_cloderia_helion_client_shared_model_Productfeature.marshall(a0.getProductfeature(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"prodFeatTyId\":").append(java_lang_Long.marshall(a0.getProdFeatTyId(), a1)).append(",").append("\"prodFeatCatId\":").append(java_lang_Long.marshall(a0.getProdFeatCatId(), a1)).append(",").append("\"uomId\":").append(java_lang_Long.marshall(a0.getUomId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Productfeature.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Productfeature == null) {
      com_cloderia_helion_client_shared_model_Productfeature = Marshalling.getMarshaller(Productfeature.class);
    }
  }
}
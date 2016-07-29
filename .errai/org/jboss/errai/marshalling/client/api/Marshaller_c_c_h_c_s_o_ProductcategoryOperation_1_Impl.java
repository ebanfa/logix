package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Productcategory;
import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_ProductcategoryOperation_1_Impl implements GeneratedMarshaller<ProductcategoryOperation> {
  private ProductcategoryOperation[] EMPTY_ARRAY = new ProductcategoryOperation[0];
  private Marshaller<Productcategory> com_cloderia_helion_client_shared_model_Productcategory = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public ProductcategoryOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProductcategoryOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ProductcategoryOperation.class, objId);
    }
    ProductcategoryOperation entity = new ProductcategoryOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("productcategory")) && (!obj.get("productcategory").isNull())) {
      entity.setProductcategory(com_cloderia_helion_client_shared_model_Productcategory.demarshall(obj.get("productcategory"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("prodCatTyId")) && (!obj.get("prodCatTyId").isNull())) {
      entity.setProdCatTyId(java_lang_Long.demarshall(obj.get("prodCatTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Productcategory.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(ProductcategoryOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.ProductcategoryOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"productcategory\":").append(com_cloderia_helion_client_shared_model_Productcategory.marshall(a0.getProductcategory(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"prodCatTyId\":").append(java_lang_Long.marshall(a0.getProdCatTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Productcategory.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Productcategory == null) {
      com_cloderia_helion_client_shared_model_Productcategory = Marshalling.getMarshaller(Productcategory.class);
    }
  }
}
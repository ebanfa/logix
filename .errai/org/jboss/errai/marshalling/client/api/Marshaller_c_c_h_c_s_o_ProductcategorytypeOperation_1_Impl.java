package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Productcategorytype;
import com.cloderia.helion.client.shared.ops.ProductcategorytypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_ProductcategorytypeOperation_1_Impl implements GeneratedMarshaller<ProductcategorytypeOperation> {
  private ProductcategorytypeOperation[] EMPTY_ARRAY = new ProductcategorytypeOperation[0];
  private Marshaller<Productcategorytype> com_cloderia_helion_client_shared_model_Productcategorytype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public ProductcategorytypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProductcategorytypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ProductcategorytypeOperation.class, objId);
    }
    ProductcategorytypeOperation entity = new ProductcategorytypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("productcategorytype")) && (!obj.get("productcategorytype").isNull())) {
      entity.setProductcategorytype(com_cloderia_helion_client_shared_model_Productcategorytype.demarshall(obj.get("productcategorytype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Productcategorytype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(ProductcategorytypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.ProductcategorytypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"productcategorytype\":").append(com_cloderia_helion_client_shared_model_Productcategorytype.marshall(a0.getProductcategorytype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Productcategorytype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Productcategorytype == null) {
      com_cloderia_helion_client_shared_model_Productcategorytype = Marshalling.getMarshaller(Productcategorytype.class);
    }
  }
}
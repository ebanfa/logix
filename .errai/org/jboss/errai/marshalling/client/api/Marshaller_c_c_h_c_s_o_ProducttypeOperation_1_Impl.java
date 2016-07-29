package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Producttype;
import com.cloderia.helion.client.shared.ops.ProducttypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_ProducttypeOperation_1_Impl implements GeneratedMarshaller<ProducttypeOperation> {
  private ProducttypeOperation[] EMPTY_ARRAY = new ProducttypeOperation[0];
  private Marshaller<Producttype> com_cloderia_helion_client_shared_model_Producttype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public ProducttypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ProducttypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ProducttypeOperation.class, objId);
    }
    ProducttypeOperation entity = new ProducttypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("producttype")) && (!obj.get("producttype").isNull())) {
      entity.setProducttype(com_cloderia_helion_client_shared_model_Producttype.demarshall(obj.get("producttype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Producttype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(ProducttypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.ProducttypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"producttype\":").append(com_cloderia_helion_client_shared_model_Producttype.marshall(a0.getProducttype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Producttype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Producttype == null) {
      com_cloderia_helion_client_shared_model_Producttype = Marshalling.getMarshaller(Producttype.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Ratingtype;
import com.cloderia.helion.client.shared.ops.RatingtypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_RatingtypeOperation_1_Impl implements GeneratedMarshaller<RatingtypeOperation> {
  private RatingtypeOperation[] EMPTY_ARRAY = new RatingtypeOperation[0];
  private Marshaller<Ratingtype> com_cloderia_helion_client_shared_model_Ratingtype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public RatingtypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public RatingtypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(RatingtypeOperation.class, objId);
    }
    RatingtypeOperation entity = new RatingtypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("ratingtype")) && (!obj.get("ratingtype").isNull())) {
      entity.setRatingtype(com_cloderia_helion_client_shared_model_Ratingtype.demarshall(obj.get("ratingtype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Ratingtype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(RatingtypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.RatingtypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"ratingtype\":").append(com_cloderia_helion_client_shared_model_Ratingtype.marshall(a0.getRatingtype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Ratingtype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Ratingtype == null) {
      com_cloderia_helion_client_shared_model_Ratingtype = Marshalling.getMarshaller(Ratingtype.class);
    }
  }
}
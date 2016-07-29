package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Glbudgetxref;
import com.cloderia.helion.client.shared.ops.GlbudgetxrefOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_GlbudgetxrefOperation_1_Impl implements GeneratedMarshaller<GlbudgetxrefOperation> {
  private GlbudgetxrefOperation[] EMPTY_ARRAY = new GlbudgetxrefOperation[0];
  private Marshaller<Glbudgetxref> com_cloderia_helion_client_shared_model_Glbudgetxref = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public GlbudgetxrefOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public GlbudgetxrefOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GlbudgetxrefOperation.class, objId);
    }
    GlbudgetxrefOperation entity = new GlbudgetxrefOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("glbudgetxref")) && (!obj.get("glbudgetxref").isNull())) {
      entity.setGlbudgetxref(com_cloderia_helion_client_shared_model_Glbudgetxref.demarshall(obj.get("glbudgetxref"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("budgetItemTyId")) && (!obj.get("budgetItemTyId").isNull())) {
      entity.setBudgetItemTyId(java_lang_Long.demarshall(obj.get("budgetItemTyId"), a1));
    }
    if ((obj.containsKey("glAccountId")) && (!obj.get("glAccountId").isNull())) {
      entity.setGlAccountId(java_lang_Long.demarshall(obj.get("glAccountId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Glbudgetxref.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(GlbudgetxrefOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.GlbudgetxrefOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"glbudgetxref\":").append(com_cloderia_helion_client_shared_model_Glbudgetxref.marshall(a0.getGlbudgetxref(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"budgetItemTyId\":").append(java_lang_Long.marshall(a0.getBudgetItemTyId(), a1)).append(",").append("\"glAccountId\":").append(java_lang_Long.marshall(a0.getGlAccountId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Glbudgetxref.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Glbudgetxref == null) {
      com_cloderia_helion_client_shared_model_Glbudgetxref = Marshalling.getMarshaller(Glbudgetxref.class);
    }
  }
}
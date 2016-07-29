package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Budgettype;
import com.cloderia.helion.client.shared.ops.BudgettypeOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_BudgettypeOperation_1_Impl implements GeneratedMarshaller<BudgettypeOperation> {
  private BudgettypeOperation[] EMPTY_ARRAY = new BudgettypeOperation[0];
  private Marshaller<Budgettype> com_cloderia_helion_client_shared_model_Budgettype = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public BudgettypeOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public BudgettypeOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(BudgettypeOperation.class, objId);
    }
    BudgettypeOperation entity = new BudgettypeOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("budgettype")) && (!obj.get("budgettype").isNull())) {
      entity.setBudgettype(com_cloderia_helion_client_shared_model_Budgettype.demarshall(obj.get("budgettype"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Budgettype.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(BudgettypeOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.BudgettypeOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"budgettype\":").append(com_cloderia_helion_client_shared_model_Budgettype.marshall(a0.getBudgettype(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Budgettype.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Budgettype == null) {
      com_cloderia_helion_client_shared_model_Budgettype = Marshalling.getMarshaller(Budgettype.class);
    }
  }
}
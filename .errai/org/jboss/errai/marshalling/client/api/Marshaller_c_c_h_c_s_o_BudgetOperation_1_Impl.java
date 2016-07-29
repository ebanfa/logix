package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.ops.BudgetOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_BudgetOperation_1_Impl implements GeneratedMarshaller<BudgetOperation> {
  private BudgetOperation[] EMPTY_ARRAY = new BudgetOperation[0];
  private Marshaller<Budget> com_cloderia_helion_client_shared_model_Budget = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public BudgetOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public BudgetOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(BudgetOperation.class, objId);
    }
    BudgetOperation entity = new BudgetOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("budget")) && (!obj.get("budget").isNull())) {
      entity.setBudget(com_cloderia_helion_client_shared_model_Budget.demarshall(obj.get("budget"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("periodId")) && (!obj.get("periodId").isNull())) {
      entity.setPeriodId(java_lang_Long.demarshall(obj.get("periodId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Budget.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(BudgetOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.BudgetOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"budget\":").append(com_cloderia_helion_client_shared_model_Budget.marshall(a0.getBudget(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"periodId\":").append(java_lang_Long.marshall(a0.getPeriodId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Budget.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Budget == null) {
      com_cloderia_helion_client_shared_model_Budget = Marshalling.getMarshaller(Budget.class);
    }
  }
}
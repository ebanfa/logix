package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Budgetstatus;
import com.cloderia.helion.client.shared.ops.BudgetstatusOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_BudgetstatusOperation_1_Impl implements GeneratedMarshaller<BudgetstatusOperation> {
  private BudgetstatusOperation[] EMPTY_ARRAY = new BudgetstatusOperation[0];
  private Marshaller<Budgetstatus> com_cloderia_helion_client_shared_model_Budgetstatus = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public BudgetstatusOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public BudgetstatusOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(BudgetstatusOperation.class, objId);
    }
    BudgetstatusOperation entity = new BudgetstatusOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("budgetstatus")) && (!obj.get("budgetstatus").isNull())) {
      entity.setBudgetstatus(com_cloderia_helion_client_shared_model_Budgetstatus.demarshall(obj.get("budgetstatus"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("statusTyId")) && (!obj.get("statusTyId").isNull())) {
      entity.setStatusTyId(java_lang_Long.demarshall(obj.get("statusTyId"), a1));
    }
    if ((obj.containsKey("budgetId")) && (!obj.get("budgetId").isNull())) {
      entity.setBudgetId(java_lang_Long.demarshall(obj.get("budgetId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Budgetstatus.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(BudgetstatusOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.BudgetstatusOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"budgetstatus\":").append(com_cloderia_helion_client_shared_model_Budgetstatus.marshall(a0.getBudgetstatus(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"statusTyId\":").append(java_lang_Long.marshall(a0.getStatusTyId(), a1)).append(",").append("\"budgetId\":").append(java_lang_Long.marshall(a0.getBudgetId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Budgetstatus.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Budgetstatus == null) {
      com_cloderia_helion_client_shared_model_Budgetstatus = Marshalling.getMarshaller(Budgetstatus.class);
    }
  }
}
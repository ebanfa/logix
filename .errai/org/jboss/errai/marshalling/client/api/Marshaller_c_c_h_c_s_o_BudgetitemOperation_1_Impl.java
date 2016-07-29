package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Budgetitem;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_BudgetitemOperation_1_Impl implements GeneratedMarshaller<BudgetitemOperation> {
  private BudgetitemOperation[] EMPTY_ARRAY = new BudgetitemOperation[0];
  private Marshaller<Budgetitem> com_cloderia_helion_client_shared_model_Budgetitem = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public BudgetitemOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public BudgetitemOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(BudgetitemOperation.class, objId);
    }
    BudgetitemOperation entity = new BudgetitemOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("budgetitem")) && (!obj.get("budgetitem").isNull())) {
      entity.setBudgetitem(com_cloderia_helion_client_shared_model_Budgetitem.demarshall(obj.get("budgetitem"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("itemTyId")) && (!obj.get("itemTyId").isNull())) {
      entity.setItemTyId(java_lang_Long.demarshall(obj.get("itemTyId"), a1));
    }
    if ((obj.containsKey("budgetId")) && (!obj.get("budgetId").isNull())) {
      entity.setBudgetId(java_lang_Long.demarshall(obj.get("budgetId"), a1));
    }
    if ((obj.containsKey("parentItemId")) && (!obj.get("parentItemId").isNull())) {
      entity.setParentItemId(java_lang_Long.demarshall(obj.get("parentItemId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Budgetitem.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(BudgetitemOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.BudgetitemOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"budgetitem\":").append(com_cloderia_helion_client_shared_model_Budgetitem.marshall(a0.getBudgetitem(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"itemTyId\":").append(java_lang_Long.marshall(a0.getItemTyId(), a1)).append(",").append("\"budgetId\":").append(java_lang_Long.marshall(a0.getBudgetId(), a1)).append(",").append("\"parentItemId\":").append(java_lang_Long.marshall(a0.getParentItemId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Budgetitem.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Budgetitem == null) {
      com_cloderia_helion_client_shared_model_Budgetitem = Marshalling.getMarshaller(Budgetitem.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.ops.FinancialaccountOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_FinancialaccountOperation_1_Impl implements GeneratedMarshaller<FinancialaccountOperation> {
  private FinancialaccountOperation[] EMPTY_ARRAY = new FinancialaccountOperation[0];
  private Marshaller<Financialaccount> com_cloderia_helion_client_shared_model_Financialaccount = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public FinancialaccountOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public FinancialaccountOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(FinancialaccountOperation.class, objId);
    }
    FinancialaccountOperation entity = new FinancialaccountOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("financialaccount")) && (!obj.get("financialaccount").isNull())) {
      entity.setFinancialaccount(com_cloderia_helion_client_shared_model_Financialaccount.demarshall(obj.get("financialaccount"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("finAcctTyId")) && (!obj.get("finAcctTyId").isNull())) {
      entity.setFinAcctTyId(java_lang_Long.demarshall(obj.get("finAcctTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Financialaccount.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(FinancialaccountOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.FinancialaccountOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"financialaccount\":").append(com_cloderia_helion_client_shared_model_Financialaccount.marshall(a0.getFinancialaccount(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"finAcctTyId\":").append(java_lang_Long.marshall(a0.getFinAcctTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Financialaccount.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Financialaccount == null) {
      com_cloderia_helion_client_shared_model_Financialaccount = Marshalling.getMarshaller(Financialaccount.class);
    }
  }
}
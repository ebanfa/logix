package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Financialaccounttransaction;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactionOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_FinancialaccounttransactionOperation_1_Impl implements GeneratedMarshaller<FinancialaccounttransactionOperation> {
  private FinancialaccounttransactionOperation[] EMPTY_ARRAY = new FinancialaccounttransactionOperation[0];
  private Marshaller<Financialaccounttransaction> com_cloderia_helion_client_shared_model_Financialaccounttransaction = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public FinancialaccounttransactionOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public FinancialaccounttransactionOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(FinancialaccounttransactionOperation.class, objId);
    }
    FinancialaccounttransactionOperation entity = new FinancialaccounttransactionOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("financialaccounttransaction")) && (!obj.get("financialaccounttransaction").isNull())) {
      entity.setFinancialaccounttransaction(com_cloderia_helion_client_shared_model_Financialaccounttransaction.demarshall(obj.get("financialaccounttransaction"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("finTxnTyId")) && (!obj.get("finTxnTyId").isNull())) {
      entity.setFinTxnTyId(java_lang_Long.demarshall(obj.get("finTxnTyId"), a1));
    }
    if ((obj.containsKey("finAcctId")) && (!obj.get("finAcctId").isNull())) {
      entity.setFinAcctId(java_lang_Long.demarshall(obj.get("finAcctId"), a1));
    }
    if ((obj.containsKey("partyId")) && (!obj.get("partyId").isNull())) {
      entity.setPartyId(java_lang_Long.demarshall(obj.get("partyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Financialaccounttransaction.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(FinancialaccounttransactionOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.FinancialaccounttransactionOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"financialaccounttransaction\":").append(com_cloderia_helion_client_shared_model_Financialaccounttransaction.marshall(a0.getFinancialaccounttransaction(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"finTxnTyId\":").append(java_lang_Long.marshall(a0.getFinTxnTyId(), a1)).append(",").append("\"finAcctId\":").append(java_lang_Long.marshall(a0.getFinAcctId(), a1)).append(",").append("\"partyId\":").append(java_lang_Long.marshall(a0.getPartyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Financialaccounttransaction.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Financialaccounttransaction == null) {
      com_cloderia_helion_client_shared_model_Financialaccounttransaction = Marshalling.getMarshaller(Financialaccounttransaction.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Financialaccountrole;
import com.cloderia.helion.client.shared.ops.FinancialaccountroleOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_FinancialaccountroleOperation_1_Impl implements GeneratedMarshaller<FinancialaccountroleOperation> {
  private FinancialaccountroleOperation[] EMPTY_ARRAY = new FinancialaccountroleOperation[0];
  private Marshaller<Financialaccountrole> com_cloderia_helion_client_shared_model_Financialaccountrole = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public FinancialaccountroleOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public FinancialaccountroleOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(FinancialaccountroleOperation.class, objId);
    }
    FinancialaccountroleOperation entity = new FinancialaccountroleOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("financialaccountrole")) && (!obj.get("financialaccountrole").isNull())) {
      entity.setFinancialaccountrole(com_cloderia_helion_client_shared_model_Financialaccountrole.demarshall(obj.get("financialaccountrole"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("partyId")) && (!obj.get("partyId").isNull())) {
      entity.setPartyId(java_lang_Long.demarshall(obj.get("partyId"), a1));
    }
    if ((obj.containsKey("finAcctId")) && (!obj.get("finAcctId").isNull())) {
      entity.setFinAcctId(java_lang_Long.demarshall(obj.get("finAcctId"), a1));
    }
    if ((obj.containsKey("roleTyId")) && (!obj.get("roleTyId").isNull())) {
      entity.setRoleTyId(java_lang_Long.demarshall(obj.get("roleTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Financialaccountrole.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(FinancialaccountroleOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.FinancialaccountroleOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"financialaccountrole\":").append(com_cloderia_helion_client_shared_model_Financialaccountrole.marshall(a0.getFinancialaccountrole(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"partyId\":").append(java_lang_Long.marshall(a0.getPartyId(), a1)).append(",").append("\"finAcctId\":").append(java_lang_Long.marshall(a0.getFinAcctId(), a1)).append(",").append("\"roleTyId\":").append(java_lang_Long.marshall(a0.getRoleTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Financialaccountrole.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Financialaccountrole == null) {
      com_cloderia_helion_client_shared_model_Financialaccountrole = Marshalling.getMarshaller(Financialaccountrole.class);
    }
  }
}
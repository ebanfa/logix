package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Accountingperiod;
import com.cloderia.helion.client.shared.ops.AccountingperiodOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_AccountingperiodOperation_1_Impl implements GeneratedMarshaller<AccountingperiodOperation> {
  private AccountingperiodOperation[] EMPTY_ARRAY = new AccountingperiodOperation[0];
  private Marshaller<Accountingperiod> com_cloderia_helion_client_shared_model_Accountingperiod = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public AccountingperiodOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public AccountingperiodOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(AccountingperiodOperation.class, objId);
    }
    AccountingperiodOperation entity = new AccountingperiodOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("accountingperiod")) && (!obj.get("accountingperiod").isNull())) {
      entity.setAccountingperiod(com_cloderia_helion_client_shared_model_Accountingperiod.demarshall(obj.get("accountingperiod"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("parentPeriodTyId")) && (!obj.get("parentPeriodTyId").isNull())) {
      entity.setParentPeriodTyId(java_lang_Long.demarshall(obj.get("parentPeriodTyId"), a1));
    }
    if ((obj.containsKey("organizationId")) && (!obj.get("organizationId").isNull())) {
      entity.setOrganizationId(java_lang_Long.demarshall(obj.get("organizationId"), a1));
    }
    if ((obj.containsKey("periodTyId")) && (!obj.get("periodTyId").isNull())) {
      entity.setPeriodTyId(java_lang_Long.demarshall(obj.get("periodTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Accountingperiod.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(AccountingperiodOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.AccountingperiodOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"accountingperiod\":").append(com_cloderia_helion_client_shared_model_Accountingperiod.marshall(a0.getAccountingperiod(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"parentPeriodTyId\":").append(java_lang_Long.marshall(a0.getParentPeriodTyId(), a1)).append(",").append("\"organizationId\":").append(java_lang_Long.marshall(a0.getOrganizationId(), a1)).append(",").append("\"periodTyId\":").append(java_lang_Long.marshall(a0.getPeriodTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Accountingperiod.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Accountingperiod == null) {
      com_cloderia_helion_client_shared_model_Accountingperiod = Marshalling.getMarshaller(Accountingperiod.class);
    }
  }
}
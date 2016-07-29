package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Accountingtransactiondetail;
import com.cloderia.helion.client.shared.ops.AccountingtransactiondetailOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_AccountingtransactiondetailOperation_1_Impl implements GeneratedMarshaller<AccountingtransactiondetailOperation> {
  private AccountingtransactiondetailOperation[] EMPTY_ARRAY = new AccountingtransactiondetailOperation[0];
  private Marshaller<Accountingtransactiondetail> com_cloderia_helion_client_shared_model_Accountingtransactiondetail = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public AccountingtransactiondetailOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public AccountingtransactiondetailOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(AccountingtransactiondetailOperation.class, objId);
    }
    AccountingtransactiondetailOperation entity = new AccountingtransactiondetailOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("accountingtransactiondetail")) && (!obj.get("accountingtransactiondetail").isNull())) {
      entity.setAccountingtransactiondetail(com_cloderia_helion_client_shared_model_Accountingtransactiondetail.demarshall(obj.get("accountingtransactiondetail"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("transactionId")) && (!obj.get("transactionId").isNull())) {
      entity.setTransactionId(java_lang_Long.demarshall(obj.get("transactionId"), a1));
    }
    if ((obj.containsKey("associatedDetailId")) && (!obj.get("associatedDetailId").isNull())) {
      entity.setAssociatedDetailId(java_lang_Long.demarshall(obj.get("associatedDetailId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Accountingtransactiondetail.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(AccountingtransactiondetailOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.AccountingtransactiondetailOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"accountingtransactiondetail\":").append(com_cloderia_helion_client_shared_model_Accountingtransactiondetail.marshall(a0.getAccountingtransactiondetail(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"transactionId\":").append(java_lang_Long.marshall(a0.getTransactionId(), a1)).append(",").append("\"associatedDetailId\":").append(java_lang_Long.marshall(a0.getAssociatedDetailId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Accountingtransactiondetail.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Accountingtransactiondetail == null) {
      com_cloderia_helion_client_shared_model_Accountingtransactiondetail = Marshalling.getMarshaller(Accountingtransactiondetail.class);
    }
  }
}
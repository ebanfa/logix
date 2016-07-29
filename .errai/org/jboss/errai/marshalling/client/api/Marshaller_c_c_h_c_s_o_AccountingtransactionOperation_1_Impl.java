package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_AccountingtransactionOperation_1_Impl implements GeneratedMarshaller<AccountingtransactionOperation> {
  private AccountingtransactionOperation[] EMPTY_ARRAY = new AccountingtransactionOperation[0];
  private Marshaller<Accountingtransaction> com_cloderia_helion_client_shared_model_Accountingtransaction = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public AccountingtransactionOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public AccountingtransactionOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(AccountingtransactionOperation.class, objId);
    }
    AccountingtransactionOperation entity = new AccountingtransactionOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("accountingtransaction")) && (!obj.get("accountingtransaction").isNull())) {
      entity.setAccountingtransaction(com_cloderia_helion_client_shared_model_Accountingtransaction.demarshall(obj.get("accountingtransaction"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("transactionTyId")) && (!obj.get("transactionTyId").isNull())) {
      entity.setTransactionTyId(java_lang_Long.demarshall(obj.get("transactionTyId"), a1));
    }
    if ((obj.containsKey("partyRoleId")) && (!obj.get("partyRoleId").isNull())) {
      entity.setPartyRoleId(java_lang_Long.demarshall(obj.get("partyRoleId"), a1));
    }
    if ((obj.containsKey("fromPartyId")) && (!obj.get("fromPartyId").isNull())) {
      entity.setFromPartyId(java_lang_Long.demarshall(obj.get("fromPartyId"), a1));
    }
    if ((obj.containsKey("toPartyId")) && (!obj.get("toPartyId").isNull())) {
      entity.setToPartyId(java_lang_Long.demarshall(obj.get("toPartyId"), a1));
    }
    if ((obj.containsKey("invoiceId")) && (!obj.get("invoiceId").isNull())) {
      entity.setInvoiceId(java_lang_Long.demarshall(obj.get("invoiceId"), a1));
    }
    if ((obj.containsKey("paymentId")) && (!obj.get("paymentId").isNull())) {
      entity.setPaymentId(java_lang_Long.demarshall(obj.get("paymentId"), a1));
    }
    if ((obj.containsKey("fixedAssetId")) && (!obj.get("fixedAssetId").isNull())) {
      entity.setFixedAssetId(java_lang_Long.demarshall(obj.get("fixedAssetId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Accountingtransaction.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(AccountingtransactionOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.AccountingtransactionOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"accountingtransaction\":").append(com_cloderia_helion_client_shared_model_Accountingtransaction.marshall(a0.getAccountingtransaction(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"transactionTyId\":").append(java_lang_Long.marshall(a0.getTransactionTyId(), a1)).append(",").append("\"partyRoleId\":").append(java_lang_Long.marshall(a0.getPartyRoleId(), a1)).append(",").append("\"fromPartyId\":").append(java_lang_Long.marshall(a0.getFromPartyId(), a1)).append(",").append("\"toPartyId\":").append(java_lang_Long.marshall(a0.getToPartyId(), a1)).append(",").append("\"invoiceId\":").append(java_lang_Long.marshall(a0.getInvoiceId(), a1)).append(",").append("\"paymentId\":").append(java_lang_Long.marshall(a0.getPaymentId(), a1)).append(",").append("\"fixedAssetId\":").append(java_lang_Long.marshall(a0.getFixedAssetId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Accountingtransaction.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Accountingtransaction == null) {
      com_cloderia_helion_client_shared_model_Accountingtransaction = Marshalling.getMarshaller(Accountingtransaction.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.cloderia.helion.client.shared.model.Accountingtransactiontype;
import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.model.Universe;
import java.util.Date;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_m_Accountingtransaction_1_Impl implements GeneratedMarshaller<Accountingtransaction> {
  private Accountingtransaction[] EMPTY_ARRAY = new Accountingtransaction[0];
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  private Marshaller<Universe> com_cloderia_helion_client_shared_model_Universe = null;
  private Marshaller<Accountingtransactiontype> com_cloderia_helion_client_shared_model_Accountingtransactiontype = null;
  private Marshaller<Partyrole> com_cloderia_helion_client_shared_model_Partyrole = null;
  private Marshaller<Party> com_cloderia_helion_client_shared_model_Party = null;
  private Marshaller<Invoice> com_cloderia_helion_client_shared_model_Invoice = null;
  private Marshaller<Payment> com_cloderia_helion_client_shared_model_Payment = null;
  private Marshaller<Fixedasset> com_cloderia_helion_client_shared_model_Fixedasset = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Date> java_util_Date = Marshalling.getMarshaller(Date.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  public Accountingtransaction[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Accountingtransaction demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(Accountingtransaction.class, objId);
    }
    Accountingtransaction entity = new Accountingtransaction();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("id")) && (!obj.get("id").isNull())) {
      entity.setId(java_lang_Long.demarshall(obj.get("id"), a1));
    }
    if ((obj.containsKey("universe")) && (!obj.get("universe").isNull())) {
      entity.setUniverse(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("universe"), a1));
    }
    if ((obj.containsKey("transactionTy")) && (!obj.get("transactionTy").isNull())) {
      entity.setTransactionTy(com_cloderia_helion_client_shared_model_Accountingtransactiontype.demarshall(obj.get("transactionTy"), a1));
    }
    if ((obj.containsKey("partyRole")) && (!obj.get("partyRole").isNull())) {
      entity.setPartyRole(com_cloderia_helion_client_shared_model_Partyrole.demarshall(obj.get("partyRole"), a1));
    }
    if ((obj.containsKey("fromParty")) && (!obj.get("fromParty").isNull())) {
      entity.setFromParty(com_cloderia_helion_client_shared_model_Party.demarshall(obj.get("fromParty"), a1));
    }
    if ((obj.containsKey("toParty")) && (!obj.get("toParty").isNull())) {
      entity.setToParty(com_cloderia_helion_client_shared_model_Party.demarshall(obj.get("toParty"), a1));
    }
    if ((obj.containsKey("invoice")) && (!obj.get("invoice").isNull())) {
      entity.setInvoice(com_cloderia_helion_client_shared_model_Invoice.demarshall(obj.get("invoice"), a1));
    }
    if ((obj.containsKey("payment")) && (!obj.get("payment").isNull())) {
      entity.setPayment(com_cloderia_helion_client_shared_model_Payment.demarshall(obj.get("payment"), a1));
    }
    if ((obj.containsKey("fixedAsset")) && (!obj.get("fixedAsset").isNull())) {
      entity.setFixedAsset(com_cloderia_helion_client_shared_model_Fixedasset.demarshall(obj.get("fixedAsset"), a1));
    }
    if ((obj.containsKey("entityCode")) && (!obj.get("entityCode").isNull())) {
      entity.setEntityCode(java_lang_String.demarshall(obj.get("entityCode"), a1));
    }
    if ((obj.containsKey("name")) && (!obj.get("name").isNull())) {
      entity.setName(java_lang_String.demarshall(obj.get("name"), a1));
    }
    if ((obj.containsKey("description")) && (!obj.get("description").isNull())) {
      entity.setDescription(java_lang_String.demarshall(obj.get("description"), a1));
    }
    if ((obj.containsKey("transactionDt")) && (!obj.get("transactionDt").isNull())) {
      entity.setTransactionDt(java_util_Date.demarshall(obj.get("transactionDt"), a1));
    }
    if ((obj.containsKey("entryDt")) && (!obj.get("entryDt").isNull())) {
      entity.setEntryDt(java_util_Date.demarshall(obj.get("entryDt"), a1));
    }
    if ((obj.containsKey("recSt")) && (!obj.get("recSt").isNull())) {
      entity.setRecSt(java_lang_String.demarshall(obj.get("recSt"), a1));
    }
    if ((obj.containsKey("versionNo")) && (!obj.get("versionNo").isNull())) {
      entity.setVersionNo(java_lang_Integer.demarshall(obj.get("versionNo"), a1));
    }
    if ((obj.containsKey("rowTs")) && (!obj.get("rowTs").isNull())) {
      entity.setRowTs(java_util_Date.demarshall(obj.get("rowTs"), a1));
    }
    if ((obj.containsKey("createdDt")) && (!obj.get("createdDt").isNull())) {
      entity.setCreatedDt(java_util_Date.demarshall(obj.get("createdDt"), a1));
    }
    if ((obj.containsKey("createdByUsr")) && (!obj.get("createdByUsr").isNull())) {
      entity.setCreatedByUsr(java_lang_String.demarshall(obj.get("createdByUsr"), a1));
    }
    if ((obj.containsKey("lastModifiedDt")) && (!obj.get("lastModifiedDt").isNull())) {
      entity.setLastModifiedDt(java_util_Date.demarshall(obj.get("lastModifiedDt"), a1));
    }
    if ((obj.containsKey("lastModifiedUsr")) && (!obj.get("lastModifiedUsr").isNull())) {
      entity.setLastModifiedUsr(java_lang_String.demarshall(obj.get("lastModifiedUsr"), a1));
    }
    if ((obj.containsKey("id")) && (!obj.get("id").isNull())) {
      entity.setId(java_lang_Long.demarshall(obj.get("id"), a1));
    }
    if ((obj.containsKey("entityCode")) && (!obj.get("entityCode").isNull())) {
      entity.setEntityCode(java_lang_String.demarshall(obj.get("entityCode"), a1));
    }
    if ((obj.containsKey("name")) && (!obj.get("name").isNull())) {
      entity.setName(java_lang_String.demarshall(obj.get("name"), a1));
    }
    if ((obj.containsKey("effectiveDt")) && (!obj.get("effectiveDt").isNull())) {
      entity.setEffectiveDt(java_util_Date.demarshall(obj.get("effectiveDt"), a1));
    }
    if ((obj.containsKey("recSt")) && (!obj.get("recSt").isNull())) {
      entity.setRecSt(java_lang_String.demarshall(obj.get("recSt"), a1));
    }
    if ((obj.containsKey("versionNo")) && (!obj.get("versionNo").isNull())) {
      entity.setVersionNo(java_lang_Integer.demarshall(obj.get("versionNo"), a1));
    }
    if ((obj.containsKey("rowTs")) && (!obj.get("rowTs").isNull())) {
      entity.setRowTs(java_util_Date.demarshall(obj.get("rowTs"), a1));
    }
    if ((obj.containsKey("createdDt")) && (!obj.get("createdDt").isNull())) {
      entity.setCreatedDt(java_util_Date.demarshall(obj.get("createdDt"), a1));
    }
    if ((obj.containsKey("createdByUsr")) && (!obj.get("createdByUsr").isNull())) {
      entity.setCreatedByUsr(java_lang_String.demarshall(obj.get("createdByUsr"), a1));
    }
    if ((obj.containsKey("lastModifiedDt")) && (!obj.get("lastModifiedDt").isNull())) {
      entity.setLastModifiedDt(java_util_Date.demarshall(obj.get("lastModifiedDt"), a1));
    }
    if ((obj.containsKey("lastModifiedUsr")) && (!obj.get("lastModifiedUsr").isNull())) {
      entity.setLastModifiedUsr(java_lang_String.demarshall(obj.get("lastModifiedUsr"), a1));
    }
    if ((obj.containsKey("universe")) && (!obj.get("universe").isNull())) {
      entity.setUniverse(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("universe"), a1));
    }
    return entity;
  }

  public String marshall(Accountingtransaction a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.model.Accountingtransaction\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append(",").append("\"transactionTy\":").append(com_cloderia_helion_client_shared_model_Accountingtransactiontype.marshall(a0.getTransactionTy(), a1)).append(",").append("\"partyRole\":").append(com_cloderia_helion_client_shared_model_Partyrole.marshall(a0.getPartyRole(), a1)).append(",").append("\"fromParty\":").append(com_cloderia_helion_client_shared_model_Party.marshall(a0.getFromParty(), a1)).append(",").append("\"toParty\":").append(com_cloderia_helion_client_shared_model_Party.marshall(a0.getToParty(), a1)).append(",").append("\"invoice\":").append(com_cloderia_helion_client_shared_model_Invoice.marshall(a0.getInvoice(), a1)).append(",").append("\"payment\":").append(com_cloderia_helion_client_shared_model_Payment.marshall(a0.getPayment(), a1)).append(",").append("\"fixedAsset\":").append(com_cloderia_helion_client_shared_model_Fixedasset.marshall(a0.getFixedAsset(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"description\":").append(java_lang_String.marshall(a0.getDescription(), a1)).append(",").append("\"transactionDt\":").append(java_util_Date.marshall(a0.getTransactionDt(), a1)).append(",").append("\"entryDt\":").append(java_util_Date.marshall(a0.getEntryDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"effectiveDt\":").append(java_util_Date.marshall(a0.getEffectiveDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Universe == null) {
      com_cloderia_helion_client_shared_model_Universe = Marshalling.getMarshaller(Universe.class);
    }
    if (com_cloderia_helion_client_shared_model_Accountingtransactiontype == null) {
      com_cloderia_helion_client_shared_model_Accountingtransactiontype = Marshalling.getMarshaller(Accountingtransactiontype.class);
    }
    if (com_cloderia_helion_client_shared_model_Partyrole == null) {
      com_cloderia_helion_client_shared_model_Partyrole = Marshalling.getMarshaller(Partyrole.class);
    }
    if (com_cloderia_helion_client_shared_model_Party == null) {
      com_cloderia_helion_client_shared_model_Party = Marshalling.getMarshaller(Party.class);
    }
    if (com_cloderia_helion_client_shared_model_Invoice == null) {
      com_cloderia_helion_client_shared_model_Invoice = Marshalling.getMarshaller(Invoice.class);
    }
    if (com_cloderia_helion_client_shared_model_Payment == null) {
      com_cloderia_helion_client_shared_model_Payment = Marshalling.getMarshaller(Payment.class);
    }
    if (com_cloderia_helion_client_shared_model_Fixedasset == null) {
      com_cloderia_helion_client_shared_model_Fixedasset = Marshalling.getMarshaller(Fixedasset.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.model.Financialaccountrole;
import com.cloderia.helion.client.shared.model.Financialaccountroletype;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Universe;
import java.util.Date;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_m_Financialaccountrole_1_Impl implements GeneratedMarshaller<Financialaccountrole> {
  private Financialaccountrole[] EMPTY_ARRAY = new Financialaccountrole[0];
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  private Marshaller<Universe> com_cloderia_helion_client_shared_model_Universe = null;
  private Marshaller<Party> com_cloderia_helion_client_shared_model_Party = null;
  private Marshaller<Financialaccount> com_cloderia_helion_client_shared_model_Financialaccount = null;
  private Marshaller<Financialaccountroletype> com_cloderia_helion_client_shared_model_Financialaccountroletype = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Date> java_util_Date = Marshalling.getMarshaller(Date.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  public Financialaccountrole[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Financialaccountrole demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(Financialaccountrole.class, objId);
    }
    Financialaccountrole entity = new Financialaccountrole();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("id")) && (!obj.get("id").isNull())) {
      entity.setId(java_lang_Long.demarshall(obj.get("id"), a1));
    }
    if ((obj.containsKey("universe")) && (!obj.get("universe").isNull())) {
      entity.setUniverse(com_cloderia_helion_client_shared_model_Universe.demarshall(obj.get("universe"), a1));
    }
    if ((obj.containsKey("party")) && (!obj.get("party").isNull())) {
      entity.setParty(com_cloderia_helion_client_shared_model_Party.demarshall(obj.get("party"), a1));
    }
    if ((obj.containsKey("finAcct")) && (!obj.get("finAcct").isNull())) {
      entity.setFinAcct(com_cloderia_helion_client_shared_model_Financialaccount.demarshall(obj.get("finAcct"), a1));
    }
    if ((obj.containsKey("roleTy")) && (!obj.get("roleTy").isNull())) {
      entity.setRoleTy(com_cloderia_helion_client_shared_model_Financialaccountroletype.demarshall(obj.get("roleTy"), a1));
    }
    if ((obj.containsKey("entityCode")) && (!obj.get("entityCode").isNull())) {
      entity.setEntityCode(java_lang_String.demarshall(obj.get("entityCode"), a1));
    }
    if ((obj.containsKey("name")) && (!obj.get("name").isNull())) {
      entity.setName(java_lang_String.demarshall(obj.get("name"), a1));
    }
    if ((obj.containsKey("fromDt")) && (!obj.get("fromDt").isNull())) {
      entity.setFromDt(java_util_Date.demarshall(obj.get("fromDt"), a1));
    }
    if ((obj.containsKey("toDt")) && (!obj.get("toDt").isNull())) {
      entity.setToDt(java_util_Date.demarshall(obj.get("toDt"), a1));
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

  public String marshall(Financialaccountrole a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.model.Financialaccountrole\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append(",").append("\"party\":").append(com_cloderia_helion_client_shared_model_Party.marshall(a0.getParty(), a1)).append(",").append("\"finAcct\":").append(com_cloderia_helion_client_shared_model_Financialaccount.marshall(a0.getFinAcct(), a1)).append(",").append("\"roleTy\":").append(com_cloderia_helion_client_shared_model_Financialaccountroletype.marshall(a0.getRoleTy(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"fromDt\":").append(java_util_Date.marshall(a0.getFromDt(), a1)).append(",").append("\"toDt\":").append(java_util_Date.marshall(a0.getToDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"id\":").append(java_lang_Long.marshall(a0.getId(), a1)).append(",").append("\"entityCode\":").append(java_lang_String.marshall(a0.getEntityCode(), a1)).append(",").append("\"name\":").append(java_lang_String.marshall(a0.getName(), a1)).append(",").append("\"effectiveDt\":").append(java_util_Date.marshall(a0.getEffectiveDt(), a1)).append(",").append("\"recSt\":").append(java_lang_String.marshall(a0.getRecSt(), a1)).append(",").append("\"versionNo\":").append(java_lang_Integer.marshall(a0.getVersionNo(), a1)).append(",").append("\"rowTs\":").append(java_util_Date.marshall(a0.getRowTs(), a1)).append(",").append("\"createdDt\":").append(java_util_Date.marshall(a0.getCreatedDt(), a1)).append(",").append("\"createdByUsr\":").append(java_lang_String.marshall(a0.getCreatedByUsr(), a1)).append(",").append("\"lastModifiedDt\":").append(java_util_Date.marshall(a0.getLastModifiedDt(), a1)).append(",").append("\"lastModifiedUsr\":").append(java_lang_String.marshall(a0.getLastModifiedUsr(), a1)).append(",").append("\"universe\":").append(com_cloderia_helion_client_shared_model_Universe.marshall(a0.getUniverse(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Universe == null) {
      com_cloderia_helion_client_shared_model_Universe = Marshalling.getMarshaller(Universe.class);
    }
    if (com_cloderia_helion_client_shared_model_Party == null) {
      com_cloderia_helion_client_shared_model_Party = Marshalling.getMarshaller(Party.class);
    }
    if (com_cloderia_helion_client_shared_model_Financialaccount == null) {
      com_cloderia_helion_client_shared_model_Financialaccount = Marshalling.getMarshaller(Financialaccount.class);
    }
    if (com_cloderia_helion_client_shared_model_Financialaccountroletype == null) {
      com_cloderia_helion_client_shared_model_Financialaccountroletype = Marshalling.getMarshaller(Financialaccountroletype.class);
    }
  }
}
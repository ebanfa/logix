package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Agreement;
import com.cloderia.helion.client.shared.ops.AgreementOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_AgreementOperation_1_Impl implements GeneratedMarshaller<AgreementOperation> {
  private AgreementOperation[] EMPTY_ARRAY = new AgreementOperation[0];
  private Marshaller<Agreement> com_cloderia_helion_client_shared_model_Agreement = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public AgreementOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public AgreementOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(AgreementOperation.class, objId);
    }
    AgreementOperation entity = new AgreementOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("agreement")) && (!obj.get("agreement").isNull())) {
      entity.setAgreement(com_cloderia_helion_client_shared_model_Agreement.demarshall(obj.get("agreement"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("agreementTyId")) && (!obj.get("agreementTyId").isNull())) {
      entity.setAgreementTyId(java_lang_Long.demarshall(obj.get("agreementTyId"), a1));
    }
    if ((obj.containsKey("partyRelId")) && (!obj.get("partyRelId").isNull())) {
      entity.setPartyRelId(java_lang_Long.demarshall(obj.get("partyRelId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Agreement.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(AgreementOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.AgreementOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"agreement\":").append(com_cloderia_helion_client_shared_model_Agreement.marshall(a0.getAgreement(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"agreementTyId\":").append(java_lang_Long.marshall(a0.getAgreementTyId(), a1)).append(",").append("\"partyRelId\":").append(java_lang_Long.marshall(a0.getPartyRelId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Agreement.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Agreement == null) {
      com_cloderia_helion_client_shared_model_Agreement = Marshalling.getMarshaller(Agreement.class);
    }
  }
}
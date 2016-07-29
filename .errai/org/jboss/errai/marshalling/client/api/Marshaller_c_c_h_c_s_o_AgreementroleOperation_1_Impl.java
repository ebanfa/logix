package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Agreementrole;
import com.cloderia.helion.client.shared.ops.AgreementroleOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_AgreementroleOperation_1_Impl implements GeneratedMarshaller<AgreementroleOperation> {
  private AgreementroleOperation[] EMPTY_ARRAY = new AgreementroleOperation[0];
  private Marshaller<Agreementrole> com_cloderia_helion_client_shared_model_Agreementrole = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public AgreementroleOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public AgreementroleOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(AgreementroleOperation.class, objId);
    }
    AgreementroleOperation entity = new AgreementroleOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("agreementrole")) && (!obj.get("agreementrole").isNull())) {
      entity.setAgreementrole(com_cloderia_helion_client_shared_model_Agreementrole.demarshall(obj.get("agreementrole"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("agreementRoleTyId")) && (!obj.get("agreementRoleTyId").isNull())) {
      entity.setAgreementRoleTyId(java_lang_Long.demarshall(obj.get("agreementRoleTyId"), a1));
    }
    if ((obj.containsKey("agreementId")) && (!obj.get("agreementId").isNull())) {
      entity.setAgreementId(java_lang_Long.demarshall(obj.get("agreementId"), a1));
    }
    if ((obj.containsKey("partyId")) && (!obj.get("partyId").isNull())) {
      entity.setPartyId(java_lang_Long.demarshall(obj.get("partyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Agreementrole.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(AgreementroleOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.AgreementroleOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"agreementrole\":").append(com_cloderia_helion_client_shared_model_Agreementrole.marshall(a0.getAgreementrole(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"agreementRoleTyId\":").append(java_lang_Long.marshall(a0.getAgreementRoleTyId(), a1)).append(",").append("\"agreementId\":").append(java_lang_Long.marshall(a0.getAgreementId(), a1)).append(",").append("\"partyId\":").append(java_lang_Long.marshall(a0.getPartyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Agreementrole.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Agreementrole == null) {
      com_cloderia_helion_client_shared_model_Agreementrole = Marshalling.getMarshaller(Agreementrole.class);
    }
  }
}
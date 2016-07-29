package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Agreementterm;
import com.cloderia.helion.client.shared.ops.AgreementtermOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_AgreementtermOperation_1_Impl implements GeneratedMarshaller<AgreementtermOperation> {
  private AgreementtermOperation[] EMPTY_ARRAY = new AgreementtermOperation[0];
  private Marshaller<Agreementterm> com_cloderia_helion_client_shared_model_Agreementterm = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public AgreementtermOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public AgreementtermOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(AgreementtermOperation.class, objId);
    }
    AgreementtermOperation entity = new AgreementtermOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("agreementterm")) && (!obj.get("agreementterm").isNull())) {
      entity.setAgreementterm(com_cloderia_helion_client_shared_model_Agreementterm.demarshall(obj.get("agreementterm"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("agreementId")) && (!obj.get("agreementId").isNull())) {
      entity.setAgreementId(java_lang_Long.demarshall(obj.get("agreementId"), a1));
    }
    if ((obj.containsKey("agreementItemId")) && (!obj.get("agreementItemId").isNull())) {
      entity.setAgreementItemId(java_lang_Long.demarshall(obj.get("agreementItemId"), a1));
    }
    if ((obj.containsKey("termTyId")) && (!obj.get("termTyId").isNull())) {
      entity.setTermTyId(java_lang_Long.demarshall(obj.get("termTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Agreementterm.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(AgreementtermOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.AgreementtermOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"agreementterm\":").append(com_cloderia_helion_client_shared_model_Agreementterm.marshall(a0.getAgreementterm(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"agreementId\":").append(java_lang_Long.marshall(a0.getAgreementId(), a1)).append(",").append("\"agreementItemId\":").append(java_lang_Long.marshall(a0.getAgreementItemId(), a1)).append(",").append("\"termTyId\":").append(java_lang_Long.marshall(a0.getTermTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Agreementterm.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Agreementterm == null) {
      com_cloderia_helion_client_shared_model_Agreementterm = Marshalling.getMarshaller(Agreementterm.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Agreementitem;
import com.cloderia.helion.client.shared.ops.AgreementitemOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_AgreementitemOperation_1_Impl implements GeneratedMarshaller<AgreementitemOperation> {
  private AgreementitemOperation[] EMPTY_ARRAY = new AgreementitemOperation[0];
  private Marshaller<Agreementitem> com_cloderia_helion_client_shared_model_Agreementitem = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public AgreementitemOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public AgreementitemOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(AgreementitemOperation.class, objId);
    }
    AgreementitemOperation entity = new AgreementitemOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("agreementitem")) && (!obj.get("agreementitem").isNull())) {
      entity.setAgreementitem(com_cloderia_helion_client_shared_model_Agreementitem.demarshall(obj.get("agreementitem"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("agreementItemTyId")) && (!obj.get("agreementItemTyId").isNull())) {
      entity.setAgreementItemTyId(java_lang_Long.demarshall(obj.get("agreementItemTyId"), a1));
    }
    if ((obj.containsKey("agreementId")) && (!obj.get("agreementId").isNull())) {
      entity.setAgreementId(java_lang_Long.demarshall(obj.get("agreementId"), a1));
    }
    if ((obj.containsKey("agreementItemId")) && (!obj.get("agreementItemId").isNull())) {
      entity.setAgreementItemId(java_lang_Long.demarshall(obj.get("agreementItemId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Agreementitem.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(AgreementitemOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.AgreementitemOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"agreementitem\":").append(com_cloderia_helion_client_shared_model_Agreementitem.marshall(a0.getAgreementitem(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"agreementItemTyId\":").append(java_lang_Long.marshall(a0.getAgreementItemTyId(), a1)).append(",").append("\"agreementId\":").append(java_lang_Long.marshall(a0.getAgreementId(), a1)).append(",").append("\"agreementItemId\":").append(java_lang_Long.marshall(a0.getAgreementItemId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Agreementitem.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Agreementitem == null) {
      com_cloderia_helion_client_shared_model_Agreementitem = Marshalling.getMarshaller(Agreementitem.class);
    }
  }
}
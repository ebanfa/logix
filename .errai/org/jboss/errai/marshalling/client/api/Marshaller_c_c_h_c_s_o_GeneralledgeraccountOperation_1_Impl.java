package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_GeneralledgeraccountOperation_1_Impl implements GeneratedMarshaller<GeneralledgeraccountOperation> {
  private GeneralledgeraccountOperation[] EMPTY_ARRAY = new GeneralledgeraccountOperation[0];
  private Marshaller<Generalledgeraccount> com_cloderia_helion_client_shared_model_Generalledgeraccount = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public GeneralledgeraccountOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public GeneralledgeraccountOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GeneralledgeraccountOperation.class, objId);
    }
    GeneralledgeraccountOperation entity = new GeneralledgeraccountOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("generalledgeraccount")) && (!obj.get("generalledgeraccount").isNull())) {
      entity.setGeneralledgeraccount(com_cloderia_helion_client_shared_model_Generalledgeraccount.demarshall(obj.get("generalledgeraccount"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("glAcctTyId")) && (!obj.get("glAcctTyId").isNull())) {
      entity.setGlAcctTyId(java_lang_Long.demarshall(obj.get("glAcctTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Generalledgeraccount.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(GeneralledgeraccountOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"generalledgeraccount\":").append(com_cloderia_helion_client_shared_model_Generalledgeraccount.marshall(a0.getGeneralledgeraccount(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"glAcctTyId\":").append(java_lang_Long.marshall(a0.getGlAcctTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Generalledgeraccount.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Generalledgeraccount == null) {
      com_cloderia_helion_client_shared_model_Generalledgeraccount = Marshalling.getMarshaller(Generalledgeraccount.class);
    }
  }
}
package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Billingaccount;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_BillingaccountOperation_1_Impl implements GeneratedMarshaller<BillingaccountOperation> {
  private BillingaccountOperation[] EMPTY_ARRAY = new BillingaccountOperation[0];
  private Marshaller<Billingaccount> com_cloderia_helion_client_shared_model_Billingaccount = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public BillingaccountOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public BillingaccountOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(BillingaccountOperation.class, objId);
    }
    BillingaccountOperation entity = new BillingaccountOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("billingaccount")) && (!obj.get("billingaccount").isNull())) {
      entity.setBillingaccount(com_cloderia_helion_client_shared_model_Billingaccount.demarshall(obj.get("billingaccount"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("toContMechId")) && (!obj.get("toContMechId").isNull())) {
      entity.setToContMechId(java_lang_Long.demarshall(obj.get("toContMechId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Billingaccount.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(BillingaccountOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.BillingaccountOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"billingaccount\":").append(com_cloderia_helion_client_shared_model_Billingaccount.marshall(a0.getBillingaccount(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"toContMechId\":").append(java_lang_Long.marshall(a0.getToContMechId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Billingaccount.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Billingaccount == null) {
      com_cloderia_helion_client_shared_model_Billingaccount = Marshalling.getMarshaller(Billingaccount.class);
    }
  }
}
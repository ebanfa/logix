package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_OrganizationglaccountbalanceOperation_1_Impl implements GeneratedMarshaller<OrganizationglaccountbalanceOperation> {
  private OrganizationglaccountbalanceOperation[] EMPTY_ARRAY = new OrganizationglaccountbalanceOperation[0];
  private Marshaller<Organizationglaccountbalance> com_cloderia_helion_client_shared_model_Organizationglaccountbalance = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public OrganizationglaccountbalanceOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public OrganizationglaccountbalanceOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(OrganizationglaccountbalanceOperation.class, objId);
    }
    OrganizationglaccountbalanceOperation entity = new OrganizationglaccountbalanceOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("organizationglaccountbalance")) && (!obj.get("organizationglaccountbalance").isNull())) {
      entity.setOrganizationglaccountbalance(com_cloderia_helion_client_shared_model_Organizationglaccountbalance.demarshall(obj.get("organizationglaccountbalance"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("glAccountId")) && (!obj.get("glAccountId").isNull())) {
      entity.setGlAccountId(java_lang_Long.demarshall(obj.get("glAccountId"), a1));
    }
    if ((obj.containsKey("accountingPeriodId")) && (!obj.get("accountingPeriodId").isNull())) {
      entity.setAccountingPeriodId(java_lang_Long.demarshall(obj.get("accountingPeriodId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Organizationglaccountbalance.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(OrganizationglaccountbalanceOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"organizationglaccountbalance\":").append(com_cloderia_helion_client_shared_model_Organizationglaccountbalance.marshall(a0.getOrganizationglaccountbalance(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"glAccountId\":").append(java_lang_Long.marshall(a0.getGlAccountId(), a1)).append(",").append("\"accountingPeriodId\":").append(java_lang_Long.marshall(a0.getAccountingPeriodId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Organizationglaccountbalance.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Organizationglaccountbalance == null) {
      com_cloderia_helion_client_shared_model_Organizationglaccountbalance = Marshalling.getMarshaller(Organizationglaccountbalance.class);
    }
  }
}
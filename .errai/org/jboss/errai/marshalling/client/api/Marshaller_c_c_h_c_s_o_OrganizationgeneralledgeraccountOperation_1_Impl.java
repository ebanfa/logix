package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_OrganizationgeneralledgeraccountOperation_1_Impl implements GeneratedMarshaller<OrganizationgeneralledgeraccountOperation> {
  private OrganizationgeneralledgeraccountOperation[] EMPTY_ARRAY = new OrganizationgeneralledgeraccountOperation[0];
  private Marshaller<Organizationgeneralledgeraccount> com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public OrganizationgeneralledgeraccountOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public OrganizationgeneralledgeraccountOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(OrganizationgeneralledgeraccountOperation.class, objId);
    }
    OrganizationgeneralledgeraccountOperation entity = new OrganizationgeneralledgeraccountOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("organizationgeneralledgeraccount")) && (!obj.get("organizationgeneralledgeraccount").isNull())) {
      entity.setOrganizationgeneralledgeraccount(com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount.demarshall(obj.get("organizationgeneralledgeraccount"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("organizationId")) && (!obj.get("organizationId").isNull())) {
      entity.setOrganizationId(java_lang_Long.demarshall(obj.get("organizationId"), a1));
    }
    if ((obj.containsKey("productCatId")) && (!obj.get("productCatId").isNull())) {
      entity.setProductCatId(java_lang_Long.demarshall(obj.get("productCatId"), a1));
    }
    if ((obj.containsKey("glAccountId")) && (!obj.get("glAccountId").isNull())) {
      entity.setGlAccountId(java_lang_Long.demarshall(obj.get("glAccountId"), a1));
    }
    if ((obj.containsKey("productId")) && (!obj.get("productId").isNull())) {
      entity.setProductId(java_lang_Long.demarshall(obj.get("productId"), a1));
    }
    if ((obj.containsKey("refPartyId")) && (!obj.get("refPartyId").isNull())) {
      entity.setRefPartyId(java_lang_Long.demarshall(obj.get("refPartyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(OrganizationgeneralledgeraccountOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"organizationgeneralledgeraccount\":").append(com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount.marshall(a0.getOrganizationgeneralledgeraccount(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"organizationId\":").append(java_lang_Long.marshall(a0.getOrganizationId(), a1)).append(",").append("\"productCatId\":").append(java_lang_Long.marshall(a0.getProductCatId(), a1)).append(",").append("\"glAccountId\":").append(java_lang_Long.marshall(a0.getGlAccountId(), a1)).append(",").append("\"productId\":").append(java_lang_Long.marshall(a0.getProductId(), a1)).append(",").append("\"refPartyId\":").append(java_lang_Long.marshall(a0.getRefPartyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount == null) {
      com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount = Marshalling.getMarshaller(Organizationgeneralledgeraccount.class);
    }
  }
}
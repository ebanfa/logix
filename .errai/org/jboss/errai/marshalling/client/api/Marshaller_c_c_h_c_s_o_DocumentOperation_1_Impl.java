package org.jboss.errai.marshalling.client.api;

import com.cloderia.helion.client.shared.model.Document;
import com.cloderia.helion.client.shared.ops.DocumentOperation;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_c_c_h_c_s_o_DocumentOperation_1_Impl implements GeneratedMarshaller<DocumentOperation> {
  private DocumentOperation[] EMPTY_ARRAY = new DocumentOperation[0];
  private Marshaller<Document> com_cloderia_helion_client_shared_model_Document = null;
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public DocumentOperation[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DocumentOperation demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DocumentOperation.class, objId);
    }
    DocumentOperation entity = new DocumentOperation();
    a1.recordObject(objId, entity);
    if ((obj.containsKey("document")) && (!obj.get("document").isNull())) {
      entity.setDocument(com_cloderia_helion_client_shared_model_Document.demarshall(obj.get("document"), a1));
    }
    if ((obj.containsKey("universeId")) && (!obj.get("universeId").isNull())) {
      entity.setUniverseId(java_lang_Long.demarshall(obj.get("universeId"), a1));
    }
    if ((obj.containsKey("docTyId")) && (!obj.get("docTyId").isNull())) {
      entity.setDocTyId(java_lang_Long.demarshall(obj.get("docTyId"), a1));
    }
    if ((obj.containsKey("entity")) && (!obj.get("entity").isNull())) {
      entity.setEntity(com_cloderia_helion_client_shared_model_Document.demarshall(obj.get("entity"), a1));
    }
    return entity;
  }

  public String marshall(DocumentOperation a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final StringBuilder json = new StringBuilder("{\"^EncodedType\":\"com.cloderia.helion.client.shared.ops.DocumentOperation\",\"^ObjectID\"");
    json.append(":\"").append(a1.getObject(a0)).append("\"");
    if (ref) {
      return json.append("}").toString();
    }
    return json.append(",").append("\"document\":").append(com_cloderia_helion_client_shared_model_Document.marshall(a0.getDocument(), a1)).append(",").append("\"universeId\":").append(java_lang_Long.marshall(a0.getUniverseId(), a1)).append(",").append("\"docTyId\":").append(java_lang_Long.marshall(a0.getDocTyId(), a1)).append(",").append("\"entity\":").append(com_cloderia_helion_client_shared_model_Document.marshall(a0.getEntity(), a1)).append("}").toString();
  }

  private void lazyInit() {
    if (com_cloderia_helion_client_shared_model_Document == null) {
      com_cloderia_helion_client_shared_model_Document = Marshalling.getMarshaller(Document.class);
    }
  }
}
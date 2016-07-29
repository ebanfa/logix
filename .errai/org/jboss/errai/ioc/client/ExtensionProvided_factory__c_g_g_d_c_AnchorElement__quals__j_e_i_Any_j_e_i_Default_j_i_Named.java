package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.TemplateUtil;

public class ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<AnchorElement> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AnchorElement.class, "ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "a", true);
  public ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    handle.addAssignableType(AnchorElement.class);
    handle.addAssignableType(Element.class);
    handle.addAssignableType(Node.class);
    handle.addAssignableType(JavaScriptObject.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
    handle.addQualifier(new Named() {
      public Class annotationType() {
        return Named.class;
      }
      public String toString() {
        return "@javax.inject.Named(value=a)";
      }
      public String value() {
        return "a";
      }
    });
  }

  public void init(final Context context) {

  }

  public AnchorElement createInstance(final ContextManager contextManager) {
    final Element element = Document.get().createElement("a");
    final AnchorElement retVal = TemplateUtil.nativeCast(element);
    return retVal;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AnchorElement) instance, contextManager);
  }

  public void destroyInstanceHelper(final AnchorElement instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final AnchorElement instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
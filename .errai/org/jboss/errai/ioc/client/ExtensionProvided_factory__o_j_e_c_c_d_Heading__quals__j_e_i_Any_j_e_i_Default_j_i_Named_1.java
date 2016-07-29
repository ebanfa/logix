package org.jboss.errai.ioc.client;

import com.google.gwt.dom.client.Document;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.errai.common.client.dom.Element;
import org.jboss.errai.common.client.dom.EventTarget;
import org.jboss.errai.common.client.dom.GlobalEventHandlers;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Node;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.TemplateUtil;

public class ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1 extends Factory<Heading> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(Heading.class, "ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1", Dependent.class, false, "h4", true);
  public ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1() {
    handle.addAssignableType(Heading.class);
    handle.addAssignableType(HTMLElement.class);
    handle.addAssignableType(Element.class);
    handle.addAssignableType(Node.class);
    handle.addAssignableType(EventTarget.class);
    handle.addAssignableType(GlobalEventHandlers.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
    handle.addQualifier(new Named() {
      public Class annotationType() {
        return Named.class;
      }
      public String toString() {
        return "@javax.inject.Named(value=h4)";
      }
      public String value() {
        return "h4";
      }
    });
  }

  public void init(final Context context) {

  }

  public Heading createInstance(final ContextManager contextManager) {
    final com.google.gwt.dom.client.Element element = Document.get().createElement("h4");
    final Heading retVal = TemplateUtil.nativeCast(element);
    return retVal;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Heading) instance, contextManager);
  }

  public void destroyInstanceHelper(final Heading instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final Heading instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
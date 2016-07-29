package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.dom.Element;
import org.jboss.errai.common.client.dom.EventTarget;
import org.jboss.errai.common.client.dom.GlobalEventHandlers;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.dom.Node;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal extends Factory<HTMLElement> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(HTMLElement.class, "ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal() {
    handle.addAssignableType(HTMLElement.class);
    handle.addAssignableType(Element.class);
    handle.addAssignableType(Node.class);
    handle.addAssignableType(EventTarget.class);
    handle.addAssignableType(GlobalEventHandlers.class);
  }

  public void init(final Context context) {

  }

  public HTMLElement createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<HTMLElement> provider = (ContextualTypeProvider<HTMLElement>) contextManager.getInstance("Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default");
    final HTMLElement instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((HTMLElement) instance, contextManager);
  }

  public void destroyInstanceHelper(final HTMLElement instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final HTMLElement instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.client.local.producer.HTMLElementProvider;

public class Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLElementProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(HTMLElementProvider.class, "Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(HTMLElementProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public HTMLElementProvider createInstance(final ContextManager contextManager) {
    final HTMLElementProvider instance = new HTMLElementProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((HTMLElementProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final HTMLElementProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final HTMLElementProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcherProvider;

public class Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<URLPatternMatcherProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(URLPatternMatcherProvider.class, "Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(URLPatternMatcherProvider.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public URLPatternMatcherProvider createInstance(final ContextManager contextManager) {
    final URLPatternMatcherProvider instance = new URLPatternMatcherProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((URLPatternMatcherProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final URLPatternMatcherProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final URLPatternMatcherProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
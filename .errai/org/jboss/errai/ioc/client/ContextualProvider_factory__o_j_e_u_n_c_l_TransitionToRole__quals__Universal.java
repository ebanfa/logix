package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.TransitionToRole;

public class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionToRole__quals__Universal extends Factory<TransitionToRole> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(TransitionToRole.class, "ContextualProvider_factory__o_j_e_u_n_c_l_TransitionToRole__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_u_n_c_l_TransitionToRole__quals__Universal() {
    handle.addAssignableType(TransitionToRole.class);
    handle.addAssignableType(Object.class);
  }

  public void init(final Context context) {

  }

  public TransitionToRole createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<TransitionToRole> provider = (ContextualTypeProvider<TransitionToRole>) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default");
    final TransitionToRole instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((TransitionToRole) instance, contextManager);
  }

  public void destroyInstanceHelper(final TransitionToRole instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final TransitionToRole instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.InitBallot;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal extends Factory<InitBallot> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InitBallot.class, "ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal() {
    handle.addAssignableType(InitBallot.class);
  }

  public void init(final Context context) {

  }

  public InitBallot createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<InitBallot> provider = (ContextualTypeProvider<InitBallot>) contextManager.getInstance("Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default");
    final InitBallot instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InitBallot) instance, contextManager);
  }

  public void destroyInstanceHelper(final InitBallot instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final InitBallot instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
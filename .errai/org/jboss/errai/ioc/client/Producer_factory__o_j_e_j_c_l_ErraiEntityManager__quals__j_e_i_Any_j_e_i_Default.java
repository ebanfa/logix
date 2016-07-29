package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.jpa.client.local.ErraiEntityManager;
import org.jboss.errai.jpa.client.local.ErraiEntityManagerProducer;

public class Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ErraiEntityManager> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ErraiEntityManager.class, "Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ErraiEntityManager.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(EntityManager.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ErraiEntityManager createInstance(final ContextManager contextManager) {
    ErraiEntityManagerProducer producerInstance = contextManager.getInstance("Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default");
    producerInstance = Factory.maybeUnwrapProxy(producerInstance);
    final ErraiEntityManager instance = producerInstance.getEntityManager();
    thisInstance.setReference(instance, "producerInstance", producerInstance);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ErraiEntityManager) instance, contextManager);
  }

  public void destroyInstanceHelper(final ErraiEntityManager instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ErraiEntityManager instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
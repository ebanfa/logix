package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.jpa.client.local.ErraiEntityManager;
import org.jboss.errai.jpa.client.local.ErraiEntityManagerProducer;

public class Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<ErraiEntityManagerProducer> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ErraiEntityManagerProducer.class, "Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true);
  private class Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ErraiEntityManagerProducer implements Proxy<ErraiEntityManagerProducer> {
    private final ProxyHelper<ErraiEntityManagerProducer> proxyHelper = new ProxyHelperImpl<ErraiEntityManagerProducer>("Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ErraiEntityManagerProducer instance) {

    }

    public ErraiEntityManagerProducer asBeanType() {
      return this;
    }

    public void setInstance(final ErraiEntityManagerProducer instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setContext(final Context context) {
      proxyHelper.setContext(context);
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public ErraiEntityManager getEntityManager() {
      if (proxyHelper != null) {
        final ErraiEntityManagerProducer proxiedInstance = proxyHelper.getInstance(this);
        final ErraiEntityManager retVal = proxiedInstance.getEntityManager();
        return retVal;
      } else {
        return super.getEntityManager();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ErraiEntityManagerProducer proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ErraiEntityManagerProducer.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ErraiEntityManagerProducer createInstance(final ContextManager contextManager) {
    final ErraiEntityManagerProducer instance = new ErraiEntityManagerProducer();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ErraiEntityManagerProducer) instance, contextManager);
  }

  public void destroyInstanceHelper(final ErraiEntityManagerProducer instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ErraiEntityManagerProducer instance) {

  }

  public Proxy createProxy(final Context context) {
    final Proxy<ErraiEntityManagerProducer> proxyImpl = new Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setContext(context);
    return proxyImpl;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
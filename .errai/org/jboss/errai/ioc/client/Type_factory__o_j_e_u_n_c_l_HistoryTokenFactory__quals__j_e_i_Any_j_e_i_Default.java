package org.jboss.errai.ioc.client;

import com.google.common.collect.Multimap;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ui.nav.client.local.HistoryToken;
import org.jboss.errai.ui.nav.client.local.HistoryTokenFactory;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcher;

public class Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<HistoryTokenFactory> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(HistoryTokenFactory.class, "Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true);
  private class Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends HistoryTokenFactory implements Proxy<HistoryTokenFactory> {
    private final ProxyHelper<HistoryTokenFactory> proxyHelper = new ProxyHelperImpl<HistoryTokenFactory>("Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final HistoryTokenFactory instance) {

    }

    public HistoryTokenFactory asBeanType() {
      return this;
    }

    public void setInstance(final HistoryTokenFactory instance) {
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

    @Override public HistoryToken createHistoryToken(String pageName, Multimap state) {
      if (proxyHelper != null) {
        final HistoryTokenFactory proxiedInstance = proxyHelper.getInstance(this);
        final HistoryToken retVal = proxiedInstance.createHistoryToken(pageName, state);
        return retVal;
      } else {
        return super.createHistoryToken(pageName, state);
      }
    }

    @Override public HistoryToken parseURL(String url) {
      if (proxyHelper != null) {
        final HistoryTokenFactory proxiedInstance = proxyHelper.getInstance(this);
        final HistoryToken retVal = proxiedInstance.parseURL(url);
        return retVal;
      } else {
        return super.parseURL(url);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final HistoryTokenFactory proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(HistoryTokenFactory.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public HistoryTokenFactory createInstance(final ContextManager contextManager) {
    final URLPatternMatcher _upm_0 = (URLPatternMatcher) contextManager.getInstance("Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default");
    final HistoryTokenFactory instance = new HistoryTokenFactory(_upm_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((HistoryTokenFactory) instance, contextManager);
  }

  public void destroyInstanceHelper(final HistoryTokenFactory instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final HistoryTokenFactory instance) {

  }

  public Proxy createProxy(final Context context) {
    final Proxy<HistoryTokenFactory> proxyImpl = new Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setContext(context);
    return proxyImpl;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
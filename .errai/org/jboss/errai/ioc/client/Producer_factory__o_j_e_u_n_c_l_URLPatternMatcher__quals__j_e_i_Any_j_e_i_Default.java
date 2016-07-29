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
import org.jboss.errai.ui.nav.client.local.HistoryToken;
import org.jboss.errai.ui.nav.client.local.URLPattern;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcher;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcherProvider;
import org.jboss.errai.ui.nav.client.local.spi.NavigationGraph;

public class Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<URLPatternMatcher> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(URLPatternMatcher.class, "Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true);
  private class Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends URLPatternMatcher implements Proxy<URLPatternMatcher> {
    private final ProxyHelper<URLPatternMatcher> proxyHelper = new ProxyHelperImpl<URLPatternMatcher>("Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final URLPatternMatcher instance) {

    }

    public URLPatternMatcher asBeanType() {
      return this;
    }

    public void setInstance(final URLPatternMatcher instance) {
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

    @Override public void add(String urlTemplate, String pageName) {
      if (proxyHelper != null) {
        final URLPatternMatcher proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.add(urlTemplate, pageName);
      } else {
        super.add(urlTemplate, pageName);
      }
    }

    @Override public HistoryToken parseURL(String url) {
      if (proxyHelper != null) {
        final URLPatternMatcher proxiedInstance = proxyHelper.getInstance(this);
        final HistoryToken retVal = proxiedInstance.parseURL(url);
        return retVal;
      } else {
        return super.parseURL(url);
      }
    }

    @Override public void setAsDefaultPage(String defaultPage) {
      if (proxyHelper != null) {
        final URLPatternMatcher proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setAsDefaultPage(defaultPage);
      } else {
        super.setAsDefaultPage(defaultPage);
      }
    }

    @Override public URLPattern getURLPattern(String pageName) {
      if (proxyHelper != null) {
        final URLPatternMatcher proxiedInstance = proxyHelper.getInstance(this);
        final URLPattern retVal = proxiedInstance.getURLPattern(pageName);
        return retVal;
      } else {
        return super.getURLPattern(pageName);
      }
    }

    @Override public String getPageName(String typedURL) {
      if (proxyHelper != null) {
        final URLPatternMatcher proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getPageName(typedURL);
        return retVal;
      } else {
        return super.getPageName(typedURL);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final URLPatternMatcher proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(URLPatternMatcher.class);
    handle.addAssignableType(Object.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public URLPatternMatcher createInstance(final ContextManager contextManager) {
    URLPatternMatcherProvider producerInstance = contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default");
    producerInstance = Factory.maybeUnwrapProxy(producerInstance);
    final NavigationGraph createURLPatternMatcher_navGraph_0 = (NavigationGraph) contextManager.getInstance("Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default");
    final URLPatternMatcher instance = producerInstance.createURLPatternMatcher(createURLPatternMatcher_navGraph_0);
    thisInstance.setReference(instance, "producerInstance", producerInstance);
    registerDependentScopedReference(instance, producerInstance);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((URLPatternMatcher) instance, contextManager);
  }

  public void destroyInstanceHelper(final URLPatternMatcher instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final URLPatternMatcher instance) {

  }

  public Proxy createProxy(final Context context) {
    final Proxy<URLPatternMatcher> proxyImpl = new Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setContext(context);
    return proxyImpl;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
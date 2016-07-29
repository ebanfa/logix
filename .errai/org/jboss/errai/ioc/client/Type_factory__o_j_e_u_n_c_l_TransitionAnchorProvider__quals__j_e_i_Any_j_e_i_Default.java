package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.HistoryTokenFactory;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider;

public class Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionAnchorProvider> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(TransitionAnchorProvider.class, "Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true);
  public Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(TransitionAnchorProvider.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(ContextualTypeProvider.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public TransitionAnchorProvider createInstance(final ContextManager contextManager) {
    final TransitionAnchorProvider instance = new TransitionAnchorProvider();
    setIncompleteInstance(instance);
    final Navigation TransitionAnchorProvider_navigation = (Navigation) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default");
    TransitionAnchorProvider_Navigation_navigation(instance, TransitionAnchorProvider_navigation);
    final HistoryTokenFactory TransitionAnchorProvider_htFactory = (HistoryTokenFactory) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default");
    TransitionAnchorProvider_HistoryTokenFactory_htFactory(instance, TransitionAnchorProvider_htFactory);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((TransitionAnchorProvider) instance, contextManager);
  }

  public void destroyInstanceHelper(final TransitionAnchorProvider instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final TransitionAnchorProvider instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HistoryTokenFactory TransitionAnchorProvider_HistoryTokenFactory_htFactory(TransitionAnchorProvider instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::htFactory;
  }-*/;

  native static void TransitionAnchorProvider_HistoryTokenFactory_htFactory(TransitionAnchorProvider instance, HistoryTokenFactory value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::htFactory = value;
  }-*/;

  native static Navigation TransitionAnchorProvider_Navigation_navigation(TransitionAnchorProvider instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::navigation;
  }-*/;

  native static void TransitionAnchorProvider_Navigation_navigation(TransitionAnchorProvider instance, Navigation value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::navigation = value;
  }-*/;
}
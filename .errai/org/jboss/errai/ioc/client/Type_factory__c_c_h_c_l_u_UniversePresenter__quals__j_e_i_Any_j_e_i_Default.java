package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.universe.UniversePresenter;
import com.cloderia.helion.client.shared.model.Universe;
import com.google.gwt.user.client.TakesValue;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class Type_factory__c_c_h_c_l_u_UniversePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<UniversePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(UniversePresenter.class, "Type_factory__c_c_h_c_l_u_UniversePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_u_UniversePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(UniversePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public UniversePresenter createInstance(final ContextManager contextManager) {
    final UniversePresenter instance = new UniversePresenter();
    setIncompleteInstance(instance);
    final DataBinder UniversePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Universe.class }, new Annotation[] { });
    registerDependentScopedReference(instance, UniversePresenter_binder);
    UniversePresenter_DataBinder_binder(instance, UniversePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((UniversePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final UniversePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final UniversePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder UniversePresenter_DataBinder_binder(UniversePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder;
  }-*/;

  native static void UniversePresenter_DataBinder_binder(UniversePresenter instance, DataBinder<Universe> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder = value;
  }-*/;
}
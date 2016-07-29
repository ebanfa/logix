package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyrole.PartyrolePresenter;
import com.cloderia.helion.client.shared.model.Partyrole;
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

public class Type_factory__c_c_h_c_l_p_PartyrolePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyrolePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyrolePresenter.class, "Type_factory__c_c_h_c_l_p_PartyrolePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_PartyrolePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyrolePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyrolePresenter createInstance(final ContextManager contextManager) {
    final PartyrolePresenter instance = new PartyrolePresenter();
    setIncompleteInstance(instance);
    final DataBinder PartyrolePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyrole.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyrolePresenter_binder);
    PartyrolePresenter_DataBinder_binder(instance, PartyrolePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyrolePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyrolePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final PartyrolePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder;
  }-*/;

  native static void PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance, DataBinder<Partyrole> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder = value;
  }-*/;
}
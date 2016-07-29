package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.systemuser.SystemuserPresenter;
import com.cloderia.helion.client.shared.model.Systemuser;
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

public class Type_factory__c_c_h_c_l_s_SystemuserPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SystemuserPresenter.class, "Type_factory__c_c_h_c_l_s_SystemuserPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_s_SystemuserPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SystemuserPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SystemuserPresenter createInstance(final ContextManager contextManager) {
    final SystemuserPresenter instance = new SystemuserPresenter();
    setIncompleteInstance(instance);
    final DataBinder SystemuserPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Systemuser.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SystemuserPresenter_binder);
    SystemuserPresenter_DataBinder_binder(instance, SystemuserPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SystemuserPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final SystemuserPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final SystemuserPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder;
  }-*/;

  native static void SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance, DataBinder<Systemuser> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder = value;
  }-*/;
}
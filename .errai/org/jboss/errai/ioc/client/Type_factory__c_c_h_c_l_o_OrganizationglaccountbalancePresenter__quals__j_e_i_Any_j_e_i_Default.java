package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter;
import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
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

public class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalancePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalancePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationglaccountbalancePresenter.class, "Type_factory__c_c_h_c_l_o_OrganizationglaccountbalancePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_o_OrganizationglaccountbalancePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationglaccountbalancePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationglaccountbalancePresenter createInstance(final ContextManager contextManager) {
    final OrganizationglaccountbalancePresenter instance = new OrganizationglaccountbalancePresenter();
    setIncompleteInstance(instance);
    final DataBinder OrganizationglaccountbalancePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationglaccountbalance.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationglaccountbalancePresenter_binder);
    OrganizationglaccountbalancePresenter_DataBinder_binder(instance, OrganizationglaccountbalancePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationglaccountbalancePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationglaccountbalancePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final OrganizationglaccountbalancePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder;
  }-*/;

  native static void OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance, DataBinder<Organizationglaccountbalance> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder = value;
  }-*/;
}
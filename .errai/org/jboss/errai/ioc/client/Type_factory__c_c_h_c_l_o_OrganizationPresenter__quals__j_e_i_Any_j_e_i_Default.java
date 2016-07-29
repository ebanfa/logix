package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organization.OrganizationPresenter;
import com.cloderia.helion.client.shared.model.Organization;
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

public class Type_factory__c_c_h_c_l_o_OrganizationPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationPresenter.class, "Type_factory__c_c_h_c_l_o_OrganizationPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_o_OrganizationPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationPresenter createInstance(final ContextManager contextManager) {
    final OrganizationPresenter instance = new OrganizationPresenter();
    setIncompleteInstance(instance);
    final DataBinder OrganizationPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organization.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationPresenter_binder);
    OrganizationPresenter_DataBinder_binder(instance, OrganizationPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final OrganizationPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder;
  }-*/;

  native static void OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance, DataBinder<Organization> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder = value;
  }-*/;
}
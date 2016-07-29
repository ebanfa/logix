package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter;
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
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

public class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationgeneralledgeraccountPresenter.class, "Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationgeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationgeneralledgeraccountPresenter createInstance(final ContextManager contextManager) {
    final OrganizationgeneralledgeraccountPresenter instance = new OrganizationgeneralledgeraccountPresenter();
    setIncompleteInstance(instance);
    final DataBinder OrganizationgeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationgeneralledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountPresenter_binder);
    OrganizationgeneralledgeraccountPresenter_DataBinder_binder(instance, OrganizationgeneralledgeraccountPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationgeneralledgeraccountPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationgeneralledgeraccountPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final OrganizationgeneralledgeraccountPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder;
  }-*/;

  native static void OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance, DataBinder<Organizationgeneralledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder = value;
  }-*/;
}
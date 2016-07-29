package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter;
import com.cloderia.helion.client.shared.model.Billingaccount;
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

public class Type_factory__c_c_h_c_l_b_BillingaccountPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BillingaccountPresenter.class, "Type_factory__c_c_h_c_l_b_BillingaccountPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_b_BillingaccountPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BillingaccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BillingaccountPresenter createInstance(final ContextManager contextManager) {
    final BillingaccountPresenter instance = new BillingaccountPresenter();
    setIncompleteInstance(instance);
    final DataBinder BillingaccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Billingaccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BillingaccountPresenter_binder);
    BillingaccountPresenter_DataBinder_binder(instance, BillingaccountPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BillingaccountPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final BillingaccountPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final BillingaccountPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder;
  }-*/;

  native static void BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance, DataBinder<Billingaccount> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder = value;
  }-*/;
}
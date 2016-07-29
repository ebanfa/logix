package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.payment.PaymentPresenter;
import com.cloderia.helion.client.shared.model.Payment;
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

public class Type_factory__c_c_h_c_l_p_PaymentPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PaymentPresenter.class, "Type_factory__c_c_h_c_l_p_PaymentPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_PaymentPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PaymentPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PaymentPresenter createInstance(final ContextManager contextManager) {
    final PaymentPresenter instance = new PaymentPresenter();
    setIncompleteInstance(instance);
    final DataBinder PaymentPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Payment.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PaymentPresenter_binder);
    PaymentPresenter_DataBinder_binder(instance, PaymentPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PaymentPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PaymentPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final PaymentPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PaymentPresenter_DataBinder_binder(PaymentPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder;
  }-*/;

  native static void PaymentPresenter_DataBinder_binder(PaymentPresenter instance, DataBinder<Payment> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder = value;
  }-*/;
}
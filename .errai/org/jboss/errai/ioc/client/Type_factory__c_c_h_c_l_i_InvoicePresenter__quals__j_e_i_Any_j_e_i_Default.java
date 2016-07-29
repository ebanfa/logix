package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoice.InvoicePresenter;
import com.cloderia.helion.client.shared.model.Invoice;
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

public class Type_factory__c_c_h_c_l_i_InvoicePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoicePresenter.class, "Type_factory__c_c_h_c_l_i_InvoicePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_i_InvoicePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoicePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoicePresenter createInstance(final ContextManager contextManager) {
    final InvoicePresenter instance = new InvoicePresenter();
    setIncompleteInstance(instance);
    final DataBinder InvoicePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoice.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicePresenter_binder);
    InvoicePresenter_DataBinder_binder(instance, InvoicePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoicePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoicePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final InvoicePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder InvoicePresenter_DataBinder_binder(InvoicePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder;
  }-*/;

  native static void InvoicePresenter_DataBinder_binder(InvoicePresenter instance, DataBinder<Invoice> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder = value;
  }-*/;
}
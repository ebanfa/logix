package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter;
import com.cloderia.helion.client.shared.model.Invoiceterm;
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

public class Type_factory__c_c_h_c_l_i_InvoicetermPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoicetermPresenter.class, "Type_factory__c_c_h_c_l_i_InvoicetermPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_i_InvoicetermPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoicetermPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoicetermPresenter createInstance(final ContextManager contextManager) {
    final InvoicetermPresenter instance = new InvoicetermPresenter();
    setIncompleteInstance(instance);
    final DataBinder InvoicetermPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceterm.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicetermPresenter_binder);
    InvoicetermPresenter_DataBinder_binder(instance, InvoicetermPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoicetermPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoicetermPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final InvoicetermPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder;
  }-*/;

  native static void InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance, DataBinder<Invoiceterm> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder = value;
  }-*/;
}
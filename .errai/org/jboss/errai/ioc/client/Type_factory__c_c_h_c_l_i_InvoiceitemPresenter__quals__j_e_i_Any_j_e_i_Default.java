package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter;
import com.cloderia.helion.client.shared.model.Invoiceitem;
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

public class Type_factory__c_c_h_c_l_i_InvoiceitemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceitemPresenter.class, "Type_factory__c_c_h_c_l_i_InvoiceitemPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_i_InvoiceitemPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoiceitemPresenter createInstance(final ContextManager contextManager) {
    final InvoiceitemPresenter instance = new InvoiceitemPresenter();
    setIncompleteInstance(instance);
    final DataBinder InvoiceitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceitemPresenter_binder);
    InvoiceitemPresenter_DataBinder_binder(instance, InvoiceitemPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceitemPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceitemPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final InvoiceitemPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder;
  }-*/;

  native static void InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance, DataBinder<Invoiceitem> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter;
import com.cloderia.helion.client.shared.model.Supplierproduct;
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

public class Type_factory__c_c_h_c_l_s_SupplierproductPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SupplierproductPresenter.class, "Type_factory__c_c_h_c_l_s_SupplierproductPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_s_SupplierproductPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SupplierproductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SupplierproductPresenter createInstance(final ContextManager contextManager) {
    final SupplierproductPresenter instance = new SupplierproductPresenter();
    setIncompleteInstance(instance);
    final DataBinder SupplierproductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Supplierproduct.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SupplierproductPresenter_binder);
    SupplierproductPresenter_DataBinder_binder(instance, SupplierproductPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SupplierproductPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final SupplierproductPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final SupplierproductPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder;
  }-*/;

  native static void SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance, DataBinder<Supplierproduct> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder = value;
  }-*/;
}
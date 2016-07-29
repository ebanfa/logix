package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.producttype.ProducttypePresenter;
import com.cloderia.helion.client.shared.model.Producttype;
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

public class Type_factory__c_c_h_c_l_p_ProducttypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProducttypePresenter.class, "Type_factory__c_c_h_c_l_p_ProducttypePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_ProducttypePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProducttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProducttypePresenter createInstance(final ContextManager contextManager) {
    final ProducttypePresenter instance = new ProducttypePresenter();
    setIncompleteInstance(instance);
    final DataBinder ProducttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Producttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProducttypePresenter_binder);
    ProducttypePresenter_DataBinder_binder(instance, ProducttypePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProducttypePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProducttypePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ProducttypePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder;
  }-*/;

  native static void ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance, DataBinder<Producttype> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder = value;
  }-*/;
}
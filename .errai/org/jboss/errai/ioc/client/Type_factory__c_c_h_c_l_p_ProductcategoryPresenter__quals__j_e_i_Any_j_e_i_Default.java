package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter;
import com.cloderia.helion.client.shared.model.Productcategory;
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

public class Type_factory__c_c_h_c_l_p_ProductcategoryPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductcategoryPresenter.class, "Type_factory__c_c_h_c_l_p_ProductcategoryPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_ProductcategoryPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductcategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductcategoryPresenter createInstance(final ContextManager contextManager) {
    final ProductcategoryPresenter instance = new ProductcategoryPresenter();
    setIncompleteInstance(instance);
    final DataBinder ProductcategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productcategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductcategoryPresenter_binder);
    ProductcategoryPresenter_DataBinder_binder(instance, ProductcategoryPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductcategoryPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductcategoryPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ProductcategoryPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder;
  }-*/;

  native static void ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance, DataBinder<Productcategory> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder = value;
  }-*/;
}
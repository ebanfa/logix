package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.product.ProductPresenter;
import com.cloderia.helion.client.shared.model.Product;
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

public class Type_factory__c_c_h_c_l_p_ProductPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductPresenter.class, "Type_factory__c_c_h_c_l_p_ProductPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_ProductPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductPresenter createInstance(final ContextManager contextManager) {
    final ProductPresenter instance = new ProductPresenter();
    setIncompleteInstance(instance);
    final DataBinder ProductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Product.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductPresenter_binder);
    ProductPresenter_DataBinder_binder(instance, ProductPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ProductPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder ProductPresenter_DataBinder_binder(ProductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder;
  }-*/;

  native static void ProductPresenter_DataBinder_binder(ProductPresenter instance, DataBinder<Product> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder = value;
  }-*/;
}
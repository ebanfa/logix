package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter;
import com.cloderia.helion.client.shared.model.Productfeature;
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

public class Type_factory__c_c_h_c_l_p_ProductfeaturePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeaturePresenter.class, "Type_factory__c_c_h_c_l_p_ProductfeaturePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_ProductfeaturePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeaturePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeaturePresenter createInstance(final ContextManager contextManager) {
    final ProductfeaturePresenter instance = new ProductfeaturePresenter();
    setIncompleteInstance(instance);
    final DataBinder ProductfeaturePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeature.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturePresenter_binder);
    ProductfeaturePresenter_DataBinder_binder(instance, ProductfeaturePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeaturePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeaturePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ProductfeaturePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder;
  }-*/;

  native static void ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance, DataBinder<Productfeature> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder = value;
  }-*/;
}
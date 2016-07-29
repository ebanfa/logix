package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter;
import com.cloderia.helion.client.shared.model.Productfeaturetype;
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

public class Type_factory__c_c_h_c_l_p_ProductfeaturetypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeaturetypePresenter.class, "Type_factory__c_c_h_c_l_p_ProductfeaturetypePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_ProductfeaturetypePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeaturetypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeaturetypePresenter createInstance(final ContextManager contextManager) {
    final ProductfeaturetypePresenter instance = new ProductfeaturetypePresenter();
    setIncompleteInstance(instance);
    final DataBinder ProductfeaturetypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeaturetype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturetypePresenter_binder);
    ProductfeaturetypePresenter_DataBinder_binder(instance, ProductfeaturetypePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeaturetypePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeaturetypePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ProductfeaturetypePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder;
  }-*/;

  native static void ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance, DataBinder<Productfeaturetype> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder = value;
  }-*/;
}
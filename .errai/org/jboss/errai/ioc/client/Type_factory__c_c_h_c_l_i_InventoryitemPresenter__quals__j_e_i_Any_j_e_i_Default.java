package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter;
import com.cloderia.helion.client.shared.model.Inventoryitem;
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

public class Type_factory__c_c_h_c_l_i_InventoryitemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InventoryitemPresenter.class, "Type_factory__c_c_h_c_l_i_InventoryitemPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_i_InventoryitemPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InventoryitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InventoryitemPresenter createInstance(final ContextManager contextManager) {
    final InventoryitemPresenter instance = new InventoryitemPresenter();
    setIncompleteInstance(instance);
    final DataBinder InventoryitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Inventoryitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InventoryitemPresenter_binder);
    InventoryitemPresenter_DataBinder_binder(instance, InventoryitemPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InventoryitemPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final InventoryitemPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final InventoryitemPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder;
  }-*/;

  native static void InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance, DataBinder<Inventoryitem> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder = value;
  }-*/;
}
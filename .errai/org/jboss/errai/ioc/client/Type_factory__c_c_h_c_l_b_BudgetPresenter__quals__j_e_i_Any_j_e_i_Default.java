package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budget.BudgetPresenter;
import com.cloderia.helion.client.shared.model.Budget;
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

public class Type_factory__c_c_h_c_l_b_BudgetPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetPresenter.class, "Type_factory__c_c_h_c_l_b_BudgetPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_b_BudgetPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetPresenter createInstance(final ContextManager contextManager) {
    final BudgetPresenter instance = new BudgetPresenter();
    setIncompleteInstance(instance);
    final DataBinder BudgetPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budget.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetPresenter_binder);
    BudgetPresenter_DataBinder_binder(instance, BudgetPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final BudgetPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder BudgetPresenter_DataBinder_binder(BudgetPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder;
  }-*/;

  native static void BudgetPresenter_DataBinder_binder(BudgetPresenter instance, DataBinder<Budget> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder = value;
  }-*/;
}
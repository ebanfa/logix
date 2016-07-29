package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter;
import com.cloderia.helion.client.shared.model.Budgetitem;
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

public class Type_factory__c_c_h_c_l_b_BudgetitemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetitemPresenter.class, "Type_factory__c_c_h_c_l_b_BudgetitemPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_b_BudgetitemPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetitemPresenter createInstance(final ContextManager contextManager) {
    final BudgetitemPresenter instance = new BudgetitemPresenter();
    setIncompleteInstance(instance);
    final DataBinder BudgetitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budgetitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetitemPresenter_binder);
    BudgetitemPresenter_DataBinder_binder(instance, BudgetitemPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetitemPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetitemPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final BudgetitemPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder;
  }-*/;

  native static void BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance, DataBinder<Budgetitem> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder = value;
  }-*/;
}
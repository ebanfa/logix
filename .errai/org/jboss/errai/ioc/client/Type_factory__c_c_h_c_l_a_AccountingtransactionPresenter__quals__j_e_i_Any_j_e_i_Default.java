package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter;
import com.cloderia.helion.client.shared.model.Accountingtransaction;
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

public class Type_factory__c_c_h_c_l_a_AccountingtransactionPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AccountingtransactionPresenter.class, "Type_factory__c_c_h_c_l_a_AccountingtransactionPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_a_AccountingtransactionPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AccountingtransactionPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AccountingtransactionPresenter createInstance(final ContextManager contextManager) {
    final AccountingtransactionPresenter instance = new AccountingtransactionPresenter();
    setIncompleteInstance(instance);
    final DataBinder AccountingtransactionPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Accountingtransaction.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AccountingtransactionPresenter_binder);
    AccountingtransactionPresenter_DataBinder_binder(instance, AccountingtransactionPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AccountingtransactionPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final AccountingtransactionPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final AccountingtransactionPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder;
  }-*/;

  native static void AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance, DataBinder<Accountingtransaction> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder = value;
  }-*/;
}
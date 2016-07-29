package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter;
import com.cloderia.helion.client.shared.model.Generalledgeraccount;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccountPresenter.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccountPresenter createInstance(final ContextManager contextManager) {
    final GeneralledgeraccountPresenter instance = new GeneralledgeraccountPresenter();
    setIncompleteInstance(instance);
    final DataBinder GeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccountPresenter_binder);
    GeneralledgeraccountPresenter_DataBinder_binder(instance, GeneralledgeraccountPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccountPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccountPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final GeneralledgeraccountPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder;
  }-*/;

  native static void GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance, DataBinder<Generalledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder = value;
  }-*/;
}
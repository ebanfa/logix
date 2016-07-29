package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccounttypePresenter.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccounttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccounttypePresenter createInstance(final ContextManager contextManager) {
    final GeneralledgeraccounttypePresenter instance = new GeneralledgeraccounttypePresenter();
    setIncompleteInstance(instance);
    final DataBinder GeneralledgeraccounttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccounttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccounttypePresenter_binder);
    GeneralledgeraccounttypePresenter_DataBinder_binder(instance, GeneralledgeraccounttypePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccounttypePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccounttypePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final GeneralledgeraccounttypePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder;
  }-*/;

  native static void GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance, DataBinder<Generalledgeraccounttype> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder = value;
  }-*/;
}
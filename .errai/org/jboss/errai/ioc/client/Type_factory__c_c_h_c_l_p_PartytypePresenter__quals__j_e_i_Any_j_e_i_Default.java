package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partytype.PartytypePresenter;
import com.cloderia.helion.client.shared.model.Partytype;
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

public class Type_factory__c_c_h_c_l_p_PartytypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartytypePresenter.class, "Type_factory__c_c_h_c_l_p_PartytypePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_PartytypePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartytypePresenter createInstance(final ContextManager contextManager) {
    final PartytypePresenter instance = new PartytypePresenter();
    setIncompleteInstance(instance);
    final DataBinder PartytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartytypePresenter_binder);
    PartytypePresenter_DataBinder_binder(instance, PartytypePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartytypePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartytypePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final PartytypePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PartytypePresenter_DataBinder_binder(PartytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder;
  }-*/;

  native static void PartytypePresenter_DataBinder_binder(PartytypePresenter instance, DataBinder<Partytype> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder = value;
  }-*/;
}
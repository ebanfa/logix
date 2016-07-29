package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter;
import com.cloderia.helion.client.shared.model.Partyroletype;
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

public class Type_factory__c_c_h_c_l_p_PartyroletypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroletypePresenter.class, "Type_factory__c_c_h_c_l_p_PartyroletypePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_PartyroletypePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroletypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyroletypePresenter createInstance(final ContextManager contextManager) {
    final PartyroletypePresenter instance = new PartyroletypePresenter();
    setIncompleteInstance(instance);
    final DataBinder PartyroletypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyroletype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroletypePresenter_binder);
    PartyroletypePresenter_DataBinder_binder(instance, PartyroletypePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroletypePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroletypePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final PartyroletypePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder;
  }-*/;

  native static void PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance, DataBinder<Partyroletype> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder = value;
  }-*/;
}
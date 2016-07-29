package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.party.PartyPresenter;
import com.cloderia.helion.client.shared.model.Party;
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

public class Type_factory__c_c_h_c_l_p_PartyPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyPresenter.class, "Type_factory__c_c_h_c_l_p_PartyPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_PartyPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyPresenter createInstance(final ContextManager contextManager) {
    final PartyPresenter instance = new PartyPresenter();
    setIncompleteInstance(instance);
    final DataBinder PartyPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Party.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyPresenter_binder);
    PartyPresenter_DataBinder_binder(instance, PartyPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final PartyPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PartyPresenter_DataBinder_binder(PartyPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder;
  }-*/;

  native static void PartyPresenter_DataBinder_binder(PartyPresenter instance, DataBinder<Party> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder = value;
  }-*/;
}
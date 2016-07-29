package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.agreement.AgreementPresenter;
import com.cloderia.helion.client.shared.model.Agreement;
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

public class Type_factory__c_c_h_c_l_a_AgreementPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AgreementPresenter.class, "Type_factory__c_c_h_c_l_a_AgreementPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_a_AgreementPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AgreementPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AgreementPresenter createInstance(final ContextManager contextManager) {
    final AgreementPresenter instance = new AgreementPresenter();
    setIncompleteInstance(instance);
    final DataBinder AgreementPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Agreement.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AgreementPresenter_binder);
    AgreementPresenter_DataBinder_binder(instance, AgreementPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AgreementPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final AgreementPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final AgreementPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder AgreementPresenter_DataBinder_binder(AgreementPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder;
  }-*/;

  native static void AgreementPresenter_DataBinder_binder(AgreementPresenter instance, DataBinder<Agreement> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facility.FacilityPresenter;
import com.cloderia.helion.client.shared.model.Facility;
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

public class Type_factory__c_c_h_c_l_f_FacilityPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilityPresenter.class, "Type_factory__c_c_h_c_l_f_FacilityPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_f_FacilityPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilityPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilityPresenter createInstance(final ContextManager contextManager) {
    final FacilityPresenter instance = new FacilityPresenter();
    setIncompleteInstance(instance);
    final DataBinder FacilityPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facility.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilityPresenter_binder);
    FacilityPresenter_DataBinder_binder(instance, FacilityPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilityPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilityPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final FacilityPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder FacilityPresenter_DataBinder_binder(FacilityPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder;
  }-*/;

  native static void FacilityPresenter_DataBinder_binder(FacilityPresenter instance, DataBinder<Facility> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder = value;
  }-*/;
}
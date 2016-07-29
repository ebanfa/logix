package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter;
import com.cloderia.helion.client.shared.model.Facilitytype;
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

public class Type_factory__c_c_h_c_l_f_FacilitytypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypePresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilitytypePresenter.class, "Type_factory__c_c_h_c_l_f_FacilitytypePresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_f_FacilitytypePresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilitytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilitytypePresenter createInstance(final ContextManager contextManager) {
    final FacilitytypePresenter instance = new FacilitytypePresenter();
    setIncompleteInstance(instance);
    final DataBinder FacilitytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facilitytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilitytypePresenter_binder);
    FacilitytypePresenter_DataBinder_binder(instance, FacilitytypePresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilitytypePresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilitytypePresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final FacilitytypePresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder;
  }-*/;

  native static void FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance, DataBinder<Facilitytype> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder = value;
  }-*/;
}
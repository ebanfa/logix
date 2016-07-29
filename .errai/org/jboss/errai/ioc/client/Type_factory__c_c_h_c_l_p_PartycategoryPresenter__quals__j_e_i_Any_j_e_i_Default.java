package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partycategory.PartycategoryPresenter;
import com.cloderia.helion.client.shared.model.Partycategory;
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

public class Type_factory__c_c_h_c_l_p_PartycategoryPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartycategoryPresenter.class, "Type_factory__c_c_h_c_l_p_PartycategoryPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_PartycategoryPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartycategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartycategoryPresenter createInstance(final ContextManager contextManager) {
    final PartycategoryPresenter instance = new PartycategoryPresenter();
    setIncompleteInstance(instance);
    final DataBinder PartycategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partycategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartycategoryPresenter_binder);
    PartycategoryPresenter_DataBinder_binder(instance, PartycategoryPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartycategoryPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartycategoryPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final PartycategoryPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder;
  }-*/;

  native static void PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance, DataBinder<Partycategory> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.person.PersonPresenter;
import com.cloderia.helion.client.shared.model.Person;
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

public class Type_factory__c_c_h_c_l_p_PersonPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonPresenter> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PersonPresenter.class, "Type_factory__c_c_h_c_l_p_PersonPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__c_c_h_c_l_p_PersonPresenter__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PersonPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PersonPresenter createInstance(final ContextManager contextManager) {
    final PersonPresenter instance = new PersonPresenter();
    setIncompleteInstance(instance);
    final DataBinder PersonPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Person.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PersonPresenter_binder);
    PersonPresenter_DataBinder_binder(instance, PersonPresenter_binder);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PersonPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final PersonPresenter instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final PersonPresenter instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PersonPresenter_DataBinder_binder(PersonPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder;
  }-*/;

  native static void PersonPresenter_DataBinder_binder(PersonPresenter instance, DataBinder<Person> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder = value;
  }-*/;
}
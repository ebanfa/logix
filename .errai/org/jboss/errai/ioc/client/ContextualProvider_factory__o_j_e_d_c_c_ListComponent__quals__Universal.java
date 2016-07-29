package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.TakesValue;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.databinding.client.api.handler.list.BindableListChangeHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemAddedAtHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemAddedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemChangedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemRemovedAtHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsAddedAtHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsAddedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsClearedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsRemovedAtHandler;
import org.jboss.errai.databinding.client.components.ListComponent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal extends Factory<ListComponent> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListComponent.class, "ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal() {
    handle.addAssignableType(ListComponent.class);
    handle.addAssignableType(IsElement.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(BindableListChangeHandler.class);
    handle.addAssignableType(ItemAddedHandler.class);
    handle.addAssignableType(ItemAddedAtHandler.class);
    handle.addAssignableType(ItemsAddedHandler.class);
    handle.addAssignableType(ItemsAddedAtHandler.class);
    handle.addAssignableType(ItemRemovedAtHandler.class);
    handle.addAssignableType(ItemsRemovedAtHandler.class);
    handle.addAssignableType(ItemsClearedHandler.class);
    handle.addAssignableType(ItemChangedHandler.class);
  }

  public void init(final Context context) {

  }

  public ListComponent createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<ListComponent> provider = (ContextualTypeProvider<ListComponent>) contextManager.getInstance("Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default");
    final ListComponent instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListComponent) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListComponent instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ListComponent instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
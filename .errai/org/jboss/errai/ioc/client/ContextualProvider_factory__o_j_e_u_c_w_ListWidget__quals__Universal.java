package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.databinding.client.api.handler.list.BindableListChangeHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemAddedAtHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemAddedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemChangedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemRemovedAtHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsAddedAtHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsAddedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsClearedHandler;
import org.jboss.errai.databinding.client.api.handler.list.ItemsRemovedAtHandler;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.client.widget.ListWidget;

public class ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal extends Factory<ListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListWidget.class, "ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal() {
    handle.addAssignableType(ListWidget.class);
    handle.addAssignableType(Composite.class);
    handle.addAssignableType(Widget.class);
    handle.addAssignableType(UIObject.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(HasVisibility.class);
    handle.addAssignableType(EventListener.class);
    handle.addAssignableType(HasAttachHandlers.class);
    handle.addAssignableType(HasHandlers.class);
    handle.addAssignableType(IsWidget.class);
    handle.addAssignableType(IsRenderable.class);
    handle.addAssignableType(HasValue.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(HasValueChangeHandlers.class);
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

  public ListWidget createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<ListWidget> provider = (ContextualTypeProvider<ListWidget>) contextManager.getInstance("Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default");
    final ListWidget instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListWidget instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
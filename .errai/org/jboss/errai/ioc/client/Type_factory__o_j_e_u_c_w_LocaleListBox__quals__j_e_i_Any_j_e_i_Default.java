package org.jboss.errai.ioc.client;

import com.google.gwt.editor.client.IsEditor;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasConstrainedValue;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.api.extension.InitVotes;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.client.widget.LocaleListBox;
import org.jboss.errai.ui.client.widget.LocaleSelector;

public class Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleListBox> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(LocaleListBox.class, "Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(LocaleListBox.class);
    handle.addAssignableType(ValueListBox.class);
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
    handle.addAssignableType(Focusable.class);
    handle.addAssignableType(HasConstrainedValue.class);
    handle.addAssignableType(HasValue.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(HasValueChangeHandlers.class);
    handle.addAssignableType(HasEnabled.class);
    handle.addAssignableType(IsEditor.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public LocaleListBox createInstance(final ContextManager contextManager) {
    final LocaleListBox instance = new LocaleListBox();
    setIncompleteInstance(instance);
    final LocaleSelector LocaleListBox_selector = (LocaleSelector) contextManager.getInstance("Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default");
    LocaleListBox_LocaleSelector_selector(instance, LocaleListBox_selector);
    InitVotes.registerOneTimeInitCallback(new Runnable() {
      public void run() {
        instance.init();
      }
    });
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((LocaleListBox) instance, contextManager);
  }

  public void destroyInstanceHelper(final LocaleListBox instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final LocaleListBox instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static LocaleSelector LocaleListBox_LocaleSelector_selector(LocaleListBox instance) /*-{
    return instance.@org.jboss.errai.ui.client.widget.LocaleListBox::selector;
  }-*/;

  native static void LocaleListBox_LocaleSelector_selector(LocaleListBox instance, LocaleSelector value) /*-{
    instance.@org.jboss.errai.ui.client.widget.LocaleListBox::selector = value;
  }-*/;
}
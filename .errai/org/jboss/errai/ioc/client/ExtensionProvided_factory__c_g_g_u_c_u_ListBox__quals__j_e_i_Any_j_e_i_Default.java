package org.jboss.errai.ioc.client;

import com.google.gwt.event.dom.client.HasAllDragAndDropHandlers;
import com.google.gwt.event.dom.client.HasAllFocusHandlers;
import com.google.gwt.event.dom.client.HasAllGestureHandlers;
import com.google.gwt.event.dom.client.HasAllKeyHandlers;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.HasAllTouchHandlers;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDoubleClickHandlers;
import com.google.gwt.event.dom.client.HasDragEndHandlers;
import com.google.gwt.event.dom.client.HasDragEnterHandlers;
import com.google.gwt.event.dom.client.HasDragHandlers;
import com.google.gwt.event.dom.client.HasDragLeaveHandlers;
import com.google.gwt.event.dom.client.HasDragOverHandlers;
import com.google.gwt.event.dom.client.HasDragStartHandlers;
import com.google.gwt.event.dom.client.HasDropHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;
import com.google.gwt.event.dom.client.HasGestureChangeHandlers;
import com.google.gwt.event.dom.client.HasGestureEndHandlers;
import com.google.gwt.event.dom.client.HasGestureStartHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseMoveHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.HasMouseWheelHandlers;
import com.google.gwt.event.dom.client.HasTouchCancelHandlers;
import com.google.gwt.event.dom.client.HasTouchEndHandlers;
import com.google.gwt.event.dom.client.HasTouchMoveHandlers;
import com.google.gwt.event.dom.client.HasTouchStartHandlers;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.i18n.shared.HasDirectionEstimator;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasFocus;
import com.google.gwt.user.client.ui.HasName;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SourcesChangeEvents;
import com.google.gwt.user.client.ui.SourcesClickEvents;
import com.google.gwt.user.client.ui.SourcesFocusEvents;
import com.google.gwt.user.client.ui.SourcesKeyboardEvents;
import com.google.gwt.user.client.ui.SourcesMouseEvents;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;

public class ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBox> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListBox.class, "ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListBox.class);
    handle.addAssignableType(FocusWidget.class);
    handle.addAssignableType(Widget.class);
    handle.addAssignableType(UIObject.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(HasVisibility.class);
    handle.addAssignableType(EventListener.class);
    handle.addAssignableType(HasAttachHandlers.class);
    handle.addAssignableType(HasHandlers.class);
    handle.addAssignableType(IsWidget.class);
    handle.addAssignableType(SourcesClickEvents.class);
    handle.addAssignableType(HasClickHandlers.class);
    handle.addAssignableType(HasDoubleClickHandlers.class);
    handle.addAssignableType(HasFocus.class);
    handle.addAssignableType(Focusable.class);
    handle.addAssignableType(SourcesFocusEvents.class);
    handle.addAssignableType(SourcesKeyboardEvents.class);
    handle.addAssignableType(HasEnabled.class);
    handle.addAssignableType(HasAllDragAndDropHandlers.class);
    handle.addAssignableType(HasDragEndHandlers.class);
    handle.addAssignableType(HasDragEnterHandlers.class);
    handle.addAssignableType(HasDragLeaveHandlers.class);
    handle.addAssignableType(HasDragHandlers.class);
    handle.addAssignableType(HasDragOverHandlers.class);
    handle.addAssignableType(HasDragStartHandlers.class);
    handle.addAssignableType(HasDropHandlers.class);
    handle.addAssignableType(HasAllFocusHandlers.class);
    handle.addAssignableType(HasFocusHandlers.class);
    handle.addAssignableType(HasBlurHandlers.class);
    handle.addAssignableType(HasAllGestureHandlers.class);
    handle.addAssignableType(HasGestureStartHandlers.class);
    handle.addAssignableType(HasGestureChangeHandlers.class);
    handle.addAssignableType(HasGestureEndHandlers.class);
    handle.addAssignableType(HasAllKeyHandlers.class);
    handle.addAssignableType(HasKeyUpHandlers.class);
    handle.addAssignableType(HasKeyDownHandlers.class);
    handle.addAssignableType(HasKeyPressHandlers.class);
    handle.addAssignableType(HasAllMouseHandlers.class);
    handle.addAssignableType(HasMouseDownHandlers.class);
    handle.addAssignableType(HasMouseUpHandlers.class);
    handle.addAssignableType(HasMouseOutHandlers.class);
    handle.addAssignableType(HasMouseOverHandlers.class);
    handle.addAssignableType(HasMouseMoveHandlers.class);
    handle.addAssignableType(HasMouseWheelHandlers.class);
    handle.addAssignableType(HasAllTouchHandlers.class);
    handle.addAssignableType(HasTouchStartHandlers.class);
    handle.addAssignableType(HasTouchMoveHandlers.class);
    handle.addAssignableType(HasTouchEndHandlers.class);
    handle.addAssignableType(HasTouchCancelHandlers.class);
    handle.addAssignableType(SourcesMouseEvents.class);
    handle.addAssignableType(SourcesChangeEvents.class);
    handle.addAssignableType(HasChangeHandlers.class);
    handle.addAssignableType(HasName.class);
    handle.addAssignableType(HasDirectionEstimator.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ListBox createInstance(final ContextManager contextManager) {
    return new ListBox();
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListBox) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListBox instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final ListBox instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
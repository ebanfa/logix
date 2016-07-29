package org.jboss.errai.ioc.client;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasAllDragAndDropHandlers;
import com.google.gwt.event.dom.client.HasAllFocusHandlers;
import com.google.gwt.event.dom.client.HasAllGestureHandlers;
import com.google.gwt.event.dom.client.HasAllKeyHandlers;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.HasAllTouchHandlers;
import com.google.gwt.event.dom.client.HasBlurHandlers;
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
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.i18n.client.HasDirection;
import com.google.gwt.i18n.shared.HasDirectionEstimator;
import com.google.gwt.safehtml.client.HasSafeHtml;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasDirectionalSafeHtml;
import com.google.gwt.user.client.ui.HasDirectionalText;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasFocus;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasName;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWordWrap;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SourcesClickEvents;
import com.google.gwt.user.client.ui.SourcesFocusEvents;
import com.google.gwt.user.client.ui.SourcesKeyboardEvents;
import com.google.gwt.user.client.ui.SourcesMouseEvents;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;

public class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal extends Factory<TransitionAnchor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(TransitionAnchor.class, "ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal", Dependent.class, false, null, false);
  public ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal() {
    handle.addAssignableType(TransitionAnchor.class);
    handle.addAssignableType(Anchor.class);
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
    handle.addAssignableType(HasHorizontalAlignment.class);
    handle.addAssignableType(HasName.class);
    handle.addAssignableType(HasHTML.class);
    handle.addAssignableType(HasText.class);
    handle.addAssignableType(HasWordWrap.class);
    handle.addAssignableType(HasDirection.class);
    handle.addAssignableType(HasDirectionEstimator.class);
    handle.addAssignableType(HasDirectionalSafeHtml.class);
    handle.addAssignableType(HasDirectionalText.class);
    handle.addAssignableType(HasSafeHtml.class);
    handle.addAssignableType(ClickHandler.class);
    handle.addAssignableType(EventHandler.class);
  }

  public void init(final Context context) {

  }

  public TransitionAnchor createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<TransitionAnchor> provider = (ContextualTypeProvider<TransitionAnchor>) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default");
    final TransitionAnchor instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((TransitionAnchor) instance, contextManager);
  }

  public void destroyInstanceHelper(final TransitionAnchor instance, final ContextManager contextManager) {

  }

  public void invokePostConstructs(final TransitionAnchor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
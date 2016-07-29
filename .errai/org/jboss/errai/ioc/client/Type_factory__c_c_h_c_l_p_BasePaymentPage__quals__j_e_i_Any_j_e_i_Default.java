package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.payment.BasePaymentPage;
import com.cloderia.helion.client.local.payment.CreatePaymentPage;
import com.cloderia.helion.client.local.payment.EditPaymentPage;
import com.cloderia.helion.client.local.payment.ListPaymentPage;
import com.cloderia.helion.client.local.payment.PaymentDisplay;
import com.cloderia.helion.client.local.payment.PaymentEditor;
import com.cloderia.helion.client.local.payment.PaymentListItemDisplay;
import com.cloderia.helion.client.local.payment.ViewPaymentPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymentEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymentmethodtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymenttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.PaymentOperation;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_p_BasePaymentPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePaymentPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BasePaymentPage.class, "Type_factory__c_c_h_c_l_p_BasePaymentPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_BasePaymentPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/payment/edit-payment-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_BasePaymentPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BasePaymentPage.class);
    handle.addAssignableType(BasePortalPage.class);
    handle.addAssignableType(BasePage.class);
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
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BasePaymentPage createInstance(final ContextManager contextManager) {
    final BasePaymentPage instance = new BasePaymentPage();
    setIncompleteInstance(instance);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BasePaymentPage_paymenttypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PaymenttypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_paymenttypeService);
    BasePaymentPage_Caller_paymenttypeService(instance, BasePaymentPage_paymenttypeService);
    final Caller BasePaymentPage_paymentmethodtypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PaymentmethodtypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_paymentmethodtypeService);
    BasePaymentPage_Caller_paymentmethodtypeService(instance, BasePaymentPage_paymentmethodtypeService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BasePaymentPage_listPaymentsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPaymentPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_listPaymentsPage);
    BasePaymentPage_TransitionTo_listPaymentsPage(instance, BasePaymentPage_listPaymentsPage);
    final Caller BasePaymentPage_paymentService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PaymentEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_paymentService);
    BasePaymentPage_Caller_paymentService(instance, BasePaymentPage_paymentService);
    final Caller BasePaymentPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_universeService);
    BasePaymentPage_Caller_universeService(instance, BasePaymentPage_universeService);
    final Caller BasePaymentPage_financialaccountService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { FinancialaccountEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_financialaccountService);
    BasePaymentPage_Caller_financialaccountService(instance, BasePaymentPage_financialaccountService);
    final TransitionTo BasePaymentPage_viewPaymentPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewPaymentPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_viewPaymentPage);
    BasePaymentPage_TransitionTo_viewPaymentPage(instance, BasePaymentPage_viewPaymentPage);
    final TransitionTo BasePaymentPage_createPaymentPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreatePaymentPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_createPaymentPage);
    BasePaymentPage_TransitionTo_createPaymentPage(instance, BasePaymentPage_createPaymentPage);
    final Heading BasePaymentPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BasePaymentPage_viewTitle);
    BasePaymentPage_Heading_viewTitle(instance, BasePaymentPage_viewTitle);
    final TransitionTo BasePaymentPage_editPaymentPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditPaymentPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePaymentPage_editPaymentPage);
    BasePaymentPage_TransitionTo_editPaymentPage(instance, BasePaymentPage_editPaymentPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PaymentOperation", new AbstractCDIEventCallback<PaymentOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final PaymentOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PaymentOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForPaymentOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PaymentOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PaymentOperation", new AbstractCDIEventCallback<PaymentOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final PaymentOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PaymentOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForPaymentOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PaymentOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PaymentOperation", new AbstractCDIEventCallback<PaymentOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final PaymentOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PaymentOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForPaymentOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PaymentOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentDisplay", new AbstractCDIEventCallback<PaymentDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PaymentDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", new AbstractCDIEventCallback<PaymentListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final PaymentListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", new AbstractCDIEventCallback<PaymentListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final PaymentListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", new AbstractCDIEventCallback<PaymentListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PaymentListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentEditor", new AbstractCDIEventCallback<PaymentEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final PaymentEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentEditor", new AbstractCDIEventCallback<PaymentEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final PaymentEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentDisplay", new AbstractCDIEventCallback<PaymentDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PaymentDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", new AbstractCDIEventCallback<PaymentListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PaymentListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.payment.PaymentListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_BasePaymentPageTemplateResource templateForBasePaymentPage = GWT.create(c_c_h_c_l_p_BasePaymentPageTemplateResource.class);
    Element parentElementForTemplateOfBasePaymentPage = TemplateUtil.getRootTemplateParentElement(templateForBasePaymentPage.getContents().getText(), "com/cloderia/helion/client/local/payment/edit-payment-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/payment/edit-payment-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBasePaymentPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBasePaymentPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.BasePaymentPage", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.BasePaymentPage", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.BasePaymentPage", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePaymentPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.BasePaymentPage", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BasePaymentPage_AnchorElement_listPaymentsPageLink(instance));
      }
    }, dataFieldElements, "listPaymentsPageLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePaymentPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listPaymentsPageLink", ElementWrapperWidget.getWidget(BasePaymentPage_AnchorElement_listPaymentsPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBasePaymentPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPaymentsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BasePaymentPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final BasePaymentPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForPaymentOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForPaymentOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForPaymentOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BasePaymentPage_AnchorElement_listPaymentsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final BasePaymentPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BasePaymentPage_TransitionTo_editPaymentPage(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::editPaymentPage;
  }-*/;

  native static void BasePaymentPage_TransitionTo_editPaymentPage(BasePaymentPage instance, TransitionTo<EditPaymentPage> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::editPaymentPage = value;
  }-*/;

  native static Caller BasePaymentPage_Caller_universeService(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::universeService;
  }-*/;

  native static void BasePaymentPage_Caller_universeService(BasePaymentPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::universeService = value;
  }-*/;

  native static AnchorElement BasePaymentPage_AnchorElement_listPaymentsPageLink(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::listPaymentsPageLink;
  }-*/;

  native static void BasePaymentPage_AnchorElement_listPaymentsPageLink(BasePaymentPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::listPaymentsPageLink = value;
  }-*/;

  native static Caller BasePaymentPage_Caller_paymentmethodtypeService(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::paymentmethodtypeService;
  }-*/;

  native static void BasePaymentPage_Caller_paymentmethodtypeService(BasePaymentPage instance, Caller<PaymentmethodtypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::paymentmethodtypeService = value;
  }-*/;

  native static TransitionTo BasePaymentPage_TransitionTo_createPaymentPage(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::createPaymentPage;
  }-*/;

  native static void BasePaymentPage_TransitionTo_createPaymentPage(BasePaymentPage instance, TransitionTo<CreatePaymentPage> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::createPaymentPage = value;
  }-*/;

  native static Heading BasePaymentPage_Heading_viewTitle(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::viewTitle;
  }-*/;

  native static void BasePaymentPage_Heading_viewTitle(BasePaymentPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::viewTitle = value;
  }-*/;

  native static Caller BasePaymentPage_Caller_financialaccountService(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::financialaccountService;
  }-*/;

  native static void BasePaymentPage_Caller_financialaccountService(BasePaymentPage instance, Caller<FinancialaccountEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::financialaccountService = value;
  }-*/;

  native static Caller BasePaymentPage_Caller_paymenttypeService(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::paymenttypeService;
  }-*/;

  native static void BasePaymentPage_Caller_paymenttypeService(BasePaymentPage instance, Caller<PaymenttypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::paymenttypeService = value;
  }-*/;

  native static Caller BasePaymentPage_Caller_paymentService(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::paymentService;
  }-*/;

  native static void BasePaymentPage_Caller_paymentService(BasePaymentPage instance, Caller<PaymentEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::paymentService = value;
  }-*/;

  native static TransitionTo BasePaymentPage_TransitionTo_viewPaymentPage(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::viewPaymentPage;
  }-*/;

  native static void BasePaymentPage_TransitionTo_viewPaymentPage(BasePaymentPage instance, TransitionTo<ViewPaymentPage> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::viewPaymentPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BasePaymentPage_TransitionTo_listPaymentsPage(BasePaymentPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::listPaymentsPage;
  }-*/;

  native static void BasePaymentPage_TransitionTo_listPaymentsPage(BasePaymentPage instance, TransitionTo<ListPaymentPage> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.BasePaymentPage::listPaymentsPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;
}
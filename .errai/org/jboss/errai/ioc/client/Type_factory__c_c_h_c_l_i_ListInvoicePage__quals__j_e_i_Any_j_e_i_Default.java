package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoice.BaseInvoicePage;
import com.cloderia.helion.client.local.invoice.CreateInvoicePage;
import com.cloderia.helion.client.local.invoice.EditInvoicePage;
import com.cloderia.helion.client.local.invoice.InvoiceDisplay;
import com.cloderia.helion.client.local.invoice.InvoiceEditor;
import com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay;
import com.cloderia.helion.client.local.invoice.InvoiceListWidget;
import com.cloderia.helion.client.local.invoice.ListInvoicePage;
import com.cloderia.helion.client.local.invoice.ViewInvoicePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.BillingaccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;
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

public class Type_factory__c_c_h_c_l_i_ListInvoicePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInvoicePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListInvoicePage.class, "Type_factory__c_c_h_c_l_i_ListInvoicePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_ListInvoicePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoice/list-invoice-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_ListInvoicePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListInvoicePage.class);
    handle.addAssignableType(BaseInvoicePage.class);
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

  public ListInvoicePage createInstance(final ContextManager contextManager) {
    final ListInvoicePage instance = new ListInvoicePage();
    setIncompleteInstance(instance);
    final InvoiceListWidget ListInvoicePage_listWidget = (InvoiceListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_i_InvoiceListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListInvoicePage_listWidget);
    ListInvoicePage_InvoiceListWidget_listWidget(instance, ListInvoicePage_listWidget);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Caller BaseInvoicePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_universeService);
    BaseInvoicePage_Caller_universeService(instance, BaseInvoicePage_universeService);
    final Caller BaseInvoicePage_invoiceService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoiceEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_invoiceService);
    BaseInvoicePage_Caller_invoiceService(instance, BaseInvoicePage_invoiceService);
    final Caller BaseInvoicePage_billingaccountService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { BillingaccountEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_billingaccountService);
    BaseInvoicePage_Caller_billingaccountService(instance, BaseInvoicePage_billingaccountService);
    final TransitionTo BaseInvoicePage_viewInvoicePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewInvoicePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_viewInvoicePage);
    BaseInvoicePage_TransitionTo_viewInvoicePage(instance, BaseInvoicePage_viewInvoicePage);
    final Heading BaseInvoicePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseInvoicePage_viewTitle);
    BaseInvoicePage_Heading_viewTitle(instance, BaseInvoicePage_viewTitle);
    final Caller BaseInvoicePage_contactmechanismService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ContactmechanismEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_contactmechanismService);
    BaseInvoicePage_Caller_contactmechanismService(instance, BaseInvoicePage_contactmechanismService);
    final TransitionTo BaseInvoicePage_createInvoicePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateInvoicePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_createInvoicePage);
    BaseInvoicePage_TransitionTo_createInvoicePage(instance, BaseInvoicePage_createInvoicePage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseInvoicePage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_partyService);
    BaseInvoicePage_Caller_partyService(instance, BaseInvoicePage_partyService);
    final TransitionTo BaseInvoicePage_editInvoicePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditInvoicePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_editInvoicePage);
    BaseInvoicePage_TransitionTo_editInvoicePage(instance, BaseInvoicePage_editInvoicePage);
    final TransitionTo BaseInvoicePage_listInvoicesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoicePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicePage_listInvoicesPage);
    BaseInvoicePage_TransitionTo_listInvoicesPage(instance, BaseInvoicePage_listInvoicesPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoiceOperation", new AbstractCDIEventCallback<InvoiceOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final InvoiceOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoiceOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForInvoiceOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoiceOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoiceOperation", new AbstractCDIEventCallback<InvoiceOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final InvoiceOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoiceOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForInvoiceOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoiceOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoiceOperation", new AbstractCDIEventCallback<InvoiceOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final InvoiceOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoiceOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForInvoiceOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoiceOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceDisplay", new AbstractCDIEventCallback<InvoiceDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InvoiceDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", new AbstractCDIEventCallback<InvoiceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final InvoiceListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", new AbstractCDIEventCallback<InvoiceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final InvoiceListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", new AbstractCDIEventCallback<InvoiceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InvoiceListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceEditor", new AbstractCDIEventCallback<InvoiceEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final InvoiceEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceEditor", new AbstractCDIEventCallback<InvoiceEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final InvoiceEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceDisplay", new AbstractCDIEventCallback<InvoiceDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InvoiceDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", new AbstractCDIEventCallback<InvoiceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InvoiceListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_i_ListInvoicePageTemplateResource templateForListInvoicePage = GWT.create(c_c_h_c_l_i_ListInvoicePageTemplateResource.class);
    Element parentElementForTemplateOfListInvoicePage = TemplateUtil.getRootTemplateParentElement(templateForListInvoicePage.getContents().getText(), "com/cloderia/helion/client/local/invoice/list-invoice-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoice/list-invoice-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoicePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoicePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.ListInvoicePage", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.ListInvoicePage", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.ListInvoicePage", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInvoicePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.ListInvoicePage", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseInvoicePage_AnchorElement_listInvoicesPageLink(instance));
      }
    }, dataFieldElements, "listInvoicesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.ListInvoicePage", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListInvoicePage_InvoiceListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.ListInvoicePage", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListInvoicePage_AnchorElement_createNewInvoiceLink(instance));
      }
    }, dataFieldElements, "createNewInvoiceLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInvoicePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listInvoicesPageLink", ElementWrapperWidget.getWidget(BaseInvoicePage_AnchorElement_listInvoicesPageLink(instance)));
    templateFieldsMap.put("listWidget", ListInvoicePage_InvoiceListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewInvoiceLink", ElementWrapperWidget.getWidget(ListInvoicePage_AnchorElement_createNewInvoiceLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoicePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewInvoiceLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoicesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListInvoicePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListInvoicePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForInvoiceOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForInvoiceOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForInvoiceOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseInvoicePage_AnchorElement_listInvoicesPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListInvoicePage_AnchorElement_createNewInvoiceLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListInvoicePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BaseInvoicePage_Caller_billingaccountService(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::billingaccountService;
  }-*/;

  native static void BaseInvoicePage_Caller_billingaccountService(BaseInvoicePage instance, Caller<BillingaccountEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::billingaccountService = value;
  }-*/;

  native static InvoiceListWidget ListInvoicePage_InvoiceListWidget_listWidget(ListInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.ListInvoicePage::listWidget;
  }-*/;

  native static void ListInvoicePage_InvoiceListWidget_listWidget(ListInvoicePage instance, InvoiceListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.ListInvoicePage::listWidget = value;
  }-*/;

  native static TransitionTo BaseInvoicePage_TransitionTo_editInvoicePage(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::editInvoicePage;
  }-*/;

  native static void BaseInvoicePage_TransitionTo_editInvoicePage(BaseInvoicePage instance, TransitionTo<EditInvoicePage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::editInvoicePage = value;
  }-*/;

  native static TransitionTo BaseInvoicePage_TransitionTo_listInvoicesPage(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::listInvoicesPage;
  }-*/;

  native static void BaseInvoicePage_TransitionTo_listInvoicesPage(BaseInvoicePage instance, TransitionTo<ListInvoicePage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::listInvoicesPage = value;
  }-*/;

  native static Heading BaseInvoicePage_Heading_viewTitle(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::viewTitle;
  }-*/;

  native static void BaseInvoicePage_Heading_viewTitle(BaseInvoicePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::viewTitle = value;
  }-*/;

  native static Caller BaseInvoicePage_Caller_contactmechanismService(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::contactmechanismService;
  }-*/;

  native static void BaseInvoicePage_Caller_contactmechanismService(BaseInvoicePage instance, Caller<ContactmechanismEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::contactmechanismService = value;
  }-*/;

  native static Caller BaseInvoicePage_Caller_invoiceService(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::invoiceService;
  }-*/;

  native static void BaseInvoicePage_Caller_invoiceService(BaseInvoicePage instance, Caller<InvoiceEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::invoiceService = value;
  }-*/;

  native static TransitionTo BaseInvoicePage_TransitionTo_createInvoicePage(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::createInvoicePage;
  }-*/;

  native static void BaseInvoicePage_TransitionTo_createInvoicePage(BaseInvoicePage instance, TransitionTo<CreateInvoicePage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::createInvoicePage = value;
  }-*/;

  native static AnchorElement BaseInvoicePage_AnchorElement_listInvoicesPageLink(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::listInvoicesPageLink;
  }-*/;

  native static void BaseInvoicePage_AnchorElement_listInvoicesPageLink(BaseInvoicePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::listInvoicesPageLink = value;
  }-*/;

  native static Caller BaseInvoicePage_Caller_universeService(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::universeService;
  }-*/;

  native static void BaseInvoicePage_Caller_universeService(BaseInvoicePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::universeService = value;
  }-*/;

  native static TransitionTo BaseInvoicePage_TransitionTo_viewInvoicePage(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::viewInvoicePage;
  }-*/;

  native static void BaseInvoicePage_TransitionTo_viewInvoicePage(BaseInvoicePage instance, TransitionTo<ViewInvoicePage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::viewInvoicePage = value;
  }-*/;

  native static AnchorElement ListInvoicePage_AnchorElement_createNewInvoiceLink(ListInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.ListInvoicePage::createNewInvoiceLink;
  }-*/;

  native static void ListInvoicePage_AnchorElement_createNewInvoiceLink(ListInvoicePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.ListInvoicePage::createNewInvoiceLink = value;
  }-*/;

  native static Caller BaseInvoicePage_Caller_partyService(BaseInvoicePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::partyService;
  }-*/;

  native static void BaseInvoicePage_Caller_partyService(BaseInvoicePage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.BaseInvoicePage::partyService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;
}
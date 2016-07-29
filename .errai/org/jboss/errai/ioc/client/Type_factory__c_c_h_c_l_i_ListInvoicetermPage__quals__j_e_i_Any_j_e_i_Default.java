package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.CreateInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.EditInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget;
import com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.ViewInvoicetermPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoicetermEndPoint;
import com.cloderia.helion.client.shared.endpoint.TermtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;
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

public class Type_factory__c_c_h_c_l_i_ListInvoicetermPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInvoicetermPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListInvoicetermPage.class, "Type_factory__c_c_h_c_l_i_ListInvoicetermPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_ListInvoicetermPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_ListInvoicetermPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListInvoicetermPage.class);
    handle.addAssignableType(BaseInvoicetermPage.class);
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

  public ListInvoicetermPage createInstance(final ContextManager contextManager) {
    final ListInvoicetermPage instance = new ListInvoicetermPage();
    setIncompleteInstance(instance);
    final TransitionTo BaseInvoicetermPage_listInvoicetermsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoicetermPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_listInvoicetermsPage);
    BaseInvoicetermPage_TransitionTo_listInvoicetermsPage(instance, BaseInvoicetermPage_listInvoicetermsPage);
    final Caller BaseInvoicetermPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_universeService);
    BaseInvoicetermPage_Caller_universeService(instance, BaseInvoicetermPage_universeService);
    final TransitionTo BaseInvoicetermPage_viewInvoicetermPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewInvoicetermPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_viewInvoicetermPage);
    BaseInvoicetermPage_TransitionTo_viewInvoicetermPage(instance, BaseInvoicetermPage_viewInvoicetermPage);
    final InvoicetermListWidget ListInvoicetermPage_listWidget = (InvoicetermListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_i_InvoicetermListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListInvoicetermPage_listWidget);
    ListInvoicetermPage_InvoicetermListWidget_listWidget(instance, ListInvoicetermPage_listWidget);
    final Caller BaseInvoicetermPage_termtypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { TermtypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_termtypeService);
    BaseInvoicetermPage_Caller_termtypeService(instance, BaseInvoicetermPage_termtypeService);
    final Caller BaseInvoicetermPage_invoicetermService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoicetermEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_invoicetermService);
    BaseInvoicetermPage_Caller_invoicetermService(instance, BaseInvoicetermPage_invoicetermService);
    final TransitionTo BaseInvoicetermPage_editInvoicetermPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditInvoicetermPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_editInvoicetermPage);
    BaseInvoicetermPage_TransitionTo_editInvoicetermPage(instance, BaseInvoicetermPage_editInvoicetermPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Heading BaseInvoicetermPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseInvoicetermPage_viewTitle);
    BaseInvoicetermPage_Heading_viewTitle(instance, BaseInvoicetermPage_viewTitle);
    final Caller BaseInvoicetermPage_invoiceitemService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoiceitemEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_invoiceitemService);
    BaseInvoicetermPage_Caller_invoiceitemService(instance, BaseInvoicetermPage_invoiceitemService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final TransitionTo BaseInvoicetermPage_createInvoicetermPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateInvoicetermPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_createInvoicetermPage);
    BaseInvoicetermPage_TransitionTo_createInvoicetermPage(instance, BaseInvoicetermPage_createInvoicetermPage);
    final Caller BaseInvoicetermPage_invoiceService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoiceEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoicetermPage_invoiceService);
    BaseInvoicetermPage_Caller_invoiceService(instance, BaseInvoicetermPage_invoiceService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoicetermOperation", new AbstractCDIEventCallback<InvoicetermOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final InvoicetermOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoicetermOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForInvoicetermOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoicetermOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoicetermOperation", new AbstractCDIEventCallback<InvoicetermOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final InvoicetermOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoicetermOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForInvoicetermOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoicetermOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoicetermOperation", new AbstractCDIEventCallback<InvoicetermOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final InvoicetermOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoicetermOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForInvoicetermOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoicetermOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", new AbstractCDIEventCallback<InvoicetermDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InvoicetermDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", new AbstractCDIEventCallback<InvoicetermListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final InvoicetermListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", new AbstractCDIEventCallback<InvoicetermListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final InvoicetermListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", new AbstractCDIEventCallback<InvoicetermListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InvoicetermListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", new AbstractCDIEventCallback<InvoicetermEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final InvoicetermEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", new AbstractCDIEventCallback<InvoicetermEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final InvoicetermEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", new AbstractCDIEventCallback<InvoicetermDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InvoicetermDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", new AbstractCDIEventCallback<InvoicetermListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InvoicetermListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_i_ListInvoicetermPageTemplateResource templateForListInvoicetermPage = GWT.create(c_c_h_c_l_i_ListInvoicetermPageTemplateResource.class);
    Element parentElementForTemplateOfListInvoicetermPage = TemplateUtil.getRootTemplateParentElement(templateForListInvoicetermPage.getContents().getText(), "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoicetermPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoicetermPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInvoicetermPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseInvoicetermPage_AnchorElement_listInvoicetermsPageLink(instance));
      }
    }, dataFieldElements, "listInvoicetermsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListInvoicetermPage_InvoicetermListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListInvoicetermPage_AnchorElement_createNewInvoicetermLink(instance));
      }
    }, dataFieldElements, "createNewInvoicetermLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInvoicetermPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listInvoicetermsPageLink", ElementWrapperWidget.getWidget(BaseInvoicetermPage_AnchorElement_listInvoicetermsPageLink(instance)));
    templateFieldsMap.put("listWidget", ListInvoicetermPage_InvoicetermListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewInvoicetermLink", ElementWrapperWidget.getWidget(ListInvoicetermPage_AnchorElement_createNewInvoicetermLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoicetermPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewInvoicetermLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoicetermsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListInvoicetermPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListInvoicetermPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForInvoicetermOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForInvoicetermOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForInvoicetermOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseInvoicetermPage_AnchorElement_listInvoicetermsPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListInvoicetermPage_AnchorElement_createNewInvoicetermLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListInvoicetermPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BaseInvoicetermPage_Caller_invoicetermService(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::invoicetermService;
  }-*/;

  native static void BaseInvoicetermPage_Caller_invoicetermService(BaseInvoicetermPage instance, Caller<InvoicetermEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::invoicetermService = value;
  }-*/;

  native static Caller BaseInvoicetermPage_Caller_universeService(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::universeService;
  }-*/;

  native static void BaseInvoicetermPage_Caller_universeService(BaseInvoicetermPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::universeService = value;
  }-*/;

  native static Caller BaseInvoicetermPage_Caller_termtypeService(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::termtypeService;
  }-*/;

  native static void BaseInvoicetermPage_Caller_termtypeService(BaseInvoicetermPage instance, Caller<TermtypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::termtypeService = value;
  }-*/;

  native static InvoicetermListWidget ListInvoicetermPage_InvoicetermListWidget_listWidget(ListInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage::listWidget;
  }-*/;

  native static void ListInvoicetermPage_InvoicetermListWidget_listWidget(ListInvoicetermPage instance, InvoicetermListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage::listWidget = value;
  }-*/;

  native static TransitionTo BaseInvoicetermPage_TransitionTo_viewInvoicetermPage(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::viewInvoicetermPage;
  }-*/;

  native static void BaseInvoicetermPage_TransitionTo_viewInvoicetermPage(BaseInvoicetermPage instance, TransitionTo<ViewInvoicetermPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::viewInvoicetermPage = value;
  }-*/;

  native static TransitionTo BaseInvoicetermPage_TransitionTo_editInvoicetermPage(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::editInvoicetermPage;
  }-*/;

  native static void BaseInvoicetermPage_TransitionTo_editInvoicetermPage(BaseInvoicetermPage instance, TransitionTo<EditInvoicetermPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::editInvoicetermPage = value;
  }-*/;

  native static AnchorElement ListInvoicetermPage_AnchorElement_createNewInvoicetermLink(ListInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage::createNewInvoicetermLink;
  }-*/;

  native static void ListInvoicetermPage_AnchorElement_createNewInvoicetermLink(ListInvoicetermPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage::createNewInvoicetermLink = value;
  }-*/;

  native static AnchorElement BaseInvoicetermPage_AnchorElement_listInvoicetermsPageLink(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::listInvoicetermsPageLink;
  }-*/;

  native static void BaseInvoicetermPage_AnchorElement_listInvoicetermsPageLink(BaseInvoicetermPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::listInvoicetermsPageLink = value;
  }-*/;

  native static Caller BaseInvoicetermPage_Caller_invoiceService(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::invoiceService;
  }-*/;

  native static void BaseInvoicetermPage_Caller_invoiceService(BaseInvoicetermPage instance, Caller<InvoiceEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::invoiceService = value;
  }-*/;

  native static TransitionTo BaseInvoicetermPage_TransitionTo_createInvoicetermPage(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::createInvoicetermPage;
  }-*/;

  native static void BaseInvoicetermPage_TransitionTo_createInvoicetermPage(BaseInvoicetermPage instance, TransitionTo<CreateInvoicetermPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::createInvoicetermPage = value;
  }-*/;

  native static Heading BaseInvoicetermPage_Heading_viewTitle(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::viewTitle;
  }-*/;

  native static void BaseInvoicetermPage_Heading_viewTitle(BaseInvoicetermPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::viewTitle = value;
  }-*/;

  native static TransitionTo BaseInvoicetermPage_TransitionTo_listInvoicetermsPage(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::listInvoicetermsPage;
  }-*/;

  native static void BaseInvoicetermPage_TransitionTo_listInvoicetermsPage(BaseInvoicetermPage instance, TransitionTo<ListInvoicetermPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::listInvoicetermsPage = value;
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

  native static Caller BaseInvoicetermPage_Caller_invoiceitemService(BaseInvoicetermPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::invoiceitemService;
  }-*/;

  native static void BaseInvoicetermPage_Caller_invoiceitemService(BaseInvoicetermPage instance, Caller<InvoiceitemEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage::invoiceitemService = value;
  }-*/;
}
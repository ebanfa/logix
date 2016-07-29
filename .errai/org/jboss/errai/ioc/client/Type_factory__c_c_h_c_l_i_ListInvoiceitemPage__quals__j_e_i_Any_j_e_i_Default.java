package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.CreateInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.EditInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget;
import com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.ViewInvoiceitemPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.InventoryitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductfeatureEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;
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

public class Type_factory__c_c_h_c_l_i_ListInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInvoiceitemPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListInvoiceitemPage.class, "Type_factory__c_c_h_c_l_i_ListInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_ListInvoiceitemPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_ListInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListInvoiceitemPage.class);
    handle.addAssignableType(BaseInvoiceitemPage.class);
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

  public ListInvoiceitemPage createInstance(final ContextManager contextManager) {
    final ListInvoiceitemPage instance = new ListInvoiceitemPage();
    setIncompleteInstance(instance);
    final Caller BaseInvoiceitemPage_invoiceService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoiceEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_invoiceService);
    BaseInvoiceitemPage_Caller_invoiceService(instance, BaseInvoiceitemPage_invoiceService);
    final Caller BaseInvoiceitemPage_inventoryitemService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InventoryitemEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_inventoryitemService);
    BaseInvoiceitemPage_Caller_inventoryitemService(instance, BaseInvoiceitemPage_inventoryitemService);
    final TransitionTo BaseInvoiceitemPage_viewInvoiceitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewInvoiceitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_viewInvoiceitemPage);
    BaseInvoiceitemPage_TransitionTo_viewInvoiceitemPage(instance, BaseInvoiceitemPage_viewInvoiceitemPage);
    final Caller BaseInvoiceitemPage_invoiceitemService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoiceitemEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_invoiceitemService);
    BaseInvoiceitemPage_Caller_invoiceitemService(instance, BaseInvoiceitemPage_invoiceitemService);
    final InvoiceitemListWidget ListInvoiceitemPage_listWidget = (InvoiceitemListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_i_InvoiceitemListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListInvoiceitemPage_listWidget);
    ListInvoiceitemPage_InvoiceitemListWidget_listWidget(instance, ListInvoiceitemPage_listWidget);
    final TransitionTo BaseInvoiceitemPage_listInvoiceitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoiceitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_listInvoiceitemsPage);
    BaseInvoiceitemPage_TransitionTo_listInvoiceitemsPage(instance, BaseInvoiceitemPage_listInvoiceitemsPage);
    final TransitionTo BaseInvoiceitemPage_editInvoiceitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditInvoiceitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_editInvoiceitemPage);
    BaseInvoiceitemPage_TransitionTo_editInvoiceitemPage(instance, BaseInvoiceitemPage_editInvoiceitemPage);
    final Caller BaseInvoiceitemPage_invoiceitemtypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoiceitemtypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_invoiceitemtypeService);
    BaseInvoiceitemPage_Caller_invoiceitemtypeService(instance, BaseInvoiceitemPage_invoiceitemtypeService);
    final Caller BaseInvoiceitemPage_productService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_productService);
    BaseInvoiceitemPage_Caller_productService(instance, BaseInvoiceitemPage_productService);
    final Caller BaseInvoiceitemPage_productfeatureService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductfeatureEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_productfeatureService);
    BaseInvoiceitemPage_Caller_productfeatureService(instance, BaseInvoiceitemPage_productfeatureService);
    final Heading BaseInvoiceitemPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseInvoiceitemPage_viewTitle);
    BaseInvoiceitemPage_Heading_viewTitle(instance, BaseInvoiceitemPage_viewTitle);
    final Caller BaseInvoiceitemPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_universeService);
    BaseInvoiceitemPage_Caller_universeService(instance, BaseInvoiceitemPage_universeService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final TransitionTo BaseInvoiceitemPage_createInvoiceitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateInvoiceitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInvoiceitemPage_createInvoiceitemPage);
    BaseInvoiceitemPage_TransitionTo_createInvoiceitemPage(instance, BaseInvoiceitemPage_createInvoiceitemPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoiceitemOperation", new AbstractCDIEventCallback<InvoiceitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final InvoiceitemOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoiceitemOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForInvoiceitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoiceitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoiceitemOperation", new AbstractCDIEventCallback<InvoiceitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final InvoiceitemOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoiceitemOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForInvoiceitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoiceitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InvoiceitemOperation", new AbstractCDIEventCallback<InvoiceitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final InvoiceitemOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InvoiceitemOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForInvoiceitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InvoiceitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", new AbstractCDIEventCallback<InvoiceitemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InvoiceitemDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", new AbstractCDIEventCallback<InvoiceitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final InvoiceitemListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", new AbstractCDIEventCallback<InvoiceitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final InvoiceitemListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", new AbstractCDIEventCallback<InvoiceitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InvoiceitemListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", new AbstractCDIEventCallback<InvoiceitemEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final InvoiceitemEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", new AbstractCDIEventCallback<InvoiceitemEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final InvoiceitemEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", new AbstractCDIEventCallback<InvoiceitemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InvoiceitemDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", new AbstractCDIEventCallback<InvoiceitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InvoiceitemListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_i_ListInvoiceitemPageTemplateResource templateForListInvoiceitemPage = GWT.create(c_c_h_c_l_i_ListInvoiceitemPageTemplateResource.class);
    Element parentElementForTemplateOfListInvoiceitemPage = TemplateUtil.getRootTemplateParentElement(templateForListInvoiceitemPage.getContents().getText(), "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoiceitemPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoiceitemPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInvoiceitemPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseInvoiceitemPage_AnchorElement_listInvoiceitemsPageLink(instance));
      }
    }, dataFieldElements, "listInvoiceitemsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListInvoiceitemPage_InvoiceitemListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListInvoiceitemPage_AnchorElement_createNewInvoiceitemLink(instance));
      }
    }, dataFieldElements, "createNewInvoiceitemLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInvoiceitemPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listInvoiceitemsPageLink", ElementWrapperWidget.getWidget(BaseInvoiceitemPage_AnchorElement_listInvoiceitemsPageLink(instance)));
    templateFieldsMap.put("listWidget", ListInvoiceitemPage_InvoiceitemListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewInvoiceitemLink", ElementWrapperWidget.getWidget(ListInvoiceitemPage_AnchorElement_createNewInvoiceitemLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInvoiceitemPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewInvoiceitemLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoiceitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListInvoiceitemPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListInvoiceitemPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForInvoiceitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForInvoiceitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForInvoiceitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseInvoiceitemPage_AnchorElement_listInvoiceitemsPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListInvoiceitemPage_AnchorElement_createNewInvoiceitemLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListInvoiceitemPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BaseInvoiceitemPage_Caller_inventoryitemService(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::inventoryitemService;
  }-*/;

  native static void BaseInvoiceitemPage_Caller_inventoryitemService(BaseInvoiceitemPage instance, Caller<InventoryitemEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::inventoryitemService = value;
  }-*/;

  native static InvoiceitemListWidget ListInvoiceitemPage_InvoiceitemListWidget_listWidget(ListInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage::listWidget;
  }-*/;

  native static void ListInvoiceitemPage_InvoiceitemListWidget_listWidget(ListInvoiceitemPage instance, InvoiceitemListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage::listWidget = value;
  }-*/;

  native static AnchorElement ListInvoiceitemPage_AnchorElement_createNewInvoiceitemLink(ListInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage::createNewInvoiceitemLink;
  }-*/;

  native static void ListInvoiceitemPage_AnchorElement_createNewInvoiceitemLink(ListInvoiceitemPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage::createNewInvoiceitemLink = value;
  }-*/;

  native static TransitionTo BaseInvoiceitemPage_TransitionTo_listInvoiceitemsPage(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::listInvoiceitemsPage;
  }-*/;

  native static void BaseInvoiceitemPage_TransitionTo_listInvoiceitemsPage(BaseInvoiceitemPage instance, TransitionTo<ListInvoiceitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::listInvoiceitemsPage = value;
  }-*/;

  native static Caller BaseInvoiceitemPage_Caller_productfeatureService(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::productfeatureService;
  }-*/;

  native static void BaseInvoiceitemPage_Caller_productfeatureService(BaseInvoiceitemPage instance, Caller<ProductfeatureEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::productfeatureService = value;
  }-*/;

  native static Caller BaseInvoiceitemPage_Caller_productService(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::productService;
  }-*/;

  native static void BaseInvoiceitemPage_Caller_productService(BaseInvoiceitemPage instance, Caller<ProductEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::productService = value;
  }-*/;

  native static TransitionTo BaseInvoiceitemPage_TransitionTo_editInvoiceitemPage(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::editInvoiceitemPage;
  }-*/;

  native static void BaseInvoiceitemPage_TransitionTo_editInvoiceitemPage(BaseInvoiceitemPage instance, TransitionTo<EditInvoiceitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::editInvoiceitemPage = value;
  }-*/;

  native static Caller BaseInvoiceitemPage_Caller_invoiceService(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::invoiceService;
  }-*/;

  native static void BaseInvoiceitemPage_Caller_invoiceService(BaseInvoiceitemPage instance, Caller<InvoiceEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::invoiceService = value;
  }-*/;

  native static AnchorElement BaseInvoiceitemPage_AnchorElement_listInvoiceitemsPageLink(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::listInvoiceitemsPageLink;
  }-*/;

  native static void BaseInvoiceitemPage_AnchorElement_listInvoiceitemsPageLink(BaseInvoiceitemPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::listInvoiceitemsPageLink = value;
  }-*/;

  native static TransitionTo BaseInvoiceitemPage_TransitionTo_createInvoiceitemPage(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::createInvoiceitemPage;
  }-*/;

  native static void BaseInvoiceitemPage_TransitionTo_createInvoiceitemPage(BaseInvoiceitemPage instance, TransitionTo<CreateInvoiceitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::createInvoiceitemPage = value;
  }-*/;

  native static Heading BaseInvoiceitemPage_Heading_viewTitle(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::viewTitle;
  }-*/;

  native static void BaseInvoiceitemPage_Heading_viewTitle(BaseInvoiceitemPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::viewTitle = value;
  }-*/;

  native static TransitionTo BaseInvoiceitemPage_TransitionTo_viewInvoiceitemPage(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::viewInvoiceitemPage;
  }-*/;

  native static void BaseInvoiceitemPage_TransitionTo_viewInvoiceitemPage(BaseInvoiceitemPage instance, TransitionTo<ViewInvoiceitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::viewInvoiceitemPage = value;
  }-*/;

  native static Caller BaseInvoiceitemPage_Caller_universeService(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::universeService;
  }-*/;

  native static void BaseInvoiceitemPage_Caller_universeService(BaseInvoiceitemPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::universeService = value;
  }-*/;

  native static Caller BaseInvoiceitemPage_Caller_invoiceitemService(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::invoiceitemService;
  }-*/;

  native static void BaseInvoiceitemPage_Caller_invoiceitemService(BaseInvoiceitemPage instance, Caller<InvoiceitemEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::invoiceitemService = value;
  }-*/;

  native static Caller BaseInvoiceitemPage_Caller_invoiceitemtypeService(BaseInvoiceitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::invoiceitemtypeService;
  }-*/;

  native static void BaseInvoiceitemPage_Caller_invoiceitemtypeService(BaseInvoiceitemPage instance, Caller<InvoiceitemtypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage::invoiceitemtypeService = value;
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
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.CreateInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.EditInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemListWidget;
import com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.ViewInventoryitemPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.ContainerEndPoint;
import com.cloderia.helion.client.shared.endpoint.FacilityEndPoint;
import com.cloderia.helion.client.shared.endpoint.InventoryitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.InventoryitemstatusEndPoint;
import com.cloderia.helion.client.shared.endpoint.InventoryitemtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.LotEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;
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

public class Type_factory__c_c_h_c_l_i_ListInventoryitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInventoryitemPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListInventoryitemPage.class, "Type_factory__c_c_h_c_l_i_ListInventoryitemPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_ListInventoryitemPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_ListInventoryitemPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListInventoryitemPage.class);
    handle.addAssignableType(BaseInventoryitemPage.class);
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

  public ListInventoryitemPage createInstance(final ContextManager contextManager) {
    final ListInventoryitemPage instance = new ListInventoryitemPage();
    setIncompleteInstance(instance);
    final Heading BaseInventoryitemPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseInventoryitemPage_viewTitle);
    BaseInventoryitemPage_Heading_viewTitle(instance, BaseInventoryitemPage_viewTitle);
    final Caller BaseInventoryitemPage_inventoryitemService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InventoryitemEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_inventoryitemService);
    BaseInventoryitemPage_Caller_inventoryitemService(instance, BaseInventoryitemPage_inventoryitemService);
    final Caller BaseInventoryitemPage_inventoryitemstatusService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InventoryitemstatusEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_inventoryitemstatusService);
    BaseInventoryitemPage_Caller_inventoryitemstatusService(instance, BaseInventoryitemPage_inventoryitemstatusService);
    final Caller BaseInventoryitemPage_facilityService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { FacilityEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_facilityService);
    BaseInventoryitemPage_Caller_facilityService(instance, BaseInventoryitemPage_facilityService);
    final Caller BaseInventoryitemPage_lotService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { LotEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_lotService);
    BaseInventoryitemPage_Caller_lotService(instance, BaseInventoryitemPage_lotService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseInventoryitemPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_universeService);
    BaseInventoryitemPage_Caller_universeService(instance, BaseInventoryitemPage_universeService);
    final TransitionTo BaseInventoryitemPage_createInventoryitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateInventoryitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_createInventoryitemPage);
    BaseInventoryitemPage_TransitionTo_createInventoryitemPage(instance, BaseInventoryitemPage_createInventoryitemPage);
    final TransitionTo BaseInventoryitemPage_listInventoryitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInventoryitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_listInventoryitemsPage);
    BaseInventoryitemPage_TransitionTo_listInventoryitemsPage(instance, BaseInventoryitemPage_listInventoryitemsPage);
    final TransitionTo BaseInventoryitemPage_viewInventoryitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewInventoryitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_viewInventoryitemPage);
    BaseInventoryitemPage_TransitionTo_viewInventoryitemPage(instance, BaseInventoryitemPage_viewInventoryitemPage);
    final InventoryitemListWidget ListInventoryitemPage_listWidget = (InventoryitemListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_i_InventoryitemListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListInventoryitemPage_listWidget);
    ListInventoryitemPage_InventoryitemListWidget_listWidget(instance, ListInventoryitemPage_listWidget);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Caller BaseInventoryitemPage_containerService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ContainerEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_containerService);
    BaseInventoryitemPage_Caller_containerService(instance, BaseInventoryitemPage_containerService);
    final Caller BaseInventoryitemPage_inventoryitemtypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InventoryitemtypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_inventoryitemtypeService);
    BaseInventoryitemPage_Caller_inventoryitemtypeService(instance, BaseInventoryitemPage_inventoryitemtypeService);
    final TransitionTo BaseInventoryitemPage_editInventoryitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditInventoryitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_editInventoryitemPage);
    BaseInventoryitemPage_TransitionTo_editInventoryitemPage(instance, BaseInventoryitemPage_editInventoryitemPage);
    final Caller BaseInventoryitemPage_productService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseInventoryitemPage_productService);
    BaseInventoryitemPage_Caller_productService(instance, BaseInventoryitemPage_productService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InventoryitemOperation", new AbstractCDIEventCallback<InventoryitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final InventoryitemOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InventoryitemOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForInventoryitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InventoryitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InventoryitemOperation", new AbstractCDIEventCallback<InventoryitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final InventoryitemOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InventoryitemOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForInventoryitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InventoryitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.InventoryitemOperation", new AbstractCDIEventCallback<InventoryitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final InventoryitemOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.InventoryitemOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForInventoryitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.InventoryitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", new AbstractCDIEventCallback<InventoryitemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InventoryitemDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", new AbstractCDIEventCallback<InventoryitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final InventoryitemListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", new AbstractCDIEventCallback<InventoryitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final InventoryitemListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", new AbstractCDIEventCallback<InventoryitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final InventoryitemListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", new AbstractCDIEventCallback<InventoryitemEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final InventoryitemEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", new AbstractCDIEventCallback<InventoryitemEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final InventoryitemEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", new AbstractCDIEventCallback<InventoryitemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InventoryitemDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", new AbstractCDIEventCallback<InventoryitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final InventoryitemListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_i_ListInventoryitemPageTemplateResource templateForListInventoryitemPage = GWT.create(c_c_h_c_l_i_ListInventoryitemPageTemplateResource.class);
    Element parentElementForTemplateOfListInventoryitemPage = TemplateUtil.getRootTemplateParentElement(templateForListInventoryitemPage.getContents().getText(), "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInventoryitemPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInventoryitemPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInventoryitemPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseInventoryitemPage_AnchorElement_listInventoryitemsPageLink(instance));
      }
    }, dataFieldElements, "listInventoryitemsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListInventoryitemPage_InventoryitemListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListInventoryitemPage_AnchorElement_createNewInventoryitemLink(instance));
      }
    }, dataFieldElements, "createNewInventoryitemLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseInventoryitemPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listInventoryitemsPageLink", ElementWrapperWidget.getWidget(BaseInventoryitemPage_AnchorElement_listInventoryitemsPageLink(instance)));
    templateFieldsMap.put("listWidget", ListInventoryitemPage_InventoryitemListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewInventoryitemLink", ElementWrapperWidget.getWidget(ListInventoryitemPage_AnchorElement_createNewInventoryitemLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListInventoryitemPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewInventoryitemLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInventoryitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListInventoryitemPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListInventoryitemPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForInventoryitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForInventoryitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForInventoryitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseInventoryitemPage_AnchorElement_listInventoryitemsPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListInventoryitemPage_AnchorElement_createNewInventoryitemLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListInventoryitemPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement ListInventoryitemPage_AnchorElement_createNewInventoryitemLink(ListInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage::createNewInventoryitemLink;
  }-*/;

  native static void ListInventoryitemPage_AnchorElement_createNewInventoryitemLink(ListInventoryitemPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage::createNewInventoryitemLink = value;
  }-*/;

  native static TransitionTo BaseInventoryitemPage_TransitionTo_createInventoryitemPage(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::createInventoryitemPage;
  }-*/;

  native static void BaseInventoryitemPage_TransitionTo_createInventoryitemPage(BaseInventoryitemPage instance, TransitionTo<CreateInventoryitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::createInventoryitemPage = value;
  }-*/;

  native static TransitionTo BaseInventoryitemPage_TransitionTo_listInventoryitemsPage(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::listInventoryitemsPage;
  }-*/;

  native static void BaseInventoryitemPage_TransitionTo_listInventoryitemsPage(BaseInventoryitemPage instance, TransitionTo<ListInventoryitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::listInventoryitemsPage = value;
  }-*/;

  native static TransitionTo BaseInventoryitemPage_TransitionTo_viewInventoryitemPage(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::viewInventoryitemPage;
  }-*/;

  native static void BaseInventoryitemPage_TransitionTo_viewInventoryitemPage(BaseInventoryitemPage instance, TransitionTo<ViewInventoryitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::viewInventoryitemPage = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_productService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::productService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_productService(BaseInventoryitemPage instance, Caller<ProductEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::productService = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_containerService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::containerService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_containerService(BaseInventoryitemPage instance, Caller<ContainerEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::containerService = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_inventoryitemstatusService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::inventoryitemstatusService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_inventoryitemstatusService(BaseInventoryitemPage instance, Caller<InventoryitemstatusEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::inventoryitemstatusService = value;
  }-*/;

  native static Heading BaseInventoryitemPage_Heading_viewTitle(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::viewTitle;
  }-*/;

  native static void BaseInventoryitemPage_Heading_viewTitle(BaseInventoryitemPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::viewTitle = value;
  }-*/;

  native static AnchorElement BaseInventoryitemPage_AnchorElement_listInventoryitemsPageLink(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::listInventoryitemsPageLink;
  }-*/;

  native static void BaseInventoryitemPage_AnchorElement_listInventoryitemsPageLink(BaseInventoryitemPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::listInventoryitemsPageLink = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_lotService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::lotService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_lotService(BaseInventoryitemPage instance, Caller<LotEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::lotService = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_inventoryitemtypeService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::inventoryitemtypeService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_inventoryitemtypeService(BaseInventoryitemPage instance, Caller<InventoryitemtypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::inventoryitemtypeService = value;
  }-*/;

  native static TransitionTo BaseInventoryitemPage_TransitionTo_editInventoryitemPage(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::editInventoryitemPage;
  }-*/;

  native static void BaseInventoryitemPage_TransitionTo_editInventoryitemPage(BaseInventoryitemPage instance, TransitionTo<EditInventoryitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::editInventoryitemPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_inventoryitemService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::inventoryitemService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_inventoryitemService(BaseInventoryitemPage instance, Caller<InventoryitemEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::inventoryitemService = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_universeService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::universeService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_universeService(BaseInventoryitemPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::universeService = value;
  }-*/;

  native static InventoryitemListWidget ListInventoryitemPage_InventoryitemListWidget_listWidget(ListInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage::listWidget;
  }-*/;

  native static void ListInventoryitemPage_InventoryitemListWidget_listWidget(ListInventoryitemPage instance, InventoryitemListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage::listWidget = value;
  }-*/;

  native static Caller BaseInventoryitemPage_Caller_facilityService(BaseInventoryitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::facilityService;
  }-*/;

  native static void BaseInventoryitemPage_Caller_facilityService(BaseInventoryitemPage instance, Caller<FacilityEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage::facilityService = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.CreateProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.EditProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ListProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay;
import com.cloderia.helion.client.local.productfeature.ProductfeatureEditor;
import com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay;
import com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget;
import com.cloderia.helion.client.local.productfeature.ViewProductfeaturePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.ProductfeatureEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturecategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturetypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.endpoint.UomEndPoint;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;
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

public class Type_factory__c_c_h_c_l_p_ListProductfeaturePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProductfeaturePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListProductfeaturePage.class, "Type_factory__c_c_h_c_l_p_ListProductfeaturePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ListProductfeaturePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeature/list-productfeature-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ListProductfeaturePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListProductfeaturePage.class);
    handle.addAssignableType(BaseProductfeaturePage.class);
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

  public ListProductfeaturePage createInstance(final ContextManager contextManager) {
    final ListProductfeaturePage instance = new ListProductfeaturePage();
    setIncompleteInstance(instance);
    final Caller BaseProductfeaturePage_uomService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UomEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_uomService);
    BaseProductfeaturePage_Caller_uomService(instance, BaseProductfeaturePage_uomService);
    final TransitionTo BaseProductfeaturePage_viewProductfeaturePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewProductfeaturePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_viewProductfeaturePage);
    BaseProductfeaturePage_TransitionTo_viewProductfeaturePage(instance, BaseProductfeaturePage_viewProductfeaturePage);
    final Caller BaseProductfeaturePage_productfeaturecategoryService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductfeaturecategoryEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_productfeaturecategoryService);
    BaseProductfeaturePage_Caller_productfeaturecategoryService(instance, BaseProductfeaturePage_productfeaturecategoryService);
    final Heading BaseProductfeaturePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseProductfeaturePage_viewTitle);
    BaseProductfeaturePage_Heading_viewTitle(instance, BaseProductfeaturePage_viewTitle);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final ProductfeatureListWidget ListProductfeaturePage_listWidget = (ProductfeatureListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_p_ProductfeatureListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListProductfeaturePage_listWidget);
    ListProductfeaturePage_ProductfeatureListWidget_listWidget(instance, ListProductfeaturePage_listWidget);
    final TransitionTo BaseProductfeaturePage_editProductfeaturePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditProductfeaturePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_editProductfeaturePage);
    BaseProductfeaturePage_TransitionTo_editProductfeaturePage(instance, BaseProductfeaturePage_editProductfeaturePage);
    final TransitionTo BaseProductfeaturePage_listProductfeaturesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductfeaturePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_listProductfeaturesPage);
    BaseProductfeaturePage_TransitionTo_listProductfeaturesPage(instance, BaseProductfeaturePage_listProductfeaturesPage);
    final Caller BaseProductfeaturePage_productfeaturetypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductfeaturetypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_productfeaturetypeService);
    BaseProductfeaturePage_Caller_productfeaturetypeService(instance, BaseProductfeaturePage_productfeaturetypeService);
    final Caller BaseProductfeaturePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_universeService);
    BaseProductfeaturePage_Caller_universeService(instance, BaseProductfeaturePage_universeService);
    final TransitionTo BaseProductfeaturePage_createProductfeaturePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateProductfeaturePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_createProductfeaturePage);
    BaseProductfeaturePage_TransitionTo_createProductfeaturePage(instance, BaseProductfeaturePage_createProductfeaturePage);
    final Caller BaseProductfeaturePage_productfeatureService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductfeatureEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturePage_productfeatureService);
    BaseProductfeaturePage_Caller_productfeatureService(instance, BaseProductfeaturePage_productfeatureService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductfeatureOperation", new AbstractCDIEventCallback<ProductfeatureOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final ProductfeatureOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductfeatureOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForProductfeatureOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductfeatureOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductfeatureOperation", new AbstractCDIEventCallback<ProductfeatureOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final ProductfeatureOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductfeatureOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForProductfeatureOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductfeatureOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductfeatureOperation", new AbstractCDIEventCallback<ProductfeatureOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final ProductfeatureOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductfeatureOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForProductfeatureOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductfeatureOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", new AbstractCDIEventCallback<ProductfeatureDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductfeatureDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", new AbstractCDIEventCallback<ProductfeatureListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final ProductfeatureListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", new AbstractCDIEventCallback<ProductfeatureListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final ProductfeatureListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", new AbstractCDIEventCallback<ProductfeatureListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductfeatureListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", new AbstractCDIEventCallback<ProductfeatureEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final ProductfeatureEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", new AbstractCDIEventCallback<ProductfeatureEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final ProductfeatureEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", new AbstractCDIEventCallback<ProductfeatureDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductfeatureDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", new AbstractCDIEventCallback<ProductfeatureListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductfeatureListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_ListProductfeaturePageTemplateResource templateForListProductfeaturePage = GWT.create(c_c_h_c_l_p_ListProductfeaturePageTemplateResource.class);
    Element parentElementForTemplateOfListProductfeaturePage = TemplateUtil.getRootTemplateParentElement(templateForListProductfeaturePage.getContents().getText(), "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProductfeaturePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProductfeaturePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ListProductfeaturePage", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ListProductfeaturePage", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ListProductfeaturePage", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductfeaturePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ListProductfeaturePage", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseProductfeaturePage_AnchorElement_listProductfeaturesPageLink(instance));
      }
    }, dataFieldElements, "listProductfeaturesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ListProductfeaturePage", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListProductfeaturePage_ProductfeatureListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ListProductfeaturePage", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListProductfeaturePage_AnchorElement_createNewProductfeatureLink(instance));
      }
    }, dataFieldElements, "createNewProductfeatureLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductfeaturePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listProductfeaturesPageLink", ElementWrapperWidget.getWidget(BaseProductfeaturePage_AnchorElement_listProductfeaturesPageLink(instance)));
    templateFieldsMap.put("listWidget", ListProductfeaturePage_ProductfeatureListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewProductfeatureLink", ElementWrapperWidget.getWidget(ListProductfeaturePage_AnchorElement_createNewProductfeatureLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProductfeaturePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewProductfeatureLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductfeaturesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListProductfeaturePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListProductfeaturePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForProductfeatureOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForProductfeatureOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForProductfeatureOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseProductfeaturePage_AnchorElement_listProductfeaturesPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListProductfeaturePage_AnchorElement_createNewProductfeatureLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListProductfeaturePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BaseProductfeaturePage_Caller_productfeaturecategoryService(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::productfeaturecategoryService;
  }-*/;

  native static void BaseProductfeaturePage_Caller_productfeaturecategoryService(BaseProductfeaturePage instance, Caller<ProductfeaturecategoryEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::productfeaturecategoryService = value;
  }-*/;

  native static Caller BaseProductfeaturePage_Caller_productfeatureService(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::productfeatureService;
  }-*/;

  native static void BaseProductfeaturePage_Caller_productfeatureService(BaseProductfeaturePage instance, Caller<ProductfeatureEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::productfeatureService = value;
  }-*/;

  native static Caller BaseProductfeaturePage_Caller_productfeaturetypeService(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::productfeaturetypeService;
  }-*/;

  native static void BaseProductfeaturePage_Caller_productfeaturetypeService(BaseProductfeaturePage instance, Caller<ProductfeaturetypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::productfeaturetypeService = value;
  }-*/;

  native static TransitionTo BaseProductfeaturePage_TransitionTo_createProductfeaturePage(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::createProductfeaturePage;
  }-*/;

  native static void BaseProductfeaturePage_TransitionTo_createProductfeaturePage(BaseProductfeaturePage instance, TransitionTo<CreateProductfeaturePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::createProductfeaturePage = value;
  }-*/;

  native static AnchorElement BaseProductfeaturePage_AnchorElement_listProductfeaturesPageLink(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::listProductfeaturesPageLink;
  }-*/;

  native static void BaseProductfeaturePage_AnchorElement_listProductfeaturesPageLink(BaseProductfeaturePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::listProductfeaturesPageLink = value;
  }-*/;

  native static TransitionTo BaseProductfeaturePage_TransitionTo_listProductfeaturesPage(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::listProductfeaturesPage;
  }-*/;

  native static void BaseProductfeaturePage_TransitionTo_listProductfeaturesPage(BaseProductfeaturePage instance, TransitionTo<ListProductfeaturePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::listProductfeaturesPage = value;
  }-*/;

  native static Caller BaseProductfeaturePage_Caller_universeService(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::universeService;
  }-*/;

  native static void BaseProductfeaturePage_Caller_universeService(BaseProductfeaturePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::universeService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static ProductfeatureListWidget ListProductfeaturePage_ProductfeatureListWidget_listWidget(ListProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ListProductfeaturePage::listWidget;
  }-*/;

  native static void ListProductfeaturePage_ProductfeatureListWidget_listWidget(ListProductfeaturePage instance, ProductfeatureListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ListProductfeaturePage::listWidget = value;
  }-*/;

  native static AnchorElement ListProductfeaturePage_AnchorElement_createNewProductfeatureLink(ListProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ListProductfeaturePage::createNewProductfeatureLink;
  }-*/;

  native static void ListProductfeaturePage_AnchorElement_createNewProductfeatureLink(ListProductfeaturePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ListProductfeaturePage::createNewProductfeatureLink = value;
  }-*/;

  native static Caller BaseProductfeaturePage_Caller_uomService(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::uomService;
  }-*/;

  native static void BaseProductfeaturePage_Caller_uomService(BaseProductfeaturePage instance, Caller<UomEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::uomService = value;
  }-*/;

  native static TransitionTo BaseProductfeaturePage_TransitionTo_editProductfeaturePage(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::editProductfeaturePage;
  }-*/;

  native static void BaseProductfeaturePage_TransitionTo_editProductfeaturePage(BaseProductfeaturePage instance, TransitionTo<EditProductfeaturePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::editProductfeaturePage = value;
  }-*/;

  native static Heading BaseProductfeaturePage_Heading_viewTitle(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::viewTitle;
  }-*/;

  native static void BaseProductfeaturePage_Heading_viewTitle(BaseProductfeaturePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::viewTitle = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static TransitionTo BaseProductfeaturePage_TransitionTo_viewProductfeaturePage(BaseProductfeaturePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::viewProductfeaturePage;
  }-*/;

  native static void BaseProductfeaturePage_TransitionTo_viewProductfeaturePage(BaseProductfeaturePage instance, TransitionTo<ViewProductfeaturePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage::viewProductfeaturePage = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.product.BaseProductPage;
import com.cloderia.helion.client.local.product.CreateProductPage;
import com.cloderia.helion.client.local.product.EditProductPage;
import com.cloderia.helion.client.local.product.ListProductPage;
import com.cloderia.helion.client.local.product.ProductDisplay;
import com.cloderia.helion.client.local.product.ProductEditor;
import com.cloderia.helion.client.local.product.ProductListItemDisplay;
import com.cloderia.helion.client.local.product.ProductListWidget;
import com.cloderia.helion.client.local.product.ViewProductPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProducttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.endpoint.UomEndPoint;
import com.cloderia.helion.client.shared.ops.ProductOperation;
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

public class Type_factory__c_c_h_c_l_p_ListProductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProductPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListProductPage.class, "Type_factory__c_c_h_c_l_p_ListProductPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ListProductPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/product/list-product-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ListProductPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListProductPage.class);
    handle.addAssignableType(BaseProductPage.class);
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

  public ListProductPage createInstance(final ContextManager contextManager) {
    final ListProductPage instance = new ListProductPage();
    setIncompleteInstance(instance);
    final Heading BaseProductPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseProductPage_viewTitle);
    BaseProductPage_Heading_viewTitle(instance, BaseProductPage_viewTitle);
    final TransitionTo BaseProductPage_listProductsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_listProductsPage);
    BaseProductPage_TransitionTo_listProductsPage(instance, BaseProductPage_listProductsPage);
    final Caller BaseProductPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_partyService);
    BaseProductPage_Caller_partyService(instance, BaseProductPage_partyService);
    final Caller BaseProductPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_universeService);
    BaseProductPage_Caller_universeService(instance, BaseProductPage_universeService);
    final Caller BaseProductPage_uomService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UomEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_uomService);
    BaseProductPage_Caller_uomService(instance, BaseProductPage_uomService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseProductPage_producttypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProducttypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_producttypeService);
    BaseProductPage_Caller_producttypeService(instance, BaseProductPage_producttypeService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseProductPage_editProductPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditProductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_editProductPage);
    BaseProductPage_TransitionTo_editProductPage(instance, BaseProductPage_editProductPage);
    final ProductListWidget ListProductPage_listWidget = (ProductListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_p_ProductListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListProductPage_listWidget);
    ListProductPage_ProductListWidget_listWidget(instance, ListProductPage_listWidget);
    final TransitionTo BaseProductPage_createProductPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateProductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_createProductPage);
    BaseProductPage_TransitionTo_createProductPage(instance, BaseProductPage_createProductPage);
    final TransitionTo BaseProductPage_viewProductPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewProductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_viewProductPage);
    BaseProductPage_TransitionTo_viewProductPage(instance, BaseProductPage_viewProductPage);
    final Caller BaseProductPage_productService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductPage_productService);
    BaseProductPage_Caller_productService(instance, BaseProductPage_productService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductOperation", new AbstractCDIEventCallback<ProductOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final ProductOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForProductOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductOperation", new AbstractCDIEventCallback<ProductOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final ProductOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForProductOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductOperation", new AbstractCDIEventCallback<ProductOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final ProductOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForProductOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductDisplay", new AbstractCDIEventCallback<ProductDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductListItemDisplay", new AbstractCDIEventCallback<ProductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final ProductListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductListItemDisplay", new AbstractCDIEventCallback<ProductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final ProductListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductListItemDisplay", new AbstractCDIEventCallback<ProductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductEditor", new AbstractCDIEventCallback<ProductEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final ProductEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductEditor", new AbstractCDIEventCallback<ProductEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final ProductEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductDisplay", new AbstractCDIEventCallback<ProductDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.product.ProductListItemDisplay", new AbstractCDIEventCallback<ProductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.product.ProductListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_ListProductPageTemplateResource templateForListProductPage = GWT.create(c_c_h_c_l_p_ListProductPageTemplateResource.class);
    Element parentElementForTemplateOfListProductPage = TemplateUtil.getRootTemplateParentElement(templateForListProductPage.getContents().getText(), "com/cloderia/helion/client/local/product/list-product-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/product/list-product-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProductPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProductPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ListProductPage", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ListProductPage", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ListProductPage", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ListProductPage", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseProductPage_AnchorElement_listProductsPageLink(instance));
      }
    }, dataFieldElements, "listProductsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ListProductPage", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListProductPage_ProductListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ListProductPage", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListProductPage_AnchorElement_createNewProductLink(instance));
      }
    }, dataFieldElements, "createNewProductLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listProductsPageLink", ElementWrapperWidget.getWidget(BaseProductPage_AnchorElement_listProductsPageLink(instance)));
    templateFieldsMap.put("listWidget", ListProductPage_ProductListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewProductLink", ElementWrapperWidget.getWidget(ListProductPage_AnchorElement_createNewProductLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProductPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewProductLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListProductPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListProductPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForProductOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForProductOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForProductOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseProductPage_AnchorElement_listProductsPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListProductPage_AnchorElement_createNewProductLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListProductPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BaseProductPage_Caller_universeService(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::universeService;
  }-*/;

  native static void BaseProductPage_Caller_universeService(BaseProductPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::universeService = value;
  }-*/;

  native static ProductListWidget ListProductPage_ProductListWidget_listWidget(ListProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ListProductPage::listWidget;
  }-*/;

  native static void ListProductPage_ProductListWidget_listWidget(ListProductPage instance, ProductListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.product.ListProductPage::listWidget = value;
  }-*/;

  native static Caller BaseProductPage_Caller_producttypeService(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::producttypeService;
  }-*/;

  native static void BaseProductPage_Caller_producttypeService(BaseProductPage instance, Caller<ProducttypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::producttypeService = value;
  }-*/;

  native static AnchorElement BaseProductPage_AnchorElement_listProductsPageLink(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::listProductsPageLink;
  }-*/;

  native static void BaseProductPage_AnchorElement_listProductsPageLink(BaseProductPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::listProductsPageLink = value;
  }-*/;

  native static AnchorElement ListProductPage_AnchorElement_createNewProductLink(ListProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ListProductPage::createNewProductLink;
  }-*/;

  native static void ListProductPage_AnchorElement_createNewProductLink(ListProductPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ListProductPage::createNewProductLink = value;
  }-*/;

  native static TransitionTo BaseProductPage_TransitionTo_editProductPage(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::editProductPage;
  }-*/;

  native static void BaseProductPage_TransitionTo_editProductPage(BaseProductPage instance, TransitionTo<EditProductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::editProductPage = value;
  }-*/;

  native static TransitionTo BaseProductPage_TransitionTo_createProductPage(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::createProductPage;
  }-*/;

  native static void BaseProductPage_TransitionTo_createProductPage(BaseProductPage instance, TransitionTo<CreateProductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::createProductPage = value;
  }-*/;

  native static TransitionTo BaseProductPage_TransitionTo_viewProductPage(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::viewProductPage;
  }-*/;

  native static void BaseProductPage_TransitionTo_viewProductPage(BaseProductPage instance, TransitionTo<ViewProductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::viewProductPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseProductPage_TransitionTo_listProductsPage(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::listProductsPage;
  }-*/;

  native static void BaseProductPage_TransitionTo_listProductsPage(BaseProductPage instance, TransitionTo<ListProductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::listProductsPage = value;
  }-*/;

  native static Heading BaseProductPage_Heading_viewTitle(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::viewTitle;
  }-*/;

  native static void BaseProductPage_Heading_viewTitle(BaseProductPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::viewTitle = value;
  }-*/;

  native static Caller BaseProductPage_Caller_uomService(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::uomService;
  }-*/;

  native static void BaseProductPage_Caller_uomService(BaseProductPage instance, Caller<UomEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::uomService = value;
  }-*/;

  native static Caller BaseProductPage_Caller_productService(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::productService;
  }-*/;

  native static void BaseProductPage_Caller_productService(BaseProductPage instance, Caller<ProductEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::productService = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BaseProductPage_Caller_partyService(BaseProductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.BaseProductPage::partyService;
  }-*/;

  native static void BaseProductPage_Caller_partyService(BaseProductPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.product.BaseProductPage::partyService = value;
  }-*/;
}
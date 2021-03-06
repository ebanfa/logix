package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.producttype.BaseProducttypePage;
import com.cloderia.helion.client.local.producttype.CreateProducttypePage;
import com.cloderia.helion.client.local.producttype.EditProducttypePage;
import com.cloderia.helion.client.local.producttype.ListProducttypePage;
import com.cloderia.helion.client.local.producttype.ProducttypeDisplay;
import com.cloderia.helion.client.local.producttype.ProducttypeEditor;
import com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay;
import com.cloderia.helion.client.local.producttype.ProducttypeListWidget;
import com.cloderia.helion.client.local.producttype.ViewProducttypePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.ProducttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.ProducttypeOperation;
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

public class Type_factory__c_c_h_c_l_p_ListProducttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProducttypePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListProducttypePage.class, "Type_factory__c_c_h_c_l_p_ListProducttypePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ListProducttypePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/producttype/list-producttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ListProducttypePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListProducttypePage.class);
    handle.addAssignableType(BaseProducttypePage.class);
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

  public ListProducttypePage createInstance(final ContextManager contextManager) {
    final ListProducttypePage instance = new ListProducttypePage();
    setIncompleteInstance(instance);
    final TransitionTo BaseProducttypePage_viewProducttypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewProducttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProducttypePage_viewProducttypePage);
    BaseProducttypePage_TransitionTo_viewProducttypePage(instance, BaseProducttypePage_viewProducttypePage);
    final TransitionTo BaseProducttypePage_listProducttypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProducttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProducttypePage_listProducttypesPage);
    BaseProducttypePage_TransitionTo_listProducttypesPage(instance, BaseProducttypePage_listProducttypesPage);
    final Caller BaseProducttypePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProducttypePage_universeService);
    BaseProducttypePage_Caller_universeService(instance, BaseProducttypePage_universeService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseProducttypePage_editProducttypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditProducttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProducttypePage_editProducttypePage);
    BaseProducttypePage_TransitionTo_editProducttypePage(instance, BaseProducttypePage_editProducttypePage);
    final Heading BaseProducttypePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseProducttypePage_viewTitle);
    BaseProducttypePage_Heading_viewTitle(instance, BaseProducttypePage_viewTitle);
    final Caller BaseProducttypePage_producttypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProducttypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProducttypePage_producttypeService);
    BaseProducttypePage_Caller_producttypeService(instance, BaseProducttypePage_producttypeService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final TransitionTo BaseProducttypePage_createProducttypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateProducttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProducttypePage_createProducttypePage);
    BaseProducttypePage_TransitionTo_createProducttypePage(instance, BaseProducttypePage_createProducttypePage);
    final ProducttypeListWidget ListProducttypePage_listWidget = (ProducttypeListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_p_ProducttypeListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListProducttypePage_listWidget);
    ListProducttypePage_ProducttypeListWidget_listWidget(instance, ListProducttypePage_listWidget);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProducttypeOperation", new AbstractCDIEventCallback<ProducttypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final ProducttypeOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProducttypeOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForProducttypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProducttypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProducttypeOperation", new AbstractCDIEventCallback<ProducttypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final ProducttypeOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProducttypeOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForProducttypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProducttypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProducttypeOperation", new AbstractCDIEventCallback<ProducttypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final ProducttypeOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProducttypeOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForProducttypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProducttypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", new AbstractCDIEventCallback<ProducttypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProducttypeDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", new AbstractCDIEventCallback<ProducttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final ProducttypeListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", new AbstractCDIEventCallback<ProducttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final ProducttypeListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", new AbstractCDIEventCallback<ProducttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProducttypeListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeEditor", new AbstractCDIEventCallback<ProducttypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final ProducttypeEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeEditor", new AbstractCDIEventCallback<ProducttypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final ProducttypeEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", new AbstractCDIEventCallback<ProducttypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProducttypeDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", new AbstractCDIEventCallback<ProducttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProducttypeListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_ListProducttypePageTemplateResource templateForListProducttypePage = GWT.create(c_c_h_c_l_p_ListProducttypePageTemplateResource.class);
    Element parentElementForTemplateOfListProducttypePage = TemplateUtil.getRootTemplateParentElement(templateForListProducttypePage.getContents().getText(), "com/cloderia/helion/client/local/producttype/list-producttype-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/producttype/list-producttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProducttypePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProducttypePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ListProducttypePage", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ListProducttypePage", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ListProducttypePage", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProducttypePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ListProducttypePage", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseProducttypePage_AnchorElement_listProducttypesPageLink(instance));
      }
    }, dataFieldElements, "listProducttypesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ListProducttypePage", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListProducttypePage_ProducttypeListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ListProducttypePage", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListProducttypePage_AnchorElement_createNewProducttypeLink(instance));
      }
    }, dataFieldElements, "createNewProducttypeLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProducttypePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listProducttypesPageLink", ElementWrapperWidget.getWidget(BaseProducttypePage_AnchorElement_listProducttypesPageLink(instance)));
    templateFieldsMap.put("listWidget", ListProducttypePage_ProducttypeListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewProducttypeLink", ElementWrapperWidget.getWidget(ListProducttypePage_AnchorElement_createNewProducttypeLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListProducttypePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewProducttypeLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProducttypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListProducttypePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListProducttypePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForProducttypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForProducttypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForProducttypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseProducttypePage_AnchorElement_listProducttypesPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListProducttypePage_AnchorElement_createNewProducttypeLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListProducttypePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseProducttypePage_TransitionTo_createProducttypePage(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::createProducttypePage;
  }-*/;

  native static void BaseProducttypePage_TransitionTo_createProducttypePage(BaseProducttypePage instance, TransitionTo<CreateProducttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::createProducttypePage = value;
  }-*/;

  native static Caller BaseProducttypePage_Caller_producttypeService(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::producttypeService;
  }-*/;

  native static void BaseProducttypePage_Caller_producttypeService(BaseProducttypePage instance, Caller<ProducttypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::producttypeService = value;
  }-*/;

  native static Heading BaseProducttypePage_Heading_viewTitle(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::viewTitle;
  }-*/;

  native static void BaseProducttypePage_Heading_viewTitle(BaseProducttypePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::viewTitle = value;
  }-*/;

  native static AnchorElement BaseProducttypePage_AnchorElement_listProducttypesPageLink(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::listProducttypesPageLink;
  }-*/;

  native static void BaseProducttypePage_AnchorElement_listProducttypesPageLink(BaseProducttypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::listProducttypesPageLink = value;
  }-*/;

  native static Caller BaseProducttypePage_Caller_universeService(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::universeService;
  }-*/;

  native static void BaseProducttypePage_Caller_universeService(BaseProducttypePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::universeService = value;
  }-*/;

  native static AnchorElement ListProducttypePage_AnchorElement_createNewProducttypeLink(ListProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ListProducttypePage::createNewProducttypeLink;
  }-*/;

  native static void ListProducttypePage_AnchorElement_createNewProducttypeLink(ListProducttypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ListProducttypePage::createNewProducttypeLink = value;
  }-*/;

  native static TransitionTo BaseProducttypePage_TransitionTo_viewProducttypePage(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::viewProducttypePage;
  }-*/;

  native static void BaseProducttypePage_TransitionTo_viewProducttypePage(BaseProducttypePage instance, TransitionTo<ViewProducttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::viewProducttypePage = value;
  }-*/;

  native static TransitionTo BaseProducttypePage_TransitionTo_editProducttypePage(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::editProducttypePage;
  }-*/;

  native static void BaseProducttypePage_TransitionTo_editProducttypePage(BaseProducttypePage instance, TransitionTo<EditProducttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::editProducttypePage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseProducttypePage_TransitionTo_listProducttypesPage(BaseProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::listProducttypesPage;
  }-*/;

  native static void BaseProducttypePage_TransitionTo_listProducttypesPage(BaseProducttypePage instance, TransitionTo<ListProducttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.BaseProducttypePage::listProducttypesPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static ProducttypeListWidget ListProducttypePage_ProducttypeListWidget_listWidget(ListProducttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ListProducttypePage::listWidget;
  }-*/;

  native static void ListProducttypePage_ProducttypeListWidget_listWidget(ListProducttypePage instance, ProducttypeListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ListProducttypePage::listWidget = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.CreateProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.EditProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ListProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay;
import com.cloderia.helion.client.local.productfeaturetype.ViewProductfeaturetypePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturetypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation;
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

public class Type_factory__c_c_h_c_l_p_BaseProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseProductfeaturetypePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BaseProductfeaturetypePage.class, "Type_factory__c_c_h_c_l_p_BaseProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_BaseProductfeaturetypePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_BaseProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BaseProductfeaturetypePage.class);
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

  public BaseProductfeaturetypePage createInstance(final ContextManager contextManager) {
    final BaseProductfeaturetypePage instance = new BaseProductfeaturetypePage();
    setIncompleteInstance(instance);
    final Caller BaseProductfeaturetypePage_productfeaturetypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductfeaturetypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturetypePage_productfeaturetypeService);
    BaseProductfeaturetypePage_Caller_productfeaturetypeService(instance, BaseProductfeaturetypePage_productfeaturetypeService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final TransitionTo BaseProductfeaturetypePage_editProductfeaturetypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditProductfeaturetypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturetypePage_editProductfeaturetypePage);
    BaseProductfeaturetypePage_TransitionTo_editProductfeaturetypePage(instance, BaseProductfeaturetypePage_editProductfeaturetypePage);
    final TransitionTo BaseProductfeaturetypePage_createProductfeaturetypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateProductfeaturetypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturetypePage_createProductfeaturetypePage);
    BaseProductfeaturetypePage_TransitionTo_createProductfeaturetypePage(instance, BaseProductfeaturetypePage_createProductfeaturetypePage);
    final Caller BaseProductfeaturetypePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturetypePage_universeService);
    BaseProductfeaturetypePage_Caller_universeService(instance, BaseProductfeaturetypePage_universeService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Heading BaseProductfeaturetypePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseProductfeaturetypePage_viewTitle);
    BaseProductfeaturetypePage_Heading_viewTitle(instance, BaseProductfeaturetypePage_viewTitle);
    final TransitionTo BaseProductfeaturetypePage_viewProductfeaturetypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewProductfeaturetypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturetypePage_viewProductfeaturetypePage);
    BaseProductfeaturetypePage_TransitionTo_viewProductfeaturetypePage(instance, BaseProductfeaturetypePage_viewProductfeaturetypePage);
    final TransitionTo BaseProductfeaturetypePage_listProductfeaturetypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductfeaturetypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductfeaturetypePage_listProductfeaturetypesPage);
    BaseProductfeaturetypePage_TransitionTo_listProductfeaturetypesPage(instance, BaseProductfeaturetypePage_listProductfeaturetypesPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", new AbstractCDIEventCallback<ProductfeaturetypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final ProductfeaturetypeOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForProductfeaturetypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", new AbstractCDIEventCallback<ProductfeaturetypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final ProductfeaturetypeOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForProductfeaturetypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", new AbstractCDIEventCallback<ProductfeaturetypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final ProductfeaturetypeOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForProductfeaturetypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", new AbstractCDIEventCallback<ProductfeaturetypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductfeaturetypeDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", new AbstractCDIEventCallback<ProductfeaturetypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final ProductfeaturetypeListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", new AbstractCDIEventCallback<ProductfeaturetypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final ProductfeaturetypeListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", new AbstractCDIEventCallback<ProductfeaturetypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductfeaturetypeListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", new AbstractCDIEventCallback<ProductfeaturetypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final ProductfeaturetypeEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", new AbstractCDIEventCallback<ProductfeaturetypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final ProductfeaturetypeEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", new AbstractCDIEventCallback<ProductfeaturetypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductfeaturetypeDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", new AbstractCDIEventCallback<ProductfeaturetypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductfeaturetypeListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_BaseProductfeaturetypePageTemplateResource templateForBaseProductfeaturetypePage = GWT.create(c_c_h_c_l_p_BaseProductfeaturetypePageTemplateResource.class);
    Element parentElementForTemplateOfBaseProductfeaturetypePage = TemplateUtil.getRootTemplateParentElement(templateForBaseProductfeaturetypePage.getContents().getText(), "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseProductfeaturetypePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseProductfeaturetypePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductfeaturetypePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseProductfeaturetypePage_AnchorElement_listProductfeaturetypesPageLink(instance));
      }
    }, dataFieldElements, "listProductfeaturetypesPageLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductfeaturetypePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listProductfeaturetypesPageLink", ElementWrapperWidget.getWidget(BaseProductfeaturetypePage_AnchorElement_listProductfeaturetypesPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseProductfeaturetypePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductfeaturetypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BaseProductfeaturetypePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final BaseProductfeaturetypePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForProductfeaturetypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForProductfeaturetypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForProductfeaturetypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseProductfeaturetypePage_AnchorElement_listProductfeaturetypesPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final BaseProductfeaturetypePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseProductfeaturetypePage_TransitionTo_viewProductfeaturetypePage(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::viewProductfeaturetypePage;
  }-*/;

  native static void BaseProductfeaturetypePage_TransitionTo_viewProductfeaturetypePage(BaseProductfeaturetypePage instance, TransitionTo<ViewProductfeaturetypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::viewProductfeaturetypePage = value;
  }-*/;

  native static Caller BaseProductfeaturetypePage_Caller_productfeaturetypeService(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::productfeaturetypeService;
  }-*/;

  native static void BaseProductfeaturetypePage_Caller_productfeaturetypeService(BaseProductfeaturetypePage instance, Caller<ProductfeaturetypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::productfeaturetypeService = value;
  }-*/;

  native static Caller BaseProductfeaturetypePage_Caller_universeService(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::universeService;
  }-*/;

  native static void BaseProductfeaturetypePage_Caller_universeService(BaseProductfeaturetypePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::universeService = value;
  }-*/;

  native static Heading BaseProductfeaturetypePage_Heading_viewTitle(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::viewTitle;
  }-*/;

  native static void BaseProductfeaturetypePage_Heading_viewTitle(BaseProductfeaturetypePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::viewTitle = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseProductfeaturetypePage_TransitionTo_editProductfeaturetypePage(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::editProductfeaturetypePage;
  }-*/;

  native static void BaseProductfeaturetypePage_TransitionTo_editProductfeaturetypePage(BaseProductfeaturetypePage instance, TransitionTo<EditProductfeaturetypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::editProductfeaturetypePage = value;
  }-*/;

  native static TransitionTo BaseProductfeaturetypePage_TransitionTo_createProductfeaturetypePage(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::createProductfeaturetypePage;
  }-*/;

  native static void BaseProductfeaturetypePage_TransitionTo_createProductfeaturetypePage(BaseProductfeaturetypePage instance, TransitionTo<CreateProductfeaturetypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::createProductfeaturetypePage = value;
  }-*/;

  native static TransitionTo BaseProductfeaturetypePage_TransitionTo_listProductfeaturetypesPage(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::listProductfeaturetypesPage;
  }-*/;

  native static void BaseProductfeaturetypePage_TransitionTo_listProductfeaturetypesPage(BaseProductfeaturetypePage instance, TransitionTo<ListProductfeaturetypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::listProductfeaturetypesPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static AnchorElement BaseProductfeaturetypePage_AnchorElement_listProductfeaturetypesPageLink(BaseProductfeaturetypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::listProductfeaturetypesPageLink;
  }-*/;

  native static void BaseProductfeaturetypePage_AnchorElement_listProductfeaturetypesPageLink(BaseProductfeaturetypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage::listProductfeaturetypesPageLink = value;
  }-*/;
}
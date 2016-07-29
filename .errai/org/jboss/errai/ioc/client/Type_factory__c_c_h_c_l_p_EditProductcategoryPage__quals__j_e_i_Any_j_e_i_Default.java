package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.CreateProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.EditProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ListProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay;
import com.cloderia.helion.client.local.productcategory.ProductcategoryEditor;
import com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay;
import com.cloderia.helion.client.local.productcategory.ViewProductcategoryPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.ProductcategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductcategorytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;
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
import org.jboss.errai.ui.shared.TemplateWidgetMapper;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_p_EditProductcategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditProductcategoryPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(EditProductcategoryPage.class, "Type_factory__c_c_h_c_l_p_EditProductcategoryPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_EditProductcategoryPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_EditProductcategoryPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(EditProductcategoryPage.class);
    handle.addAssignableType(BaseProductcategoryPage.class);
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

  public EditProductcategoryPage createInstance(final ContextManager contextManager) {
    final EditProductcategoryPage instance = new EditProductcategoryPage();
    setIncompleteInstance(instance);
    final TransitionTo BaseProductcategoryPage_editProductcategoryPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditProductcategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductcategoryPage_editProductcategoryPage);
    BaseProductcategoryPage_TransitionTo_editProductcategoryPage(instance, BaseProductcategoryPage_editProductcategoryPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Caller BaseProductcategoryPage_productcategoryService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductcategoryEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductcategoryPage_productcategoryService);
    BaseProductcategoryPage_Caller_productcategoryService(instance, BaseProductcategoryPage_productcategoryService);
    final Heading BaseProductcategoryPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseProductcategoryPage_viewTitle);
    BaseProductcategoryPage_Heading_viewTitle(instance, BaseProductcategoryPage_viewTitle);
    final TransitionTo BaseProductcategoryPage_createProductcategoryPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateProductcategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductcategoryPage_createProductcategoryPage);
    BaseProductcategoryPage_TransitionTo_createProductcategoryPage(instance, BaseProductcategoryPage_createProductcategoryPage);
    final Caller BaseProductcategoryPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductcategoryPage_universeService);
    BaseProductcategoryPage_Caller_universeService(instance, BaseProductcategoryPage_universeService);
    final ProductcategoryEditor EditProductcategoryPage_productcategoryEditor = (ProductcategoryEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_p_ProductcategoryEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, EditProductcategoryPage_productcategoryEditor);
    EditProductcategoryPage_ProductcategoryEditor_productcategoryEditor(instance, EditProductcategoryPage_productcategoryEditor);
    final TransitionTo BaseProductcategoryPage_viewProductcategoryPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewProductcategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductcategoryPage_viewProductcategoryPage);
    BaseProductcategoryPage_TransitionTo_viewProductcategoryPage(instance, BaseProductcategoryPage_viewProductcategoryPage);
    final Caller BaseProductcategoryPage_productcategorytypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductcategorytypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductcategoryPage_productcategorytypeService);
    BaseProductcategoryPage_Caller_productcategorytypeService(instance, BaseProductcategoryPage_productcategorytypeService);
    final TransitionTo BaseProductcategoryPage_listProductcategorysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductcategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseProductcategoryPage_listProductcategorysPage);
    BaseProductcategoryPage_TransitionTo_listProductcategorysPage(instance, BaseProductcategoryPage_listProductcategorysPage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductcategoryOperation", new AbstractCDIEventCallback<ProductcategoryOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final ProductcategoryOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductcategoryOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForProductcategoryOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductcategoryOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductcategoryOperation", new AbstractCDIEventCallback<ProductcategoryOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final ProductcategoryOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductcategoryOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForProductcategoryOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductcategoryOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.ProductcategoryOperation", new AbstractCDIEventCallback<ProductcategoryOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final ProductcategoryOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.ProductcategoryOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForProductcategoryOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.ProductcategoryOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", new AbstractCDIEventCallback<ProductcategoryDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductcategoryDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", new AbstractCDIEventCallback<ProductcategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final ProductcategoryListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", new AbstractCDIEventCallback<ProductcategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final ProductcategoryListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", new AbstractCDIEventCallback<ProductcategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final ProductcategoryListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", new AbstractCDIEventCallback<ProductcategoryEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final ProductcategoryEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", new AbstractCDIEventCallback<ProductcategoryEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final ProductcategoryEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", new AbstractCDIEventCallback<ProductcategoryDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductcategoryDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", new AbstractCDIEventCallback<ProductcategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final ProductcategoryListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_EditProductcategoryPageTemplateResource templateForEditProductcategoryPage = GWT.create(c_c_h_c_l_p_EditProductcategoryPageTemplateResource.class);
    Element parentElementForTemplateOfEditProductcategoryPage = TemplateUtil.getRootTemplateParentElement(templateForEditProductcategoryPage.getContents().getText(), "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditProductcategoryPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditProductcategoryPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.EditProductcategoryPage", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.EditProductcategoryPage", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.EditProductcategoryPage", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductcategoryPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.EditProductcategoryPage", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseProductcategoryPage_AnchorElement_listProductcategorysPageLink(instance));
      }
    }, dataFieldElements, "listProductcategorysPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.EditProductcategoryPage", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(EditProductcategoryPage_ProductcategoryEditor_productcategoryEditor(instance));
      }
    }, dataFieldElements, "productcategoryEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseProductcategoryPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listProductcategorysPageLink", ElementWrapperWidget.getWidget(BaseProductcategoryPage_AnchorElement_listProductcategorysPageLink(instance)));
    templateFieldsMap.put("productcategoryEditor", TemplateWidgetMapper.get(EditProductcategoryPage_ProductcategoryEditor_productcategoryEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditProductcategoryPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductcategorysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((EditProductcategoryPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final EditProductcategoryPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForProductcategoryOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForProductcategoryOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForProductcategoryOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseProductcategoryPage_AnchorElement_listProductcategorysPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final EditProductcategoryPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseProductcategoryPage_TransitionTo_editProductcategoryPage(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::editProductcategoryPage;
  }-*/;

  native static void BaseProductcategoryPage_TransitionTo_editProductcategoryPage(BaseProductcategoryPage instance, TransitionTo<EditProductcategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::editProductcategoryPage = value;
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

  native static Caller BaseProductcategoryPage_Caller_productcategorytypeService(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::productcategorytypeService;
  }-*/;

  native static void BaseProductcategoryPage_Caller_productcategorytypeService(BaseProductcategoryPage instance, Caller<ProductcategorytypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::productcategorytypeService = value;
  }-*/;

  native static TransitionTo BaseProductcategoryPage_TransitionTo_listProductcategorysPage(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::listProductcategorysPage;
  }-*/;

  native static void BaseProductcategoryPage_TransitionTo_listProductcategorysPage(BaseProductcategoryPage instance, TransitionTo<ListProductcategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::listProductcategorysPage = value;
  }-*/;

  native static Heading BaseProductcategoryPage_Heading_viewTitle(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::viewTitle;
  }-*/;

  native static void BaseProductcategoryPage_Heading_viewTitle(BaseProductcategoryPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::viewTitle = value;
  }-*/;

  native static AnchorElement BaseProductcategoryPage_AnchorElement_listProductcategorysPageLink(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::listProductcategorysPageLink;
  }-*/;

  native static void BaseProductcategoryPage_AnchorElement_listProductcategorysPageLink(BaseProductcategoryPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::listProductcategorysPageLink = value;
  }-*/;

  native static TransitionTo BaseProductcategoryPage_TransitionTo_createProductcategoryPage(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::createProductcategoryPage;
  }-*/;

  native static void BaseProductcategoryPage_TransitionTo_createProductcategoryPage(BaseProductcategoryPage instance, TransitionTo<CreateProductcategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::createProductcategoryPage = value;
  }-*/;

  native static ProductcategoryEditor EditProductcategoryPage_ProductcategoryEditor_productcategoryEditor(EditProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.EditProductcategoryPage::productcategoryEditor;
  }-*/;

  native static void EditProductcategoryPage_ProductcategoryEditor_productcategoryEditor(EditProductcategoryPage instance, ProductcategoryEditor value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.EditProductcategoryPage::productcategoryEditor = value;
  }-*/;

  native static Caller BaseProductcategoryPage_Caller_productcategoryService(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::productcategoryService;
  }-*/;

  native static void BaseProductcategoryPage_Caller_productcategoryService(BaseProductcategoryPage instance, Caller<ProductcategoryEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::productcategoryService = value;
  }-*/;

  native static Caller BaseProductcategoryPage_Caller_universeService(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::universeService;
  }-*/;

  native static void BaseProductcategoryPage_Caller_universeService(BaseProductcategoryPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::universeService = value;
  }-*/;

  native static TransitionTo BaseProductcategoryPage_TransitionTo_viewProductcategoryPage(BaseProductcategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::viewProductcategoryPage;
  }-*/;

  native static void BaseProductcategoryPage_TransitionTo_viewProductcategoryPage(BaseProductcategoryPage instance, TransitionTo<ViewProductcategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage::viewProductcategoryPage = value;
  }-*/;
}
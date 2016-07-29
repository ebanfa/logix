package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.CreateSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.EditSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.ListSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay;
import com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.PreferencetypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.endpoint.RatingtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.SupplierproductEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;
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
import org.jboss.errai.databinding.client.api.DataBinder;
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

public class Type_factory__c_c_h_c_l_s_ViewSupplierproductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewSupplierproductPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ViewSupplierproductPage.class, "Type_factory__c_c_h_c_l_s_ViewSupplierproductPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_ViewSupplierproductPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_ViewSupplierproductPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ViewSupplierproductPage.class);
    handle.addAssignableType(BaseSupplierproductPage.class);
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

  public ViewSupplierproductPage createInstance(final ContextManager contextManager) {
    final ViewSupplierproductPage instance = new ViewSupplierproductPage();
    setIncompleteInstance(instance);
    final Caller BaseSupplierproductPage_preferencetypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PreferencetypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_preferencetypeService);
    BaseSupplierproductPage_Caller_preferencetypeService(instance, BaseSupplierproductPage_preferencetypeService);
    final Caller BaseSupplierproductPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_universeService);
    BaseSupplierproductPage_Caller_universeService(instance, BaseSupplierproductPage_universeService);
    final Caller BaseSupplierproductPage_supplierproductService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { SupplierproductEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_supplierproductService);
    BaseSupplierproductPage_Caller_supplierproductService(instance, BaseSupplierproductPage_supplierproductService);
    final TransitionTo BaseSupplierproductPage_editSupplierproductPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditSupplierproductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_editSupplierproductPage);
    BaseSupplierproductPage_TransitionTo_editSupplierproductPage(instance, BaseSupplierproductPage_editSupplierproductPage);
    final Caller BaseSupplierproductPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_partyService);
    BaseSupplierproductPage_Caller_partyService(instance, BaseSupplierproductPage_partyService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseSupplierproductPage_viewSupplierproductPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewSupplierproductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_viewSupplierproductPage);
    BaseSupplierproductPage_TransitionTo_viewSupplierproductPage(instance, BaseSupplierproductPage_viewSupplierproductPage);
    final TransitionTo BaseSupplierproductPage_createSupplierproductPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateSupplierproductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_createSupplierproductPage);
    BaseSupplierproductPage_TransitionTo_createSupplierproductPage(instance, BaseSupplierproductPage_createSupplierproductPage);
    final SupplierproductDisplay ViewSupplierproductPage_entityDisplayComponent = (SupplierproductDisplay) contextManager.getInstance("Type_factory__c_c_h_c_l_s_SupplierproductDisplay__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ViewSupplierproductPage_entityDisplayComponent);
    ViewSupplierproductPage_SupplierproductDisplay_entityDisplayComponent(instance, ViewSupplierproductPage_entityDisplayComponent);
    final Caller BaseSupplierproductPage_productService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_productService);
    BaseSupplierproductPage_Caller_productService(instance, BaseSupplierproductPage_productService);
    final Caller BaseSupplierproductPage_ratingtypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { RatingtypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_ratingtypeService);
    BaseSupplierproductPage_Caller_ratingtypeService(instance, BaseSupplierproductPage_ratingtypeService);
    final TransitionTo BaseSupplierproductPage_listSupplierproductsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListSupplierproductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSupplierproductPage_listSupplierproductsPage);
    BaseSupplierproductPage_TransitionTo_listSupplierproductsPage(instance, BaseSupplierproductPage_listSupplierproductsPage);
    final Heading BaseSupplierproductPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseSupplierproductPage_viewTitle);
    BaseSupplierproductPage_Heading_viewTitle(instance, BaseSupplierproductPage_viewTitle);
    final DataBinder ViewSupplierproductPage_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Supplierproduct.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ViewSupplierproductPage_binder);
    ViewSupplierproductPage_DataBinder_binder(instance, ViewSupplierproductPage_binder);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.SupplierproductOperation", new AbstractCDIEventCallback<SupplierproductOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final SupplierproductOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.SupplierproductOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForSupplierproductOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.SupplierproductOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.SupplierproductOperation", new AbstractCDIEventCallback<SupplierproductOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final SupplierproductOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.SupplierproductOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForSupplierproductOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.SupplierproductOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.SupplierproductOperation", new AbstractCDIEventCallback<SupplierproductOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final SupplierproductOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.SupplierproductOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForSupplierproductOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.SupplierproductOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", new AbstractCDIEventCallback<SupplierproductDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final SupplierproductDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", new AbstractCDIEventCallback<SupplierproductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final SupplierproductListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", new AbstractCDIEventCallback<SupplierproductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final SupplierproductListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", new AbstractCDIEventCallback<SupplierproductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final SupplierproductListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", new AbstractCDIEventCallback<SupplierproductEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final SupplierproductEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", new AbstractCDIEventCallback<SupplierproductEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final SupplierproductEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", new AbstractCDIEventCallback<SupplierproductDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final SupplierproductDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", new AbstractCDIEventCallback<SupplierproductListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final SupplierproductListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_s_ViewSupplierproductPageTemplateResource templateForViewSupplierproductPage = GWT.create(c_c_h_c_l_s_ViewSupplierproductPageTemplateResource.class);
    Element parentElementForTemplateOfViewSupplierproductPage = TemplateUtil.getRootTemplateParentElement(templateForViewSupplierproductPage.getContents().getText(), "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewSupplierproductPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewSupplierproductPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseSupplierproductPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseSupplierproductPage_AnchorElement_listSupplierproductsPageLink(instance));
      }
    }, dataFieldElements, "listSupplierproductsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(ViewSupplierproductPage_SupplierproductDisplay_entityDisplayComponent(instance));
      }
    }, dataFieldElements, "entityDisplayComponent");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseSupplierproductPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listSupplierproductsPageLink", ElementWrapperWidget.getWidget(BaseSupplierproductPage_AnchorElement_listSupplierproductsPageLink(instance)));
    templateFieldsMap.put("entityDisplayComponent", TemplateWidgetMapper.get(ViewSupplierproductPage_SupplierproductDisplay_entityDisplayComponent(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewSupplierproductPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listSupplierproductsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ViewSupplierproductPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ViewSupplierproductPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForSupplierproductOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForSupplierproductOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForSupplierproductOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseSupplierproductPage_AnchorElement_listSupplierproductsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ViewSupplierproductPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseSupplierproductPage_TransitionTo_editSupplierproductPage(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::editSupplierproductPage;
  }-*/;

  native static void BaseSupplierproductPage_TransitionTo_editSupplierproductPage(BaseSupplierproductPage instance, TransitionTo<EditSupplierproductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::editSupplierproductPage = value;
  }-*/;

  native static Caller BaseSupplierproductPage_Caller_partyService(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::partyService;
  }-*/;

  native static void BaseSupplierproductPage_Caller_partyService(BaseSupplierproductPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::partyService = value;
  }-*/;

  native static Caller BaseSupplierproductPage_Caller_productService(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::productService;
  }-*/;

  native static void BaseSupplierproductPage_Caller_productService(BaseSupplierproductPage instance, Caller<ProductEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::productService = value;
  }-*/;

  native static TransitionTo BaseSupplierproductPage_TransitionTo_listSupplierproductsPage(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::listSupplierproductsPage;
  }-*/;

  native static void BaseSupplierproductPage_TransitionTo_listSupplierproductsPage(BaseSupplierproductPage instance, TransitionTo<ListSupplierproductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::listSupplierproductsPage = value;
  }-*/;

  native static Heading BaseSupplierproductPage_Heading_viewTitle(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::viewTitle;
  }-*/;

  native static void BaseSupplierproductPage_Heading_viewTitle(BaseSupplierproductPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::viewTitle = value;
  }-*/;

  native static Caller BaseSupplierproductPage_Caller_preferencetypeService(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::preferencetypeService;
  }-*/;

  native static void BaseSupplierproductPage_Caller_preferencetypeService(BaseSupplierproductPage instance, Caller<PreferencetypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::preferencetypeService = value;
  }-*/;

  native static SupplierproductDisplay ViewSupplierproductPage_SupplierproductDisplay_entityDisplayComponent(ViewSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage::entityDisplayComponent;
  }-*/;

  native static void ViewSupplierproductPage_SupplierproductDisplay_entityDisplayComponent(ViewSupplierproductPage instance, SupplierproductDisplay value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage::entityDisplayComponent = value;
  }-*/;

  native static AnchorElement BaseSupplierproductPage_AnchorElement_listSupplierproductsPageLink(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::listSupplierproductsPageLink;
  }-*/;

  native static void BaseSupplierproductPage_AnchorElement_listSupplierproductsPageLink(BaseSupplierproductPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::listSupplierproductsPageLink = value;
  }-*/;

  native static Caller BaseSupplierproductPage_Caller_universeService(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::universeService;
  }-*/;

  native static void BaseSupplierproductPage_Caller_universeService(BaseSupplierproductPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::universeService = value;
  }-*/;

  native static TransitionTo BaseSupplierproductPage_TransitionTo_createSupplierproductPage(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::createSupplierproductPage;
  }-*/;

  native static void BaseSupplierproductPage_TransitionTo_createSupplierproductPage(BaseSupplierproductPage instance, TransitionTo<CreateSupplierproductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::createSupplierproductPage = value;
  }-*/;

  native static Caller BaseSupplierproductPage_Caller_supplierproductService(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::supplierproductService;
  }-*/;

  native static void BaseSupplierproductPage_Caller_supplierproductService(BaseSupplierproductPage instance, Caller<SupplierproductEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::supplierproductService = value;
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

  native static TransitionTo BaseSupplierproductPage_TransitionTo_viewSupplierproductPage(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::viewSupplierproductPage;
  }-*/;

  native static void BaseSupplierproductPage_TransitionTo_viewSupplierproductPage(BaseSupplierproductPage instance, TransitionTo<ViewSupplierproductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::viewSupplierproductPage = value;
  }-*/;

  native static DataBinder ViewSupplierproductPage_DataBinder_binder(ViewSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage::binder;
  }-*/;

  native static void ViewSupplierproductPage_DataBinder_binder(ViewSupplierproductPage instance, DataBinder<Supplierproduct> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage::binder = value;
  }-*/;

  native static Caller BaseSupplierproductPage_Caller_ratingtypeService(BaseSupplierproductPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::ratingtypeService;
  }-*/;

  native static void BaseSupplierproductPage_Caller_ratingtypeService(BaseSupplierproductPage instance, Caller<RatingtypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage::ratingtypeService = value;
  }-*/;
}
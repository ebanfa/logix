package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partycategory.BasePartycategoryPage;
import com.cloderia.helion.client.local.partycategory.CreatePartycategoryPage;
import com.cloderia.helion.client.local.partycategory.EditPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.ListPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.PartycategoryDisplay;
import com.cloderia.helion.client.local.partycategory.PartycategoryEditor;
import com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay;
import com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartycategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Partycategory;
import com.cloderia.helion.client.shared.ops.PartycategoryOperation;
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

public class Type_factory__c_c_h_c_l_p_ViewPartycategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPartycategoryPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ViewPartycategoryPage.class, "Type_factory__c_c_h_c_l_p_ViewPartycategoryPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ViewPartycategoryPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partycategory/view-partycategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ViewPartycategoryPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ViewPartycategoryPage.class);
    handle.addAssignableType(BasePartycategoryPage.class);
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

  public ViewPartycategoryPage createInstance(final ContextManager contextManager) {
    final ViewPartycategoryPage instance = new ViewPartycategoryPage();
    setIncompleteInstance(instance);
    final DataBinder ViewPartycategoryPage_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partycategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ViewPartycategoryPage_binder);
    ViewPartycategoryPage_DataBinder_binder(instance, ViewPartycategoryPage_binder);
    final TransitionTo BasePartycategoryPage_viewPartycategoryPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewPartycategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartycategoryPage_viewPartycategoryPage);
    BasePartycategoryPage_TransitionTo_viewPartycategoryPage(instance, BasePartycategoryPage_viewPartycategoryPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BasePartycategoryPage_createPartycategoryPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreatePartycategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartycategoryPage_createPartycategoryPage);
    BasePartycategoryPage_TransitionTo_createPartycategoryPage(instance, BasePartycategoryPage_createPartycategoryPage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final PartycategoryDisplay ViewPartycategoryPage_entityDisplayComponent = (PartycategoryDisplay) contextManager.getInstance("Type_factory__c_c_h_c_l_p_PartycategoryDisplay__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ViewPartycategoryPage_entityDisplayComponent);
    ViewPartycategoryPage_PartycategoryDisplay_entityDisplayComponent(instance, ViewPartycategoryPage_entityDisplayComponent);
    final TransitionTo BasePartycategoryPage_editPartycategoryPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditPartycategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartycategoryPage_editPartycategoryPage);
    BasePartycategoryPage_TransitionTo_editPartycategoryPage(instance, BasePartycategoryPage_editPartycategoryPage);
    final TransitionTo BasePartycategoryPage_listPartycategorysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartycategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartycategoryPage_listPartycategorysPage);
    BasePartycategoryPage_TransitionTo_listPartycategorysPage(instance, BasePartycategoryPage_listPartycategorysPage);
    final Caller BasePartycategoryPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartycategoryPage_universeService);
    BasePartycategoryPage_Caller_universeService(instance, BasePartycategoryPage_universeService);
    final Heading BasePartycategoryPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BasePartycategoryPage_viewTitle);
    BasePartycategoryPage_Heading_viewTitle(instance, BasePartycategoryPage_viewTitle);
    final Caller BasePartycategoryPage_partycategoryService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartycategoryEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartycategoryPage_partycategoryService);
    BasePartycategoryPage_Caller_partycategoryService(instance, BasePartycategoryPage_partycategoryService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartycategoryOperation", new AbstractCDIEventCallback<PartycategoryOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final PartycategoryOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartycategoryOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForPartycategoryOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartycategoryOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartycategoryOperation", new AbstractCDIEventCallback<PartycategoryOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final PartycategoryOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartycategoryOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForPartycategoryOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartycategoryOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartycategoryOperation", new AbstractCDIEventCallback<PartycategoryOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final PartycategoryOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartycategoryOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForPartycategoryOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartycategoryOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", new AbstractCDIEventCallback<PartycategoryDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartycategoryDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", new AbstractCDIEventCallback<PartycategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final PartycategoryListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", new AbstractCDIEventCallback<PartycategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final PartycategoryListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", new AbstractCDIEventCallback<PartycategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartycategoryListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", new AbstractCDIEventCallback<PartycategoryEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final PartycategoryEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", new AbstractCDIEventCallback<PartycategoryEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final PartycategoryEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", new AbstractCDIEventCallback<PartycategoryDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartycategoryDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", new AbstractCDIEventCallback<PartycategoryListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartycategoryListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_ViewPartycategoryPageTemplateResource templateForViewPartycategoryPage = GWT.create(c_c_h_c_l_p_ViewPartycategoryPageTemplateResource.class);
    Element parentElementForTemplateOfViewPartycategoryPage = TemplateUtil.getRootTemplateParentElement(templateForViewPartycategoryPage.getContents().getText(), "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewPartycategoryPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewPartycategoryPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartycategoryPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BasePartycategoryPage_AnchorElement_listPartycategorysPageLink(instance));
      }
    }, dataFieldElements, "listPartycategorysPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(ViewPartycategoryPage_PartycategoryDisplay_entityDisplayComponent(instance));
      }
    }, dataFieldElements, "entityDisplayComponent");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartycategoryPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listPartycategorysPageLink", ElementWrapperWidget.getWidget(BasePartycategoryPage_AnchorElement_listPartycategorysPageLink(instance)));
    templateFieldsMap.put("entityDisplayComponent", TemplateWidgetMapper.get(ViewPartycategoryPage_PartycategoryDisplay_entityDisplayComponent(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewPartycategoryPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartycategorysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ViewPartycategoryPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ViewPartycategoryPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForPartycategoryOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForPartycategoryOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForPartycategoryOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BasePartycategoryPage_AnchorElement_listPartycategorysPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ViewPartycategoryPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BasePartycategoryPage_TransitionTo_createPartycategoryPage(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::createPartycategoryPage;
  }-*/;

  native static void BasePartycategoryPage_TransitionTo_createPartycategoryPage(BasePartycategoryPage instance, TransitionTo<CreatePartycategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::createPartycategoryPage = value;
  }-*/;

  native static Heading BasePartycategoryPage_Heading_viewTitle(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::viewTitle;
  }-*/;

  native static void BasePartycategoryPage_Heading_viewTitle(BasePartycategoryPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::viewTitle = value;
  }-*/;

  native static DataBinder ViewPartycategoryPage_DataBinder_binder(ViewPartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage::binder;
  }-*/;

  native static void ViewPartycategoryPage_DataBinder_binder(ViewPartycategoryPage instance, DataBinder<Partycategory> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage::binder = value;
  }-*/;

  native static TransitionTo BasePartycategoryPage_TransitionTo_viewPartycategoryPage(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::viewPartycategoryPage;
  }-*/;

  native static void BasePartycategoryPage_TransitionTo_viewPartycategoryPage(BasePartycategoryPage instance, TransitionTo<ViewPartycategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::viewPartycategoryPage = value;
  }-*/;

  native static TransitionTo BasePartycategoryPage_TransitionTo_editPartycategoryPage(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::editPartycategoryPage;
  }-*/;

  native static void BasePartycategoryPage_TransitionTo_editPartycategoryPage(BasePartycategoryPage instance, TransitionTo<EditPartycategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::editPartycategoryPage = value;
  }-*/;

  native static Caller BasePartycategoryPage_Caller_universeService(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::universeService;
  }-*/;

  native static void BasePartycategoryPage_Caller_universeService(BasePartycategoryPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::universeService = value;
  }-*/;

  native static PartycategoryDisplay ViewPartycategoryPage_PartycategoryDisplay_entityDisplayComponent(ViewPartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage::entityDisplayComponent;
  }-*/;

  native static void ViewPartycategoryPage_PartycategoryDisplay_entityDisplayComponent(ViewPartycategoryPage instance, PartycategoryDisplay value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage::entityDisplayComponent = value;
  }-*/;

  native static AnchorElement BasePartycategoryPage_AnchorElement_listPartycategorysPageLink(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::listPartycategorysPageLink;
  }-*/;

  native static void BasePartycategoryPage_AnchorElement_listPartycategorysPageLink(BasePartycategoryPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::listPartycategorysPageLink = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BasePartycategoryPage_TransitionTo_listPartycategorysPage(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::listPartycategorysPage;
  }-*/;

  native static void BasePartycategoryPage_TransitionTo_listPartycategorysPage(BasePartycategoryPage instance, TransitionTo<ListPartycategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::listPartycategorysPage = value;
  }-*/;

  native static Caller BasePartycategoryPage_Caller_partycategoryService(BasePartycategoryPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::partycategoryService;
  }-*/;

  native static void BasePartycategoryPage_Caller_partycategoryService(BasePartycategoryPage instance, Caller<PartycategoryEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.BasePartycategoryPage::partycategoryService = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facility.BaseFacilityPage;
import com.cloderia.helion.client.local.facility.CreateFacilityPage;
import com.cloderia.helion.client.local.facility.EditFacilityPage;
import com.cloderia.helion.client.local.facility.FacilityDisplay;
import com.cloderia.helion.client.local.facility.FacilityEditor;
import com.cloderia.helion.client.local.facility.FacilityListItemDisplay;
import com.cloderia.helion.client.local.facility.ListFacilityPage;
import com.cloderia.helion.client.local.facility.ViewFacilityPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.FacilityEndPoint;
import com.cloderia.helion.client.shared.endpoint.FacilitytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.FacilityOperation;
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

public class Type_factory__c_c_h_c_l_f_CreateFacilityPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateFacilityPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(CreateFacilityPage.class, "Type_factory__c_c_h_c_l_f_CreateFacilityPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_CreateFacilityPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facility/edit-facility-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_CreateFacilityPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(CreateFacilityPage.class);
    handle.addAssignableType(BaseFacilityPage.class);
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

  public CreateFacilityPage createInstance(final ContextManager contextManager) {
    final CreateFacilityPage instance = new CreateFacilityPage();
    setIncompleteInstance(instance);
    final Caller BaseFacilityPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilityPage_universeService);
    BaseFacilityPage_Caller_universeService(instance, BaseFacilityPage_universeService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseFacilityPage_facilitytypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { FacilitytypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilityPage_facilitytypeService);
    BaseFacilityPage_Caller_facilitytypeService(instance, BaseFacilityPage_facilitytypeService);
    final TransitionTo BaseFacilityPage_createFacilityPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateFacilityPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilityPage_createFacilityPage);
    BaseFacilityPage_TransitionTo_createFacilityPage(instance, BaseFacilityPage_createFacilityPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseFacilityPage_listFacilitysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListFacilityPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilityPage_listFacilitysPage);
    BaseFacilityPage_TransitionTo_listFacilitysPage(instance, BaseFacilityPage_listFacilitysPage);
    final Heading BaseFacilityPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseFacilityPage_viewTitle);
    BaseFacilityPage_Heading_viewTitle(instance, BaseFacilityPage_viewTitle);
    final TransitionTo BaseFacilityPage_viewFacilityPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewFacilityPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilityPage_viewFacilityPage);
    BaseFacilityPage_TransitionTo_viewFacilityPage(instance, BaseFacilityPage_viewFacilityPage);
    final FacilityEditor CreateFacilityPage_facilityEditor = (FacilityEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_f_FacilityEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, CreateFacilityPage_facilityEditor);
    CreateFacilityPage_FacilityEditor_facilityEditor(instance, CreateFacilityPage_facilityEditor);
    final Caller BaseFacilityPage_facilityService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { FacilityEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilityPage_facilityService);
    BaseFacilityPage_Caller_facilityService(instance, BaseFacilityPage_facilityService);
    final TransitionTo BaseFacilityPage_editFacilityPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditFacilityPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilityPage_editFacilityPage);
    BaseFacilityPage_TransitionTo_editFacilityPage(instance, BaseFacilityPage_editFacilityPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.FacilityOperation", new AbstractCDIEventCallback<FacilityOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final FacilityOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.FacilityOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForFacilityOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.FacilityOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.FacilityOperation", new AbstractCDIEventCallback<FacilityOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final FacilityOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.FacilityOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForFacilityOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.FacilityOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.FacilityOperation", new AbstractCDIEventCallback<FacilityOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final FacilityOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.FacilityOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForFacilityOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.FacilityOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityDisplay", new AbstractCDIEventCallback<FacilityDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final FacilityDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", new AbstractCDIEventCallback<FacilityListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final FacilityListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", new AbstractCDIEventCallback<FacilityListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final FacilityListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", new AbstractCDIEventCallback<FacilityListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final FacilityListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityEditor", new AbstractCDIEventCallback<FacilityEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final FacilityEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityEditor", new AbstractCDIEventCallback<FacilityEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final FacilityEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityDisplay", new AbstractCDIEventCallback<FacilityDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final FacilityDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", new AbstractCDIEventCallback<FacilityListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final FacilityListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facility.FacilityListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_f_CreateFacilityPageTemplateResource templateForCreateFacilityPage = GWT.create(c_c_h_c_l_f_CreateFacilityPageTemplateResource.class);
    Element parentElementForTemplateOfCreateFacilityPage = TemplateUtil.getRootTemplateParentElement(templateForCreateFacilityPage.getContents().getText(), "com/cloderia/helion/client/local/facility/edit-facility-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facility/edit-facility-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateFacilityPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateFacilityPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.CreateFacilityPage", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.CreateFacilityPage", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.CreateFacilityPage", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseFacilityPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.CreateFacilityPage", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseFacilityPage_AnchorElement_listFacilitysPageLink(instance));
      }
    }, dataFieldElements, "listFacilitysPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.CreateFacilityPage", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(CreateFacilityPage_FacilityEditor_facilityEditor(instance));
      }
    }, dataFieldElements, "facilityEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseFacilityPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listFacilitysPageLink", ElementWrapperWidget.getWidget(BaseFacilityPage_AnchorElement_listFacilitysPageLink(instance)));
    templateFieldsMap.put("facilityEditor", TemplateWidgetMapper.get(CreateFacilityPage_FacilityEditor_facilityEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateFacilityPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listFacilitysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((CreateFacilityPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final CreateFacilityPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForFacilityOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForFacilityOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForFacilityOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseFacilityPage_AnchorElement_listFacilitysPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final CreateFacilityPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseFacilityPage_TransitionTo_editFacilityPage(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::editFacilityPage;
  }-*/;

  native static void BaseFacilityPage_TransitionTo_editFacilityPage(BaseFacilityPage instance, TransitionTo<EditFacilityPage> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::editFacilityPage = value;
  }-*/;

  native static FacilityEditor CreateFacilityPage_FacilityEditor_facilityEditor(CreateFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.CreateFacilityPage::facilityEditor;
  }-*/;

  native static void CreateFacilityPage_FacilityEditor_facilityEditor(CreateFacilityPage instance, FacilityEditor value) /*-{
    instance.@com.cloderia.helion.client.local.facility.CreateFacilityPage::facilityEditor = value;
  }-*/;

  native static Caller BaseFacilityPage_Caller_facilitytypeService(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::facilitytypeService;
  }-*/;

  native static void BaseFacilityPage_Caller_facilitytypeService(BaseFacilityPage instance, Caller<FacilitytypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::facilitytypeService = value;
  }-*/;

  native static TransitionTo BaseFacilityPage_TransitionTo_listFacilitysPage(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::listFacilitysPage;
  }-*/;

  native static void BaseFacilityPage_TransitionTo_listFacilitysPage(BaseFacilityPage instance, TransitionTo<ListFacilityPage> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::listFacilitysPage = value;
  }-*/;

  native static TransitionTo BaseFacilityPage_TransitionTo_viewFacilityPage(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::viewFacilityPage;
  }-*/;

  native static void BaseFacilityPage_TransitionTo_viewFacilityPage(BaseFacilityPage instance, TransitionTo<ViewFacilityPage> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::viewFacilityPage = value;
  }-*/;

  native static Caller BaseFacilityPage_Caller_universeService(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::universeService;
  }-*/;

  native static void BaseFacilityPage_Caller_universeService(BaseFacilityPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::universeService = value;
  }-*/;

  native static Heading BaseFacilityPage_Heading_viewTitle(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::viewTitle;
  }-*/;

  native static void BaseFacilityPage_Heading_viewTitle(BaseFacilityPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::viewTitle = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BaseFacilityPage_Caller_facilityService(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::facilityService;
  }-*/;

  native static void BaseFacilityPage_Caller_facilityService(BaseFacilityPage instance, Caller<FacilityEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::facilityService = value;
  }-*/;

  native static TransitionTo BaseFacilityPage_TransitionTo_createFacilityPage(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::createFacilityPage;
  }-*/;

  native static void BaseFacilityPage_TransitionTo_createFacilityPage(BaseFacilityPage instance, TransitionTo<CreateFacilityPage> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::createFacilityPage = value;
  }-*/;

  native static AnchorElement BaseFacilityPage_AnchorElement_listFacilitysPageLink(BaseFacilityPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::listFacilitysPageLink;
  }-*/;

  native static void BaseFacilityPage_AnchorElement_listFacilitysPageLink(BaseFacilityPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.BaseFacilityPage::listFacilitysPageLink = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.EditFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay;
import com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor;
import com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay;
import com.cloderia.helion.client.local.facilitytype.ListFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.ViewFacilitytypePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.FacilitytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.FacilitytypeOperation;
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

public class Type_factory__c_c_h_c_l_f_CreateFacilitytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateFacilitytypePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(CreateFacilitytypePage.class, "Type_factory__c_c_h_c_l_f_CreateFacilitytypePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_CreateFacilitytypePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_CreateFacilitytypePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(CreateFacilitytypePage.class);
    handle.addAssignableType(BaseFacilitytypePage.class);
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

  public CreateFacilitytypePage createInstance(final ContextManager contextManager) {
    final CreateFacilitytypePage instance = new CreateFacilitytypePage();
    setIncompleteInstance(instance);
    final TransitionTo BaseFacilitytypePage_viewFacilitytypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewFacilitytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilitytypePage_viewFacilitytypePage);
    BaseFacilitytypePage_TransitionTo_viewFacilitytypePage(instance, BaseFacilitytypePage_viewFacilitytypePage);
    final Caller BaseFacilitytypePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilitytypePage_universeService);
    BaseFacilitytypePage_Caller_universeService(instance, BaseFacilitytypePage_universeService);
    final TransitionTo BaseFacilitytypePage_listFacilitytypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListFacilitytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilitytypePage_listFacilitytypesPage);
    BaseFacilitytypePage_TransitionTo_listFacilitytypesPage(instance, BaseFacilitytypePage_listFacilitytypesPage);
    final Caller BaseFacilitytypePage_facilitytypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { FacilitytypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilitytypePage_facilitytypeService);
    BaseFacilitytypePage_Caller_facilitytypeService(instance, BaseFacilitytypePage_facilitytypeService);
    final TransitionTo BaseFacilitytypePage_createFacilitytypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateFacilitytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilitytypePage_createFacilitytypePage);
    BaseFacilitytypePage_TransitionTo_createFacilitytypePage(instance, BaseFacilitytypePage_createFacilitytypePage);
    final TransitionTo BaseFacilitytypePage_editFacilitytypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditFacilitytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseFacilitytypePage_editFacilitytypePage);
    BaseFacilitytypePage_TransitionTo_editFacilitytypePage(instance, BaseFacilitytypePage_editFacilitytypePage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final FacilitytypeEditor CreateFacilitytypePage_facilitytypeEditor = (FacilitytypeEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_f_FacilitytypeEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, CreateFacilitytypePage_facilitytypeEditor);
    CreateFacilitytypePage_FacilitytypeEditor_facilitytypeEditor(instance, CreateFacilitytypePage_facilitytypeEditor);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Heading BaseFacilitytypePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseFacilitytypePage_viewTitle);
    BaseFacilitytypePage_Heading_viewTitle(instance, BaseFacilitytypePage_viewTitle);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.FacilitytypeOperation", new AbstractCDIEventCallback<FacilitytypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final FacilitytypeOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.FacilitytypeOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForFacilitytypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.FacilitytypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.FacilitytypeOperation", new AbstractCDIEventCallback<FacilitytypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final FacilitytypeOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.FacilitytypeOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForFacilitytypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.FacilitytypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.FacilitytypeOperation", new AbstractCDIEventCallback<FacilitytypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final FacilitytypeOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.FacilitytypeOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForFacilitytypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.FacilitytypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", new AbstractCDIEventCallback<FacilitytypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final FacilitytypeDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", new AbstractCDIEventCallback<FacilitytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final FacilitytypeListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", new AbstractCDIEventCallback<FacilitytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final FacilitytypeListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", new AbstractCDIEventCallback<FacilitytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final FacilitytypeListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", new AbstractCDIEventCallback<FacilitytypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final FacilitytypeEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", new AbstractCDIEventCallback<FacilitytypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final FacilitytypeEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", new AbstractCDIEventCallback<FacilitytypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final FacilitytypeDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", new AbstractCDIEventCallback<FacilitytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final FacilitytypeListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_f_CreateFacilitytypePageTemplateResource templateForCreateFacilitytypePage = GWT.create(c_c_h_c_l_f_CreateFacilitytypePageTemplateResource.class);
    Element parentElementForTemplateOfCreateFacilitytypePage = TemplateUtil.getRootTemplateParentElement(templateForCreateFacilitytypePage.getContents().getText(), "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateFacilitytypePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateFacilitytypePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseFacilitytypePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseFacilitytypePage_AnchorElement_listFacilitytypesPageLink(instance));
      }
    }, dataFieldElements, "listFacilitytypesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(CreateFacilitytypePage_FacilitytypeEditor_facilitytypeEditor(instance));
      }
    }, dataFieldElements, "facilitytypeEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseFacilitytypePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listFacilitytypesPageLink", ElementWrapperWidget.getWidget(BaseFacilitytypePage_AnchorElement_listFacilitytypesPageLink(instance)));
    templateFieldsMap.put("facilitytypeEditor", TemplateWidgetMapper.get(CreateFacilitytypePage_FacilitytypeEditor_facilitytypeEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateFacilitytypePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listFacilitytypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((CreateFacilitytypePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final CreateFacilitytypePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForFacilitytypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForFacilitytypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForFacilitytypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseFacilitytypePage_AnchorElement_listFacilitytypesPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final CreateFacilitytypePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseFacilitytypePage_TransitionTo_listFacilitytypesPage(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::listFacilitytypesPage;
  }-*/;

  native static void BaseFacilitytypePage_TransitionTo_listFacilitytypesPage(BaseFacilitytypePage instance, TransitionTo<ListFacilitytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::listFacilitytypesPage = value;
  }-*/;

  native static AnchorElement BaseFacilitytypePage_AnchorElement_listFacilitytypesPageLink(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::listFacilitytypesPageLink;
  }-*/;

  native static void BaseFacilitytypePage_AnchorElement_listFacilitytypesPageLink(BaseFacilitytypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::listFacilitytypesPageLink = value;
  }-*/;

  native static Caller BaseFacilitytypePage_Caller_facilitytypeService(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::facilitytypeService;
  }-*/;

  native static void BaseFacilitytypePage_Caller_facilitytypeService(BaseFacilitytypePage instance, Caller<FacilitytypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::facilitytypeService = value;
  }-*/;

  native static TransitionTo BaseFacilitytypePage_TransitionTo_createFacilitytypePage(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::createFacilitytypePage;
  }-*/;

  native static void BaseFacilitytypePage_TransitionTo_createFacilitytypePage(BaseFacilitytypePage instance, TransitionTo<CreateFacilitytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::createFacilitytypePage = value;
  }-*/;

  native static Caller BaseFacilitytypePage_Caller_universeService(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::universeService;
  }-*/;

  native static void BaseFacilitytypePage_Caller_universeService(BaseFacilitytypePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::universeService = value;
  }-*/;

  native static TransitionTo BaseFacilitytypePage_TransitionTo_viewFacilitytypePage(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::viewFacilitytypePage;
  }-*/;

  native static void BaseFacilitytypePage_TransitionTo_viewFacilitytypePage(BaseFacilitytypePage instance, TransitionTo<ViewFacilitytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::viewFacilitytypePage = value;
  }-*/;

  native static TransitionTo BaseFacilitytypePage_TransitionTo_editFacilitytypePage(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::editFacilitytypePage;
  }-*/;

  native static void BaseFacilitytypePage_TransitionTo_editFacilitytypePage(BaseFacilitytypePage instance, TransitionTo<EditFacilitytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::editFacilitytypePage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static FacilitytypeEditor CreateFacilitytypePage_FacilitytypeEditor_facilitytypeEditor(CreateFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage::facilitytypeEditor;
  }-*/;

  native static void CreateFacilitytypePage_FacilitytypeEditor_facilitytypeEditor(CreateFacilitytypePage instance, FacilitytypeEditor value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage::facilitytypeEditor = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Heading BaseFacilitytypePage_Heading_viewTitle(BaseFacilitytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::viewTitle;
  }-*/;

  native static void BaseFacilitytypePage_Heading_viewTitle(BaseFacilitytypePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage::viewTitle = value;
  }-*/;
}
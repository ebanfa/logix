package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.systemuser.BaseSystemuserPage;
import com.cloderia.helion.client.local.systemuser.CreateSystemuserPage;
import com.cloderia.helion.client.local.systemuser.EditSystemuserPage;
import com.cloderia.helion.client.local.systemuser.ListSystemuserPage;
import com.cloderia.helion.client.local.systemuser.SystemuserDisplay;
import com.cloderia.helion.client.local.systemuser.SystemuserEditor;
import com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay;
import com.cloderia.helion.client.local.systemuser.ViewSystemuserPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;
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

public class Type_factory__c_c_h_c_l_s_CreateSystemuserPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateSystemuserPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(CreateSystemuserPage.class, "Type_factory__c_c_h_c_l_s_CreateSystemuserPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_CreateSystemuserPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_CreateSystemuserPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(CreateSystemuserPage.class);
    handle.addAssignableType(BaseSystemuserPage.class);
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

  public CreateSystemuserPage createInstance(final ContextManager contextManager) {
    final CreateSystemuserPage instance = new CreateSystemuserPage();
    setIncompleteInstance(instance);
    final TransitionTo BaseSystemuserPage_viewSystemuserPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewSystemuserPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSystemuserPage_viewSystemuserPage);
    BaseSystemuserPage_TransitionTo_viewSystemuserPage(instance, BaseSystemuserPage_viewSystemuserPage);
    final Caller BaseSystemuserPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSystemuserPage_universeService);
    BaseSystemuserPage_Caller_universeService(instance, BaseSystemuserPage_universeService);
    final Heading BaseSystemuserPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseSystemuserPage_viewTitle);
    BaseSystemuserPage_Heading_viewTitle(instance, BaseSystemuserPage_viewTitle);
    final Caller BaseSystemuserPage_systemuserService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { SystemuserEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSystemuserPage_systemuserService);
    BaseSystemuserPage_Caller_systemuserService(instance, BaseSystemuserPage_systemuserService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseSystemuserPage_listSystemusersPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListSystemuserPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSystemuserPage_listSystemusersPage);
    BaseSystemuserPage_TransitionTo_listSystemusersPage(instance, BaseSystemuserPage_listSystemusersPage);
    final TransitionTo BaseSystemuserPage_createSystemuserPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateSystemuserPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSystemuserPage_createSystemuserPage);
    BaseSystemuserPage_TransitionTo_createSystemuserPage(instance, BaseSystemuserPage_createSystemuserPage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final SystemuserEditor CreateSystemuserPage_systemuserEditor = (SystemuserEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_s_SystemuserEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, CreateSystemuserPage_systemuserEditor);
    CreateSystemuserPage_SystemuserEditor_systemuserEditor(instance, CreateSystemuserPage_systemuserEditor);
    final TransitionTo BaseSystemuserPage_editSystemuserPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditSystemuserPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSystemuserPage_editSystemuserPage);
    BaseSystemuserPage_TransitionTo_editSystemuserPage(instance, BaseSystemuserPage_editSystemuserPage);
    final Caller BaseSystemuserPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseSystemuserPage_partyService);
    BaseSystemuserPage_Caller_partyService(instance, BaseSystemuserPage_partyService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.SystemuserOperation", new AbstractCDIEventCallback<SystemuserOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final SystemuserOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.SystemuserOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForSystemuserOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.SystemuserOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.SystemuserOperation", new AbstractCDIEventCallback<SystemuserOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final SystemuserOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.SystemuserOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForSystemuserOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.SystemuserOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.SystemuserOperation", new AbstractCDIEventCallback<SystemuserOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final SystemuserOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.SystemuserOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForSystemuserOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.SystemuserOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", new AbstractCDIEventCallback<SystemuserDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final SystemuserDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", new AbstractCDIEventCallback<SystemuserListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final SystemuserListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", new AbstractCDIEventCallback<SystemuserListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final SystemuserListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", new AbstractCDIEventCallback<SystemuserListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final SystemuserListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserEditor", new AbstractCDIEventCallback<SystemuserEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final SystemuserEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserEditor", new AbstractCDIEventCallback<SystemuserEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final SystemuserEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", new AbstractCDIEventCallback<SystemuserDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final SystemuserDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", new AbstractCDIEventCallback<SystemuserListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final SystemuserListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_s_CreateSystemuserPageTemplateResource templateForCreateSystemuserPage = GWT.create(c_c_h_c_l_s_CreateSystemuserPageTemplateResource.class);
    Element parentElementForTemplateOfCreateSystemuserPage = TemplateUtil.getRootTemplateParentElement(templateForCreateSystemuserPage.getContents().getText(), "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateSystemuserPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateSystemuserPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.CreateSystemuserPage", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.CreateSystemuserPage", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.CreateSystemuserPage", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseSystemuserPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.CreateSystemuserPage", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseSystemuserPage_AnchorElement_listSystemusersPageLink(instance));
      }
    }, dataFieldElements, "listSystemusersPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.CreateSystemuserPage", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(CreateSystemuserPage_SystemuserEditor_systemuserEditor(instance));
      }
    }, dataFieldElements, "systemuserEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseSystemuserPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listSystemusersPageLink", ElementWrapperWidget.getWidget(BaseSystemuserPage_AnchorElement_listSystemusersPageLink(instance)));
    templateFieldsMap.put("systemuserEditor", TemplateWidgetMapper.get(CreateSystemuserPage_SystemuserEditor_systemuserEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateSystemuserPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listSystemusersPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((CreateSystemuserPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final CreateSystemuserPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForSystemuserOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForSystemuserOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForSystemuserOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseSystemuserPage_AnchorElement_listSystemusersPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final CreateSystemuserPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Heading BaseSystemuserPage_Heading_viewTitle(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::viewTitle;
  }-*/;

  native static void BaseSystemuserPage_Heading_viewTitle(BaseSystemuserPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::viewTitle = value;
  }-*/;

  native static TransitionTo BaseSystemuserPage_TransitionTo_viewSystemuserPage(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::viewSystemuserPage;
  }-*/;

  native static void BaseSystemuserPage_TransitionTo_viewSystemuserPage(BaseSystemuserPage instance, TransitionTo<ViewSystemuserPage> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::viewSystemuserPage = value;
  }-*/;

  native static TransitionTo BaseSystemuserPage_TransitionTo_createSystemuserPage(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::createSystemuserPage;
  }-*/;

  native static void BaseSystemuserPage_TransitionTo_createSystemuserPage(BaseSystemuserPage instance, TransitionTo<CreateSystemuserPage> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::createSystemuserPage = value;
  }-*/;

  native static Caller BaseSystemuserPage_Caller_partyService(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::partyService;
  }-*/;

  native static void BaseSystemuserPage_Caller_partyService(BaseSystemuserPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::partyService = value;
  }-*/;

  native static AnchorElement BaseSystemuserPage_AnchorElement_listSystemusersPageLink(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::listSystemusersPageLink;
  }-*/;

  native static void BaseSystemuserPage_AnchorElement_listSystemusersPageLink(BaseSystemuserPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::listSystemusersPageLink = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static SystemuserEditor CreateSystemuserPage_SystemuserEditor_systemuserEditor(CreateSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.CreateSystemuserPage::systemuserEditor;
  }-*/;

  native static void CreateSystemuserPage_SystemuserEditor_systemuserEditor(CreateSystemuserPage instance, SystemuserEditor value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.CreateSystemuserPage::systemuserEditor = value;
  }-*/;

  native static Caller BaseSystemuserPage_Caller_universeService(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::universeService;
  }-*/;

  native static void BaseSystemuserPage_Caller_universeService(BaseSystemuserPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::universeService = value;
  }-*/;

  native static TransitionTo BaseSystemuserPage_TransitionTo_editSystemuserPage(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::editSystemuserPage;
  }-*/;

  native static void BaseSystemuserPage_TransitionTo_editSystemuserPage(BaseSystemuserPage instance, TransitionTo<EditSystemuserPage> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::editSystemuserPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BaseSystemuserPage_Caller_systemuserService(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::systemuserService;
  }-*/;

  native static void BaseSystemuserPage_Caller_systemuserService(BaseSystemuserPage instance, Caller<SystemuserEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::systemuserService = value;
  }-*/;

  native static TransitionTo BaseSystemuserPage_TransitionTo_listSystemusersPage(BaseSystemuserPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::listSystemusersPage;
  }-*/;

  native static void BaseSystemuserPage_TransitionTo_listSystemusersPage(BaseSystemuserPage instance, TransitionTo<ListSystemuserPage> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.BaseSystemuserPage::listSystemusersPage = value;
  }-*/;
}
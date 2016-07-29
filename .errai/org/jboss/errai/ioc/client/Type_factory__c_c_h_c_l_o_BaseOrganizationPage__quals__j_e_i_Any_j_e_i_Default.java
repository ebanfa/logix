package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organization.BaseOrganizationPage;
import com.cloderia.helion.client.local.organization.CreateOrganizationPage;
import com.cloderia.helion.client.local.organization.EditOrganizationPage;
import com.cloderia.helion.client.local.organization.ListOrganizationPage;
import com.cloderia.helion.client.local.organization.OrganizationDisplay;
import com.cloderia.helion.client.local.organization.OrganizationEditor;
import com.cloderia.helion.client.local.organization.OrganizationListItemDisplay;
import com.cloderia.helion.client.local.organization.ViewOrganizationPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.OrganizationEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.OrganizationOperation;
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

public class Type_factory__c_c_h_c_l_o_BaseOrganizationPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseOrganizationPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BaseOrganizationPage.class, "Type_factory__c_c_h_c_l_o_BaseOrganizationPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_BaseOrganizationPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organization/edit-organization-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_BaseOrganizationPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BaseOrganizationPage.class);
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

  public BaseOrganizationPage createInstance(final ContextManager contextManager) {
    final BaseOrganizationPage instance = new BaseOrganizationPage();
    setIncompleteInstance(instance);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseOrganizationPage_organizationService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { OrganizationEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationPage_organizationService);
    BaseOrganizationPage_Caller_organizationService(instance, BaseOrganizationPage_organizationService);
    final Caller BaseOrganizationPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationPage_universeService);
    BaseOrganizationPage_Caller_universeService(instance, BaseOrganizationPage_universeService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseOrganizationPage_createOrganizationPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateOrganizationPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationPage_createOrganizationPage);
    BaseOrganizationPage_TransitionTo_createOrganizationPage(instance, BaseOrganizationPage_createOrganizationPage);
    final Caller BaseOrganizationPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationPage_partyService);
    BaseOrganizationPage_Caller_partyService(instance, BaseOrganizationPage_partyService);
    final TransitionTo BaseOrganizationPage_editOrganizationPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditOrganizationPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationPage_editOrganizationPage);
    BaseOrganizationPage_TransitionTo_editOrganizationPage(instance, BaseOrganizationPage_editOrganizationPage);
    final TransitionTo BaseOrganizationPage_listOrganizationsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationPage_listOrganizationsPage);
    BaseOrganizationPage_TransitionTo_listOrganizationsPage(instance, BaseOrganizationPage_listOrganizationsPage);
    final Heading BaseOrganizationPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseOrganizationPage_viewTitle);
    BaseOrganizationPage_Heading_viewTitle(instance, BaseOrganizationPage_viewTitle);
    final TransitionTo BaseOrganizationPage_viewOrganizationPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewOrganizationPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationPage_viewOrganizationPage);
    BaseOrganizationPage_TransitionTo_viewOrganizationPage(instance, BaseOrganizationPage_viewOrganizationPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationOperation", new AbstractCDIEventCallback<OrganizationOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final OrganizationOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForOrganizationOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationOperation", new AbstractCDIEventCallback<OrganizationOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final OrganizationOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForOrganizationOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationOperation", new AbstractCDIEventCallback<OrganizationOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final OrganizationOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForOrganizationOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationDisplay", new AbstractCDIEventCallback<OrganizationDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final OrganizationDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", new AbstractCDIEventCallback<OrganizationListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final OrganizationListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", new AbstractCDIEventCallback<OrganizationListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final OrganizationListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", new AbstractCDIEventCallback<OrganizationListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final OrganizationListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationEditor", new AbstractCDIEventCallback<OrganizationEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final OrganizationEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationEditor", new AbstractCDIEventCallback<OrganizationEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final OrganizationEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationDisplay", new AbstractCDIEventCallback<OrganizationDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final OrganizationDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", new AbstractCDIEventCallback<OrganizationListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final OrganizationListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organization.OrganizationListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_o_BaseOrganizationPageTemplateResource templateForBaseOrganizationPage = GWT.create(c_c_h_c_l_o_BaseOrganizationPageTemplateResource.class);
    Element parentElementForTemplateOfBaseOrganizationPage = TemplateUtil.getRootTemplateParentElement(templateForBaseOrganizationPage.getContents().getText(), "com/cloderia/helion/client/local/organization/edit-organization-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organization/edit-organization-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseOrganizationPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseOrganizationPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.BaseOrganizationPage", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.BaseOrganizationPage", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.BaseOrganizationPage", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseOrganizationPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.BaseOrganizationPage", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseOrganizationPage_AnchorElement_listOrganizationsPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationsPageLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseOrganizationPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listOrganizationsPageLink", ElementWrapperWidget.getWidget(BaseOrganizationPage_AnchorElement_listOrganizationsPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseOrganizationPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BaseOrganizationPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final BaseOrganizationPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForOrganizationOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForOrganizationOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForOrganizationOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseOrganizationPage_AnchorElement_listOrganizationsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final BaseOrganizationPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BaseOrganizationPage_Caller_partyService(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::partyService;
  }-*/;

  native static void BaseOrganizationPage_Caller_partyService(BaseOrganizationPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::partyService = value;
  }-*/;

  native static Heading BaseOrganizationPage_Heading_viewTitle(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::viewTitle;
  }-*/;

  native static void BaseOrganizationPage_Heading_viewTitle(BaseOrganizationPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::viewTitle = value;
  }-*/;

  native static TransitionTo BaseOrganizationPage_TransitionTo_viewOrganizationPage(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::viewOrganizationPage;
  }-*/;

  native static void BaseOrganizationPage_TransitionTo_viewOrganizationPage(BaseOrganizationPage instance, TransitionTo<ViewOrganizationPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::viewOrganizationPage = value;
  }-*/;

  native static Caller BaseOrganizationPage_Caller_universeService(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::universeService;
  }-*/;

  native static void BaseOrganizationPage_Caller_universeService(BaseOrganizationPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::universeService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BaseOrganizationPage_Caller_organizationService(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::organizationService;
  }-*/;

  native static void BaseOrganizationPage_Caller_organizationService(BaseOrganizationPage instance, Caller<OrganizationEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::organizationService = value;
  }-*/;

  native static TransitionTo BaseOrganizationPage_TransitionTo_createOrganizationPage(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::createOrganizationPage;
  }-*/;

  native static void BaseOrganizationPage_TransitionTo_createOrganizationPage(BaseOrganizationPage instance, TransitionTo<CreateOrganizationPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::createOrganizationPage = value;
  }-*/;

  native static TransitionTo BaseOrganizationPage_TransitionTo_listOrganizationsPage(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::listOrganizationsPage;
  }-*/;

  native static void BaseOrganizationPage_TransitionTo_listOrganizationsPage(BaseOrganizationPage instance, TransitionTo<ListOrganizationPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::listOrganizationsPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static AnchorElement BaseOrganizationPage_AnchorElement_listOrganizationsPageLink(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::listOrganizationsPageLink;
  }-*/;

  native static void BaseOrganizationPage_AnchorElement_listOrganizationsPageLink(BaseOrganizationPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::listOrganizationsPageLink = value;
  }-*/;

  native static TransitionTo BaseOrganizationPage_TransitionTo_editOrganizationPage(BaseOrganizationPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::editOrganizationPage;
  }-*/;

  native static void BaseOrganizationPage_TransitionTo_editOrganizationPage(BaseOrganizationPage instance, TransitionTo<EditOrganizationPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.BaseOrganizationPage::editOrganizationPage = value;
  }-*/;
}
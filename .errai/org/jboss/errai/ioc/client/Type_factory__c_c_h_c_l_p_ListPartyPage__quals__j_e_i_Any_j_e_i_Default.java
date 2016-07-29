package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.party.BasePartyPage;
import com.cloderia.helion.client.local.party.CreatePartyPage;
import com.cloderia.helion.client.local.party.EditPartyPage;
import com.cloderia.helion.client.local.party.ListPartyPage;
import com.cloderia.helion.client.local.party.PartyDisplay;
import com.cloderia.helion.client.local.party.PartyEditor;
import com.cloderia.helion.client.local.party.PartyListItemDisplay;
import com.cloderia.helion.client.local.party.PartyListWidget;
import com.cloderia.helion.client.local.party.ViewPartyPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.PartyOperation;
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

public class Type_factory__c_c_h_c_l_p_ListPartyPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartyPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListPartyPage.class, "Type_factory__c_c_h_c_l_p_ListPartyPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ListPartyPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/party/list-party-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ListPartyPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListPartyPage.class);
    handle.addAssignableType(BasePartyPage.class);
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

  public ListPartyPage createInstance(final ContextManager contextManager) {
    final ListPartyPage instance = new ListPartyPage();
    setIncompleteInstance(instance);
    final TransitionTo BasePartyPage_editPartyPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditPartyPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyPage_editPartyPage);
    BasePartyPage_TransitionTo_editPartyPage(instance, BasePartyPage_editPartyPage);
    final Caller BasePartyPage_partytypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartytypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyPage_partytypeService);
    BasePartyPage_Caller_partytypeService(instance, BasePartyPage_partytypeService);
    final TransitionTo BasePartyPage_viewPartyPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewPartyPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyPage_viewPartyPage);
    BasePartyPage_TransitionTo_viewPartyPage(instance, BasePartyPage_viewPartyPage);
    final PartyListWidget ListPartyPage_listWidget = (PartyListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_p_PartyListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListPartyPage_listWidget);
    ListPartyPage_PartyListWidget_listWidget(instance, ListPartyPage_listWidget);
    final TransitionTo BasePartyPage_createPartyPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreatePartyPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyPage_createPartyPage);
    BasePartyPage_TransitionTo_createPartyPage(instance, BasePartyPage_createPartyPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BasePartyPage_listPartysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyPage_listPartysPage);
    BasePartyPage_TransitionTo_listPartysPage(instance, BasePartyPage_listPartysPage);
    final Caller BasePartyPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyPage_partyService);
    BasePartyPage_Caller_partyService(instance, BasePartyPage_partyService);
    final Heading BasePartyPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BasePartyPage_viewTitle);
    BasePartyPage_Heading_viewTitle(instance, BasePartyPage_viewTitle);
    final Caller BasePartyPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyPage_universeService);
    BasePartyPage_Caller_universeService(instance, BasePartyPage_universeService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyOperation", new AbstractCDIEventCallback<PartyOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final PartyOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForPartyOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyOperation", new AbstractCDIEventCallback<PartyOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final PartyOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForPartyOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyOperation", new AbstractCDIEventCallback<PartyOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final PartyOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForPartyOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyDisplay", new AbstractCDIEventCallback<PartyDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartyDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyListItemDisplay", new AbstractCDIEventCallback<PartyListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final PartyListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyListItemDisplay", new AbstractCDIEventCallback<PartyListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final PartyListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyListItemDisplay", new AbstractCDIEventCallback<PartyListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartyListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyEditor", new AbstractCDIEventCallback<PartyEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final PartyEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyEditor", new AbstractCDIEventCallback<PartyEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final PartyEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyDisplay", new AbstractCDIEventCallback<PartyDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartyDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.party.PartyListItemDisplay", new AbstractCDIEventCallback<PartyListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartyListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.party.PartyListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_ListPartyPageTemplateResource templateForListPartyPage = GWT.create(c_c_h_c_l_p_ListPartyPageTemplateResource.class);
    Element parentElementForTemplateOfListPartyPage = TemplateUtil.getRootTemplateParentElement(templateForListPartyPage.getContents().getText(), "com/cloderia/helion/client/local/party/list-party-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/party/list-party-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.ListPartyPage", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.ListPartyPage", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.ListPartyPage", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartyPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.ListPartyPage", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BasePartyPage_AnchorElement_listPartysPageLink(instance));
      }
    }, dataFieldElements, "listPartysPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.ListPartyPage", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListPartyPage_PartyListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.ListPartyPage", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListPartyPage_AnchorElement_createNewPartyLink(instance));
      }
    }, dataFieldElements, "createNewPartyLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartyPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listPartysPageLink", ElementWrapperWidget.getWidget(BasePartyPage_AnchorElement_listPartysPageLink(instance)));
    templateFieldsMap.put("listWidget", ListPartyPage_PartyListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewPartyLink", ElementWrapperWidget.getWidget(ListPartyPage_AnchorElement_createNewPartyLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewPartyLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListPartyPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListPartyPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForPartyOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForPartyOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForPartyOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BasePartyPage_AnchorElement_listPartysPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListPartyPage_AnchorElement_createNewPartyLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListPartyPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BasePartyPage_Caller_partytypeService(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::partytypeService;
  }-*/;

  native static void BasePartyPage_Caller_partytypeService(BasePartyPage instance, Caller<PartytypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::partytypeService = value;
  }-*/;

  native static TransitionTo BasePartyPage_TransitionTo_listPartysPage(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::listPartysPage;
  }-*/;

  native static void BasePartyPage_TransitionTo_listPartysPage(BasePartyPage instance, TransitionTo<ListPartyPage> value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::listPartysPage = value;
  }-*/;

  native static TransitionTo BasePartyPage_TransitionTo_createPartyPage(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::createPartyPage;
  }-*/;

  native static void BasePartyPage_TransitionTo_createPartyPage(BasePartyPage instance, TransitionTo<CreatePartyPage> value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::createPartyPage = value;
  }-*/;

  native static Caller BasePartyPage_Caller_partyService(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::partyService;
  }-*/;

  native static void BasePartyPage_Caller_partyService(BasePartyPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::partyService = value;
  }-*/;

  native static TransitionTo BasePartyPage_TransitionTo_viewPartyPage(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::viewPartyPage;
  }-*/;

  native static void BasePartyPage_TransitionTo_viewPartyPage(BasePartyPage instance, TransitionTo<ViewPartyPage> value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::viewPartyPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BasePartyPage_TransitionTo_editPartyPage(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::editPartyPage;
  }-*/;

  native static void BasePartyPage_TransitionTo_editPartyPage(BasePartyPage instance, TransitionTo<EditPartyPage> value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::editPartyPage = value;
  }-*/;

  native static PartyListWidget ListPartyPage_PartyListWidget_listWidget(ListPartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.ListPartyPage::listWidget;
  }-*/;

  native static void ListPartyPage_PartyListWidget_listWidget(ListPartyPage instance, PartyListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.party.ListPartyPage::listWidget = value;
  }-*/;

  native static Heading BasePartyPage_Heading_viewTitle(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::viewTitle;
  }-*/;

  native static void BasePartyPage_Heading_viewTitle(BasePartyPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::viewTitle = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static AnchorElement ListPartyPage_AnchorElement_createNewPartyLink(ListPartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.ListPartyPage::createNewPartyLink;
  }-*/;

  native static void ListPartyPage_AnchorElement_createNewPartyLink(ListPartyPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.ListPartyPage::createNewPartyLink = value;
  }-*/;

  native static Caller BasePartyPage_Caller_universeService(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::universeService;
  }-*/;

  native static void BasePartyPage_Caller_universeService(BasePartyPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::universeService = value;
  }-*/;

  native static AnchorElement BasePartyPage_AnchorElement_listPartysPageLink(BasePartyPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.BasePartyPage::listPartysPageLink;
  }-*/;

  native static void BasePartyPage_AnchorElement_listPartysPageLink(BasePartyPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.BasePartyPage::listPartysPageLink = value;
  }-*/;
}
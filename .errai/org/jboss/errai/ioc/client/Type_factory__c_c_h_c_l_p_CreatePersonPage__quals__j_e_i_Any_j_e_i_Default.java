package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.person.BasePersonPage;
import com.cloderia.helion.client.local.person.CreatePersonPage;
import com.cloderia.helion.client.local.person.EditPersonPage;
import com.cloderia.helion.client.local.person.ListPersonPage;
import com.cloderia.helion.client.local.person.PersonDisplay;
import com.cloderia.helion.client.local.person.PersonEditor;
import com.cloderia.helion.client.local.person.PersonListItemDisplay;
import com.cloderia.helion.client.local.person.ViewPersonPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.PersonEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.PersonOperation;
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

public class Type_factory__c_c_h_c_l_p_CreatePersonPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePersonPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(CreatePersonPage.class, "Type_factory__c_c_h_c_l_p_CreatePersonPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_CreatePersonPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/person/edit-person-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_CreatePersonPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(CreatePersonPage.class);
    handle.addAssignableType(BasePersonPage.class);
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

  public CreatePersonPage createInstance(final ContextManager contextManager) {
    final CreatePersonPage instance = new CreatePersonPage();
    setIncompleteInstance(instance);
    final PersonEditor CreatePersonPage_personEditor = (PersonEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_p_PersonEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, CreatePersonPage_personEditor);
    CreatePersonPage_PersonEditor_personEditor(instance, CreatePersonPage_personEditor);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BasePersonPage_personService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PersonEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePersonPage_personService);
    BasePersonPage_Caller_personService(instance, BasePersonPage_personService);
    final TransitionTo BasePersonPage_viewPersonPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewPersonPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePersonPage_viewPersonPage);
    BasePersonPage_TransitionTo_viewPersonPage(instance, BasePersonPage_viewPersonPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BasePersonPage_listPersonsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPersonPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePersonPage_listPersonsPage);
    BasePersonPage_TransitionTo_listPersonsPage(instance, BasePersonPage_listPersonsPage);
    final TransitionTo BasePersonPage_createPersonPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreatePersonPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePersonPage_createPersonPage);
    BasePersonPage_TransitionTo_createPersonPage(instance, BasePersonPage_createPersonPage);
    final Caller BasePersonPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePersonPage_universeService);
    BasePersonPage_Caller_universeService(instance, BasePersonPage_universeService);
    final Heading BasePersonPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BasePersonPage_viewTitle);
    BasePersonPage_Heading_viewTitle(instance, BasePersonPage_viewTitle);
    final TransitionTo BasePersonPage_editPersonPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditPersonPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePersonPage_editPersonPage);
    BasePersonPage_TransitionTo_editPersonPage(instance, BasePersonPage_editPersonPage);
    final Caller BasePersonPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePersonPage_partyService);
    BasePersonPage_Caller_partyService(instance, BasePersonPage_partyService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PersonOperation", new AbstractCDIEventCallback<PersonOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final PersonOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PersonOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForPersonOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PersonOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PersonOperation", new AbstractCDIEventCallback<PersonOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final PersonOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PersonOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForPersonOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PersonOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PersonOperation", new AbstractCDIEventCallback<PersonOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final PersonOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PersonOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForPersonOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PersonOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonDisplay", new AbstractCDIEventCallback<PersonDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PersonDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonListItemDisplay", new AbstractCDIEventCallback<PersonListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final PersonListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonListItemDisplay", new AbstractCDIEventCallback<PersonListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final PersonListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonListItemDisplay", new AbstractCDIEventCallback<PersonListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PersonListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonEditor", new AbstractCDIEventCallback<PersonEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final PersonEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonEditor", new AbstractCDIEventCallback<PersonEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final PersonEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonDisplay", new AbstractCDIEventCallback<PersonDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PersonDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.person.PersonListItemDisplay", new AbstractCDIEventCallback<PersonListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PersonListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.person.PersonListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_CreatePersonPageTemplateResource templateForCreatePersonPage = GWT.create(c_c_h_c_l_p_CreatePersonPageTemplateResource.class);
    Element parentElementForTemplateOfCreatePersonPage = TemplateUtil.getRootTemplateParentElement(templateForCreatePersonPage.getContents().getText(), "com/cloderia/helion/client/local/person/edit-person-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/person/edit-person-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreatePersonPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreatePersonPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.CreatePersonPage", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.CreatePersonPage", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.CreatePersonPage", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePersonPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.CreatePersonPage", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BasePersonPage_AnchorElement_listPersonsPageLink(instance));
      }
    }, dataFieldElements, "listPersonsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.CreatePersonPage", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(CreatePersonPage_PersonEditor_personEditor(instance));
      }
    }, dataFieldElements, "personEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePersonPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listPersonsPageLink", ElementWrapperWidget.getWidget(BasePersonPage_AnchorElement_listPersonsPageLink(instance)));
    templateFieldsMap.put("personEditor", TemplateWidgetMapper.get(CreatePersonPage_PersonEditor_personEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreatePersonPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPersonsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((CreatePersonPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final CreatePersonPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForPersonOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForPersonOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForPersonOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BasePersonPage_AnchorElement_listPersonsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final CreatePersonPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Heading BasePersonPage_Heading_viewTitle(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::viewTitle;
  }-*/;

  native static void BasePersonPage_Heading_viewTitle(BasePersonPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::viewTitle = value;
  }-*/;

  native static TransitionTo BasePersonPage_TransitionTo_editPersonPage(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::editPersonPage;
  }-*/;

  native static void BasePersonPage_TransitionTo_editPersonPage(BasePersonPage instance, TransitionTo<EditPersonPage> value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::editPersonPage = value;
  }-*/;

  native static TransitionTo BasePersonPage_TransitionTo_listPersonsPage(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::listPersonsPage;
  }-*/;

  native static void BasePersonPage_TransitionTo_listPersonsPage(BasePersonPage instance, TransitionTo<ListPersonPage> value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::listPersonsPage = value;
  }-*/;

  native static PersonEditor CreatePersonPage_PersonEditor_personEditor(CreatePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.CreatePersonPage::personEditor;
  }-*/;

  native static void CreatePersonPage_PersonEditor_personEditor(CreatePersonPage instance, PersonEditor value) /*-{
    instance.@com.cloderia.helion.client.local.person.CreatePersonPage::personEditor = value;
  }-*/;

  native static Caller BasePersonPage_Caller_partyService(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::partyService;
  }-*/;

  native static void BasePersonPage_Caller_partyService(BasePersonPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::partyService = value;
  }-*/;

  native static AnchorElement BasePersonPage_AnchorElement_listPersonsPageLink(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::listPersonsPageLink;
  }-*/;

  native static void BasePersonPage_AnchorElement_listPersonsPageLink(BasePersonPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::listPersonsPageLink = value;
  }-*/;

  native static TransitionTo BasePersonPage_TransitionTo_createPersonPage(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::createPersonPage;
  }-*/;

  native static void BasePersonPage_TransitionTo_createPersonPage(BasePersonPage instance, TransitionTo<CreatePersonPage> value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::createPersonPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BasePersonPage_Caller_personService(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::personService;
  }-*/;

  native static void BasePersonPage_Caller_personService(BasePersonPage instance, Caller<PersonEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::personService = value;
  }-*/;

  native static TransitionTo BasePersonPage_TransitionTo_viewPersonPage(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::viewPersonPage;
  }-*/;

  native static void BasePersonPage_TransitionTo_viewPersonPage(BasePersonPage instance, TransitionTo<ViewPersonPage> value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::viewPersonPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BasePersonPage_Caller_universeService(BasePersonPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.BasePersonPage::universeService;
  }-*/;

  native static void BasePersonPage_Caller_universeService(BasePersonPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.person.BasePersonPage::universeService = value;
  }-*/;
}
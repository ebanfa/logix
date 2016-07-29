package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.CreatePartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.EditPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget;
import com.cloderia.helion.client.local.partyroletype.ViewPartyroletypePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartyroletypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;
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

public class Type_factory__c_c_h_c_l_p_ListPartyroletypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartyroletypePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListPartyroletypePage.class, "Type_factory__c_c_h_c_l_p_ListPartyroletypePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ListPartyroletypePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ListPartyroletypePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListPartyroletypePage.class);
    handle.addAssignableType(BasePartyroletypePage.class);
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

  public ListPartyroletypePage createInstance(final ContextManager contextManager) {
    final ListPartyroletypePage instance = new ListPartyroletypePage();
    setIncompleteInstance(instance);
    final Heading BasePartyroletypePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BasePartyroletypePage_viewTitle);
    BasePartyroletypePage_Heading_viewTitle(instance, BasePartyroletypePage_viewTitle);
    final TransitionTo BasePartyroletypePage_listPartyroletypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyroletypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyroletypePage_listPartyroletypesPage);
    BasePartyroletypePage_TransitionTo_listPartyroletypesPage(instance, BasePartyroletypePage_listPartyroletypesPage);
    final TransitionTo BasePartyroletypePage_viewPartyroletypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewPartyroletypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyroletypePage_viewPartyroletypePage);
    BasePartyroletypePage_TransitionTo_viewPartyroletypePage(instance, BasePartyroletypePage_viewPartyroletypePage);
    final Caller BasePartyroletypePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyroletypePage_universeService);
    BasePartyroletypePage_Caller_universeService(instance, BasePartyroletypePage_universeService);
    final TransitionTo BasePartyroletypePage_createPartyroletypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreatePartyroletypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyroletypePage_createPartyroletypePage);
    BasePartyroletypePage_TransitionTo_createPartyroletypePage(instance, BasePartyroletypePage_createPartyroletypePage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final PartyroletypeListWidget ListPartyroletypePage_listWidget = (PartyroletypeListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_p_PartyroletypeListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListPartyroletypePage_listWidget);
    ListPartyroletypePage_PartyroletypeListWidget_listWidget(instance, ListPartyroletypePage_listWidget);
    final TransitionTo BasePartyroletypePage_editPartyroletypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditPartyroletypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyroletypePage_editPartyroletypePage);
    BasePartyroletypePage_TransitionTo_editPartyroletypePage(instance, BasePartyroletypePage_editPartyroletypePage);
    final Caller BasePartyroletypePage_partyroletypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyroletypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyroletypePage_partyroletypeService);
    BasePartyroletypePage_Caller_partyroletypeService(instance, BasePartyroletypePage_partyroletypeService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyroletypeOperation", new AbstractCDIEventCallback<PartyroletypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final PartyroletypeOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyroletypeOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForPartyroletypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyroletypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyroletypeOperation", new AbstractCDIEventCallback<PartyroletypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final PartyroletypeOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyroletypeOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForPartyroletypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyroletypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyroletypeOperation", new AbstractCDIEventCallback<PartyroletypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final PartyroletypeOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyroletypeOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForPartyroletypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyroletypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", new AbstractCDIEventCallback<PartyroletypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartyroletypeDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", new AbstractCDIEventCallback<PartyroletypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final PartyroletypeListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", new AbstractCDIEventCallback<PartyroletypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final PartyroletypeListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", new AbstractCDIEventCallback<PartyroletypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartyroletypeListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", new AbstractCDIEventCallback<PartyroletypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final PartyroletypeEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", new AbstractCDIEventCallback<PartyroletypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final PartyroletypeEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", new AbstractCDIEventCallback<PartyroletypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartyroletypeDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", new AbstractCDIEventCallback<PartyroletypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartyroletypeListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_ListPartyroletypePageTemplateResource templateForListPartyroletypePage = GWT.create(c_c_h_c_l_p_ListPartyroletypePageTemplateResource.class);
    Element parentElementForTemplateOfListPartyroletypePage = TemplateUtil.getRootTemplateParentElement(templateForListPartyroletypePage.getContents().getText(), "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyroletypePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyroletypePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartyroletypePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BasePartyroletypePage_AnchorElement_listPartyroletypesPageLink(instance));
      }
    }, dataFieldElements, "listPartyroletypesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListPartyroletypePage_PartyroletypeListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListPartyroletypePage_AnchorElement_createNewPartyroletypeLink(instance));
      }
    }, dataFieldElements, "createNewPartyroletypeLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartyroletypePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listPartyroletypesPageLink", ElementWrapperWidget.getWidget(BasePartyroletypePage_AnchorElement_listPartyroletypesPageLink(instance)));
    templateFieldsMap.put("listWidget", ListPartyroletypePage_PartyroletypeListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewPartyroletypeLink", ElementWrapperWidget.getWidget(ListPartyroletypePage_AnchorElement_createNewPartyroletypeLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyroletypePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewPartyroletypeLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartyroletypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListPartyroletypePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListPartyroletypePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForPartyroletypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForPartyroletypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForPartyroletypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BasePartyroletypePage_AnchorElement_listPartyroletypesPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListPartyroletypePage_AnchorElement_createNewPartyroletypeLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListPartyroletypePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BasePartyroletypePage_Caller_universeService(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::universeService;
  }-*/;

  native static void BasePartyroletypePage_Caller_universeService(BasePartyroletypePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::universeService = value;
  }-*/;

  native static PartyroletypeListWidget ListPartyroletypePage_PartyroletypeListWidget_listWidget(ListPartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage::listWidget;
  }-*/;

  native static void ListPartyroletypePage_PartyroletypeListWidget_listWidget(ListPartyroletypePage instance, PartyroletypeListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage::listWidget = value;
  }-*/;

  native static AnchorElement BasePartyroletypePage_AnchorElement_listPartyroletypesPageLink(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::listPartyroletypesPageLink;
  }-*/;

  native static void BasePartyroletypePage_AnchorElement_listPartyroletypesPageLink(BasePartyroletypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::listPartyroletypesPageLink = value;
  }-*/;

  native static Caller BasePartyroletypePage_Caller_partyroletypeService(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::partyroletypeService;
  }-*/;

  native static void BasePartyroletypePage_Caller_partyroletypeService(BasePartyroletypePage instance, Caller<PartyroletypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::partyroletypeService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static AnchorElement ListPartyroletypePage_AnchorElement_createNewPartyroletypeLink(ListPartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage::createNewPartyroletypeLink;
  }-*/;

  native static void ListPartyroletypePage_AnchorElement_createNewPartyroletypeLink(ListPartyroletypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage::createNewPartyroletypeLink = value;
  }-*/;

  native static TransitionTo BasePartyroletypePage_TransitionTo_listPartyroletypesPage(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::listPartyroletypesPage;
  }-*/;

  native static void BasePartyroletypePage_TransitionTo_listPartyroletypesPage(BasePartyroletypePage instance, TransitionTo<ListPartyroletypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::listPartyroletypesPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static TransitionTo BasePartyroletypePage_TransitionTo_createPartyroletypePage(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::createPartyroletypePage;
  }-*/;

  native static void BasePartyroletypePage_TransitionTo_createPartyroletypePage(BasePartyroletypePage instance, TransitionTo<CreatePartyroletypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::createPartyroletypePage = value;
  }-*/;

  native static TransitionTo BasePartyroletypePage_TransitionTo_viewPartyroletypePage(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::viewPartyroletypePage;
  }-*/;

  native static void BasePartyroletypePage_TransitionTo_viewPartyroletypePage(BasePartyroletypePage instance, TransitionTo<ViewPartyroletypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::viewPartyroletypePage = value;
  }-*/;

  native static Heading BasePartyroletypePage_Heading_viewTitle(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::viewTitle;
  }-*/;

  native static void BasePartyroletypePage_Heading_viewTitle(BasePartyroletypePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::viewTitle = value;
  }-*/;

  native static TransitionTo BasePartyroletypePage_TransitionTo_editPartyroletypePage(BasePartyroletypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::editPartyroletypePage;
  }-*/;

  native static void BasePartyroletypePage_TransitionTo_editPartyroletypePage(BasePartyroletypePage instance, TransitionTo<EditPartyroletypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage::editPartyroletypePage = value;
  }-*/;
}
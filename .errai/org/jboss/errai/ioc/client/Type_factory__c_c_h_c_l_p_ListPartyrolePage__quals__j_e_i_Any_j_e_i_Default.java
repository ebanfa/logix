package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyrole.BasePartyrolePage;
import com.cloderia.helion.client.local.partyrole.CreatePartyrolePage;
import com.cloderia.helion.client.local.partyrole.EditPartyrolePage;
import com.cloderia.helion.client.local.partyrole.ListPartyrolePage;
import com.cloderia.helion.client.local.partyrole.PartyroleDisplay;
import com.cloderia.helion.client.local.partyrole.PartyroleEditor;
import com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay;
import com.cloderia.helion.client.local.partyrole.PartyroleListWidget;
import com.cloderia.helion.client.local.partyrole.ViewPartyrolePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyroleEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyroletypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;
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

public class Type_factory__c_c_h_c_l_p_ListPartyrolePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartyrolePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListPartyrolePage.class, "Type_factory__c_c_h_c_l_p_ListPartyrolePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ListPartyrolePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyrole/list-partyrole-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ListPartyrolePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListPartyrolePage.class);
    handle.addAssignableType(BasePartyrolePage.class);
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

  public ListPartyrolePage createInstance(final ContextManager contextManager) {
    final ListPartyrolePage instance = new ListPartyrolePage();
    setIncompleteInstance(instance);
    final TransitionTo BasePartyrolePage_editPartyrolePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditPartyrolePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_editPartyrolePage);
    BasePartyrolePage_TransitionTo_editPartyrolePage(instance, BasePartyrolePage_editPartyrolePage);
    final Caller BasePartyrolePage_partyroletypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyroletypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_partyroletypeService);
    BasePartyrolePage_Caller_partyroletypeService(instance, BasePartyrolePage_partyroletypeService);
    final Caller BasePartyrolePage_partyroleService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyroleEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_partyroleService);
    BasePartyrolePage_Caller_partyroleService(instance, BasePartyrolePage_partyroleService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Heading BasePartyrolePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BasePartyrolePage_viewTitle);
    BasePartyrolePage_Heading_viewTitle(instance, BasePartyrolePage_viewTitle);
    final Caller BasePartyrolePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_universeService);
    BasePartyrolePage_Caller_universeService(instance, BasePartyrolePage_universeService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final PartyroleListWidget ListPartyrolePage_listWidget = (PartyroleListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_p_PartyroleListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListPartyrolePage_listWidget);
    ListPartyrolePage_PartyroleListWidget_listWidget(instance, ListPartyrolePage_listWidget);
    final TransitionTo BasePartyrolePage_createPartyrolePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreatePartyrolePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_createPartyrolePage);
    BasePartyrolePage_TransitionTo_createPartyrolePage(instance, BasePartyrolePage_createPartyrolePage);
    final Caller BasePartyrolePage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_partyService);
    BasePartyrolePage_Caller_partyService(instance, BasePartyrolePage_partyService);
    final TransitionTo BasePartyrolePage_viewPartyrolePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewPartyrolePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_viewPartyrolePage);
    BasePartyrolePage_TransitionTo_viewPartyrolePage(instance, BasePartyrolePage_viewPartyrolePage);
    final TransitionTo BasePartyrolePage_listPartyrolesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyrolePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartyrolePage_listPartyrolesPage);
    BasePartyrolePage_TransitionTo_listPartyrolesPage(instance, BasePartyrolePage_listPartyrolesPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyroleOperation", new AbstractCDIEventCallback<PartyroleOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final PartyroleOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyroleOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForPartyroleOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyroleOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyroleOperation", new AbstractCDIEventCallback<PartyroleOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final PartyroleOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyroleOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForPartyroleOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyroleOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartyroleOperation", new AbstractCDIEventCallback<PartyroleOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final PartyroleOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartyroleOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForPartyroleOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartyroleOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", new AbstractCDIEventCallback<PartyroleDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartyroleDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", new AbstractCDIEventCallback<PartyroleListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final PartyroleListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", new AbstractCDIEventCallback<PartyroleListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final PartyroleListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", new AbstractCDIEventCallback<PartyroleListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartyroleListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleEditor", new AbstractCDIEventCallback<PartyroleEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final PartyroleEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleEditor", new AbstractCDIEventCallback<PartyroleEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final PartyroleEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", new AbstractCDIEventCallback<PartyroleDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartyroleDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", new AbstractCDIEventCallback<PartyroleListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartyroleListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_ListPartyrolePageTemplateResource templateForListPartyrolePage = GWT.create(c_c_h_c_l_p_ListPartyrolePageTemplateResource.class);
    Element parentElementForTemplateOfListPartyrolePage = TemplateUtil.getRootTemplateParentElement(templateForListPartyrolePage.getContents().getText(), "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyrolePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyrolePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.ListPartyrolePage", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.ListPartyrolePage", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.ListPartyrolePage", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartyrolePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.ListPartyrolePage", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BasePartyrolePage_AnchorElement_listPartyrolesPageLink(instance));
      }
    }, dataFieldElements, "listPartyrolesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.ListPartyrolePage", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListPartyrolePage_PartyroleListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.ListPartyrolePage", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListPartyrolePage_AnchorElement_createNewPartyroleLink(instance));
      }
    }, dataFieldElements, "createNewPartyroleLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartyrolePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listPartyrolesPageLink", ElementWrapperWidget.getWidget(BasePartyrolePage_AnchorElement_listPartyrolesPageLink(instance)));
    templateFieldsMap.put("listWidget", ListPartyrolePage_PartyroleListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewPartyroleLink", ElementWrapperWidget.getWidget(ListPartyrolePage_AnchorElement_createNewPartyroleLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListPartyrolePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewPartyroleLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartyrolesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListPartyrolePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListPartyrolePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForPartyroleOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForPartyroleOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForPartyroleOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BasePartyrolePage_AnchorElement_listPartyrolesPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListPartyrolePage_AnchorElement_createNewPartyroleLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListPartyrolePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BasePartyrolePage_TransitionTo_listPartyrolesPage(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::listPartyrolesPage;
  }-*/;

  native static void BasePartyrolePage_TransitionTo_listPartyrolesPage(BasePartyrolePage instance, TransitionTo<ListPartyrolePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::listPartyrolesPage = value;
  }-*/;

  native static PartyroleListWidget ListPartyrolePage_PartyroleListWidget_listWidget(ListPartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.ListPartyrolePage::listWidget;
  }-*/;

  native static void ListPartyrolePage_PartyroleListWidget_listWidget(ListPartyrolePage instance, PartyroleListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.ListPartyrolePage::listWidget = value;
  }-*/;

  native static AnchorElement BasePartyrolePage_AnchorElement_listPartyrolesPageLink(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::listPartyrolesPageLink;
  }-*/;

  native static void BasePartyrolePage_AnchorElement_listPartyrolesPageLink(BasePartyrolePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::listPartyrolesPageLink = value;
  }-*/;

  native static TransitionTo BasePartyrolePage_TransitionTo_editPartyrolePage(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::editPartyrolePage;
  }-*/;

  native static void BasePartyrolePage_TransitionTo_editPartyrolePage(BasePartyrolePage instance, TransitionTo<EditPartyrolePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::editPartyrolePage = value;
  }-*/;

  native static Caller BasePartyrolePage_Caller_partyroleService(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::partyroleService;
  }-*/;

  native static void BasePartyrolePage_Caller_partyroleService(BasePartyrolePage instance, Caller<PartyroleEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::partyroleService = value;
  }-*/;

  native static AnchorElement ListPartyrolePage_AnchorElement_createNewPartyroleLink(ListPartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.ListPartyrolePage::createNewPartyroleLink;
  }-*/;

  native static void ListPartyrolePage_AnchorElement_createNewPartyroleLink(ListPartyrolePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.ListPartyrolePage::createNewPartyroleLink = value;
  }-*/;

  native static Caller BasePartyrolePage_Caller_universeService(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::universeService;
  }-*/;

  native static void BasePartyrolePage_Caller_universeService(BasePartyrolePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::universeService = value;
  }-*/;

  native static Caller BasePartyrolePage_Caller_partyroletypeService(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::partyroletypeService;
  }-*/;

  native static void BasePartyrolePage_Caller_partyroletypeService(BasePartyrolePage instance, Caller<PartyroletypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::partyroletypeService = value;
  }-*/;

  native static TransitionTo BasePartyrolePage_TransitionTo_createPartyrolePage(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::createPartyrolePage;
  }-*/;

  native static void BasePartyrolePage_TransitionTo_createPartyrolePage(BasePartyrolePage instance, TransitionTo<CreatePartyrolePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::createPartyrolePage = value;
  }-*/;

  native static TransitionTo BasePartyrolePage_TransitionTo_viewPartyrolePage(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::viewPartyrolePage;
  }-*/;

  native static void BasePartyrolePage_TransitionTo_viewPartyrolePage(BasePartyrolePage instance, TransitionTo<ViewPartyrolePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::viewPartyrolePage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Heading BasePartyrolePage_Heading_viewTitle(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::viewTitle;
  }-*/;

  native static void BasePartyrolePage_Heading_viewTitle(BasePartyrolePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::viewTitle = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BasePartyrolePage_Caller_partyService(BasePartyrolePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::partyService;
  }-*/;

  native static void BasePartyrolePage_Caller_partyService(BasePartyrolePage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.BasePartyrolePage::partyService = value;
  }-*/;
}
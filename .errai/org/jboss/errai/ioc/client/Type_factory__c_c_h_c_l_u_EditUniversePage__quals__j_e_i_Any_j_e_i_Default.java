package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.local.universe.BaseUniversePage;
import com.cloderia.helion.client.local.universe.CreateUniversePage;
import com.cloderia.helion.client.local.universe.EditUniversePage;
import com.cloderia.helion.client.local.universe.ListUniversePage;
import com.cloderia.helion.client.local.universe.UniverseDisplay;
import com.cloderia.helion.client.local.universe.UniverseEditor;
import com.cloderia.helion.client.local.universe.UniverseListItemDisplay;
import com.cloderia.helion.client.local.universe.ViewUniversePage;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.UniverseOperation;
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

public class Type_factory__c_c_h_c_l_u_EditUniversePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditUniversePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(EditUniversePage.class, "Type_factory__c_c_h_c_l_u_EditUniversePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_u_EditUniversePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/universe/edit-universe-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_u_EditUniversePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(EditUniversePage.class);
    handle.addAssignableType(BaseUniversePage.class);
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

  public EditUniversePage createInstance(final ContextManager contextManager) {
    final EditUniversePage instance = new EditUniversePage();
    setIncompleteInstance(instance);
    final TransitionTo BaseUniversePage_listUniversesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListUniversePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseUniversePage_listUniversesPage);
    BaseUniversePage_TransitionTo_listUniversesPage(instance, BaseUniversePage_listUniversesPage);
    final TransitionTo BaseUniversePage_viewUniversePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewUniversePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseUniversePage_viewUniversePage);
    BaseUniversePage_TransitionTo_viewUniversePage(instance, BaseUniversePage_viewUniversePage);
    final Heading BaseUniversePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseUniversePage_viewTitle);
    BaseUniversePage_Heading_viewTitle(instance, BaseUniversePage_viewTitle);
    final TransitionTo BaseUniversePage_createUniversePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateUniversePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseUniversePage_createUniversePage);
    BaseUniversePage_TransitionTo_createUniversePage(instance, BaseUniversePage_createUniversePage);
    final Caller BaseUniversePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseUniversePage_universeService);
    BaseUniversePage_Caller_universeService(instance, BaseUniversePage_universeService);
    final TransitionTo BaseUniversePage_editUniversePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditUniversePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseUniversePage_editUniversePage);
    BaseUniversePage_TransitionTo_editUniversePage(instance, BaseUniversePage_editUniversePage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final UniverseEditor EditUniversePage_universeEditor = (UniverseEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_u_UniverseEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, EditUniversePage_universeEditor);
    EditUniversePage_UniverseEditor_universeEditor(instance, EditUniversePage_universeEditor);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.UniverseOperation", new AbstractCDIEventCallback<UniverseOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final UniverseOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.UniverseOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForUniverseOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.UniverseOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.UniverseOperation", new AbstractCDIEventCallback<UniverseOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final UniverseOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.UniverseOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForUniverseOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.UniverseOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.UniverseOperation", new AbstractCDIEventCallback<UniverseOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final UniverseOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.UniverseOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForUniverseOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.UniverseOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseDisplay", new AbstractCDIEventCallback<UniverseDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final UniverseDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", new AbstractCDIEventCallback<UniverseListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final UniverseListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", new AbstractCDIEventCallback<UniverseListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final UniverseListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", new AbstractCDIEventCallback<UniverseListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final UniverseListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseEditor", new AbstractCDIEventCallback<UniverseEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final UniverseEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseEditor", new AbstractCDIEventCallback<UniverseEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final UniverseEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseDisplay", new AbstractCDIEventCallback<UniverseDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final UniverseDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", new AbstractCDIEventCallback<UniverseListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final UniverseListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.universe.UniverseListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_u_EditUniversePageTemplateResource templateForEditUniversePage = GWT.create(c_c_h_c_l_u_EditUniversePageTemplateResource.class);
    Element parentElementForTemplateOfEditUniversePage = TemplateUtil.getRootTemplateParentElement(templateForEditUniversePage.getContents().getText(), "com/cloderia/helion/client/local/universe/edit-universe-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/universe/edit-universe-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditUniversePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditUniversePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.EditUniversePage", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.EditUniversePage", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.EditUniversePage", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseUniversePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.EditUniversePage", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseUniversePage_AnchorElement_listUniversesPageLink(instance));
      }
    }, dataFieldElements, "listUniversesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.EditUniversePage", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(EditUniversePage_UniverseEditor_universeEditor(instance));
      }
    }, dataFieldElements, "universeEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseUniversePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listUniversesPageLink", ElementWrapperWidget.getWidget(BaseUniversePage_AnchorElement_listUniversesPageLink(instance)));
    templateFieldsMap.put("universeEditor", TemplateWidgetMapper.get(EditUniversePage_UniverseEditor_universeEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditUniversePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listUniversesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((EditUniversePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final EditUniversePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForUniverseOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForUniverseOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForUniverseOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseUniversePage_AnchorElement_listUniversesPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final EditUniversePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseUniversePage_TransitionTo_listUniversesPage(BaseUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::listUniversesPage;
  }-*/;

  native static void BaseUniversePage_TransitionTo_listUniversesPage(BaseUniversePage instance, TransitionTo<ListUniversePage> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::listUniversesPage = value;
  }-*/;

  native static TransitionTo BaseUniversePage_TransitionTo_viewUniversePage(BaseUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::viewUniversePage;
  }-*/;

  native static void BaseUniversePage_TransitionTo_viewUniversePage(BaseUniversePage instance, TransitionTo<ViewUniversePage> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::viewUniversePage = value;
  }-*/;

  native static AnchorElement BaseUniversePage_AnchorElement_listUniversesPageLink(BaseUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::listUniversesPageLink;
  }-*/;

  native static void BaseUniversePage_AnchorElement_listUniversesPageLink(BaseUniversePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::listUniversesPageLink = value;
  }-*/;

  native static TransitionTo BaseUniversePage_TransitionTo_editUniversePage(BaseUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::editUniversePage;
  }-*/;

  native static void BaseUniversePage_TransitionTo_editUniversePage(BaseUniversePage instance, TransitionTo<EditUniversePage> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::editUniversePage = value;
  }-*/;

  native static UniverseEditor EditUniversePage_UniverseEditor_universeEditor(EditUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.EditUniversePage::universeEditor;
  }-*/;

  native static void EditUniversePage_UniverseEditor_universeEditor(EditUniversePage instance, UniverseEditor value) /*-{
    instance.@com.cloderia.helion.client.local.universe.EditUniversePage::universeEditor = value;
  }-*/;

  native static Caller BaseUniversePage_Caller_universeService(BaseUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::universeService;
  }-*/;

  native static void BaseUniversePage_Caller_universeService(BaseUniversePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::universeService = value;
  }-*/;

  native static Heading BaseUniversePage_Heading_viewTitle(BaseUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::viewTitle;
  }-*/;

  native static void BaseUniversePage_Heading_viewTitle(BaseUniversePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::viewTitle = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseUniversePage_TransitionTo_createUniversePage(BaseUniversePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::createUniversePage;
  }-*/;

  native static void BaseUniversePage_TransitionTo_createUniversePage(BaseUniversePage instance, TransitionTo<CreateUniversePage> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.BaseUniversePage::createUniversePage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;
}
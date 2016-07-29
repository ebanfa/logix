package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partytype.BasePartytypePage;
import com.cloderia.helion.client.local.partytype.CreatePartytypePage;
import com.cloderia.helion.client.local.partytype.EditPartytypePage;
import com.cloderia.helion.client.local.partytype.ListPartytypePage;
import com.cloderia.helion.client.local.partytype.PartytypeDisplay;
import com.cloderia.helion.client.local.partytype.PartytypeEditor;
import com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay;
import com.cloderia.helion.client.local.partytype.ViewPartytypePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.PartycategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;
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

public class Type_factory__c_c_h_c_l_p_EditPartytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPartytypePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(EditPartytypePage.class, "Type_factory__c_c_h_c_l_p_EditPartytypePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_EditPartytypePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partytype/edit-partytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_EditPartytypePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(EditPartytypePage.class);
    handle.addAssignableType(BasePartytypePage.class);
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

  public EditPartytypePage createInstance(final ContextManager contextManager) {
    final EditPartytypePage instance = new EditPartytypePage();
    setIncompleteInstance(instance);
    final TransitionTo BasePartytypePage_editPartytypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditPartytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartytypePage_editPartytypePage);
    BasePartytypePage_TransitionTo_editPartytypePage(instance, BasePartytypePage_editPartytypePage);
    final TransitionTo BasePartytypePage_viewPartytypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewPartytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartytypePage_viewPartytypePage);
    BasePartytypePage_TransitionTo_viewPartytypePage(instance, BasePartytypePage_viewPartytypePage);
    final Caller BasePartytypePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartytypePage_universeService);
    BasePartytypePage_Caller_universeService(instance, BasePartytypePage_universeService);
    final Caller BasePartytypePage_partytypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartytypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartytypePage_partytypeService);
    BasePartytypePage_Caller_partytypeService(instance, BasePartytypePage_partytypeService);
    final TransitionTo BasePartytypePage_listPartytypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartytypePage_listPartytypesPage);
    BasePartytypePage_TransitionTo_listPartytypesPage(instance, BasePartytypePage_listPartytypesPage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BasePartytypePage_partycategoryService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartycategoryEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartytypePage_partycategoryService);
    BasePartytypePage_Caller_partycategoryService(instance, BasePartytypePage_partycategoryService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final PartytypeEditor EditPartytypePage_partytypeEditor = (PartytypeEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_p_PartytypeEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, EditPartytypePage_partytypeEditor);
    EditPartytypePage_PartytypeEditor_partytypeEditor(instance, EditPartytypePage_partytypeEditor);
    final TransitionTo BasePartytypePage_createPartytypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreatePartytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BasePartytypePage_createPartytypePage);
    BasePartytypePage_TransitionTo_createPartytypePage(instance, BasePartytypePage_createPartytypePage);
    final Heading BasePartytypePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BasePartytypePage_viewTitle);
    BasePartytypePage_Heading_viewTitle(instance, BasePartytypePage_viewTitle);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartytypeOperation", new AbstractCDIEventCallback<PartytypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final PartytypeOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartytypeOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForPartytypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartytypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartytypeOperation", new AbstractCDIEventCallback<PartytypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final PartytypeOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartytypeOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForPartytypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartytypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.PartytypeOperation", new AbstractCDIEventCallback<PartytypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final PartytypeOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.PartytypeOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForPartytypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.PartytypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeDisplay", new AbstractCDIEventCallback<PartytypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartytypeDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", new AbstractCDIEventCallback<PartytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final PartytypeListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", new AbstractCDIEventCallback<PartytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final PartytypeListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", new AbstractCDIEventCallback<PartytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final PartytypeListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeEditor", new AbstractCDIEventCallback<PartytypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final PartytypeEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeEditor", new AbstractCDIEventCallback<PartytypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final PartytypeEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeDisplay", new AbstractCDIEventCallback<PartytypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartytypeDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", new AbstractCDIEventCallback<PartytypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final PartytypeListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_p_EditPartytypePageTemplateResource templateForEditPartytypePage = GWT.create(c_c_h_c_l_p_EditPartytypePageTemplateResource.class);
    Element parentElementForTemplateOfEditPartytypePage = TemplateUtil.getRootTemplateParentElement(templateForEditPartytypePage.getContents().getText(), "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partytype/edit-partytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditPartytypePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditPartytypePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.EditPartytypePage", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.EditPartytypePage", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.EditPartytypePage", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartytypePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.EditPartytypePage", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BasePartytypePage_AnchorElement_listPartytypesPageLink(instance));
      }
    }, dataFieldElements, "listPartytypesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.EditPartytypePage", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(EditPartytypePage_PartytypeEditor_partytypeEditor(instance));
      }
    }, dataFieldElements, "partytypeEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BasePartytypePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listPartytypesPageLink", ElementWrapperWidget.getWidget(BasePartytypePage_AnchorElement_listPartytypesPageLink(instance)));
    templateFieldsMap.put("partytypeEditor", TemplateWidgetMapper.get(EditPartytypePage_PartytypeEditor_partytypeEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditPartytypePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartytypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((EditPartytypePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final EditPartytypePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForPartytypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForPartytypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForPartytypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BasePartytypePage_AnchorElement_listPartytypesPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final EditPartytypePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BasePartytypePage_TransitionTo_editPartytypePage(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::editPartytypePage;
  }-*/;

  native static void BasePartytypePage_TransitionTo_editPartytypePage(BasePartytypePage instance, TransitionTo<EditPartytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::editPartytypePage = value;
  }-*/;

  native static Caller BasePartytypePage_Caller_universeService(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::universeService;
  }-*/;

  native static void BasePartytypePage_Caller_universeService(BasePartytypePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::universeService = value;
  }-*/;

  native static PartytypeEditor EditPartytypePage_PartytypeEditor_partytypeEditor(EditPartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.EditPartytypePage::partytypeEditor;
  }-*/;

  native static void EditPartytypePage_PartytypeEditor_partytypeEditor(EditPartytypePage instance, PartytypeEditor value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.EditPartytypePage::partytypeEditor = value;
  }-*/;

  native static Caller BasePartytypePage_Caller_partycategoryService(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::partycategoryService;
  }-*/;

  native static void BasePartytypePage_Caller_partycategoryService(BasePartytypePage instance, Caller<PartycategoryEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::partycategoryService = value;
  }-*/;

  native static Caller BasePartytypePage_Caller_partytypeService(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::partytypeService;
  }-*/;

  native static void BasePartytypePage_Caller_partytypeService(BasePartytypePage instance, Caller<PartytypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::partytypeService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BasePartytypePage_TransitionTo_viewPartytypePage(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::viewPartytypePage;
  }-*/;

  native static void BasePartytypePage_TransitionTo_viewPartytypePage(BasePartytypePage instance, TransitionTo<ViewPartytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::viewPartytypePage = value;
  }-*/;

  native static Heading BasePartytypePage_Heading_viewTitle(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::viewTitle;
  }-*/;

  native static void BasePartytypePage_Heading_viewTitle(BasePartytypePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::viewTitle = value;
  }-*/;

  native static TransitionTo BasePartytypePage_TransitionTo_listPartytypesPage(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::listPartytypesPage;
  }-*/;

  native static void BasePartytypePage_TransitionTo_listPartytypesPage(BasePartytypePage instance, TransitionTo<ListPartytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::listPartytypesPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static AnchorElement BasePartytypePage_AnchorElement_listPartytypesPageLink(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::listPartytypesPageLink;
  }-*/;

  native static void BasePartytypePage_AnchorElement_listPartytypesPageLink(BasePartytypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::listPartytypesPageLink = value;
  }-*/;

  native static TransitionTo BasePartytypePage_TransitionTo_createPartytypePage(BasePartytypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::createPartytypePage;
  }-*/;

  native static void BasePartytypePage_TransitionTo_createPartytypePage(BasePartytypePage instance, TransitionTo<CreatePartytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.BasePartytypePage::createPartytypePage = value;
  }-*/;
}
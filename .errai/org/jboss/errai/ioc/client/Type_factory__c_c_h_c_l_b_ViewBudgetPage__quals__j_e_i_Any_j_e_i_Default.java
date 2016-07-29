package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budget.BaseBudgetPage;
import com.cloderia.helion.client.local.budget.BudgetDisplay;
import com.cloderia.helion.client.local.budget.BudgetEditor;
import com.cloderia.helion.client.local.budget.BudgetListItemDisplay;
import com.cloderia.helion.client.local.budget.CreateBudgetPage;
import com.cloderia.helion.client.local.budget.EditBudgetPage;
import com.cloderia.helion.client.local.budget.ListBudgetPage;
import com.cloderia.helion.client.local.budget.ViewBudgetPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.BudgetEndPoint;
import com.cloderia.helion.client.shared.endpoint.StandardtimeperiodEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.ops.BudgetOperation;
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
import org.jboss.errai.databinding.client.api.DataBinder;
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

public class Type_factory__c_c_h_c_l_b_ViewBudgetPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewBudgetPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ViewBudgetPage.class, "Type_factory__c_c_h_c_l_b_ViewBudgetPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_ViewBudgetPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budget/view-budget-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_ViewBudgetPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ViewBudgetPage.class);
    handle.addAssignableType(BaseBudgetPage.class);
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

  public ViewBudgetPage createInstance(final ContextManager contextManager) {
    final ViewBudgetPage instance = new ViewBudgetPage();
    setIncompleteInstance(instance);
    final Caller BaseBudgetPage_standardtimeperiodService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { StandardtimeperiodEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetPage_standardtimeperiodService);
    BaseBudgetPage_Caller_standardtimeperiodService(instance, BaseBudgetPage_standardtimeperiodService);
    final Caller BaseBudgetPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetPage_universeService);
    BaseBudgetPage_Caller_universeService(instance, BaseBudgetPage_universeService);
    final TransitionTo BaseBudgetPage_createBudgetPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateBudgetPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetPage_createBudgetPage);
    BaseBudgetPage_TransitionTo_createBudgetPage(instance, BaseBudgetPage_createBudgetPage);
    final TransitionTo BaseBudgetPage_listBudgetsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBudgetPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetPage_listBudgetsPage);
    BaseBudgetPage_TransitionTo_listBudgetsPage(instance, BaseBudgetPage_listBudgetsPage);
    final TransitionTo BaseBudgetPage_viewBudgetPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewBudgetPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetPage_viewBudgetPage);
    BaseBudgetPage_TransitionTo_viewBudgetPage(instance, BaseBudgetPage_viewBudgetPage);
    final BudgetDisplay ViewBudgetPage_entityDisplayComponent = (BudgetDisplay) contextManager.getInstance("Type_factory__c_c_h_c_l_b_BudgetDisplay__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ViewBudgetPage_entityDisplayComponent);
    ViewBudgetPage_BudgetDisplay_entityDisplayComponent(instance, ViewBudgetPage_entityDisplayComponent);
    final TransitionTo BaseBudgetPage_editBudgetPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditBudgetPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetPage_editBudgetPage);
    BaseBudgetPage_TransitionTo_editBudgetPage(instance, BaseBudgetPage_editBudgetPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Heading BaseBudgetPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseBudgetPage_viewTitle);
    BaseBudgetPage_Heading_viewTitle(instance, BaseBudgetPage_viewTitle);
    final Caller BaseBudgetPage_budgetService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { BudgetEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetPage_budgetService);
    BaseBudgetPage_Caller_budgetService(instance, BaseBudgetPage_budgetService);
    final DataBinder ViewBudgetPage_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budget.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ViewBudgetPage_binder);
    ViewBudgetPage_DataBinder_binder(instance, ViewBudgetPage_binder);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BudgetOperation", new AbstractCDIEventCallback<BudgetOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final BudgetOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BudgetOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForBudgetOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BudgetOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BudgetOperation", new AbstractCDIEventCallback<BudgetOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final BudgetOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BudgetOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForBudgetOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BudgetOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BudgetOperation", new AbstractCDIEventCallback<BudgetOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final BudgetOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BudgetOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForBudgetOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BudgetOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetDisplay", new AbstractCDIEventCallback<BudgetDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final BudgetDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", new AbstractCDIEventCallback<BudgetListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final BudgetListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", new AbstractCDIEventCallback<BudgetListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final BudgetListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", new AbstractCDIEventCallback<BudgetListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final BudgetListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetEditor", new AbstractCDIEventCallback<BudgetEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final BudgetEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetEditor", new AbstractCDIEventCallback<BudgetEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final BudgetEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetDisplay", new AbstractCDIEventCallback<BudgetDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final BudgetDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", new AbstractCDIEventCallback<BudgetListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final BudgetListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budget.BudgetListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_b_ViewBudgetPageTemplateResource templateForViewBudgetPage = GWT.create(c_c_h_c_l_b_ViewBudgetPageTemplateResource.class);
    Element parentElementForTemplateOfViewBudgetPage = TemplateUtil.getRootTemplateParentElement(templateForViewBudgetPage.getContents().getText(), "com/cloderia/helion/client/local/budget/view-budget-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budget/view-budget-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewBudgetPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewBudgetPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.ViewBudgetPage", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.ViewBudgetPage", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.ViewBudgetPage", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseBudgetPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.ViewBudgetPage", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseBudgetPage_AnchorElement_listBudgetsPageLink(instance));
      }
    }, dataFieldElements, "listBudgetsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.ViewBudgetPage", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(ViewBudgetPage_BudgetDisplay_entityDisplayComponent(instance));
      }
    }, dataFieldElements, "entityDisplayComponent");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseBudgetPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listBudgetsPageLink", ElementWrapperWidget.getWidget(BaseBudgetPage_AnchorElement_listBudgetsPageLink(instance)));
    templateFieldsMap.put("entityDisplayComponent", TemplateWidgetMapper.get(ViewBudgetPage_BudgetDisplay_entityDisplayComponent(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewBudgetPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBudgetsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ViewBudgetPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ViewBudgetPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForBudgetOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForBudgetOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForBudgetOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseBudgetPage_AnchorElement_listBudgetsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ViewBudgetPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseBudgetPage_TransitionTo_createBudgetPage(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::createBudgetPage;
  }-*/;

  native static void BaseBudgetPage_TransitionTo_createBudgetPage(BaseBudgetPage instance, TransitionTo<CreateBudgetPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::createBudgetPage = value;
  }-*/;

  native static DataBinder ViewBudgetPage_DataBinder_binder(ViewBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.ViewBudgetPage::binder;
  }-*/;

  native static void ViewBudgetPage_DataBinder_binder(ViewBudgetPage instance, DataBinder<Budget> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.ViewBudgetPage::binder = value;
  }-*/;

  native static Heading BaseBudgetPage_Heading_viewTitle(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::viewTitle;
  }-*/;

  native static void BaseBudgetPage_Heading_viewTitle(BaseBudgetPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::viewTitle = value;
  }-*/;

  native static BudgetDisplay ViewBudgetPage_BudgetDisplay_entityDisplayComponent(ViewBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.ViewBudgetPage::entityDisplayComponent;
  }-*/;

  native static void ViewBudgetPage_BudgetDisplay_entityDisplayComponent(ViewBudgetPage instance, BudgetDisplay value) /*-{
    instance.@com.cloderia.helion.client.local.budget.ViewBudgetPage::entityDisplayComponent = value;
  }-*/;

  native static TransitionTo BaseBudgetPage_TransitionTo_viewBudgetPage(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::viewBudgetPage;
  }-*/;

  native static void BaseBudgetPage_TransitionTo_viewBudgetPage(BaseBudgetPage instance, TransitionTo<ViewBudgetPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::viewBudgetPage = value;
  }-*/;

  native static TransitionTo BaseBudgetPage_TransitionTo_editBudgetPage(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::editBudgetPage;
  }-*/;

  native static void BaseBudgetPage_TransitionTo_editBudgetPage(BaseBudgetPage instance, TransitionTo<EditBudgetPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::editBudgetPage = value;
  }-*/;

  native static Caller BaseBudgetPage_Caller_universeService(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::universeService;
  }-*/;

  native static void BaseBudgetPage_Caller_universeService(BaseBudgetPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::universeService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BaseBudgetPage_Caller_budgetService(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::budgetService;
  }-*/;

  native static void BaseBudgetPage_Caller_budgetService(BaseBudgetPage instance, Caller<BudgetEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::budgetService = value;
  }-*/;

  native static AnchorElement BaseBudgetPage_AnchorElement_listBudgetsPageLink(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::listBudgetsPageLink;
  }-*/;

  native static void BaseBudgetPage_AnchorElement_listBudgetsPageLink(BaseBudgetPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::listBudgetsPageLink = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static TransitionTo BaseBudgetPage_TransitionTo_listBudgetsPage(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::listBudgetsPage;
  }-*/;

  native static void BaseBudgetPage_TransitionTo_listBudgetsPage(BaseBudgetPage instance, TransitionTo<ListBudgetPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::listBudgetsPage = value;
  }-*/;

  native static Caller BaseBudgetPage_Caller_standardtimeperiodService(BaseBudgetPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::standardtimeperiodService;
  }-*/;

  native static void BaseBudgetPage_Caller_standardtimeperiodService(BaseBudgetPage instance, Caller<StandardtimeperiodEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BaseBudgetPage::standardtimeperiodService = value;
  }-*/;
}
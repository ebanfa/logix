package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay;
import com.cloderia.helion.client.local.budgetitem.BudgetitemEditor;
import com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay;
import com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.EditBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.ListBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.ViewBudgetitemPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.BudgetEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetitemtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
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

public class Type_factory__c_c_h_c_l_b_CreateBudgetitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateBudgetitemPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(CreateBudgetitemPage.class, "Type_factory__c_c_h_c_l_b_CreateBudgetitemPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_CreateBudgetitemPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_CreateBudgetitemPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(CreateBudgetitemPage.class);
    handle.addAssignableType(BaseBudgetitemPage.class);
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

  public CreateBudgetitemPage createInstance(final ContextManager contextManager) {
    final CreateBudgetitemPage instance = new CreateBudgetitemPage();
    setIncompleteInstance(instance);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Caller BaseBudgetitemPage_budgetitemService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { BudgetitemEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_budgetitemService);
    BaseBudgetitemPage_Caller_budgetitemService(instance, BaseBudgetitemPage_budgetitemService);
    final TransitionTo BaseBudgetitemPage_listBudgetitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBudgetitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_listBudgetitemsPage);
    BaseBudgetitemPage_TransitionTo_listBudgetitemsPage(instance, BaseBudgetitemPage_listBudgetitemsPage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseBudgetitemPage_budgetService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { BudgetEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_budgetService);
    BaseBudgetitemPage_Caller_budgetService(instance, BaseBudgetitemPage_budgetService);
    final Caller BaseBudgetitemPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_universeService);
    BaseBudgetitemPage_Caller_universeService(instance, BaseBudgetitemPage_universeService);
    final Heading BaseBudgetitemPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseBudgetitemPage_viewTitle);
    BaseBudgetitemPage_Heading_viewTitle(instance, BaseBudgetitemPage_viewTitle);
    final TransitionTo BaseBudgetitemPage_viewBudgetitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewBudgetitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_viewBudgetitemPage);
    BaseBudgetitemPage_TransitionTo_viewBudgetitemPage(instance, BaseBudgetitemPage_viewBudgetitemPage);
    final Caller BaseBudgetitemPage_budgetitemtypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { BudgetitemtypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_budgetitemtypeService);
    BaseBudgetitemPage_Caller_budgetitemtypeService(instance, BaseBudgetitemPage_budgetitemtypeService);
    final TransitionTo BaseBudgetitemPage_createBudgetitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateBudgetitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_createBudgetitemPage);
    BaseBudgetitemPage_TransitionTo_createBudgetitemPage(instance, BaseBudgetitemPage_createBudgetitemPage);
    final BudgetitemEditor CreateBudgetitemPage_budgetitemEditor = (BudgetitemEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_b_BudgetitemEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, CreateBudgetitemPage_budgetitemEditor);
    CreateBudgetitemPage_BudgetitemEditor_budgetitemEditor(instance, CreateBudgetitemPage_budgetitemEditor);
    final TransitionTo BaseBudgetitemPage_editBudgetitemPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditBudgetitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBudgetitemPage_editBudgetitemPage);
    BaseBudgetitemPage_TransitionTo_editBudgetitemPage(instance, BaseBudgetitemPage_editBudgetitemPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BudgetitemOperation", new AbstractCDIEventCallback<BudgetitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final BudgetitemOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BudgetitemOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForBudgetitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BudgetitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BudgetitemOperation", new AbstractCDIEventCallback<BudgetitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final BudgetitemOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BudgetitemOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForBudgetitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BudgetitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BudgetitemOperation", new AbstractCDIEventCallback<BudgetitemOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final BudgetitemOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BudgetitemOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForBudgetitemOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BudgetitemOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", new AbstractCDIEventCallback<BudgetitemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final BudgetitemDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", new AbstractCDIEventCallback<BudgetitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final BudgetitemListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", new AbstractCDIEventCallback<BudgetitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final BudgetitemListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", new AbstractCDIEventCallback<BudgetitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final BudgetitemListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", new AbstractCDIEventCallback<BudgetitemEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final BudgetitemEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", new AbstractCDIEventCallback<BudgetitemEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final BudgetitemEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", new AbstractCDIEventCallback<BudgetitemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final BudgetitemDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", new AbstractCDIEventCallback<BudgetitemListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final BudgetitemListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_b_CreateBudgetitemPageTemplateResource templateForCreateBudgetitemPage = GWT.create(c_c_h_c_l_b_CreateBudgetitemPageTemplateResource.class);
    Element parentElementForTemplateOfCreateBudgetitemPage = TemplateUtil.getRootTemplateParentElement(templateForCreateBudgetitemPage.getContents().getText(), "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateBudgetitemPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateBudgetitemPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseBudgetitemPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseBudgetitemPage_AnchorElement_listBudgetitemsPageLink(instance));
      }
    }, dataFieldElements, "listBudgetitemsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(CreateBudgetitemPage_BudgetitemEditor_budgetitemEditor(instance));
      }
    }, dataFieldElements, "budgetitemEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseBudgetitemPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listBudgetitemsPageLink", ElementWrapperWidget.getWidget(BaseBudgetitemPage_AnchorElement_listBudgetitemsPageLink(instance)));
    templateFieldsMap.put("budgetitemEditor", TemplateWidgetMapper.get(CreateBudgetitemPage_BudgetitemEditor_budgetitemEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfCreateBudgetitemPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBudgetitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((CreateBudgetitemPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final CreateBudgetitemPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForBudgetitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForBudgetitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForBudgetitemOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseBudgetitemPage_AnchorElement_listBudgetitemsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final CreateBudgetitemPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement BaseBudgetitemPage_AnchorElement_listBudgetitemsPageLink(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::listBudgetitemsPageLink;
  }-*/;

  native static void BaseBudgetitemPage_AnchorElement_listBudgetitemsPageLink(BaseBudgetitemPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::listBudgetitemsPageLink = value;
  }-*/;

  native static Caller BaseBudgetitemPage_Caller_budgetService(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::budgetService;
  }-*/;

  native static void BaseBudgetitemPage_Caller_budgetService(BaseBudgetitemPage instance, Caller<BudgetEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::budgetService = value;
  }-*/;

  native static TransitionTo BaseBudgetitemPage_TransitionTo_listBudgetitemsPage(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::listBudgetitemsPage;
  }-*/;

  native static void BaseBudgetitemPage_TransitionTo_listBudgetitemsPage(BaseBudgetitemPage instance, TransitionTo<ListBudgetitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::listBudgetitemsPage = value;
  }-*/;

  native static Caller BaseBudgetitemPage_Caller_budgetitemService(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::budgetitemService;
  }-*/;

  native static void BaseBudgetitemPage_Caller_budgetitemService(BaseBudgetitemPage instance, Caller<BudgetitemEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::budgetitemService = value;
  }-*/;

  native static TransitionTo BaseBudgetitemPage_TransitionTo_viewBudgetitemPage(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::viewBudgetitemPage;
  }-*/;

  native static void BaseBudgetitemPage_TransitionTo_viewBudgetitemPage(BaseBudgetitemPage instance, TransitionTo<ViewBudgetitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::viewBudgetitemPage = value;
  }-*/;

  native static Caller BaseBudgetitemPage_Caller_universeService(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::universeService;
  }-*/;

  native static void BaseBudgetitemPage_Caller_universeService(BaseBudgetitemPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::universeService = value;
  }-*/;

  native static Caller BaseBudgetitemPage_Caller_budgetitemtypeService(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::budgetitemtypeService;
  }-*/;

  native static void BaseBudgetitemPage_Caller_budgetitemtypeService(BaseBudgetitemPage instance, Caller<BudgetitemtypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::budgetitemtypeService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseBudgetitemPage_TransitionTo_createBudgetitemPage(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::createBudgetitemPage;
  }-*/;

  native static void BaseBudgetitemPage_TransitionTo_createBudgetitemPage(BaseBudgetitemPage instance, TransitionTo<CreateBudgetitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::createBudgetitemPage = value;
  }-*/;

  native static BudgetitemEditor CreateBudgetitemPage_BudgetitemEditor_budgetitemEditor(CreateBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage::budgetitemEditor;
  }-*/;

  native static void CreateBudgetitemPage_BudgetitemEditor_budgetitemEditor(CreateBudgetitemPage instance, BudgetitemEditor value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage::budgetitemEditor = value;
  }-*/;

  native static Heading BaseBudgetitemPage_Heading_viewTitle(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::viewTitle;
  }-*/;

  native static void BaseBudgetitemPage_Heading_viewTitle(BaseBudgetitemPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::viewTitle = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static TransitionTo BaseBudgetitemPage_TransitionTo_editBudgetitemPage(BaseBudgetitemPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::editBudgetitemPage;
  }-*/;

  native static void BaseBudgetitemPage_TransitionTo_editBudgetitemPage(BaseBudgetitemPage instance, TransitionTo<EditBudgetitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage::editBudgetitemPage = value;
  }-*/;
}
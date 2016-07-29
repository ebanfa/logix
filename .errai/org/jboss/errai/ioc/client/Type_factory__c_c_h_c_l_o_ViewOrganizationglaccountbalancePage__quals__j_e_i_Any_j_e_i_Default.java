package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.CreateOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.EditOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.ListOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay;
import com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.AccountingperiodEndPoint;
import com.cloderia.helion.client.shared.endpoint.OrganizationgeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.OrganizationglaccountbalanceEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
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

public class Type_factory__c_c_h_c_l_o_ViewOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewOrganizationglaccountbalancePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ViewOrganizationglaccountbalancePage.class, "Type_factory__c_c_h_c_l_o_ViewOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_ViewOrganizationglaccountbalancePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_ViewOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ViewOrganizationglaccountbalancePage.class);
    handle.addAssignableType(BaseOrganizationglaccountbalancePage.class);
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

  public ViewOrganizationglaccountbalancePage createInstance(final ContextManager contextManager) {
    final ViewOrganizationglaccountbalancePage instance = new ViewOrganizationglaccountbalancePage();
    setIncompleteInstance(instance);
    final Caller BaseOrganizationglaccountbalancePage_accountingperiodService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { AccountingperiodEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_accountingperiodService);
    BaseOrganizationglaccountbalancePage_Caller_accountingperiodService(instance, BaseOrganizationglaccountbalancePage_accountingperiodService);
    final Caller BaseOrganizationglaccountbalancePage_organizationgeneralledgeraccountService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { OrganizationgeneralledgeraccountEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_organizationgeneralledgeraccountService);
    BaseOrganizationglaccountbalancePage_Caller_organizationgeneralledgeraccountService(instance, BaseOrganizationglaccountbalancePage_organizationgeneralledgeraccountService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseOrganizationglaccountbalancePage_editOrganizationglaccountbalancePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditOrganizationglaccountbalancePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_editOrganizationglaccountbalancePage);
    BaseOrganizationglaccountbalancePage_TransitionTo_editOrganizationglaccountbalancePage(instance, BaseOrganizationglaccountbalancePage_editOrganizationglaccountbalancePage);
    final TransitionTo BaseOrganizationglaccountbalancePage_createOrganizationglaccountbalancePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateOrganizationglaccountbalancePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_createOrganizationglaccountbalancePage);
    BaseOrganizationglaccountbalancePage_TransitionTo_createOrganizationglaccountbalancePage(instance, BaseOrganizationglaccountbalancePage_createOrganizationglaccountbalancePage);
    final Heading BaseOrganizationglaccountbalancePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_viewTitle);
    BaseOrganizationglaccountbalancePage_Heading_viewTitle(instance, BaseOrganizationglaccountbalancePage_viewTitle);
    final Caller BaseOrganizationglaccountbalancePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_universeService);
    BaseOrganizationglaccountbalancePage_Caller_universeService(instance, BaseOrganizationglaccountbalancePage_universeService);
    final TransitionTo BaseOrganizationglaccountbalancePage_viewOrganizationglaccountbalancePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewOrganizationglaccountbalancePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_viewOrganizationglaccountbalancePage);
    BaseOrganizationglaccountbalancePage_TransitionTo_viewOrganizationglaccountbalancePage(instance, BaseOrganizationglaccountbalancePage_viewOrganizationglaccountbalancePage);
    final TransitionTo BaseOrganizationglaccountbalancePage_listOrganizationglaccountbalancesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationglaccountbalancePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_listOrganizationglaccountbalancesPage);
    BaseOrganizationglaccountbalancePage_TransitionTo_listOrganizationglaccountbalancesPage(instance, BaseOrganizationglaccountbalancePage_listOrganizationglaccountbalancesPage);
    final Caller BaseOrganizationglaccountbalancePage_organizationglaccountbalanceService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { OrganizationglaccountbalanceEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationglaccountbalancePage_organizationglaccountbalanceService);
    BaseOrganizationglaccountbalancePage_Caller_organizationglaccountbalanceService(instance, BaseOrganizationglaccountbalancePage_organizationglaccountbalanceService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final DataBinder ViewOrganizationglaccountbalancePage_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationglaccountbalance.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ViewOrganizationglaccountbalancePage_binder);
    ViewOrganizationglaccountbalancePage_DataBinder_binder(instance, ViewOrganizationglaccountbalancePage_binder);
    final OrganizationglaccountbalanceDisplay ViewOrganizationglaccountbalancePage_entityDisplayComponent = (OrganizationglaccountbalanceDisplay) contextManager.getInstance("Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceDisplay__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ViewOrganizationglaccountbalancePage_entityDisplayComponent);
    ViewOrganizationglaccountbalancePage_OrganizationglaccountbalanceDisplay_entityDisplayComponent(instance, ViewOrganizationglaccountbalancePage_entityDisplayComponent);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", new AbstractCDIEventCallback<OrganizationglaccountbalanceOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final OrganizationglaccountbalanceOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForOrganizationglaccountbalanceOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", new AbstractCDIEventCallback<OrganizationglaccountbalanceOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final OrganizationglaccountbalanceOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForOrganizationglaccountbalanceOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", new AbstractCDIEventCallback<OrganizationglaccountbalanceOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final OrganizationglaccountbalanceOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForOrganizationglaccountbalanceOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", new AbstractCDIEventCallback<OrganizationglaccountbalanceDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final OrganizationglaccountbalanceDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", new AbstractCDIEventCallback<OrganizationglaccountbalanceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final OrganizationglaccountbalanceListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", new AbstractCDIEventCallback<OrganizationglaccountbalanceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final OrganizationglaccountbalanceListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", new AbstractCDIEventCallback<OrganizationglaccountbalanceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final OrganizationglaccountbalanceListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", new AbstractCDIEventCallback<OrganizationglaccountbalanceEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final OrganizationglaccountbalanceEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", new AbstractCDIEventCallback<OrganizationglaccountbalanceEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final OrganizationglaccountbalanceEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", new AbstractCDIEventCallback<OrganizationglaccountbalanceDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final OrganizationglaccountbalanceDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", new AbstractCDIEventCallback<OrganizationglaccountbalanceListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final OrganizationglaccountbalanceListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_o_ViewOrganizationglaccountbalancePageTemplateResource templateForViewOrganizationglaccountbalancePage = GWT.create(c_c_h_c_l_o_ViewOrganizationglaccountbalancePageTemplateResource.class);
    Element parentElementForTemplateOfViewOrganizationglaccountbalancePage = TemplateUtil.getRootTemplateParentElement(templateForViewOrganizationglaccountbalancePage.getContents().getText(), "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewOrganizationglaccountbalancePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewOrganizationglaccountbalancePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseOrganizationglaccountbalancePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseOrganizationglaccountbalancePage_AnchorElement_listOrganizationglaccountbalancesPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationglaccountbalancesPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(ViewOrganizationglaccountbalancePage_OrganizationglaccountbalanceDisplay_entityDisplayComponent(instance));
      }
    }, dataFieldElements, "entityDisplayComponent");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseOrganizationglaccountbalancePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listOrganizationglaccountbalancesPageLink", ElementWrapperWidget.getWidget(BaseOrganizationglaccountbalancePage_AnchorElement_listOrganizationglaccountbalancesPageLink(instance)));
    templateFieldsMap.put("entityDisplayComponent", TemplateWidgetMapper.get(ViewOrganizationglaccountbalancePage_OrganizationglaccountbalanceDisplay_entityDisplayComponent(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewOrganizationglaccountbalancePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationglaccountbalancesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ViewOrganizationglaccountbalancePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ViewOrganizationglaccountbalancePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForOrganizationglaccountbalanceOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForOrganizationglaccountbalanceOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForOrganizationglaccountbalanceOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseOrganizationglaccountbalancePage_AnchorElement_listOrganizationglaccountbalancesPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ViewOrganizationglaccountbalancePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Heading BaseOrganizationglaccountbalancePage_Heading_viewTitle(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::viewTitle;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_Heading_viewTitle(BaseOrganizationglaccountbalancePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::viewTitle = value;
  }-*/;

  native static TransitionTo BaseOrganizationglaccountbalancePage_TransitionTo_createOrganizationglaccountbalancePage(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::createOrganizationglaccountbalancePage;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_TransitionTo_createOrganizationglaccountbalancePage(BaseOrganizationglaccountbalancePage instance, TransitionTo<CreateOrganizationglaccountbalancePage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::createOrganizationglaccountbalancePage = value;
  }-*/;

  native static Caller BaseOrganizationglaccountbalancePage_Caller_universeService(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::universeService;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_Caller_universeService(BaseOrganizationglaccountbalancePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::universeService = value;
  }-*/;

  native static OrganizationglaccountbalanceDisplay ViewOrganizationglaccountbalancePage_OrganizationglaccountbalanceDisplay_entityDisplayComponent(ViewOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage::entityDisplayComponent;
  }-*/;

  native static void ViewOrganizationglaccountbalancePage_OrganizationglaccountbalanceDisplay_entityDisplayComponent(ViewOrganizationglaccountbalancePage instance, OrganizationglaccountbalanceDisplay value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage::entityDisplayComponent = value;
  }-*/;

  native static Caller BaseOrganizationglaccountbalancePage_Caller_accountingperiodService(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::accountingperiodService;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_Caller_accountingperiodService(BaseOrganizationglaccountbalancePage instance, Caller<AccountingperiodEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::accountingperiodService = value;
  }-*/;

  native static DataBinder ViewOrganizationglaccountbalancePage_DataBinder_binder(ViewOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage::binder;
  }-*/;

  native static void ViewOrganizationglaccountbalancePage_DataBinder_binder(ViewOrganizationglaccountbalancePage instance, DataBinder<Organizationglaccountbalance> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage::binder = value;
  }-*/;

  native static Caller BaseOrganizationglaccountbalancePage_Caller_organizationgeneralledgeraccountService(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::organizationgeneralledgeraccountService;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_Caller_organizationgeneralledgeraccountService(BaseOrganizationglaccountbalancePage instance, Caller<OrganizationgeneralledgeraccountEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::organizationgeneralledgeraccountService = value;
  }-*/;

  native static TransitionTo BaseOrganizationglaccountbalancePage_TransitionTo_editOrganizationglaccountbalancePage(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::editOrganizationglaccountbalancePage;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_TransitionTo_editOrganizationglaccountbalancePage(BaseOrganizationglaccountbalancePage instance, TransitionTo<EditOrganizationglaccountbalancePage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::editOrganizationglaccountbalancePage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseOrganizationglaccountbalancePage_TransitionTo_listOrganizationglaccountbalancesPage(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::listOrganizationglaccountbalancesPage;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_TransitionTo_listOrganizationglaccountbalancesPage(BaseOrganizationglaccountbalancePage instance, TransitionTo<ListOrganizationglaccountbalancePage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::listOrganizationglaccountbalancesPage = value;
  }-*/;

  native static AnchorElement BaseOrganizationglaccountbalancePage_AnchorElement_listOrganizationglaccountbalancesPageLink(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::listOrganizationglaccountbalancesPageLink;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_AnchorElement_listOrganizationglaccountbalancesPageLink(BaseOrganizationglaccountbalancePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::listOrganizationglaccountbalancesPageLink = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BaseOrganizationglaccountbalancePage_Caller_organizationglaccountbalanceService(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::organizationglaccountbalanceService;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_Caller_organizationglaccountbalanceService(BaseOrganizationglaccountbalancePage instance, Caller<OrganizationglaccountbalanceEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::organizationglaccountbalanceService = value;
  }-*/;

  native static TransitionTo BaseOrganizationglaccountbalancePage_TransitionTo_viewOrganizationglaccountbalancePage(BaseOrganizationglaccountbalancePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::viewOrganizationglaccountbalancePage;
  }-*/;

  native static void BaseOrganizationglaccountbalancePage_TransitionTo_viewOrganizationglaccountbalancePage(BaseOrganizationglaccountbalancePage instance, TransitionTo<ViewOrganizationglaccountbalancePage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage::viewOrganizationglaccountbalancePage = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.CreateOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.EditOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ListOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.OrganizationgeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductcategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
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

public class Type_factory__c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewOrganizationgeneralledgeraccountPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ViewOrganizationgeneralledgeraccountPage.class, "Type_factory__c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ViewOrganizationgeneralledgeraccountPage.class);
    handle.addAssignableType(BaseOrganizationgeneralledgeraccountPage.class);
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

  public ViewOrganizationgeneralledgeraccountPage createInstance(final ContextManager contextManager) {
    final ViewOrganizationgeneralledgeraccountPage instance = new ViewOrganizationgeneralledgeraccountPage();
    setIncompleteInstance(instance);
    final Caller BaseOrganizationgeneralledgeraccountPage_productcategoryService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductcategoryEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_productcategoryService);
    BaseOrganizationgeneralledgeraccountPage_Caller_productcategoryService(instance, BaseOrganizationgeneralledgeraccountPage_productcategoryService);
    final Caller BaseOrganizationgeneralledgeraccountPage_organizationgeneralledgeraccountService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { OrganizationgeneralledgeraccountEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_organizationgeneralledgeraccountService);
    BaseOrganizationgeneralledgeraccountPage_Caller_organizationgeneralledgeraccountService(instance, BaseOrganizationgeneralledgeraccountPage_organizationgeneralledgeraccountService);
    final TransitionTo BaseOrganizationgeneralledgeraccountPage_viewOrganizationgeneralledgeraccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewOrganizationgeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_viewOrganizationgeneralledgeraccountPage);
    BaseOrganizationgeneralledgeraccountPage_TransitionTo_viewOrganizationgeneralledgeraccountPage(instance, BaseOrganizationgeneralledgeraccountPage_viewOrganizationgeneralledgeraccountPage);
    final Caller BaseOrganizationgeneralledgeraccountPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_universeService);
    BaseOrganizationgeneralledgeraccountPage_Caller_universeService(instance, BaseOrganizationgeneralledgeraccountPage_universeService);
    final Caller BaseOrganizationgeneralledgeraccountPage_generalledgeraccountService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { GeneralledgeraccountEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_generalledgeraccountService);
    BaseOrganizationgeneralledgeraccountPage_Caller_generalledgeraccountService(instance, BaseOrganizationgeneralledgeraccountPage_generalledgeraccountService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final DataBinder ViewOrganizationgeneralledgeraccountPage_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationgeneralledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ViewOrganizationgeneralledgeraccountPage_binder);
    ViewOrganizationgeneralledgeraccountPage_DataBinder_binder(instance, ViewOrganizationgeneralledgeraccountPage_binder);
    final Caller BaseOrganizationgeneralledgeraccountPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_partyService);
    BaseOrganizationgeneralledgeraccountPage_Caller_partyService(instance, BaseOrganizationgeneralledgeraccountPage_partyService);
    final Caller BaseOrganizationgeneralledgeraccountPage_productService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ProductEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_productService);
    BaseOrganizationgeneralledgeraccountPage_Caller_productService(instance, BaseOrganizationgeneralledgeraccountPage_productService);
    final OrganizationgeneralledgeraccountDisplay ViewOrganizationgeneralledgeraccountPage_entityDisplayComponent = (OrganizationgeneralledgeraccountDisplay) contextManager.getInstance("Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ViewOrganizationgeneralledgeraccountPage_entityDisplayComponent);
    ViewOrganizationgeneralledgeraccountPage_OrganizationgeneralledgeraccountDisplay_entityDisplayComponent(instance, ViewOrganizationgeneralledgeraccountPage_entityDisplayComponent);
    final Heading BaseOrganizationgeneralledgeraccountPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_viewTitle);
    BaseOrganizationgeneralledgeraccountPage_Heading_viewTitle(instance, BaseOrganizationgeneralledgeraccountPage_viewTitle);
    final TransitionTo BaseOrganizationgeneralledgeraccountPage_createOrganizationgeneralledgeraccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateOrganizationgeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_createOrganizationgeneralledgeraccountPage);
    BaseOrganizationgeneralledgeraccountPage_TransitionTo_createOrganizationgeneralledgeraccountPage(instance, BaseOrganizationgeneralledgeraccountPage_createOrganizationgeneralledgeraccountPage);
    final TransitionTo BaseOrganizationgeneralledgeraccountPage_editOrganizationgeneralledgeraccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditOrganizationgeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_editOrganizationgeneralledgeraccountPage);
    BaseOrganizationgeneralledgeraccountPage_TransitionTo_editOrganizationgeneralledgeraccountPage(instance, BaseOrganizationgeneralledgeraccountPage_editOrganizationgeneralledgeraccountPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseOrganizationgeneralledgeraccountPage_listOrganizationgeneralledgeraccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationgeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseOrganizationgeneralledgeraccountPage_listOrganizationgeneralledgeraccountsPage);
    BaseOrganizationgeneralledgeraccountPage_TransitionTo_listOrganizationgeneralledgeraccountsPage(instance, BaseOrganizationgeneralledgeraccountPage_listOrganizationgeneralledgeraccountsPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForOrganizationgeneralledgeraccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForOrganizationgeneralledgeraccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForOrganizationgeneralledgeraccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<OrganizationgeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final OrganizationgeneralledgeraccountListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPageTemplateResource templateForViewOrganizationgeneralledgeraccountPage = GWT.create(c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPageTemplateResource.class);
    Element parentElementForTemplateOfViewOrganizationgeneralledgeraccountPage = TemplateUtil.getRootTemplateParentElement(templateForViewOrganizationgeneralledgeraccountPage.getContents().getText(), "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewOrganizationgeneralledgeraccountPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewOrganizationgeneralledgeraccountPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseOrganizationgeneralledgeraccountPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseOrganizationgeneralledgeraccountPage_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationgeneralledgeraccountsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(ViewOrganizationgeneralledgeraccountPage_OrganizationgeneralledgeraccountDisplay_entityDisplayComponent(instance));
      }
    }, dataFieldElements, "entityDisplayComponent");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseOrganizationgeneralledgeraccountPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listOrganizationgeneralledgeraccountsPageLink", ElementWrapperWidget.getWidget(BaseOrganizationgeneralledgeraccountPage_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance)));
    templateFieldsMap.put("entityDisplayComponent", TemplateWidgetMapper.get(ViewOrganizationgeneralledgeraccountPage_OrganizationgeneralledgeraccountDisplay_entityDisplayComponent(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfViewOrganizationgeneralledgeraccountPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationgeneralledgeraccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ViewOrganizationgeneralledgeraccountPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ViewOrganizationgeneralledgeraccountPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForOrganizationgeneralledgeraccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForOrganizationgeneralledgeraccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForOrganizationgeneralledgeraccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseOrganizationgeneralledgeraccountPage_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ViewOrganizationgeneralledgeraccountPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Caller BaseOrganizationgeneralledgeraccountPage_Caller_generalledgeraccountService(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::generalledgeraccountService;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_Caller_generalledgeraccountService(BaseOrganizationgeneralledgeraccountPage instance, Caller<GeneralledgeraccountEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::generalledgeraccountService = value;
  }-*/;

  native static Heading BaseOrganizationgeneralledgeraccountPage_Heading_viewTitle(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::viewTitle;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_Heading_viewTitle(BaseOrganizationgeneralledgeraccountPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::viewTitle = value;
  }-*/;

  native static Caller BaseOrganizationgeneralledgeraccountPage_Caller_organizationgeneralledgeraccountService(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::organizationgeneralledgeraccountService;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_Caller_organizationgeneralledgeraccountService(BaseOrganizationgeneralledgeraccountPage instance, Caller<OrganizationgeneralledgeraccountEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::organizationgeneralledgeraccountService = value;
  }-*/;

  native static Caller BaseOrganizationgeneralledgeraccountPage_Caller_productService(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::productService;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_Caller_productService(BaseOrganizationgeneralledgeraccountPage instance, Caller<ProductEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::productService = value;
  }-*/;

  native static TransitionTo BaseOrganizationgeneralledgeraccountPage_TransitionTo_createOrganizationgeneralledgeraccountPage(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::createOrganizationgeneralledgeraccountPage;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_TransitionTo_createOrganizationgeneralledgeraccountPage(BaseOrganizationgeneralledgeraccountPage instance, TransitionTo<CreateOrganizationgeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::createOrganizationgeneralledgeraccountPage = value;
  }-*/;

  native static Caller BaseOrganizationgeneralledgeraccountPage_Caller_universeService(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::universeService;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_Caller_universeService(BaseOrganizationgeneralledgeraccountPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::universeService = value;
  }-*/;

  native static AnchorElement BaseOrganizationgeneralledgeraccountPage_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::listOrganizationgeneralledgeraccountsPageLink;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(BaseOrganizationgeneralledgeraccountPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::listOrganizationgeneralledgeraccountsPageLink = value;
  }-*/;

  native static TransitionTo BaseOrganizationgeneralledgeraccountPage_TransitionTo_viewOrganizationgeneralledgeraccountPage(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::viewOrganizationgeneralledgeraccountPage;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_TransitionTo_viewOrganizationgeneralledgeraccountPage(BaseOrganizationgeneralledgeraccountPage instance, TransitionTo<ViewOrganizationgeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::viewOrganizationgeneralledgeraccountPage = value;
  }-*/;

  native static TransitionTo BaseOrganizationgeneralledgeraccountPage_TransitionTo_editOrganizationgeneralledgeraccountPage(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::editOrganizationgeneralledgeraccountPage;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_TransitionTo_editOrganizationgeneralledgeraccountPage(BaseOrganizationgeneralledgeraccountPage instance, TransitionTo<EditOrganizationgeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::editOrganizationgeneralledgeraccountPage = value;
  }-*/;

  native static Caller BaseOrganizationgeneralledgeraccountPage_Caller_partyService(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::partyService;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_Caller_partyService(BaseOrganizationgeneralledgeraccountPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::partyService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BaseOrganizationgeneralledgeraccountPage_Caller_productcategoryService(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::productcategoryService;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_Caller_productcategoryService(BaseOrganizationgeneralledgeraccountPage instance, Caller<ProductcategoryEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::productcategoryService = value;
  }-*/;

  native static TransitionTo BaseOrganizationgeneralledgeraccountPage_TransitionTo_listOrganizationgeneralledgeraccountsPage(BaseOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::listOrganizationgeneralledgeraccountsPage;
  }-*/;

  native static void BaseOrganizationgeneralledgeraccountPage_TransitionTo_listOrganizationgeneralledgeraccountsPage(BaseOrganizationgeneralledgeraccountPage instance, TransitionTo<ListOrganizationgeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage::listOrganizationgeneralledgeraccountsPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static OrganizationgeneralledgeraccountDisplay ViewOrganizationgeneralledgeraccountPage_OrganizationgeneralledgeraccountDisplay_entityDisplayComponent(ViewOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage::entityDisplayComponent;
  }-*/;

  native static void ViewOrganizationgeneralledgeraccountPage_OrganizationgeneralledgeraccountDisplay_entityDisplayComponent(ViewOrganizationgeneralledgeraccountPage instance, OrganizationgeneralledgeraccountDisplay value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage::entityDisplayComponent = value;
  }-*/;

  native static DataBinder ViewOrganizationgeneralledgeraccountPage_DataBinder_binder(ViewOrganizationgeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage::binder;
  }-*/;

  native static void ViewOrganizationgeneralledgeraccountPage_DataBinder_binder(ViewOrganizationgeneralledgeraccountPage instance, DataBinder<Organizationgeneralledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage::binder = value;
  }-*/;
}
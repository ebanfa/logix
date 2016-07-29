package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay;
import com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.CreateAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.ListAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.ViewAccountingtransactionPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactionEndPoint;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactiontypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.FixedassetEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyroleEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymentEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
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

public class Type_factory__c_c_h_c_l_a_EditAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditAccountingtransactionPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(EditAccountingtransactionPage.class, "Type_factory__c_c_h_c_l_a_EditAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_EditAccountingtransactionPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_EditAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(EditAccountingtransactionPage.class);
    handle.addAssignableType(BaseAccountingtransactionPage.class);
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

  public EditAccountingtransactionPage createInstance(final ContextManager contextManager) {
    final EditAccountingtransactionPage instance = new EditAccountingtransactionPage();
    setIncompleteInstance(instance);
    final TransitionTo BaseAccountingtransactionPage_viewAccountingtransactionPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewAccountingtransactionPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_viewAccountingtransactionPage);
    BaseAccountingtransactionPage_TransitionTo_viewAccountingtransactionPage(instance, BaseAccountingtransactionPage_viewAccountingtransactionPage);
    final Caller BaseAccountingtransactionPage_paymentService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PaymentEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_paymentService);
    BaseAccountingtransactionPage_Caller_paymentService(instance, BaseAccountingtransactionPage_paymentService);
    final TransitionTo BaseAccountingtransactionPage_editAccountingtransactionPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditAccountingtransactionPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_editAccountingtransactionPage);
    BaseAccountingtransactionPage_TransitionTo_editAccountingtransactionPage(instance, BaseAccountingtransactionPage_editAccountingtransactionPage);
    final Caller BaseAccountingtransactionPage_fixedassetService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { FixedassetEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_fixedassetService);
    BaseAccountingtransactionPage_Caller_fixedassetService(instance, BaseAccountingtransactionPage_fixedassetService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Caller BaseAccountingtransactionPage_invoiceService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { InvoiceEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_invoiceService);
    BaseAccountingtransactionPage_Caller_invoiceService(instance, BaseAccountingtransactionPage_invoiceService);
    final Caller BaseAccountingtransactionPage_partyService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_partyService);
    BaseAccountingtransactionPage_Caller_partyService(instance, BaseAccountingtransactionPage_partyService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseAccountingtransactionPage_accountingtransactiontypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { AccountingtransactiontypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_accountingtransactiontypeService);
    BaseAccountingtransactionPage_Caller_accountingtransactiontypeService(instance, BaseAccountingtransactionPage_accountingtransactiontypeService);
    final TransitionTo BaseAccountingtransactionPage_listAccountingtransactionsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListAccountingtransactionPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_listAccountingtransactionsPage);
    BaseAccountingtransactionPage_TransitionTo_listAccountingtransactionsPage(instance, BaseAccountingtransactionPage_listAccountingtransactionsPage);
    final TransitionTo BaseAccountingtransactionPage_createAccountingtransactionPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateAccountingtransactionPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_createAccountingtransactionPage);
    BaseAccountingtransactionPage_TransitionTo_createAccountingtransactionPage(instance, BaseAccountingtransactionPage_createAccountingtransactionPage);
    final Heading BaseAccountingtransactionPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_viewTitle);
    BaseAccountingtransactionPage_Heading_viewTitle(instance, BaseAccountingtransactionPage_viewTitle);
    final Caller BaseAccountingtransactionPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_universeService);
    BaseAccountingtransactionPage_Caller_universeService(instance, BaseAccountingtransactionPage_universeService);
    final AccountingtransactionEditor EditAccountingtransactionPage_accountingtransactionEditor = (AccountingtransactionEditor) contextManager.getInstance("Type_factory__c_c_h_c_l_a_AccountingtransactionEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, EditAccountingtransactionPage_accountingtransactionEditor);
    EditAccountingtransactionPage_AccountingtransactionEditor_accountingtransactionEditor(instance, EditAccountingtransactionPage_accountingtransactionEditor);
    final Caller BaseAccountingtransactionPage_accountingtransactionService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { AccountingtransactionEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_accountingtransactionService);
    BaseAccountingtransactionPage_Caller_accountingtransactionService(instance, BaseAccountingtransactionPage_accountingtransactionService);
    final Caller BaseAccountingtransactionPage_partyroleService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyroleEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAccountingtransactionPage_partyroleService);
    BaseAccountingtransactionPage_Caller_partyroleService(instance, BaseAccountingtransactionPage_partyroleService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", new AbstractCDIEventCallback<AccountingtransactionOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final AccountingtransactionOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.AccountingtransactionOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForAccountingtransactionOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", new AbstractCDIEventCallback<AccountingtransactionOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final AccountingtransactionOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.AccountingtransactionOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForAccountingtransactionOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", new AbstractCDIEventCallback<AccountingtransactionOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final AccountingtransactionOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.AccountingtransactionOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForAccountingtransactionOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", new AbstractCDIEventCallback<AccountingtransactionDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final AccountingtransactionDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", new AbstractCDIEventCallback<AccountingtransactionListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final AccountingtransactionListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", new AbstractCDIEventCallback<AccountingtransactionListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final AccountingtransactionListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", new AbstractCDIEventCallback<AccountingtransactionListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final AccountingtransactionListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", new AbstractCDIEventCallback<AccountingtransactionEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final AccountingtransactionEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", new AbstractCDIEventCallback<AccountingtransactionEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final AccountingtransactionEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", new AbstractCDIEventCallback<AccountingtransactionDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final AccountingtransactionDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", new AbstractCDIEventCallback<AccountingtransactionListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final AccountingtransactionListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_a_EditAccountingtransactionPageTemplateResource templateForEditAccountingtransactionPage = GWT.create(c_c_h_c_l_a_EditAccountingtransactionPageTemplateResource.class);
    Element parentElementForTemplateOfEditAccountingtransactionPage = TemplateUtil.getRootTemplateParentElement(templateForEditAccountingtransactionPage.getContents().getText(), "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditAccountingtransactionPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditAccountingtransactionPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseAccountingtransactionPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseAccountingtransactionPage_AnchorElement_listAccountingtransactionsPageLink(instance));
      }
    }, dataFieldElements, "listAccountingtransactionsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return TemplateWidgetMapper.get(EditAccountingtransactionPage_AccountingtransactionEditor_accountingtransactionEditor(instance));
      }
    }, dataFieldElements, "accountingtransactionEditor");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseAccountingtransactionPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listAccountingtransactionsPageLink", ElementWrapperWidget.getWidget(BaseAccountingtransactionPage_AnchorElement_listAccountingtransactionsPageLink(instance)));
    templateFieldsMap.put("accountingtransactionEditor", TemplateWidgetMapper.get(EditAccountingtransactionPage_AccountingtransactionEditor_accountingtransactionEditor(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditAccountingtransactionPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listAccountingtransactionsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((EditAccountingtransactionPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final EditAccountingtransactionPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForAccountingtransactionOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForAccountingtransactionOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForAccountingtransactionOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseAccountingtransactionPage_AnchorElement_listAccountingtransactionsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final EditAccountingtransactionPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AccountingtransactionEditor EditAccountingtransactionPage_AccountingtransactionEditor_accountingtransactionEditor(EditAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage::accountingtransactionEditor;
  }-*/;

  native static void EditAccountingtransactionPage_AccountingtransactionEditor_accountingtransactionEditor(EditAccountingtransactionPage instance, AccountingtransactionEditor value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage::accountingtransactionEditor = value;
  }-*/;

  native static TransitionTo BaseAccountingtransactionPage_TransitionTo_listAccountingtransactionsPage(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::listAccountingtransactionsPage;
  }-*/;

  native static void BaseAccountingtransactionPage_TransitionTo_listAccountingtransactionsPage(BaseAccountingtransactionPage instance, TransitionTo<ListAccountingtransactionPage> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::listAccountingtransactionsPage = value;
  }-*/;

  native static Heading BaseAccountingtransactionPage_Heading_viewTitle(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::viewTitle;
  }-*/;

  native static void BaseAccountingtransactionPage_Heading_viewTitle(BaseAccountingtransactionPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::viewTitle = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_invoiceService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::invoiceService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_invoiceService(BaseAccountingtransactionPage instance, Caller<InvoiceEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::invoiceService = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_accountingtransactionService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::accountingtransactionService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_accountingtransactionService(BaseAccountingtransactionPage instance, Caller<AccountingtransactionEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::accountingtransactionService = value;
  }-*/;

  native static TransitionTo BaseAccountingtransactionPage_TransitionTo_viewAccountingtransactionPage(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::viewAccountingtransactionPage;
  }-*/;

  native static void BaseAccountingtransactionPage_TransitionTo_viewAccountingtransactionPage(BaseAccountingtransactionPage instance, TransitionTo<ViewAccountingtransactionPage> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::viewAccountingtransactionPage = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_universeService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::universeService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_universeService(BaseAccountingtransactionPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::universeService = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_partyroleService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::partyroleService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_partyroleService(BaseAccountingtransactionPage instance, Caller<PartyroleEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::partyroleService = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_paymentService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::paymentService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_paymentService(BaseAccountingtransactionPage instance, Caller<PaymentEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::paymentService = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_accountingtransactiontypeService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::accountingtransactiontypeService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_accountingtransactiontypeService(BaseAccountingtransactionPage instance, Caller<AccountingtransactiontypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::accountingtransactiontypeService = value;
  }-*/;

  native static TransitionTo BaseAccountingtransactionPage_TransitionTo_createAccountingtransactionPage(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::createAccountingtransactionPage;
  }-*/;

  native static void BaseAccountingtransactionPage_TransitionTo_createAccountingtransactionPage(BaseAccountingtransactionPage instance, TransitionTo<CreateAccountingtransactionPage> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::createAccountingtransactionPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseAccountingtransactionPage_TransitionTo_editAccountingtransactionPage(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::editAccountingtransactionPage;
  }-*/;

  native static void BaseAccountingtransactionPage_TransitionTo_editAccountingtransactionPage(BaseAccountingtransactionPage instance, TransitionTo<EditAccountingtransactionPage> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::editAccountingtransactionPage = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_fixedassetService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::fixedassetService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_fixedassetService(BaseAccountingtransactionPage instance, Caller<FixedassetEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::fixedassetService = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BaseAccountingtransactionPage_Caller_partyService(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::partyService;
  }-*/;

  native static void BaseAccountingtransactionPage_Caller_partyService(BaseAccountingtransactionPage instance, Caller<PartyEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::partyService = value;
  }-*/;

  native static AnchorElement BaseAccountingtransactionPage_AnchorElement_listAccountingtransactionsPageLink(BaseAccountingtransactionPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::listAccountingtransactionsPageLink;
  }-*/;

  native static void BaseAccountingtransactionPage_AnchorElement_listAccountingtransactionsPageLink(BaseAccountingtransactionPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage::listAccountingtransactionsPageLink = value;
  }-*/;
}
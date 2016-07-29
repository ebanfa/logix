package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay;
import com.cloderia.helion.client.local.billingaccount.BillingaccountEditor;
import com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay;
import com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget;
import com.cloderia.helion.client.local.billingaccount.CreateBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.EditBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.ViewBillingaccountPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.BillingaccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;
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

public class Type_factory__c_c_h_c_l_b_ListBillingaccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBillingaccountPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListBillingaccountPage.class, "Type_factory__c_c_h_c_l_b_ListBillingaccountPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_ListBillingaccountPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_ListBillingaccountPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListBillingaccountPage.class);
    handle.addAssignableType(BaseBillingaccountPage.class);
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

  public ListBillingaccountPage createInstance(final ContextManager contextManager) {
    final ListBillingaccountPage instance = new ListBillingaccountPage();
    setIncompleteInstance(instance);
    final Caller BaseBillingaccountPage_contactmechanismService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ContactmechanismEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBillingaccountPage_contactmechanismService);
    BaseBillingaccountPage_Caller_contactmechanismService(instance, BaseBillingaccountPage_contactmechanismService);
    final Heading BaseBillingaccountPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseBillingaccountPage_viewTitle);
    BaseBillingaccountPage_Heading_viewTitle(instance, BaseBillingaccountPage_viewTitle);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseBillingaccountPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBillingaccountPage_universeService);
    BaseBillingaccountPage_Caller_universeService(instance, BaseBillingaccountPage_universeService);
    final TransitionTo BaseBillingaccountPage_viewBillingaccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewBillingaccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBillingaccountPage_viewBillingaccountPage);
    BaseBillingaccountPage_TransitionTo_viewBillingaccountPage(instance, BaseBillingaccountPage_viewBillingaccountPage);
    final Caller BaseBillingaccountPage_billingaccountService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { BillingaccountEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBillingaccountPage_billingaccountService);
    BaseBillingaccountPage_Caller_billingaccountService(instance, BaseBillingaccountPage_billingaccountService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final BillingaccountListWidget ListBillingaccountPage_listWidget = (BillingaccountListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_b_BillingaccountListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListBillingaccountPage_listWidget);
    ListBillingaccountPage_BillingaccountListWidget_listWidget(instance, ListBillingaccountPage_listWidget);
    final TransitionTo BaseBillingaccountPage_editBillingaccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditBillingaccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBillingaccountPage_editBillingaccountPage);
    BaseBillingaccountPage_TransitionTo_editBillingaccountPage(instance, BaseBillingaccountPage_editBillingaccountPage);
    final TransitionTo BaseBillingaccountPage_listBillingaccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBillingaccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBillingaccountPage_listBillingaccountsPage);
    BaseBillingaccountPage_TransitionTo_listBillingaccountsPage(instance, BaseBillingaccountPage_listBillingaccountsPage);
    final TransitionTo BaseBillingaccountPage_createBillingaccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateBillingaccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseBillingaccountPage_createBillingaccountPage);
    BaseBillingaccountPage_TransitionTo_createBillingaccountPage(instance, BaseBillingaccountPage_createBillingaccountPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BillingaccountOperation", new AbstractCDIEventCallback<BillingaccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final BillingaccountOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BillingaccountOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForBillingaccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BillingaccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BillingaccountOperation", new AbstractCDIEventCallback<BillingaccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final BillingaccountOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BillingaccountOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForBillingaccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BillingaccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.BillingaccountOperation", new AbstractCDIEventCallback<BillingaccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final BillingaccountOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.BillingaccountOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForBillingaccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.BillingaccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", new AbstractCDIEventCallback<BillingaccountDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final BillingaccountDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", new AbstractCDIEventCallback<BillingaccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final BillingaccountListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", new AbstractCDIEventCallback<BillingaccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final BillingaccountListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", new AbstractCDIEventCallback<BillingaccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final BillingaccountListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", new AbstractCDIEventCallback<BillingaccountEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final BillingaccountEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", new AbstractCDIEventCallback<BillingaccountEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final BillingaccountEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", new AbstractCDIEventCallback<BillingaccountDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final BillingaccountDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", new AbstractCDIEventCallback<BillingaccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final BillingaccountListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_b_ListBillingaccountPageTemplateResource templateForListBillingaccountPage = GWT.create(c_c_h_c_l_b_ListBillingaccountPageTemplateResource.class);
    Element parentElementForTemplateOfListBillingaccountPage = TemplateUtil.getRootTemplateParentElement(templateForListBillingaccountPage.getContents().getText(), "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListBillingaccountPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListBillingaccountPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseBillingaccountPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseBillingaccountPage_AnchorElement_listBillingaccountsPageLink(instance));
      }
    }, dataFieldElements, "listBillingaccountsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListBillingaccountPage_BillingaccountListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListBillingaccountPage_AnchorElement_createNewBillingaccountLink(instance));
      }
    }, dataFieldElements, "createNewBillingaccountLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseBillingaccountPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listBillingaccountsPageLink", ElementWrapperWidget.getWidget(BaseBillingaccountPage_AnchorElement_listBillingaccountsPageLink(instance)));
    templateFieldsMap.put("listWidget", ListBillingaccountPage_BillingaccountListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewBillingaccountLink", ElementWrapperWidget.getWidget(ListBillingaccountPage_AnchorElement_createNewBillingaccountLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListBillingaccountPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewBillingaccountLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBillingaccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListBillingaccountPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListBillingaccountPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForBillingaccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForBillingaccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForBillingaccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseBillingaccountPage_AnchorElement_listBillingaccountsPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListBillingaccountPage_AnchorElement_createNewBillingaccountLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListBillingaccountPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Heading BaseBillingaccountPage_Heading_viewTitle(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::viewTitle;
  }-*/;

  native static void BaseBillingaccountPage_Heading_viewTitle(BaseBillingaccountPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::viewTitle = value;
  }-*/;

  native static Caller BaseBillingaccountPage_Caller_contactmechanismService(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::contactmechanismService;
  }-*/;

  native static void BaseBillingaccountPage_Caller_contactmechanismService(BaseBillingaccountPage instance, Caller<ContactmechanismEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::contactmechanismService = value;
  }-*/;

  native static TransitionTo BaseBillingaccountPage_TransitionTo_listBillingaccountsPage(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::listBillingaccountsPage;
  }-*/;

  native static void BaseBillingaccountPage_TransitionTo_listBillingaccountsPage(BaseBillingaccountPage instance, TransitionTo<ListBillingaccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::listBillingaccountsPage = value;
  }-*/;

  native static BillingaccountListWidget ListBillingaccountPage_BillingaccountListWidget_listWidget(ListBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage::listWidget;
  }-*/;

  native static void ListBillingaccountPage_BillingaccountListWidget_listWidget(ListBillingaccountPage instance, BillingaccountListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage::listWidget = value;
  }-*/;

  native static AnchorElement ListBillingaccountPage_AnchorElement_createNewBillingaccountLink(ListBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage::createNewBillingaccountLink;
  }-*/;

  native static void ListBillingaccountPage_AnchorElement_createNewBillingaccountLink(ListBillingaccountPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage::createNewBillingaccountLink = value;
  }-*/;

  native static AnchorElement BaseBillingaccountPage_AnchorElement_listBillingaccountsPageLink(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::listBillingaccountsPageLink;
  }-*/;

  native static void BaseBillingaccountPage_AnchorElement_listBillingaccountsPageLink(BaseBillingaccountPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::listBillingaccountsPageLink = value;
  }-*/;

  native static TransitionTo BaseBillingaccountPage_TransitionTo_viewBillingaccountPage(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::viewBillingaccountPage;
  }-*/;

  native static void BaseBillingaccountPage_TransitionTo_viewBillingaccountPage(BaseBillingaccountPage instance, TransitionTo<ViewBillingaccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::viewBillingaccountPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BaseBillingaccountPage_Caller_universeService(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::universeService;
  }-*/;

  native static void BaseBillingaccountPage_Caller_universeService(BaseBillingaccountPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::universeService = value;
  }-*/;

  native static Caller BaseBillingaccountPage_Caller_billingaccountService(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::billingaccountService;
  }-*/;

  native static void BaseBillingaccountPage_Caller_billingaccountService(BaseBillingaccountPage instance, Caller<BillingaccountEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::billingaccountService = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static TransitionTo BaseBillingaccountPage_TransitionTo_editBillingaccountPage(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::editBillingaccountPage;
  }-*/;

  native static void BaseBillingaccountPage_TransitionTo_editBillingaccountPage(BaseBillingaccountPage instance, TransitionTo<EditBillingaccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::editBillingaccountPage = value;
  }-*/;

  native static TransitionTo BaseBillingaccountPage_TransitionTo_createBillingaccountPage(BaseBillingaccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::createBillingaccountPage;
  }-*/;

  native static void BaseBillingaccountPage_TransitionTo_createBillingaccountPage(BaseBillingaccountPage instance, TransitionTo<CreateBillingaccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage::createBillingaccountPage = value;
  }-*/;
}
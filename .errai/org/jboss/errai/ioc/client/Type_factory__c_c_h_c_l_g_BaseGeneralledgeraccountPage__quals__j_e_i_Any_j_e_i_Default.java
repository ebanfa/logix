package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.CreateGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.EditGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay;
import com.cloderia.helion.client.local.generalledgeraccount.ListGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.ViewGeneralledgeraccountPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccounttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;
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

public class Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseGeneralledgeraccountPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BaseGeneralledgeraccountPage.class, "Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_BaseGeneralledgeraccountPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BaseGeneralledgeraccountPage.class);
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

  public BaseGeneralledgeraccountPage createInstance(final ContextManager contextManager) {
    final BaseGeneralledgeraccountPage instance = new BaseGeneralledgeraccountPage();
    setIncompleteInstance(instance);
    final TransitionTo BaseGeneralledgeraccountPage_editGeneralledgeraccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditGeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_editGeneralledgeraccountPage);
    BaseGeneralledgeraccountPage_TransitionTo_editGeneralledgeraccountPage(instance, BaseGeneralledgeraccountPage_editGeneralledgeraccountPage);
    final Caller BaseGeneralledgeraccountPage_generalledgeraccountService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { GeneralledgeraccountEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_generalledgeraccountService);
    BaseGeneralledgeraccountPage_Caller_generalledgeraccountService(instance, BaseGeneralledgeraccountPage_generalledgeraccountService);
    final Heading BaseGeneralledgeraccountPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_viewTitle);
    BaseGeneralledgeraccountPage_Heading_viewTitle(instance, BaseGeneralledgeraccountPage_viewTitle);
    final TransitionTo BaseGeneralledgeraccountPage_listGeneralledgeraccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListGeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_listGeneralledgeraccountsPage);
    BaseGeneralledgeraccountPage_TransitionTo_listGeneralledgeraccountsPage(instance, BaseGeneralledgeraccountPage_listGeneralledgeraccountsPage);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final TransitionTo BaseGeneralledgeraccountPage_viewGeneralledgeraccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewGeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_viewGeneralledgeraccountPage);
    BaseGeneralledgeraccountPage_TransitionTo_viewGeneralledgeraccountPage(instance, BaseGeneralledgeraccountPage_viewGeneralledgeraccountPage);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final Caller BaseGeneralledgeraccountPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_universeService);
    BaseGeneralledgeraccountPage_Caller_universeService(instance, BaseGeneralledgeraccountPage_universeService);
    final Caller BaseGeneralledgeraccountPage_generalledgeraccounttypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { GeneralledgeraccounttypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_generalledgeraccounttypeService);
    BaseGeneralledgeraccountPage_Caller_generalledgeraccounttypeService(instance, BaseGeneralledgeraccountPage_generalledgeraccounttypeService);
    final TransitionTo BaseGeneralledgeraccountPage_createGeneralledgeraccountPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateGeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccountPage_createGeneralledgeraccountPage);
    BaseGeneralledgeraccountPage_TransitionTo_createGeneralledgeraccountPage(instance, BaseGeneralledgeraccountPage_createGeneralledgeraccountPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", new AbstractCDIEventCallback<GeneralledgeraccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final GeneralledgeraccountOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForGeneralledgeraccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", new AbstractCDIEventCallback<GeneralledgeraccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final GeneralledgeraccountOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForGeneralledgeraccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", new AbstractCDIEventCallback<GeneralledgeraccountOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final GeneralledgeraccountOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForGeneralledgeraccountOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", new AbstractCDIEventCallback<GeneralledgeraccountDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final GeneralledgeraccountDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final GeneralledgeraccountListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final GeneralledgeraccountListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final GeneralledgeraccountListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", new AbstractCDIEventCallback<GeneralledgeraccountEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final GeneralledgeraccountEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", new AbstractCDIEventCallback<GeneralledgeraccountEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final GeneralledgeraccountEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", new AbstractCDIEventCallback<GeneralledgeraccountDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final GeneralledgeraccountDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccountListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final GeneralledgeraccountListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_g_BaseGeneralledgeraccountPageTemplateResource templateForBaseGeneralledgeraccountPage = GWT.create(c_c_h_c_l_g_BaseGeneralledgeraccountPageTemplateResource.class);
    Element parentElementForTemplateOfBaseGeneralledgeraccountPage = TemplateUtil.getRootTemplateParentElement(templateForBaseGeneralledgeraccountPage.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseGeneralledgeraccountPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseGeneralledgeraccountPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseGeneralledgeraccountPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseGeneralledgeraccountPage_AnchorElement_listGeneralledgeraccountsPageLink(instance));
      }
    }, dataFieldElements, "listGeneralledgeraccountsPageLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseGeneralledgeraccountPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listGeneralledgeraccountsPageLink", ElementWrapperWidget.getWidget(BaseGeneralledgeraccountPage_AnchorElement_listGeneralledgeraccountsPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseGeneralledgeraccountPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listGeneralledgeraccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BaseGeneralledgeraccountPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final BaseGeneralledgeraccountPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForGeneralledgeraccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForGeneralledgeraccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForGeneralledgeraccountOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseGeneralledgeraccountPage_AnchorElement_listGeneralledgeraccountsPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final BaseGeneralledgeraccountPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseGeneralledgeraccountPage_TransitionTo_listGeneralledgeraccountsPage(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::listGeneralledgeraccountsPage;
  }-*/;

  native static void BaseGeneralledgeraccountPage_TransitionTo_listGeneralledgeraccountsPage(BaseGeneralledgeraccountPage instance, TransitionTo<ListGeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::listGeneralledgeraccountsPage = value;
  }-*/;

  native static Caller BaseGeneralledgeraccountPage_Caller_universeService(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::universeService;
  }-*/;

  native static void BaseGeneralledgeraccountPage_Caller_universeService(BaseGeneralledgeraccountPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::universeService = value;
  }-*/;

  native static Caller BaseGeneralledgeraccountPage_Caller_generalledgeraccountService(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::generalledgeraccountService;
  }-*/;

  native static void BaseGeneralledgeraccountPage_Caller_generalledgeraccountService(BaseGeneralledgeraccountPage instance, Caller<GeneralledgeraccountEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::generalledgeraccountService = value;
  }-*/;

  native static TransitionTo BaseGeneralledgeraccountPage_TransitionTo_createGeneralledgeraccountPage(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::createGeneralledgeraccountPage;
  }-*/;

  native static void BaseGeneralledgeraccountPage_TransitionTo_createGeneralledgeraccountPage(BaseGeneralledgeraccountPage instance, TransitionTo<CreateGeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::createGeneralledgeraccountPage = value;
  }-*/;

  native static AnchorElement BaseGeneralledgeraccountPage_AnchorElement_listGeneralledgeraccountsPageLink(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::listGeneralledgeraccountsPageLink;
  }-*/;

  native static void BaseGeneralledgeraccountPage_AnchorElement_listGeneralledgeraccountsPageLink(BaseGeneralledgeraccountPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::listGeneralledgeraccountsPageLink = value;
  }-*/;

  native static TransitionTo BaseGeneralledgeraccountPage_TransitionTo_viewGeneralledgeraccountPage(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::viewGeneralledgeraccountPage;
  }-*/;

  native static void BaseGeneralledgeraccountPage_TransitionTo_viewGeneralledgeraccountPage(BaseGeneralledgeraccountPage instance, TransitionTo<ViewGeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::viewGeneralledgeraccountPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static TransitionTo BaseGeneralledgeraccountPage_TransitionTo_editGeneralledgeraccountPage(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::editGeneralledgeraccountPage;
  }-*/;

  native static void BaseGeneralledgeraccountPage_TransitionTo_editGeneralledgeraccountPage(BaseGeneralledgeraccountPage instance, TransitionTo<EditGeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::editGeneralledgeraccountPage = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static Caller BaseGeneralledgeraccountPage_Caller_generalledgeraccounttypeService(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::generalledgeraccounttypeService;
  }-*/;

  native static void BaseGeneralledgeraccountPage_Caller_generalledgeraccounttypeService(BaseGeneralledgeraccountPage instance, Caller<GeneralledgeraccounttypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::generalledgeraccounttypeService = value;
  }-*/;

  native static Heading BaseGeneralledgeraccountPage_Heading_viewTitle(BaseGeneralledgeraccountPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::viewTitle;
  }-*/;

  native static void BaseGeneralledgeraccountPage_Heading_viewTitle(BaseGeneralledgeraccountPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage::viewTitle = value;
  }-*/;
}
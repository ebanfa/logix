package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.agreement.AgreementDisplay;
import com.cloderia.helion.client.local.agreement.AgreementEditor;
import com.cloderia.helion.client.local.agreement.AgreementListItemDisplay;
import com.cloderia.helion.client.local.agreement.AgreementListWidget;
import com.cloderia.helion.client.local.agreement.BaseAgreementPage;
import com.cloderia.helion.client.local.agreement.CreateAgreementPage;
import com.cloderia.helion.client.local.agreement.EditAgreementPage;
import com.cloderia.helion.client.local.agreement.ListAgreementPage;
import com.cloderia.helion.client.local.agreement.ViewAgreementPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.AgreementEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshipEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.AgreementOperation;
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

public class Type_factory__c_c_h_c_l_a_ListAgreementPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListAgreementPage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ListAgreementPage.class, "Type_factory__c_c_h_c_l_a_ListAgreementPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_ListAgreementPageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/agreement/list-agreement-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_ListAgreementPage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ListAgreementPage.class);
    handle.addAssignableType(BaseAgreementPage.class);
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

  public ListAgreementPage createInstance(final ContextManager contextManager) {
    final ListAgreementPage instance = new ListAgreementPage();
    setIncompleteInstance(instance);
    final TransitionTo BaseAgreementPage_createAgreementPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateAgreementPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_createAgreementPage);
    BaseAgreementPage_TransitionTo_createAgreementPage(instance, BaseAgreementPage_createAgreementPage);
    final TransitionTo BaseAgreementPage_viewAgreementPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewAgreementPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_viewAgreementPage);
    BaseAgreementPage_TransitionTo_viewAgreementPage(instance, BaseAgreementPage_viewAgreementPage);
    final TransitionTo BaseAgreementPage_editAgreementPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditAgreementPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_editAgreementPage);
    BaseAgreementPage_TransitionTo_editAgreementPage(instance, BaseAgreementPage_editAgreementPage);
    final Caller BaseAgreementPage_agreementService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { AgreementEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_agreementService);
    BaseAgreementPage_Caller_agreementService(instance, BaseAgreementPage_agreementService);
    final Caller BaseAgreementPage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_universeService);
    BaseAgreementPage_Caller_universeService(instance, BaseAgreementPage_universeService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Heading BaseAgreementPage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseAgreementPage_viewTitle);
    BaseAgreementPage_Heading_viewTitle(instance, BaseAgreementPage_viewTitle);
    final Caller BaseAgreementPage_agreementtypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { AgreementtypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_agreementtypeService);
    BaseAgreementPage_Caller_agreementtypeService(instance, BaseAgreementPage_agreementtypeService);
    final Caller BaseAgreementPage_partyrelationshipService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PartyrelationshipEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_partyrelationshipService);
    BaseAgreementPage_Caller_partyrelationshipService(instance, BaseAgreementPage_partyrelationshipService);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final AgreementListWidget ListAgreementPage_listWidget = (AgreementListWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_a_AgreementListWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ListAgreementPage_listWidget);
    ListAgreementPage_AgreementListWidget_listWidget(instance, ListAgreementPage_listWidget);
    final TransitionTo BaseAgreementPage_listAgreementsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListAgreementPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseAgreementPage_listAgreementsPage);
    BaseAgreementPage_TransitionTo_listAgreementsPage(instance, BaseAgreementPage_listAgreementsPage);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.AgreementOperation", new AbstractCDIEventCallback<AgreementOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final AgreementOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.AgreementOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForAgreementOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.AgreementOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.AgreementOperation", new AbstractCDIEventCallback<AgreementOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final AgreementOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.AgreementOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForAgreementOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.AgreementOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.AgreementOperation", new AbstractCDIEventCallback<AgreementOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final AgreementOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.AgreementOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForAgreementOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.AgreementOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementDisplay", new AbstractCDIEventCallback<AgreementDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final AgreementDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", new AbstractCDIEventCallback<AgreementListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final AgreementListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", new AbstractCDIEventCallback<AgreementListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final AgreementListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", new AbstractCDIEventCallback<AgreementListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final AgreementListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementEditor", new AbstractCDIEventCallback<AgreementEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final AgreementEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementEditor", new AbstractCDIEventCallback<AgreementEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final AgreementEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementDisplay", new AbstractCDIEventCallback<AgreementDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final AgreementDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", new AbstractCDIEventCallback<AgreementListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final AgreementListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.agreement.AgreementListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_a_ListAgreementPageTemplateResource templateForListAgreementPage = GWT.create(c_c_h_c_l_a_ListAgreementPageTemplateResource.class);
    Element parentElementForTemplateOfListAgreementPage = TemplateUtil.getRootTemplateParentElement(templateForListAgreementPage.getContents().getText(), "com/cloderia/helion/client/local/agreement/list-agreement-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/agreement/list-agreement-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListAgreementPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListAgreementPage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.ListAgreementPage", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.ListAgreementPage", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.ListAgreementPage", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseAgreementPage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.ListAgreementPage", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseAgreementPage_AnchorElement_listAgreementsPageLink(instance));
      }
    }, dataFieldElements, "listAgreementsPageLink");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.ListAgreementPage", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ListAgreementPage_AgreementListWidget_listWidget(instance).asWidget();
      }
    }, dataFieldElements, "listWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.ListAgreementPage", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ListAgreementPage_AnchorElement_createNewAgreementLink(instance));
      }
    }, dataFieldElements, "createNewAgreementLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseAgreementPage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listAgreementsPageLink", ElementWrapperWidget.getWidget(BaseAgreementPage_AnchorElement_listAgreementsPageLink(instance)));
    templateFieldsMap.put("listWidget", ListAgreementPage_AgreementListWidget_listWidget(instance).asWidget());
    templateFieldsMap.put("createNewAgreementLink", ElementWrapperWidget.getWidget(ListAgreementPage_AnchorElement_createNewAgreementLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfListAgreementPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("createNewAgreementLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listAgreementsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ListAgreementPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ListAgreementPage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForAgreementOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForAgreementOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForAgreementOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseAgreementPage_AnchorElement_listAgreementsPageLink(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ListAgreementPage_AnchorElement_createNewAgreementLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ListAgreementPage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement ListAgreementPage_AnchorElement_createNewAgreementLink(ListAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.ListAgreementPage::createNewAgreementLink;
  }-*/;

  native static void ListAgreementPage_AnchorElement_createNewAgreementLink(ListAgreementPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.ListAgreementPage::createNewAgreementLink = value;
  }-*/;

  native static Caller BaseAgreementPage_Caller_universeService(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::universeService;
  }-*/;

  native static void BaseAgreementPage_Caller_universeService(BaseAgreementPage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::universeService = value;
  }-*/;

  native static AnchorElement BaseAgreementPage_AnchorElement_listAgreementsPageLink(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::listAgreementsPageLink;
  }-*/;

  native static void BaseAgreementPage_AnchorElement_listAgreementsPageLink(BaseAgreementPage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::listAgreementsPageLink = value;
  }-*/;

  native static Caller BaseAgreementPage_Caller_agreementService(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::agreementService;
  }-*/;

  native static void BaseAgreementPage_Caller_agreementService(BaseAgreementPage instance, Caller<AgreementEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::agreementService = value;
  }-*/;

  native static TransitionTo BaseAgreementPage_TransitionTo_viewAgreementPage(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::viewAgreementPage;
  }-*/;

  native static void BaseAgreementPage_TransitionTo_viewAgreementPage(BaseAgreementPage instance, TransitionTo<ViewAgreementPage> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::viewAgreementPage = value;
  }-*/;

  native static Caller BaseAgreementPage_Caller_agreementtypeService(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::agreementtypeService;
  }-*/;

  native static void BaseAgreementPage_Caller_agreementtypeService(BaseAgreementPage instance, Caller<AgreementtypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::agreementtypeService = value;
  }-*/;

  native static AgreementListWidget ListAgreementPage_AgreementListWidget_listWidget(ListAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.ListAgreementPage::listWidget;
  }-*/;

  native static void ListAgreementPage_AgreementListWidget_listWidget(ListAgreementPage instance, AgreementListWidget value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.ListAgreementPage::listWidget = value;
  }-*/;

  native static TransitionTo BaseAgreementPage_TransitionTo_editAgreementPage(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::editAgreementPage;
  }-*/;

  native static void BaseAgreementPage_TransitionTo_editAgreementPage(BaseAgreementPage instance, TransitionTo<EditAgreementPage> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::editAgreementPage = value;
  }-*/;

  native static TransitionTo BaseAgreementPage_TransitionTo_listAgreementsPage(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::listAgreementsPage;
  }-*/;

  native static void BaseAgreementPage_TransitionTo_listAgreementsPage(BaseAgreementPage instance, TransitionTo<ListAgreementPage> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::listAgreementsPage = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static Caller BaseAgreementPage_Caller_partyrelationshipService(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::partyrelationshipService;
  }-*/;

  native static void BaseAgreementPage_Caller_partyrelationshipService(BaseAgreementPage instance, Caller<PartyrelationshipEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::partyrelationshipService = value;
  }-*/;

  native static Heading BaseAgreementPage_Heading_viewTitle(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::viewTitle;
  }-*/;

  native static void BaseAgreementPage_Heading_viewTitle(BaseAgreementPage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::viewTitle = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static TransitionTo BaseAgreementPage_TransitionTo_createAgreementPage(BaseAgreementPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::createAgreementPage;
  }-*/;

  native static void BaseAgreementPage_TransitionTo_createAgreementPage(BaseAgreementPage instance, TransitionTo<CreateAgreementPage> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.BaseAgreementPage::createAgreementPage = value;
  }-*/;
}
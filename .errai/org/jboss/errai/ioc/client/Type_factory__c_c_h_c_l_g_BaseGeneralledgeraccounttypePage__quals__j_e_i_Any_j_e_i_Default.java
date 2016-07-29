package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.CreateGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.EditGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay;
import com.cloderia.helion.client.local.generalledgeraccounttype.ListGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.ViewGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccounttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;
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

public class Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseGeneralledgeraccounttypePage> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BaseGeneralledgeraccounttypePage.class, "Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_BaseGeneralledgeraccounttypePageTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BaseGeneralledgeraccounttypePage.class);
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

  public BaseGeneralledgeraccounttypePage createInstance(final ContextManager contextManager) {
    final BaseGeneralledgeraccounttypePage instance = new BaseGeneralledgeraccounttypePage();
    setIncompleteInstance(instance);
    final TransitionTo BaseGeneralledgeraccounttypePage_listGeneralledgeraccounttypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListGeneralledgeraccounttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccounttypePage_listGeneralledgeraccounttypesPage);
    BaseGeneralledgeraccounttypePage_TransitionTo_listGeneralledgeraccounttypesPage(instance, BaseGeneralledgeraccounttypePage_listGeneralledgeraccounttypesPage);
    final TransitionTo BaseGeneralledgeraccounttypePage_editGeneralledgeraccounttypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { EditGeneralledgeraccounttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccounttypePage_editGeneralledgeraccounttypePage);
    BaseGeneralledgeraccounttypePage_TransitionTo_editGeneralledgeraccounttypePage(instance, BaseGeneralledgeraccounttypePage_editGeneralledgeraccounttypePage);
    final Heading BaseGeneralledgeraccounttypePage_viewTitle = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BaseGeneralledgeraccounttypePage_viewTitle);
    BaseGeneralledgeraccounttypePage_Heading_viewTitle(instance, BaseGeneralledgeraccounttypePage_viewTitle);
    final SideBar BasePortalPage_sidebar = (SideBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_sidebar);
    BasePortalPage_SideBar_sidebar(instance, BasePortalPage_sidebar);
    final TransitionTo BaseGeneralledgeraccounttypePage_createGeneralledgeraccounttypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { CreateGeneralledgeraccounttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccounttypePage_createGeneralledgeraccounttypePage);
    BaseGeneralledgeraccounttypePage_TransitionTo_createGeneralledgeraccounttypePage(instance, BaseGeneralledgeraccounttypePage_createGeneralledgeraccounttypePage);
    final TransitionTo BaseGeneralledgeraccounttypePage_viewGeneralledgeraccounttypePage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ViewGeneralledgeraccounttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccounttypePage_viewGeneralledgeraccounttypePage);
    BaseGeneralledgeraccounttypePage_TransitionTo_viewGeneralledgeraccounttypePage(instance, BaseGeneralledgeraccounttypePage_viewGeneralledgeraccounttypePage);
    final Caller BaseGeneralledgeraccounttypePage_universeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { UniverseEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccounttypePage_universeService);
    BaseGeneralledgeraccounttypePage_Caller_universeService(instance, BaseGeneralledgeraccounttypePage_universeService);
    final NavBar BasePortalPage_header = (NavBar) contextManager.getInstance("Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BasePortalPage_header);
    BasePortalPage_NavBar_header(instance, BasePortalPage_header);
    final Caller BaseGeneralledgeraccounttypePage_generalledgeraccounttypeService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { GeneralledgeraccounttypeEndPoint.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BaseGeneralledgeraccounttypePage_generalledgeraccounttypeService);
    BaseGeneralledgeraccounttypePage_Caller_generalledgeraccounttypeService(instance, BaseGeneralledgeraccounttypePage_generalledgeraccounttypeService);
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", new AbstractCDIEventCallback<GeneralledgeraccounttypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=CREATE)");
      }
      public void fireEvent(final GeneralledgeraccounttypeOperation event) {
        instance.onRemoteEntityCreated(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation [@com.cloderia.helion.client.shared.Operation(value=CREATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityCreatedSubscriptionForGeneralledgeraccounttypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", new AbstractCDIEventCallback<GeneralledgeraccounttypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=UPDATE)");
      }
      public void fireEvent(final GeneralledgeraccounttypeOperation event) {
        instance.onRemoteEntityEdited(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation [@com.cloderia.helion.client.shared.Operation(value=UPDATE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityEditedSubscriptionForGeneralledgeraccounttypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscription", CDI.subscribe("com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", new AbstractCDIEventCallback<GeneralledgeraccounttypeOperation>() {
      {
        qualifierSet.add("com.cloderia.helion.client.shared.Operation(value=DELETE)");
      }
      public void fireEvent(final GeneralledgeraccounttypeOperation event) {
        instance.onRemoteEntityDeleted(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation [@com.cloderia.helion.client.shared.Operation(value=DELETE)]";
      }
    }));
    thisInstance.setReference(instance, "onRemoteEntityDeletedSubscriptionForGeneralledgeraccounttypeOperation", ErraiBus.get().subscribe("cdi.event:com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", CDI.ROUTING_CALLBACK));
    thisInstance.setReference(instance, "doRenderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", new AbstractCDIEventCallback<GeneralledgeraccounttypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final GeneralledgeraccounttypeDisplay event) {
        instance.doRenderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderSingleViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccounttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderSingleView");
      }
      public void fireEvent(final GeneralledgeraccounttypeListItemDisplay event) {
        instance.doRenderSingleView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderSingleView()]";
      }
    }));
    thisInstance.setReference(instance, "doRenderDeleteViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccounttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderDeleteView");
      }
      public void fireEvent(final GeneralledgeraccounttypeListItemDisplay event) {
        instance.doRenderDeleteView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderDeleteView()]";
      }
    }));
    thisInstance.setReference(instance, "renderEditViewSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccounttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.RenderEditView");
      }
      public void fireEvent(final GeneralledgeraccounttypeListItemDisplay event) {
        instance.renderEditView(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay [@com.cloderia.helion.client.local.ui.RenderEditView()]";
      }
    }));
    thisInstance.setReference(instance, "doCreateEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", new AbstractCDIEventCallback<GeneralledgeraccounttypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.CreateEntity");
      }
      public void fireEvent(final GeneralledgeraccounttypeEditor event) {
        instance.doCreateEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor [@com.cloderia.helion.client.local.ui.CreateEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doEditEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", new AbstractCDIEventCallback<GeneralledgeraccounttypeEditor>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.EditEntity");
      }
      public void fireEvent(final GeneralledgeraccounttypeEditor event) {
        instance.doEditEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor [@com.cloderia.helion.client.local.ui.EditEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntitySubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", new AbstractCDIEventCallback<GeneralledgeraccounttypeDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final GeneralledgeraccounttypeDisplay event) {
        instance.doDeleteEntity(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    thisInstance.setReference(instance, "doDeleteEntityListItemSubscription", CDI.subscribeLocal("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", new AbstractCDIEventCallback<GeneralledgeraccounttypeListItemDisplay>() {
      {
        qualifierSet.add("com.cloderia.helion.client.local.ui.DeleteEntity");
      }
      public void fireEvent(final GeneralledgeraccounttypeListItemDisplay event) {
        instance.doDeleteEntityListItem(event);
      }
      public String toString() {
        return "Observer: com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay [@com.cloderia.helion.client.local.ui.DeleteEntity()]";
      }
    }));
    c_c_h_c_l_g_BaseGeneralledgeraccounttypePageTemplateResource templateForBaseGeneralledgeraccounttypePage = GWT.create(c_c_h_c_l_g_BaseGeneralledgeraccounttypePageTemplateResource.class);
    Element parentElementForTemplateOfBaseGeneralledgeraccounttypePage = TemplateUtil.getRootTemplateParentElement(templateForBaseGeneralledgeraccounttypePage.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", "app-container");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseGeneralledgeraccounttypePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseGeneralledgeraccounttypePage));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_NavBar_header(instance).asWidget();
      }
    }, dataFieldElements, "header");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BasePortalPage_SideBar_sidebar(instance).asWidget();
      }
    }, dataFieldElements, "sidebar");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseGeneralledgeraccounttypePage_Heading_viewTitle(instance)));
      }
    }, dataFieldElements, "viewTitle");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BaseGeneralledgeraccounttypePage_AnchorElement_listGeneralledgeraccounttypesPageLink(instance));
      }
    }, dataFieldElements, "listGeneralledgeraccounttypesPageLink");
    templateFieldsMap.put("header", BasePortalPage_NavBar_header(instance).asWidget());
    templateFieldsMap.put("sidebar", BasePortalPage_SideBar_sidebar(instance).asWidget());
    templateFieldsMap.put("viewTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BaseGeneralledgeraccounttypePage_Heading_viewTitle(instance))));
    templateFieldsMap.put("listGeneralledgeraccounttypesPageLink", ElementWrapperWidget.getWidget(BaseGeneralledgeraccounttypePage_AnchorElement_listGeneralledgeraccounttypesPageLink(instance)));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBaseGeneralledgeraccounttypePage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listGeneralledgeraccounttypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BaseGeneralledgeraccounttypePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final BaseGeneralledgeraccounttypePage instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityCreatedSubscriptionForGeneralledgeraccounttypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityEditedSubscriptionForGeneralledgeraccounttypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "onRemoteEntityDeletedSubscriptionForGeneralledgeraccounttypeOperation", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderSingleViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doRenderDeleteViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "renderEditViewSubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doCreateEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doEditEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntitySubscription", Subscription.class)).remove();
    ((Subscription) thisInstance.getReferenceAs(instance, "doDeleteEntityListItemSubscription", Subscription.class)).remove();
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BaseGeneralledgeraccounttypePage_AnchorElement_listGeneralledgeraccounttypesPageLink(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final BaseGeneralledgeraccounttypePage instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo BaseGeneralledgeraccounttypePage_TransitionTo_viewGeneralledgeraccounttypePage(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::viewGeneralledgeraccounttypePage;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_TransitionTo_viewGeneralledgeraccounttypePage(BaseGeneralledgeraccounttypePage instance, TransitionTo<ViewGeneralledgeraccounttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::viewGeneralledgeraccounttypePage = value;
  }-*/;

  native static Heading BaseGeneralledgeraccounttypePage_Heading_viewTitle(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::viewTitle;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_Heading_viewTitle(BaseGeneralledgeraccounttypePage instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::viewTitle = value;
  }-*/;

  native static TransitionTo BaseGeneralledgeraccounttypePage_TransitionTo_createGeneralledgeraccounttypePage(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::createGeneralledgeraccounttypePage;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_TransitionTo_createGeneralledgeraccounttypePage(BaseGeneralledgeraccounttypePage instance, TransitionTo<CreateGeneralledgeraccounttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::createGeneralledgeraccounttypePage = value;
  }-*/;

  native static AnchorElement BaseGeneralledgeraccounttypePage_AnchorElement_listGeneralledgeraccounttypesPageLink(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::listGeneralledgeraccounttypesPageLink;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_AnchorElement_listGeneralledgeraccounttypesPageLink(BaseGeneralledgeraccounttypePage instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::listGeneralledgeraccounttypesPageLink = value;
  }-*/;

  native static TransitionTo BaseGeneralledgeraccounttypePage_TransitionTo_editGeneralledgeraccounttypePage(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::editGeneralledgeraccounttypePage;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_TransitionTo_editGeneralledgeraccounttypePage(BaseGeneralledgeraccounttypePage instance, TransitionTo<EditGeneralledgeraccounttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::editGeneralledgeraccounttypePage = value;
  }-*/;

  native static Caller BaseGeneralledgeraccounttypePage_Caller_generalledgeraccounttypeService(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::generalledgeraccounttypeService;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_Caller_generalledgeraccounttypeService(BaseGeneralledgeraccounttypePage instance, Caller<GeneralledgeraccounttypeEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::generalledgeraccounttypeService = value;
  }-*/;

  native static NavBar BasePortalPage_NavBar_header(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header;
  }-*/;

  native static void BasePortalPage_NavBar_header(BasePortalPage instance, NavBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::header = value;
  }-*/;

  native static SideBar BasePortalPage_SideBar_sidebar(BasePortalPage instance) /*-{
    return instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar;
  }-*/;

  native static void BasePortalPage_SideBar_sidebar(BasePortalPage instance, SideBar value) /*-{
    instance.@com.cloderia.helion.client.local.ui.BasePortalPage::sidebar = value;
  }-*/;

  native static TransitionTo BaseGeneralledgeraccounttypePage_TransitionTo_listGeneralledgeraccounttypesPage(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::listGeneralledgeraccounttypesPage;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_TransitionTo_listGeneralledgeraccounttypesPage(BaseGeneralledgeraccounttypePage instance, TransitionTo<ListGeneralledgeraccounttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::listGeneralledgeraccounttypesPage = value;
  }-*/;

  native static Caller BaseGeneralledgeraccounttypePage_Caller_universeService(BaseGeneralledgeraccounttypePage instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::universeService;
  }-*/;

  native static void BaseGeneralledgeraccounttypePage_Caller_universeService(BaseGeneralledgeraccounttypePage instance, Caller<UniverseEndPoint> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage::universeService = value;
  }-*/;
}
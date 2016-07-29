package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.systemuser.ListSystemuserPage;
import com.cloderia.helion.client.local.systemuser.SystemuserDisplay;
import com.cloderia.helion.client.local.systemuser.SystemuserPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Systemuser;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.BoundUtil;
import org.jboss.errai.databinding.client.api.DataBinder;
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

public class Type_factory__c_c_h_c_l_s_SystemuserDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SystemuserDisplay.class, "Type_factory__c_c_h_c_l_s_SystemuserDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SystemuserDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/systemuser/view-systemuser-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SystemuserDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SystemuserDisplay.class);
    handle.addAssignableType(SystemuserPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SystemuserDisplay createInstance(final ContextManager contextManager) {
    final SystemuserDisplay instance = new SystemuserDisplay();
    setIncompleteInstance(instance);
    final TableCell SystemuserDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_effectiveDt);
    SystemuserDisplay_TableCell_effectiveDt(instance, SystemuserDisplay_effectiveDt);
    final TableCell SystemuserDisplay_lockedFg = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_lockedFg);
    SystemuserDisplay_TableCell_lockedFg(instance, SystemuserDisplay_lockedFg);
    final DataBinder SystemuserPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Systemuser.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SystemuserPresenter_binder);
    SystemuserPresenter_DataBinder_binder(instance, SystemuserPresenter_binder);
    final TableCell SystemuserDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_entityCode);
    SystemuserDisplay_TableCell_entityCode(instance, SystemuserDisplay_entityCode);
    final Div SystemuserDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_entityDisplayComponent);
    SystemuserDisplay_Div_entityDisplayComponent(instance, SystemuserDisplay_entityDisplayComponent);
    final TableCell SystemuserDisplay_password = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_password);
    SystemuserDisplay_TableCell_password(instance, SystemuserDisplay_password);
    final TableCell SystemuserDisplay_userNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_userNm);
    SystemuserDisplay_TableCell_userNm(instance, SystemuserDisplay_userNm);
    final Span SystemuserDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_lastModifiedDt);
    SystemuserDisplay_Span_lastModifiedDt(instance, SystemuserDisplay_lastModifiedDt);
    final TableCell SystemuserDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_universe);
    SystemuserDisplay_TableCell_universe(instance, SystemuserDisplay_universe);
    final TableCell SystemuserDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_name);
    SystemuserDisplay_TableCell_name(instance, SystemuserDisplay_name);
    final Event SystemuserDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SystemuserDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, SystemuserDisplay_deleteEntityEvent);
    SystemuserDisplay_Event_deleteEntityEvent(instance, SystemuserDisplay_deleteEntityEvent);
    final Span SystemuserDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_createdDt);
    SystemuserDisplay_Span_createdDt(instance, SystemuserDisplay_createdDt);
    final Event SystemuserDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SystemuserDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, SystemuserDisplay_renderEditViewEvent);
    SystemuserDisplay_Event_renderEditViewEvent(instance, SystemuserDisplay_renderEditViewEvent);
    final TableCell SystemuserDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_party);
    SystemuserDisplay_TableCell_party(instance, SystemuserDisplay_party);
    final TableCell SystemuserDisplay_lastLoginDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserDisplay_lastLoginDt);
    SystemuserDisplay_TableCell_lastLoginDt(instance, SystemuserDisplay_lastLoginDt);
    final Heading SystemuserDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, SystemuserDisplay_code);
    SystemuserDisplay_Heading_code(instance, SystemuserDisplay_code);
    final TransitionTo SystemuserDisplay_listSystemusersPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListSystemuserPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SystemuserDisplay_listSystemusersPage);
    SystemuserDisplay_TransitionTo_listSystemusersPage(instance, SystemuserDisplay_listSystemusersPage);
    c_c_h_c_l_s_SystemuserDisplayTemplateResource templateForSystemuserDisplay = GWT.create(c_c_h_c_l_s_SystemuserDisplayTemplateResource.class);
    Element parentElementForTemplateOfSystemuserDisplay = TemplateUtil.getRootTemplateParentElement(templateForSystemuserDisplay.getContents().getText(), "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_userNm(instance)));
      }
    }, dataFieldElements, "userNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_password(instance)));
      }
    }, dataFieldElements, "password");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_lastLoginDt(instance)));
      }
    }, dataFieldElements, "lastLoginDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_lockedFg(instance)));
      }
    }, dataFieldElements, "lockedFg");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_editSystemuserBtn(instance));
      }
    }, dataFieldElements, "editSystemuserBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_deleteSystemuserBtn(instance));
      }
    }, dataFieldElements, "deleteSystemuserBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com/cloderia/helion/client/local/systemuser/view-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_listSystemusersPageLink(instance));
      }
    }, dataFieldElements, "listSystemusersPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_party(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_name(instance))));
    templateFieldsMap.put("userNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_userNm(instance))));
    templateFieldsMap.put("password", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_password(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("lastLoginDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_lastLoginDt(instance))));
    templateFieldsMap.put("lockedFg", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserDisplay_TableCell_lockedFg(instance))));
    templateFieldsMap.put("editSystemuserBtn", ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_editSystemuserBtn(instance)));
    templateFieldsMap.put("deleteSystemuserBtn", ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_deleteSystemuserBtn(instance)));
    templateFieldsMap.put("listSystemusersPageLink", ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_listSystemusersPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editSystemuserBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditSystemuserBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteSystemuserBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteSystemuserBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listSystemusersPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = SystemuserPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.systemuser.SystemuserDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_userNm(instance))), "userNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_password(instance))), "password", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_lastLoginDt(instance))), "lastLoginDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserDisplay_TableCell_lockedFg(instance))), "lockedFg", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SystemuserDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final SystemuserDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_editSystemuserBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_deleteSystemuserBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SystemuserDisplay_AnchorElement_listSystemusersPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SystemuserDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo SystemuserDisplay_TransitionTo_listSystemusersPage(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::listSystemusersPage;
  }-*/;

  native static void SystemuserDisplay_TransitionTo_listSystemusersPage(SystemuserDisplay instance, TransitionTo<ListSystemuserPage> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::listSystemusersPage = value;
  }-*/;

  native static AnchorElement SystemuserDisplay_AnchorElement_listSystemusersPageLink(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::listSystemusersPageLink;
  }-*/;

  native static void SystemuserDisplay_AnchorElement_listSystemusersPageLink(SystemuserDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::listSystemusersPageLink = value;
  }-*/;

  native static Event SystemuserDisplay_Event_deleteEntityEvent(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::deleteEntityEvent;
  }-*/;

  native static void SystemuserDisplay_Event_deleteEntityEvent(SystemuserDisplay instance, Event<SystemuserDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_entityCode(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::entityCode;
  }-*/;

  native static void SystemuserDisplay_TableCell_entityCode(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::entityCode = value;
  }-*/;

  native static Span SystemuserDisplay_Span_lastModifiedDt(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::lastModifiedDt;
  }-*/;

  native static void SystemuserDisplay_Span_lastModifiedDt(SystemuserDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::lastModifiedDt = value;
  }-*/;

  native static Event SystemuserDisplay_Event_renderEditViewEvent(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::renderEditViewEvent;
  }-*/;

  native static void SystemuserDisplay_Event_renderEditViewEvent(SystemuserDisplay instance, Event<SystemuserDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_lockedFg(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::lockedFg;
  }-*/;

  native static void SystemuserDisplay_TableCell_lockedFg(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::lockedFg = value;
  }-*/;

  native static AnchorElement SystemuserDisplay_AnchorElement_editSystemuserBtn(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::editSystemuserBtn;
  }-*/;

  native static void SystemuserDisplay_AnchorElement_editSystemuserBtn(SystemuserDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::editSystemuserBtn = value;
  }-*/;

  native static Div SystemuserDisplay_Div_entityDisplayComponent(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::entityDisplayComponent;
  }-*/;

  native static void SystemuserDisplay_Div_entityDisplayComponent(SystemuserDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_name(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::name;
  }-*/;

  native static void SystemuserDisplay_TableCell_name(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::name = value;
  }-*/;

  native static Heading SystemuserDisplay_Heading_code(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::code;
  }-*/;

  native static void SystemuserDisplay_Heading_code(SystemuserDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::code = value;
  }-*/;

  native static Span SystemuserDisplay_Span_createdDt(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::createdDt;
  }-*/;

  native static void SystemuserDisplay_Span_createdDt(SystemuserDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::createdDt = value;
  }-*/;

  native static DataBinder SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder;
  }-*/;

  native static void SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance, DataBinder<Systemuser> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_party(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::party;
  }-*/;

  native static void SystemuserDisplay_TableCell_party(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::party = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_universe(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::universe;
  }-*/;

  native static void SystemuserDisplay_TableCell_universe(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::universe = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_effectiveDt(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::effectiveDt;
  }-*/;

  native static void SystemuserDisplay_TableCell_effectiveDt(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::effectiveDt = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_password(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::password;
  }-*/;

  native static void SystemuserDisplay_TableCell_password(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::password = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_lastLoginDt(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::lastLoginDt;
  }-*/;

  native static void SystemuserDisplay_TableCell_lastLoginDt(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::lastLoginDt = value;
  }-*/;

  native static TableCell SystemuserDisplay_TableCell_userNm(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::userNm;
  }-*/;

  native static void SystemuserDisplay_TableCell_userNm(SystemuserDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::userNm = value;
  }-*/;

  native static AnchorElement SystemuserDisplay_AnchorElement_deleteSystemuserBtn(SystemuserDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::deleteSystemuserBtn;
  }-*/;

  native static void SystemuserDisplay_AnchorElement_deleteSystemuserBtn(SystemuserDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserDisplay::deleteSystemuserBtn = value;
  }-*/;
}
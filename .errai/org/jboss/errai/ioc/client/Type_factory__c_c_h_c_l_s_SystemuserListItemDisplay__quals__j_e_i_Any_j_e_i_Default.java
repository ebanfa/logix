package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay;
import com.cloderia.helion.client.local.systemuser.SystemuserPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
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
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.dom.TableRow;
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
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_s_SystemuserListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SystemuserListItemDisplay.class, "Type_factory__c_c_h_c_l_s_SystemuserListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SystemuserListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/systemuser/list-systemuser-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SystemuserListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SystemuserListItemDisplay.class);
    handle.addAssignableType(SystemuserPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SystemuserListItemDisplay createInstance(final ContextManager contextManager) {
    final SystemuserListItemDisplay instance = new SystemuserListItemDisplay();
    setIncompleteInstance(instance);
    final AnchorElement SystemuserListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_editEntityListItemBtn);
    SystemuserListItemDisplay_AnchorElement_editEntityListItemBtn(instance, SystemuserListItemDisplay_editEntityListItemBtn);
    final TableCell SystemuserListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_entityCode);
    SystemuserListItemDisplay_TableCell_entityCode(instance, SystemuserListItemDisplay_entityCode);
    final Event SystemuserListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SystemuserListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, SystemuserListItemDisplay_renderSingleViewEvent);
    SystemuserListItemDisplay_Event_renderSingleViewEvent(instance, SystemuserListItemDisplay_renderSingleViewEvent);
    final DataBinder SystemuserPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Systemuser.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SystemuserPresenter_binder);
    SystemuserPresenter_DataBinder_binder(instance, SystemuserPresenter_binder);
    final TableCell SystemuserListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_effectiveDt);
    SystemuserListItemDisplay_TableCell_effectiveDt(instance, SystemuserListItemDisplay_effectiveDt);
    final TableCell SystemuserListItemDisplay_password = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_password);
    SystemuserListItemDisplay_TableCell_password(instance, SystemuserListItemDisplay_password);
    final TableCell SystemuserListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_name);
    SystemuserListItemDisplay_TableCell_name(instance, SystemuserListItemDisplay_name);
    final Event SystemuserListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SystemuserListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, SystemuserListItemDisplay_renderEditViewEvent);
    SystemuserListItemDisplay_Event_renderEditViewEvent(instance, SystemuserListItemDisplay_renderEditViewEvent);
    final TableCell SystemuserListItemDisplay_lastLoginDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_lastLoginDt);
    SystemuserListItemDisplay_TableCell_lastLoginDt(instance, SystemuserListItemDisplay_lastLoginDt);
    final TableCell SystemuserListItemDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_party);
    SystemuserListItemDisplay_TableCell_party(instance, SystemuserListItemDisplay_party);
    final TableRow SystemuserListItemDisplay_systemuserItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_systemuserItem);
    SystemuserListItemDisplay_TableRow_systemuserItem(instance, SystemuserListItemDisplay_systemuserItem);
    final TableCell SystemuserListItemDisplay_lockedFg = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_lockedFg);
    SystemuserListItemDisplay_TableCell_lockedFg(instance, SystemuserListItemDisplay_lockedFg);
    final TableCell SystemuserListItemDisplay_userNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_userNm);
    SystemuserListItemDisplay_TableCell_userNm(instance, SystemuserListItemDisplay_userNm);
    final AnchorElement SystemuserListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserListItemDisplay_deleteEntityListItemBtn);
    SystemuserListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, SystemuserListItemDisplay_deleteEntityListItemBtn);
    final Event SystemuserListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SystemuserListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, SystemuserListItemDisplay_deleteEntityEvent);
    SystemuserListItemDisplay_Event_deleteEntityEvent(instance, SystemuserListItemDisplay_deleteEntityEvent);
    c_c_h_c_l_s_SystemuserListItemDisplayTemplateResource templateForSystemuserListItemDisplay = GWT.create(c_c_h_c_l_s_SystemuserListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfSystemuserListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForSystemuserListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", "systemuserItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableRow_systemuserItem(instance)));
      }
    }, dataFieldElements, "systemuserItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_userNm(instance)));
      }
    }, dataFieldElements, "userNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_password(instance)));
      }
    }, dataFieldElements, "password");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_lastLoginDt(instance)));
      }
    }, dataFieldElements, "lastLoginDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_lockedFg(instance)));
      }
    }, dataFieldElements, "lockedFg");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SystemuserListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SystemuserListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("systemuserItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableRow_systemuserItem(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_party(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("userNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_userNm(instance))));
    templateFieldsMap.put("password", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_password(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("lastLoginDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_lastLoginDt(instance))));
    templateFieldsMap.put("lockedFg", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListItemDisplay_TableCell_lockedFg(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(SystemuserListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(SystemuserListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserListItemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderEditView(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderDeleteView(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = SystemuserPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_userNm(instance))), "userNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_password(instance))), "password", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_lastLoginDt(instance))), "lastLoginDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SystemuserListItemDisplay_TableCell_lockedFg(instance))), "lockedFg", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SystemuserListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final SystemuserListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SystemuserListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SystemuserListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SystemuserListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell SystemuserListItemDisplay_TableCell_userNm(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::userNm;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_userNm(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::userNm = value;
  }-*/;

  native static TableCell SystemuserListItemDisplay_TableCell_lastLoginDt(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::lastLoginDt;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_lastLoginDt(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::lastLoginDt = value;
  }-*/;

  native static AnchorElement SystemuserListItemDisplay_AnchorElement_editEntityListItemBtn(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void SystemuserListItemDisplay_AnchorElement_editEntityListItemBtn(SystemuserListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell SystemuserListItemDisplay_TableCell_effectiveDt(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::effectiveDt;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_effectiveDt(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell SystemuserListItemDisplay_TableCell_entityCode(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::entityCode;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_entityCode(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell SystemuserListItemDisplay_TableCell_party(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::party;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_party(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::party = value;
  }-*/;

  native static AnchorElement SystemuserListItemDisplay_AnchorElement_deleteEntityListItemBtn(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void SystemuserListItemDisplay_AnchorElement_deleteEntityListItemBtn(SystemuserListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static DataBinder SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder;
  }-*/;

  native static void SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance, DataBinder<Systemuser> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder = value;
  }-*/;

  native static TableRow SystemuserListItemDisplay_TableRow_systemuserItem(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::systemuserItem;
  }-*/;

  native static void SystemuserListItemDisplay_TableRow_systemuserItem(SystemuserListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::systemuserItem = value;
  }-*/;

  native static Event SystemuserListItemDisplay_Event_renderEditViewEvent(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void SystemuserListItemDisplay_Event_renderEditViewEvent(SystemuserListItemDisplay instance, Event<SystemuserListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static Event SystemuserListItemDisplay_Event_renderSingleViewEvent(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void SystemuserListItemDisplay_Event_renderSingleViewEvent(SystemuserListItemDisplay instance, Event<SystemuserListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static Event SystemuserListItemDisplay_Event_deleteEntityEvent(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void SystemuserListItemDisplay_Event_deleteEntityEvent(SystemuserListItemDisplay instance, Event<SystemuserListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell SystemuserListItemDisplay_TableCell_password(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::password;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_password(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::password = value;
  }-*/;

  native static TableCell SystemuserListItemDisplay_TableCell_lockedFg(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::lockedFg;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_lockedFg(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::lockedFg = value;
  }-*/;

  native static TableCell SystemuserListItemDisplay_TableCell_name(SystemuserListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::name;
  }-*/;

  native static void SystemuserListItemDisplay_TableCell_name(SystemuserListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay::name = value;
  }-*/;
}
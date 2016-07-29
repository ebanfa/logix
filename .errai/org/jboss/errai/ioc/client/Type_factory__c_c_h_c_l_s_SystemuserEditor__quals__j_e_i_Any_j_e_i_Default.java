package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.systemuser.ListSystemuserPage;
import com.cloderia.helion.client.local.systemuser.SystemuserEditor;
import com.cloderia.helion.client.local.systemuser.SystemuserPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Systemuser;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.api.Convert;
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

public class Type_factory__c_c_h_c_l_s_SystemuserEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SystemuserEditor.class, "Type_factory__c_c_h_c_l_s_SystemuserEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SystemuserEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SystemuserEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SystemuserEditor.class);
    handle.addAssignableType(SystemuserPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SystemuserEditor createInstance(final ContextManager contextManager) {
    final SystemuserEditor instance = new SystemuserEditor();
    setIncompleteInstance(instance);
    final TextBox SystemuserEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_entityCode);
    SystemuserEditor_TextBox_entityCode(instance, SystemuserEditor_entityCode);
    final TransitionTo SystemuserEditor_listSystemusersPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListSystemuserPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SystemuserEditor_listSystemusersPage);
    SystemuserEditor_TransitionTo_listSystemusersPage(instance, SystemuserEditor_listSystemusersPage);
    final TextBox SystemuserEditor_lockedFg = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_lockedFg);
    SystemuserEditor_TextBox_lockedFg(instance, SystemuserEditor_lockedFg);
    final Event SystemuserEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SystemuserEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, SystemuserEditor_createEntityEvent);
    SystemuserEditor_Event_createEntityEvent(instance, SystemuserEditor_createEntityEvent);
    final ListBox SystemuserEditor_party = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_party);
    SystemuserEditor_ListBox_party(instance, SystemuserEditor_party);
    final TextBox SystemuserEditor_lastLoginDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_lastLoginDt);
    SystemuserEditor_TextBox_lastLoginDt(instance, SystemuserEditor_lastLoginDt);
    final Div SystemuserEditor_systemuserEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SystemuserEditor_systemuserEditor);
    SystemuserEditor_Div_systemuserEditor(instance, SystemuserEditor_systemuserEditor);
    final TextBox SystemuserEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_name);
    SystemuserEditor_TextBox_name(instance, SystemuserEditor_name);
    final ListBox SystemuserEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_universe);
    SystemuserEditor_ListBox_universe(instance, SystemuserEditor_universe);
    final DataBinder SystemuserPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Systemuser.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SystemuserPresenter_binder);
    SystemuserPresenter_DataBinder_binder(instance, SystemuserPresenter_binder);
    final TextBox SystemuserEditor_userNm = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_userNm);
    SystemuserEditor_TextBox_userNm(instance, SystemuserEditor_userNm);
    final Event SystemuserEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SystemuserEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, SystemuserEditor_editEntityEvent);
    SystemuserEditor_Event_editEntityEvent(instance, SystemuserEditor_editEntityEvent);
    final TextBox SystemuserEditor_password = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_password);
    SystemuserEditor_TextBox_password(instance, SystemuserEditor_password);
    final TextBox SystemuserEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserEditor_effectiveDt);
    SystemuserEditor_TextBox_effectiveDt(instance, SystemuserEditor_effectiveDt);
    c_c_h_c_l_s_SystemuserEditorTemplateResource templateForSystemuserEditor = GWT.create(c_c_h_c_l_s_SystemuserEditorTemplateResource.class);
    Element parentElementForTemplateOfSystemuserEditor = TemplateUtil.getRootTemplateParentElement(templateForSystemuserEditor.getContents().getText(), "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", "systemuserEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserEditor_Div_systemuserEditor(instance)));
      }
    }, dataFieldElements, "systemuserEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_ListBox_party(instance).asWidget();
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_TextBox_userNm(instance).asWidget();
      }
    }, dataFieldElements, "userNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_TextBox_password(instance).asWidget();
      }
    }, dataFieldElements, "password");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_TextBox_lastLoginDt(instance).asWidget();
      }
    }, dataFieldElements, "lastLoginDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_TextBox_lockedFg(instance).asWidget();
      }
    }, dataFieldElements, "lockedFg");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserEditor_Button_editSystemuserBtn(instance).asWidget();
      }
    }, dataFieldElements, "editSystemuserBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com/cloderia/helion/client/local/systemuser/edit-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SystemuserEditor_AnchorElement_listSystemusersPageLink(instance));
      }
    }, dataFieldElements, "listSystemusersPageLink");
    templateFieldsMap.put("systemuserEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserEditor_Div_systemuserEditor(instance))));
    templateFieldsMap.put("party", SystemuserEditor_ListBox_party(instance).asWidget());
    templateFieldsMap.put("universe", SystemuserEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", SystemuserEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", SystemuserEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("userNm", SystemuserEditor_TextBox_userNm(instance).asWidget());
    templateFieldsMap.put("password", SystemuserEditor_TextBox_password(instance).asWidget());
    templateFieldsMap.put("effectiveDt", SystemuserEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("lastLoginDt", SystemuserEditor_TextBox_lastLoginDt(instance).asWidget());
    templateFieldsMap.put("lockedFg", SystemuserEditor_TextBox_lockedFg(instance).asWidget());
    templateFieldsMap.put("editSystemuserBtn", SystemuserEditor_Button_editSystemuserBtn(instance).asWidget());
    templateFieldsMap.put("listSystemusersPageLink", ElementWrapperWidget.getWidget(SystemuserEditor_AnchorElement_listSystemusersPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editSystemuserBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editSystemuser(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listSystemusersPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = SystemuserPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.systemuser.SystemuserEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(SystemuserEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(SystemuserEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(SystemuserEditor_TextBox_userNm(instance), "userNm", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(SystemuserEditor_TextBox_password(instance), "password", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(SystemuserEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    binder.bind(SystemuserEditor_TextBox_lastLoginDt(instance), "lastLoginDt", new DateConverter(), null, false);
    binder.bind(SystemuserEditor_TextBox_lockedFg(instance), "lockedFg", Convert.getConverter(String.class, String.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SystemuserEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final SystemuserEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SystemuserEditor_AnchorElement_listSystemusersPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SystemuserEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox SystemuserEditor_TextBox_name(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::name;
  }-*/;

  native static void SystemuserEditor_TextBox_name(SystemuserEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::name = value;
  }-*/;

  native static TextBox SystemuserEditor_TextBox_lastLoginDt(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::lastLoginDt;
  }-*/;

  native static void SystemuserEditor_TextBox_lastLoginDt(SystemuserEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::lastLoginDt = value;
  }-*/;

  native static Event SystemuserEditor_Event_createEntityEvent(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::createEntityEvent;
  }-*/;

  native static void SystemuserEditor_Event_createEntityEvent(SystemuserEditor instance, Event<SystemuserEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::createEntityEvent = value;
  }-*/;

  native static TextBox SystemuserEditor_TextBox_userNm(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::userNm;
  }-*/;

  native static void SystemuserEditor_TextBox_userNm(SystemuserEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::userNm = value;
  }-*/;

  native static TextBox SystemuserEditor_TextBox_entityCode(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::entityCode;
  }-*/;

  native static void SystemuserEditor_TextBox_entityCode(SystemuserEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::entityCode = value;
  }-*/;

  native static Event SystemuserEditor_Event_editEntityEvent(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::editEntityEvent;
  }-*/;

  native static void SystemuserEditor_Event_editEntityEvent(SystemuserEditor instance, Event<SystemuserEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::editEntityEvent = value;
  }-*/;

  native static Div SystemuserEditor_Div_systemuserEditor(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::systemuserEditor;
  }-*/;

  native static void SystemuserEditor_Div_systemuserEditor(SystemuserEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::systemuserEditor = value;
  }-*/;

  native static TextBox SystemuserEditor_TextBox_effectiveDt(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::effectiveDt;
  }-*/;

  native static void SystemuserEditor_TextBox_effectiveDt(SystemuserEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::effectiveDt = value;
  }-*/;

  native static ListBox SystemuserEditor_ListBox_universe(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::universe;
  }-*/;

  native static void SystemuserEditor_ListBox_universe(SystemuserEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::universe = value;
  }-*/;

  native static DataBinder SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder;
  }-*/;

  native static void SystemuserPresenter_DataBinder_binder(SystemuserPresenter instance, DataBinder<Systemuser> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserPresenter::binder = value;
  }-*/;

  native static Button SystemuserEditor_Button_editSystemuserBtn(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::editSystemuserBtn;
  }-*/;

  native static void SystemuserEditor_Button_editSystemuserBtn(SystemuserEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::editSystemuserBtn = value;
  }-*/;

  native static TextBox SystemuserEditor_TextBox_password(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::password;
  }-*/;

  native static void SystemuserEditor_TextBox_password(SystemuserEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::password = value;
  }-*/;

  native static TextBox SystemuserEditor_TextBox_lockedFg(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::lockedFg;
  }-*/;

  native static void SystemuserEditor_TextBox_lockedFg(SystemuserEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::lockedFg = value;
  }-*/;

  native static ListBox SystemuserEditor_ListBox_party(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::party;
  }-*/;

  native static void SystemuserEditor_ListBox_party(SystemuserEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::party = value;
  }-*/;

  native static TransitionTo SystemuserEditor_TransitionTo_listSystemusersPage(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::listSystemusersPage;
  }-*/;

  native static void SystemuserEditor_TransitionTo_listSystemusersPage(SystemuserEditor instance, TransitionTo<ListSystemuserPage> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::listSystemusersPage = value;
  }-*/;

  native static AnchorElement SystemuserEditor_AnchorElement_listSystemusersPageLink(SystemuserEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::listSystemusersPageLink;
  }-*/;

  native static void SystemuserEditor_AnchorElement_listSystemusersPageLink(SystemuserEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserEditor::listSystemusersPageLink = value;
  }-*/;
}
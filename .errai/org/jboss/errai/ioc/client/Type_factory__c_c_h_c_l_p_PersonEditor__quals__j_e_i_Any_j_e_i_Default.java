package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.person.ListPersonPage;
import com.cloderia.helion.client.local.person.PersonEditor;
import com.cloderia.helion.client.local.person.PersonPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Person;
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

public class Type_factory__c_c_h_c_l_p_PersonEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PersonEditor.class, "Type_factory__c_c_h_c_l_p_PersonEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PersonEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/person/edit-person-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PersonEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PersonEditor.class);
    handle.addAssignableType(PersonPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PersonEditor createInstance(final ContextManager contextManager) {
    final PersonEditor instance = new PersonEditor();
    setIncompleteInstance(instance);
    final TextBox PersonEditor_passportExpDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_passportExpDt);
    PersonEditor_TextBox_passportExpDt(instance, PersonEditor_passportExpDt);
    final TextBox PersonEditor_height = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_height);
    PersonEditor_TextBox_height(instance, PersonEditor_height);
    final ListBox PersonEditor_party = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_party);
    PersonEditor_ListBox_party(instance, PersonEditor_party);
    final DataBinder PersonPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Person.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PersonPresenter_binder);
    PersonPresenter_DataBinder_binder(instance, PersonPresenter_binder);
    final Event PersonEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PersonEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, PersonEditor_createEntityEvent);
    PersonEditor_Event_createEntityEvent(instance, PersonEditor_createEntityEvent);
    final Div PersonEditor_personEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonEditor_personEditor);
    PersonEditor_Div_personEditor(instance, PersonEditor_personEditor);
    final ListBox PersonEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_universe);
    PersonEditor_ListBox_universe(instance, PersonEditor_universe);
    final TextBox PersonEditor_middleNm = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_middleNm);
    PersonEditor_TextBox_middleNm(instance, PersonEditor_middleNm);
    final TextBox PersonEditor_passportNo = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_passportNo);
    PersonEditor_TextBox_passportNo(instance, PersonEditor_passportNo);
    final TextBox PersonEditor_taxPin = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_taxPin);
    PersonEditor_TextBox_taxPin(instance, PersonEditor_taxPin);
    final TextBox PersonEditor_firstNm = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_firstNm);
    PersonEditor_TextBox_firstNm(instance, PersonEditor_firstNm);
    final TextBox PersonEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_entityCode);
    PersonEditor_TextBox_entityCode(instance, PersonEditor_entityCode);
    final TextBox PersonEditor_weigth = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_weigth);
    PersonEditor_TextBox_weigth(instance, PersonEditor_weigth);
    final TextBox PersonEditor_lastNm = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_lastNm);
    PersonEditor_TextBox_lastNm(instance, PersonEditor_lastNm);
    final TextBox PersonEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_effectiveDt);
    PersonEditor_TextBox_effectiveDt(instance, PersonEditor_effectiveDt);
    final Event PersonEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PersonEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, PersonEditor_editEntityEvent);
    PersonEditor_Event_editEntityEvent(instance, PersonEditor_editEntityEvent);
    final TransitionTo PersonEditor_listPersonsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPersonPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PersonEditor_listPersonsPage);
    PersonEditor_TransitionTo_listPersonsPage(instance, PersonEditor_listPersonsPage);
    final TextBox PersonEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonEditor_name);
    PersonEditor_TextBox_name(instance, PersonEditor_name);
    c_c_h_c_l_p_PersonEditorTemplateResource templateForPersonEditor = GWT.create(c_c_h_c_l_p_PersonEditorTemplateResource.class);
    Element parentElementForTemplateOfPersonEditor = TemplateUtil.getRootTemplateParentElement(templateForPersonEditor.getContents().getText(), "com/cloderia/helion/client/local/person/edit-person-page.html", "personEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/person/edit-person-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonEditor_Div_personEditor(instance)));
      }
    }, dataFieldElements, "personEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_ListBox_party(instance).asWidget();
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_firstNm(instance).asWidget();
      }
    }, dataFieldElements, "firstNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_middleNm(instance).asWidget();
      }
    }, dataFieldElements, "middleNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_lastNm(instance).asWidget();
      }
    }, dataFieldElements, "lastNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_height(instance).asWidget();
      }
    }, dataFieldElements, "height");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_weigth(instance).asWidget();
      }
    }, dataFieldElements, "weigth");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_taxPin(instance).asWidget();
      }
    }, dataFieldElements, "taxPin");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_passportNo(instance).asWidget();
      }
    }, dataFieldElements, "passportNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_passportExpDt(instance).asWidget();
      }
    }, dataFieldElements, "passportExpDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonEditor_Button_editPersonBtn(instance).asWidget();
      }
    }, dataFieldElements, "editPersonBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonEditor", "com/cloderia/helion/client/local/person/edit-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PersonEditor_AnchorElement_listPersonsPageLink(instance));
      }
    }, dataFieldElements, "listPersonsPageLink");
    templateFieldsMap.put("personEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonEditor_Div_personEditor(instance))));
    templateFieldsMap.put("party", PersonEditor_ListBox_party(instance).asWidget());
    templateFieldsMap.put("universe", PersonEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", PersonEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", PersonEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("firstNm", PersonEditor_TextBox_firstNm(instance).asWidget());
    templateFieldsMap.put("middleNm", PersonEditor_TextBox_middleNm(instance).asWidget());
    templateFieldsMap.put("lastNm", PersonEditor_TextBox_lastNm(instance).asWidget());
    templateFieldsMap.put("height", PersonEditor_TextBox_height(instance).asWidget());
    templateFieldsMap.put("weigth", PersonEditor_TextBox_weigth(instance).asWidget());
    templateFieldsMap.put("taxPin", PersonEditor_TextBox_taxPin(instance).asWidget());
    templateFieldsMap.put("passportNo", PersonEditor_TextBox_passportNo(instance).asWidget());
    templateFieldsMap.put("passportExpDt", PersonEditor_TextBox_passportExpDt(instance).asWidget());
    templateFieldsMap.put("effectiveDt", PersonEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editPersonBtn", PersonEditor_Button_editPersonBtn(instance).asWidget());
    templateFieldsMap.put("listPersonsPageLink", ElementWrapperWidget.getWidget(PersonEditor_AnchorElement_listPersonsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editPersonBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editPerson(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPersonsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PersonPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.person.PersonEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PersonEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_firstNm(instance), "firstNm", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_middleNm(instance), "middleNm", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_lastNm(instance), "lastNm", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_height(instance), "height", Convert.getConverter(Integer.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_weigth(instance), "weigth", Convert.getConverter(Integer.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_taxPin(instance), "taxPin", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_passportNo(instance), "passportNo", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PersonEditor_TextBox_passportExpDt(instance), "passportExpDt", new DateConverter(), null, false);
    binder.bind(PersonEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PersonEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final PersonEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PersonEditor_AnchorElement_listPersonsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PersonEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo PersonEditor_TransitionTo_listPersonsPage(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::listPersonsPage;
  }-*/;

  native static void PersonEditor_TransitionTo_listPersonsPage(PersonEditor instance, TransitionTo<ListPersonPage> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::listPersonsPage = value;
  }-*/;

  native static ListBox PersonEditor_ListBox_party(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::party;
  }-*/;

  native static void PersonEditor_ListBox_party(PersonEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::party = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_weigth(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::weigth;
  }-*/;

  native static void PersonEditor_TextBox_weigth(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::weigth = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_height(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::height;
  }-*/;

  native static void PersonEditor_TextBox_height(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::height = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_taxPin(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::taxPin;
  }-*/;

  native static void PersonEditor_TextBox_taxPin(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::taxPin = value;
  }-*/;

  native static Event PersonEditor_Event_createEntityEvent(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::createEntityEvent;
  }-*/;

  native static void PersonEditor_Event_createEntityEvent(PersonEditor instance, Event<PersonEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::createEntityEvent = value;
  }-*/;

  native static AnchorElement PersonEditor_AnchorElement_listPersonsPageLink(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::listPersonsPageLink;
  }-*/;

  native static void PersonEditor_AnchorElement_listPersonsPageLink(PersonEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::listPersonsPageLink = value;
  }-*/;

  native static ListBox PersonEditor_ListBox_universe(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::universe;
  }-*/;

  native static void PersonEditor_ListBox_universe(PersonEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::universe = value;
  }-*/;

  native static Div PersonEditor_Div_personEditor(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::personEditor;
  }-*/;

  native static void PersonEditor_Div_personEditor(PersonEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::personEditor = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_name(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::name;
  }-*/;

  native static void PersonEditor_TextBox_name(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::name = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_passportNo(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::passportNo;
  }-*/;

  native static void PersonEditor_TextBox_passportNo(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::passportNo = value;
  }-*/;

  native static Button PersonEditor_Button_editPersonBtn(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::editPersonBtn;
  }-*/;

  native static void PersonEditor_Button_editPersonBtn(PersonEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::editPersonBtn = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_firstNm(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::firstNm;
  }-*/;

  native static void PersonEditor_TextBox_firstNm(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::firstNm = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_lastNm(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::lastNm;
  }-*/;

  native static void PersonEditor_TextBox_lastNm(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::lastNm = value;
  }-*/;

  native static Event PersonEditor_Event_editEntityEvent(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::editEntityEvent;
  }-*/;

  native static void PersonEditor_Event_editEntityEvent(PersonEditor instance, Event<PersonEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::editEntityEvent = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_effectiveDt(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::effectiveDt;
  }-*/;

  native static void PersonEditor_TextBox_effectiveDt(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::effectiveDt = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_passportExpDt(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::passportExpDt;
  }-*/;

  native static void PersonEditor_TextBox_passportExpDt(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::passportExpDt = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_middleNm(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::middleNm;
  }-*/;

  native static void PersonEditor_TextBox_middleNm(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::middleNm = value;
  }-*/;

  native static TextBox PersonEditor_TextBox_entityCode(PersonEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonEditor::entityCode;
  }-*/;

  native static void PersonEditor_TextBox_entityCode(PersonEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonEditor::entityCode = value;
  }-*/;

  native static DataBinder PersonPresenter_DataBinder_binder(PersonPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder;
  }-*/;

  native static void PersonPresenter_DataBinder_binder(PersonPresenter instance, DataBinder<Person> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder = value;
  }-*/;
}
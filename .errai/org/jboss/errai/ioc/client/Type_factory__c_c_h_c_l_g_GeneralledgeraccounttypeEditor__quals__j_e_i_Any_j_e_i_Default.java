package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter;
import com.cloderia.helion.client.local.generalledgeraccounttype.ListGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccounttypeEditor.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_GeneralledgeraccounttypeEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccounttypeEditor.class);
    handle.addAssignableType(GeneralledgeraccounttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccounttypeEditor createInstance(final ContextManager contextManager) {
    final GeneralledgeraccounttypeEditor instance = new GeneralledgeraccounttypeEditor();
    setIncompleteInstance(instance);
    final TextBox GeneralledgeraccounttypeEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_name);
    GeneralledgeraccounttypeEditor_TextBox_name(instance, GeneralledgeraccounttypeEditor_name);
    final Event GeneralledgeraccounttypeEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccounttypeEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_editEntityEvent);
    GeneralledgeraccounttypeEditor_Event_editEntityEvent(instance, GeneralledgeraccounttypeEditor_editEntityEvent);
    final TextBox GeneralledgeraccounttypeEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_entityCode);
    GeneralledgeraccounttypeEditor_TextBox_entityCode(instance, GeneralledgeraccounttypeEditor_entityCode);
    final TextBox GeneralledgeraccounttypeEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_effectiveDt);
    GeneralledgeraccounttypeEditor_TextBox_effectiveDt(instance, GeneralledgeraccounttypeEditor_effectiveDt);
    final Event GeneralledgeraccounttypeEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccounttypeEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_createEntityEvent);
    GeneralledgeraccounttypeEditor_Event_createEntityEvent(instance, GeneralledgeraccounttypeEditor_createEntityEvent);
    final TransitionTo GeneralledgeraccounttypeEditor_listGeneralledgeraccounttypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListGeneralledgeraccounttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_listGeneralledgeraccounttypesPage);
    GeneralledgeraccounttypeEditor_TransitionTo_listGeneralledgeraccounttypesPage(instance, GeneralledgeraccounttypeEditor_listGeneralledgeraccounttypesPage);
    final Div GeneralledgeraccounttypeEditor_generalledgeraccounttypeEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_generalledgeraccounttypeEditor);
    GeneralledgeraccounttypeEditor_Div_generalledgeraccounttypeEditor(instance, GeneralledgeraccounttypeEditor_generalledgeraccounttypeEditor);
    final ListBox GeneralledgeraccounttypeEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_universe);
    GeneralledgeraccounttypeEditor_ListBox_universe(instance, GeneralledgeraccounttypeEditor_universe);
    final TextBox GeneralledgeraccounttypeEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeEditor_description);
    GeneralledgeraccounttypeEditor_TextBox_description(instance, GeneralledgeraccounttypeEditor_description);
    final DataBinder GeneralledgeraccounttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccounttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccounttypePresenter_binder);
    GeneralledgeraccounttypePresenter_DataBinder_binder(instance, GeneralledgeraccounttypePresenter_binder);
    c_c_h_c_l_g_GeneralledgeraccounttypeEditorTemplateResource templateForGeneralledgeraccounttypeEditor = GWT.create(c_c_h_c_l_g_GeneralledgeraccounttypeEditorTemplateResource.class);
    Element parentElementForTemplateOfGeneralledgeraccounttypeEditor = TemplateUtil.getRootTemplateParentElement(templateForGeneralledgeraccounttypeEditor.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", "generalledgeraccounttypeEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeEditor_Div_generalledgeraccounttypeEditor(instance)));
      }
    }, dataFieldElements, "generalledgeraccounttypeEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccounttypeEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccounttypeEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccounttypeEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccounttypeEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccounttypeEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccounttypeEditor_Button_editGeneralledgeraccounttypeBtn(instance).asWidget();
      }
    }, dataFieldElements, "editGeneralledgeraccounttypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com/cloderia/helion/client/local/generalledgeraccounttype/edit-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccounttypeEditor_AnchorElement_listGeneralledgeraccounttypesPageLink(instance));
      }
    }, dataFieldElements, "listGeneralledgeraccounttypesPageLink");
    templateFieldsMap.put("generalledgeraccounttypeEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeEditor_Div_generalledgeraccounttypeEditor(instance))));
    templateFieldsMap.put("universe", GeneralledgeraccounttypeEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", GeneralledgeraccounttypeEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", GeneralledgeraccounttypeEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", GeneralledgeraccounttypeEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", GeneralledgeraccounttypeEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editGeneralledgeraccounttypeBtn", GeneralledgeraccounttypeEditor_Button_editGeneralledgeraccounttypeBtn(instance).asWidget());
    templateFieldsMap.put("listGeneralledgeraccounttypesPageLink", ElementWrapperWidget.getWidget(GeneralledgeraccounttypeEditor_AnchorElement_listGeneralledgeraccounttypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editGeneralledgeraccounttypeBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editGeneralledgeraccounttype(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listGeneralledgeraccounttypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = GeneralledgeraccounttypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(GeneralledgeraccounttypeEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(GeneralledgeraccounttypeEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(GeneralledgeraccounttypeEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(GeneralledgeraccounttypeEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccounttypeEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccounttypeEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccounttypeEditor_AnchorElement_listGeneralledgeraccounttypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final GeneralledgeraccounttypeEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox GeneralledgeraccounttypeEditor_ListBox_universe(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::universe;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_ListBox_universe(GeneralledgeraccounttypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::universe = value;
  }-*/;

  native static TextBox GeneralledgeraccounttypeEditor_TextBox_name(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::name;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_TextBox_name(GeneralledgeraccounttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::name = value;
  }-*/;

  native static TextBox GeneralledgeraccounttypeEditor_TextBox_effectiveDt(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::effectiveDt;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_TextBox_effectiveDt(GeneralledgeraccounttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::effectiveDt = value;
  }-*/;

  native static Event GeneralledgeraccounttypeEditor_Event_createEntityEvent(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::createEntityEvent;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_Event_createEntityEvent(GeneralledgeraccounttypeEditor instance, Event<GeneralledgeraccounttypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::createEntityEvent = value;
  }-*/;

  native static Div GeneralledgeraccounttypeEditor_Div_generalledgeraccounttypeEditor(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::generalledgeraccounttypeEditor;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_Div_generalledgeraccounttypeEditor(GeneralledgeraccounttypeEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::generalledgeraccounttypeEditor = value;
  }-*/;

  native static TextBox GeneralledgeraccounttypeEditor_TextBox_description(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::description;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_TextBox_description(GeneralledgeraccounttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::description = value;
  }-*/;

  native static AnchorElement GeneralledgeraccounttypeEditor_AnchorElement_listGeneralledgeraccounttypesPageLink(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::listGeneralledgeraccounttypesPageLink;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_AnchorElement_listGeneralledgeraccounttypesPageLink(GeneralledgeraccounttypeEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::listGeneralledgeraccounttypesPageLink = value;
  }-*/;

  native static DataBinder GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder;
  }-*/;

  native static void GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance, DataBinder<Generalledgeraccounttype> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder = value;
  }-*/;

  native static TextBox GeneralledgeraccounttypeEditor_TextBox_entityCode(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::entityCode;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_TextBox_entityCode(GeneralledgeraccounttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::entityCode = value;
  }-*/;

  native static TransitionTo GeneralledgeraccounttypeEditor_TransitionTo_listGeneralledgeraccounttypesPage(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::listGeneralledgeraccounttypesPage;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_TransitionTo_listGeneralledgeraccounttypesPage(GeneralledgeraccounttypeEditor instance, TransitionTo<ListGeneralledgeraccounttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::listGeneralledgeraccounttypesPage = value;
  }-*/;

  native static Event GeneralledgeraccounttypeEditor_Event_editEntityEvent(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::editEntityEvent;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_Event_editEntityEvent(GeneralledgeraccounttypeEditor instance, Event<GeneralledgeraccounttypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::editEntityEvent = value;
  }-*/;

  native static Button GeneralledgeraccounttypeEditor_Button_editGeneralledgeraccounttypeBtn(GeneralledgeraccounttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::editGeneralledgeraccounttypeBtn;
  }-*/;

  native static void GeneralledgeraccounttypeEditor_Button_editGeneralledgeraccounttypeBtn(GeneralledgeraccounttypeEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor::editGeneralledgeraccounttypeBtn = value;
  }-*/;
}
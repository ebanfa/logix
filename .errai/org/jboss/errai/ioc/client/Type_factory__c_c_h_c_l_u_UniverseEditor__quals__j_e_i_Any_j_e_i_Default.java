package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.local.universe.ListUniversePage;
import com.cloderia.helion.client.local.universe.UniverseEditor;
import com.cloderia.helion.client.local.universe.UniversePresenter;
import com.cloderia.helion.client.shared.model.Universe;
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

public class Type_factory__c_c_h_c_l_u_UniverseEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(UniverseEditor.class, "Type_factory__c_c_h_c_l_u_UniverseEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_u_UniverseEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/universe/edit-universe-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_u_UniverseEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(UniverseEditor.class);
    handle.addAssignableType(UniversePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public UniverseEditor createInstance(final ContextManager contextManager) {
    final UniverseEditor instance = new UniverseEditor();
    setIncompleteInstance(instance);
    final Div UniverseEditor_universeEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseEditor_universeEditor);
    UniverseEditor_Div_universeEditor(instance, UniverseEditor_universeEditor);
    final TextBox UniverseEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseEditor_name);
    UniverseEditor_TextBox_name(instance, UniverseEditor_name);
    final TextBox UniverseEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseEditor_effectiveDt);
    UniverseEditor_TextBox_effectiveDt(instance, UniverseEditor_effectiveDt);
    final TransitionTo UniverseEditor_listUniversesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListUniversePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, UniverseEditor_listUniversesPage);
    UniverseEditor_TransitionTo_listUniversesPage(instance, UniverseEditor_listUniversesPage);
    final Event UniverseEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UniverseEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, UniverseEditor_createEntityEvent);
    UniverseEditor_Event_createEntityEvent(instance, UniverseEditor_createEntityEvent);
    final TextBox UniverseEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseEditor_description);
    UniverseEditor_TextBox_description(instance, UniverseEditor_description);
    final TextBox UniverseEditor_businessNo = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseEditor_businessNo);
    UniverseEditor_TextBox_businessNo(instance, UniverseEditor_businessNo);
    final ListBox UniverseEditor_parentUniverse = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseEditor_parentUniverse);
    UniverseEditor_ListBox_parentUniverse(instance, UniverseEditor_parentUniverse);
    final TextBox UniverseEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseEditor_entityCode);
    UniverseEditor_TextBox_entityCode(instance, UniverseEditor_entityCode);
    final Event UniverseEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UniverseEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, UniverseEditor_editEntityEvent);
    UniverseEditor_Event_editEntityEvent(instance, UniverseEditor_editEntityEvent);
    final DataBinder UniversePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Universe.class }, new Annotation[] { });
    registerDependentScopedReference(instance, UniversePresenter_binder);
    UniversePresenter_DataBinder_binder(instance, UniversePresenter_binder);
    final TextBox UniverseEditor_universeTyCd = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseEditor_universeTyCd);
    UniverseEditor_TextBox_universeTyCd(instance, UniverseEditor_universeTyCd);
    c_c_h_c_l_u_UniverseEditorTemplateResource templateForUniverseEditor = GWT.create(c_c_h_c_l_u_UniverseEditorTemplateResource.class);
    Element parentElementForTemplateOfUniverseEditor = TemplateUtil.getRootTemplateParentElement(templateForUniverseEditor.getContents().getText(), "com/cloderia/helion/client/local/universe/edit-universe-page.html", "universeEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/universe/edit-universe-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseEditor_Div_universeEditor(instance)));
      }
    }, dataFieldElements, "universeEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_ListBox_parentUniverse(instance).asWidget();
      }
    }, dataFieldElements, "parentUniverse");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_TextBox_businessNo(instance).asWidget();
      }
    }, dataFieldElements, "businessNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_TextBox_universeTyCd(instance).asWidget();
      }
    }, dataFieldElements, "universeTyCd");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseEditor_Button_editUniverseBtn(instance).asWidget();
      }
    }, dataFieldElements, "editUniverseBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseEditor", "com/cloderia/helion/client/local/universe/edit-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(UniverseEditor_AnchorElement_listUniversesPageLink(instance));
      }
    }, dataFieldElements, "listUniversesPageLink");
    templateFieldsMap.put("universeEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseEditor_Div_universeEditor(instance))));
    templateFieldsMap.put("parentUniverse", UniverseEditor_ListBox_parentUniverse(instance).asWidget());
    templateFieldsMap.put("entityCode", UniverseEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("businessNo", UniverseEditor_TextBox_businessNo(instance).asWidget());
    templateFieldsMap.put("name", UniverseEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", UniverseEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", UniverseEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("universeTyCd", UniverseEditor_TextBox_universeTyCd(instance).asWidget());
    templateFieldsMap.put("editUniverseBtn", UniverseEditor_Button_editUniverseBtn(instance).asWidget());
    templateFieldsMap.put("listUniversesPageLink", ElementWrapperWidget.getWidget(UniverseEditor_AnchorElement_listUniversesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editUniverseBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editUniverse(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listUniversesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = UniversePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.universe.UniverseEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(UniverseEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(UniverseEditor_TextBox_businessNo(instance), "businessNo", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(UniverseEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(UniverseEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(UniverseEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    binder.bind(UniverseEditor_TextBox_universeTyCd(instance), "universeTyCd", Convert.getConverter(String.class, String.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((UniverseEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final UniverseEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(UniverseEditor_AnchorElement_listUniversesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final UniverseEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Button UniverseEditor_Button_editUniverseBtn(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::editUniverseBtn;
  }-*/;

  native static void UniverseEditor_Button_editUniverseBtn(UniverseEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::editUniverseBtn = value;
  }-*/;

  native static TextBox UniverseEditor_TextBox_name(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::name;
  }-*/;

  native static void UniverseEditor_TextBox_name(UniverseEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::name = value;
  }-*/;

  native static TextBox UniverseEditor_TextBox_effectiveDt(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::effectiveDt;
  }-*/;

  native static void UniverseEditor_TextBox_effectiveDt(UniverseEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::effectiveDt = value;
  }-*/;

  native static AnchorElement UniverseEditor_AnchorElement_listUniversesPageLink(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::listUniversesPageLink;
  }-*/;

  native static void UniverseEditor_AnchorElement_listUniversesPageLink(UniverseEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::listUniversesPageLink = value;
  }-*/;

  native static TextBox UniverseEditor_TextBox_description(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::description;
  }-*/;

  native static void UniverseEditor_TextBox_description(UniverseEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::description = value;
  }-*/;

  native static DataBinder UniversePresenter_DataBinder_binder(UniversePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder;
  }-*/;

  native static void UniversePresenter_DataBinder_binder(UniversePresenter instance, DataBinder<Universe> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder = value;
  }-*/;

  native static TextBox UniverseEditor_TextBox_entityCode(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::entityCode;
  }-*/;

  native static void UniverseEditor_TextBox_entityCode(UniverseEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::entityCode = value;
  }-*/;

  native static Event UniverseEditor_Event_editEntityEvent(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::editEntityEvent;
  }-*/;

  native static void UniverseEditor_Event_editEntityEvent(UniverseEditor instance, Event<UniverseEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::editEntityEvent = value;
  }-*/;

  native static TransitionTo UniverseEditor_TransitionTo_listUniversesPage(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::listUniversesPage;
  }-*/;

  native static void UniverseEditor_TransitionTo_listUniversesPage(UniverseEditor instance, TransitionTo<ListUniversePage> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::listUniversesPage = value;
  }-*/;

  native static TextBox UniverseEditor_TextBox_businessNo(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::businessNo;
  }-*/;

  native static void UniverseEditor_TextBox_businessNo(UniverseEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::businessNo = value;
  }-*/;

  native static Event UniverseEditor_Event_createEntityEvent(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::createEntityEvent;
  }-*/;

  native static void UniverseEditor_Event_createEntityEvent(UniverseEditor instance, Event<UniverseEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::createEntityEvent = value;
  }-*/;

  native static TextBox UniverseEditor_TextBox_universeTyCd(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::universeTyCd;
  }-*/;

  native static void UniverseEditor_TextBox_universeTyCd(UniverseEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::universeTyCd = value;
  }-*/;

  native static ListBox UniverseEditor_ListBox_parentUniverse(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::parentUniverse;
  }-*/;

  native static void UniverseEditor_ListBox_parentUniverse(UniverseEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::parentUniverse = value;
  }-*/;

  native static Div UniverseEditor_Div_universeEditor(UniverseEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseEditor::universeEditor;
  }-*/;

  native static void UniverseEditor_Div_universeEditor(UniverseEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseEditor::universeEditor = value;
  }-*/;
}
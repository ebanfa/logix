package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partytype.ListPartytypePage;
import com.cloderia.helion.client.local.partytype.PartytypeEditor;
import com.cloderia.helion.client.local.partytype.PartytypePresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Partytype;
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

public class Type_factory__c_c_h_c_l_p_PartytypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartytypeEditor.class, "Type_factory__c_c_h_c_l_p_PartytypeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartytypeEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partytype/edit-partytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartytypeEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartytypeEditor.class);
    handle.addAssignableType(PartytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartytypeEditor createInstance(final ContextManager contextManager) {
    final PartytypeEditor instance = new PartytypeEditor();
    setIncompleteInstance(instance);
    final TextBox PartytypeEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeEditor_name);
    PartytypeEditor_TextBox_name(instance, PartytypeEditor_name);
    final ListBox PartytypeEditor_parentCategory = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeEditor_parentCategory);
    PartytypeEditor_ListBox_parentCategory(instance, PartytypeEditor_parentCategory);
    final ListBox PartytypeEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeEditor_universe);
    PartytypeEditor_ListBox_universe(instance, PartytypeEditor_universe);
    final TextBox PartytypeEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeEditor_effectiveDt);
    PartytypeEditor_TextBox_effectiveDt(instance, PartytypeEditor_effectiveDt);
    final Div PartytypeEditor_partytypeEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeEditor_partytypeEditor);
    PartytypeEditor_Div_partytypeEditor(instance, PartytypeEditor_partytypeEditor);
    final TextBox PartytypeEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeEditor_description);
    PartytypeEditor_TextBox_description(instance, PartytypeEditor_description);
    final Event PartytypeEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartytypeEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartytypeEditor_createEntityEvent);
    PartytypeEditor_Event_createEntityEvent(instance, PartytypeEditor_createEntityEvent);
    final TransitionTo PartytypeEditor_listPartytypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartytypeEditor_listPartytypesPage);
    PartytypeEditor_TransitionTo_listPartytypesPage(instance, PartytypeEditor_listPartytypesPage);
    final ListBox PartytypeEditor_parentType = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeEditor_parentType);
    PartytypeEditor_ListBox_parentType(instance, PartytypeEditor_parentType);
    final TextBox PartytypeEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeEditor_entityCode);
    PartytypeEditor_TextBox_entityCode(instance, PartytypeEditor_entityCode);
    final Event PartytypeEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartytypeEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartytypeEditor_editEntityEvent);
    PartytypeEditor_Event_editEntityEvent(instance, PartytypeEditor_editEntityEvent);
    final DataBinder PartytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartytypePresenter_binder);
    PartytypePresenter_DataBinder_binder(instance, PartytypePresenter_binder);
    c_c_h_c_l_p_PartytypeEditorTemplateResource templateForPartytypeEditor = GWT.create(c_c_h_c_l_p_PartytypeEditorTemplateResource.class);
    Element parentElementForTemplateOfPartytypeEditor = TemplateUtil.getRootTemplateParentElement(templateForPartytypeEditor.getContents().getText(), "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", "partytypeEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partytype/edit-partytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeEditor_Div_partytypeEditor(instance)));
      }
    }, dataFieldElements, "partytypeEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_ListBox_parentType(instance).asWidget();
      }
    }, dataFieldElements, "parentType");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_ListBox_parentCategory(instance).asWidget();
      }
    }, dataFieldElements, "parentCategory");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeEditor_Button_editPartytypeBtn(instance).asWidget();
      }
    }, dataFieldElements, "editPartytypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com/cloderia/helion/client/local/partytype/edit-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartytypeEditor_AnchorElement_listPartytypesPageLink(instance));
      }
    }, dataFieldElements, "listPartytypesPageLink");
    templateFieldsMap.put("partytypeEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeEditor_Div_partytypeEditor(instance))));
    templateFieldsMap.put("universe", PartytypeEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("parentType", PartytypeEditor_ListBox_parentType(instance).asWidget());
    templateFieldsMap.put("parentCategory", PartytypeEditor_ListBox_parentCategory(instance).asWidget());
    templateFieldsMap.put("entityCode", PartytypeEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", PartytypeEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", PartytypeEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", PartytypeEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editPartytypeBtn", PartytypeEditor_Button_editPartytypeBtn(instance).asWidget());
    templateFieldsMap.put("listPartytypesPageLink", ElementWrapperWidget.getWidget(PartytypeEditor_AnchorElement_listPartytypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editPartytypeBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editPartytype(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartytypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartytypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partytype.PartytypeEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartytypeEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartytypeEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartytypeEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartytypeEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartytypeEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartytypeEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartytypeEditor_AnchorElement_listPartytypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartytypeEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox PartytypeEditor_ListBox_universe(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::universe;
  }-*/;

  native static void PartytypeEditor_ListBox_universe(PartytypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::universe = value;
  }-*/;

  native static DataBinder PartytypePresenter_DataBinder_binder(PartytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder;
  }-*/;

  native static void PartytypePresenter_DataBinder_binder(PartytypePresenter instance, DataBinder<Partytype> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder = value;
  }-*/;

  native static AnchorElement PartytypeEditor_AnchorElement_listPartytypesPageLink(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::listPartytypesPageLink;
  }-*/;

  native static void PartytypeEditor_AnchorElement_listPartytypesPageLink(PartytypeEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::listPartytypesPageLink = value;
  }-*/;

  native static Button PartytypeEditor_Button_editPartytypeBtn(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::editPartytypeBtn;
  }-*/;

  native static void PartytypeEditor_Button_editPartytypeBtn(PartytypeEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::editPartytypeBtn = value;
  }-*/;

  native static TextBox PartytypeEditor_TextBox_name(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::name;
  }-*/;

  native static void PartytypeEditor_TextBox_name(PartytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::name = value;
  }-*/;

  native static Event PartytypeEditor_Event_createEntityEvent(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::createEntityEvent;
  }-*/;

  native static void PartytypeEditor_Event_createEntityEvent(PartytypeEditor instance, Event<PartytypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::createEntityEvent = value;
  }-*/;

  native static Div PartytypeEditor_Div_partytypeEditor(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::partytypeEditor;
  }-*/;

  native static void PartytypeEditor_Div_partytypeEditor(PartytypeEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::partytypeEditor = value;
  }-*/;

  native static TextBox PartytypeEditor_TextBox_effectiveDt(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::effectiveDt;
  }-*/;

  native static void PartytypeEditor_TextBox_effectiveDt(PartytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::effectiveDt = value;
  }-*/;

  native static ListBox PartytypeEditor_ListBox_parentType(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::parentType;
  }-*/;

  native static void PartytypeEditor_ListBox_parentType(PartytypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::parentType = value;
  }-*/;

  native static TextBox PartytypeEditor_TextBox_entityCode(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::entityCode;
  }-*/;

  native static void PartytypeEditor_TextBox_entityCode(PartytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::entityCode = value;
  }-*/;

  native static ListBox PartytypeEditor_ListBox_parentCategory(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::parentCategory;
  }-*/;

  native static void PartytypeEditor_ListBox_parentCategory(PartytypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::parentCategory = value;
  }-*/;

  native static TextBox PartytypeEditor_TextBox_description(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::description;
  }-*/;

  native static void PartytypeEditor_TextBox_description(PartytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::description = value;
  }-*/;

  native static Event PartytypeEditor_Event_editEntityEvent(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::editEntityEvent;
  }-*/;

  native static void PartytypeEditor_Event_editEntityEvent(PartytypeEditor instance, Event<PartytypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::editEntityEvent = value;
  }-*/;

  native static TransitionTo PartytypeEditor_TransitionTo_listPartytypesPage(PartytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::listPartytypesPage;
  }-*/;

  native static void PartytypeEditor_TransitionTo_listPartytypesPage(PartytypeEditor instance, TransitionTo<ListPartytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeEditor::listPartytypesPage = value;
  }-*/;
}
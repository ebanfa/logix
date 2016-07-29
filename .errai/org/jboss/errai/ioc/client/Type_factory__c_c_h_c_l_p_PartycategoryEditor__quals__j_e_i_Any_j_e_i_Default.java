package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partycategory.ListPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.PartycategoryEditor;
import com.cloderia.helion.client.local.partycategory.PartycategoryPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Partycategory;
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

public class Type_factory__c_c_h_c_l_p_PartycategoryEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartycategoryEditor.class, "Type_factory__c_c_h_c_l_p_PartycategoryEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartycategoryEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartycategoryEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartycategoryEditor.class);
    handle.addAssignableType(PartycategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartycategoryEditor createInstance(final ContextManager contextManager) {
    final PartycategoryEditor instance = new PartycategoryEditor();
    setIncompleteInstance(instance);
    final DataBinder PartycategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partycategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartycategoryPresenter_binder);
    PartycategoryPresenter_DataBinder_binder(instance, PartycategoryPresenter_binder);
    final TextBox PartycategoryEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartycategoryEditor_entityCode);
    PartycategoryEditor_TextBox_entityCode(instance, PartycategoryEditor_entityCode);
    final ListBox PartycategoryEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartycategoryEditor_universe);
    PartycategoryEditor_ListBox_universe(instance, PartycategoryEditor_universe);
    final TextBox PartycategoryEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartycategoryEditor_name);
    PartycategoryEditor_TextBox_name(instance, PartycategoryEditor_name);
    final Event PartycategoryEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartycategoryEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartycategoryEditor_editEntityEvent);
    PartycategoryEditor_Event_editEntityEvent(instance, PartycategoryEditor_editEntityEvent);
    final Event PartycategoryEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartycategoryEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartycategoryEditor_createEntityEvent);
    PartycategoryEditor_Event_createEntityEvent(instance, PartycategoryEditor_createEntityEvent);
    final TextBox PartycategoryEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartycategoryEditor_description);
    PartycategoryEditor_TextBox_description(instance, PartycategoryEditor_description);
    final TransitionTo PartycategoryEditor_listPartycategorysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartycategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartycategoryEditor_listPartycategorysPage);
    PartycategoryEditor_TransitionTo_listPartycategorysPage(instance, PartycategoryEditor_listPartycategorysPage);
    final TextBox PartycategoryEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartycategoryEditor_effectiveDt);
    PartycategoryEditor_TextBox_effectiveDt(instance, PartycategoryEditor_effectiveDt);
    final Div PartycategoryEditor_partycategoryEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryEditor_partycategoryEditor);
    PartycategoryEditor_Div_partycategoryEditor(instance, PartycategoryEditor_partycategoryEditor);
    c_c_h_c_l_p_PartycategoryEditorTemplateResource templateForPartycategoryEditor = GWT.create(c_c_h_c_l_p_PartycategoryEditorTemplateResource.class);
    Element parentElementForTemplateOfPartycategoryEditor = TemplateUtil.getRootTemplateParentElement(templateForPartycategoryEditor.getContents().getText(), "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", "partycategoryEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryEditor_Div_partycategoryEditor(instance)));
      }
    }, dataFieldElements, "partycategoryEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartycategoryEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartycategoryEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartycategoryEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartycategoryEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartycategoryEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartycategoryEditor_Button_editPartycategoryBtn(instance).asWidget();
      }
    }, dataFieldElements, "editPartycategoryBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com/cloderia/helion/client/local/partycategory/edit-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartycategoryEditor_AnchorElement_listPartycategorysPageLink(instance));
      }
    }, dataFieldElements, "listPartycategorysPageLink");
    templateFieldsMap.put("partycategoryEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryEditor_Div_partycategoryEditor(instance))));
    templateFieldsMap.put("universe", PartycategoryEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", PartycategoryEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", PartycategoryEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", PartycategoryEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", PartycategoryEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editPartycategoryBtn", PartycategoryEditor_Button_editPartycategoryBtn(instance).asWidget());
    templateFieldsMap.put("listPartycategorysPageLink", ElementWrapperWidget.getWidget(PartycategoryEditor_AnchorElement_listPartycategorysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editPartycategoryBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editPartycategory(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartycategorysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartycategoryPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partycategory.PartycategoryEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartycategoryEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartycategoryEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartycategoryEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartycategoryEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartycategoryEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartycategoryEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartycategoryEditor_AnchorElement_listPartycategorysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartycategoryEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo PartycategoryEditor_TransitionTo_listPartycategorysPage(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::listPartycategorysPage;
  }-*/;

  native static void PartycategoryEditor_TransitionTo_listPartycategorysPage(PartycategoryEditor instance, TransitionTo<ListPartycategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::listPartycategorysPage = value;
  }-*/;

  native static TextBox PartycategoryEditor_TextBox_entityCode(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::entityCode;
  }-*/;

  native static void PartycategoryEditor_TextBox_entityCode(PartycategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::entityCode = value;
  }-*/;

  native static ListBox PartycategoryEditor_ListBox_universe(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::universe;
  }-*/;

  native static void PartycategoryEditor_ListBox_universe(PartycategoryEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::universe = value;
  }-*/;

  native static Event PartycategoryEditor_Event_createEntityEvent(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::createEntityEvent;
  }-*/;

  native static void PartycategoryEditor_Event_createEntityEvent(PartycategoryEditor instance, Event<PartycategoryEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::createEntityEvent = value;
  }-*/;

  native static AnchorElement PartycategoryEditor_AnchorElement_listPartycategorysPageLink(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::listPartycategorysPageLink;
  }-*/;

  native static void PartycategoryEditor_AnchorElement_listPartycategorysPageLink(PartycategoryEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::listPartycategorysPageLink = value;
  }-*/;

  native static TextBox PartycategoryEditor_TextBox_name(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::name;
  }-*/;

  native static void PartycategoryEditor_TextBox_name(PartycategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::name = value;
  }-*/;

  native static TextBox PartycategoryEditor_TextBox_description(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::description;
  }-*/;

  native static void PartycategoryEditor_TextBox_description(PartycategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::description = value;
  }-*/;

  native static DataBinder PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder;
  }-*/;

  native static void PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance, DataBinder<Partycategory> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder = value;
  }-*/;

  native static Button PartycategoryEditor_Button_editPartycategoryBtn(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::editPartycategoryBtn;
  }-*/;

  native static void PartycategoryEditor_Button_editPartycategoryBtn(PartycategoryEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::editPartycategoryBtn = value;
  }-*/;

  native static Div PartycategoryEditor_Div_partycategoryEditor(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::partycategoryEditor;
  }-*/;

  native static void PartycategoryEditor_Div_partycategoryEditor(PartycategoryEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::partycategoryEditor = value;
  }-*/;

  native static Event PartycategoryEditor_Event_editEntityEvent(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::editEntityEvent;
  }-*/;

  native static void PartycategoryEditor_Event_editEntityEvent(PartycategoryEditor instance, Event<PartycategoryEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::editEntityEvent = value;
  }-*/;

  native static TextBox PartycategoryEditor_TextBox_effectiveDt(PartycategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::effectiveDt;
  }-*/;

  native static void PartycategoryEditor_TextBox_effectiveDt(PartycategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryEditor::effectiveDt = value;
  }-*/;
}
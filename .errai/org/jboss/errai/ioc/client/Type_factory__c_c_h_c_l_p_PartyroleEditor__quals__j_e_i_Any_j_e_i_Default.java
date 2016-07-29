package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyrole.ListPartyrolePage;
import com.cloderia.helion.client.local.partyrole.PartyroleEditor;
import com.cloderia.helion.client.local.partyrole.PartyrolePresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Partyrole;
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

public class Type_factory__c_c_h_c_l_p_PartyroleEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroleEditor.class, "Type_factory__c_c_h_c_l_p_PartyroleEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroleEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroleEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroleEditor.class);
    handle.addAssignableType(PartyrolePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyroleEditor createInstance(final ContextManager contextManager) {
    final PartyroleEditor instance = new PartyroleEditor();
    setIncompleteInstance(instance);
    final Event PartyroleEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroleEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroleEditor_createEntityEvent);
    PartyroleEditor_Event_createEntityEvent(instance, PartyroleEditor_createEntityEvent);
    final Event PartyroleEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroleEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroleEditor_editEntityEvent);
    PartyroleEditor_Event_editEntityEvent(instance, PartyroleEditor_editEntityEvent);
    final ListBox PartyroleEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_universe);
    PartyroleEditor_ListBox_universe(instance, PartyroleEditor_universe);
    final Div PartyroleEditor_partyroleEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleEditor_partyroleEditor);
    PartyroleEditor_Div_partyroleEditor(instance, PartyroleEditor_partyroleEditor);
    final DataBinder PartyrolePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyrole.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyrolePresenter_binder);
    PartyrolePresenter_DataBinder_binder(instance, PartyrolePresenter_binder);
    final TextBox PartyroleEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_name);
    PartyroleEditor_TextBox_name(instance, PartyroleEditor_name);
    final ListBox PartyroleEditor_party = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_party);
    PartyroleEditor_ListBox_party(instance, PartyroleEditor_party);
    final TransitionTo PartyroleEditor_listPartyrolesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyrolePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroleEditor_listPartyrolesPage);
    PartyroleEditor_TransitionTo_listPartyrolesPage(instance, PartyroleEditor_listPartyrolesPage);
    final TextBox PartyroleEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_entityCode);
    PartyroleEditor_TextBox_entityCode(instance, PartyroleEditor_entityCode);
    final TextBox PartyroleEditor_toDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_toDt);
    PartyroleEditor_TextBox_toDt(instance, PartyroleEditor_toDt);
    final TextBox PartyroleEditor_fromDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_fromDt);
    PartyroleEditor_TextBox_fromDt(instance, PartyroleEditor_fromDt);
    final ListBox PartyroleEditor_partyRoleTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_partyRoleTy);
    PartyroleEditor_ListBox_partyRoleTy(instance, PartyroleEditor_partyRoleTy);
    final TextBox PartyroleEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleEditor_description);
    PartyroleEditor_TextBox_description(instance, PartyroleEditor_description);
    c_c_h_c_l_p_PartyroleEditorTemplateResource templateForPartyroleEditor = GWT.create(c_c_h_c_l_p_PartyroleEditorTemplateResource.class);
    Element parentElementForTemplateOfPartyroleEditor = TemplateUtil.getRootTemplateParentElement(templateForPartyroleEditor.getContents().getText(), "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", "partyroleEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleEditor_Div_partyroleEditor(instance)));
      }
    }, dataFieldElements, "partyroleEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_ListBox_party(instance).asWidget();
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_ListBox_partyRoleTy(instance).asWidget();
      }
    }, dataFieldElements, "partyRoleTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_TextBox_fromDt(instance).asWidget();
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_TextBox_toDt(instance).asWidget();
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleEditor_Button_editPartyroleBtn(instance).asWidget();
      }
    }, dataFieldElements, "editPartyroleBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com/cloderia/helion/client/local/partyrole/edit-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroleEditor_AnchorElement_listPartyrolesPageLink(instance));
      }
    }, dataFieldElements, "listPartyrolesPageLink");
    templateFieldsMap.put("partyroleEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleEditor_Div_partyroleEditor(instance))));
    templateFieldsMap.put("party", PartyroleEditor_ListBox_party(instance).asWidget());
    templateFieldsMap.put("partyRoleTy", PartyroleEditor_ListBox_partyRoleTy(instance).asWidget());
    templateFieldsMap.put("universe", PartyroleEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", PartyroleEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", PartyroleEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", PartyroleEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("fromDt", PartyroleEditor_TextBox_fromDt(instance).asWidget());
    templateFieldsMap.put("toDt", PartyroleEditor_TextBox_toDt(instance).asWidget());
    templateFieldsMap.put("editPartyroleBtn", PartyroleEditor_Button_editPartyroleBtn(instance).asWidget());
    templateFieldsMap.put("listPartyrolesPageLink", ElementWrapperWidget.getWidget(PartyroleEditor_AnchorElement_listPartyrolesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editPartyroleBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editPartyrole(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartyrolesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartyrolePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyrole.PartyroleEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartyroleEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyroleEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyroleEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyroleEditor_TextBox_fromDt(instance), "fromDt", new DateConverter(), null, false);
    binder.bind(PartyroleEditor_TextBox_toDt(instance), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroleEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroleEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroleEditor_AnchorElement_listPartyrolesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroleEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo PartyroleEditor_TransitionTo_listPartyrolesPage(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::listPartyrolesPage;
  }-*/;

  native static void PartyroleEditor_TransitionTo_listPartyrolesPage(PartyroleEditor instance, TransitionTo<ListPartyrolePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::listPartyrolesPage = value;
  }-*/;

  native static TextBox PartyroleEditor_TextBox_entityCode(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::entityCode;
  }-*/;

  native static void PartyroleEditor_TextBox_entityCode(PartyroleEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::entityCode = value;
  }-*/;

  native static Div PartyroleEditor_Div_partyroleEditor(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::partyroleEditor;
  }-*/;

  native static void PartyroleEditor_Div_partyroleEditor(PartyroleEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::partyroleEditor = value;
  }-*/;

  native static DataBinder PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder;
  }-*/;

  native static void PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance, DataBinder<Partyrole> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder = value;
  }-*/;

  native static ListBox PartyroleEditor_ListBox_universe(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::universe;
  }-*/;

  native static void PartyroleEditor_ListBox_universe(PartyroleEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::universe = value;
  }-*/;

  native static TextBox PartyroleEditor_TextBox_description(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::description;
  }-*/;

  native static void PartyroleEditor_TextBox_description(PartyroleEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::description = value;
  }-*/;

  native static TextBox PartyroleEditor_TextBox_fromDt(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::fromDt;
  }-*/;

  native static void PartyroleEditor_TextBox_fromDt(PartyroleEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::fromDt = value;
  }-*/;

  native static TextBox PartyroleEditor_TextBox_name(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::name;
  }-*/;

  native static void PartyroleEditor_TextBox_name(PartyroleEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::name = value;
  }-*/;

  native static Event PartyroleEditor_Event_editEntityEvent(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::editEntityEvent;
  }-*/;

  native static void PartyroleEditor_Event_editEntityEvent(PartyroleEditor instance, Event<PartyroleEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::editEntityEvent = value;
  }-*/;

  native static TextBox PartyroleEditor_TextBox_toDt(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::toDt;
  }-*/;

  native static void PartyroleEditor_TextBox_toDt(PartyroleEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::toDt = value;
  }-*/;

  native static Button PartyroleEditor_Button_editPartyroleBtn(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::editPartyroleBtn;
  }-*/;

  native static void PartyroleEditor_Button_editPartyroleBtn(PartyroleEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::editPartyroleBtn = value;
  }-*/;

  native static ListBox PartyroleEditor_ListBox_party(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::party;
  }-*/;

  native static void PartyroleEditor_ListBox_party(PartyroleEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::party = value;
  }-*/;

  native static ListBox PartyroleEditor_ListBox_partyRoleTy(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::partyRoleTy;
  }-*/;

  native static void PartyroleEditor_ListBox_partyRoleTy(PartyroleEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::partyRoleTy = value;
  }-*/;

  native static AnchorElement PartyroleEditor_AnchorElement_listPartyrolesPageLink(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::listPartyrolesPageLink;
  }-*/;

  native static void PartyroleEditor_AnchorElement_listPartyrolesPageLink(PartyroleEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::listPartyrolesPageLink = value;
  }-*/;

  native static Event PartyroleEditor_Event_createEntityEvent(PartyroleEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::createEntityEvent;
  }-*/;

  native static void PartyroleEditor_Event_createEntityEvent(PartyroleEditor instance, Event<PartyroleEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleEditor::createEntityEvent = value;
  }-*/;
}
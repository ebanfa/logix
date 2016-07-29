package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor;
import com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Partyroletype;
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

public class Type_factory__c_c_h_c_l_p_PartyroletypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroletypeEditor.class, "Type_factory__c_c_h_c_l_p_PartyroletypeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroletypeEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroletypeEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroletypeEditor.class);
    handle.addAssignableType(PartyroletypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyroletypeEditor createInstance(final ContextManager contextManager) {
    final PartyroletypeEditor instance = new PartyroletypeEditor();
    setIncompleteInstance(instance);
    final TextBox PartyroletypeEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroletypeEditor_description);
    PartyroletypeEditor_TextBox_description(instance, PartyroletypeEditor_description);
    final ListBox PartyroletypeEditor_parentRoleTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroletypeEditor_parentRoleTy);
    PartyroletypeEditor_ListBox_parentRoleTy(instance, PartyroletypeEditor_parentRoleTy);
    final TextBox PartyroletypeEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroletypeEditor_name);
    PartyroletypeEditor_TextBox_name(instance, PartyroletypeEditor_name);
    final TextBox PartyroletypeEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroletypeEditor_entityCode);
    PartyroletypeEditor_TextBox_entityCode(instance, PartyroletypeEditor_entityCode);
    final Event PartyroletypeEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroletypeEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroletypeEditor_createEntityEvent);
    PartyroletypeEditor_Event_createEntityEvent(instance, PartyroletypeEditor_createEntityEvent);
    final Div PartyroletypeEditor_partyroletypeEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeEditor_partyroletypeEditor);
    PartyroletypeEditor_Div_partyroletypeEditor(instance, PartyroletypeEditor_partyroletypeEditor);
    final DataBinder PartyroletypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyroletype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroletypePresenter_binder);
    PartyroletypePresenter_DataBinder_binder(instance, PartyroletypePresenter_binder);
    final TransitionTo PartyroletypeEditor_listPartyroletypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyroletypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroletypeEditor_listPartyroletypesPage);
    PartyroletypeEditor_TransitionTo_listPartyroletypesPage(instance, PartyroletypeEditor_listPartyroletypesPage);
    final ListBox PartyroletypeEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroletypeEditor_universe);
    PartyroletypeEditor_ListBox_universe(instance, PartyroletypeEditor_universe);
    final TextBox PartyroletypeEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroletypeEditor_effectiveDt);
    PartyroletypeEditor_TextBox_effectiveDt(instance, PartyroletypeEditor_effectiveDt);
    final Event PartyroletypeEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroletypeEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroletypeEditor_editEntityEvent);
    PartyroletypeEditor_Event_editEntityEvent(instance, PartyroletypeEditor_editEntityEvent);
    c_c_h_c_l_p_PartyroletypeEditorTemplateResource templateForPartyroletypeEditor = GWT.create(c_c_h_c_l_p_PartyroletypeEditorTemplateResource.class);
    Element parentElementForTemplateOfPartyroletypeEditor = TemplateUtil.getRootTemplateParentElement(templateForPartyroletypeEditor.getContents().getText(), "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", "partyroletypeEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeEditor_Div_partyroletypeEditor(instance)));
      }
    }, dataFieldElements, "partyroletypeEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeEditor_ListBox_parentRoleTy(instance).asWidget();
      }
    }, dataFieldElements, "parentRoleTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeEditor_Button_editPartyroletypeBtn(instance).asWidget();
      }
    }, dataFieldElements, "editPartyroletypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com/cloderia/helion/client/local/partyroletype/edit-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroletypeEditor_AnchorElement_listPartyroletypesPageLink(instance));
      }
    }, dataFieldElements, "listPartyroletypesPageLink");
    templateFieldsMap.put("partyroletypeEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeEditor_Div_partyroletypeEditor(instance))));
    templateFieldsMap.put("parentRoleTy", PartyroletypeEditor_ListBox_parentRoleTy(instance).asWidget());
    templateFieldsMap.put("universe", PartyroletypeEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", PartyroletypeEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", PartyroletypeEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", PartyroletypeEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", PartyroletypeEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editPartyroletypeBtn", PartyroletypeEditor_Button_editPartyroletypeBtn(instance).asWidget());
    templateFieldsMap.put("listPartyroletypesPageLink", ElementWrapperWidget.getWidget(PartyroletypeEditor_AnchorElement_listPartyroletypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editPartyroletypeBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editPartyroletype(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartyroletypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartyroletypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartyroletypeEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyroletypeEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyroletypeEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyroletypeEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroletypeEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroletypeEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroletypeEditor_AnchorElement_listPartyroletypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroletypeEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Div PartyroletypeEditor_Div_partyroletypeEditor(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::partyroletypeEditor;
  }-*/;

  native static void PartyroletypeEditor_Div_partyroletypeEditor(PartyroletypeEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::partyroletypeEditor = value;
  }-*/;

  native static TextBox PartyroletypeEditor_TextBox_effectiveDt(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::effectiveDt;
  }-*/;

  native static void PartyroletypeEditor_TextBox_effectiveDt(PartyroletypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::effectiveDt = value;
  }-*/;

  native static TextBox PartyroletypeEditor_TextBox_name(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::name;
  }-*/;

  native static void PartyroletypeEditor_TextBox_name(PartyroletypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::name = value;
  }-*/;

  native static DataBinder PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder;
  }-*/;

  native static void PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance, DataBinder<Partyroletype> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder = value;
  }-*/;

  native static ListBox PartyroletypeEditor_ListBox_parentRoleTy(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::parentRoleTy;
  }-*/;

  native static void PartyroletypeEditor_ListBox_parentRoleTy(PartyroletypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::parentRoleTy = value;
  }-*/;

  native static TextBox PartyroletypeEditor_TextBox_entityCode(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::entityCode;
  }-*/;

  native static void PartyroletypeEditor_TextBox_entityCode(PartyroletypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::entityCode = value;
  }-*/;

  native static AnchorElement PartyroletypeEditor_AnchorElement_listPartyroletypesPageLink(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::listPartyroletypesPageLink;
  }-*/;

  native static void PartyroletypeEditor_AnchorElement_listPartyroletypesPageLink(PartyroletypeEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::listPartyroletypesPageLink = value;
  }-*/;

  native static Event PartyroletypeEditor_Event_createEntityEvent(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::createEntityEvent;
  }-*/;

  native static void PartyroletypeEditor_Event_createEntityEvent(PartyroletypeEditor instance, Event<PartyroletypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::createEntityEvent = value;
  }-*/;

  native static TextBox PartyroletypeEditor_TextBox_description(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::description;
  }-*/;

  native static void PartyroletypeEditor_TextBox_description(PartyroletypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::description = value;
  }-*/;

  native static Event PartyroletypeEditor_Event_editEntityEvent(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::editEntityEvent;
  }-*/;

  native static void PartyroletypeEditor_Event_editEntityEvent(PartyroletypeEditor instance, Event<PartyroletypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::editEntityEvent = value;
  }-*/;

  native static ListBox PartyroletypeEditor_ListBox_universe(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::universe;
  }-*/;

  native static void PartyroletypeEditor_ListBox_universe(PartyroletypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::universe = value;
  }-*/;

  native static Button PartyroletypeEditor_Button_editPartyroletypeBtn(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::editPartyroletypeBtn;
  }-*/;

  native static void PartyroletypeEditor_Button_editPartyroletypeBtn(PartyroletypeEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::editPartyroletypeBtn = value;
  }-*/;

  native static TransitionTo PartyroletypeEditor_TransitionTo_listPartyroletypesPage(PartyroletypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::listPartyroletypesPage;
  }-*/;

  native static void PartyroletypeEditor_TransitionTo_listPartyroletypesPage(PartyroletypeEditor instance, TransitionTo<ListPartyroletypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor::listPartyroletypesPage = value;
  }-*/;
}
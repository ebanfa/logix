package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.party.ListPartyPage;
import com.cloderia.helion.client.local.party.PartyEditor;
import com.cloderia.helion.client.local.party.PartyPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Party;
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

public class Type_factory__c_c_h_c_l_p_PartyEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyEditor.class, "Type_factory__c_c_h_c_l_p_PartyEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/party/edit-party-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyEditor.class);
    handle.addAssignableType(PartyPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyEditor createInstance(final ContextManager contextManager) {
    final PartyEditor instance = new PartyEditor();
    setIncompleteInstance(instance);
    final TextBox PartyEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyEditor_name);
    PartyEditor_TextBox_name(instance, PartyEditor_name);
    final Event PartyEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyEditor_editEntityEvent);
    PartyEditor_Event_editEntityEvent(instance, PartyEditor_editEntityEvent);
    final ListBox PartyEditor_partyTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyEditor_partyTy);
    PartyEditor_ListBox_partyTy(instance, PartyEditor_partyTy);
    final TextBox PartyEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyEditor_effectiveDt);
    PartyEditor_TextBox_effectiveDt(instance, PartyEditor_effectiveDt);
    final TextBox PartyEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyEditor_entityCode);
    PartyEditor_TextBox_entityCode(instance, PartyEditor_entityCode);
    final TransitionTo PartyEditor_listPartysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyEditor_listPartysPage);
    PartyEditor_TransitionTo_listPartysPage(instance, PartyEditor_listPartysPage);
    final TextBox PartyEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyEditor_description);
    PartyEditor_TextBox_description(instance, PartyEditor_description);
    final ListBox PartyEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyEditor_universe);
    PartyEditor_ListBox_universe(instance, PartyEditor_universe);
    final Event PartyEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyEditor_createEntityEvent);
    PartyEditor_Event_createEntityEvent(instance, PartyEditor_createEntityEvent);
    final DataBinder PartyPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Party.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyPresenter_binder);
    PartyPresenter_DataBinder_binder(instance, PartyPresenter_binder);
    final Div PartyEditor_partyEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyEditor_partyEditor);
    PartyEditor_Div_partyEditor(instance, PartyEditor_partyEditor);
    c_c_h_c_l_p_PartyEditorTemplateResource templateForPartyEditor = GWT.create(c_c_h_c_l_p_PartyEditorTemplateResource.class);
    Element parentElementForTemplateOfPartyEditor = TemplateUtil.getRootTemplateParentElement(templateForPartyEditor.getContents().getText(), "com/cloderia/helion/client/local/party/edit-party-page.html", "partyEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/party/edit-party-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyEditor_Div_partyEditor(instance)));
      }
    }, dataFieldElements, "partyEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyEditor_ListBox_partyTy(instance).asWidget();
      }
    }, dataFieldElements, "partyTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyEditor_Button_editPartyBtn(instance).asWidget();
      }
    }, dataFieldElements, "editPartyBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyEditor", "com/cloderia/helion/client/local/party/edit-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyEditor_AnchorElement_listPartysPageLink(instance));
      }
    }, dataFieldElements, "listPartysPageLink");
    templateFieldsMap.put("partyEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyEditor_Div_partyEditor(instance))));
    templateFieldsMap.put("universe", PartyEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("partyTy", PartyEditor_ListBox_partyTy(instance).asWidget());
    templateFieldsMap.put("entityCode", PartyEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", PartyEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", PartyEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", PartyEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editPartyBtn", PartyEditor_Button_editPartyBtn(instance).asWidget());
    templateFieldsMap.put("listPartysPageLink", ElementWrapperWidget.getWidget(PartyEditor_AnchorElement_listPartysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editPartyBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editParty(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartyPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.party.PartyEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartyEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PartyEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyEditor_AnchorElement_listPartysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox PartyEditor_ListBox_partyTy(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::partyTy;
  }-*/;

  native static void PartyEditor_ListBox_partyTy(PartyEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::partyTy = value;
  }-*/;

  native static TransitionTo PartyEditor_TransitionTo_listPartysPage(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::listPartysPage;
  }-*/;

  native static void PartyEditor_TransitionTo_listPartysPage(PartyEditor instance, TransitionTo<ListPartyPage> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::listPartysPage = value;
  }-*/;

  native static Event PartyEditor_Event_editEntityEvent(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::editEntityEvent;
  }-*/;

  native static void PartyEditor_Event_editEntityEvent(PartyEditor instance, Event<PartyEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::editEntityEvent = value;
  }-*/;

  native static TextBox PartyEditor_TextBox_description(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::description;
  }-*/;

  native static void PartyEditor_TextBox_description(PartyEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::description = value;
  }-*/;

  native static AnchorElement PartyEditor_AnchorElement_listPartysPageLink(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::listPartysPageLink;
  }-*/;

  native static void PartyEditor_AnchorElement_listPartysPageLink(PartyEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::listPartysPageLink = value;
  }-*/;

  native static Event PartyEditor_Event_createEntityEvent(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::createEntityEvent;
  }-*/;

  native static void PartyEditor_Event_createEntityEvent(PartyEditor instance, Event<PartyEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::createEntityEvent = value;
  }-*/;

  native static ListBox PartyEditor_ListBox_universe(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::universe;
  }-*/;

  native static void PartyEditor_ListBox_universe(PartyEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::universe = value;
  }-*/;

  native static TextBox PartyEditor_TextBox_effectiveDt(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::effectiveDt;
  }-*/;

  native static void PartyEditor_TextBox_effectiveDt(PartyEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::effectiveDt = value;
  }-*/;

  native static DataBinder PartyPresenter_DataBinder_binder(PartyPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder;
  }-*/;

  native static void PartyPresenter_DataBinder_binder(PartyPresenter instance, DataBinder<Party> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder = value;
  }-*/;

  native static Button PartyEditor_Button_editPartyBtn(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::editPartyBtn;
  }-*/;

  native static void PartyEditor_Button_editPartyBtn(PartyEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::editPartyBtn = value;
  }-*/;

  native static Div PartyEditor_Div_partyEditor(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::partyEditor;
  }-*/;

  native static void PartyEditor_Div_partyEditor(PartyEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::partyEditor = value;
  }-*/;

  native static TextBox PartyEditor_TextBox_entityCode(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::entityCode;
  }-*/;

  native static void PartyEditor_TextBox_entityCode(PartyEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::entityCode = value;
  }-*/;

  native static TextBox PartyEditor_TextBox_name(PartyEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyEditor::name;
  }-*/;

  native static void PartyEditor_TextBox_name(PartyEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyEditor::name = value;
  }-*/;
}
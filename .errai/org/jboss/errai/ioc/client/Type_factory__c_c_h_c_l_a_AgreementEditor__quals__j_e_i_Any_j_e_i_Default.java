package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.agreement.AgreementEditor;
import com.cloderia.helion.client.local.agreement.AgreementPresenter;
import com.cloderia.helion.client.local.agreement.ListAgreementPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Agreement;
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

public class Type_factory__c_c_h_c_l_a_AgreementEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AgreementEditor.class, "Type_factory__c_c_h_c_l_a_AgreementEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AgreementEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/agreement/edit-agreement-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AgreementEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AgreementEditor.class);
    handle.addAssignableType(AgreementPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AgreementEditor createInstance(final ContextManager contextManager) {
    final AgreementEditor instance = new AgreementEditor();
    setIncompleteInstance(instance);
    final ListBox AgreementEditor_agreementTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_agreementTy);
    AgreementEditor_ListBox_agreementTy(instance, AgreementEditor_agreementTy);
    final TextBox AgreementEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_description);
    AgreementEditor_TextBox_description(instance, AgreementEditor_description);
    final TextBox AgreementEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_name);
    AgreementEditor_TextBox_name(instance, AgreementEditor_name);
    final TextBox AgreementEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_entityCode);
    AgreementEditor_TextBox_entityCode(instance, AgreementEditor_entityCode);
    final TextBox AgreementEditor_toDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_toDt);
    AgreementEditor_TextBox_toDt(instance, AgreementEditor_toDt);
    final TransitionTo AgreementEditor_listAgreementsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListAgreementPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AgreementEditor_listAgreementsPage);
    AgreementEditor_TransitionTo_listAgreementsPage(instance, AgreementEditor_listAgreementsPage);
    final TextBox AgreementEditor_fromDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_fromDt);
    AgreementEditor_TextBox_fromDt(instance, AgreementEditor_fromDt);
    final TextBox AgreementEditor_agreementDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_agreementDt);
    AgreementEditor_TextBox_agreementDt(instance, AgreementEditor_agreementDt);
    final ListBox AgreementEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_universe);
    AgreementEditor_ListBox_universe(instance, AgreementEditor_universe);
    final Event AgreementEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AgreementEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, AgreementEditor_createEntityEvent);
    AgreementEditor_Event_createEntityEvent(instance, AgreementEditor_createEntityEvent);
    final DataBinder AgreementPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Agreement.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AgreementPresenter_binder);
    AgreementPresenter_DataBinder_binder(instance, AgreementPresenter_binder);
    final Div AgreementEditor_agreementEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementEditor_agreementEditor);
    AgreementEditor_Div_agreementEditor(instance, AgreementEditor_agreementEditor);
    final ListBox AgreementEditor_partyRel = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementEditor_partyRel);
    AgreementEditor_ListBox_partyRel(instance, AgreementEditor_partyRel);
    final Event AgreementEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AgreementEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, AgreementEditor_editEntityEvent);
    AgreementEditor_Event_editEntityEvent(instance, AgreementEditor_editEntityEvent);
    c_c_h_c_l_a_AgreementEditorTemplateResource templateForAgreementEditor = GWT.create(c_c_h_c_l_a_AgreementEditorTemplateResource.class);
    Element parentElementForTemplateOfAgreementEditor = TemplateUtil.getRootTemplateParentElement(templateForAgreementEditor.getContents().getText(), "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", "agreementEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/agreement/edit-agreement-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementEditor_Div_agreementEditor(instance)));
      }
    }, dataFieldElements, "agreementEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_ListBox_agreementTy(instance).asWidget();
      }
    }, dataFieldElements, "agreementTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_ListBox_partyRel(instance).asWidget();
      }
    }, dataFieldElements, "partyRel");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_TextBox_agreementDt(instance).asWidget();
      }
    }, dataFieldElements, "agreementDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_TextBox_fromDt(instance).asWidget();
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_TextBox_toDt(instance).asWidget();
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementEditor_Button_editAgreementBtn(instance).asWidget();
      }
    }, dataFieldElements, "editAgreementBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementEditor", "com/cloderia/helion/client/local/agreement/edit-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AgreementEditor_AnchorElement_listAgreementsPageLink(instance));
      }
    }, dataFieldElements, "listAgreementsPageLink");
    templateFieldsMap.put("agreementEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementEditor_Div_agreementEditor(instance))));
    templateFieldsMap.put("agreementTy", AgreementEditor_ListBox_agreementTy(instance).asWidget());
    templateFieldsMap.put("universe", AgreementEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("partyRel", AgreementEditor_ListBox_partyRel(instance).asWidget());
    templateFieldsMap.put("entityCode", AgreementEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", AgreementEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", AgreementEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("agreementDt", AgreementEditor_TextBox_agreementDt(instance).asWidget());
    templateFieldsMap.put("fromDt", AgreementEditor_TextBox_fromDt(instance).asWidget());
    templateFieldsMap.put("toDt", AgreementEditor_TextBox_toDt(instance).asWidget());
    templateFieldsMap.put("editAgreementBtn", AgreementEditor_Button_editAgreementBtn(instance).asWidget());
    templateFieldsMap.put("listAgreementsPageLink", ElementWrapperWidget.getWidget(AgreementEditor_AnchorElement_listAgreementsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editAgreementBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editAgreement(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listAgreementsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = AgreementPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.agreement.AgreementEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(AgreementEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(AgreementEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(AgreementEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(AgreementEditor_TextBox_agreementDt(instance), "agreementDt", new DateConverter(), null, false);
    binder.bind(AgreementEditor_TextBox_fromDt(instance), "fromDt", new DateConverter(), null, false);
    binder.bind(AgreementEditor_TextBox_toDt(instance), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AgreementEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final AgreementEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AgreementEditor_AnchorElement_listAgreementsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AgreementEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox AgreementEditor_ListBox_agreementTy(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::agreementTy;
  }-*/;

  native static void AgreementEditor_ListBox_agreementTy(AgreementEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::agreementTy = value;
  }-*/;

  native static TextBox AgreementEditor_TextBox_name(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::name;
  }-*/;

  native static void AgreementEditor_TextBox_name(AgreementEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::name = value;
  }-*/;

  native static Button AgreementEditor_Button_editAgreementBtn(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::editAgreementBtn;
  }-*/;

  native static void AgreementEditor_Button_editAgreementBtn(AgreementEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::editAgreementBtn = value;
  }-*/;

  native static DataBinder AgreementPresenter_DataBinder_binder(AgreementPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder;
  }-*/;

  native static void AgreementPresenter_DataBinder_binder(AgreementPresenter instance, DataBinder<Agreement> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder = value;
  }-*/;

  native static TextBox AgreementEditor_TextBox_description(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::description;
  }-*/;

  native static void AgreementEditor_TextBox_description(AgreementEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::description = value;
  }-*/;

  native static Div AgreementEditor_Div_agreementEditor(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::agreementEditor;
  }-*/;

  native static void AgreementEditor_Div_agreementEditor(AgreementEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::agreementEditor = value;
  }-*/;

  native static ListBox AgreementEditor_ListBox_universe(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::universe;
  }-*/;

  native static void AgreementEditor_ListBox_universe(AgreementEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::universe = value;
  }-*/;

  native static TextBox AgreementEditor_TextBox_entityCode(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::entityCode;
  }-*/;

  native static void AgreementEditor_TextBox_entityCode(AgreementEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::entityCode = value;
  }-*/;

  native static AnchorElement AgreementEditor_AnchorElement_listAgreementsPageLink(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::listAgreementsPageLink;
  }-*/;

  native static void AgreementEditor_AnchorElement_listAgreementsPageLink(AgreementEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::listAgreementsPageLink = value;
  }-*/;

  native static TextBox AgreementEditor_TextBox_agreementDt(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::agreementDt;
  }-*/;

  native static void AgreementEditor_TextBox_agreementDt(AgreementEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::agreementDt = value;
  }-*/;

  native static TextBox AgreementEditor_TextBox_toDt(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::toDt;
  }-*/;

  native static void AgreementEditor_TextBox_toDt(AgreementEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::toDt = value;
  }-*/;

  native static Event AgreementEditor_Event_editEntityEvent(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::editEntityEvent;
  }-*/;

  native static void AgreementEditor_Event_editEntityEvent(AgreementEditor instance, Event<AgreementEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::editEntityEvent = value;
  }-*/;

  native static ListBox AgreementEditor_ListBox_partyRel(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::partyRel;
  }-*/;

  native static void AgreementEditor_ListBox_partyRel(AgreementEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::partyRel = value;
  }-*/;

  native static Event AgreementEditor_Event_createEntityEvent(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::createEntityEvent;
  }-*/;

  native static void AgreementEditor_Event_createEntityEvent(AgreementEditor instance, Event<AgreementEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::createEntityEvent = value;
  }-*/;

  native static TransitionTo AgreementEditor_TransitionTo_listAgreementsPage(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::listAgreementsPage;
  }-*/;

  native static void AgreementEditor_TransitionTo_listAgreementsPage(AgreementEditor instance, TransitionTo<ListAgreementPage> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::listAgreementsPage = value;
  }-*/;

  native static TextBox AgreementEditor_TextBox_fromDt(AgreementEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::fromDt;
  }-*/;

  native static void AgreementEditor_TextBox_fromDt(AgreementEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementEditor::fromDt = value;
  }-*/;
}
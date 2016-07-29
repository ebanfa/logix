package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.generalledgeraccount.ListGeneralledgeraccountPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Generalledgeraccount;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccountEditor.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_GeneralledgeraccountEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccountEditor.class);
    handle.addAssignableType(GeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccountEditor createInstance(final ContextManager contextManager) {
    final GeneralledgeraccountEditor instance = new GeneralledgeraccountEditor();
    setIncompleteInstance(instance);
    final ListBox GeneralledgeraccountEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_universe);
    GeneralledgeraccountEditor_ListBox_universe(instance, GeneralledgeraccountEditor_universe);
    final ListBox GeneralledgeraccountEditor_glAcctTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_glAcctTy);
    GeneralledgeraccountEditor_ListBox_glAcctTy(instance, GeneralledgeraccountEditor_glAcctTy);
    final Event GeneralledgeraccountEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccountEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_createEntityEvent);
    GeneralledgeraccountEditor_Event_createEntityEvent(instance, GeneralledgeraccountEditor_createEntityEvent);
    final TextBox GeneralledgeraccountEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_name);
    GeneralledgeraccountEditor_TextBox_name(instance, GeneralledgeraccountEditor_name);
    final Event GeneralledgeraccountEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccountEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_editEntityEvent);
    GeneralledgeraccountEditor_Event_editEntityEvent(instance, GeneralledgeraccountEditor_editEntityEvent);
    final DataBinder GeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccountPresenter_binder);
    GeneralledgeraccountPresenter_DataBinder_binder(instance, GeneralledgeraccountPresenter_binder);
    final TextBox GeneralledgeraccountEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_entityCode);
    GeneralledgeraccountEditor_TextBox_entityCode(instance, GeneralledgeraccountEditor_entityCode);
    final Div GeneralledgeraccountEditor_generalledgeraccountEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_generalledgeraccountEditor);
    GeneralledgeraccountEditor_Div_generalledgeraccountEditor(instance, GeneralledgeraccountEditor_generalledgeraccountEditor);
    final TransitionTo GeneralledgeraccountEditor_listGeneralledgeraccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListGeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_listGeneralledgeraccountsPage);
    GeneralledgeraccountEditor_TransitionTo_listGeneralledgeraccountsPage(instance, GeneralledgeraccountEditor_listGeneralledgeraccountsPage);
    final TextBox GeneralledgeraccountEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_description);
    GeneralledgeraccountEditor_TextBox_description(instance, GeneralledgeraccountEditor_description);
    final TextBox GeneralledgeraccountEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccountEditor_effectiveDt);
    GeneralledgeraccountEditor_TextBox_effectiveDt(instance, GeneralledgeraccountEditor_effectiveDt);
    c_c_h_c_l_g_GeneralledgeraccountEditorTemplateResource templateForGeneralledgeraccountEditor = GWT.create(c_c_h_c_l_g_GeneralledgeraccountEditorTemplateResource.class);
    Element parentElementForTemplateOfGeneralledgeraccountEditor = TemplateUtil.getRootTemplateParentElement(templateForGeneralledgeraccountEditor.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", "generalledgeraccountEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountEditor_Div_generalledgeraccountEditor(instance)));
      }
    }, dataFieldElements, "generalledgeraccountEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccountEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccountEditor_ListBox_glAcctTy(instance).asWidget();
      }
    }, dataFieldElements, "glAcctTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccountEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccountEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccountEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccountEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccountEditor_Button_editGeneralledgeraccountBtn(instance).asWidget();
      }
    }, dataFieldElements, "editGeneralledgeraccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com/cloderia/helion/client/local/generalledgeraccount/edit-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccountEditor_AnchorElement_listGeneralledgeraccountsPageLink(instance));
      }
    }, dataFieldElements, "listGeneralledgeraccountsPageLink");
    templateFieldsMap.put("generalledgeraccountEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountEditor_Div_generalledgeraccountEditor(instance))));
    templateFieldsMap.put("universe", GeneralledgeraccountEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("glAcctTy", GeneralledgeraccountEditor_ListBox_glAcctTy(instance).asWidget());
    templateFieldsMap.put("entityCode", GeneralledgeraccountEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", GeneralledgeraccountEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", GeneralledgeraccountEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", GeneralledgeraccountEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editGeneralledgeraccountBtn", GeneralledgeraccountEditor_Button_editGeneralledgeraccountBtn(instance).asWidget());
    templateFieldsMap.put("listGeneralledgeraccountsPageLink", ElementWrapperWidget.getWidget(GeneralledgeraccountEditor_AnchorElement_listGeneralledgeraccountsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editGeneralledgeraccountBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editGeneralledgeraccount(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listGeneralledgeraccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = GeneralledgeraccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(GeneralledgeraccountEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(GeneralledgeraccountEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(GeneralledgeraccountEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(GeneralledgeraccountEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccountEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccountEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccountEditor_AnchorElement_listGeneralledgeraccountsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final GeneralledgeraccountEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement GeneralledgeraccountEditor_AnchorElement_listGeneralledgeraccountsPageLink(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::listGeneralledgeraccountsPageLink;
  }-*/;

  native static void GeneralledgeraccountEditor_AnchorElement_listGeneralledgeraccountsPageLink(GeneralledgeraccountEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::listGeneralledgeraccountsPageLink = value;
  }-*/;

  native static Div GeneralledgeraccountEditor_Div_generalledgeraccountEditor(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::generalledgeraccountEditor;
  }-*/;

  native static void GeneralledgeraccountEditor_Div_generalledgeraccountEditor(GeneralledgeraccountEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::generalledgeraccountEditor = value;
  }-*/;

  native static Event GeneralledgeraccountEditor_Event_createEntityEvent(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::createEntityEvent;
  }-*/;

  native static void GeneralledgeraccountEditor_Event_createEntityEvent(GeneralledgeraccountEditor instance, Event<GeneralledgeraccountEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::createEntityEvent = value;
  }-*/;

  native static TransitionTo GeneralledgeraccountEditor_TransitionTo_listGeneralledgeraccountsPage(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::listGeneralledgeraccountsPage;
  }-*/;

  native static void GeneralledgeraccountEditor_TransitionTo_listGeneralledgeraccountsPage(GeneralledgeraccountEditor instance, TransitionTo<ListGeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::listGeneralledgeraccountsPage = value;
  }-*/;

  native static TextBox GeneralledgeraccountEditor_TextBox_description(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::description;
  }-*/;

  native static void GeneralledgeraccountEditor_TextBox_description(GeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::description = value;
  }-*/;

  native static TextBox GeneralledgeraccountEditor_TextBox_name(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::name;
  }-*/;

  native static void GeneralledgeraccountEditor_TextBox_name(GeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::name = value;
  }-*/;

  native static DataBinder GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder;
  }-*/;

  native static void GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance, DataBinder<Generalledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder = value;
  }-*/;

  native static TextBox GeneralledgeraccountEditor_TextBox_entityCode(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::entityCode;
  }-*/;

  native static void GeneralledgeraccountEditor_TextBox_entityCode(GeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::entityCode = value;
  }-*/;

  native static Button GeneralledgeraccountEditor_Button_editGeneralledgeraccountBtn(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::editGeneralledgeraccountBtn;
  }-*/;

  native static void GeneralledgeraccountEditor_Button_editGeneralledgeraccountBtn(GeneralledgeraccountEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::editGeneralledgeraccountBtn = value;
  }-*/;

  native static Event GeneralledgeraccountEditor_Event_editEntityEvent(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::editEntityEvent;
  }-*/;

  native static void GeneralledgeraccountEditor_Event_editEntityEvent(GeneralledgeraccountEditor instance, Event<GeneralledgeraccountEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::editEntityEvent = value;
  }-*/;

  native static ListBox GeneralledgeraccountEditor_ListBox_universe(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::universe;
  }-*/;

  native static void GeneralledgeraccountEditor_ListBox_universe(GeneralledgeraccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::universe = value;
  }-*/;

  native static TextBox GeneralledgeraccountEditor_TextBox_effectiveDt(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::effectiveDt;
  }-*/;

  native static void GeneralledgeraccountEditor_TextBox_effectiveDt(GeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::effectiveDt = value;
  }-*/;

  native static ListBox GeneralledgeraccountEditor_ListBox_glAcctTy(GeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::glAcctTy;
  }-*/;

  native static void GeneralledgeraccountEditor_ListBox_glAcctTy(GeneralledgeraccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor::glAcctTy = value;
  }-*/;
}
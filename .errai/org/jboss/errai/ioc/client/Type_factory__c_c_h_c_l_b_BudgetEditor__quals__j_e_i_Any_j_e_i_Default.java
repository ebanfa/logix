package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budget.BudgetEditor;
import com.cloderia.helion.client.local.budget.BudgetPresenter;
import com.cloderia.helion.client.local.budget.ListBudgetPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Budget;
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

public class Type_factory__c_c_h_c_l_b_BudgetEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetEditor.class, "Type_factory__c_c_h_c_l_b_BudgetEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BudgetEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budget/edit-budget-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BudgetEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetEditor.class);
    handle.addAssignableType(BudgetPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetEditor createInstance(final ContextManager contextManager) {
    final BudgetEditor instance = new BudgetEditor();
    setIncompleteInstance(instance);
    final Event BudgetEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetEditor_editEntityEvent);
    BudgetEditor_Event_editEntityEvent(instance, BudgetEditor_editEntityEvent);
    final TextBox BudgetEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetEditor_entityCode);
    BudgetEditor_TextBox_entityCode(instance, BudgetEditor_entityCode);
    final TextBox BudgetEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetEditor_effectiveDt);
    BudgetEditor_TextBox_effectiveDt(instance, BudgetEditor_effectiveDt);
    final Div BudgetEditor_budgetEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetEditor_budgetEditor);
    BudgetEditor_Div_budgetEditor(instance, BudgetEditor_budgetEditor);
    final ListBox BudgetEditor_period = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetEditor_period);
    BudgetEditor_ListBox_period(instance, BudgetEditor_period);
    final ListBox BudgetEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetEditor_universe);
    BudgetEditor_ListBox_universe(instance, BudgetEditor_universe);
    final TextBox BudgetEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetEditor_name);
    BudgetEditor_TextBox_name(instance, BudgetEditor_name);
    final Event BudgetEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetEditor_createEntityEvent);
    BudgetEditor_Event_createEntityEvent(instance, BudgetEditor_createEntityEvent);
    final TextBox BudgetEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetEditor_description);
    BudgetEditor_TextBox_description(instance, BudgetEditor_description);
    final TransitionTo BudgetEditor_listBudgetsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBudgetPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetEditor_listBudgetsPage);
    BudgetEditor_TransitionTo_listBudgetsPage(instance, BudgetEditor_listBudgetsPage);
    final DataBinder BudgetPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budget.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetPresenter_binder);
    BudgetPresenter_DataBinder_binder(instance, BudgetPresenter_binder);
    c_c_h_c_l_b_BudgetEditorTemplateResource templateForBudgetEditor = GWT.create(c_c_h_c_l_b_BudgetEditorTemplateResource.class);
    Element parentElementForTemplateOfBudgetEditor = TemplateUtil.getRootTemplateParentElement(templateForBudgetEditor.getContents().getText(), "com/cloderia/helion/client/local/budget/edit-budget-page.html", "budgetEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budget/edit-budget-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetEditor_Div_budgetEditor(instance)));
      }
    }, dataFieldElements, "budgetEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetEditor_ListBox_period(instance).asWidget();
      }
    }, dataFieldElements, "period");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetEditor_Button_editBudgetBtn(instance).asWidget();
      }
    }, dataFieldElements, "editBudgetBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetEditor", "com/cloderia/helion/client/local/budget/edit-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetEditor_AnchorElement_listBudgetsPageLink(instance));
      }
    }, dataFieldElements, "listBudgetsPageLink");
    templateFieldsMap.put("budgetEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetEditor_Div_budgetEditor(instance))));
    templateFieldsMap.put("period", BudgetEditor_ListBox_period(instance).asWidget());
    templateFieldsMap.put("universe", BudgetEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", BudgetEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", BudgetEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", BudgetEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", BudgetEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editBudgetBtn", BudgetEditor_Button_editBudgetBtn(instance).asWidget());
    templateFieldsMap.put("listBudgetsPageLink", ElementWrapperWidget.getWidget(BudgetEditor_AnchorElement_listBudgetsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editBudgetBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editBudget(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBudgetsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = BudgetPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.budget.BudgetEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(BudgetEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BudgetEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BudgetEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BudgetEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetEditor_AnchorElement_listBudgetsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BudgetEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox BudgetEditor_TextBox_effectiveDt(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::effectiveDt;
  }-*/;

  native static void BudgetEditor_TextBox_effectiveDt(BudgetEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::effectiveDt = value;
  }-*/;

  native static Event BudgetEditor_Event_editEntityEvent(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::editEntityEvent;
  }-*/;

  native static void BudgetEditor_Event_editEntityEvent(BudgetEditor instance, Event<BudgetEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::editEntityEvent = value;
  }-*/;

  native static TextBox BudgetEditor_TextBox_description(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::description;
  }-*/;

  native static void BudgetEditor_TextBox_description(BudgetEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::description = value;
  }-*/;

  native static DataBinder BudgetPresenter_DataBinder_binder(BudgetPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder;
  }-*/;

  native static void BudgetPresenter_DataBinder_binder(BudgetPresenter instance, DataBinder<Budget> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder = value;
  }-*/;

  native static TextBox BudgetEditor_TextBox_name(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::name;
  }-*/;

  native static void BudgetEditor_TextBox_name(BudgetEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::name = value;
  }-*/;

  native static Event BudgetEditor_Event_createEntityEvent(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::createEntityEvent;
  }-*/;

  native static void BudgetEditor_Event_createEntityEvent(BudgetEditor instance, Event<BudgetEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::createEntityEvent = value;
  }-*/;

  native static Button BudgetEditor_Button_editBudgetBtn(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::editBudgetBtn;
  }-*/;

  native static void BudgetEditor_Button_editBudgetBtn(BudgetEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::editBudgetBtn = value;
  }-*/;

  native static Div BudgetEditor_Div_budgetEditor(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::budgetEditor;
  }-*/;

  native static void BudgetEditor_Div_budgetEditor(BudgetEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::budgetEditor = value;
  }-*/;

  native static TextBox BudgetEditor_TextBox_entityCode(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::entityCode;
  }-*/;

  native static void BudgetEditor_TextBox_entityCode(BudgetEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::entityCode = value;
  }-*/;

  native static ListBox BudgetEditor_ListBox_universe(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::universe;
  }-*/;

  native static void BudgetEditor_ListBox_universe(BudgetEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::universe = value;
  }-*/;

  native static TransitionTo BudgetEditor_TransitionTo_listBudgetsPage(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::listBudgetsPage;
  }-*/;

  native static void BudgetEditor_TransitionTo_listBudgetsPage(BudgetEditor instance, TransitionTo<ListBudgetPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::listBudgetsPage = value;
  }-*/;

  native static ListBox BudgetEditor_ListBox_period(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::period;
  }-*/;

  native static void BudgetEditor_ListBox_period(BudgetEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::period = value;
  }-*/;

  native static AnchorElement BudgetEditor_AnchorElement_listBudgetsPageLink(BudgetEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetEditor::listBudgetsPageLink;
  }-*/;

  native static void BudgetEditor_AnchorElement_listBudgetsPageLink(BudgetEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetEditor::listBudgetsPageLink = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budgetitem.BudgetitemEditor;
import com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter;
import com.cloderia.helion.client.local.budgetitem.ListBudgetitemPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Budgetitem;
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
import java.math.BigDecimal;
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

public class Type_factory__c_c_h_c_l_b_BudgetitemEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetitemEditor.class, "Type_factory__c_c_h_c_l_b_BudgetitemEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BudgetitemEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BudgetitemEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetitemEditor.class);
    handle.addAssignableType(BudgetitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetitemEditor createInstance(final ContextManager contextManager) {
    final BudgetitemEditor instance = new BudgetitemEditor();
    setIncompleteInstance(instance);
    final TextBox BudgetitemEditor_amount = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_amount);
    BudgetitemEditor_TextBox_amount(instance, BudgetitemEditor_amount);
    final TextBox BudgetitemEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_effectiveDt);
    BudgetitemEditor_TextBox_effectiveDt(instance, BudgetitemEditor_effectiveDt);
    final ListBox BudgetitemEditor_parentItem = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_parentItem);
    BudgetitemEditor_ListBox_parentItem(instance, BudgetitemEditor_parentItem);
    final ListBox BudgetitemEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_universe);
    BudgetitemEditor_ListBox_universe(instance, BudgetitemEditor_universe);
    final Div BudgetitemEditor_budgetitemEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemEditor_budgetitemEditor);
    BudgetitemEditor_Div_budgetitemEditor(instance, BudgetitemEditor_budgetitemEditor);
    final TextBox BudgetitemEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_name);
    BudgetitemEditor_TextBox_name(instance, BudgetitemEditor_name);
    final TextBox BudgetitemEditor_justification = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_justification);
    BudgetitemEditor_TextBox_justification(instance, BudgetitemEditor_justification);
    final Event BudgetitemEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetitemEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetitemEditor_createEntityEvent);
    BudgetitemEditor_Event_createEntityEvent(instance, BudgetitemEditor_createEntityEvent);
    final TransitionTo BudgetitemEditor_listBudgetitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBudgetitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetitemEditor_listBudgetitemsPage);
    BudgetitemEditor_TransitionTo_listBudgetitemsPage(instance, BudgetitemEditor_listBudgetitemsPage);
    final TextBox BudgetitemEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_entityCode);
    BudgetitemEditor_TextBox_entityCode(instance, BudgetitemEditor_entityCode);
    final ListBox BudgetitemEditor_budget = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_budget);
    BudgetitemEditor_ListBox_budget(instance, BudgetitemEditor_budget);
    final TextBox BudgetitemEditor_purpose = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_purpose);
    BudgetitemEditor_TextBox_purpose(instance, BudgetitemEditor_purpose);
    final ListBox BudgetitemEditor_itemTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetitemEditor_itemTy);
    BudgetitemEditor_ListBox_itemTy(instance, BudgetitemEditor_itemTy);
    final Event BudgetitemEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetitemEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetitemEditor_editEntityEvent);
    BudgetitemEditor_Event_editEntityEvent(instance, BudgetitemEditor_editEntityEvent);
    final DataBinder BudgetitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budgetitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetitemPresenter_binder);
    BudgetitemPresenter_DataBinder_binder(instance, BudgetitemPresenter_binder);
    c_c_h_c_l_b_BudgetitemEditorTemplateResource templateForBudgetitemEditor = GWT.create(c_c_h_c_l_b_BudgetitemEditorTemplateResource.class);
    Element parentElementForTemplateOfBudgetitemEditor = TemplateUtil.getRootTemplateParentElement(templateForBudgetitemEditor.getContents().getText(), "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", "budgetitemEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemEditor_Div_budgetitemEditor(instance)));
      }
    }, dataFieldElements, "budgetitemEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_ListBox_itemTy(instance).asWidget();
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_ListBox_parentItem(instance).asWidget();
      }
    }, dataFieldElements, "parentItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_ListBox_budget(instance).asWidget();
      }
    }, dataFieldElements, "budget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_TextBox_amount(instance).asWidget();
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_TextBox_justification(instance).asWidget();
      }
    }, dataFieldElements, "justification");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_TextBox_purpose(instance).asWidget();
      }
    }, dataFieldElements, "purpose");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetitemEditor_Button_editBudgetitemBtn(instance).asWidget();
      }
    }, dataFieldElements, "editBudgetitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com/cloderia/helion/client/local/budgetitem/edit-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetitemEditor_AnchorElement_listBudgetitemsPageLink(instance));
      }
    }, dataFieldElements, "listBudgetitemsPageLink");
    templateFieldsMap.put("budgetitemEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemEditor_Div_budgetitemEditor(instance))));
    templateFieldsMap.put("itemTy", BudgetitemEditor_ListBox_itemTy(instance).asWidget());
    templateFieldsMap.put("parentItem", BudgetitemEditor_ListBox_parentItem(instance).asWidget());
    templateFieldsMap.put("universe", BudgetitemEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("budget", BudgetitemEditor_ListBox_budget(instance).asWidget());
    templateFieldsMap.put("entityCode", BudgetitemEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", BudgetitemEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("amount", BudgetitemEditor_TextBox_amount(instance).asWidget());
    templateFieldsMap.put("justification", BudgetitemEditor_TextBox_justification(instance).asWidget());
    templateFieldsMap.put("purpose", BudgetitemEditor_TextBox_purpose(instance).asWidget());
    templateFieldsMap.put("effectiveDt", BudgetitemEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editBudgetitemBtn", BudgetitemEditor_Button_editBudgetitemBtn(instance).asWidget());
    templateFieldsMap.put("listBudgetitemsPageLink", ElementWrapperWidget.getWidget(BudgetitemEditor_AnchorElement_listBudgetitemsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editBudgetitemBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editBudgetitem(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBudgetitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = BudgetitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.budgetitem.BudgetitemEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(BudgetitemEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BudgetitemEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BudgetitemEditor_TextBox_amount(instance), "amount", Convert.getConverter(BigDecimal.class, String.class), null, false);
    binder.bind(BudgetitemEditor_TextBox_justification(instance), "justification", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BudgetitemEditor_TextBox_purpose(instance), "purpose", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BudgetitemEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetitemEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetitemEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetitemEditor_AnchorElement_listBudgetitemsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BudgetitemEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox BudgetitemEditor_ListBox_budget(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::budget;
  }-*/;

  native static void BudgetitemEditor_ListBox_budget(BudgetitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::budget = value;
  }-*/;

  native static TextBox BudgetitemEditor_TextBox_name(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::name;
  }-*/;

  native static void BudgetitemEditor_TextBox_name(BudgetitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::name = value;
  }-*/;

  native static Div BudgetitemEditor_Div_budgetitemEditor(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::budgetitemEditor;
  }-*/;

  native static void BudgetitemEditor_Div_budgetitemEditor(BudgetitemEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::budgetitemEditor = value;
  }-*/;

  native static ListBox BudgetitemEditor_ListBox_itemTy(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::itemTy;
  }-*/;

  native static void BudgetitemEditor_ListBox_itemTy(BudgetitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::itemTy = value;
  }-*/;

  native static TextBox BudgetitemEditor_TextBox_amount(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::amount;
  }-*/;

  native static void BudgetitemEditor_TextBox_amount(BudgetitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::amount = value;
  }-*/;

  native static TextBox BudgetitemEditor_TextBox_justification(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::justification;
  }-*/;

  native static void BudgetitemEditor_TextBox_justification(BudgetitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::justification = value;
  }-*/;

  native static TextBox BudgetitemEditor_TextBox_effectiveDt(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::effectiveDt;
  }-*/;

  native static void BudgetitemEditor_TextBox_effectiveDt(BudgetitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::effectiveDt = value;
  }-*/;

  native static AnchorElement BudgetitemEditor_AnchorElement_listBudgetitemsPageLink(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::listBudgetitemsPageLink;
  }-*/;

  native static void BudgetitemEditor_AnchorElement_listBudgetitemsPageLink(BudgetitemEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::listBudgetitemsPageLink = value;
  }-*/;

  native static DataBinder BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder;
  }-*/;

  native static void BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance, DataBinder<Budgetitem> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder = value;
  }-*/;

  native static TransitionTo BudgetitemEditor_TransitionTo_listBudgetitemsPage(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::listBudgetitemsPage;
  }-*/;

  native static void BudgetitemEditor_TransitionTo_listBudgetitemsPage(BudgetitemEditor instance, TransitionTo<ListBudgetitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::listBudgetitemsPage = value;
  }-*/;

  native static TextBox BudgetitemEditor_TextBox_purpose(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::purpose;
  }-*/;

  native static void BudgetitemEditor_TextBox_purpose(BudgetitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::purpose = value;
  }-*/;

  native static Event BudgetitemEditor_Event_createEntityEvent(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::createEntityEvent;
  }-*/;

  native static void BudgetitemEditor_Event_createEntityEvent(BudgetitemEditor instance, Event<BudgetitemEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::createEntityEvent = value;
  }-*/;

  native static ListBox BudgetitemEditor_ListBox_parentItem(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::parentItem;
  }-*/;

  native static void BudgetitemEditor_ListBox_parentItem(BudgetitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::parentItem = value;
  }-*/;

  native static ListBox BudgetitemEditor_ListBox_universe(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::universe;
  }-*/;

  native static void BudgetitemEditor_ListBox_universe(BudgetitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::universe = value;
  }-*/;

  native static Button BudgetitemEditor_Button_editBudgetitemBtn(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::editBudgetitemBtn;
  }-*/;

  native static void BudgetitemEditor_Button_editBudgetitemBtn(BudgetitemEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::editBudgetitemBtn = value;
  }-*/;

  native static Event BudgetitemEditor_Event_editEntityEvent(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::editEntityEvent;
  }-*/;

  native static void BudgetitemEditor_Event_editEntityEvent(BudgetitemEditor instance, Event<BudgetitemEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::editEntityEvent = value;
  }-*/;

  native static TextBox BudgetitemEditor_TextBox_entityCode(BudgetitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::entityCode;
  }-*/;

  native static void BudgetitemEditor_TextBox_entityCode(BudgetitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemEditor::entityCode = value;
  }-*/;
}
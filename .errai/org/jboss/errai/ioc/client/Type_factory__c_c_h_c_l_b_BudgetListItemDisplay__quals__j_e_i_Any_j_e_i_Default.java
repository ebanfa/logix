package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budget.BudgetListItemDisplay;
import com.cloderia.helion.client.local.budget.BudgetPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Budget;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.dom.TableRow;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.BoundUtil;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_b_BudgetListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetListItemDisplay.class, "Type_factory__c_c_h_c_l_b_BudgetListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BudgetListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budget/list-budget-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BudgetListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetListItemDisplay.class);
    handle.addAssignableType(BudgetPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetListItemDisplay createInstance(final ContextManager contextManager) {
    final BudgetListItemDisplay instance = new BudgetListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell BudgetListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_entityCode);
    BudgetListItemDisplay_TableCell_entityCode(instance, BudgetListItemDisplay_entityCode);
    final TableCell BudgetListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_description);
    BudgetListItemDisplay_TableCell_description(instance, BudgetListItemDisplay_description);
    final Event BudgetListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetListItemDisplay_deleteEntityEvent);
    BudgetListItemDisplay_Event_deleteEntityEvent(instance, BudgetListItemDisplay_deleteEntityEvent);
    final TableRow BudgetListItemDisplay_budgetItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_budgetItem);
    BudgetListItemDisplay_TableRow_budgetItem(instance, BudgetListItemDisplay_budgetItem);
    final TableCell BudgetListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_effectiveDt);
    BudgetListItemDisplay_TableCell_effectiveDt(instance, BudgetListItemDisplay_effectiveDt);
    final Event BudgetListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, BudgetListItemDisplay_renderSingleViewEvent);
    BudgetListItemDisplay_Event_renderSingleViewEvent(instance, BudgetListItemDisplay_renderSingleViewEvent);
    final AnchorElement BudgetListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_editEntityListItemBtn);
    BudgetListItemDisplay_AnchorElement_editEntityListItemBtn(instance, BudgetListItemDisplay_editEntityListItemBtn);
    final TableCell BudgetListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_name);
    BudgetListItemDisplay_TableCell_name(instance, BudgetListItemDisplay_name);
    final Event BudgetListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, BudgetListItemDisplay_renderEditViewEvent);
    BudgetListItemDisplay_Event_renderEditViewEvent(instance, BudgetListItemDisplay_renderEditViewEvent);
    final AnchorElement BudgetListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_deleteEntityListItemBtn);
    BudgetListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, BudgetListItemDisplay_deleteEntityListItemBtn);
    final TableCell BudgetListItemDisplay_period = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetListItemDisplay_period);
    BudgetListItemDisplay_TableCell_period(instance, BudgetListItemDisplay_period);
    final DataBinder BudgetPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budget.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetPresenter_binder);
    BudgetPresenter_DataBinder_binder(instance, BudgetPresenter_binder);
    c_c_h_c_l_b_BudgetListItemDisplayTemplateResource templateForBudgetListItemDisplay = GWT.create(c_c_h_c_l_b_BudgetListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfBudgetListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForBudgetListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/budget/list-budget-page.html", "budgetItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budget/list-budget-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableRow_budgetItem(instance)));
      }
    }, dataFieldElements, "budgetItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_period(instance)));
      }
    }, dataFieldElements, "period");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("budgetItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableRow_budgetItem(instance))));
    templateFieldsMap.put("period", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_period(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(BudgetListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(BudgetListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetListItemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderEditView(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderDeleteView(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = BudgetPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.budget.BudgetListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetListItemDisplay_TableCell_period(instance))), "period.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BudgetListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell BudgetListItemDisplay_TableCell_effectiveDt(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::effectiveDt;
  }-*/;

  native static void BudgetListItemDisplay_TableCell_effectiveDt(BudgetListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::effectiveDt = value;
  }-*/;

  native static AnchorElement BudgetListItemDisplay_AnchorElement_editEntityListItemBtn(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void BudgetListItemDisplay_AnchorElement_editEntityListItemBtn(BudgetListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static DataBinder BudgetPresenter_DataBinder_binder(BudgetPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder;
  }-*/;

  native static void BudgetPresenter_DataBinder_binder(BudgetPresenter instance, DataBinder<Budget> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder = value;
  }-*/;

  native static TableCell BudgetListItemDisplay_TableCell_description(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::description;
  }-*/;

  native static void BudgetListItemDisplay_TableCell_description(BudgetListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::description = value;
  }-*/;

  native static TableCell BudgetListItemDisplay_TableCell_entityCode(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::entityCode;
  }-*/;

  native static void BudgetListItemDisplay_TableCell_entityCode(BudgetListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell BudgetListItemDisplay_TableCell_period(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::period;
  }-*/;

  native static void BudgetListItemDisplay_TableCell_period(BudgetListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::period = value;
  }-*/;

  native static TableCell BudgetListItemDisplay_TableCell_name(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::name;
  }-*/;

  native static void BudgetListItemDisplay_TableCell_name(BudgetListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::name = value;
  }-*/;

  native static TableRow BudgetListItemDisplay_TableRow_budgetItem(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::budgetItem;
  }-*/;

  native static void BudgetListItemDisplay_TableRow_budgetItem(BudgetListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::budgetItem = value;
  }-*/;

  native static Event BudgetListItemDisplay_Event_renderSingleViewEvent(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void BudgetListItemDisplay_Event_renderSingleViewEvent(BudgetListItemDisplay instance, Event<BudgetListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static AnchorElement BudgetListItemDisplay_AnchorElement_deleteEntityListItemBtn(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void BudgetListItemDisplay_AnchorElement_deleteEntityListItemBtn(BudgetListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event BudgetListItemDisplay_Event_renderEditViewEvent(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void BudgetListItemDisplay_Event_renderEditViewEvent(BudgetListItemDisplay instance, Event<BudgetListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static Event BudgetListItemDisplay_Event_deleteEntityEvent(BudgetListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void BudgetListItemDisplay_Event_deleteEntityEvent(BudgetListItemDisplay instance, Event<BudgetListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListItemDisplay::deleteEntityEvent = value;
  }-*/;
}
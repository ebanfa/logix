package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay;
import com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Budgetitem;
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

public class Type_factory__c_c_h_c_l_b_BudgetitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetitemListItemDisplay.class, "Type_factory__c_c_h_c_l_b_BudgetitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BudgetitemListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BudgetitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetitemListItemDisplay.class);
    handle.addAssignableType(BudgetitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetitemListItemDisplay createInstance(final ContextManager contextManager) {
    final BudgetitemListItemDisplay instance = new BudgetitemListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell BudgetitemListItemDisplay_purpose = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_purpose);
    BudgetitemListItemDisplay_TableCell_purpose(instance, BudgetitemListItemDisplay_purpose);
    final TableCell BudgetitemListItemDisplay_parentItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_parentItem);
    BudgetitemListItemDisplay_TableCell_parentItem(instance, BudgetitemListItemDisplay_parentItem);
    final AnchorElement BudgetitemListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_deleteEntityListItemBtn);
    BudgetitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, BudgetitemListItemDisplay_deleteEntityListItemBtn);
    final TableCell BudgetitemListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_entityCode);
    BudgetitemListItemDisplay_TableCell_entityCode(instance, BudgetitemListItemDisplay_entityCode);
    final TableCell BudgetitemListItemDisplay_justification = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_justification);
    BudgetitemListItemDisplay_TableCell_justification(instance, BudgetitemListItemDisplay_justification);
    final Event BudgetitemListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetitemListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_renderSingleViewEvent);
    BudgetitemListItemDisplay_Event_renderSingleViewEvent(instance, BudgetitemListItemDisplay_renderSingleViewEvent);
    final AnchorElement BudgetitemListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_editEntityListItemBtn);
    BudgetitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance, BudgetitemListItemDisplay_editEntityListItemBtn);
    final Event BudgetitemListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetitemListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_deleteEntityEvent);
    BudgetitemListItemDisplay_Event_deleteEntityEvent(instance, BudgetitemListItemDisplay_deleteEntityEvent);
    final Event BudgetitemListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetitemListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_renderEditViewEvent);
    BudgetitemListItemDisplay_Event_renderEditViewEvent(instance, BudgetitemListItemDisplay_renderEditViewEvent);
    final TableCell BudgetitemListItemDisplay_itemTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_itemTy);
    BudgetitemListItemDisplay_TableCell_itemTy(instance, BudgetitemListItemDisplay_itemTy);
    final TableCell BudgetitemListItemDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_amount);
    BudgetitemListItemDisplay_TableCell_amount(instance, BudgetitemListItemDisplay_amount);
    final TableCell BudgetitemListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_effectiveDt);
    BudgetitemListItemDisplay_TableCell_effectiveDt(instance, BudgetitemListItemDisplay_effectiveDt);
    final DataBinder BudgetitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budgetitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetitemPresenter_binder);
    BudgetitemPresenter_DataBinder_binder(instance, BudgetitemPresenter_binder);
    final TableCell BudgetitemListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_name);
    BudgetitemListItemDisplay_TableCell_name(instance, BudgetitemListItemDisplay_name);
    final TableCell BudgetitemListItemDisplay_budget = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_budget);
    BudgetitemListItemDisplay_TableCell_budget(instance, BudgetitemListItemDisplay_budget);
    final TableRow BudgetitemListItemDisplay_budgetitemItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemListItemDisplay_budgetitemItem);
    BudgetitemListItemDisplay_TableRow_budgetitemItem(instance, BudgetitemListItemDisplay_budgetitemItem);
    c_c_h_c_l_b_BudgetitemListItemDisplayTemplateResource templateForBudgetitemListItemDisplay = GWT.create(c_c_h_c_l_b_BudgetitemListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfBudgetitemListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForBudgetitemListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", "budgetitemItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableRow_budgetitemItem(instance)));
      }
    }, dataFieldElements, "budgetitemItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_itemTy(instance)));
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_parentItem(instance)));
      }
    }, dataFieldElements, "parentItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_budget(instance)));
      }
    }, dataFieldElements, "budget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_justification(instance)));
      }
    }, dataFieldElements, "justification");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_purpose(instance)));
      }
    }, dataFieldElements, "purpose");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com/cloderia/helion/client/local/budgetitem/list-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("budgetitemItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableRow_budgetitemItem(instance))));
    templateFieldsMap.put("itemTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_itemTy(instance))));
    templateFieldsMap.put("parentItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_parentItem(instance))));
    templateFieldsMap.put("budget", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_budget(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("justification", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_justification(instance))));
    templateFieldsMap.put("purpose", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_purpose(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(BudgetitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(BudgetitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = BudgetitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_itemTy(instance))), "itemTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_parentItem(instance))), "parentItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_budget(instance))), "budget.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_justification(instance))), "justification", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_purpose(instance))), "purpose", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetitemListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetitemListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BudgetitemListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement BudgetitemListItemDisplay_AnchorElement_editEntityListItemBtn(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void BudgetitemListItemDisplay_AnchorElement_editEntityListItemBtn(BudgetitemListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_justification(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::justification;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_justification(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::justification = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_amount(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::amount;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_amount(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::amount = value;
  }-*/;

  native static DataBinder BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder;
  }-*/;

  native static void BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance, DataBinder<Budgetitem> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder = value;
  }-*/;

  native static Event BudgetitemListItemDisplay_Event_renderSingleViewEvent(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void BudgetitemListItemDisplay_Event_renderSingleViewEvent(BudgetitemListItemDisplay instance, Event<BudgetitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static Event BudgetitemListItemDisplay_Event_deleteEntityEvent(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void BudgetitemListItemDisplay_Event_deleteEntityEvent(BudgetitemListItemDisplay instance, Event<BudgetitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_effectiveDt(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::effectiveDt;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_effectiveDt(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_budget(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::budget;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_budget(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::budget = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_parentItem(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::parentItem;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_parentItem(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::parentItem = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_entityCode(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::entityCode;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_entityCode(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::entityCode = value;
  }-*/;

  native static Event BudgetitemListItemDisplay_Event_renderEditViewEvent(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void BudgetitemListItemDisplay_Event_renderEditViewEvent(BudgetitemListItemDisplay instance, Event<BudgetitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_itemTy(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::itemTy;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_itemTy(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::itemTy = value;
  }-*/;

  native static AnchorElement BudgetitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void BudgetitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(BudgetitemListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableRow BudgetitemListItemDisplay_TableRow_budgetitemItem(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::budgetitemItem;
  }-*/;

  native static void BudgetitemListItemDisplay_TableRow_budgetitemItem(BudgetitemListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::budgetitemItem = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_name(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::name;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_name(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::name = value;
  }-*/;

  native static TableCell BudgetitemListItemDisplay_TableCell_purpose(BudgetitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::purpose;
  }-*/;

  native static void BudgetitemListItemDisplay_TableCell_purpose(BudgetitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay::purpose = value;
  }-*/;
}
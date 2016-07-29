package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budget.BudgetDisplay;
import com.cloderia.helion.client.local.budget.BudgetPresenter;
import com.cloderia.helion.client.local.budget.ListBudgetPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.TableCell;
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
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_b_BudgetDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetDisplay.class, "Type_factory__c_c_h_c_l_b_BudgetDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BudgetDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budget/view-budget-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BudgetDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetDisplay.class);
    handle.addAssignableType(BudgetPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetDisplay createInstance(final ContextManager contextManager) {
    final BudgetDisplay instance = new BudgetDisplay();
    setIncompleteInstance(instance);
    final TableCell BudgetDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_universe);
    BudgetDisplay_TableCell_universe(instance, BudgetDisplay_universe);
    final Heading BudgetDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, BudgetDisplay_code);
    BudgetDisplay_Heading_code(instance, BudgetDisplay_code);
    final TableCell BudgetDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_name);
    BudgetDisplay_TableCell_name(instance, BudgetDisplay_name);
    final Event BudgetDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, BudgetDisplay_renderEditViewEvent);
    BudgetDisplay_Event_renderEditViewEvent(instance, BudgetDisplay_renderEditViewEvent);
    final Span BudgetDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_lastModifiedDt);
    BudgetDisplay_Span_lastModifiedDt(instance, BudgetDisplay_lastModifiedDt);
    final TransitionTo BudgetDisplay_listBudgetsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBudgetPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetDisplay_listBudgetsPage);
    BudgetDisplay_TransitionTo_listBudgetsPage(instance, BudgetDisplay_listBudgetsPage);
    final Span BudgetDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_createdDt);
    BudgetDisplay_Span_createdDt(instance, BudgetDisplay_createdDt);
    final TableCell BudgetDisplay_period = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_period);
    BudgetDisplay_TableCell_period(instance, BudgetDisplay_period);
    final TableCell BudgetDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_entityCode);
    BudgetDisplay_TableCell_entityCode(instance, BudgetDisplay_entityCode);
    final Event BudgetDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetDisplay_deleteEntityEvent);
    BudgetDisplay_Event_deleteEntityEvent(instance, BudgetDisplay_deleteEntityEvent);
    final Div BudgetDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_entityDisplayComponent);
    BudgetDisplay_Div_entityDisplayComponent(instance, BudgetDisplay_entityDisplayComponent);
    final TableCell BudgetDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_effectiveDt);
    BudgetDisplay_TableCell_effectiveDt(instance, BudgetDisplay_effectiveDt);
    final DataBinder BudgetPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budget.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetPresenter_binder);
    BudgetPresenter_DataBinder_binder(instance, BudgetPresenter_binder);
    final TableCell BudgetDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetDisplay_description);
    BudgetDisplay_TableCell_description(instance, BudgetDisplay_description);
    c_c_h_c_l_b_BudgetDisplayTemplateResource templateForBudgetDisplay = GWT.create(c_c_h_c_l_b_BudgetDisplayTemplateResource.class);
    Element parentElementForTemplateOfBudgetDisplay = TemplateUtil.getRootTemplateParentElement(templateForBudgetDisplay.getContents().getText(), "com/cloderia/helion/client/local/budget/view-budget-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budget/view-budget-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_period(instance)));
      }
    }, dataFieldElements, "period");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_editBudgetBtn(instance));
      }
    }, dataFieldElements, "editBudgetBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_deleteBudgetBtn(instance));
      }
    }, dataFieldElements, "deleteBudgetBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetDisplay", "com/cloderia/helion/client/local/budget/view-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_listBudgetsPageLink(instance));
      }
    }, dataFieldElements, "listBudgetsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("period", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_period(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editBudgetBtn", ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_editBudgetBtn(instance)));
    templateFieldsMap.put("deleteBudgetBtn", ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_deleteBudgetBtn(instance)));
    templateFieldsMap.put("listBudgetsPageLink", ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_listBudgetsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editBudgetBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditBudgetBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteBudgetBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteBudgetBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBudgetsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = BudgetPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.budget.BudgetDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_TableCell_period(instance))), "period.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_editBudgetBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_deleteBudgetBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetDisplay_AnchorElement_listBudgetsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BudgetDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell BudgetDisplay_TableCell_entityCode(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::entityCode;
  }-*/;

  native static void BudgetDisplay_TableCell_entityCode(BudgetDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::entityCode = value;
  }-*/;

  native static Span BudgetDisplay_Span_createdDt(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::createdDt;
  }-*/;

  native static void BudgetDisplay_Span_createdDt(BudgetDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::createdDt = value;
  }-*/;

  native static DataBinder BudgetPresenter_DataBinder_binder(BudgetPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder;
  }-*/;

  native static void BudgetPresenter_DataBinder_binder(BudgetPresenter instance, DataBinder<Budget> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetPresenter::binder = value;
  }-*/;

  native static TableCell BudgetDisplay_TableCell_description(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::description;
  }-*/;

  native static void BudgetDisplay_TableCell_description(BudgetDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::description = value;
  }-*/;

  native static TableCell BudgetDisplay_TableCell_universe(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::universe;
  }-*/;

  native static void BudgetDisplay_TableCell_universe(BudgetDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::universe = value;
  }-*/;

  native static AnchorElement BudgetDisplay_AnchorElement_editBudgetBtn(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::editBudgetBtn;
  }-*/;

  native static void BudgetDisplay_AnchorElement_editBudgetBtn(BudgetDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::editBudgetBtn = value;
  }-*/;

  native static Event BudgetDisplay_Event_renderEditViewEvent(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::renderEditViewEvent;
  }-*/;

  native static void BudgetDisplay_Event_renderEditViewEvent(BudgetDisplay instance, Event<BudgetDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::renderEditViewEvent = value;
  }-*/;

  native static TransitionTo BudgetDisplay_TransitionTo_listBudgetsPage(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::listBudgetsPage;
  }-*/;

  native static void BudgetDisplay_TransitionTo_listBudgetsPage(BudgetDisplay instance, TransitionTo<ListBudgetPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::listBudgetsPage = value;
  }-*/;

  native static TableCell BudgetDisplay_TableCell_period(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::period;
  }-*/;

  native static void BudgetDisplay_TableCell_period(BudgetDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::period = value;
  }-*/;

  native static Event BudgetDisplay_Event_deleteEntityEvent(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::deleteEntityEvent;
  }-*/;

  native static void BudgetDisplay_Event_deleteEntityEvent(BudgetDisplay instance, Event<BudgetDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::deleteEntityEvent = value;
  }-*/;

  native static Span BudgetDisplay_Span_lastModifiedDt(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::lastModifiedDt;
  }-*/;

  native static void BudgetDisplay_Span_lastModifiedDt(BudgetDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::lastModifiedDt = value;
  }-*/;

  native static AnchorElement BudgetDisplay_AnchorElement_deleteBudgetBtn(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::deleteBudgetBtn;
  }-*/;

  native static void BudgetDisplay_AnchorElement_deleteBudgetBtn(BudgetDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::deleteBudgetBtn = value;
  }-*/;

  native static AnchorElement BudgetDisplay_AnchorElement_listBudgetsPageLink(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::listBudgetsPageLink;
  }-*/;

  native static void BudgetDisplay_AnchorElement_listBudgetsPageLink(BudgetDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::listBudgetsPageLink = value;
  }-*/;

  native static Heading BudgetDisplay_Heading_code(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::code;
  }-*/;

  native static void BudgetDisplay_Heading_code(BudgetDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::code = value;
  }-*/;

  native static Div BudgetDisplay_Div_entityDisplayComponent(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::entityDisplayComponent;
  }-*/;

  native static void BudgetDisplay_Div_entityDisplayComponent(BudgetDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell BudgetDisplay_TableCell_name(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::name;
  }-*/;

  native static void BudgetDisplay_TableCell_name(BudgetDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::name = value;
  }-*/;

  native static TableCell BudgetDisplay_TableCell_effectiveDt(BudgetDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::effectiveDt;
  }-*/;

  native static void BudgetDisplay_TableCell_effectiveDt(BudgetDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetDisplay::effectiveDt = value;
  }-*/;
}
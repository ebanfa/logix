package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budget.BudgetListItemDisplay;
import com.cloderia.helion.client.local.budget.BudgetListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Budget;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.api.Convert;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.databinding.client.components.ListComponent;
import org.jboss.errai.databinding.client.components.ListContainer;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_b_BudgetListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetListWidget.class, "Type_factory__c_c_h_c_l_b_BudgetListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BudgetListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budget/list-budget-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BudgetListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetListWidget.class);
    handle.addAssignableType(Composite.class);
    handle.addAssignableType(Widget.class);
    handle.addAssignableType(UIObject.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(HasVisibility.class);
    handle.addAssignableType(EventListener.class);
    handle.addAssignableType(HasAttachHandlers.class);
    handle.addAssignableType(HasHandlers.class);
    handle.addAssignableType(IsWidget.class);
    handle.addAssignableType(IsRenderable.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetListWidget createInstance(final ContextManager contextManager) {
    final BudgetListWidget instance = new BudgetListWidget();
    setIncompleteInstance(instance);
    final ListComponent BudgetListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Budget.class, BudgetListItemDisplay.class }, new Annotation[] { new ListContainer() {
        public Class annotationType() {
          return ListContainer.class;
        }
        public String toString() {
          return "@org.jboss.errai.databinding.client.components.ListContainer(value=tbody)";
        }
        public String value() {
          return "tbody";
        }
    } });
    registerDependentScopedReference(instance, BudgetListWidget_entityList);
    BudgetListWidget_ListComponent_entityList(instance, BudgetListWidget_entityList);
    final DataBinder BudgetListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetListWidget_binder);
    BudgetListWidget_DataBinder_binder(instance, BudgetListWidget_binder);
    final TableHeaderWidget BudgetListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BudgetListWidget_tableHeaderWidget);
    BudgetListWidget_TableHeaderWidget_tableHeaderWidget(instance, BudgetListWidget_tableHeaderWidget);
    final HTMLElement BudgetListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=tbody)";
        }
        public String value() {
          return "tbody";
        }
    } });
    registerDependentScopedReference(instance, BudgetListWidget_emptyList);
    BudgetListWidget_HTMLElement_emptyList(instance, BudgetListWidget_emptyList);
    c_c_h_c_l_b_BudgetListWidgetTemplateResource templateForBudgetListWidget = GWT.create(c_c_h_c_l_b_BudgetListWidgetTemplateResource.class);
    Element parentElementForTemplateOfBudgetListWidget = TemplateUtil.getRootTemplateParentElement(templateForBudgetListWidget.getContents().getText(), "com/cloderia/helion/client/local/budget/list-budget-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budget/list-budget-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListWidget", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListWidget", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BudgetListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budget.BudgetListWidget", "com/cloderia/helion/client/local/budget/list-budget-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", BudgetListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(BudgetListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetListWidget), templateFieldsMap.values());
    DataBinder binder = BudgetListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.budget.BudgetListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(BudgetListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BudgetListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HTMLElement BudgetListWidget_HTMLElement_emptyList(BudgetListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::emptyList;
  }-*/;

  native static void BudgetListWidget_HTMLElement_emptyList(BudgetListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::emptyList = value;
  }-*/;

  native static DataBinder BudgetListWidget_DataBinder_binder(BudgetListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::binder;
  }-*/;

  native static void BudgetListWidget_DataBinder_binder(BudgetListWidget instance, DataBinder<List<Budget>> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::binder = value;
  }-*/;

  native static TableHeaderWidget BudgetListWidget_TableHeaderWidget_tableHeaderWidget(BudgetListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::tableHeaderWidget;
  }-*/;

  native static void BudgetListWidget_TableHeaderWidget_tableHeaderWidget(BudgetListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent BudgetListWidget_ListComponent_entityList(BudgetListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::entityList;
  }-*/;

  native static void BudgetListWidget_ListComponent_entityList(BudgetListWidget instance, ListComponent<Budget, BudgetListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budget.BudgetListWidget::entityList = value;
  }-*/;
}
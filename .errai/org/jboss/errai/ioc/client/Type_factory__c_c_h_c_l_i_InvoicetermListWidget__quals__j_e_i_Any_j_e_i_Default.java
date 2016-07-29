package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Invoiceterm;
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

public class Type_factory__c_c_h_c_l_i_InvoicetermListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoicetermListWidget.class, "Type_factory__c_c_h_c_l_i_InvoicetermListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoicetermListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoicetermListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoicetermListWidget.class);
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

  public InvoicetermListWidget createInstance(final ContextManager contextManager) {
    final InvoicetermListWidget instance = new InvoicetermListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget InvoicetermListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermListWidget_tableHeaderWidget);
    InvoicetermListWidget_TableHeaderWidget_tableHeaderWidget(instance, InvoicetermListWidget_tableHeaderWidget);
    final ListComponent InvoicetermListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Invoiceterm.class, InvoicetermListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, InvoicetermListWidget_entityList);
    InvoicetermListWidget_ListComponent_entityList(instance, InvoicetermListWidget_entityList);
    final HTMLElement InvoicetermListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, InvoicetermListWidget_emptyList);
    InvoicetermListWidget_HTMLElement_emptyList(instance, InvoicetermListWidget_emptyList);
    final DataBinder InvoicetermListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicetermListWidget_binder);
    InvoicetermListWidget_DataBinder_binder(instance, InvoicetermListWidget_binder);
    c_c_h_c_l_i_InvoicetermListWidgetTemplateResource templateForInvoicetermListWidget = GWT.create(c_c_h_c_l_i_InvoicetermListWidgetTemplateResource.class);
    Element parentElementForTemplateOfInvoicetermListWidget = TemplateUtil.getRootTemplateParentElement(templateForInvoicetermListWidget.getContents().getText(), "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoicetermListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", InvoicetermListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(InvoicetermListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermListWidget), templateFieldsMap.values());
    DataBinder binder = InvoicetermListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(InvoicetermListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoicetermListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoicetermListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoicetermListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListComponent InvoicetermListWidget_ListComponent_entityList(InvoicetermListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::entityList;
  }-*/;

  native static void InvoicetermListWidget_ListComponent_entityList(InvoicetermListWidget instance, ListComponent<Invoiceterm, InvoicetermListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::entityList = value;
  }-*/;

  native static TableHeaderWidget InvoicetermListWidget_TableHeaderWidget_tableHeaderWidget(InvoicetermListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::tableHeaderWidget;
  }-*/;

  native static void InvoicetermListWidget_TableHeaderWidget_tableHeaderWidget(InvoicetermListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::tableHeaderWidget = value;
  }-*/;

  native static DataBinder InvoicetermListWidget_DataBinder_binder(InvoicetermListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::binder;
  }-*/;

  native static void InvoicetermListWidget_DataBinder_binder(InvoicetermListWidget instance, DataBinder<List<Invoiceterm>> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::binder = value;
  }-*/;

  native static HTMLElement InvoicetermListWidget_HTMLElement_emptyList(InvoicetermListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::emptyList;
  }-*/;

  native static void InvoicetermListWidget_HTMLElement_emptyList(InvoicetermListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget::emptyList = value;
  }-*/;
}
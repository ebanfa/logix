package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay;
import com.cloderia.helion.client.local.invoice.InvoiceListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Invoice;
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

public class Type_factory__c_c_h_c_l_i_InvoiceListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceListWidget.class, "Type_factory__c_c_h_c_l_i_InvoiceListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoice/list-invoice-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceListWidget.class);
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

  public InvoiceListWidget createInstance(final ContextManager contextManager) {
    final InvoiceListWidget instance = new InvoiceListWidget();
    setIncompleteInstance(instance);
    final DataBinder InvoiceListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceListWidget_binder);
    InvoiceListWidget_DataBinder_binder(instance, InvoiceListWidget_binder);
    final TableHeaderWidget InvoiceListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceListWidget_tableHeaderWidget);
    InvoiceListWidget_TableHeaderWidget_tableHeaderWidget(instance, InvoiceListWidget_tableHeaderWidget);
    final ListComponent InvoiceListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Invoice.class, InvoiceListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, InvoiceListWidget_entityList);
    InvoiceListWidget_ListComponent_entityList(instance, InvoiceListWidget_entityList);
    final HTMLElement InvoiceListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, InvoiceListWidget_emptyList);
    InvoiceListWidget_HTMLElement_emptyList(instance, InvoiceListWidget_emptyList);
    c_c_h_c_l_i_InvoiceListWidgetTemplateResource templateForInvoiceListWidget = GWT.create(c_c_h_c_l_i_InvoiceListWidgetTemplateResource.class);
    Element parentElementForTemplateOfInvoiceListWidget = TemplateUtil.getRootTemplateParentElement(templateForInvoiceListWidget.getContents().getText(), "com/cloderia/helion/client/local/invoice/list-invoice-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoice/list-invoice-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListWidget", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListWidget", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListWidget", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", InvoiceListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(InvoiceListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceListWidget), templateFieldsMap.values());
    DataBinder binder = InvoiceListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoice.InvoiceListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(InvoiceListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder InvoiceListWidget_DataBinder_binder(InvoiceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::binder;
  }-*/;

  native static void InvoiceListWidget_DataBinder_binder(InvoiceListWidget instance, DataBinder<List<Invoice>> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::binder = value;
  }-*/;

  native static ListComponent InvoiceListWidget_ListComponent_entityList(InvoiceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::entityList;
  }-*/;

  native static void InvoiceListWidget_ListComponent_entityList(InvoiceListWidget instance, ListComponent<Invoice, InvoiceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::entityList = value;
  }-*/;

  native static TableHeaderWidget InvoiceListWidget_TableHeaderWidget_tableHeaderWidget(InvoiceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::tableHeaderWidget;
  }-*/;

  native static void InvoiceListWidget_TableHeaderWidget_tableHeaderWidget(InvoiceListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::tableHeaderWidget = value;
  }-*/;

  native static HTMLElement InvoiceListWidget_HTMLElement_emptyList(InvoiceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::emptyList;
  }-*/;

  native static void InvoiceListWidget_HTMLElement_emptyList(InvoiceListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListWidget::emptyList = value;
  }-*/;
}
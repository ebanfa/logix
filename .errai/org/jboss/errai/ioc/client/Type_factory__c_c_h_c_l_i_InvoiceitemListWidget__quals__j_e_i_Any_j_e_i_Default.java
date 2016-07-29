package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Invoiceitem;
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

public class Type_factory__c_c_h_c_l_i_InvoiceitemListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceitemListWidget.class, "Type_factory__c_c_h_c_l_i_InvoiceitemListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceitemListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceitemListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceitemListWidget.class);
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

  public InvoiceitemListWidget createInstance(final ContextManager contextManager) {
    final InvoiceitemListWidget instance = new InvoiceitemListWidget();
    setIncompleteInstance(instance);
    final HTMLElement InvoiceitemListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, InvoiceitemListWidget_emptyList);
    InvoiceitemListWidget_HTMLElement_emptyList(instance, InvoiceitemListWidget_emptyList);
    final ListComponent InvoiceitemListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Invoiceitem.class, InvoiceitemListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, InvoiceitemListWidget_entityList);
    InvoiceitemListWidget_ListComponent_entityList(instance, InvoiceitemListWidget_entityList);
    final DataBinder InvoiceitemListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceitemListWidget_binder);
    InvoiceitemListWidget_DataBinder_binder(instance, InvoiceitemListWidget_binder);
    final TableHeaderWidget InvoiceitemListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemListWidget_tableHeaderWidget);
    InvoiceitemListWidget_TableHeaderWidget_tableHeaderWidget(instance, InvoiceitemListWidget_tableHeaderWidget);
    c_c_h_c_l_i_InvoiceitemListWidgetTemplateResource templateForInvoiceitemListWidget = GWT.create(c_c_h_c_l_i_InvoiceitemListWidgetTemplateResource.class);
    Element parentElementForTemplateOfInvoiceitemListWidget = TemplateUtil.getRootTemplateParentElement(templateForInvoiceitemListWidget.getContents().getText(), "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceitemListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", InvoiceitemListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(InvoiceitemListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemListWidget), templateFieldsMap.values());
    DataBinder binder = InvoiceitemListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(InvoiceitemListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceitemListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceitemListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceitemListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListComponent InvoiceitemListWidget_ListComponent_entityList(InvoiceitemListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::entityList;
  }-*/;

  native static void InvoiceitemListWidget_ListComponent_entityList(InvoiceitemListWidget instance, ListComponent<Invoiceitem, InvoiceitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::entityList = value;
  }-*/;

  native static TableHeaderWidget InvoiceitemListWidget_TableHeaderWidget_tableHeaderWidget(InvoiceitemListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::tableHeaderWidget;
  }-*/;

  native static void InvoiceitemListWidget_TableHeaderWidget_tableHeaderWidget(InvoiceitemListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::tableHeaderWidget = value;
  }-*/;

  native static DataBinder InvoiceitemListWidget_DataBinder_binder(InvoiceitemListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::binder;
  }-*/;

  native static void InvoiceitemListWidget_DataBinder_binder(InvoiceitemListWidget instance, DataBinder<List<Invoiceitem>> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::binder = value;
  }-*/;

  native static HTMLElement InvoiceitemListWidget_HTMLElement_emptyList(InvoiceitemListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::emptyList;
  }-*/;

  native static void InvoiceitemListWidget_HTMLElement_emptyList(InvoiceitemListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget::emptyList = value;
  }-*/;
}
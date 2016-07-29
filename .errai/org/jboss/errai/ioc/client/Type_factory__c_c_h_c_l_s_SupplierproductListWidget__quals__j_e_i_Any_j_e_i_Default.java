package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Supplierproduct;
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

public class Type_factory__c_c_h_c_l_s_SupplierproductListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SupplierproductListWidget.class, "Type_factory__c_c_h_c_l_s_SupplierproductListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SupplierproductListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SupplierproductListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SupplierproductListWidget.class);
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

  public SupplierproductListWidget createInstance(final ContextManager contextManager) {
    final SupplierproductListWidget instance = new SupplierproductListWidget();
    setIncompleteInstance(instance);
    final DataBinder SupplierproductListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SupplierproductListWidget_binder);
    SupplierproductListWidget_DataBinder_binder(instance, SupplierproductListWidget_binder);
    final HTMLElement SupplierproductListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, SupplierproductListWidget_emptyList);
    SupplierproductListWidget_HTMLElement_emptyList(instance, SupplierproductListWidget_emptyList);
    final ListComponent SupplierproductListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Supplierproduct.class, SupplierproductListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, SupplierproductListWidget_entityList);
    SupplierproductListWidget_ListComponent_entityList(instance, SupplierproductListWidget_entityList);
    final TableHeaderWidget SupplierproductListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductListWidget_tableHeaderWidget);
    SupplierproductListWidget_TableHeaderWidget_tableHeaderWidget(instance, SupplierproductListWidget_tableHeaderWidget);
    c_c_h_c_l_s_SupplierproductListWidgetTemplateResource templateForSupplierproductListWidget = GWT.create(c_c_h_c_l_s_SupplierproductListWidgetTemplateResource.class);
    Element parentElementForTemplateOfSupplierproductListWidget = TemplateUtil.getRootTemplateParentElement(templateForSupplierproductListWidget.getContents().getText(), "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SupplierproductListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", SupplierproductListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(SupplierproductListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductListWidget), templateFieldsMap.values());
    DataBinder binder = SupplierproductListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(SupplierproductListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SupplierproductListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final SupplierproductListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SupplierproductListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HTMLElement SupplierproductListWidget_HTMLElement_emptyList(SupplierproductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::emptyList;
  }-*/;

  native static void SupplierproductListWidget_HTMLElement_emptyList(SupplierproductListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::emptyList = value;
  }-*/;

  native static ListComponent SupplierproductListWidget_ListComponent_entityList(SupplierproductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::entityList;
  }-*/;

  native static void SupplierproductListWidget_ListComponent_entityList(SupplierproductListWidget instance, ListComponent<Supplierproduct, SupplierproductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::entityList = value;
  }-*/;

  native static TableHeaderWidget SupplierproductListWidget_TableHeaderWidget_tableHeaderWidget(SupplierproductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::tableHeaderWidget;
  }-*/;

  native static void SupplierproductListWidget_TableHeaderWidget_tableHeaderWidget(SupplierproductListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::tableHeaderWidget = value;
  }-*/;

  native static DataBinder SupplierproductListWidget_DataBinder_binder(SupplierproductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::binder;
  }-*/;

  native static void SupplierproductListWidget_DataBinder_binder(SupplierproductListWidget instance, DataBinder<List<Supplierproduct>> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget::binder = value;
  }-*/;
}
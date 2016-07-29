package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.product.ProductListItemDisplay;
import com.cloderia.helion.client.local.product.ProductListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Product;
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

public class Type_factory__c_c_h_c_l_p_ProductListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductListWidget.class, "Type_factory__c_c_h_c_l_p_ProductListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/product/list-product-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductListWidget.class);
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

  public ProductListWidget createInstance(final ContextManager contextManager) {
    final ProductListWidget instance = new ProductListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget ProductListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductListWidget_tableHeaderWidget);
    ProductListWidget_TableHeaderWidget_tableHeaderWidget(instance, ProductListWidget_tableHeaderWidget);
    final ListComponent ProductListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Product.class, ProductListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, ProductListWidget_entityList);
    ProductListWidget_ListComponent_entityList(instance, ProductListWidget_entityList);
    final DataBinder ProductListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductListWidget_binder);
    ProductListWidget_DataBinder_binder(instance, ProductListWidget_binder);
    final HTMLElement ProductListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, ProductListWidget_emptyList);
    ProductListWidget_HTMLElement_emptyList(instance, ProductListWidget_emptyList);
    c_c_h_c_l_p_ProductListWidgetTemplateResource templateForProductListWidget = GWT.create(c_c_h_c_l_p_ProductListWidgetTemplateResource.class);
    Element parentElementForTemplateOfProductListWidget = TemplateUtil.getRootTemplateParentElement(templateForProductListWidget.getContents().getText(), "com/cloderia/helion/client/local/product/list-product-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/product/list-product-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListWidget", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListWidget", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListWidget", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", ProductListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(ProductListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductListWidget), templateFieldsMap.values());
    DataBinder binder = ProductListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.product.ProductListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProductListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder ProductListWidget_DataBinder_binder(ProductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListWidget::binder;
  }-*/;

  native static void ProductListWidget_DataBinder_binder(ProductListWidget instance, DataBinder<List<Product>> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListWidget::binder = value;
  }-*/;

  native static TableHeaderWidget ProductListWidget_TableHeaderWidget_tableHeaderWidget(ProductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListWidget::tableHeaderWidget;
  }-*/;

  native static void ProductListWidget_TableHeaderWidget_tableHeaderWidget(ProductListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListWidget::tableHeaderWidget = value;
  }-*/;

  native static HTMLElement ProductListWidget_HTMLElement_emptyList(ProductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListWidget::emptyList;
  }-*/;

  native static void ProductListWidget_HTMLElement_emptyList(ProductListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListWidget::emptyList = value;
  }-*/;

  native static ListComponent ProductListWidget_ListComponent_entityList(ProductListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListWidget::entityList;
  }-*/;

  native static void ProductListWidget_ListComponent_entityList(ProductListWidget instance, ListComponent<Product, ProductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListWidget::entityList = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay;
import com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Productfeature;
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

public class Type_factory__c_c_h_c_l_p_ProductfeatureListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeatureListWidget.class, "Type_factory__c_c_h_c_l_p_ProductfeatureListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeatureListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeature/list-productfeature-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeatureListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeatureListWidget.class);
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

  public ProductfeatureListWidget createInstance(final ContextManager contextManager) {
    final ProductfeatureListWidget instance = new ProductfeatureListWidget();
    setIncompleteInstance(instance);
    final DataBinder ProductfeatureListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeatureListWidget_binder);
    ProductfeatureListWidget_DataBinder_binder(instance, ProductfeatureListWidget_binder);
    final HTMLElement ProductfeatureListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, ProductfeatureListWidget_emptyList);
    ProductfeatureListWidget_HTMLElement_emptyList(instance, ProductfeatureListWidget_emptyList);
    final TableHeaderWidget ProductfeatureListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureListWidget_tableHeaderWidget);
    ProductfeatureListWidget_TableHeaderWidget_tableHeaderWidget(instance, ProductfeatureListWidget_tableHeaderWidget);
    final ListComponent ProductfeatureListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Productfeature.class, ProductfeatureListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, ProductfeatureListWidget_entityList);
    ProductfeatureListWidget_ListComponent_entityList(instance, ProductfeatureListWidget_entityList);
    c_c_h_c_l_p_ProductfeatureListWidgetTemplateResource templateForProductfeatureListWidget = GWT.create(c_c_h_c_l_p_ProductfeatureListWidgetTemplateResource.class);
    Element parentElementForTemplateOfProductfeatureListWidget = TemplateUtil.getRootTemplateParentElement(templateForProductfeatureListWidget.getContents().getText(), "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeatureListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", ProductfeatureListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(ProductfeatureListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureListWidget), templateFieldsMap.values());
    DataBinder binder = ProductfeatureListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProductfeatureListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeatureListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeatureListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeatureListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget ProductfeatureListWidget_TableHeaderWidget_tableHeaderWidget(ProductfeatureListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::tableHeaderWidget;
  }-*/;

  native static void ProductfeatureListWidget_TableHeaderWidget_tableHeaderWidget(ProductfeatureListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent ProductfeatureListWidget_ListComponent_entityList(ProductfeatureListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::entityList;
  }-*/;

  native static void ProductfeatureListWidget_ListComponent_entityList(ProductfeatureListWidget instance, ListComponent<Productfeature, ProductfeatureListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::entityList = value;
  }-*/;

  native static DataBinder ProductfeatureListWidget_DataBinder_binder(ProductfeatureListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::binder;
  }-*/;

  native static void ProductfeatureListWidget_DataBinder_binder(ProductfeatureListWidget instance, DataBinder<List<Productfeature>> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::binder = value;
  }-*/;

  native static HTMLElement ProductfeatureListWidget_HTMLElement_emptyList(ProductfeatureListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::emptyList;
  }-*/;

  native static void ProductfeatureListWidget_HTMLElement_emptyList(ProductfeatureListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget::emptyList = value;
  }-*/;
}
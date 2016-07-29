package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay;
import com.cloderia.helion.client.local.producttype.ProducttypeListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Producttype;
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

public class Type_factory__c_c_h_c_l_p_ProducttypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProducttypeListWidget.class, "Type_factory__c_c_h_c_l_p_ProducttypeListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProducttypeListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/producttype/list-producttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProducttypeListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProducttypeListWidget.class);
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

  public ProducttypeListWidget createInstance(final ContextManager contextManager) {
    final ProducttypeListWidget instance = new ProducttypeListWidget();
    setIncompleteInstance(instance);
    final DataBinder ProducttypeListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProducttypeListWidget_binder);
    ProducttypeListWidget_DataBinder_binder(instance, ProducttypeListWidget_binder);
    final ListComponent ProducttypeListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Producttype.class, ProducttypeListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, ProducttypeListWidget_entityList);
    ProducttypeListWidget_ListComponent_entityList(instance, ProducttypeListWidget_entityList);
    final HTMLElement ProducttypeListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, ProducttypeListWidget_emptyList);
    ProducttypeListWidget_HTMLElement_emptyList(instance, ProducttypeListWidget_emptyList);
    final TableHeaderWidget ProducttypeListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProducttypeListWidget_tableHeaderWidget);
    ProducttypeListWidget_TableHeaderWidget_tableHeaderWidget(instance, ProducttypeListWidget_tableHeaderWidget);
    c_c_h_c_l_p_ProducttypeListWidgetTemplateResource templateForProducttypeListWidget = GWT.create(c_c_h_c_l_p_ProducttypeListWidgetTemplateResource.class);
    Element parentElementForTemplateOfProducttypeListWidget = TemplateUtil.getRootTemplateParentElement(templateForProducttypeListWidget.getContents().getText(), "com/cloderia/helion/client/local/producttype/list-producttype-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/producttype/list-producttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListWidget", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListWidget", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProducttypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListWidget", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProducttypeListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", ProducttypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(ProducttypeListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeListWidget), templateFieldsMap.values());
    DataBinder binder = ProducttypeListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.producttype.ProducttypeListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProducttypeListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProducttypeListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProducttypeListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProducttypeListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget ProducttypeListWidget_TableHeaderWidget_tableHeaderWidget(ProducttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::tableHeaderWidget;
  }-*/;

  native static void ProducttypeListWidget_TableHeaderWidget_tableHeaderWidget(ProducttypeListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent ProducttypeListWidget_ListComponent_entityList(ProducttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::entityList;
  }-*/;

  native static void ProducttypeListWidget_ListComponent_entityList(ProducttypeListWidget instance, ListComponent<Producttype, ProducttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::entityList = value;
  }-*/;

  native static DataBinder ProducttypeListWidget_DataBinder_binder(ProducttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::binder;
  }-*/;

  native static void ProducttypeListWidget_DataBinder_binder(ProducttypeListWidget instance, DataBinder<List<Producttype>> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::binder = value;
  }-*/;

  native static HTMLElement ProducttypeListWidget_HTMLElement_emptyList(ProducttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::emptyList;
  }-*/;

  native static void ProducttypeListWidget_HTMLElement_emptyList(ProducttypeListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListWidget::emptyList = value;
  }-*/;
}
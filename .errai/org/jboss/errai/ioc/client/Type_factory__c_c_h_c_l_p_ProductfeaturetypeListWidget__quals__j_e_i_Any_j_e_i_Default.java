package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Productfeaturetype;
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

public class Type_factory__c_c_h_c_l_p_ProductfeaturetypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeaturetypeListWidget.class, "Type_factory__c_c_h_c_l_p_ProductfeaturetypeListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeaturetypeListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeaturetypeListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeaturetypeListWidget.class);
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

  public ProductfeaturetypeListWidget createInstance(final ContextManager contextManager) {
    final ProductfeaturetypeListWidget instance = new ProductfeaturetypeListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget ProductfeaturetypeListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeaturetypeListWidget_tableHeaderWidget);
    ProductfeaturetypeListWidget_TableHeaderWidget_tableHeaderWidget(instance, ProductfeaturetypeListWidget_tableHeaderWidget);
    final DataBinder ProductfeaturetypeListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturetypeListWidget_binder);
    ProductfeaturetypeListWidget_DataBinder_binder(instance, ProductfeaturetypeListWidget_binder);
    final HTMLElement ProductfeaturetypeListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, ProductfeaturetypeListWidget_emptyList);
    ProductfeaturetypeListWidget_HTMLElement_emptyList(instance, ProductfeaturetypeListWidget_emptyList);
    final ListComponent ProductfeaturetypeListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Productfeaturetype.class, ProductfeaturetypeListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, ProductfeaturetypeListWidget_entityList);
    ProductfeaturetypeListWidget_ListComponent_entityList(instance, ProductfeaturetypeListWidget_entityList);
    c_c_h_c_l_p_ProductfeaturetypeListWidgetTemplateResource templateForProductfeaturetypeListWidget = GWT.create(c_c_h_c_l_p_ProductfeaturetypeListWidgetTemplateResource.class);
    Element parentElementForTemplateOfProductfeaturetypeListWidget = TemplateUtil.getRootTemplateParentElement(templateForProductfeaturetypeListWidget.getContents().getText(), "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeaturetypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeaturetypeListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", ProductfeaturetypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(ProductfeaturetypeListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeListWidget), templateFieldsMap.values());
    DataBinder binder = ProductfeaturetypeListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProductfeaturetypeListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeaturetypeListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeaturetypeListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeaturetypeListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListComponent ProductfeaturetypeListWidget_ListComponent_entityList(ProductfeaturetypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::entityList;
  }-*/;

  native static void ProductfeaturetypeListWidget_ListComponent_entityList(ProductfeaturetypeListWidget instance, ListComponent<Productfeaturetype, ProductfeaturetypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::entityList = value;
  }-*/;

  native static TableHeaderWidget ProductfeaturetypeListWidget_TableHeaderWidget_tableHeaderWidget(ProductfeaturetypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::tableHeaderWidget;
  }-*/;

  native static void ProductfeaturetypeListWidget_TableHeaderWidget_tableHeaderWidget(ProductfeaturetypeListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::tableHeaderWidget = value;
  }-*/;

  native static HTMLElement ProductfeaturetypeListWidget_HTMLElement_emptyList(ProductfeaturetypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::emptyList;
  }-*/;

  native static void ProductfeaturetypeListWidget_HTMLElement_emptyList(ProductfeaturetypeListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::emptyList = value;
  }-*/;

  native static DataBinder ProductfeaturetypeListWidget_DataBinder_binder(ProductfeaturetypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::binder;
  }-*/;

  native static void ProductfeaturetypeListWidget_DataBinder_binder(ProductfeaturetypeListWidget instance, DataBinder<List<Productfeaturetype>> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget::binder = value;
  }-*/;
}
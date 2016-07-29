package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Productfeaturetype;
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
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.dom.TableRow;
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
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_p_ProductfeaturetypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeaturetypeListItemDisplay.class, "Type_factory__c_c_h_c_l_p_ProductfeaturetypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeaturetypeListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeaturetypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeaturetypeListItemDisplay.class);
    handle.addAssignableType(ProductfeaturetypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeaturetypeListItemDisplay createInstance(final ContextManager contextManager) {
    final ProductfeaturetypeListItemDisplay instance = new ProductfeaturetypeListItemDisplay();
    setIncompleteInstance(instance);
    final Event ProductfeaturetypeListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeaturetypeListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_renderSingleViewEvent);
    ProductfeaturetypeListItemDisplay_Event_renderSingleViewEvent(instance, ProductfeaturetypeListItemDisplay_renderSingleViewEvent);
    final AnchorElement ProductfeaturetypeListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_editEntityListItemBtn);
    ProductfeaturetypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance, ProductfeaturetypeListItemDisplay_editEntityListItemBtn);
    final Event ProductfeaturetypeListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeaturetypeListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_deleteEntityEvent);
    ProductfeaturetypeListItemDisplay_Event_deleteEntityEvent(instance, ProductfeaturetypeListItemDisplay_deleteEntityEvent);
    final Event ProductfeaturetypeListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeaturetypeListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_renderEditViewEvent);
    ProductfeaturetypeListItemDisplay_Event_renderEditViewEvent(instance, ProductfeaturetypeListItemDisplay_renderEditViewEvent);
    final TableCell ProductfeaturetypeListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_description);
    ProductfeaturetypeListItemDisplay_TableCell_description(instance, ProductfeaturetypeListItemDisplay_description);
    final TableCell ProductfeaturetypeListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_name);
    ProductfeaturetypeListItemDisplay_TableCell_name(instance, ProductfeaturetypeListItemDisplay_name);
    final TableCell ProductfeaturetypeListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_entityCode);
    ProductfeaturetypeListItemDisplay_TableCell_entityCode(instance, ProductfeaturetypeListItemDisplay_entityCode);
    final DataBinder ProductfeaturetypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeaturetype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturetypePresenter_binder);
    ProductfeaturetypePresenter_DataBinder_binder(instance, ProductfeaturetypePresenter_binder);
    final AnchorElement ProductfeaturetypeListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_deleteEntityListItemBtn);
    ProductfeaturetypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, ProductfeaturetypeListItemDisplay_deleteEntityListItemBtn);
    final TableCell ProductfeaturetypeListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_effectiveDt);
    ProductfeaturetypeListItemDisplay_TableCell_effectiveDt(instance, ProductfeaturetypeListItemDisplay_effectiveDt);
    final TableRow ProductfeaturetypeListItemDisplay_productfeaturetypeItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeListItemDisplay_productfeaturetypeItem);
    ProductfeaturetypeListItemDisplay_TableRow_productfeaturetypeItem(instance, ProductfeaturetypeListItemDisplay_productfeaturetypeItem);
    c_c_h_c_l_p_ProductfeaturetypeListItemDisplayTemplateResource templateForProductfeaturetypeListItemDisplay = GWT.create(c_c_h_c_l_p_ProductfeaturetypeListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductfeaturetypeListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductfeaturetypeListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", "productfeaturetypeItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableRow_productfeaturetypeItem(instance)));
      }
    }, dataFieldElements, "productfeaturetypeItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeaturetypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com/cloderia/helion/client/local/productfeaturetype/list-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeaturetypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("productfeaturetypeItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableRow_productfeaturetypeItem(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(ProductfeaturetypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(ProductfeaturetypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeListItemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderEditView(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderDeleteView(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductfeaturetypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeaturetypeListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeaturetypeListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeaturetypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeaturetypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeaturetypeListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement ProductfeaturetypeListItemDisplay_AnchorElement_editEntityListItemBtn(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_AnchorElement_editEntityListItemBtn(ProductfeaturetypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static AnchorElement ProductfeaturetypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductfeaturetypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell ProductfeaturetypeListItemDisplay_TableCell_description(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::description;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_TableCell_description(ProductfeaturetypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::description = value;
  }-*/;

  native static TableCell ProductfeaturetypeListItemDisplay_TableCell_entityCode(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::entityCode;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_TableCell_entityCode(ProductfeaturetypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::entityCode = value;
  }-*/;

  native static TableRow ProductfeaturetypeListItemDisplay_TableRow_productfeaturetypeItem(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::productfeaturetypeItem;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_TableRow_productfeaturetypeItem(ProductfeaturetypeListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::productfeaturetypeItem = value;
  }-*/;

  native static TableCell ProductfeaturetypeListItemDisplay_TableCell_name(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::name;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_TableCell_name(ProductfeaturetypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::name = value;
  }-*/;

  native static TableCell ProductfeaturetypeListItemDisplay_TableCell_effectiveDt(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::effectiveDt;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_TableCell_effectiveDt(ProductfeaturetypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::effectiveDt = value;
  }-*/;

  native static Event ProductfeaturetypeListItemDisplay_Event_renderEditViewEvent(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_Event_renderEditViewEvent(ProductfeaturetypeListItemDisplay instance, Event<ProductfeaturetypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static DataBinder ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder;
  }-*/;

  native static void ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance, DataBinder<Productfeaturetype> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder = value;
  }-*/;

  native static Event ProductfeaturetypeListItemDisplay_Event_renderSingleViewEvent(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_Event_renderSingleViewEvent(ProductfeaturetypeListItemDisplay instance, Event<ProductfeaturetypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static Event ProductfeaturetypeListItemDisplay_Event_deleteEntityEvent(ProductfeaturetypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductfeaturetypeListItemDisplay_Event_deleteEntityEvent(ProductfeaturetypeListItemDisplay instance, Event<ProductfeaturetypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay::deleteEntityEvent = value;
  }-*/;
}
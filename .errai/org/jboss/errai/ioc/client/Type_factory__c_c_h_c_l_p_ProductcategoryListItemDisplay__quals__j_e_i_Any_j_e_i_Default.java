package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay;
import com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Productcategory;
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

public class Type_factory__c_c_h_c_l_p_ProductcategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductcategoryListItemDisplay.class, "Type_factory__c_c_h_c_l_p_ProductcategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductcategoryListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productcategory/list-productcategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductcategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductcategoryListItemDisplay.class);
    handle.addAssignableType(ProductcategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductcategoryListItemDisplay createInstance(final ContextManager contextManager) {
    final ProductcategoryListItemDisplay instance = new ProductcategoryListItemDisplay();
    setIncompleteInstance(instance);
    final AnchorElement ProductcategoryListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_editEntityListItemBtn);
    ProductcategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance, ProductcategoryListItemDisplay_editEntityListItemBtn);
    final TableCell ProductcategoryListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_effectiveDt);
    ProductcategoryListItemDisplay_TableCell_effectiveDt(instance, ProductcategoryListItemDisplay_effectiveDt);
    final AnchorElement ProductcategoryListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_deleteEntityListItemBtn);
    ProductcategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, ProductcategoryListItemDisplay_deleteEntityListItemBtn);
    final TableRow ProductcategoryListItemDisplay_productcategoryItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_productcategoryItem);
    ProductcategoryListItemDisplay_TableRow_productcategoryItem(instance, ProductcategoryListItemDisplay_productcategoryItem);
    final Event ProductcategoryListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductcategoryListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_renderSingleViewEvent);
    ProductcategoryListItemDisplay_Event_renderSingleViewEvent(instance, ProductcategoryListItemDisplay_renderSingleViewEvent);
    final TableCell ProductcategoryListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_description);
    ProductcategoryListItemDisplay_TableCell_description(instance, ProductcategoryListItemDisplay_description);
    final Event ProductcategoryListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductcategoryListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_renderEditViewEvent);
    ProductcategoryListItemDisplay_Event_renderEditViewEvent(instance, ProductcategoryListItemDisplay_renderEditViewEvent);
    final TableCell ProductcategoryListItemDisplay_prodCatTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_prodCatTy);
    ProductcategoryListItemDisplay_TableCell_prodCatTy(instance, ProductcategoryListItemDisplay_prodCatTy);
    final TableCell ProductcategoryListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_entityCode);
    ProductcategoryListItemDisplay_TableCell_entityCode(instance, ProductcategoryListItemDisplay_entityCode);
    final DataBinder ProductcategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productcategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductcategoryPresenter_binder);
    ProductcategoryPresenter_DataBinder_binder(instance, ProductcategoryPresenter_binder);
    final TableCell ProductcategoryListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_name);
    ProductcategoryListItemDisplay_TableCell_name(instance, ProductcategoryListItemDisplay_name);
    final Event ProductcategoryListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductcategoryListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductcategoryListItemDisplay_deleteEntityEvent);
    ProductcategoryListItemDisplay_Event_deleteEntityEvent(instance, ProductcategoryListItemDisplay_deleteEntityEvent);
    c_c_h_c_l_p_ProductcategoryListItemDisplayTemplateResource templateForProductcategoryListItemDisplay = GWT.create(c_c_h_c_l_p_ProductcategoryListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductcategoryListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductcategoryListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", "productcategoryItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableRow_productcategoryItem(instance)));
      }
    }, dataFieldElements, "productcategoryItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_prodCatTy(instance)));
      }
    }, dataFieldElements, "prodCatTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductcategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com/cloderia/helion/client/local/productcategory/list-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductcategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("productcategoryItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableRow_productcategoryItem(instance))));
    templateFieldsMap.put("prodCatTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_prodCatTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(ProductcategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(ProductcategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = ProductcategoryPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryListItemDisplay_TableCell_prodCatTy(instance))), "prodCatTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductcategoryListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductcategoryListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductcategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductcategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductcategoryListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell ProductcategoryListItemDisplay_TableCell_effectiveDt(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::effectiveDt;
  }-*/;

  native static void ProductcategoryListItemDisplay_TableCell_effectiveDt(ProductcategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::effectiveDt = value;
  }-*/;

  native static Event ProductcategoryListItemDisplay_Event_renderSingleViewEvent(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void ProductcategoryListItemDisplay_Event_renderSingleViewEvent(ProductcategoryListItemDisplay instance, Event<ProductcategoryListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell ProductcategoryListItemDisplay_TableCell_entityCode(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::entityCode;
  }-*/;

  native static void ProductcategoryListItemDisplay_TableCell_entityCode(ProductcategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell ProductcategoryListItemDisplay_TableCell_name(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::name;
  }-*/;

  native static void ProductcategoryListItemDisplay_TableCell_name(ProductcategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::name = value;
  }-*/;

  native static TableCell ProductcategoryListItemDisplay_TableCell_description(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::description;
  }-*/;

  native static void ProductcategoryListItemDisplay_TableCell_description(ProductcategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::description = value;
  }-*/;

  native static Event ProductcategoryListItemDisplay_Event_renderEditViewEvent(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductcategoryListItemDisplay_Event_renderEditViewEvent(ProductcategoryListItemDisplay instance, Event<ProductcategoryListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement ProductcategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void ProductcategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductcategoryListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static DataBinder ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder;
  }-*/;

  native static void ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance, DataBinder<Productcategory> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder = value;
  }-*/;

  native static AnchorElement ProductcategoryListItemDisplay_AnchorElement_editEntityListItemBtn(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void ProductcategoryListItemDisplay_AnchorElement_editEntityListItemBtn(ProductcategoryListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event ProductcategoryListItemDisplay_Event_deleteEntityEvent(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductcategoryListItemDisplay_Event_deleteEntityEvent(ProductcategoryListItemDisplay instance, Event<ProductcategoryListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableRow ProductcategoryListItemDisplay_TableRow_productcategoryItem(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::productcategoryItem;
  }-*/;

  native static void ProductcategoryListItemDisplay_TableRow_productcategoryItem(ProductcategoryListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::productcategoryItem = value;
  }-*/;

  native static TableCell ProductcategoryListItemDisplay_TableCell_prodCatTy(ProductcategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::prodCatTy;
  }-*/;

  native static void ProductcategoryListItemDisplay_TableCell_prodCatTy(ProductcategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay::prodCatTy = value;
  }-*/;
}
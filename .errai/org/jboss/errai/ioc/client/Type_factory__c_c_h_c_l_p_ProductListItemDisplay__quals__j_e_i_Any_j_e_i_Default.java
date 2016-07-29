package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.product.ProductListItemDisplay;
import com.cloderia.helion.client.local.product.ProductPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Product;
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

public class Type_factory__c_c_h_c_l_p_ProductListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductListItemDisplay.class, "Type_factory__c_c_h_c_l_p_ProductListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/product/list-product-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductListItemDisplay.class);
    handle.addAssignableType(ProductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductListItemDisplay createInstance(final ContextManager contextManager) {
    final ProductListItemDisplay instance = new ProductListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell ProductListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_entityCode);
    ProductListItemDisplay_TableCell_entityCode(instance, ProductListItemDisplay_entityCode);
    final TableCell ProductListItemDisplay_introductionDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_introductionDt);
    ProductListItemDisplay_TableCell_introductionDt(instance, ProductListItemDisplay_introductionDt);
    final TableCell ProductListItemDisplay_salesDiscDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_salesDiscDt);
    ProductListItemDisplay_TableCell_salesDiscDt(instance, ProductListItemDisplay_salesDiscDt);
    final TableCell ProductListItemDisplay_manufacturer = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_manufacturer);
    ProductListItemDisplay_TableCell_manufacturer(instance, ProductListItemDisplay_manufacturer);
    final Event ProductListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductListItemDisplay_deleteEntityEvent);
    ProductListItemDisplay_Event_deleteEntityEvent(instance, ProductListItemDisplay_deleteEntityEvent);
    final DataBinder ProductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Product.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductPresenter_binder);
    ProductPresenter_DataBinder_binder(instance, ProductPresenter_binder);
    final TableCell ProductListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_name);
    ProductListItemDisplay_TableCell_name(instance, ProductListItemDisplay_name);
    final TableCell ProductListItemDisplay_supportDiscDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_supportDiscDt);
    ProductListItemDisplay_TableCell_supportDiscDt(instance, ProductListItemDisplay_supportDiscDt);
    final Event ProductListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, ProductListItemDisplay_renderSingleViewEvent);
    ProductListItemDisplay_Event_renderSingleViewEvent(instance, ProductListItemDisplay_renderSingleViewEvent);
    final AnchorElement ProductListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_editEntityListItemBtn);
    ProductListItemDisplay_AnchorElement_editEntityListItemBtn(instance, ProductListItemDisplay_editEntityListItemBtn);
    final Event ProductListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductListItemDisplay_renderEditViewEvent);
    ProductListItemDisplay_Event_renderEditViewEvent(instance, ProductListItemDisplay_renderEditViewEvent);
    final TableCell ProductListItemDisplay_uom = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_uom);
    ProductListItemDisplay_TableCell_uom(instance, ProductListItemDisplay_uom);
    final TableCell ProductListItemDisplay_remarks = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_remarks);
    ProductListItemDisplay_TableCell_remarks(instance, ProductListItemDisplay_remarks);
    final TableRow ProductListItemDisplay_productItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_productItem);
    ProductListItemDisplay_TableRow_productItem(instance, ProductListItemDisplay_productItem);
    final TableCell ProductListItemDisplay_prodTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_prodTy);
    ProductListItemDisplay_TableCell_prodTy(instance, ProductListItemDisplay_prodTy);
    final AnchorElement ProductListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductListItemDisplay_deleteEntityListItemBtn);
    ProductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, ProductListItemDisplay_deleteEntityListItemBtn);
    c_c_h_c_l_p_ProductListItemDisplayTemplateResource templateForProductListItemDisplay = GWT.create(c_c_h_c_l_p_ProductListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/product/list-product-page.html", "productItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/product/list-product-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableRow_productItem(instance)));
      }
    }, dataFieldElements, "productItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_uom(instance)));
      }
    }, dataFieldElements, "uom");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_manufacturer(instance)));
      }
    }, dataFieldElements, "manufacturer");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_prodTy(instance)));
      }
    }, dataFieldElements, "prodTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_introductionDt(instance)));
      }
    }, dataFieldElements, "introductionDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_salesDiscDt(instance)));
      }
    }, dataFieldElements, "salesDiscDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_supportDiscDt(instance)));
      }
    }, dataFieldElements, "supportDiscDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_remarks(instance)));
      }
    }, dataFieldElements, "remarks");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com/cloderia/helion/client/local/product/list-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("productItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableRow_productItem(instance))));
    templateFieldsMap.put("uom", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_uom(instance))));
    templateFieldsMap.put("manufacturer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_manufacturer(instance))));
    templateFieldsMap.put("prodTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_prodTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("introductionDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_introductionDt(instance))));
    templateFieldsMap.put("salesDiscDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_salesDiscDt(instance))));
    templateFieldsMap.put("supportDiscDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_supportDiscDt(instance))));
    templateFieldsMap.put("remarks", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductListItemDisplay_TableCell_remarks(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(ProductListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(ProductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = ProductPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.product.ProductListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_uom(instance))), "uom.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_manufacturer(instance))), "manufacturer.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_prodTy(instance))), "prodTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_introductionDt(instance))), "introductionDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_salesDiscDt(instance))), "salesDiscDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_supportDiscDt(instance))), "supportDiscDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductListItemDisplay_TableCell_remarks(instance))), "remarks", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event ProductListItemDisplay_Event_renderSingleViewEvent(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void ProductListItemDisplay_Event_renderSingleViewEvent(ProductListItemDisplay instance, Event<ProductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableRow ProductListItemDisplay_TableRow_productItem(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::productItem;
  }-*/;

  native static void ProductListItemDisplay_TableRow_productItem(ProductListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::productItem = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_entityCode(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::entityCode;
  }-*/;

  native static void ProductListItemDisplay_TableCell_entityCode(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::entityCode = value;
  }-*/;

  native static AnchorElement ProductListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void ProductListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static DataBinder ProductPresenter_DataBinder_binder(ProductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder;
  }-*/;

  native static void ProductPresenter_DataBinder_binder(ProductPresenter instance, DataBinder<Product> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_prodTy(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::prodTy;
  }-*/;

  native static void ProductListItemDisplay_TableCell_prodTy(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::prodTy = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_remarks(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::remarks;
  }-*/;

  native static void ProductListItemDisplay_TableCell_remarks(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::remarks = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_uom(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::uom;
  }-*/;

  native static void ProductListItemDisplay_TableCell_uom(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::uom = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_salesDiscDt(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::salesDiscDt;
  }-*/;

  native static void ProductListItemDisplay_TableCell_salesDiscDt(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::salesDiscDt = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_manufacturer(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::manufacturer;
  }-*/;

  native static void ProductListItemDisplay_TableCell_manufacturer(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::manufacturer = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_name(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::name;
  }-*/;

  native static void ProductListItemDisplay_TableCell_name(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::name = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_supportDiscDt(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::supportDiscDt;
  }-*/;

  native static void ProductListItemDisplay_TableCell_supportDiscDt(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::supportDiscDt = value;
  }-*/;

  native static AnchorElement ProductListItemDisplay_AnchorElement_editEntityListItemBtn(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void ProductListItemDisplay_AnchorElement_editEntityListItemBtn(ProductListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event ProductListItemDisplay_Event_renderEditViewEvent(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductListItemDisplay_Event_renderEditViewEvent(ProductListItemDisplay instance, Event<ProductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell ProductListItemDisplay_TableCell_introductionDt(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::introductionDt;
  }-*/;

  native static void ProductListItemDisplay_TableCell_introductionDt(ProductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::introductionDt = value;
  }-*/;

  native static Event ProductListItemDisplay_Event_deleteEntityEvent(ProductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductListItemDisplay_Event_deleteEntityEvent(ProductListItemDisplay instance, Event<ProductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductListItemDisplay::deleteEntityEvent = value;
  }-*/;
}
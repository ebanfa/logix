package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.product.ListProductPage;
import com.cloderia.helion.client.local.product.ProductDisplay;
import com.cloderia.helion.client.local.product.ProductPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.TableCell;
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
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_p_ProductDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductDisplay.class, "Type_factory__c_c_h_c_l_p_ProductDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/product/view-product-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductDisplay.class);
    handle.addAssignableType(ProductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductDisplay createInstance(final ContextManager contextManager) {
    final ProductDisplay instance = new ProductDisplay();
    setIncompleteInstance(instance);
    final Event ProductDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductDisplay_deleteEntityEvent);
    ProductDisplay_Event_deleteEntityEvent(instance, ProductDisplay_deleteEntityEvent);
    final TableCell ProductDisplay_introductionDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_introductionDt);
    ProductDisplay_TableCell_introductionDt(instance, ProductDisplay_introductionDt);
    final Event ProductDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductDisplay_renderEditViewEvent);
    ProductDisplay_Event_renderEditViewEvent(instance, ProductDisplay_renderEditViewEvent);
    final TableCell ProductDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_name);
    ProductDisplay_TableCell_name(instance, ProductDisplay_name);
    final TableCell ProductDisplay_manufacturer = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_manufacturer);
    ProductDisplay_TableCell_manufacturer(instance, ProductDisplay_manufacturer);
    final Div ProductDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_entityDisplayComponent);
    ProductDisplay_Div_entityDisplayComponent(instance, ProductDisplay_entityDisplayComponent);
    final TableCell ProductDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_universe);
    ProductDisplay_TableCell_universe(instance, ProductDisplay_universe);
    final Heading ProductDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, ProductDisplay_code);
    ProductDisplay_Heading_code(instance, ProductDisplay_code);
    final Span ProductDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_createdDt);
    ProductDisplay_Span_createdDt(instance, ProductDisplay_createdDt);
    final TableCell ProductDisplay_salesDiscDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_salesDiscDt);
    ProductDisplay_TableCell_salesDiscDt(instance, ProductDisplay_salesDiscDt);
    final Span ProductDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_lastModifiedDt);
    ProductDisplay_Span_lastModifiedDt(instance, ProductDisplay_lastModifiedDt);
    final TableCell ProductDisplay_supportDiscDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_supportDiscDt);
    ProductDisplay_TableCell_supportDiscDt(instance, ProductDisplay_supportDiscDt);
    final DataBinder ProductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Product.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductPresenter_binder);
    ProductPresenter_DataBinder_binder(instance, ProductPresenter_binder);
    final TableCell ProductDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_entityCode);
    ProductDisplay_TableCell_entityCode(instance, ProductDisplay_entityCode);
    final TableCell ProductDisplay_prodTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_prodTy);
    ProductDisplay_TableCell_prodTy(instance, ProductDisplay_prodTy);
    final TransitionTo ProductDisplay_listProductsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductDisplay_listProductsPage);
    ProductDisplay_TransitionTo_listProductsPage(instance, ProductDisplay_listProductsPage);
    final TableCell ProductDisplay_uom = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_uom);
    ProductDisplay_TableCell_uom(instance, ProductDisplay_uom);
    final TableCell ProductDisplay_remarks = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductDisplay_remarks);
    ProductDisplay_TableCell_remarks(instance, ProductDisplay_remarks);
    c_c_h_c_l_p_ProductDisplayTemplateResource templateForProductDisplay = GWT.create(c_c_h_c_l_p_ProductDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductDisplay.getContents().getText(), "com/cloderia/helion/client/local/product/view-product-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/product/view-product-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_uom(instance)));
      }
    }, dataFieldElements, "uom");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_manufacturer(instance)));
      }
    }, dataFieldElements, "manufacturer");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_prodTy(instance)));
      }
    }, dataFieldElements, "prodTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_introductionDt(instance)));
      }
    }, dataFieldElements, "introductionDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_salesDiscDt(instance)));
      }
    }, dataFieldElements, "salesDiscDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_supportDiscDt(instance)));
      }
    }, dataFieldElements, "supportDiscDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_remarks(instance)));
      }
    }, dataFieldElements, "remarks");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_editProductBtn(instance));
      }
    }, dataFieldElements, "editProductBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_deleteProductBtn(instance));
      }
    }, dataFieldElements, "deleteProductBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductDisplay", "com/cloderia/helion/client/local/product/view-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_listProductsPageLink(instance));
      }
    }, dataFieldElements, "listProductsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("uom", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_uom(instance))));
    templateFieldsMap.put("manufacturer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_manufacturer(instance))));
    templateFieldsMap.put("prodTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_prodTy(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_name(instance))));
    templateFieldsMap.put("introductionDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_introductionDt(instance))));
    templateFieldsMap.put("salesDiscDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_salesDiscDt(instance))));
    templateFieldsMap.put("supportDiscDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_supportDiscDt(instance))));
    templateFieldsMap.put("remarks", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductDisplay_TableCell_remarks(instance))));
    templateFieldsMap.put("editProductBtn", ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_editProductBtn(instance)));
    templateFieldsMap.put("deleteProductBtn", ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_deleteProductBtn(instance)));
    templateFieldsMap.put("listProductsPageLink", ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_listProductsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editProductBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditProductBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteProductBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteProductBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.product.ProductDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_uom(instance))), "uom.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_manufacturer(instance))), "manufacturer.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_prodTy(instance))), "prodTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_introductionDt(instance))), "introductionDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_salesDiscDt(instance))), "salesDiscDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_supportDiscDt(instance))), "supportDiscDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductDisplay_TableCell_remarks(instance))), "remarks", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_editProductBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_deleteProductBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductDisplay_AnchorElement_listProductsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Heading ProductDisplay_Heading_code(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::code;
  }-*/;

  native static void ProductDisplay_Heading_code(ProductDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::code = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_universe(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::universe;
  }-*/;

  native static void ProductDisplay_TableCell_universe(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::universe = value;
  }-*/;

  native static AnchorElement ProductDisplay_AnchorElement_editProductBtn(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::editProductBtn;
  }-*/;

  native static void ProductDisplay_AnchorElement_editProductBtn(ProductDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::editProductBtn = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_uom(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::uom;
  }-*/;

  native static void ProductDisplay_TableCell_uom(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::uom = value;
  }-*/;

  native static Div ProductDisplay_Div_entityDisplayComponent(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::entityDisplayComponent;
  }-*/;

  native static void ProductDisplay_Div_entityDisplayComponent(ProductDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_entityCode(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::entityCode;
  }-*/;

  native static void ProductDisplay_TableCell_entityCode(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::entityCode = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_introductionDt(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::introductionDt;
  }-*/;

  native static void ProductDisplay_TableCell_introductionDt(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::introductionDt = value;
  }-*/;

  native static AnchorElement ProductDisplay_AnchorElement_listProductsPageLink(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::listProductsPageLink;
  }-*/;

  native static void ProductDisplay_AnchorElement_listProductsPageLink(ProductDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::listProductsPageLink = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_manufacturer(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::manufacturer;
  }-*/;

  native static void ProductDisplay_TableCell_manufacturer(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::manufacturer = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_name(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::name;
  }-*/;

  native static void ProductDisplay_TableCell_name(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::name = value;
  }-*/;

  native static DataBinder ProductPresenter_DataBinder_binder(ProductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder;
  }-*/;

  native static void ProductPresenter_DataBinder_binder(ProductPresenter instance, DataBinder<Product> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder = value;
  }-*/;

  native static Event ProductDisplay_Event_deleteEntityEvent(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductDisplay_Event_deleteEntityEvent(ProductDisplay instance, Event<ProductDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_remarks(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::remarks;
  }-*/;

  native static void ProductDisplay_TableCell_remarks(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::remarks = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_prodTy(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::prodTy;
  }-*/;

  native static void ProductDisplay_TableCell_prodTy(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::prodTy = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_salesDiscDt(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::salesDiscDt;
  }-*/;

  native static void ProductDisplay_TableCell_salesDiscDt(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::salesDiscDt = value;
  }-*/;

  native static Span ProductDisplay_Span_lastModifiedDt(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::lastModifiedDt;
  }-*/;

  native static void ProductDisplay_Span_lastModifiedDt(ProductDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell ProductDisplay_TableCell_supportDiscDt(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::supportDiscDt;
  }-*/;

  native static void ProductDisplay_TableCell_supportDiscDt(ProductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::supportDiscDt = value;
  }-*/;

  native static Span ProductDisplay_Span_createdDt(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::createdDt;
  }-*/;

  native static void ProductDisplay_Span_createdDt(ProductDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::createdDt = value;
  }-*/;

  native static AnchorElement ProductDisplay_AnchorElement_deleteProductBtn(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::deleteProductBtn;
  }-*/;

  native static void ProductDisplay_AnchorElement_deleteProductBtn(ProductDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::deleteProductBtn = value;
  }-*/;

  native static Event ProductDisplay_Event_renderEditViewEvent(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductDisplay_Event_renderEditViewEvent(ProductDisplay instance, Event<ProductDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::renderEditViewEvent = value;
  }-*/;

  native static TransitionTo ProductDisplay_TransitionTo_listProductsPage(ProductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductDisplay::listProductsPage;
  }-*/;

  native static void ProductDisplay_TransitionTo_listProductsPage(ProductDisplay instance, TransitionTo<ListProductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductDisplay::listProductsPage = value;
  }-*/;
}
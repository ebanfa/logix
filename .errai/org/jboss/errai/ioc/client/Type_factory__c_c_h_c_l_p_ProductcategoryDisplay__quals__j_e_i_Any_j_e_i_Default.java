package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productcategory.ListProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay;
import com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_p_ProductcategoryDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductcategoryDisplay.class, "Type_factory__c_c_h_c_l_p_ProductcategoryDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductcategoryDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productcategory/view-productcategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductcategoryDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductcategoryDisplay.class);
    handle.addAssignableType(ProductcategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductcategoryDisplay createInstance(final ContextManager contextManager) {
    final ProductcategoryDisplay instance = new ProductcategoryDisplay();
    setIncompleteInstance(instance);
    final TableCell ProductcategoryDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_universe);
    ProductcategoryDisplay_TableCell_universe(instance, ProductcategoryDisplay_universe);
    final Event ProductcategoryDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductcategoryDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductcategoryDisplay_renderEditViewEvent);
    ProductcategoryDisplay_Event_renderEditViewEvent(instance, ProductcategoryDisplay_renderEditViewEvent);
    final Div ProductcategoryDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_entityDisplayComponent);
    ProductcategoryDisplay_Div_entityDisplayComponent(instance, ProductcategoryDisplay_entityDisplayComponent);
    final TableCell ProductcategoryDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_name);
    ProductcategoryDisplay_TableCell_name(instance, ProductcategoryDisplay_name);
    final TableCell ProductcategoryDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_description);
    ProductcategoryDisplay_TableCell_description(instance, ProductcategoryDisplay_description);
    final Event ProductcategoryDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductcategoryDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductcategoryDisplay_deleteEntityEvent);
    ProductcategoryDisplay_Event_deleteEntityEvent(instance, ProductcategoryDisplay_deleteEntityEvent);
    final TransitionTo ProductcategoryDisplay_listProductcategorysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductcategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductcategoryDisplay_listProductcategorysPage);
    ProductcategoryDisplay_TransitionTo_listProductcategorysPage(instance, ProductcategoryDisplay_listProductcategorysPage);
    final Span ProductcategoryDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_createdDt);
    ProductcategoryDisplay_Span_createdDt(instance, ProductcategoryDisplay_createdDt);
    final TableCell ProductcategoryDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_effectiveDt);
    ProductcategoryDisplay_TableCell_effectiveDt(instance, ProductcategoryDisplay_effectiveDt);
    final DataBinder ProductcategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productcategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductcategoryPresenter_binder);
    ProductcategoryPresenter_DataBinder_binder(instance, ProductcategoryPresenter_binder);
    final TableCell ProductcategoryDisplay_prodCatTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_prodCatTy);
    ProductcategoryDisplay_TableCell_prodCatTy(instance, ProductcategoryDisplay_prodCatTy);
    final Heading ProductcategoryDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, ProductcategoryDisplay_code);
    ProductcategoryDisplay_Heading_code(instance, ProductcategoryDisplay_code);
    final Span ProductcategoryDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_lastModifiedDt);
    ProductcategoryDisplay_Span_lastModifiedDt(instance, ProductcategoryDisplay_lastModifiedDt);
    final TableCell ProductcategoryDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryDisplay_entityCode);
    ProductcategoryDisplay_TableCell_entityCode(instance, ProductcategoryDisplay_entityCode);
    c_c_h_c_l_p_ProductcategoryDisplayTemplateResource templateForProductcategoryDisplay = GWT.create(c_c_h_c_l_p_ProductcategoryDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductcategoryDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductcategoryDisplay.getContents().getText(), "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_prodCatTy(instance)));
      }
    }, dataFieldElements, "prodCatTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_editProductcategoryBtn(instance));
      }
    }, dataFieldElements, "editProductcategoryBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_deleteProductcategoryBtn(instance));
      }
    }, dataFieldElements, "deleteProductcategoryBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com/cloderia/helion/client/local/productcategory/view-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_listProductcategorysPageLink(instance));
      }
    }, dataFieldElements, "listProductcategorysPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("prodCatTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_prodCatTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editProductcategoryBtn", ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_editProductcategoryBtn(instance)));
    templateFieldsMap.put("deleteProductcategoryBtn", ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_deleteProductcategoryBtn(instance)));
    templateFieldsMap.put("listProductcategorysPageLink", ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_listProductcategorysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editProductcategoryBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditProductcategoryBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteProductcategoryBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteProductcategoryBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductcategorysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductcategoryPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_TableCell_prodCatTy(instance))), "prodCatTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductcategoryDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductcategoryDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductcategoryDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_editProductcategoryBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_deleteProductcategoryBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductcategoryDisplay_AnchorElement_listProductcategorysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductcategoryDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span ProductcategoryDisplay_Span_lastModifiedDt(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::lastModifiedDt;
  }-*/;

  native static void ProductcategoryDisplay_Span_lastModifiedDt(ProductcategoryDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::lastModifiedDt = value;
  }-*/;

  native static Span ProductcategoryDisplay_Span_createdDt(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::createdDt;
  }-*/;

  native static void ProductcategoryDisplay_Span_createdDt(ProductcategoryDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::createdDt = value;
  }-*/;

  native static TableCell ProductcategoryDisplay_TableCell_description(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::description;
  }-*/;

  native static void ProductcategoryDisplay_TableCell_description(ProductcategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::description = value;
  }-*/;

  native static TableCell ProductcategoryDisplay_TableCell_prodCatTy(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::prodCatTy;
  }-*/;

  native static void ProductcategoryDisplay_TableCell_prodCatTy(ProductcategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::prodCatTy = value;
  }-*/;

  native static AnchorElement ProductcategoryDisplay_AnchorElement_editProductcategoryBtn(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::editProductcategoryBtn;
  }-*/;

  native static void ProductcategoryDisplay_AnchorElement_editProductcategoryBtn(ProductcategoryDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::editProductcategoryBtn = value;
  }-*/;

  native static AnchorElement ProductcategoryDisplay_AnchorElement_deleteProductcategoryBtn(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::deleteProductcategoryBtn;
  }-*/;

  native static void ProductcategoryDisplay_AnchorElement_deleteProductcategoryBtn(ProductcategoryDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::deleteProductcategoryBtn = value;
  }-*/;

  native static Event ProductcategoryDisplay_Event_renderEditViewEvent(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductcategoryDisplay_Event_renderEditViewEvent(ProductcategoryDisplay instance, Event<ProductcategoryDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell ProductcategoryDisplay_TableCell_entityCode(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::entityCode;
  }-*/;

  native static void ProductcategoryDisplay_TableCell_entityCode(ProductcategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::entityCode = value;
  }-*/;

  native static TableCell ProductcategoryDisplay_TableCell_universe(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::universe;
  }-*/;

  native static void ProductcategoryDisplay_TableCell_universe(ProductcategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::universe = value;
  }-*/;

  native static AnchorElement ProductcategoryDisplay_AnchorElement_listProductcategorysPageLink(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::listProductcategorysPageLink;
  }-*/;

  native static void ProductcategoryDisplay_AnchorElement_listProductcategorysPageLink(ProductcategoryDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::listProductcategorysPageLink = value;
  }-*/;

  native static DataBinder ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder;
  }-*/;

  native static void ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance, DataBinder<Productcategory> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder = value;
  }-*/;

  native static Event ProductcategoryDisplay_Event_deleteEntityEvent(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductcategoryDisplay_Event_deleteEntityEvent(ProductcategoryDisplay instance, Event<ProductcategoryDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell ProductcategoryDisplay_TableCell_effectiveDt(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::effectiveDt;
  }-*/;

  native static void ProductcategoryDisplay_TableCell_effectiveDt(ProductcategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::effectiveDt = value;
  }-*/;

  native static Div ProductcategoryDisplay_Div_entityDisplayComponent(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::entityDisplayComponent;
  }-*/;

  native static void ProductcategoryDisplay_Div_entityDisplayComponent(ProductcategoryDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::entityDisplayComponent = value;
  }-*/;

  native static Heading ProductcategoryDisplay_Heading_code(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::code;
  }-*/;

  native static void ProductcategoryDisplay_Heading_code(ProductcategoryDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::code = value;
  }-*/;

  native static TableCell ProductcategoryDisplay_TableCell_name(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::name;
  }-*/;

  native static void ProductcategoryDisplay_TableCell_name(ProductcategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::name = value;
  }-*/;

  native static TransitionTo ProductcategoryDisplay_TransitionTo_listProductcategorysPage(ProductcategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::listProductcategorysPage;
  }-*/;

  native static void ProductcategoryDisplay_TransitionTo_listProductcategorysPage(ProductcategoryDisplay instance, TransitionTo<ListProductcategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay::listProductcategorysPage = value;
  }-*/;
}
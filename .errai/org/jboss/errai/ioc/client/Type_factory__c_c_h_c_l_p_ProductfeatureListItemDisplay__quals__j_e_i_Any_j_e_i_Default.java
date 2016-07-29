package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay;
import com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Productfeature;
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

public class Type_factory__c_c_h_c_l_p_ProductfeatureListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeatureListItemDisplay.class, "Type_factory__c_c_h_c_l_p_ProductfeatureListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeatureListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeature/list-productfeature-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeatureListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeatureListItemDisplay.class);
    handle.addAssignableType(ProductfeaturePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeatureListItemDisplay createInstance(final ContextManager contextManager) {
    final ProductfeatureListItemDisplay instance = new ProductfeatureListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell ProductfeatureListItemDisplay_prodFeatTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_prodFeatTy);
    ProductfeatureListItemDisplay_TableCell_prodFeatTy(instance, ProductfeatureListItemDisplay_prodFeatTy);
    final DataBinder ProductfeaturePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeature.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturePresenter_binder);
    ProductfeaturePresenter_DataBinder_binder(instance, ProductfeaturePresenter_binder);
    final TableCell ProductfeatureListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_effectiveDt);
    ProductfeatureListItemDisplay_TableCell_effectiveDt(instance, ProductfeatureListItemDisplay_effectiveDt);
    final Event ProductfeatureListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeatureListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_renderEditViewEvent);
    ProductfeatureListItemDisplay_Event_renderEditViewEvent(instance, ProductfeatureListItemDisplay_renderEditViewEvent);
    final Event ProductfeatureListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeatureListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_renderSingleViewEvent);
    ProductfeatureListItemDisplay_Event_renderSingleViewEvent(instance, ProductfeatureListItemDisplay_renderSingleViewEvent);
    final TableCell ProductfeatureListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_description);
    ProductfeatureListItemDisplay_TableCell_description(instance, ProductfeatureListItemDisplay_description);
    final AnchorElement ProductfeatureListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_deleteEntityListItemBtn);
    ProductfeatureListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, ProductfeatureListItemDisplay_deleteEntityListItemBtn);
    final Event ProductfeatureListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeatureListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_deleteEntityEvent);
    ProductfeatureListItemDisplay_Event_deleteEntityEvent(instance, ProductfeatureListItemDisplay_deleteEntityEvent);
    final TableCell ProductfeatureListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_name);
    ProductfeatureListItemDisplay_TableCell_name(instance, ProductfeatureListItemDisplay_name);
    final AnchorElement ProductfeatureListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_editEntityListItemBtn);
    ProductfeatureListItemDisplay_AnchorElement_editEntityListItemBtn(instance, ProductfeatureListItemDisplay_editEntityListItemBtn);
    final TableCell ProductfeatureListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_entityCode);
    ProductfeatureListItemDisplay_TableCell_entityCode(instance, ProductfeatureListItemDisplay_entityCode);
    final TableCell ProductfeatureListItemDisplay_prodFeatCat = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_prodFeatCat);
    ProductfeatureListItemDisplay_TableCell_prodFeatCat(instance, ProductfeatureListItemDisplay_prodFeatCat);
    final TableCell ProductfeatureListItemDisplay_uom = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_uom);
    ProductfeatureListItemDisplay_TableCell_uom(instance, ProductfeatureListItemDisplay_uom);
    final TableRow ProductfeatureListItemDisplay_productfeatureItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureListItemDisplay_productfeatureItem);
    ProductfeatureListItemDisplay_TableRow_productfeatureItem(instance, ProductfeatureListItemDisplay_productfeatureItem);
    c_c_h_c_l_p_ProductfeatureListItemDisplayTemplateResource templateForProductfeatureListItemDisplay = GWT.create(c_c_h_c_l_p_ProductfeatureListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductfeatureListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductfeatureListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", "productfeatureItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableRow_productfeatureItem(instance)));
      }
    }, dataFieldElements, "productfeatureItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_prodFeatCat(instance)));
      }
    }, dataFieldElements, "prodFeatCat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_uom(instance)));
      }
    }, dataFieldElements, "uom");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_prodFeatTy(instance)));
      }
    }, dataFieldElements, "prodFeatTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeatureListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com/cloderia/helion/client/local/productfeature/list-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeatureListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("productfeatureItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableRow_productfeatureItem(instance))));
    templateFieldsMap.put("prodFeatCat", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_prodFeatCat(instance))));
    templateFieldsMap.put("uom", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_uom(instance))));
    templateFieldsMap.put("prodFeatTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_prodFeatTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(ProductfeatureListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(ProductfeatureListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = ProductfeaturePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureListItemDisplay_TableCell_prodFeatCat(instance))), "prodFeatCat.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureListItemDisplay_TableCell_uom(instance))), "uom.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureListItemDisplay_TableCell_prodFeatTy(instance))), "prodFeatTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeatureListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeatureListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeatureListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeatureListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeatureListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell ProductfeatureListItemDisplay_TableCell_prodFeatTy(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::prodFeatTy;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableCell_prodFeatTy(ProductfeatureListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::prodFeatTy = value;
  }-*/;

  native static TableCell ProductfeatureListItemDisplay_TableCell_description(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::description;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableCell_description(ProductfeatureListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::description = value;
  }-*/;

  native static TableCell ProductfeatureListItemDisplay_TableCell_name(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::name;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableCell_name(ProductfeatureListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::name = value;
  }-*/;

  native static TableCell ProductfeatureListItemDisplay_TableCell_prodFeatCat(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::prodFeatCat;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableCell_prodFeatCat(ProductfeatureListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::prodFeatCat = value;
  }-*/;

  native static Event ProductfeatureListItemDisplay_Event_deleteEntityEvent(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductfeatureListItemDisplay_Event_deleteEntityEvent(ProductfeatureListItemDisplay instance, Event<ProductfeatureListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static AnchorElement ProductfeatureListItemDisplay_AnchorElement_editEntityListItemBtn(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void ProductfeatureListItemDisplay_AnchorElement_editEntityListItemBtn(ProductfeatureListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static AnchorElement ProductfeatureListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void ProductfeatureListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProductfeatureListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event ProductfeatureListItemDisplay_Event_renderSingleViewEvent(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void ProductfeatureListItemDisplay_Event_renderSingleViewEvent(ProductfeatureListItemDisplay instance, Event<ProductfeatureListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static DataBinder ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder;
  }-*/;

  native static void ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance, DataBinder<Productfeature> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder = value;
  }-*/;

  native static TableCell ProductfeatureListItemDisplay_TableCell_entityCode(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::entityCode;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableCell_entityCode(ProductfeatureListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::entityCode = value;
  }-*/;

  native static Event ProductfeatureListItemDisplay_Event_renderEditViewEvent(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductfeatureListItemDisplay_Event_renderEditViewEvent(ProductfeatureListItemDisplay instance, Event<ProductfeatureListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableRow ProductfeatureListItemDisplay_TableRow_productfeatureItem(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::productfeatureItem;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableRow_productfeatureItem(ProductfeatureListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::productfeatureItem = value;
  }-*/;

  native static TableCell ProductfeatureListItemDisplay_TableCell_effectiveDt(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::effectiveDt;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableCell_effectiveDt(ProductfeatureListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell ProductfeatureListItemDisplay_TableCell_uom(ProductfeatureListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::uom;
  }-*/;

  native static void ProductfeatureListItemDisplay_TableCell_uom(ProductfeatureListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay::uom = value;
  }-*/;
}
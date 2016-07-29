package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeature.ListProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay;
import com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_p_ProductfeatureDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeatureDisplay.class, "Type_factory__c_c_h_c_l_p_ProductfeatureDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeatureDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeature/view-productfeature-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeatureDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeatureDisplay.class);
    handle.addAssignableType(ProductfeaturePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeatureDisplay createInstance(final ContextManager contextManager) {
    final ProductfeatureDisplay instance = new ProductfeatureDisplay();
    setIncompleteInstance(instance);
    final TableCell ProductfeatureDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_universe);
    ProductfeatureDisplay_TableCell_universe(instance, ProductfeatureDisplay_universe);
    final Span ProductfeatureDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_createdDt);
    ProductfeatureDisplay_Span_createdDt(instance, ProductfeatureDisplay_createdDt);
    final Event ProductfeatureDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeatureDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeatureDisplay_renderEditViewEvent);
    ProductfeatureDisplay_Event_renderEditViewEvent(instance, ProductfeatureDisplay_renderEditViewEvent);
    final TableCell ProductfeatureDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_effectiveDt);
    ProductfeatureDisplay_TableCell_effectiveDt(instance, ProductfeatureDisplay_effectiveDt);
    final DataBinder ProductfeaturePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeature.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturePresenter_binder);
    ProductfeaturePresenter_DataBinder_binder(instance, ProductfeaturePresenter_binder);
    final TransitionTo ProductfeatureDisplay_listProductfeaturesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductfeaturePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeatureDisplay_listProductfeaturesPage);
    ProductfeatureDisplay_TransitionTo_listProductfeaturesPage(instance, ProductfeatureDisplay_listProductfeaturesPage);
    final Event ProductfeatureDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeatureDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeatureDisplay_deleteEntityEvent);
    ProductfeatureDisplay_Event_deleteEntityEvent(instance, ProductfeatureDisplay_deleteEntityEvent);
    final Heading ProductfeatureDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, ProductfeatureDisplay_code);
    ProductfeatureDisplay_Heading_code(instance, ProductfeatureDisplay_code);
    final TableCell ProductfeatureDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_name);
    ProductfeatureDisplay_TableCell_name(instance, ProductfeatureDisplay_name);
    final TableCell ProductfeatureDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_description);
    ProductfeatureDisplay_TableCell_description(instance, ProductfeatureDisplay_description);
    final TableCell ProductfeatureDisplay_prodFeatTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_prodFeatTy);
    ProductfeatureDisplay_TableCell_prodFeatTy(instance, ProductfeatureDisplay_prodFeatTy);
    final Span ProductfeatureDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_lastModifiedDt);
    ProductfeatureDisplay_Span_lastModifiedDt(instance, ProductfeatureDisplay_lastModifiedDt);
    final TableCell ProductfeatureDisplay_prodFeatCat = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_prodFeatCat);
    ProductfeatureDisplay_TableCell_prodFeatCat(instance, ProductfeatureDisplay_prodFeatCat);
    final TableCell ProductfeatureDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_entityCode);
    ProductfeatureDisplay_TableCell_entityCode(instance, ProductfeatureDisplay_entityCode);
    final TableCell ProductfeatureDisplay_uom = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_uom);
    ProductfeatureDisplay_TableCell_uom(instance, ProductfeatureDisplay_uom);
    final Div ProductfeatureDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureDisplay_entityDisplayComponent);
    ProductfeatureDisplay_Div_entityDisplayComponent(instance, ProductfeatureDisplay_entityDisplayComponent);
    c_c_h_c_l_p_ProductfeatureDisplayTemplateResource templateForProductfeatureDisplay = GWT.create(c_c_h_c_l_p_ProductfeatureDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductfeatureDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductfeatureDisplay.getContents().getText(), "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_prodFeatCat(instance)));
      }
    }, dataFieldElements, "prodFeatCat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_uom(instance)));
      }
    }, dataFieldElements, "uom");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_prodFeatTy(instance)));
      }
    }, dataFieldElements, "prodFeatTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_editProductfeatureBtn(instance));
      }
    }, dataFieldElements, "editProductfeatureBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_deleteProductfeatureBtn(instance));
      }
    }, dataFieldElements, "deleteProductfeatureBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com/cloderia/helion/client/local/productfeature/view-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_listProductfeaturesPageLink(instance));
      }
    }, dataFieldElements, "listProductfeaturesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("prodFeatCat", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_prodFeatCat(instance))));
    templateFieldsMap.put("uom", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_uom(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("prodFeatTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_prodFeatTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editProductfeatureBtn", ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_editProductfeatureBtn(instance)));
    templateFieldsMap.put("deleteProductfeatureBtn", ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_deleteProductfeatureBtn(instance)));
    templateFieldsMap.put("listProductfeaturesPageLink", ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_listProductfeaturesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editProductfeatureBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditProductfeatureBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteProductfeatureBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteProductfeatureBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductfeaturesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductfeaturePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_prodFeatCat(instance))), "prodFeatCat.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_uom(instance))), "uom.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_prodFeatTy(instance))), "prodFeatTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeatureDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeatureDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeatureDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_editProductfeatureBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_deleteProductfeatureBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeatureDisplay_AnchorElement_listProductfeaturesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeatureDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell ProductfeatureDisplay_TableCell_effectiveDt(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::effectiveDt;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_effectiveDt(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::effectiveDt = value;
  }-*/;

  native static Span ProductfeatureDisplay_Span_createdDt(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::createdDt;
  }-*/;

  native static void ProductfeatureDisplay_Span_createdDt(ProductfeatureDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::createdDt = value;
  }-*/;

  native static TableCell ProductfeatureDisplay_TableCell_entityCode(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::entityCode;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_entityCode(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::entityCode = value;
  }-*/;

  native static AnchorElement ProductfeatureDisplay_AnchorElement_listProductfeaturesPageLink(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::listProductfeaturesPageLink;
  }-*/;

  native static void ProductfeatureDisplay_AnchorElement_listProductfeaturesPageLink(ProductfeatureDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::listProductfeaturesPageLink = value;
  }-*/;

  native static Event ProductfeatureDisplay_Event_renderEditViewEvent(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductfeatureDisplay_Event_renderEditViewEvent(ProductfeatureDisplay instance, Event<ProductfeatureDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell ProductfeatureDisplay_TableCell_uom(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::uom;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_uom(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::uom = value;
  }-*/;

  native static TableCell ProductfeatureDisplay_TableCell_description(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::description;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_description(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::description = value;
  }-*/;

  native static TableCell ProductfeatureDisplay_TableCell_prodFeatTy(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::prodFeatTy;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_prodFeatTy(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::prodFeatTy = value;
  }-*/;

  native static Span ProductfeatureDisplay_Span_lastModifiedDt(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::lastModifiedDt;
  }-*/;

  native static void ProductfeatureDisplay_Span_lastModifiedDt(ProductfeatureDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::lastModifiedDt = value;
  }-*/;

  native static DataBinder ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder;
  }-*/;

  native static void ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance, DataBinder<Productfeature> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder = value;
  }-*/;

  native static TableCell ProductfeatureDisplay_TableCell_prodFeatCat(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::prodFeatCat;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_prodFeatCat(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::prodFeatCat = value;
  }-*/;

  native static TransitionTo ProductfeatureDisplay_TransitionTo_listProductfeaturesPage(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::listProductfeaturesPage;
  }-*/;

  native static void ProductfeatureDisplay_TransitionTo_listProductfeaturesPage(ProductfeatureDisplay instance, TransitionTo<ListProductfeaturePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::listProductfeaturesPage = value;
  }-*/;

  native static TableCell ProductfeatureDisplay_TableCell_universe(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::universe;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_universe(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::universe = value;
  }-*/;

  native static TableCell ProductfeatureDisplay_TableCell_name(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::name;
  }-*/;

  native static void ProductfeatureDisplay_TableCell_name(ProductfeatureDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::name = value;
  }-*/;

  native static Heading ProductfeatureDisplay_Heading_code(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::code;
  }-*/;

  native static void ProductfeatureDisplay_Heading_code(ProductfeatureDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::code = value;
  }-*/;

  native static AnchorElement ProductfeatureDisplay_AnchorElement_editProductfeatureBtn(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::editProductfeatureBtn;
  }-*/;

  native static void ProductfeatureDisplay_AnchorElement_editProductfeatureBtn(ProductfeatureDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::editProductfeatureBtn = value;
  }-*/;

  native static Event ProductfeatureDisplay_Event_deleteEntityEvent(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductfeatureDisplay_Event_deleteEntityEvent(ProductfeatureDisplay instance, Event<ProductfeatureDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::deleteEntityEvent = value;
  }-*/;

  native static Div ProductfeatureDisplay_Div_entityDisplayComponent(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::entityDisplayComponent;
  }-*/;

  native static void ProductfeatureDisplay_Div_entityDisplayComponent(ProductfeatureDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::entityDisplayComponent = value;
  }-*/;

  native static AnchorElement ProductfeatureDisplay_AnchorElement_deleteProductfeatureBtn(ProductfeatureDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::deleteProductfeatureBtn;
  }-*/;

  native static void ProductfeatureDisplay_AnchorElement_deleteProductfeatureBtn(ProductfeatureDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay::deleteProductfeatureBtn = value;
  }-*/;
}
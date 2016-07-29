package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.producttype.ListProducttypePage;
import com.cloderia.helion.client.local.producttype.ProducttypeDisplay;
import com.cloderia.helion.client.local.producttype.ProducttypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Producttype;
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

public class Type_factory__c_c_h_c_l_p_ProducttypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProducttypeDisplay.class, "Type_factory__c_c_h_c_l_p_ProducttypeDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProducttypeDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/producttype/view-producttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProducttypeDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProducttypeDisplay.class);
    handle.addAssignableType(ProducttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProducttypeDisplay createInstance(final ContextManager contextManager) {
    final ProducttypeDisplay instance = new ProducttypeDisplay();
    setIncompleteInstance(instance);
    final Span ProducttypeDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_lastModifiedDt);
    ProducttypeDisplay_Span_lastModifiedDt(instance, ProducttypeDisplay_lastModifiedDt);
    final Span ProducttypeDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_createdDt);
    ProducttypeDisplay_Span_createdDt(instance, ProducttypeDisplay_createdDt);
    final TableCell ProducttypeDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_description);
    ProducttypeDisplay_TableCell_description(instance, ProducttypeDisplay_description);
    final TransitionTo ProducttypeDisplay_listProducttypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProducttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProducttypeDisplay_listProducttypesPage);
    ProducttypeDisplay_TransitionTo_listProducttypesPage(instance, ProducttypeDisplay_listProducttypesPage);
    final Event ProducttypeDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProducttypeDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProducttypeDisplay_renderEditViewEvent);
    ProducttypeDisplay_Event_renderEditViewEvent(instance, ProducttypeDisplay_renderEditViewEvent);
    final TableCell ProducttypeDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_effectiveDt);
    ProducttypeDisplay_TableCell_effectiveDt(instance, ProducttypeDisplay_effectiveDt);
    final TableCell ProducttypeDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_entityCode);
    ProducttypeDisplay_TableCell_entityCode(instance, ProducttypeDisplay_entityCode);
    final Event ProducttypeDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProducttypeDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProducttypeDisplay_deleteEntityEvent);
    ProducttypeDisplay_Event_deleteEntityEvent(instance, ProducttypeDisplay_deleteEntityEvent);
    final DataBinder ProducttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Producttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProducttypePresenter_binder);
    ProducttypePresenter_DataBinder_binder(instance, ProducttypePresenter_binder);
    final TableCell ProducttypeDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_name);
    ProducttypeDisplay_TableCell_name(instance, ProducttypeDisplay_name);
    final Heading ProducttypeDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, ProducttypeDisplay_code);
    ProducttypeDisplay_Heading_code(instance, ProducttypeDisplay_code);
    final Div ProducttypeDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_entityDisplayComponent);
    ProducttypeDisplay_Div_entityDisplayComponent(instance, ProducttypeDisplay_entityDisplayComponent);
    final TableCell ProducttypeDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeDisplay_universe);
    ProducttypeDisplay_TableCell_universe(instance, ProducttypeDisplay_universe);
    c_c_h_c_l_p_ProducttypeDisplayTemplateResource templateForProducttypeDisplay = GWT.create(c_c_h_c_l_p_ProducttypeDisplayTemplateResource.class);
    Element parentElementForTemplateOfProducttypeDisplay = TemplateUtil.getRootTemplateParentElement(templateForProducttypeDisplay.getContents().getText(), "com/cloderia/helion/client/local/producttype/view-producttype-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/producttype/view-producttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_editProducttypeBtn(instance));
      }
    }, dataFieldElements, "editProducttypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_deleteProducttypeBtn(instance));
      }
    }, dataFieldElements, "deleteProducttypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com/cloderia/helion/client/local/producttype/view-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_listProducttypesPageLink(instance));
      }
    }, dataFieldElements, "listProducttypesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editProducttypeBtn", ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_editProducttypeBtn(instance)));
    templateFieldsMap.put("deleteProducttypeBtn", ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_deleteProducttypeBtn(instance)));
    templateFieldsMap.put("listProducttypesPageLink", ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_listProducttypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editProducttypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditProducttypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteProducttypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteProducttypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProducttypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProducttypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.producttype.ProducttypeDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProducttypeDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProducttypeDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_editProducttypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_deleteProducttypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProducttypeDisplay_AnchorElement_listProducttypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProducttypeDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Div ProducttypeDisplay_Div_entityDisplayComponent(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::entityDisplayComponent;
  }-*/;

  native static void ProducttypeDisplay_Div_entityDisplayComponent(ProducttypeDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::entityDisplayComponent = value;
  }-*/;

  native static Span ProducttypeDisplay_Span_lastModifiedDt(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::lastModifiedDt;
  }-*/;

  native static void ProducttypeDisplay_Span_lastModifiedDt(ProducttypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell ProducttypeDisplay_TableCell_name(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::name;
  }-*/;

  native static void ProducttypeDisplay_TableCell_name(ProducttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::name = value;
  }-*/;

  native static TableCell ProducttypeDisplay_TableCell_description(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::description;
  }-*/;

  native static void ProducttypeDisplay_TableCell_description(ProducttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::description = value;
  }-*/;

  native static DataBinder ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder;
  }-*/;

  native static void ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance, DataBinder<Producttype> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder = value;
  }-*/;

  native static AnchorElement ProducttypeDisplay_AnchorElement_deleteProducttypeBtn(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::deleteProducttypeBtn;
  }-*/;

  native static void ProducttypeDisplay_AnchorElement_deleteProducttypeBtn(ProducttypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::deleteProducttypeBtn = value;
  }-*/;

  native static AnchorElement ProducttypeDisplay_AnchorElement_editProducttypeBtn(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::editProducttypeBtn;
  }-*/;

  native static void ProducttypeDisplay_AnchorElement_editProducttypeBtn(ProducttypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::editProducttypeBtn = value;
  }-*/;

  native static Span ProducttypeDisplay_Span_createdDt(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::createdDt;
  }-*/;

  native static void ProducttypeDisplay_Span_createdDt(ProducttypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::createdDt = value;
  }-*/;

  native static TableCell ProducttypeDisplay_TableCell_effectiveDt(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::effectiveDt;
  }-*/;

  native static void ProducttypeDisplay_TableCell_effectiveDt(ProducttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::effectiveDt = value;
  }-*/;

  native static Event ProducttypeDisplay_Event_renderEditViewEvent(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::renderEditViewEvent;
  }-*/;

  native static void ProducttypeDisplay_Event_renderEditViewEvent(ProducttypeDisplay instance, Event<ProducttypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::renderEditViewEvent = value;
  }-*/;

  native static Heading ProducttypeDisplay_Heading_code(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::code;
  }-*/;

  native static void ProducttypeDisplay_Heading_code(ProducttypeDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::code = value;
  }-*/;

  native static AnchorElement ProducttypeDisplay_AnchorElement_listProducttypesPageLink(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::listProducttypesPageLink;
  }-*/;

  native static void ProducttypeDisplay_AnchorElement_listProducttypesPageLink(ProducttypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::listProducttypesPageLink = value;
  }-*/;

  native static Event ProducttypeDisplay_Event_deleteEntityEvent(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::deleteEntityEvent;
  }-*/;

  native static void ProducttypeDisplay_Event_deleteEntityEvent(ProducttypeDisplay instance, Event<ProducttypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell ProducttypeDisplay_TableCell_universe(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::universe;
  }-*/;

  native static void ProducttypeDisplay_TableCell_universe(ProducttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::universe = value;
  }-*/;

  native static TableCell ProducttypeDisplay_TableCell_entityCode(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::entityCode;
  }-*/;

  native static void ProducttypeDisplay_TableCell_entityCode(ProducttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::entityCode = value;
  }-*/;

  native static TransitionTo ProducttypeDisplay_TransitionTo_listProducttypesPage(ProducttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::listProducttypesPage;
  }-*/;

  native static void ProducttypeDisplay_TransitionTo_listProducttypesPage(ProducttypeDisplay instance, TransitionTo<ListProducttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeDisplay::listProducttypesPage = value;
  }-*/;
}
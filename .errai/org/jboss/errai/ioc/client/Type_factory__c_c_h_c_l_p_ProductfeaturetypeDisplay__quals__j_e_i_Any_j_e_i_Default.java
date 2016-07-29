package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeaturetype.ListProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_p_ProductfeaturetypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeaturetypeDisplay.class, "Type_factory__c_c_h_c_l_p_ProductfeaturetypeDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeaturetypeDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeaturetypeDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeaturetypeDisplay.class);
    handle.addAssignableType(ProductfeaturetypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeaturetypeDisplay createInstance(final ContextManager contextManager) {
    final ProductfeaturetypeDisplay instance = new ProductfeaturetypeDisplay();
    setIncompleteInstance(instance);
    final DataBinder ProductfeaturetypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeaturetype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturetypePresenter_binder);
    ProductfeaturetypePresenter_DataBinder_binder(instance, ProductfeaturetypePresenter_binder);
    final TableCell ProductfeaturetypeDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_effectiveDt);
    ProductfeaturetypeDisplay_TableCell_effectiveDt(instance, ProductfeaturetypeDisplay_effectiveDt);
    final TableCell ProductfeaturetypeDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_universe);
    ProductfeaturetypeDisplay_TableCell_universe(instance, ProductfeaturetypeDisplay_universe);
    final TransitionTo ProductfeaturetypeDisplay_listProductfeaturetypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductfeaturetypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_listProductfeaturetypesPage);
    ProductfeaturetypeDisplay_TransitionTo_listProductfeaturetypesPage(instance, ProductfeaturetypeDisplay_listProductfeaturetypesPage);
    final Span ProductfeaturetypeDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_lastModifiedDt);
    ProductfeaturetypeDisplay_Span_lastModifiedDt(instance, ProductfeaturetypeDisplay_lastModifiedDt);
    final Event ProductfeaturetypeDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeaturetypeDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_renderEditViewEvent);
    ProductfeaturetypeDisplay_Event_renderEditViewEvent(instance, ProductfeaturetypeDisplay_renderEditViewEvent);
    final Event ProductfeaturetypeDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeaturetypeDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_deleteEntityEvent);
    ProductfeaturetypeDisplay_Event_deleteEntityEvent(instance, ProductfeaturetypeDisplay_deleteEntityEvent);
    final TableCell ProductfeaturetypeDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_name);
    ProductfeaturetypeDisplay_TableCell_name(instance, ProductfeaturetypeDisplay_name);
    final Heading ProductfeaturetypeDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_code);
    ProductfeaturetypeDisplay_Heading_code(instance, ProductfeaturetypeDisplay_code);
    final TableCell ProductfeaturetypeDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_description);
    ProductfeaturetypeDisplay_TableCell_description(instance, ProductfeaturetypeDisplay_description);
    final Div ProductfeaturetypeDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_entityDisplayComponent);
    ProductfeaturetypeDisplay_Div_entityDisplayComponent(instance, ProductfeaturetypeDisplay_entityDisplayComponent);
    final Span ProductfeaturetypeDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_createdDt);
    ProductfeaturetypeDisplay_Span_createdDt(instance, ProductfeaturetypeDisplay_createdDt);
    final TableCell ProductfeaturetypeDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeDisplay_entityCode);
    ProductfeaturetypeDisplay_TableCell_entityCode(instance, ProductfeaturetypeDisplay_entityCode);
    c_c_h_c_l_p_ProductfeaturetypeDisplayTemplateResource templateForProductfeaturetypeDisplay = GWT.create(c_c_h_c_l_p_ProductfeaturetypeDisplayTemplateResource.class);
    Element parentElementForTemplateOfProductfeaturetypeDisplay = TemplateUtil.getRootTemplateParentElement(templateForProductfeaturetypeDisplay.getContents().getText(), "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_editProductfeaturetypeBtn(instance));
      }
    }, dataFieldElements, "editProductfeaturetypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_deleteProductfeaturetypeBtn(instance));
      }
    }, dataFieldElements, "deleteProductfeaturetypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com/cloderia/helion/client/local/productfeaturetype/view-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_listProductfeaturetypesPageLink(instance));
      }
    }, dataFieldElements, "listProductfeaturetypesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editProductfeaturetypeBtn", ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_editProductfeaturetypeBtn(instance)));
    templateFieldsMap.put("deleteProductfeaturetypeBtn", ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_deleteProductfeaturetypeBtn(instance)));
    templateFieldsMap.put("listProductfeaturetypesPageLink", ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_listProductfeaturetypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editProductfeaturetypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditProductfeaturetypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteProductfeaturetypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteProductfeaturetypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductfeaturetypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductfeaturetypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProductfeaturetypeDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeaturetypeDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeaturetypeDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_editProductfeaturetypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_deleteProductfeaturetypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeaturetypeDisplay_AnchorElement_listProductfeaturetypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeaturetypeDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Div ProductfeaturetypeDisplay_Div_entityDisplayComponent(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::entityDisplayComponent;
  }-*/;

  native static void ProductfeaturetypeDisplay_Div_entityDisplayComponent(ProductfeaturetypeDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::entityDisplayComponent = value;
  }-*/;

  native static AnchorElement ProductfeaturetypeDisplay_AnchorElement_deleteProductfeaturetypeBtn(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::deleteProductfeaturetypeBtn;
  }-*/;

  native static void ProductfeaturetypeDisplay_AnchorElement_deleteProductfeaturetypeBtn(ProductfeaturetypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::deleteProductfeaturetypeBtn = value;
  }-*/;

  native static Heading ProductfeaturetypeDisplay_Heading_code(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::code;
  }-*/;

  native static void ProductfeaturetypeDisplay_Heading_code(ProductfeaturetypeDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::code = value;
  }-*/;

  native static TableCell ProductfeaturetypeDisplay_TableCell_entityCode(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::entityCode;
  }-*/;

  native static void ProductfeaturetypeDisplay_TableCell_entityCode(ProductfeaturetypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::entityCode = value;
  }-*/;

  native static Span ProductfeaturetypeDisplay_Span_createdDt(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::createdDt;
  }-*/;

  native static void ProductfeaturetypeDisplay_Span_createdDt(ProductfeaturetypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::createdDt = value;
  }-*/;

  native static Span ProductfeaturetypeDisplay_Span_lastModifiedDt(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::lastModifiedDt;
  }-*/;

  native static void ProductfeaturetypeDisplay_Span_lastModifiedDt(ProductfeaturetypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::lastModifiedDt = value;
  }-*/;

  native static TransitionTo ProductfeaturetypeDisplay_TransitionTo_listProductfeaturetypesPage(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::listProductfeaturetypesPage;
  }-*/;

  native static void ProductfeaturetypeDisplay_TransitionTo_listProductfeaturetypesPage(ProductfeaturetypeDisplay instance, TransitionTo<ListProductfeaturetypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::listProductfeaturetypesPage = value;
  }-*/;

  native static TableCell ProductfeaturetypeDisplay_TableCell_effectiveDt(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::effectiveDt;
  }-*/;

  native static void ProductfeaturetypeDisplay_TableCell_effectiveDt(ProductfeaturetypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::effectiveDt = value;
  }-*/;

  native static AnchorElement ProductfeaturetypeDisplay_AnchorElement_editProductfeaturetypeBtn(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::editProductfeaturetypeBtn;
  }-*/;

  native static void ProductfeaturetypeDisplay_AnchorElement_editProductfeaturetypeBtn(ProductfeaturetypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::editProductfeaturetypeBtn = value;
  }-*/;

  native static Event ProductfeaturetypeDisplay_Event_deleteEntityEvent(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::deleteEntityEvent;
  }-*/;

  native static void ProductfeaturetypeDisplay_Event_deleteEntityEvent(ProductfeaturetypeDisplay instance, Event<ProductfeaturetypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::deleteEntityEvent = value;
  }-*/;

  native static Event ProductfeaturetypeDisplay_Event_renderEditViewEvent(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::renderEditViewEvent;
  }-*/;

  native static void ProductfeaturetypeDisplay_Event_renderEditViewEvent(ProductfeaturetypeDisplay instance, Event<ProductfeaturetypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell ProductfeaturetypeDisplay_TableCell_name(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::name;
  }-*/;

  native static void ProductfeaturetypeDisplay_TableCell_name(ProductfeaturetypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::name = value;
  }-*/;

  native static TableCell ProductfeaturetypeDisplay_TableCell_description(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::description;
  }-*/;

  native static void ProductfeaturetypeDisplay_TableCell_description(ProductfeaturetypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::description = value;
  }-*/;

  native static AnchorElement ProductfeaturetypeDisplay_AnchorElement_listProductfeaturetypesPageLink(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::listProductfeaturetypesPageLink;
  }-*/;

  native static void ProductfeaturetypeDisplay_AnchorElement_listProductfeaturetypesPageLink(ProductfeaturetypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::listProductfeaturetypesPageLink = value;
  }-*/;

  native static TableCell ProductfeaturetypeDisplay_TableCell_universe(ProductfeaturetypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::universe;
  }-*/;

  native static void ProductfeaturetypeDisplay_TableCell_universe(ProductfeaturetypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay::universe = value;
  }-*/;

  native static DataBinder ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder;
  }-*/;

  native static void ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance, DataBinder<Productfeaturetype> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder = value;
  }-*/;
}
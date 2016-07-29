package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay;
import com.cloderia.helion.client.local.producttype.ProducttypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
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

public class Type_factory__c_c_h_c_l_p_ProducttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProducttypeListItemDisplay.class, "Type_factory__c_c_h_c_l_p_ProducttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProducttypeListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/producttype/list-producttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProducttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProducttypeListItemDisplay.class);
    handle.addAssignableType(ProducttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProducttypeListItemDisplay createInstance(final ContextManager contextManager) {
    final ProducttypeListItemDisplay instance = new ProducttypeListItemDisplay();
    setIncompleteInstance(instance);
    final TableRow ProducttypeListItemDisplay_producttypeItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_producttypeItem);
    ProducttypeListItemDisplay_TableRow_producttypeItem(instance, ProducttypeListItemDisplay_producttypeItem);
    final TableCell ProducttypeListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_effectiveDt);
    ProducttypeListItemDisplay_TableCell_effectiveDt(instance, ProducttypeListItemDisplay_effectiveDt);
    final Event ProducttypeListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProducttypeListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_renderEditViewEvent);
    ProducttypeListItemDisplay_Event_renderEditViewEvent(instance, ProducttypeListItemDisplay_renderEditViewEvent);
    final TableCell ProducttypeListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_description);
    ProducttypeListItemDisplay_TableCell_description(instance, ProducttypeListItemDisplay_description);
    final DataBinder ProducttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Producttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProducttypePresenter_binder);
    ProducttypePresenter_DataBinder_binder(instance, ProducttypePresenter_binder);
    final Event ProducttypeListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProducttypeListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_deleteEntityEvent);
    ProducttypeListItemDisplay_Event_deleteEntityEvent(instance, ProducttypeListItemDisplay_deleteEntityEvent);
    final TableCell ProducttypeListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_entityCode);
    ProducttypeListItemDisplay_TableCell_entityCode(instance, ProducttypeListItemDisplay_entityCode);
    final AnchorElement ProducttypeListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_deleteEntityListItemBtn);
    ProducttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, ProducttypeListItemDisplay_deleteEntityListItemBtn);
    final Event ProducttypeListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProducttypeListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_renderSingleViewEvent);
    ProducttypeListItemDisplay_Event_renderSingleViewEvent(instance, ProducttypeListItemDisplay_renderSingleViewEvent);
    final TableCell ProducttypeListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_name);
    ProducttypeListItemDisplay_TableCell_name(instance, ProducttypeListItemDisplay_name);
    final AnchorElement ProducttypeListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeListItemDisplay_editEntityListItemBtn);
    ProducttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance, ProducttypeListItemDisplay_editEntityListItemBtn);
    c_c_h_c_l_p_ProducttypeListItemDisplayTemplateResource templateForProducttypeListItemDisplay = GWT.create(c_c_h_c_l_p_ProducttypeListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfProducttypeListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForProducttypeListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/producttype/list-producttype-page.html", "producttypeItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/producttype/list-producttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableRow_producttypeItem(instance)));
      }
    }, dataFieldElements, "producttypeItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProducttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com/cloderia/helion/client/local/producttype/list-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProducttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("producttypeItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableRow_producttypeItem(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(ProducttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(ProducttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = ProducttypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(ProducttypeListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProducttypeListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProducttypeListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProducttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProducttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProducttypeListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event ProducttypeListItemDisplay_Event_renderSingleViewEvent(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void ProducttypeListItemDisplay_Event_renderSingleViewEvent(ProducttypeListItemDisplay instance, Event<ProducttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell ProducttypeListItemDisplay_TableCell_description(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::description;
  }-*/;

  native static void ProducttypeListItemDisplay_TableCell_description(ProducttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::description = value;
  }-*/;

  native static AnchorElement ProducttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void ProducttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(ProducttypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static AnchorElement ProducttypeListItemDisplay_AnchorElement_editEntityListItemBtn(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void ProducttypeListItemDisplay_AnchorElement_editEntityListItemBtn(ProducttypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell ProducttypeListItemDisplay_TableCell_effectiveDt(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::effectiveDt;
  }-*/;

  native static void ProducttypeListItemDisplay_TableCell_effectiveDt(ProducttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::effectiveDt = value;
  }-*/;

  native static DataBinder ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder;
  }-*/;

  native static void ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance, DataBinder<Producttype> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder = value;
  }-*/;

  native static Event ProducttypeListItemDisplay_Event_deleteEntityEvent(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void ProducttypeListItemDisplay_Event_deleteEntityEvent(ProducttypeListItemDisplay instance, Event<ProducttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableRow ProducttypeListItemDisplay_TableRow_producttypeItem(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::producttypeItem;
  }-*/;

  native static void ProducttypeListItemDisplay_TableRow_producttypeItem(ProducttypeListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::producttypeItem = value;
  }-*/;

  native static TableCell ProducttypeListItemDisplay_TableCell_name(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::name;
  }-*/;

  native static void ProducttypeListItemDisplay_TableCell_name(ProducttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::name = value;
  }-*/;

  native static Event ProducttypeListItemDisplay_Event_renderEditViewEvent(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void ProducttypeListItemDisplay_Event_renderEditViewEvent(ProducttypeListItemDisplay instance, Event<ProducttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell ProducttypeListItemDisplay_TableCell_entityCode(ProducttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::entityCode;
  }-*/;

  native static void ProducttypeListItemDisplay_TableCell_entityCode(ProducttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay::entityCode = value;
  }-*/;
}
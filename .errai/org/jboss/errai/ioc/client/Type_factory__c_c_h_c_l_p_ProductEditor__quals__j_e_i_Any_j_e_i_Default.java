package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.product.ListProductPage;
import com.cloderia.helion.client.local.product.ProductEditor;
import com.cloderia.helion.client.local.product.ProductPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Product;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.api.Convert;
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

public class Type_factory__c_c_h_c_l_p_ProductEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductEditor.class, "Type_factory__c_c_h_c_l_p_ProductEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/product/edit-product-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductEditor.class);
    handle.addAssignableType(ProductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductEditor createInstance(final ContextManager contextManager) {
    final ProductEditor instance = new ProductEditor();
    setIncompleteInstance(instance);
    final TextBox ProductEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_entityCode);
    ProductEditor_TextBox_entityCode(instance, ProductEditor_entityCode);
    final TextBox ProductEditor_salesDiscDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_salesDiscDt);
    ProductEditor_TextBox_salesDiscDt(instance, ProductEditor_salesDiscDt);
    final ListBox ProductEditor_prodTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_prodTy);
    ProductEditor_ListBox_prodTy(instance, ProductEditor_prodTy);
    final ListBox ProductEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_universe);
    ProductEditor_ListBox_universe(instance, ProductEditor_universe);
    final Div ProductEditor_productEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductEditor_productEditor);
    ProductEditor_Div_productEditor(instance, ProductEditor_productEditor);
    final TransitionTo ProductEditor_listProductsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductEditor_listProductsPage);
    ProductEditor_TransitionTo_listProductsPage(instance, ProductEditor_listProductsPage);
    final TextBox ProductEditor_remarks = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_remarks);
    ProductEditor_TextBox_remarks(instance, ProductEditor_remarks);
    final ListBox ProductEditor_uom = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_uom);
    ProductEditor_ListBox_uom(instance, ProductEditor_uom);
    final TextBox ProductEditor_introductionDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_introductionDt);
    ProductEditor_TextBox_introductionDt(instance, ProductEditor_introductionDt);
    final ListBox ProductEditor_manufacturer = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_manufacturer);
    ProductEditor_ListBox_manufacturer(instance, ProductEditor_manufacturer);
    final Event ProductEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductEditor_createEntityEvent);
    ProductEditor_Event_createEntityEvent(instance, ProductEditor_createEntityEvent);
    final TextBox ProductEditor_supportDiscDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_supportDiscDt);
    ProductEditor_TextBox_supportDiscDt(instance, ProductEditor_supportDiscDt);
    final Event ProductEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductEditor_editEntityEvent);
    ProductEditor_Event_editEntityEvent(instance, ProductEditor_editEntityEvent);
    final TextBox ProductEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductEditor_name);
    ProductEditor_TextBox_name(instance, ProductEditor_name);
    final DataBinder ProductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Product.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductPresenter_binder);
    ProductPresenter_DataBinder_binder(instance, ProductPresenter_binder);
    c_c_h_c_l_p_ProductEditorTemplateResource templateForProductEditor = GWT.create(c_c_h_c_l_p_ProductEditorTemplateResource.class);
    Element parentElementForTemplateOfProductEditor = TemplateUtil.getRootTemplateParentElement(templateForProductEditor.getContents().getText(), "com/cloderia/helion/client/local/product/edit-product-page.html", "productEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/product/edit-product-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductEditor_Div_productEditor(instance)));
      }
    }, dataFieldElements, "productEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_ListBox_uom(instance).asWidget();
      }
    }, dataFieldElements, "uom");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_ListBox_manufacturer(instance).asWidget();
      }
    }, dataFieldElements, "manufacturer");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_ListBox_prodTy(instance).asWidget();
      }
    }, dataFieldElements, "prodTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_TextBox_introductionDt(instance).asWidget();
      }
    }, dataFieldElements, "introductionDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_TextBox_salesDiscDt(instance).asWidget();
      }
    }, dataFieldElements, "salesDiscDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_TextBox_supportDiscDt(instance).asWidget();
      }
    }, dataFieldElements, "supportDiscDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_TextBox_remarks(instance).asWidget();
      }
    }, dataFieldElements, "remarks");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductEditor_Button_editProductBtn(instance).asWidget();
      }
    }, dataFieldElements, "editProductBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.product.ProductEditor", "com/cloderia/helion/client/local/product/edit-product-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductEditor_AnchorElement_listProductsPageLink(instance));
      }
    }, dataFieldElements, "listProductsPageLink");
    templateFieldsMap.put("productEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductEditor_Div_productEditor(instance))));
    templateFieldsMap.put("uom", ProductEditor_ListBox_uom(instance).asWidget());
    templateFieldsMap.put("manufacturer", ProductEditor_ListBox_manufacturer(instance).asWidget());
    templateFieldsMap.put("prodTy", ProductEditor_ListBox_prodTy(instance).asWidget());
    templateFieldsMap.put("universe", ProductEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", ProductEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", ProductEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("introductionDt", ProductEditor_TextBox_introductionDt(instance).asWidget());
    templateFieldsMap.put("salesDiscDt", ProductEditor_TextBox_salesDiscDt(instance).asWidget());
    templateFieldsMap.put("supportDiscDt", ProductEditor_TextBox_supportDiscDt(instance).asWidget());
    templateFieldsMap.put("remarks", ProductEditor_TextBox_remarks(instance).asWidget());
    templateFieldsMap.put("editProductBtn", ProductEditor_Button_editProductBtn(instance).asWidget());
    templateFieldsMap.put("listProductsPageLink", ElementWrapperWidget.getWidget(ProductEditor_AnchorElement_listProductsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editProductBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editProduct(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.product.ProductEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProductEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductEditor_TextBox_introductionDt(instance), "introductionDt", new DateConverter(), null, false);
    binder.bind(ProductEditor_TextBox_salesDiscDt(instance), "salesDiscDt", new DateConverter(), null, false);
    binder.bind(ProductEditor_TextBox_supportDiscDt(instance), "supportDiscDt", new DateConverter(), null, false);
    binder.bind(ProductEditor_TextBox_remarks(instance), "remarks", Convert.getConverter(Integer.class, String.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductEditor_AnchorElement_listProductsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement ProductEditor_AnchorElement_listProductsPageLink(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::listProductsPageLink;
  }-*/;

  native static void ProductEditor_AnchorElement_listProductsPageLink(ProductEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::listProductsPageLink = value;
  }-*/;

  native static TextBox ProductEditor_TextBox_entityCode(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::entityCode;
  }-*/;

  native static void ProductEditor_TextBox_entityCode(ProductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::entityCode = value;
  }-*/;

  native static ListBox ProductEditor_ListBox_universe(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::universe;
  }-*/;

  native static void ProductEditor_ListBox_universe(ProductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::universe = value;
  }-*/;

  native static DataBinder ProductPresenter_DataBinder_binder(ProductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder;
  }-*/;

  native static void ProductPresenter_DataBinder_binder(ProductPresenter instance, DataBinder<Product> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductPresenter::binder = value;
  }-*/;

  native static Div ProductEditor_Div_productEditor(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::productEditor;
  }-*/;

  native static void ProductEditor_Div_productEditor(ProductEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::productEditor = value;
  }-*/;

  native static Event ProductEditor_Event_createEntityEvent(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::createEntityEvent;
  }-*/;

  native static void ProductEditor_Event_createEntityEvent(ProductEditor instance, Event<ProductEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::createEntityEvent = value;
  }-*/;

  native static ListBox ProductEditor_ListBox_prodTy(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::prodTy;
  }-*/;

  native static void ProductEditor_ListBox_prodTy(ProductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::prodTy = value;
  }-*/;

  native static Event ProductEditor_Event_editEntityEvent(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::editEntityEvent;
  }-*/;

  native static void ProductEditor_Event_editEntityEvent(ProductEditor instance, Event<ProductEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::editEntityEvent = value;
  }-*/;

  native static ListBox ProductEditor_ListBox_uom(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::uom;
  }-*/;

  native static void ProductEditor_ListBox_uom(ProductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::uom = value;
  }-*/;

  native static TransitionTo ProductEditor_TransitionTo_listProductsPage(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::listProductsPage;
  }-*/;

  native static void ProductEditor_TransitionTo_listProductsPage(ProductEditor instance, TransitionTo<ListProductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::listProductsPage = value;
  }-*/;

  native static ListBox ProductEditor_ListBox_manufacturer(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::manufacturer;
  }-*/;

  native static void ProductEditor_ListBox_manufacturer(ProductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::manufacturer = value;
  }-*/;

  native static TextBox ProductEditor_TextBox_name(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::name;
  }-*/;

  native static void ProductEditor_TextBox_name(ProductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::name = value;
  }-*/;

  native static TextBox ProductEditor_TextBox_salesDiscDt(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::salesDiscDt;
  }-*/;

  native static void ProductEditor_TextBox_salesDiscDt(ProductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::salesDiscDt = value;
  }-*/;

  native static TextBox ProductEditor_TextBox_remarks(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::remarks;
  }-*/;

  native static void ProductEditor_TextBox_remarks(ProductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::remarks = value;
  }-*/;

  native static TextBox ProductEditor_TextBox_introductionDt(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::introductionDt;
  }-*/;

  native static void ProductEditor_TextBox_introductionDt(ProductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::introductionDt = value;
  }-*/;

  native static Button ProductEditor_Button_editProductBtn(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::editProductBtn;
  }-*/;

  native static void ProductEditor_Button_editProductBtn(ProductEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::editProductBtn = value;
  }-*/;

  native static TextBox ProductEditor_TextBox_supportDiscDt(ProductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.product.ProductEditor::supportDiscDt;
  }-*/;

  native static void ProductEditor_TextBox_supportDiscDt(ProductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.product.ProductEditor::supportDiscDt = value;
  }-*/;
}
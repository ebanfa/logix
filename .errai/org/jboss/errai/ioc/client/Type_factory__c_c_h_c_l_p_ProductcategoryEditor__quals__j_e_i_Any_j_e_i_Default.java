package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productcategory.ListProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ProductcategoryEditor;
import com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Productcategory;
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

public class Type_factory__c_c_h_c_l_p_ProductcategoryEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductcategoryEditor.class, "Type_factory__c_c_h_c_l_p_ProductcategoryEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductcategoryEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductcategoryEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductcategoryEditor.class);
    handle.addAssignableType(ProductcategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductcategoryEditor createInstance(final ContextManager contextManager) {
    final ProductcategoryEditor instance = new ProductcategoryEditor();
    setIncompleteInstance(instance);
    final ListBox ProductcategoryEditor_prodCatTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductcategoryEditor_prodCatTy);
    ProductcategoryEditor_ListBox_prodCatTy(instance, ProductcategoryEditor_prodCatTy);
    final ListBox ProductcategoryEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductcategoryEditor_universe);
    ProductcategoryEditor_ListBox_universe(instance, ProductcategoryEditor_universe);
    final TextBox ProductcategoryEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductcategoryEditor_description);
    ProductcategoryEditor_TextBox_description(instance, ProductcategoryEditor_description);
    final TextBox ProductcategoryEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductcategoryEditor_effectiveDt);
    ProductcategoryEditor_TextBox_effectiveDt(instance, ProductcategoryEditor_effectiveDt);
    final TextBox ProductcategoryEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductcategoryEditor_name);
    ProductcategoryEditor_TextBox_name(instance, ProductcategoryEditor_name);
    final DataBinder ProductcategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productcategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductcategoryPresenter_binder);
    ProductcategoryPresenter_DataBinder_binder(instance, ProductcategoryPresenter_binder);
    final TextBox ProductcategoryEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductcategoryEditor_entityCode);
    ProductcategoryEditor_TextBox_entityCode(instance, ProductcategoryEditor_entityCode);
    final Div ProductcategoryEditor_productcategoryEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductcategoryEditor_productcategoryEditor);
    ProductcategoryEditor_Div_productcategoryEditor(instance, ProductcategoryEditor_productcategoryEditor);
    final Event ProductcategoryEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductcategoryEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductcategoryEditor_editEntityEvent);
    ProductcategoryEditor_Event_editEntityEvent(instance, ProductcategoryEditor_editEntityEvent);
    final Event ProductcategoryEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductcategoryEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductcategoryEditor_createEntityEvent);
    ProductcategoryEditor_Event_createEntityEvent(instance, ProductcategoryEditor_createEntityEvent);
    final TransitionTo ProductcategoryEditor_listProductcategorysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductcategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductcategoryEditor_listProductcategorysPage);
    ProductcategoryEditor_TransitionTo_listProductcategorysPage(instance, ProductcategoryEditor_listProductcategorysPage);
    c_c_h_c_l_p_ProductcategoryEditorTemplateResource templateForProductcategoryEditor = GWT.create(c_c_h_c_l_p_ProductcategoryEditorTemplateResource.class);
    Element parentElementForTemplateOfProductcategoryEditor = TemplateUtil.getRootTemplateParentElement(templateForProductcategoryEditor.getContents().getText(), "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", "productcategoryEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryEditor_Div_productcategoryEditor(instance)));
      }
    }, dataFieldElements, "productcategoryEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductcategoryEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductcategoryEditor_ListBox_prodCatTy(instance).asWidget();
      }
    }, dataFieldElements, "prodCatTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductcategoryEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductcategoryEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductcategoryEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductcategoryEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductcategoryEditor_Button_editProductcategoryBtn(instance).asWidget();
      }
    }, dataFieldElements, "editProductcategoryBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com/cloderia/helion/client/local/productcategory/edit-productcategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductcategoryEditor_AnchorElement_listProductcategorysPageLink(instance));
      }
    }, dataFieldElements, "listProductcategorysPageLink");
    templateFieldsMap.put("productcategoryEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductcategoryEditor_Div_productcategoryEditor(instance))));
    templateFieldsMap.put("universe", ProductcategoryEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("prodCatTy", ProductcategoryEditor_ListBox_prodCatTy(instance).asWidget());
    templateFieldsMap.put("entityCode", ProductcategoryEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", ProductcategoryEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", ProductcategoryEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", ProductcategoryEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editProductcategoryBtn", ProductcategoryEditor_Button_editProductcategoryBtn(instance).asWidget());
    templateFieldsMap.put("listProductcategorysPageLink", ElementWrapperWidget.getWidget(ProductcategoryEditor_AnchorElement_listProductcategorysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductcategoryEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editProductcategoryBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editProductcategory(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductcategorysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductcategoryPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productcategory.ProductcategoryEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProductcategoryEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductcategoryEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductcategoryEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductcategoryEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductcategoryEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductcategoryEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductcategoryEditor_AnchorElement_listProductcategorysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductcategoryEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo ProductcategoryEditor_TransitionTo_listProductcategorysPage(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::listProductcategorysPage;
  }-*/;

  native static void ProductcategoryEditor_TransitionTo_listProductcategorysPage(ProductcategoryEditor instance, TransitionTo<ListProductcategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::listProductcategorysPage = value;
  }-*/;

  native static ListBox ProductcategoryEditor_ListBox_universe(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::universe;
  }-*/;

  native static void ProductcategoryEditor_ListBox_universe(ProductcategoryEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::universe = value;
  }-*/;

  native static TextBox ProductcategoryEditor_TextBox_entityCode(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::entityCode;
  }-*/;

  native static void ProductcategoryEditor_TextBox_entityCode(ProductcategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::entityCode = value;
  }-*/;

  native static ListBox ProductcategoryEditor_ListBox_prodCatTy(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::prodCatTy;
  }-*/;

  native static void ProductcategoryEditor_ListBox_prodCatTy(ProductcategoryEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::prodCatTy = value;
  }-*/;

  native static TextBox ProductcategoryEditor_TextBox_description(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::description;
  }-*/;

  native static void ProductcategoryEditor_TextBox_description(ProductcategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::description = value;
  }-*/;

  native static Button ProductcategoryEditor_Button_editProductcategoryBtn(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::editProductcategoryBtn;
  }-*/;

  native static void ProductcategoryEditor_Button_editProductcategoryBtn(ProductcategoryEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::editProductcategoryBtn = value;
  }-*/;

  native static TextBox ProductcategoryEditor_TextBox_name(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::name;
  }-*/;

  native static void ProductcategoryEditor_TextBox_name(ProductcategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::name = value;
  }-*/;

  native static AnchorElement ProductcategoryEditor_AnchorElement_listProductcategorysPageLink(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::listProductcategorysPageLink;
  }-*/;

  native static void ProductcategoryEditor_AnchorElement_listProductcategorysPageLink(ProductcategoryEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::listProductcategorysPageLink = value;
  }-*/;

  native static TextBox ProductcategoryEditor_TextBox_effectiveDt(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::effectiveDt;
  }-*/;

  native static void ProductcategoryEditor_TextBox_effectiveDt(ProductcategoryEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::effectiveDt = value;
  }-*/;

  native static DataBinder ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder;
  }-*/;

  native static void ProductcategoryPresenter_DataBinder_binder(ProductcategoryPresenter instance, DataBinder<Productcategory> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter::binder = value;
  }-*/;

  native static Event ProductcategoryEditor_Event_editEntityEvent(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::editEntityEvent;
  }-*/;

  native static void ProductcategoryEditor_Event_editEntityEvent(ProductcategoryEditor instance, Event<ProductcategoryEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::editEntityEvent = value;
  }-*/;

  native static Event ProductcategoryEditor_Event_createEntityEvent(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::createEntityEvent;
  }-*/;

  native static void ProductcategoryEditor_Event_createEntityEvent(ProductcategoryEditor instance, Event<ProductcategoryEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::createEntityEvent = value;
  }-*/;

  native static Div ProductcategoryEditor_Div_productcategoryEditor(ProductcategoryEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::productcategoryEditor;
  }-*/;

  native static void ProductcategoryEditor_Div_productcategoryEditor(ProductcategoryEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.productcategory.ProductcategoryEditor::productcategoryEditor = value;
  }-*/;
}
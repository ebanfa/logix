package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeature.ListProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ProductfeatureEditor;
import com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Productfeature;
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

public class Type_factory__c_c_h_c_l_p_ProductfeatureEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeatureEditor.class, "Type_factory__c_c_h_c_l_p_ProductfeatureEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeatureEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeatureEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeatureEditor.class);
    handle.addAssignableType(ProductfeaturePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeatureEditor createInstance(final ContextManager contextManager) {
    final ProductfeatureEditor instance = new ProductfeatureEditor();
    setIncompleteInstance(instance);
    final Event ProductfeatureEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeatureEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeatureEditor_editEntityEvent);
    ProductfeatureEditor_Event_editEntityEvent(instance, ProductfeatureEditor_editEntityEvent);
    final ListBox ProductfeatureEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_universe);
    ProductfeatureEditor_ListBox_universe(instance, ProductfeatureEditor_universe);
    final ListBox ProductfeatureEditor_prodFeatCat = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_prodFeatCat);
    ProductfeatureEditor_ListBox_prodFeatCat(instance, ProductfeatureEditor_prodFeatCat);
    final TextBox ProductfeatureEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_description);
    ProductfeatureEditor_TextBox_description(instance, ProductfeatureEditor_description);
    final TextBox ProductfeatureEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_effectiveDt);
    ProductfeatureEditor_TextBox_effectiveDt(instance, ProductfeatureEditor_effectiveDt);
    final Div ProductfeatureEditor_productfeatureEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeatureEditor_productfeatureEditor);
    ProductfeatureEditor_Div_productfeatureEditor(instance, ProductfeatureEditor_productfeatureEditor);
    final TextBox ProductfeatureEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_entityCode);
    ProductfeatureEditor_TextBox_entityCode(instance, ProductfeatureEditor_entityCode);
    final TextBox ProductfeatureEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_name);
    ProductfeatureEditor_TextBox_name(instance, ProductfeatureEditor_name);
    final DataBinder ProductfeaturePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeature.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturePresenter_binder);
    ProductfeaturePresenter_DataBinder_binder(instance, ProductfeaturePresenter_binder);
    final TransitionTo ProductfeatureEditor_listProductfeaturesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductfeaturePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeatureEditor_listProductfeaturesPage);
    ProductfeatureEditor_TransitionTo_listProductfeaturesPage(instance, ProductfeatureEditor_listProductfeaturesPage);
    final ListBox ProductfeatureEditor_uom = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_uom);
    ProductfeatureEditor_ListBox_uom(instance, ProductfeatureEditor_uom);
    final ListBox ProductfeatureEditor_prodFeatTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeatureEditor_prodFeatTy);
    ProductfeatureEditor_ListBox_prodFeatTy(instance, ProductfeatureEditor_prodFeatTy);
    final Event ProductfeatureEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeatureEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeatureEditor_createEntityEvent);
    ProductfeatureEditor_Event_createEntityEvent(instance, ProductfeatureEditor_createEntityEvent);
    c_c_h_c_l_p_ProductfeatureEditorTemplateResource templateForProductfeatureEditor = GWT.create(c_c_h_c_l_p_ProductfeatureEditorTemplateResource.class);
    Element parentElementForTemplateOfProductfeatureEditor = TemplateUtil.getRootTemplateParentElement(templateForProductfeatureEditor.getContents().getText(), "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", "productfeatureEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureEditor_Div_productfeatureEditor(instance)));
      }
    }, dataFieldElements, "productfeatureEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_ListBox_prodFeatCat(instance).asWidget();
      }
    }, dataFieldElements, "prodFeatCat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_ListBox_uom(instance).asWidget();
      }
    }, dataFieldElements, "uom");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_ListBox_prodFeatTy(instance).asWidget();
      }
    }, dataFieldElements, "prodFeatTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeatureEditor_Button_editProductfeatureBtn(instance).asWidget();
      }
    }, dataFieldElements, "editProductfeatureBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com/cloderia/helion/client/local/productfeature/edit-productfeature-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeatureEditor_AnchorElement_listProductfeaturesPageLink(instance));
      }
    }, dataFieldElements, "listProductfeaturesPageLink");
    templateFieldsMap.put("productfeatureEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeatureEditor_Div_productfeatureEditor(instance))));
    templateFieldsMap.put("prodFeatCat", ProductfeatureEditor_ListBox_prodFeatCat(instance).asWidget());
    templateFieldsMap.put("uom", ProductfeatureEditor_ListBox_uom(instance).asWidget());
    templateFieldsMap.put("universe", ProductfeatureEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("prodFeatTy", ProductfeatureEditor_ListBox_prodFeatTy(instance).asWidget());
    templateFieldsMap.put("entityCode", ProductfeatureEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", ProductfeatureEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", ProductfeatureEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", ProductfeatureEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editProductfeatureBtn", ProductfeatureEditor_Button_editProductfeatureBtn(instance).asWidget());
    templateFieldsMap.put("listProductfeaturesPageLink", ElementWrapperWidget.getWidget(ProductfeatureEditor_AnchorElement_listProductfeaturesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeatureEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editProductfeatureBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editProductfeature(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductfeaturesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductfeaturePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeature.ProductfeatureEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProductfeatureEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductfeatureEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductfeatureEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductfeatureEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeatureEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeatureEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeatureEditor_AnchorElement_listProductfeaturesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeatureEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox ProductfeatureEditor_ListBox_prodFeatTy(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::prodFeatTy;
  }-*/;

  native static void ProductfeatureEditor_ListBox_prodFeatTy(ProductfeatureEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::prodFeatTy = value;
  }-*/;

  native static TransitionTo ProductfeatureEditor_TransitionTo_listProductfeaturesPage(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::listProductfeaturesPage;
  }-*/;

  native static void ProductfeatureEditor_TransitionTo_listProductfeaturesPage(ProductfeatureEditor instance, TransitionTo<ListProductfeaturePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::listProductfeaturesPage = value;
  }-*/;

  native static TextBox ProductfeatureEditor_TextBox_name(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::name;
  }-*/;

  native static void ProductfeatureEditor_TextBox_name(ProductfeatureEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::name = value;
  }-*/;

  native static ListBox ProductfeatureEditor_ListBox_prodFeatCat(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::prodFeatCat;
  }-*/;

  native static void ProductfeatureEditor_ListBox_prodFeatCat(ProductfeatureEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::prodFeatCat = value;
  }-*/;

  native static TextBox ProductfeatureEditor_TextBox_effectiveDt(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::effectiveDt;
  }-*/;

  native static void ProductfeatureEditor_TextBox_effectiveDt(ProductfeatureEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::effectiveDt = value;
  }-*/;

  native static TextBox ProductfeatureEditor_TextBox_description(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::description;
  }-*/;

  native static void ProductfeatureEditor_TextBox_description(ProductfeatureEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::description = value;
  }-*/;

  native static TextBox ProductfeatureEditor_TextBox_entityCode(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::entityCode;
  }-*/;

  native static void ProductfeatureEditor_TextBox_entityCode(ProductfeatureEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::entityCode = value;
  }-*/;

  native static ListBox ProductfeatureEditor_ListBox_universe(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::universe;
  }-*/;

  native static void ProductfeatureEditor_ListBox_universe(ProductfeatureEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::universe = value;
  }-*/;

  native static AnchorElement ProductfeatureEditor_AnchorElement_listProductfeaturesPageLink(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::listProductfeaturesPageLink;
  }-*/;

  native static void ProductfeatureEditor_AnchorElement_listProductfeaturesPageLink(ProductfeatureEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::listProductfeaturesPageLink = value;
  }-*/;

  native static Event ProductfeatureEditor_Event_editEntityEvent(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::editEntityEvent;
  }-*/;

  native static void ProductfeatureEditor_Event_editEntityEvent(ProductfeatureEditor instance, Event<ProductfeatureEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::editEntityEvent = value;
  }-*/;

  native static DataBinder ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder;
  }-*/;

  native static void ProductfeaturePresenter_DataBinder_binder(ProductfeaturePresenter instance, DataBinder<Productfeature> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter::binder = value;
  }-*/;

  native static Button ProductfeatureEditor_Button_editProductfeatureBtn(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::editProductfeatureBtn;
  }-*/;

  native static void ProductfeatureEditor_Button_editProductfeatureBtn(ProductfeatureEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::editProductfeatureBtn = value;
  }-*/;

  native static Event ProductfeatureEditor_Event_createEntityEvent(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::createEntityEvent;
  }-*/;

  native static void ProductfeatureEditor_Event_createEntityEvent(ProductfeatureEditor instance, Event<ProductfeatureEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::createEntityEvent = value;
  }-*/;

  native static Div ProductfeatureEditor_Div_productfeatureEditor(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::productfeatureEditor;
  }-*/;

  native static void ProductfeatureEditor_Div_productfeatureEditor(ProductfeatureEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::productfeatureEditor = value;
  }-*/;

  native static ListBox ProductfeatureEditor_ListBox_uom(ProductfeatureEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::uom;
  }-*/;

  native static void ProductfeatureEditor_ListBox_uom(ProductfeatureEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeature.ProductfeatureEditor::uom = value;
  }-*/;
}
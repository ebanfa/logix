package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.productfeaturetype.ListProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Productfeaturetype;
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

public class Type_factory__c_c_h_c_l_p_ProductfeaturetypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProductfeaturetypeEditor.class, "Type_factory__c_c_h_c_l_p_ProductfeaturetypeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProductfeaturetypeEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProductfeaturetypeEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProductfeaturetypeEditor.class);
    handle.addAssignableType(ProductfeaturetypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProductfeaturetypeEditor createInstance(final ContextManager contextManager) {
    final ProductfeaturetypeEditor instance = new ProductfeaturetypeEditor();
    setIncompleteInstance(instance);
    final ListBox ProductfeaturetypeEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_universe);
    ProductfeaturetypeEditor_ListBox_universe(instance, ProductfeaturetypeEditor_universe);
    final TextBox ProductfeaturetypeEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_effectiveDt);
    ProductfeaturetypeEditor_TextBox_effectiveDt(instance, ProductfeaturetypeEditor_effectiveDt);
    final Event ProductfeaturetypeEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeaturetypeEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_editEntityEvent);
    ProductfeaturetypeEditor_Event_editEntityEvent(instance, ProductfeaturetypeEditor_editEntityEvent);
    final TextBox ProductfeaturetypeEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_description);
    ProductfeaturetypeEditor_TextBox_description(instance, ProductfeaturetypeEditor_description);
    final TextBox ProductfeaturetypeEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_entityCode);
    ProductfeaturetypeEditor_TextBox_entityCode(instance, ProductfeaturetypeEditor_entityCode);
    final DataBinder ProductfeaturetypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Productfeaturetype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturetypePresenter_binder);
    ProductfeaturetypePresenter_DataBinder_binder(instance, ProductfeaturetypePresenter_binder);
    final Div ProductfeaturetypeEditor_productfeaturetypeEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_productfeaturetypeEditor);
    ProductfeaturetypeEditor_Div_productfeaturetypeEditor(instance, ProductfeaturetypeEditor_productfeaturetypeEditor);
    final TextBox ProductfeaturetypeEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_name);
    ProductfeaturetypeEditor_TextBox_name(instance, ProductfeaturetypeEditor_name);
    final TransitionTo ProductfeaturetypeEditor_listProductfeaturetypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProductfeaturetypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_listProductfeaturetypesPage);
    ProductfeaturetypeEditor_TransitionTo_listProductfeaturetypesPage(instance, ProductfeaturetypeEditor_listProductfeaturetypesPage);
    final Event ProductfeaturetypeEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProductfeaturetypeEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProductfeaturetypeEditor_createEntityEvent);
    ProductfeaturetypeEditor_Event_createEntityEvent(instance, ProductfeaturetypeEditor_createEntityEvent);
    c_c_h_c_l_p_ProductfeaturetypeEditorTemplateResource templateForProductfeaturetypeEditor = GWT.create(c_c_h_c_l_p_ProductfeaturetypeEditorTemplateResource.class);
    Element parentElementForTemplateOfProductfeaturetypeEditor = TemplateUtil.getRootTemplateParentElement(templateForProductfeaturetypeEditor.getContents().getText(), "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", "productfeaturetypeEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeEditor_Div_productfeaturetypeEditor(instance)));
      }
    }, dataFieldElements, "productfeaturetypeEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeaturetypeEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeaturetypeEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeaturetypeEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeaturetypeEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeaturetypeEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProductfeaturetypeEditor_Button_editProductfeaturetypeBtn(instance).asWidget();
      }
    }, dataFieldElements, "editProductfeaturetypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com/cloderia/helion/client/local/productfeaturetype/edit-productfeaturetype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProductfeaturetypeEditor_AnchorElement_listProductfeaturetypesPageLink(instance));
      }
    }, dataFieldElements, "listProductfeaturetypesPageLink");
    templateFieldsMap.put("productfeaturetypeEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProductfeaturetypeEditor_Div_productfeaturetypeEditor(instance))));
    templateFieldsMap.put("universe", ProductfeaturetypeEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", ProductfeaturetypeEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", ProductfeaturetypeEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", ProductfeaturetypeEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", ProductfeaturetypeEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editProductfeaturetypeBtn", ProductfeaturetypeEditor_Button_editProductfeaturetypeBtn(instance).asWidget());
    templateFieldsMap.put("listProductfeaturetypesPageLink", ElementWrapperWidget.getWidget(ProductfeaturetypeEditor_AnchorElement_listProductfeaturetypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProductfeaturetypeEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editProductfeaturetypeBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editProductfeaturetype(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProductfeaturetypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProductfeaturetypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProductfeaturetypeEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductfeaturetypeEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductfeaturetypeEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProductfeaturetypeEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProductfeaturetypeEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProductfeaturetypeEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProductfeaturetypeEditor_AnchorElement_listProductfeaturetypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProductfeaturetypeEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox ProductfeaturetypeEditor_TextBox_name(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::name;
  }-*/;

  native static void ProductfeaturetypeEditor_TextBox_name(ProductfeaturetypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::name = value;
  }-*/;

  native static TransitionTo ProductfeaturetypeEditor_TransitionTo_listProductfeaturetypesPage(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::listProductfeaturetypesPage;
  }-*/;

  native static void ProductfeaturetypeEditor_TransitionTo_listProductfeaturetypesPage(ProductfeaturetypeEditor instance, TransitionTo<ListProductfeaturetypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::listProductfeaturetypesPage = value;
  }-*/;

  native static ListBox ProductfeaturetypeEditor_ListBox_universe(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::universe;
  }-*/;

  native static void ProductfeaturetypeEditor_ListBox_universe(ProductfeaturetypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::universe = value;
  }-*/;

  native static TextBox ProductfeaturetypeEditor_TextBox_entityCode(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::entityCode;
  }-*/;

  native static void ProductfeaturetypeEditor_TextBox_entityCode(ProductfeaturetypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::entityCode = value;
  }-*/;

  native static Event ProductfeaturetypeEditor_Event_editEntityEvent(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::editEntityEvent;
  }-*/;

  native static void ProductfeaturetypeEditor_Event_editEntityEvent(ProductfeaturetypeEditor instance, Event<ProductfeaturetypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::editEntityEvent = value;
  }-*/;

  native static AnchorElement ProductfeaturetypeEditor_AnchorElement_listProductfeaturetypesPageLink(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::listProductfeaturetypesPageLink;
  }-*/;

  native static void ProductfeaturetypeEditor_AnchorElement_listProductfeaturetypesPageLink(ProductfeaturetypeEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::listProductfeaturetypesPageLink = value;
  }-*/;

  native static Div ProductfeaturetypeEditor_Div_productfeaturetypeEditor(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::productfeaturetypeEditor;
  }-*/;

  native static void ProductfeaturetypeEditor_Div_productfeaturetypeEditor(ProductfeaturetypeEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::productfeaturetypeEditor = value;
  }-*/;

  native static TextBox ProductfeaturetypeEditor_TextBox_description(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::description;
  }-*/;

  native static void ProductfeaturetypeEditor_TextBox_description(ProductfeaturetypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::description = value;
  }-*/;

  native static TextBox ProductfeaturetypeEditor_TextBox_effectiveDt(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::effectiveDt;
  }-*/;

  native static void ProductfeaturetypeEditor_TextBox_effectiveDt(ProductfeaturetypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::effectiveDt = value;
  }-*/;

  native static Button ProductfeaturetypeEditor_Button_editProductfeaturetypeBtn(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::editProductfeaturetypeBtn;
  }-*/;

  native static void ProductfeaturetypeEditor_Button_editProductfeaturetypeBtn(ProductfeaturetypeEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::editProductfeaturetypeBtn = value;
  }-*/;

  native static DataBinder ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder;
  }-*/;

  native static void ProductfeaturetypePresenter_DataBinder_binder(ProductfeaturetypePresenter instance, DataBinder<Productfeaturetype> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter::binder = value;
  }-*/;

  native static Event ProductfeaturetypeEditor_Event_createEntityEvent(ProductfeaturetypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::createEntityEvent;
  }-*/;

  native static void ProductfeaturetypeEditor_Event_createEntityEvent(ProductfeaturetypeEditor instance, Event<ProductfeaturetypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor::createEntityEvent = value;
  }-*/;
}
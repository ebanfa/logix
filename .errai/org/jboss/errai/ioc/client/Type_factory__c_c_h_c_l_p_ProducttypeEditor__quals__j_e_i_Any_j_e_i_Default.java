package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.producttype.ListProducttypePage;
import com.cloderia.helion.client.local.producttype.ProducttypeEditor;
import com.cloderia.helion.client.local.producttype.ProducttypePresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Producttype;
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

public class Type_factory__c_c_h_c_l_p_ProducttypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(ProducttypeEditor.class, "Type_factory__c_c_h_c_l_p_ProducttypeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_ProducttypeEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/producttype/edit-producttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_ProducttypeEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(ProducttypeEditor.class);
    handle.addAssignableType(ProducttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public ProducttypeEditor createInstance(final ContextManager contextManager) {
    final ProducttypeEditor instance = new ProducttypeEditor();
    setIncompleteInstance(instance);
    final TextBox ProducttypeEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProducttypeEditor_description);
    ProducttypeEditor_TextBox_description(instance, ProducttypeEditor_description);
    final TransitionTo ProducttypeEditor_listProducttypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListProducttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProducttypeEditor_listProducttypesPage);
    ProducttypeEditor_TransitionTo_listProducttypesPage(instance, ProducttypeEditor_listProducttypesPage);
    final Event ProducttypeEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProducttypeEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProducttypeEditor_createEntityEvent);
    ProducttypeEditor_Event_createEntityEvent(instance, ProducttypeEditor_createEntityEvent);
    final TextBox ProducttypeEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProducttypeEditor_name);
    ProducttypeEditor_TextBox_name(instance, ProducttypeEditor_name);
    final Event ProducttypeEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ProducttypeEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, ProducttypeEditor_editEntityEvent);
    ProducttypeEditor_Event_editEntityEvent(instance, ProducttypeEditor_editEntityEvent);
    final TextBox ProducttypeEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProducttypeEditor_entityCode);
    ProducttypeEditor_TextBox_entityCode(instance, ProducttypeEditor_entityCode);
    final TextBox ProducttypeEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProducttypeEditor_effectiveDt);
    ProducttypeEditor_TextBox_effectiveDt(instance, ProducttypeEditor_effectiveDt);
    final DataBinder ProducttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Producttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ProducttypePresenter_binder);
    ProducttypePresenter_DataBinder_binder(instance, ProducttypePresenter_binder);
    final Div ProducttypeEditor_producttypeEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ProducttypeEditor_producttypeEditor);
    ProducttypeEditor_Div_producttypeEditor(instance, ProducttypeEditor_producttypeEditor);
    final ListBox ProducttypeEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ProducttypeEditor_universe);
    ProducttypeEditor_ListBox_universe(instance, ProducttypeEditor_universe);
    c_c_h_c_l_p_ProducttypeEditorTemplateResource templateForProducttypeEditor = GWT.create(c_c_h_c_l_p_ProducttypeEditorTemplateResource.class);
    Element parentElementForTemplateOfProducttypeEditor = TemplateUtil.getRootTemplateParentElement(templateForProducttypeEditor.getContents().getText(), "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", "producttypeEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/producttype/edit-producttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeEditor_Div_producttypeEditor(instance)));
      }
    }, dataFieldElements, "producttypeEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProducttypeEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProducttypeEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProducttypeEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProducttypeEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProducttypeEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ProducttypeEditor_Button_editProducttypeBtn(instance).asWidget();
      }
    }, dataFieldElements, "editProducttypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com/cloderia/helion/client/local/producttype/edit-producttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(ProducttypeEditor_AnchorElement_listProducttypesPageLink(instance));
      }
    }, dataFieldElements, "listProducttypesPageLink");
    templateFieldsMap.put("producttypeEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ProducttypeEditor_Div_producttypeEditor(instance))));
    templateFieldsMap.put("universe", ProducttypeEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", ProducttypeEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", ProducttypeEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", ProducttypeEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", ProducttypeEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editProducttypeBtn", ProducttypeEditor_Button_editProducttypeBtn(instance).asWidget());
    templateFieldsMap.put("listProducttypesPageLink", ElementWrapperWidget.getWidget(ProducttypeEditor_AnchorElement_listProducttypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProducttypeEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editProducttypeBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editProducttype(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listProducttypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = ProducttypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.producttype.ProducttypeEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ProducttypeEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProducttypeEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProducttypeEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(ProducttypeEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProducttypeEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProducttypeEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(ProducttypeEditor_AnchorElement_listProducttypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final ProducttypeEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Div ProducttypeEditor_Div_producttypeEditor(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::producttypeEditor;
  }-*/;

  native static void ProducttypeEditor_Div_producttypeEditor(ProducttypeEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::producttypeEditor = value;
  }-*/;

  native static TextBox ProducttypeEditor_TextBox_effectiveDt(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::effectiveDt;
  }-*/;

  native static void ProducttypeEditor_TextBox_effectiveDt(ProducttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::effectiveDt = value;
  }-*/;

  native static AnchorElement ProducttypeEditor_AnchorElement_listProducttypesPageLink(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::listProducttypesPageLink;
  }-*/;

  native static void ProducttypeEditor_AnchorElement_listProducttypesPageLink(ProducttypeEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::listProducttypesPageLink = value;
  }-*/;

  native static TransitionTo ProducttypeEditor_TransitionTo_listProducttypesPage(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::listProducttypesPage;
  }-*/;

  native static void ProducttypeEditor_TransitionTo_listProducttypesPage(ProducttypeEditor instance, TransitionTo<ListProducttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::listProducttypesPage = value;
  }-*/;

  native static Button ProducttypeEditor_Button_editProducttypeBtn(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::editProducttypeBtn;
  }-*/;

  native static void ProducttypeEditor_Button_editProducttypeBtn(ProducttypeEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::editProducttypeBtn = value;
  }-*/;

  native static TextBox ProducttypeEditor_TextBox_name(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::name;
  }-*/;

  native static void ProducttypeEditor_TextBox_name(ProducttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::name = value;
  }-*/;

  native static TextBox ProducttypeEditor_TextBox_description(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::description;
  }-*/;

  native static void ProducttypeEditor_TextBox_description(ProducttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::description = value;
  }-*/;

  native static DataBinder ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder;
  }-*/;

  native static void ProducttypePresenter_DataBinder_binder(ProducttypePresenter instance, DataBinder<Producttype> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypePresenter::binder = value;
  }-*/;

  native static TextBox ProducttypeEditor_TextBox_entityCode(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::entityCode;
  }-*/;

  native static void ProducttypeEditor_TextBox_entityCode(ProducttypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::entityCode = value;
  }-*/;

  native static ListBox ProducttypeEditor_ListBox_universe(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::universe;
  }-*/;

  native static void ProducttypeEditor_ListBox_universe(ProducttypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::universe = value;
  }-*/;

  native static Event ProducttypeEditor_Event_createEntityEvent(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::createEntityEvent;
  }-*/;

  native static void ProducttypeEditor_Event_createEntityEvent(ProducttypeEditor instance, Event<ProducttypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::createEntityEvent = value;
  }-*/;

  native static Event ProducttypeEditor_Event_editEntityEvent(ProducttypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::editEntityEvent;
  }-*/;

  native static void ProducttypeEditor_Event_editEntityEvent(ProducttypeEditor instance, Event<ProducttypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.producttype.ProducttypeEditor::editEntityEvent = value;
  }-*/;
}
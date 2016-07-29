package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.supplierproduct.ListSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Supplierproduct;
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

public class Type_factory__c_c_h_c_l_s_SupplierproductEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SupplierproductEditor.class, "Type_factory__c_c_h_c_l_s_SupplierproductEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SupplierproductEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SupplierproductEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SupplierproductEditor.class);
    handle.addAssignableType(SupplierproductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SupplierproductEditor createInstance(final ContextManager contextManager) {
    final SupplierproductEditor instance = new SupplierproductEditor();
    setIncompleteInstance(instance);
    final Div SupplierproductEditor_supplierproductEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductEditor_supplierproductEditor);
    SupplierproductEditor_Div_supplierproductEditor(instance, SupplierproductEditor_supplierproductEditor);
    final TextBox SupplierproductEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_entityCode);
    SupplierproductEditor_TextBox_entityCode(instance, SupplierproductEditor_entityCode);
    final Event SupplierproductEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SupplierproductEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, SupplierproductEditor_createEntityEvent);
    SupplierproductEditor_Event_createEntityEvent(instance, SupplierproductEditor_createEntityEvent);
    final ListBox SupplierproductEditor_pref = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_pref);
    SupplierproductEditor_ListBox_pref(instance, SupplierproductEditor_pref);
    final DataBinder SupplierproductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Supplierproduct.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SupplierproductPresenter_binder);
    SupplierproductPresenter_DataBinder_binder(instance, SupplierproductPresenter_binder);
    final ListBox SupplierproductEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_universe);
    SupplierproductEditor_ListBox_universe(instance, SupplierproductEditor_universe);
    final TextBox SupplierproductEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_name);
    SupplierproductEditor_TextBox_name(instance, SupplierproductEditor_name);
    final TextBox SupplierproductEditor_availFromDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_availFromDt);
    SupplierproductEditor_TextBox_availFromDt(instance, SupplierproductEditor_availFromDt);
    final TextBox SupplierproductEditor_availToDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_availToDt);
    SupplierproductEditor_TextBox_availToDt(instance, SupplierproductEditor_availToDt);
    final ListBox SupplierproductEditor_prod = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_prod);
    SupplierproductEditor_ListBox_prod(instance, SupplierproductEditor_prod);
    final ListBox SupplierproductEditor_supplier = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_supplier);
    SupplierproductEditor_ListBox_supplier(instance, SupplierproductEditor_supplier);
    final Event SupplierproductEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SupplierproductEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, SupplierproductEditor_editEntityEvent);
    SupplierproductEditor_Event_editEntityEvent(instance, SupplierproductEditor_editEntityEvent);
    final ListBox SupplierproductEditor_rating = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_rating);
    SupplierproductEditor_ListBox_rating(instance, SupplierproductEditor_rating);
    final TextBox SupplierproductEditor_remarks = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SupplierproductEditor_remarks);
    SupplierproductEditor_TextBox_remarks(instance, SupplierproductEditor_remarks);
    final TransitionTo SupplierproductEditor_listSupplierproductsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListSupplierproductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SupplierproductEditor_listSupplierproductsPage);
    SupplierproductEditor_TransitionTo_listSupplierproductsPage(instance, SupplierproductEditor_listSupplierproductsPage);
    c_c_h_c_l_s_SupplierproductEditorTemplateResource templateForSupplierproductEditor = GWT.create(c_c_h_c_l_s_SupplierproductEditorTemplateResource.class);
    Element parentElementForTemplateOfSupplierproductEditor = TemplateUtil.getRootTemplateParentElement(templateForSupplierproductEditor.getContents().getText(), "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", "supplierproductEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductEditor_Div_supplierproductEditor(instance)));
      }
    }, dataFieldElements, "supplierproductEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_ListBox_supplier(instance).asWidget();
      }
    }, dataFieldElements, "supplier");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_ListBox_rating(instance).asWidget();
      }
    }, dataFieldElements, "rating");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_ListBox_prod(instance).asWidget();
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_ListBox_pref(instance).asWidget();
      }
    }, dataFieldElements, "pref");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_TextBox_availFromDt(instance).asWidget();
      }
    }, dataFieldElements, "availFromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_TextBox_availToDt(instance).asWidget();
      }
    }, dataFieldElements, "availToDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_TextBox_remarks(instance).asWidget();
      }
    }, dataFieldElements, "remarks");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SupplierproductEditor_Button_editSupplierproductBtn(instance).asWidget();
      }
    }, dataFieldElements, "editSupplierproductBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com/cloderia/helion/client/local/supplierproduct/edit-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SupplierproductEditor_AnchorElement_listSupplierproductsPageLink(instance));
      }
    }, dataFieldElements, "listSupplierproductsPageLink");
    templateFieldsMap.put("supplierproductEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductEditor_Div_supplierproductEditor(instance))));
    templateFieldsMap.put("supplier", SupplierproductEditor_ListBox_supplier(instance).asWidget());
    templateFieldsMap.put("rating", SupplierproductEditor_ListBox_rating(instance).asWidget());
    templateFieldsMap.put("universe", SupplierproductEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("prod", SupplierproductEditor_ListBox_prod(instance).asWidget());
    templateFieldsMap.put("pref", SupplierproductEditor_ListBox_pref(instance).asWidget());
    templateFieldsMap.put("entityCode", SupplierproductEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", SupplierproductEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("availFromDt", SupplierproductEditor_TextBox_availFromDt(instance).asWidget());
    templateFieldsMap.put("availToDt", SupplierproductEditor_TextBox_availToDt(instance).asWidget());
    templateFieldsMap.put("remarks", SupplierproductEditor_TextBox_remarks(instance).asWidget());
    templateFieldsMap.put("editSupplierproductBtn", SupplierproductEditor_Button_editSupplierproductBtn(instance).asWidget());
    templateFieldsMap.put("listSupplierproductsPageLink", ElementWrapperWidget.getWidget(SupplierproductEditor_AnchorElement_listSupplierproductsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editSupplierproductBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editSupplierproduct(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listSupplierproductsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = SupplierproductPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(SupplierproductEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(SupplierproductEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(SupplierproductEditor_TextBox_availFromDt(instance), "availFromDt", new DateConverter(), null, false);
    binder.bind(SupplierproductEditor_TextBox_availToDt(instance), "availToDt", new DateConverter(), null, false);
    binder.bind(SupplierproductEditor_TextBox_remarks(instance), "remarks", Convert.getConverter(String.class, String.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SupplierproductEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final SupplierproductEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SupplierproductEditor_AnchorElement_listSupplierproductsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SupplierproductEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement SupplierproductEditor_AnchorElement_listSupplierproductsPageLink(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::listSupplierproductsPageLink;
  }-*/;

  native static void SupplierproductEditor_AnchorElement_listSupplierproductsPageLink(SupplierproductEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::listSupplierproductsPageLink = value;
  }-*/;

  native static ListBox SupplierproductEditor_ListBox_universe(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::universe;
  }-*/;

  native static void SupplierproductEditor_ListBox_universe(SupplierproductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::universe = value;
  }-*/;

  native static Event SupplierproductEditor_Event_editEntityEvent(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::editEntityEvent;
  }-*/;

  native static void SupplierproductEditor_Event_editEntityEvent(SupplierproductEditor instance, Event<SupplierproductEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::editEntityEvent = value;
  }-*/;

  native static TransitionTo SupplierproductEditor_TransitionTo_listSupplierproductsPage(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::listSupplierproductsPage;
  }-*/;

  native static void SupplierproductEditor_TransitionTo_listSupplierproductsPage(SupplierproductEditor instance, TransitionTo<ListSupplierproductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::listSupplierproductsPage = value;
  }-*/;

  native static TextBox SupplierproductEditor_TextBox_availToDt(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::availToDt;
  }-*/;

  native static void SupplierproductEditor_TextBox_availToDt(SupplierproductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::availToDt = value;
  }-*/;

  native static Button SupplierproductEditor_Button_editSupplierproductBtn(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::editSupplierproductBtn;
  }-*/;

  native static void SupplierproductEditor_Button_editSupplierproductBtn(SupplierproductEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::editSupplierproductBtn = value;
  }-*/;

  native static Div SupplierproductEditor_Div_supplierproductEditor(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::supplierproductEditor;
  }-*/;

  native static void SupplierproductEditor_Div_supplierproductEditor(SupplierproductEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::supplierproductEditor = value;
  }-*/;

  native static TextBox SupplierproductEditor_TextBox_entityCode(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::entityCode;
  }-*/;

  native static void SupplierproductEditor_TextBox_entityCode(SupplierproductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::entityCode = value;
  }-*/;

  native static TextBox SupplierproductEditor_TextBox_availFromDt(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::availFromDt;
  }-*/;

  native static void SupplierproductEditor_TextBox_availFromDt(SupplierproductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::availFromDt = value;
  }-*/;

  native static ListBox SupplierproductEditor_ListBox_prod(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::prod;
  }-*/;

  native static void SupplierproductEditor_ListBox_prod(SupplierproductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::prod = value;
  }-*/;

  native static ListBox SupplierproductEditor_ListBox_pref(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::pref;
  }-*/;

  native static void SupplierproductEditor_ListBox_pref(SupplierproductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::pref = value;
  }-*/;

  native static DataBinder SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder;
  }-*/;

  native static void SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance, DataBinder<Supplierproduct> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder = value;
  }-*/;

  native static TextBox SupplierproductEditor_TextBox_remarks(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::remarks;
  }-*/;

  native static void SupplierproductEditor_TextBox_remarks(SupplierproductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::remarks = value;
  }-*/;

  native static ListBox SupplierproductEditor_ListBox_supplier(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::supplier;
  }-*/;

  native static void SupplierproductEditor_ListBox_supplier(SupplierproductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::supplier = value;
  }-*/;

  native static ListBox SupplierproductEditor_ListBox_rating(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::rating;
  }-*/;

  native static void SupplierproductEditor_ListBox_rating(SupplierproductEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::rating = value;
  }-*/;

  native static TextBox SupplierproductEditor_TextBox_name(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::name;
  }-*/;

  native static void SupplierproductEditor_TextBox_name(SupplierproductEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::name = value;
  }-*/;

  native static Event SupplierproductEditor_Event_createEntityEvent(SupplierproductEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::createEntityEvent;
  }-*/;

  native static void SupplierproductEditor_Event_createEntityEvent(SupplierproductEditor instance, Event<SupplierproductEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor::createEntityEvent = value;
  }-*/;
}
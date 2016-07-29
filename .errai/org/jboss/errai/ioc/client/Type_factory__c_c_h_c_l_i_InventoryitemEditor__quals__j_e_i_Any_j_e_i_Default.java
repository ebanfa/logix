package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter;
import com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Inventoryitem;
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

public class Type_factory__c_c_h_c_l_i_InventoryitemEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InventoryitemEditor.class, "Type_factory__c_c_h_c_l_i_InventoryitemEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InventoryitemEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InventoryitemEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InventoryitemEditor.class);
    handle.addAssignableType(InventoryitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InventoryitemEditor createInstance(final ContextManager contextManager) {
    final InventoryitemEditor instance = new InventoryitemEditor();
    setIncompleteInstance(instance);
    final Div InventoryitemEditor_inventoryitemEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemEditor_inventoryitemEditor);
    InventoryitemEditor_Div_inventoryitemEditor(instance, InventoryitemEditor_inventoryitemEditor);
    final TextBox InventoryitemEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_description);
    InventoryitemEditor_TextBox_description(instance, InventoryitemEditor_description);
    final ListBox InventoryitemEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_universe);
    InventoryitemEditor_ListBox_universe(instance, InventoryitemEditor_universe);
    final ListBox InventoryitemEditor_prod = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_prod);
    InventoryitemEditor_ListBox_prod(instance, InventoryitemEditor_prod);
    final ListBox InventoryitemEditor_lot = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_lot);
    InventoryitemEditor_ListBox_lot(instance, InventoryitemEditor_lot);
    final TextBox InventoryitemEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_entityCode);
    InventoryitemEditor_TextBox_entityCode(instance, InventoryitemEditor_entityCode);
    final TextBox InventoryitemEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_name);
    InventoryitemEditor_TextBox_name(instance, InventoryitemEditor_name);
    final TransitionTo InventoryitemEditor_listInventoryitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInventoryitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InventoryitemEditor_listInventoryitemsPage);
    InventoryitemEditor_TransitionTo_listInventoryitemsPage(instance, InventoryitemEditor_listInventoryitemsPage);
    final Event InventoryitemEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InventoryitemEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, InventoryitemEditor_createEntityEvent);
    InventoryitemEditor_Event_createEntityEvent(instance, InventoryitemEditor_createEntityEvent);
    final TextBox InventoryitemEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_effectiveDt);
    InventoryitemEditor_TextBox_effectiveDt(instance, InventoryitemEditor_effectiveDt);
    final ListBox InventoryitemEditor_container = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_container);
    InventoryitemEditor_ListBox_container(instance, InventoryitemEditor_container);
    final ListBox InventoryitemEditor_status = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_status);
    InventoryitemEditor_ListBox_status(instance, InventoryitemEditor_status);
    final TextBox InventoryitemEditor_serialNum = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_serialNum);
    InventoryitemEditor_TextBox_serialNum(instance, InventoryitemEditor_serialNum);
    final DataBinder InventoryitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Inventoryitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InventoryitemPresenter_binder);
    InventoryitemPresenter_DataBinder_binder(instance, InventoryitemPresenter_binder);
    final ListBox InventoryitemEditor_itemTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_itemTy);
    InventoryitemEditor_ListBox_itemTy(instance, InventoryitemEditor_itemTy);
    final Event InventoryitemEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InventoryitemEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, InventoryitemEditor_editEntityEvent);
    InventoryitemEditor_Event_editEntityEvent(instance, InventoryitemEditor_editEntityEvent);
    final ListBox InventoryitemEditor_facility = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_facility);
    InventoryitemEditor_ListBox_facility(instance, InventoryitemEditor_facility);
    final TextBox InventoryitemEditor_quantityOnHand = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InventoryitemEditor_quantityOnHand);
    InventoryitemEditor_TextBox_quantityOnHand(instance, InventoryitemEditor_quantityOnHand);
    c_c_h_c_l_i_InventoryitemEditorTemplateResource templateForInventoryitemEditor = GWT.create(c_c_h_c_l_i_InventoryitemEditorTemplateResource.class);
    Element parentElementForTemplateOfInventoryitemEditor = TemplateUtil.getRootTemplateParentElement(templateForInventoryitemEditor.getContents().getText(), "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", "inventoryitemEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemEditor_Div_inventoryitemEditor(instance)));
      }
    }, dataFieldElements, "inventoryitemEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_ListBox_lot(instance).asWidget();
      }
    }, dataFieldElements, "lot");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_ListBox_container(instance).asWidget();
      }
    }, dataFieldElements, "container");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_ListBox_status(instance).asWidget();
      }
    }, dataFieldElements, "status");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_ListBox_itemTy(instance).asWidget();
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_ListBox_prod(instance).asWidget();
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_ListBox_facility(instance).asWidget();
      }
    }, dataFieldElements, "facility");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_TextBox_quantityOnHand(instance).asWidget();
      }
    }, dataFieldElements, "quantityOnHand");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_TextBox_serialNum(instance).asWidget();
      }
    }, dataFieldElements, "serialNum");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InventoryitemEditor_Button_editInventoryitemBtn(instance).asWidget();
      }
    }, dataFieldElements, "editInventoryitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com/cloderia/helion/client/local/inventoryitem/edit-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InventoryitemEditor_AnchorElement_listInventoryitemsPageLink(instance));
      }
    }, dataFieldElements, "listInventoryitemsPageLink");
    templateFieldsMap.put("inventoryitemEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemEditor_Div_inventoryitemEditor(instance))));
    templateFieldsMap.put("lot", InventoryitemEditor_ListBox_lot(instance).asWidget());
    templateFieldsMap.put("container", InventoryitemEditor_ListBox_container(instance).asWidget());
    templateFieldsMap.put("status", InventoryitemEditor_ListBox_status(instance).asWidget());
    templateFieldsMap.put("itemTy", InventoryitemEditor_ListBox_itemTy(instance).asWidget());
    templateFieldsMap.put("universe", InventoryitemEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("prod", InventoryitemEditor_ListBox_prod(instance).asWidget());
    templateFieldsMap.put("facility", InventoryitemEditor_ListBox_facility(instance).asWidget());
    templateFieldsMap.put("entityCode", InventoryitemEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", InventoryitemEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", InventoryitemEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("quantityOnHand", InventoryitemEditor_TextBox_quantityOnHand(instance).asWidget());
    templateFieldsMap.put("serialNum", InventoryitemEditor_TextBox_serialNum(instance).asWidget());
    templateFieldsMap.put("effectiveDt", InventoryitemEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editInventoryitemBtn", InventoryitemEditor_Button_editInventoryitemBtn(instance).asWidget());
    templateFieldsMap.put("listInventoryitemsPageLink", ElementWrapperWidget.getWidget(InventoryitemEditor_AnchorElement_listInventoryitemsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editInventoryitemBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editInventoryitem(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInventoryitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InventoryitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(InventoryitemEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InventoryitemEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InventoryitemEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InventoryitemEditor_TextBox_quantityOnHand(instance), "quantityOnHand", Convert.getConverter(Integer.class, String.class), null, false);
    binder.bind(InventoryitemEditor_TextBox_serialNum(instance), "serialNum", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InventoryitemEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InventoryitemEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final InventoryitemEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InventoryitemEditor_AnchorElement_listInventoryitemsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InventoryitemEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox InventoryitemEditor_ListBox_prod(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::prod;
  }-*/;

  native static void InventoryitemEditor_ListBox_prod(InventoryitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::prod = value;
  }-*/;

  native static ListBox InventoryitemEditor_ListBox_status(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::status;
  }-*/;

  native static void InventoryitemEditor_ListBox_status(InventoryitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::status = value;
  }-*/;

  native static ListBox InventoryitemEditor_ListBox_facility(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::facility;
  }-*/;

  native static void InventoryitemEditor_ListBox_facility(InventoryitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::facility = value;
  }-*/;

  native static TextBox InventoryitemEditor_TextBox_entityCode(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::entityCode;
  }-*/;

  native static void InventoryitemEditor_TextBox_entityCode(InventoryitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::entityCode = value;
  }-*/;

  native static TextBox InventoryitemEditor_TextBox_description(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::description;
  }-*/;

  native static void InventoryitemEditor_TextBox_description(InventoryitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::description = value;
  }-*/;

  native static Event InventoryitemEditor_Event_createEntityEvent(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::createEntityEvent;
  }-*/;

  native static void InventoryitemEditor_Event_createEntityEvent(InventoryitemEditor instance, Event<InventoryitemEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::createEntityEvent = value;
  }-*/;

  native static Event InventoryitemEditor_Event_editEntityEvent(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::editEntityEvent;
  }-*/;

  native static void InventoryitemEditor_Event_editEntityEvent(InventoryitemEditor instance, Event<InventoryitemEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::editEntityEvent = value;
  }-*/;

  native static ListBox InventoryitemEditor_ListBox_container(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::container;
  }-*/;

  native static void InventoryitemEditor_ListBox_container(InventoryitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::container = value;
  }-*/;

  native static TextBox InventoryitemEditor_TextBox_quantityOnHand(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::quantityOnHand;
  }-*/;

  native static void InventoryitemEditor_TextBox_quantityOnHand(InventoryitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::quantityOnHand = value;
  }-*/;

  native static TransitionTo InventoryitemEditor_TransitionTo_listInventoryitemsPage(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::listInventoryitemsPage;
  }-*/;

  native static void InventoryitemEditor_TransitionTo_listInventoryitemsPage(InventoryitemEditor instance, TransitionTo<ListInventoryitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::listInventoryitemsPage = value;
  }-*/;

  native static ListBox InventoryitemEditor_ListBox_universe(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::universe;
  }-*/;

  native static void InventoryitemEditor_ListBox_universe(InventoryitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::universe = value;
  }-*/;

  native static Button InventoryitemEditor_Button_editInventoryitemBtn(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::editInventoryitemBtn;
  }-*/;

  native static void InventoryitemEditor_Button_editInventoryitemBtn(InventoryitemEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::editInventoryitemBtn = value;
  }-*/;

  native static ListBox InventoryitemEditor_ListBox_itemTy(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::itemTy;
  }-*/;

  native static void InventoryitemEditor_ListBox_itemTy(InventoryitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::itemTy = value;
  }-*/;

  native static TextBox InventoryitemEditor_TextBox_serialNum(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::serialNum;
  }-*/;

  native static void InventoryitemEditor_TextBox_serialNum(InventoryitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::serialNum = value;
  }-*/;

  native static AnchorElement InventoryitemEditor_AnchorElement_listInventoryitemsPageLink(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::listInventoryitemsPageLink;
  }-*/;

  native static void InventoryitemEditor_AnchorElement_listInventoryitemsPageLink(InventoryitemEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::listInventoryitemsPageLink = value;
  }-*/;

  native static DataBinder InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder;
  }-*/;

  native static void InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance, DataBinder<Inventoryitem> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder = value;
  }-*/;

  native static Div InventoryitemEditor_Div_inventoryitemEditor(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::inventoryitemEditor;
  }-*/;

  native static void InventoryitemEditor_Div_inventoryitemEditor(InventoryitemEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::inventoryitemEditor = value;
  }-*/;

  native static TextBox InventoryitemEditor_TextBox_name(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::name;
  }-*/;

  native static void InventoryitemEditor_TextBox_name(InventoryitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::name = value;
  }-*/;

  native static TextBox InventoryitemEditor_TextBox_effectiveDt(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::effectiveDt;
  }-*/;

  native static void InventoryitemEditor_TextBox_effectiveDt(InventoryitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::effectiveDt = value;
  }-*/;

  native static ListBox InventoryitemEditor_ListBox_lot(InventoryitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::lot;
  }-*/;

  native static void InventoryitemEditor_ListBox_lot(InventoryitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor::lot = value;
  }-*/;
}
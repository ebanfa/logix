package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter;
import com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Invoiceitem;
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
import java.math.BigDecimal;
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

public class Type_factory__c_c_h_c_l_i_InvoiceitemEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceitemEditor.class, "Type_factory__c_c_h_c_l_i_InvoiceitemEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceitemEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceitemEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceitemEditor.class);
    handle.addAssignableType(InvoiceitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoiceitemEditor createInstance(final ContextManager contextManager) {
    final InvoiceitemEditor instance = new InvoiceitemEditor();
    setIncompleteInstance(instance);
    final TextBox InvoiceitemEditor_quantity = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_quantity);
    InvoiceitemEditor_TextBox_quantity(instance, InvoiceitemEditor_quantity);
    final ListBox InvoiceitemEditor_invoice = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_invoice);
    InvoiceitemEditor_ListBox_invoice(instance, InvoiceitemEditor_invoice);
    final ListBox InvoiceitemEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_universe);
    InvoiceitemEditor_ListBox_universe(instance, InvoiceitemEditor_universe);
    final TextBox InvoiceitemEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_entityCode);
    InvoiceitemEditor_TextBox_entityCode(instance, InvoiceitemEditor_entityCode);
    final ListBox InvoiceitemEditor_itemTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_itemTy);
    InvoiceitemEditor_ListBox_itemTy(instance, InvoiceitemEditor_itemTy);
    final ListBox InvoiceitemEditor_prodFeat = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_prodFeat);
    InvoiceitemEditor_ListBox_prodFeat(instance, InvoiceitemEditor_prodFeat);
    final TextBox InvoiceitemEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_name);
    InvoiceitemEditor_TextBox_name(instance, InvoiceitemEditor_name);
    final Div InvoiceitemEditor_invoiceitemEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemEditor_invoiceitemEditor);
    InvoiceitemEditor_Div_invoiceitemEditor(instance, InvoiceitemEditor_invoiceitemEditor);
    final TransitionTo InvoiceitemEditor_listInvoiceitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoiceitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceitemEditor_listInvoiceitemsPage);
    InvoiceitemEditor_TransitionTo_listInvoiceitemsPage(instance, InvoiceitemEditor_listInvoiceitemsPage);
    final TextBox InvoiceitemEditor_unitPrice = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_unitPrice);
    InvoiceitemEditor_TextBox_unitPrice(instance, InvoiceitemEditor_unitPrice);
    final Event InvoiceitemEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceitemEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceitemEditor_createEntityEvent);
    InvoiceitemEditor_Event_createEntityEvent(instance, InvoiceitemEditor_createEntityEvent);
    final TextBox InvoiceitemEditor_itemDescription = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_itemDescription);
    InvoiceitemEditor_TextBox_itemDescription(instance, InvoiceitemEditor_itemDescription);
    final ListBox InvoiceitemEditor_prod = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_prod);
    InvoiceitemEditor_ListBox_prod(instance, InvoiceitemEditor_prod);
    final TextBox InvoiceitemEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_effectiveDt);
    InvoiceitemEditor_TextBox_effectiveDt(instance, InvoiceitemEditor_effectiveDt);
    final Event InvoiceitemEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceitemEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceitemEditor_editEntityEvent);
    InvoiceitemEditor_Event_editEntityEvent(instance, InvoiceitemEditor_editEntityEvent);
    final DataBinder InvoiceitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceitemPresenter_binder);
    InvoiceitemPresenter_DataBinder_binder(instance, InvoiceitemPresenter_binder);
    final TextBox InvoiceitemEditor_amount = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_amount);
    InvoiceitemEditor_TextBox_amount(instance, InvoiceitemEditor_amount);
    final ListBox InvoiceitemEditor_inventoryItem = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_inventoryItem);
    InvoiceitemEditor_ListBox_inventoryItem(instance, InvoiceitemEditor_inventoryItem);
    final ListBox InvoiceitemEditor_soldWithItem = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceitemEditor_soldWithItem);
    InvoiceitemEditor_ListBox_soldWithItem(instance, InvoiceitemEditor_soldWithItem);
    c_c_h_c_l_i_InvoiceitemEditorTemplateResource templateForInvoiceitemEditor = GWT.create(c_c_h_c_l_i_InvoiceitemEditorTemplateResource.class);
    Element parentElementForTemplateOfInvoiceitemEditor = TemplateUtil.getRootTemplateParentElement(templateForInvoiceitemEditor.getContents().getText(), "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", "invoiceitemEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemEditor_Div_invoiceitemEditor(instance)));
      }
    }, dataFieldElements, "invoiceitemEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_ListBox_itemTy(instance).asWidget();
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_ListBox_prodFeat(instance).asWidget();
      }
    }, dataFieldElements, "prodFeat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_ListBox_soldWithItem(instance).asWidget();
      }
    }, dataFieldElements, "soldWithItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_ListBox_invoice(instance).asWidget();
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_ListBox_inventoryItem(instance).asWidget();
      }
    }, dataFieldElements, "inventoryItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_ListBox_prod(instance).asWidget();
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_TextBox_itemDescription(instance).asWidget();
      }
    }, dataFieldElements, "itemDescription");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_TextBox_quantity(instance).asWidget();
      }
    }, dataFieldElements, "quantity");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_TextBox_amount(instance).asWidget();
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_TextBox_unitPrice(instance).asWidget();
      }
    }, dataFieldElements, "unitPrice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceitemEditor_Button_editInvoiceitemBtn(instance).asWidget();
      }
    }, dataFieldElements, "editInvoiceitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com/cloderia/helion/client/local/invoiceitem/edit-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceitemEditor_AnchorElement_listInvoiceitemsPageLink(instance));
      }
    }, dataFieldElements, "listInvoiceitemsPageLink");
    templateFieldsMap.put("invoiceitemEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemEditor_Div_invoiceitemEditor(instance))));
    templateFieldsMap.put("itemTy", InvoiceitemEditor_ListBox_itemTy(instance).asWidget());
    templateFieldsMap.put("prodFeat", InvoiceitemEditor_ListBox_prodFeat(instance).asWidget());
    templateFieldsMap.put("soldWithItem", InvoiceitemEditor_ListBox_soldWithItem(instance).asWidget());
    templateFieldsMap.put("invoice", InvoiceitemEditor_ListBox_invoice(instance).asWidget());
    templateFieldsMap.put("inventoryItem", InvoiceitemEditor_ListBox_inventoryItem(instance).asWidget());
    templateFieldsMap.put("universe", InvoiceitemEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("prod", InvoiceitemEditor_ListBox_prod(instance).asWidget());
    templateFieldsMap.put("entityCode", InvoiceitemEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", InvoiceitemEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("itemDescription", InvoiceitemEditor_TextBox_itemDescription(instance).asWidget());
    templateFieldsMap.put("quantity", InvoiceitemEditor_TextBox_quantity(instance).asWidget());
    templateFieldsMap.put("amount", InvoiceitemEditor_TextBox_amount(instance).asWidget());
    templateFieldsMap.put("unitPrice", InvoiceitemEditor_TextBox_unitPrice(instance).asWidget());
    templateFieldsMap.put("effectiveDt", InvoiceitemEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editInvoiceitemBtn", InvoiceitemEditor_Button_editInvoiceitemBtn(instance).asWidget());
    templateFieldsMap.put("listInvoiceitemsPageLink", ElementWrapperWidget.getWidget(InvoiceitemEditor_AnchorElement_listInvoiceitemsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editInvoiceitemBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editInvoiceitem(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoiceitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InvoiceitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(InvoiceitemEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoiceitemEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoiceitemEditor_TextBox_itemDescription(instance), "itemDescription", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoiceitemEditor_TextBox_quantity(instance), "quantity", Convert.getConverter(Integer.class, String.class), null, false);
    binder.bind(InvoiceitemEditor_TextBox_amount(instance), "amount", Convert.getConverter(BigDecimal.class, String.class), null, false);
    binder.bind(InvoiceitemEditor_TextBox_unitPrice(instance), "unitPrice", Convert.getConverter(BigDecimal.class, String.class), null, false);
    binder.bind(InvoiceitemEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceitemEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceitemEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceitemEditor_AnchorElement_listInvoiceitemsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceitemEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox InvoiceitemEditor_TextBox_entityCode(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::entityCode;
  }-*/;

  native static void InvoiceitemEditor_TextBox_entityCode(InvoiceitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::entityCode = value;
  }-*/;

  native static TextBox InvoiceitemEditor_TextBox_unitPrice(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::unitPrice;
  }-*/;

  native static void InvoiceitemEditor_TextBox_unitPrice(InvoiceitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::unitPrice = value;
  }-*/;

  native static Event InvoiceitemEditor_Event_editEntityEvent(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::editEntityEvent;
  }-*/;

  native static void InvoiceitemEditor_Event_editEntityEvent(InvoiceitemEditor instance, Event<InvoiceitemEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::editEntityEvent = value;
  }-*/;

  native static Div InvoiceitemEditor_Div_invoiceitemEditor(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::invoiceitemEditor;
  }-*/;

  native static void InvoiceitemEditor_Div_invoiceitemEditor(InvoiceitemEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::invoiceitemEditor = value;
  }-*/;

  native static ListBox InvoiceitemEditor_ListBox_inventoryItem(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::inventoryItem;
  }-*/;

  native static void InvoiceitemEditor_ListBox_inventoryItem(InvoiceitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::inventoryItem = value;
  }-*/;

  native static AnchorElement InvoiceitemEditor_AnchorElement_listInvoiceitemsPageLink(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::listInvoiceitemsPageLink;
  }-*/;

  native static void InvoiceitemEditor_AnchorElement_listInvoiceitemsPageLink(InvoiceitemEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::listInvoiceitemsPageLink = value;
  }-*/;

  native static TextBox InvoiceitemEditor_TextBox_itemDescription(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::itemDescription;
  }-*/;

  native static void InvoiceitemEditor_TextBox_itemDescription(InvoiceitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::itemDescription = value;
  }-*/;

  native static ListBox InvoiceitemEditor_ListBox_soldWithItem(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::soldWithItem;
  }-*/;

  native static void InvoiceitemEditor_ListBox_soldWithItem(InvoiceitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::soldWithItem = value;
  }-*/;

  native static TextBox InvoiceitemEditor_TextBox_effectiveDt(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::effectiveDt;
  }-*/;

  native static void InvoiceitemEditor_TextBox_effectiveDt(InvoiceitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::effectiveDt = value;
  }-*/;

  native static ListBox InvoiceitemEditor_ListBox_prodFeat(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::prodFeat;
  }-*/;

  native static void InvoiceitemEditor_ListBox_prodFeat(InvoiceitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::prodFeat = value;
  }-*/;

  native static ListBox InvoiceitemEditor_ListBox_invoice(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::invoice;
  }-*/;

  native static void InvoiceitemEditor_ListBox_invoice(InvoiceitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::invoice = value;
  }-*/;

  native static ListBox InvoiceitemEditor_ListBox_itemTy(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::itemTy;
  }-*/;

  native static void InvoiceitemEditor_ListBox_itemTy(InvoiceitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::itemTy = value;
  }-*/;

  native static TextBox InvoiceitemEditor_TextBox_amount(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::amount;
  }-*/;

  native static void InvoiceitemEditor_TextBox_amount(InvoiceitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::amount = value;
  }-*/;

  native static Event InvoiceitemEditor_Event_createEntityEvent(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::createEntityEvent;
  }-*/;

  native static void InvoiceitemEditor_Event_createEntityEvent(InvoiceitemEditor instance, Event<InvoiceitemEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::createEntityEvent = value;
  }-*/;

  native static TextBox InvoiceitemEditor_TextBox_name(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::name;
  }-*/;

  native static void InvoiceitemEditor_TextBox_name(InvoiceitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::name = value;
  }-*/;

  native static Button InvoiceitemEditor_Button_editInvoiceitemBtn(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::editInvoiceitemBtn;
  }-*/;

  native static void InvoiceitemEditor_Button_editInvoiceitemBtn(InvoiceitemEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::editInvoiceitemBtn = value;
  }-*/;

  native static TransitionTo InvoiceitemEditor_TransitionTo_listInvoiceitemsPage(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::listInvoiceitemsPage;
  }-*/;

  native static void InvoiceitemEditor_TransitionTo_listInvoiceitemsPage(InvoiceitemEditor instance, TransitionTo<ListInvoiceitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::listInvoiceitemsPage = value;
  }-*/;

  native static ListBox InvoiceitemEditor_ListBox_prod(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::prod;
  }-*/;

  native static void InvoiceitemEditor_ListBox_prod(InvoiceitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::prod = value;
  }-*/;

  native static DataBinder InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder;
  }-*/;

  native static void InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance, DataBinder<Invoiceitem> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder = value;
  }-*/;

  native static ListBox InvoiceitemEditor_ListBox_universe(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::universe;
  }-*/;

  native static void InvoiceitemEditor_ListBox_universe(InvoiceitemEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::universe = value;
  }-*/;

  native static TextBox InvoiceitemEditor_TextBox_quantity(InvoiceitemEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::quantity;
  }-*/;

  native static void InvoiceitemEditor_TextBox_quantity(InvoiceitemEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor::quantity = value;
  }-*/;
}
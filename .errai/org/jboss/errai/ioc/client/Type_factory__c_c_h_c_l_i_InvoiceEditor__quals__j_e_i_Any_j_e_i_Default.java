package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoice.InvoiceEditor;
import com.cloderia.helion.client.local.invoice.InvoicePresenter;
import com.cloderia.helion.client.local.invoice.ListInvoicePage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Invoice;
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

public class Type_factory__c_c_h_c_l_i_InvoiceEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceEditor.class, "Type_factory__c_c_h_c_l_i_InvoiceEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoice/edit-invoice-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceEditor.class);
    handle.addAssignableType(InvoicePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoiceEditor createInstance(final ContextManager contextManager) {
    final InvoiceEditor instance = new InvoiceEditor();
    setIncompleteInstance(instance);
    final TextBox InvoiceEditor_message = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_message);
    InvoiceEditor_TextBox_message(instance, InvoiceEditor_message);
    final ListBox InvoiceEditor_toParty = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_toParty);
    InvoiceEditor_ListBox_toParty(instance, InvoiceEditor_toParty);
    final ListBox InvoiceEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_universe);
    InvoiceEditor_ListBox_universe(instance, InvoiceEditor_universe);
    final TransitionTo InvoiceEditor_listInvoicesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoicePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceEditor_listInvoicesPage);
    InvoiceEditor_TransitionTo_listInvoicesPage(instance, InvoiceEditor_listInvoicesPage);
    final Div InvoiceEditor_invoiceEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceEditor_invoiceEditor);
    InvoiceEditor_Div_invoiceEditor(instance, InvoiceEditor_invoiceEditor);
    final ListBox InvoiceEditor_fromContMech = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_fromContMech);
    InvoiceEditor_ListBox_fromContMech(instance, InvoiceEditor_fromContMech);
    final Event InvoiceEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceEditor_editEntityEvent);
    InvoiceEditor_Event_editEntityEvent(instance, InvoiceEditor_editEntityEvent);
    final Event InvoiceEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceEditor_createEntityEvent);
    InvoiceEditor_Event_createEntityEvent(instance, InvoiceEditor_createEntityEvent);
    final TextBox InvoiceEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_entityCode);
    InvoiceEditor_TextBox_entityCode(instance, InvoiceEditor_entityCode);
    final TextBox InvoiceEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_effectiveDt);
    InvoiceEditor_TextBox_effectiveDt(instance, InvoiceEditor_effectiveDt);
    final TextBox InvoiceEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_name);
    InvoiceEditor_TextBox_name(instance, InvoiceEditor_name);
    final DataBinder InvoicePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoice.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicePresenter_binder);
    InvoicePresenter_DataBinder_binder(instance, InvoicePresenter_binder);
    final TextBox InvoiceEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_description);
    InvoiceEditor_TextBox_description(instance, InvoiceEditor_description);
    final ListBox InvoiceEditor_billingAcct = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoiceEditor_billingAcct);
    InvoiceEditor_ListBox_billingAcct(instance, InvoiceEditor_billingAcct);
    c_c_h_c_l_i_InvoiceEditorTemplateResource templateForInvoiceEditor = GWT.create(c_c_h_c_l_i_InvoiceEditorTemplateResource.class);
    Element parentElementForTemplateOfInvoiceEditor = TemplateUtil.getRootTemplateParentElement(templateForInvoiceEditor.getContents().getText(), "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", "invoiceEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoice/edit-invoice-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceEditor_Div_invoiceEditor(instance)));
      }
    }, dataFieldElements, "invoiceEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_ListBox_fromContMech(instance).asWidget();
      }
    }, dataFieldElements, "fromContMech");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_ListBox_toParty(instance).asWidget();
      }
    }, dataFieldElements, "toParty");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_ListBox_billingAcct(instance).asWidget();
      }
    }, dataFieldElements, "billingAcct");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_TextBox_message(instance).asWidget();
      }
    }, dataFieldElements, "message");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoiceEditor_Button_editInvoiceBtn(instance).asWidget();
      }
    }, dataFieldElements, "editInvoiceBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com/cloderia/helion/client/local/invoice/edit-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceEditor_AnchorElement_listInvoicesPageLink(instance));
      }
    }, dataFieldElements, "listInvoicesPageLink");
    templateFieldsMap.put("invoiceEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceEditor_Div_invoiceEditor(instance))));
    templateFieldsMap.put("fromContMech", InvoiceEditor_ListBox_fromContMech(instance).asWidget());
    templateFieldsMap.put("toParty", InvoiceEditor_ListBox_toParty(instance).asWidget());
    templateFieldsMap.put("universe", InvoiceEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("billingAcct", InvoiceEditor_ListBox_billingAcct(instance).asWidget());
    templateFieldsMap.put("entityCode", InvoiceEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", InvoiceEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", InvoiceEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("message", InvoiceEditor_TextBox_message(instance).asWidget());
    templateFieldsMap.put("effectiveDt", InvoiceEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editInvoiceBtn", InvoiceEditor_Button_editInvoiceBtn(instance).asWidget());
    templateFieldsMap.put("listInvoicesPageLink", ElementWrapperWidget.getWidget(InvoiceEditor_AnchorElement_listInvoicesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editInvoiceBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editInvoice(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoicesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InvoicePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoice.InvoiceEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(InvoiceEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoiceEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoiceEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoiceEditor_TextBox_message(instance), "message", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoiceEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceEditor_AnchorElement_listInvoicesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox InvoiceEditor_TextBox_message(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::message;
  }-*/;

  native static void InvoiceEditor_TextBox_message(InvoiceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::message = value;
  }-*/;

  native static Button InvoiceEditor_Button_editInvoiceBtn(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::editInvoiceBtn;
  }-*/;

  native static void InvoiceEditor_Button_editInvoiceBtn(InvoiceEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::editInvoiceBtn = value;
  }-*/;

  native static AnchorElement InvoiceEditor_AnchorElement_listInvoicesPageLink(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::listInvoicesPageLink;
  }-*/;

  native static void InvoiceEditor_AnchorElement_listInvoicesPageLink(InvoiceEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::listInvoicesPageLink = value;
  }-*/;

  native static TransitionTo InvoiceEditor_TransitionTo_listInvoicesPage(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::listInvoicesPage;
  }-*/;

  native static void InvoiceEditor_TransitionTo_listInvoicesPage(InvoiceEditor instance, TransitionTo<ListInvoicePage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::listInvoicesPage = value;
  }-*/;

  native static TextBox InvoiceEditor_TextBox_description(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::description;
  }-*/;

  native static void InvoiceEditor_TextBox_description(InvoiceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::description = value;
  }-*/;

  native static ListBox InvoiceEditor_ListBox_fromContMech(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::fromContMech;
  }-*/;

  native static void InvoiceEditor_ListBox_fromContMech(InvoiceEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::fromContMech = value;
  }-*/;

  native static TextBox InvoiceEditor_TextBox_entityCode(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::entityCode;
  }-*/;

  native static void InvoiceEditor_TextBox_entityCode(InvoiceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::entityCode = value;
  }-*/;

  native static Event InvoiceEditor_Event_createEntityEvent(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::createEntityEvent;
  }-*/;

  native static void InvoiceEditor_Event_createEntityEvent(InvoiceEditor instance, Event<InvoiceEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::createEntityEvent = value;
  }-*/;

  native static DataBinder InvoicePresenter_DataBinder_binder(InvoicePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder;
  }-*/;

  native static void InvoicePresenter_DataBinder_binder(InvoicePresenter instance, DataBinder<Invoice> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder = value;
  }-*/;

  native static TextBox InvoiceEditor_TextBox_name(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::name;
  }-*/;

  native static void InvoiceEditor_TextBox_name(InvoiceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::name = value;
  }-*/;

  native static ListBox InvoiceEditor_ListBox_universe(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::universe;
  }-*/;

  native static void InvoiceEditor_ListBox_universe(InvoiceEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::universe = value;
  }-*/;

  native static ListBox InvoiceEditor_ListBox_billingAcct(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::billingAcct;
  }-*/;

  native static void InvoiceEditor_ListBox_billingAcct(InvoiceEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::billingAcct = value;
  }-*/;

  native static Event InvoiceEditor_Event_editEntityEvent(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::editEntityEvent;
  }-*/;

  native static void InvoiceEditor_Event_editEntityEvent(InvoiceEditor instance, Event<InvoiceEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::editEntityEvent = value;
  }-*/;

  native static Div InvoiceEditor_Div_invoiceEditor(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::invoiceEditor;
  }-*/;

  native static void InvoiceEditor_Div_invoiceEditor(InvoiceEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::invoiceEditor = value;
  }-*/;

  native static TextBox InvoiceEditor_TextBox_effectiveDt(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::effectiveDt;
  }-*/;

  native static void InvoiceEditor_TextBox_effectiveDt(InvoiceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::effectiveDt = value;
  }-*/;

  native static ListBox InvoiceEditor_ListBox_toParty(InvoiceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::toParty;
  }-*/;

  native static void InvoiceEditor_ListBox_toParty(InvoiceEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceEditor::toParty = value;
  }-*/;
}
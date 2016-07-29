package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter;
import com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Invoiceterm;
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

public class Type_factory__c_c_h_c_l_i_InvoicetermEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoicetermEditor.class, "Type_factory__c_c_h_c_l_i_InvoicetermEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoicetermEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoicetermEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoicetermEditor.class);
    handle.addAssignableType(InvoicetermPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoicetermEditor createInstance(final ContextManager contextManager) {
    final InvoicetermEditor instance = new InvoicetermEditor();
    setIncompleteInstance(instance);
    final Event InvoicetermEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoicetermEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoicetermEditor_createEntityEvent);
    InvoicetermEditor_Event_createEntityEvent(instance, InvoicetermEditor_createEntityEvent);
    final ListBox InvoicetermEditor_termTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_termTy);
    InvoicetermEditor_ListBox_termTy(instance, InvoicetermEditor_termTy);
    final TextBox InvoicetermEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_entityCode);
    InvoicetermEditor_TextBox_entityCode(instance, InvoicetermEditor_entityCode);
    final TextBox InvoicetermEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_effectiveDt);
    InvoicetermEditor_TextBox_effectiveDt(instance, InvoicetermEditor_effectiveDt);
    final TransitionTo InvoicetermEditor_listInvoicetermsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoicetermPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicetermEditor_listInvoicetermsPage);
    InvoicetermEditor_TransitionTo_listInvoicetermsPage(instance, InvoicetermEditor_listInvoicetermsPage);
    final ListBox InvoicetermEditor_invoice = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_invoice);
    InvoicetermEditor_ListBox_invoice(instance, InvoicetermEditor_invoice);
    final ListBox InvoicetermEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_universe);
    InvoicetermEditor_ListBox_universe(instance, InvoicetermEditor_universe);
    final TextBox InvoicetermEditor_termValue = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_termValue);
    InvoicetermEditor_TextBox_termValue(instance, InvoicetermEditor_termValue);
    final DataBinder InvoicetermPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceterm.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicetermPresenter_binder);
    InvoicetermPresenter_DataBinder_binder(instance, InvoicetermPresenter_binder);
    final Div InvoicetermEditor_invoicetermEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermEditor_invoicetermEditor);
    InvoicetermEditor_Div_invoicetermEditor(instance, InvoicetermEditor_invoicetermEditor);
    final ListBox InvoicetermEditor_invoiceItem = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_invoiceItem);
    InvoicetermEditor_ListBox_invoiceItem(instance, InvoicetermEditor_invoiceItem);
    final TextBox InvoicetermEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, InvoicetermEditor_name);
    InvoicetermEditor_TextBox_name(instance, InvoicetermEditor_name);
    final Event InvoicetermEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoicetermEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoicetermEditor_editEntityEvent);
    InvoicetermEditor_Event_editEntityEvent(instance, InvoicetermEditor_editEntityEvent);
    c_c_h_c_l_i_InvoicetermEditorTemplateResource templateForInvoicetermEditor = GWT.create(c_c_h_c_l_i_InvoicetermEditorTemplateResource.class);
    Element parentElementForTemplateOfInvoicetermEditor = TemplateUtil.getRootTemplateParentElement(templateForInvoicetermEditor.getContents().getText(), "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", "invoicetermEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermEditor_Div_invoicetermEditor(instance)));
      }
    }, dataFieldElements, "invoicetermEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_ListBox_termTy(instance).asWidget();
      }
    }, dataFieldElements, "termTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_ListBox_invoiceItem(instance).asWidget();
      }
    }, dataFieldElements, "invoiceItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_ListBox_invoice(instance).asWidget();
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_TextBox_termValue(instance).asWidget();
      }
    }, dataFieldElements, "termValue");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return InvoicetermEditor_Button_editInvoicetermBtn(instance).asWidget();
      }
    }, dataFieldElements, "editInvoicetermBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com/cloderia/helion/client/local/invoiceterm/edit-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoicetermEditor_AnchorElement_listInvoicetermsPageLink(instance));
      }
    }, dataFieldElements, "listInvoicetermsPageLink");
    templateFieldsMap.put("invoicetermEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermEditor_Div_invoicetermEditor(instance))));
    templateFieldsMap.put("termTy", InvoicetermEditor_ListBox_termTy(instance).asWidget());
    templateFieldsMap.put("invoiceItem", InvoicetermEditor_ListBox_invoiceItem(instance).asWidget());
    templateFieldsMap.put("invoice", InvoicetermEditor_ListBox_invoice(instance).asWidget());
    templateFieldsMap.put("universe", InvoicetermEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", InvoicetermEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", InvoicetermEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("termValue", InvoicetermEditor_TextBox_termValue(instance).asWidget());
    templateFieldsMap.put("effectiveDt", InvoicetermEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editInvoicetermBtn", InvoicetermEditor_Button_editInvoicetermBtn(instance).asWidget());
    templateFieldsMap.put("listInvoicetermsPageLink", ElementWrapperWidget.getWidget(InvoicetermEditor_AnchorElement_listInvoicetermsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editInvoicetermBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editInvoiceterm(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoicetermsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InvoicetermPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(InvoicetermEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoicetermEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(InvoicetermEditor_TextBox_termValue(instance), "termValue", Convert.getConverter(Integer.class, String.class), null, false);
    binder.bind(InvoicetermEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoicetermEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoicetermEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoicetermEditor_AnchorElement_listInvoicetermsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoicetermEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox InvoicetermEditor_TextBox_termValue(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::termValue;
  }-*/;

  native static void InvoicetermEditor_TextBox_termValue(InvoicetermEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::termValue = value;
  }-*/;

  native static Button InvoicetermEditor_Button_editInvoicetermBtn(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::editInvoicetermBtn;
  }-*/;

  native static void InvoicetermEditor_Button_editInvoicetermBtn(InvoicetermEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::editInvoicetermBtn = value;
  }-*/;

  native static TransitionTo InvoicetermEditor_TransitionTo_listInvoicetermsPage(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::listInvoicetermsPage;
  }-*/;

  native static void InvoicetermEditor_TransitionTo_listInvoicetermsPage(InvoicetermEditor instance, TransitionTo<ListInvoicetermPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::listInvoicetermsPage = value;
  }-*/;

  native static ListBox InvoicetermEditor_ListBox_universe(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::universe;
  }-*/;

  native static void InvoicetermEditor_ListBox_universe(InvoicetermEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::universe = value;
  }-*/;

  native static Event InvoicetermEditor_Event_editEntityEvent(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::editEntityEvent;
  }-*/;

  native static void InvoicetermEditor_Event_editEntityEvent(InvoicetermEditor instance, Event<InvoicetermEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::editEntityEvent = value;
  }-*/;

  native static DataBinder InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder;
  }-*/;

  native static void InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance, DataBinder<Invoiceterm> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder = value;
  }-*/;

  native static Div InvoicetermEditor_Div_invoicetermEditor(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::invoicetermEditor;
  }-*/;

  native static void InvoicetermEditor_Div_invoicetermEditor(InvoicetermEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::invoicetermEditor = value;
  }-*/;

  native static ListBox InvoicetermEditor_ListBox_termTy(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::termTy;
  }-*/;

  native static void InvoicetermEditor_ListBox_termTy(InvoicetermEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::termTy = value;
  }-*/;

  native static AnchorElement InvoicetermEditor_AnchorElement_listInvoicetermsPageLink(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::listInvoicetermsPageLink;
  }-*/;

  native static void InvoicetermEditor_AnchorElement_listInvoicetermsPageLink(InvoicetermEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::listInvoicetermsPageLink = value;
  }-*/;

  native static Event InvoicetermEditor_Event_createEntityEvent(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::createEntityEvent;
  }-*/;

  native static void InvoicetermEditor_Event_createEntityEvent(InvoicetermEditor instance, Event<InvoicetermEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::createEntityEvent = value;
  }-*/;

  native static TextBox InvoicetermEditor_TextBox_effectiveDt(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::effectiveDt;
  }-*/;

  native static void InvoicetermEditor_TextBox_effectiveDt(InvoicetermEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::effectiveDt = value;
  }-*/;

  native static TextBox InvoicetermEditor_TextBox_name(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::name;
  }-*/;

  native static void InvoicetermEditor_TextBox_name(InvoicetermEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::name = value;
  }-*/;

  native static ListBox InvoicetermEditor_ListBox_invoiceItem(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::invoiceItem;
  }-*/;

  native static void InvoicetermEditor_ListBox_invoiceItem(InvoicetermEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::invoiceItem = value;
  }-*/;

  native static TextBox InvoicetermEditor_TextBox_entityCode(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::entityCode;
  }-*/;

  native static void InvoicetermEditor_TextBox_entityCode(InvoicetermEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::entityCode = value;
  }-*/;

  native static ListBox InvoicetermEditor_ListBox_invoice(InvoicetermEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::invoice;
  }-*/;

  native static void InvoicetermEditor_ListBox_invoice(InvoicetermEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor::invoice = value;
  }-*/;
}
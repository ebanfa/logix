package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay;
import com.cloderia.helion.client.local.invoice.InvoicePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Invoice;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.dom.TableRow;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.BoundUtil;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_i_InvoiceListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceListItemDisplay.class, "Type_factory__c_c_h_c_l_i_InvoiceListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoice/list-invoice-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceListItemDisplay.class);
    handle.addAssignableType(InvoicePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoiceListItemDisplay createInstance(final ContextManager contextManager) {
    final InvoiceListItemDisplay instance = new InvoiceListItemDisplay();
    setIncompleteInstance(instance);
    final TableRow InvoiceListItemDisplay_invoiceItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_invoiceItem);
    InvoiceListItemDisplay_TableRow_invoiceItem(instance, InvoiceListItemDisplay_invoiceItem);
    final TableCell InvoiceListItemDisplay_billingAcct = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_billingAcct);
    InvoiceListItemDisplay_TableCell_billingAcct(instance, InvoiceListItemDisplay_billingAcct);
    final Event InvoiceListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceListItemDisplay_renderSingleViewEvent);
    InvoiceListItemDisplay_Event_renderSingleViewEvent(instance, InvoiceListItemDisplay_renderSingleViewEvent);
    final TableCell InvoiceListItemDisplay_toParty = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_toParty);
    InvoiceListItemDisplay_TableCell_toParty(instance, InvoiceListItemDisplay_toParty);
    final AnchorElement InvoiceListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_editEntityListItemBtn);
    InvoiceListItemDisplay_AnchorElement_editEntityListItemBtn(instance, InvoiceListItemDisplay_editEntityListItemBtn);
    final TableCell InvoiceListItemDisplay_message = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_message);
    InvoiceListItemDisplay_TableCell_message(instance, InvoiceListItemDisplay_message);
    final Event InvoiceListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceListItemDisplay_renderEditViewEvent);
    InvoiceListItemDisplay_Event_renderEditViewEvent(instance, InvoiceListItemDisplay_renderEditViewEvent);
    final DataBinder InvoicePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoice.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicePresenter_binder);
    InvoicePresenter_DataBinder_binder(instance, InvoicePresenter_binder);
    final Event InvoiceListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceListItemDisplay_deleteEntityEvent);
    InvoiceListItemDisplay_Event_deleteEntityEvent(instance, InvoiceListItemDisplay_deleteEntityEvent);
    final TableCell InvoiceListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_entityCode);
    InvoiceListItemDisplay_TableCell_entityCode(instance, InvoiceListItemDisplay_entityCode);
    final TableCell InvoiceListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_name);
    InvoiceListItemDisplay_TableCell_name(instance, InvoiceListItemDisplay_name);
    final AnchorElement InvoiceListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_deleteEntityListItemBtn);
    InvoiceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, InvoiceListItemDisplay_deleteEntityListItemBtn);
    final TableCell InvoiceListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_description);
    InvoiceListItemDisplay_TableCell_description(instance, InvoiceListItemDisplay_description);
    final TableCell InvoiceListItemDisplay_fromContMech = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_fromContMech);
    InvoiceListItemDisplay_TableCell_fromContMech(instance, InvoiceListItemDisplay_fromContMech);
    final TableCell InvoiceListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceListItemDisplay_effectiveDt);
    InvoiceListItemDisplay_TableCell_effectiveDt(instance, InvoiceListItemDisplay_effectiveDt);
    c_c_h_c_l_i_InvoiceListItemDisplayTemplateResource templateForInvoiceListItemDisplay = GWT.create(c_c_h_c_l_i_InvoiceListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfInvoiceListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForInvoiceListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/invoice/list-invoice-page.html", "invoiceItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoice/list-invoice-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableRow_invoiceItem(instance)));
      }
    }, dataFieldElements, "invoiceItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_fromContMech(instance)));
      }
    }, dataFieldElements, "fromContMech");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_toParty(instance)));
      }
    }, dataFieldElements, "toParty");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_billingAcct(instance)));
      }
    }, dataFieldElements, "billingAcct");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_message(instance)));
      }
    }, dataFieldElements, "message");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com/cloderia/helion/client/local/invoice/list-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("invoiceItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableRow_invoiceItem(instance))));
    templateFieldsMap.put("fromContMech", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_fromContMech(instance))));
    templateFieldsMap.put("toParty", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_toParty(instance))));
    templateFieldsMap.put("billingAcct", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_billingAcct(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("message", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_message(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(InvoiceListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(InvoiceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceListItemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderEditView(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderDeleteView(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InvoicePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_fromContMech(instance))), "fromContMech.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_toParty(instance))), "toParty.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_billingAcct(instance))), "billingAcct.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_message(instance))), "message", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableRow InvoiceListItemDisplay_TableRow_invoiceItem(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::invoiceItem;
  }-*/;

  native static void InvoiceListItemDisplay_TableRow_invoiceItem(InvoiceListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::invoiceItem = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_effectiveDt(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::effectiveDt;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_effectiveDt(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::effectiveDt = value;
  }-*/;

  native static AnchorElement InvoiceListItemDisplay_AnchorElement_deleteEntityListItemBtn(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void InvoiceListItemDisplay_AnchorElement_deleteEntityListItemBtn(InvoiceListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event InvoiceListItemDisplay_Event_deleteEntityEvent(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void InvoiceListItemDisplay_Event_deleteEntityEvent(InvoiceListItemDisplay instance, Event<InvoiceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_description(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::description;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_description(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::description = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_message(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::message;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_message(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::message = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_toParty(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::toParty;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_toParty(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::toParty = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_entityCode(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::entityCode;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_entityCode(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::entityCode = value;
  }-*/;

  native static DataBinder InvoicePresenter_DataBinder_binder(InvoicePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder;
  }-*/;

  native static void InvoicePresenter_DataBinder_binder(InvoicePresenter instance, DataBinder<Invoice> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder = value;
  }-*/;

  native static Event InvoiceListItemDisplay_Event_renderSingleViewEvent(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void InvoiceListItemDisplay_Event_renderSingleViewEvent(InvoiceListItemDisplay instance, Event<InvoiceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static AnchorElement InvoiceListItemDisplay_AnchorElement_editEntityListItemBtn(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void InvoiceListItemDisplay_AnchorElement_editEntityListItemBtn(InvoiceListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event InvoiceListItemDisplay_Event_renderEditViewEvent(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void InvoiceListItemDisplay_Event_renderEditViewEvent(InvoiceListItemDisplay instance, Event<InvoiceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_name(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::name;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_name(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::name = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_fromContMech(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::fromContMech;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_fromContMech(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::fromContMech = value;
  }-*/;

  native static TableCell InvoiceListItemDisplay_TableCell_billingAcct(InvoiceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::billingAcct;
  }-*/;

  native static void InvoiceListItemDisplay_TableCell_billingAcct(InvoiceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay::billingAcct = value;
  }-*/;
}
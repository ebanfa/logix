package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Invoiceterm;
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

public class Type_factory__c_c_h_c_l_i_InvoicetermListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoicetermListItemDisplay.class, "Type_factory__c_c_h_c_l_i_InvoicetermListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoicetermListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoicetermListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoicetermListItemDisplay.class);
    handle.addAssignableType(InvoicetermPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoicetermListItemDisplay createInstance(final ContextManager contextManager) {
    final InvoicetermListItemDisplay instance = new InvoicetermListItemDisplay();
    setIncompleteInstance(instance);
    final AnchorElement InvoicetermListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_deleteEntityListItemBtn);
    InvoicetermListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, InvoicetermListItemDisplay_deleteEntityListItemBtn);
    final TableCell InvoicetermListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_name);
    InvoicetermListItemDisplay_TableCell_name(instance, InvoicetermListItemDisplay_name);
    final DataBinder InvoicetermPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceterm.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicetermPresenter_binder);
    InvoicetermPresenter_DataBinder_binder(instance, InvoicetermPresenter_binder);
    final Event InvoicetermListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoicetermListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_renderEditViewEvent);
    InvoicetermListItemDisplay_Event_renderEditViewEvent(instance, InvoicetermListItemDisplay_renderEditViewEvent);
    final Event InvoicetermListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoicetermListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_renderSingleViewEvent);
    InvoicetermListItemDisplay_Event_renderSingleViewEvent(instance, InvoicetermListItemDisplay_renderSingleViewEvent);
    final TableCell InvoicetermListItemDisplay_invoiceItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_invoiceItem);
    InvoicetermListItemDisplay_TableCell_invoiceItem(instance, InvoicetermListItemDisplay_invoiceItem);
    final AnchorElement InvoicetermListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_editEntityListItemBtn);
    InvoicetermListItemDisplay_AnchorElement_editEntityListItemBtn(instance, InvoicetermListItemDisplay_editEntityListItemBtn);
    final TableCell InvoicetermListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_entityCode);
    InvoicetermListItemDisplay_TableCell_entityCode(instance, InvoicetermListItemDisplay_entityCode);
    final TableCell InvoicetermListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_effectiveDt);
    InvoicetermListItemDisplay_TableCell_effectiveDt(instance, InvoicetermListItemDisplay_effectiveDt);
    final TableCell InvoicetermListItemDisplay_invoice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_invoice);
    InvoicetermListItemDisplay_TableCell_invoice(instance, InvoicetermListItemDisplay_invoice);
    final TableRow InvoicetermListItemDisplay_invoicetermItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_invoicetermItem);
    InvoicetermListItemDisplay_TableRow_invoicetermItem(instance, InvoicetermListItemDisplay_invoicetermItem);
    final TableCell InvoicetermListItemDisplay_termValue = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_termValue);
    InvoicetermListItemDisplay_TableCell_termValue(instance, InvoicetermListItemDisplay_termValue);
    final Event InvoicetermListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoicetermListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_deleteEntityEvent);
    InvoicetermListItemDisplay_Event_deleteEntityEvent(instance, InvoicetermListItemDisplay_deleteEntityEvent);
    final TableCell InvoicetermListItemDisplay_termTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermListItemDisplay_termTy);
    InvoicetermListItemDisplay_TableCell_termTy(instance, InvoicetermListItemDisplay_termTy);
    c_c_h_c_l_i_InvoicetermListItemDisplayTemplateResource templateForInvoicetermListItemDisplay = GWT.create(c_c_h_c_l_i_InvoicetermListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfInvoicetermListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForInvoicetermListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", "invoicetermItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableRow_invoicetermItem(instance)));
      }
    }, dataFieldElements, "invoicetermItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_termTy(instance)));
      }
    }, dataFieldElements, "termTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_invoiceItem(instance)));
      }
    }, dataFieldElements, "invoiceItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_invoice(instance)));
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_termValue(instance)));
      }
    }, dataFieldElements, "termValue");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoicetermListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com/cloderia/helion/client/local/invoiceterm/list-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoicetermListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("invoicetermItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableRow_invoicetermItem(instance))));
    templateFieldsMap.put("termTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_termTy(instance))));
    templateFieldsMap.put("invoiceItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_invoiceItem(instance))));
    templateFieldsMap.put("invoice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_invoice(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("termValue", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_termValue(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(InvoicetermListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(InvoicetermListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = InvoicetermPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermListItemDisplay_TableCell_termTy(instance))), "termTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermListItemDisplay_TableCell_invoiceItem(instance))), "invoiceItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermListItemDisplay_TableCell_invoice(instance))), "invoice.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermListItemDisplay_TableCell_termValue(instance))), "termValue", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoicetermListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoicetermListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoicetermListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoicetermListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoicetermListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event InvoicetermListItemDisplay_Event_renderSingleViewEvent(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void InvoicetermListItemDisplay_Event_renderSingleViewEvent(InvoicetermListItemDisplay instance, Event<InvoicetermListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static AnchorElement InvoicetermListItemDisplay_AnchorElement_editEntityListItemBtn(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void InvoicetermListItemDisplay_AnchorElement_editEntityListItemBtn(InvoicetermListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static DataBinder InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder;
  }-*/;

  native static void InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance, DataBinder<Invoiceterm> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder = value;
  }-*/;

  native static AnchorElement InvoicetermListItemDisplay_AnchorElement_deleteEntityListItemBtn(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void InvoicetermListItemDisplay_AnchorElement_deleteEntityListItemBtn(InvoicetermListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell InvoicetermListItemDisplay_TableCell_entityCode(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::entityCode;
  }-*/;

  native static void InvoicetermListItemDisplay_TableCell_entityCode(InvoicetermListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell InvoicetermListItemDisplay_TableCell_name(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::name;
  }-*/;

  native static void InvoicetermListItemDisplay_TableCell_name(InvoicetermListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::name = value;
  }-*/;

  native static Event InvoicetermListItemDisplay_Event_deleteEntityEvent(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void InvoicetermListItemDisplay_Event_deleteEntityEvent(InvoicetermListItemDisplay instance, Event<InvoicetermListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableRow InvoicetermListItemDisplay_TableRow_invoicetermItem(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::invoicetermItem;
  }-*/;

  native static void InvoicetermListItemDisplay_TableRow_invoicetermItem(InvoicetermListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::invoicetermItem = value;
  }-*/;

  native static TableCell InvoicetermListItemDisplay_TableCell_termValue(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::termValue;
  }-*/;

  native static void InvoicetermListItemDisplay_TableCell_termValue(InvoicetermListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::termValue = value;
  }-*/;

  native static Event InvoicetermListItemDisplay_Event_renderEditViewEvent(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void InvoicetermListItemDisplay_Event_renderEditViewEvent(InvoicetermListItemDisplay instance, Event<InvoicetermListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell InvoicetermListItemDisplay_TableCell_invoice(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::invoice;
  }-*/;

  native static void InvoicetermListItemDisplay_TableCell_invoice(InvoicetermListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::invoice = value;
  }-*/;

  native static TableCell InvoicetermListItemDisplay_TableCell_effectiveDt(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::effectiveDt;
  }-*/;

  native static void InvoicetermListItemDisplay_TableCell_effectiveDt(InvoicetermListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell InvoicetermListItemDisplay_TableCell_invoiceItem(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::invoiceItem;
  }-*/;

  native static void InvoicetermListItemDisplay_TableCell_invoiceItem(InvoicetermListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::invoiceItem = value;
  }-*/;

  native static TableCell InvoicetermListItemDisplay_TableCell_termTy(InvoicetermListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::termTy;
  }-*/;

  native static void InvoicetermListItemDisplay_TableCell_termTy(InvoicetermListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay::termTy = value;
  }-*/;
}
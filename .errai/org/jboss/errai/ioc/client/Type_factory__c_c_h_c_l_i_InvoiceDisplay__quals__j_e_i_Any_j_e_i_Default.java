package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoice.InvoiceDisplay;
import com.cloderia.helion.client.local.invoice.InvoicePresenter;
import com.cloderia.helion.client.local.invoice.ListInvoicePage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.TableCell;
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
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_i_InvoiceDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceDisplay.class, "Type_factory__c_c_h_c_l_i_InvoiceDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoice/view-invoice-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceDisplay.class);
    handle.addAssignableType(InvoicePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoiceDisplay createInstance(final ContextManager contextManager) {
    final InvoiceDisplay instance = new InvoiceDisplay();
    setIncompleteInstance(instance);
    final Heading InvoiceDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, InvoiceDisplay_code);
    InvoiceDisplay_Heading_code(instance, InvoiceDisplay_code);
    final TableCell InvoiceDisplay_message = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_message);
    InvoiceDisplay_TableCell_message(instance, InvoiceDisplay_message);
    final Span InvoiceDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_createdDt);
    InvoiceDisplay_Span_createdDt(instance, InvoiceDisplay_createdDt);
    final TableCell InvoiceDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_description);
    InvoiceDisplay_TableCell_description(instance, InvoiceDisplay_description);
    final TableCell InvoiceDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_effectiveDt);
    InvoiceDisplay_TableCell_effectiveDt(instance, InvoiceDisplay_effectiveDt);
    final TableCell InvoiceDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_entityCode);
    InvoiceDisplay_TableCell_entityCode(instance, InvoiceDisplay_entityCode);
    final Div InvoiceDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_entityDisplayComponent);
    InvoiceDisplay_Div_entityDisplayComponent(instance, InvoiceDisplay_entityDisplayComponent);
    final Span InvoiceDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_lastModifiedDt);
    InvoiceDisplay_Span_lastModifiedDt(instance, InvoiceDisplay_lastModifiedDt);
    final TableCell InvoiceDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_name);
    InvoiceDisplay_TableCell_name(instance, InvoiceDisplay_name);
    final TableCell InvoiceDisplay_toParty = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_toParty);
    InvoiceDisplay_TableCell_toParty(instance, InvoiceDisplay_toParty);
    final TableCell InvoiceDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_universe);
    InvoiceDisplay_TableCell_universe(instance, InvoiceDisplay_universe);
    final TableCell InvoiceDisplay_billingAcct = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_billingAcct);
    InvoiceDisplay_TableCell_billingAcct(instance, InvoiceDisplay_billingAcct);
    final Event InvoiceDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceDisplay_renderEditViewEvent);
    InvoiceDisplay_Event_renderEditViewEvent(instance, InvoiceDisplay_renderEditViewEvent);
    final Event InvoiceDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceDisplay_deleteEntityEvent);
    InvoiceDisplay_Event_deleteEntityEvent(instance, InvoiceDisplay_deleteEntityEvent);
    final TableCell InvoiceDisplay_fromContMech = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceDisplay_fromContMech);
    InvoiceDisplay_TableCell_fromContMech(instance, InvoiceDisplay_fromContMech);
    final TransitionTo InvoiceDisplay_listInvoicesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoicePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceDisplay_listInvoicesPage);
    InvoiceDisplay_TransitionTo_listInvoicesPage(instance, InvoiceDisplay_listInvoicesPage);
    final DataBinder InvoicePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoice.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicePresenter_binder);
    InvoicePresenter_DataBinder_binder(instance, InvoicePresenter_binder);
    c_c_h_c_l_i_InvoiceDisplayTemplateResource templateForInvoiceDisplay = GWT.create(c_c_h_c_l_i_InvoiceDisplayTemplateResource.class);
    Element parentElementForTemplateOfInvoiceDisplay = TemplateUtil.getRootTemplateParentElement(templateForInvoiceDisplay.getContents().getText(), "com/cloderia/helion/client/local/invoice/view-invoice-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoice/view-invoice-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_fromContMech(instance)));
      }
    }, dataFieldElements, "fromContMech");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_toParty(instance)));
      }
    }, dataFieldElements, "toParty");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_billingAcct(instance)));
      }
    }, dataFieldElements, "billingAcct");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_message(instance)));
      }
    }, dataFieldElements, "message");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_editInvoiceBtn(instance));
      }
    }, dataFieldElements, "editInvoiceBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_deleteInvoiceBtn(instance));
      }
    }, dataFieldElements, "deleteInvoiceBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com/cloderia/helion/client/local/invoice/view-invoice-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_listInvoicesPageLink(instance));
      }
    }, dataFieldElements, "listInvoicesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("fromContMech", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_fromContMech(instance))));
    templateFieldsMap.put("toParty", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_toParty(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("billingAcct", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_billingAcct(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_description(instance))));
    templateFieldsMap.put("message", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_message(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editInvoiceBtn", ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_editInvoiceBtn(instance)));
    templateFieldsMap.put("deleteInvoiceBtn", ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_deleteInvoiceBtn(instance)));
    templateFieldsMap.put("listInvoicesPageLink", ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_listInvoicesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editInvoiceBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditInvoiceBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteInvoiceBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteInvoiceBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoicesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InvoicePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoice.InvoiceDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_fromContMech(instance))), "fromContMech.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_toParty(instance))), "toParty.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_billingAcct(instance))), "billingAcct.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_message(instance))), "message", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_editInvoiceBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_deleteInvoiceBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceDisplay_AnchorElement_listInvoicesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell InvoiceDisplay_TableCell_toParty(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::toParty;
  }-*/;

  native static void InvoiceDisplay_TableCell_toParty(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::toParty = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_universe(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::universe;
  }-*/;

  native static void InvoiceDisplay_TableCell_universe(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::universe = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_billingAcct(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::billingAcct;
  }-*/;

  native static void InvoiceDisplay_TableCell_billingAcct(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::billingAcct = value;
  }-*/;

  native static TransitionTo InvoiceDisplay_TransitionTo_listInvoicesPage(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::listInvoicesPage;
  }-*/;

  native static void InvoiceDisplay_TransitionTo_listInvoicesPage(InvoiceDisplay instance, TransitionTo<ListInvoicePage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::listInvoicesPage = value;
  }-*/;

  native static Span InvoiceDisplay_Span_createdDt(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::createdDt;
  }-*/;

  native static void InvoiceDisplay_Span_createdDt(InvoiceDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::createdDt = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_effectiveDt(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::effectiveDt;
  }-*/;

  native static void InvoiceDisplay_TableCell_effectiveDt(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::effectiveDt = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_message(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::message;
  }-*/;

  native static void InvoiceDisplay_TableCell_message(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::message = value;
  }-*/;

  native static Event InvoiceDisplay_Event_deleteEntityEvent(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::deleteEntityEvent;
  }-*/;

  native static void InvoiceDisplay_Event_deleteEntityEvent(InvoiceDisplay instance, Event<InvoiceDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::deleteEntityEvent = value;
  }-*/;

  native static Div InvoiceDisplay_Div_entityDisplayComponent(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::entityDisplayComponent;
  }-*/;

  native static void InvoiceDisplay_Div_entityDisplayComponent(InvoiceDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_description(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::description;
  }-*/;

  native static void InvoiceDisplay_TableCell_description(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::description = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_fromContMech(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::fromContMech;
  }-*/;

  native static void InvoiceDisplay_TableCell_fromContMech(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::fromContMech = value;
  }-*/;

  native static Heading InvoiceDisplay_Heading_code(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::code;
  }-*/;

  native static void InvoiceDisplay_Heading_code(InvoiceDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::code = value;
  }-*/;

  native static DataBinder InvoicePresenter_DataBinder_binder(InvoicePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder;
  }-*/;

  native static void InvoicePresenter_DataBinder_binder(InvoicePresenter instance, DataBinder<Invoice> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoicePresenter::binder = value;
  }-*/;

  native static AnchorElement InvoiceDisplay_AnchorElement_editInvoiceBtn(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::editInvoiceBtn;
  }-*/;

  native static void InvoiceDisplay_AnchorElement_editInvoiceBtn(InvoiceDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::editInvoiceBtn = value;
  }-*/;

  native static AnchorElement InvoiceDisplay_AnchorElement_listInvoicesPageLink(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::listInvoicesPageLink;
  }-*/;

  native static void InvoiceDisplay_AnchorElement_listInvoicesPageLink(InvoiceDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::listInvoicesPageLink = value;
  }-*/;

  native static Event InvoiceDisplay_Event_renderEditViewEvent(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::renderEditViewEvent;
  }-*/;

  native static void InvoiceDisplay_Event_renderEditViewEvent(InvoiceDisplay instance, Event<InvoiceDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement InvoiceDisplay_AnchorElement_deleteInvoiceBtn(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::deleteInvoiceBtn;
  }-*/;

  native static void InvoiceDisplay_AnchorElement_deleteInvoiceBtn(InvoiceDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::deleteInvoiceBtn = value;
  }-*/;

  native static Span InvoiceDisplay_Span_lastModifiedDt(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::lastModifiedDt;
  }-*/;

  native static void InvoiceDisplay_Span_lastModifiedDt(InvoiceDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_entityCode(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::entityCode;
  }-*/;

  native static void InvoiceDisplay_TableCell_entityCode(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::entityCode = value;
  }-*/;

  native static TableCell InvoiceDisplay_TableCell_name(InvoiceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::name;
  }-*/;

  native static void InvoiceDisplay_TableCell_name(InvoiceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoice.InvoiceDisplay::name = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter;
import com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_i_InvoicetermDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoicetermDisplay.class, "Type_factory__c_c_h_c_l_i_InvoicetermDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoicetermDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoicetermDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoicetermDisplay.class);
    handle.addAssignableType(InvoicetermPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoicetermDisplay createInstance(final ContextManager contextManager) {
    final InvoicetermDisplay instance = new InvoicetermDisplay();
    setIncompleteInstance(instance);
    final Event InvoicetermDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoicetermDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InvoicetermDisplay_renderEditViewEvent);
    InvoicetermDisplay_Event_renderEditViewEvent(instance, InvoicetermDisplay_renderEditViewEvent);
    final Span InvoicetermDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_createdDt);
    InvoicetermDisplay_Span_createdDt(instance, InvoicetermDisplay_createdDt);
    final TableCell InvoicetermDisplay_termTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_termTy);
    InvoicetermDisplay_TableCell_termTy(instance, InvoicetermDisplay_termTy);
    final DataBinder InvoicetermPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceterm.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicetermPresenter_binder);
    InvoicetermPresenter_DataBinder_binder(instance, InvoicetermPresenter_binder);
    final TableCell InvoicetermDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_universe);
    InvoicetermDisplay_TableCell_universe(instance, InvoicetermDisplay_universe);
    final TableCell InvoicetermDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_name);
    InvoicetermDisplay_TableCell_name(instance, InvoicetermDisplay_name);
    final TableCell InvoicetermDisplay_termValue = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_termValue);
    InvoicetermDisplay_TableCell_termValue(instance, InvoicetermDisplay_termValue);
    final Event InvoicetermDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoicetermDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoicetermDisplay_deleteEntityEvent);
    InvoicetermDisplay_Event_deleteEntityEvent(instance, InvoicetermDisplay_deleteEntityEvent);
    final Div InvoicetermDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_entityDisplayComponent);
    InvoicetermDisplay_Div_entityDisplayComponent(instance, InvoicetermDisplay_entityDisplayComponent);
    final TableCell InvoicetermDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_entityCode);
    InvoicetermDisplay_TableCell_entityCode(instance, InvoicetermDisplay_entityCode);
    final TableCell InvoicetermDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_effectiveDt);
    InvoicetermDisplay_TableCell_effectiveDt(instance, InvoicetermDisplay_effectiveDt);
    final TableCell InvoicetermDisplay_invoiceItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_invoiceItem);
    InvoicetermDisplay_TableCell_invoiceItem(instance, InvoicetermDisplay_invoiceItem);
    final TableCell InvoicetermDisplay_invoice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_invoice);
    InvoicetermDisplay_TableCell_invoice(instance, InvoicetermDisplay_invoice);
    final Span InvoicetermDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoicetermDisplay_lastModifiedDt);
    InvoicetermDisplay_Span_lastModifiedDt(instance, InvoicetermDisplay_lastModifiedDt);
    final TransitionTo InvoicetermDisplay_listInvoicetermsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoicetermPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoicetermDisplay_listInvoicetermsPage);
    InvoicetermDisplay_TransitionTo_listInvoicetermsPage(instance, InvoicetermDisplay_listInvoicetermsPage);
    final Heading InvoicetermDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, InvoicetermDisplay_code);
    InvoicetermDisplay_Heading_code(instance, InvoicetermDisplay_code);
    c_c_h_c_l_i_InvoicetermDisplayTemplateResource templateForInvoicetermDisplay = GWT.create(c_c_h_c_l_i_InvoicetermDisplayTemplateResource.class);
    Element parentElementForTemplateOfInvoicetermDisplay = TemplateUtil.getRootTemplateParentElement(templateForInvoicetermDisplay.getContents().getText(), "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_termTy(instance)));
      }
    }, dataFieldElements, "termTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_invoiceItem(instance)));
      }
    }, dataFieldElements, "invoiceItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_invoice(instance)));
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_termValue(instance)));
      }
    }, dataFieldElements, "termValue");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_editInvoicetermBtn(instance));
      }
    }, dataFieldElements, "editInvoicetermBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_deleteInvoicetermBtn(instance));
      }
    }, dataFieldElements, "deleteInvoicetermBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com/cloderia/helion/client/local/invoiceterm/view-invoiceterm-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_listInvoicetermsPageLink(instance));
      }
    }, dataFieldElements, "listInvoicetermsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("termTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_termTy(instance))));
    templateFieldsMap.put("invoiceItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_invoiceItem(instance))));
    templateFieldsMap.put("invoice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_invoice(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_name(instance))));
    templateFieldsMap.put("termValue", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_termValue(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoicetermDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editInvoicetermBtn", ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_editInvoicetermBtn(instance)));
    templateFieldsMap.put("deleteInvoicetermBtn", ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_deleteInvoicetermBtn(instance)));
    templateFieldsMap.put("listInvoicetermsPageLink", ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_listInvoicetermsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoicetermDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editInvoicetermBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditInvoicetermBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteInvoicetermBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteInvoicetermBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoicetermsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InvoicetermPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_termTy(instance))), "termTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_invoiceItem(instance))), "invoiceItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_invoice(instance))), "invoice.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_termValue(instance))), "termValue", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoicetermDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoicetermDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoicetermDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_editInvoicetermBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_deleteInvoicetermBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoicetermDisplay_AnchorElement_listInvoicetermsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoicetermDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell InvoicetermDisplay_TableCell_universe(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::universe;
  }-*/;

  native static void InvoicetermDisplay_TableCell_universe(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::universe = value;
  }-*/;

  native static AnchorElement InvoicetermDisplay_AnchorElement_listInvoicetermsPageLink(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::listInvoicetermsPageLink;
  }-*/;

  native static void InvoicetermDisplay_AnchorElement_listInvoicetermsPageLink(InvoicetermDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::listInvoicetermsPageLink = value;
  }-*/;

  native static DataBinder InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder;
  }-*/;

  native static void InvoicetermPresenter_DataBinder_binder(InvoicetermPresenter instance, DataBinder<Invoiceterm> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter::binder = value;
  }-*/;

  native static TableCell InvoicetermDisplay_TableCell_termValue(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::termValue;
  }-*/;

  native static void InvoicetermDisplay_TableCell_termValue(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::termValue = value;
  }-*/;

  native static TableCell InvoicetermDisplay_TableCell_name(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::name;
  }-*/;

  native static void InvoicetermDisplay_TableCell_name(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::name = value;
  }-*/;

  native static Event InvoicetermDisplay_Event_renderEditViewEvent(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::renderEditViewEvent;
  }-*/;

  native static void InvoicetermDisplay_Event_renderEditViewEvent(InvoicetermDisplay instance, Event<InvoicetermDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell InvoicetermDisplay_TableCell_effectiveDt(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::effectiveDt;
  }-*/;

  native static void InvoicetermDisplay_TableCell_effectiveDt(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::effectiveDt = value;
  }-*/;

  native static Span InvoicetermDisplay_Span_createdDt(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::createdDt;
  }-*/;

  native static void InvoicetermDisplay_Span_createdDt(InvoicetermDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::createdDt = value;
  }-*/;

  native static TableCell InvoicetermDisplay_TableCell_entityCode(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::entityCode;
  }-*/;

  native static void InvoicetermDisplay_TableCell_entityCode(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::entityCode = value;
  }-*/;

  native static TransitionTo InvoicetermDisplay_TransitionTo_listInvoicetermsPage(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::listInvoicetermsPage;
  }-*/;

  native static void InvoicetermDisplay_TransitionTo_listInvoicetermsPage(InvoicetermDisplay instance, TransitionTo<ListInvoicetermPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::listInvoicetermsPage = value;
  }-*/;

  native static Span InvoicetermDisplay_Span_lastModifiedDt(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::lastModifiedDt;
  }-*/;

  native static void InvoicetermDisplay_Span_lastModifiedDt(InvoicetermDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell InvoicetermDisplay_TableCell_termTy(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::termTy;
  }-*/;

  native static void InvoicetermDisplay_TableCell_termTy(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::termTy = value;
  }-*/;

  native static AnchorElement InvoicetermDisplay_AnchorElement_editInvoicetermBtn(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::editInvoicetermBtn;
  }-*/;

  native static void InvoicetermDisplay_AnchorElement_editInvoicetermBtn(InvoicetermDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::editInvoicetermBtn = value;
  }-*/;

  native static AnchorElement InvoicetermDisplay_AnchorElement_deleteInvoicetermBtn(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::deleteInvoicetermBtn;
  }-*/;

  native static void InvoicetermDisplay_AnchorElement_deleteInvoicetermBtn(InvoicetermDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::deleteInvoicetermBtn = value;
  }-*/;

  native static TableCell InvoicetermDisplay_TableCell_invoice(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::invoice;
  }-*/;

  native static void InvoicetermDisplay_TableCell_invoice(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::invoice = value;
  }-*/;

  native static Div InvoicetermDisplay_Div_entityDisplayComponent(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::entityDisplayComponent;
  }-*/;

  native static void InvoicetermDisplay_Div_entityDisplayComponent(InvoicetermDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell InvoicetermDisplay_TableCell_invoiceItem(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::invoiceItem;
  }-*/;

  native static void InvoicetermDisplay_TableCell_invoiceItem(InvoicetermDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::invoiceItem = value;
  }-*/;

  native static Heading InvoicetermDisplay_Heading_code(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::code;
  }-*/;

  native static void InvoicetermDisplay_Heading_code(InvoicetermDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::code = value;
  }-*/;

  native static Event InvoicetermDisplay_Event_deleteEntityEvent(InvoicetermDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::deleteEntityEvent;
  }-*/;

  native static void InvoicetermDisplay_Event_deleteEntityEvent(InvoicetermDisplay instance, Event<InvoicetermDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay::deleteEntityEvent = value;
  }-*/;
}
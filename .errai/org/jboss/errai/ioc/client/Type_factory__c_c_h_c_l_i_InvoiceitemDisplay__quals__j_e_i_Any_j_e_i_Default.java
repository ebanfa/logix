package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter;
import com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Invoiceitem;
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

public class Type_factory__c_c_h_c_l_i_InvoiceitemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceitemDisplay.class, "Type_factory__c_c_h_c_l_i_InvoiceitemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceitemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceitemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceitemDisplay.class);
    handle.addAssignableType(InvoiceitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoiceitemDisplay createInstance(final ContextManager contextManager) {
    final InvoiceitemDisplay instance = new InvoiceitemDisplay();
    setIncompleteInstance(instance);
    final Heading InvoiceitemDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, InvoiceitemDisplay_code);
    InvoiceitemDisplay_Heading_code(instance, InvoiceitemDisplay_code);
    final TableCell InvoiceitemDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_amount);
    InvoiceitemDisplay_TableCell_amount(instance, InvoiceitemDisplay_amount);
    final Event InvoiceitemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceitemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceitemDisplay_deleteEntityEvent);
    InvoiceitemDisplay_Event_deleteEntityEvent(instance, InvoiceitemDisplay_deleteEntityEvent);
    final TableCell InvoiceitemDisplay_prod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_prod);
    InvoiceitemDisplay_TableCell_prod(instance, InvoiceitemDisplay_prod);
    final TableCell InvoiceitemDisplay_invoice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_invoice);
    InvoiceitemDisplay_TableCell_invoice(instance, InvoiceitemDisplay_invoice);
    final Span InvoiceitemDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_lastModifiedDt);
    InvoiceitemDisplay_Span_lastModifiedDt(instance, InvoiceitemDisplay_lastModifiedDt);
    final TableCell InvoiceitemDisplay_inventoryItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_inventoryItem);
    InvoiceitemDisplay_TableCell_inventoryItem(instance, InvoiceitemDisplay_inventoryItem);
    final Event InvoiceitemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceitemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceitemDisplay_renderEditViewEvent);
    InvoiceitemDisplay_Event_renderEditViewEvent(instance, InvoiceitemDisplay_renderEditViewEvent);
    final TableCell InvoiceitemDisplay_itemDescription = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_itemDescription);
    InvoiceitemDisplay_TableCell_itemDescription(instance, InvoiceitemDisplay_itemDescription);
    final TableCell InvoiceitemDisplay_soldWithItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_soldWithItem);
    InvoiceitemDisplay_TableCell_soldWithItem(instance, InvoiceitemDisplay_soldWithItem);
    final TableCell InvoiceitemDisplay_taxableFg = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_taxableFg);
    InvoiceitemDisplay_TableCell_taxableFg(instance, InvoiceitemDisplay_taxableFg);
    final TableCell InvoiceitemDisplay_itemTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_itemTy);
    InvoiceitemDisplay_TableCell_itemTy(instance, InvoiceitemDisplay_itemTy);
    final TableCell InvoiceitemDisplay_unitPrice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_unitPrice);
    InvoiceitemDisplay_TableCell_unitPrice(instance, InvoiceitemDisplay_unitPrice);
    final TableCell InvoiceitemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_effectiveDt);
    InvoiceitemDisplay_TableCell_effectiveDt(instance, InvoiceitemDisplay_effectiveDt);
    final DataBinder InvoiceitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceitemPresenter_binder);
    InvoiceitemPresenter_DataBinder_binder(instance, InvoiceitemPresenter_binder);
    final Div InvoiceitemDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_entityDisplayComponent);
    InvoiceitemDisplay_Div_entityDisplayComponent(instance, InvoiceitemDisplay_entityDisplayComponent);
    final Span InvoiceitemDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_createdDt);
    InvoiceitemDisplay_Span_createdDt(instance, InvoiceitemDisplay_createdDt);
    final TableCell InvoiceitemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_entityCode);
    InvoiceitemDisplay_TableCell_entityCode(instance, InvoiceitemDisplay_entityCode);
    final TableCell InvoiceitemDisplay_prodFeat = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_prodFeat);
    InvoiceitemDisplay_TableCell_prodFeat(instance, InvoiceitemDisplay_prodFeat);
    final TableCell InvoiceitemDisplay_quantity = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_quantity);
    InvoiceitemDisplay_TableCell_quantity(instance, InvoiceitemDisplay_quantity);
    final TransitionTo InvoiceitemDisplay_listInvoiceitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInvoiceitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceitemDisplay_listInvoiceitemsPage);
    InvoiceitemDisplay_TransitionTo_listInvoiceitemsPage(instance, InvoiceitemDisplay_listInvoiceitemsPage);
    final TableCell InvoiceitemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_name);
    InvoiceitemDisplay_TableCell_name(instance, InvoiceitemDisplay_name);
    final TableCell InvoiceitemDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemDisplay_universe);
    InvoiceitemDisplay_TableCell_universe(instance, InvoiceitemDisplay_universe);
    c_c_h_c_l_i_InvoiceitemDisplayTemplateResource templateForInvoiceitemDisplay = GWT.create(c_c_h_c_l_i_InvoiceitemDisplayTemplateResource.class);
    Element parentElementForTemplateOfInvoiceitemDisplay = TemplateUtil.getRootTemplateParentElement(templateForInvoiceitemDisplay.getContents().getText(), "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_itemTy(instance)));
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_prodFeat(instance)));
      }
    }, dataFieldElements, "prodFeat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_soldWithItem(instance)));
      }
    }, dataFieldElements, "soldWithItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_invoice(instance)));
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_inventoryItem(instance)));
      }
    }, dataFieldElements, "inventoryItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_prod(instance)));
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_itemDescription(instance)));
      }
    }, dataFieldElements, "itemDescription");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_taxableFg(instance)));
      }
    }, dataFieldElements, "taxableFg");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_quantity(instance)));
      }
    }, dataFieldElements, "quantity");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_unitPrice(instance)));
      }
    }, dataFieldElements, "unitPrice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_editInvoiceitemBtn(instance));
      }
    }, dataFieldElements, "editInvoiceitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_deleteInvoiceitemBtn(instance));
      }
    }, dataFieldElements, "deleteInvoiceitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com/cloderia/helion/client/local/invoiceitem/view-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_listInvoiceitemsPageLink(instance));
      }
    }, dataFieldElements, "listInvoiceitemsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("itemTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_itemTy(instance))));
    templateFieldsMap.put("prodFeat", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_prodFeat(instance))));
    templateFieldsMap.put("soldWithItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_soldWithItem(instance))));
    templateFieldsMap.put("invoice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_invoice(instance))));
    templateFieldsMap.put("inventoryItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_inventoryItem(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("prod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_prod(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("itemDescription", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_itemDescription(instance))));
    templateFieldsMap.put("taxableFg", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_taxableFg(instance))));
    templateFieldsMap.put("quantity", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_quantity(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("unitPrice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_unitPrice(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editInvoiceitemBtn", ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_editInvoiceitemBtn(instance)));
    templateFieldsMap.put("deleteInvoiceitemBtn", ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_deleteInvoiceitemBtn(instance)));
    templateFieldsMap.put("listInvoiceitemsPageLink", ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_listInvoiceitemsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editInvoiceitemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditInvoiceitemBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteInvoiceitemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteInvoiceitemBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInvoiceitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InvoiceitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_itemTy(instance))), "itemTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_prodFeat(instance))), "prodFeat.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_soldWithItem(instance))), "soldWithItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_invoice(instance))), "invoice.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_inventoryItem(instance))), "inventoryItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_prod(instance))), "prod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_itemDescription(instance))), "itemDescription", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_taxableFg(instance))), "taxableFg", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_quantity(instance))), "quantity", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_unitPrice(instance))), "unitPrice", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceitemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceitemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_editInvoiceitemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_deleteInvoiceitemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceitemDisplay_AnchorElement_listInvoiceitemsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceitemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell InvoiceitemDisplay_TableCell_universe(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::universe;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_universe(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::universe = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_soldWithItem(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::soldWithItem;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_soldWithItem(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::soldWithItem = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_effectiveDt(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::effectiveDt;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_effectiveDt(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_entityCode(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::entityCode;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_entityCode(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::entityCode = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_amount(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::amount;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_amount(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::amount = value;
  }-*/;

  native static Span InvoiceitemDisplay_Span_createdDt(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::createdDt;
  }-*/;

  native static void InvoiceitemDisplay_Span_createdDt(InvoiceitemDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::createdDt = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_prod(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::prod;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_prod(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::prod = value;
  }-*/;

  native static AnchorElement InvoiceitemDisplay_AnchorElement_deleteInvoiceitemBtn(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::deleteInvoiceitemBtn;
  }-*/;

  native static void InvoiceitemDisplay_AnchorElement_deleteInvoiceitemBtn(InvoiceitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::deleteInvoiceitemBtn = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_invoice(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::invoice;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_invoice(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::invoice = value;
  }-*/;

  native static Div InvoiceitemDisplay_Div_entityDisplayComponent(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::entityDisplayComponent;
  }-*/;

  native static void InvoiceitemDisplay_Div_entityDisplayComponent(InvoiceitemDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::entityDisplayComponent = value;
  }-*/;

  native static AnchorElement InvoiceitemDisplay_AnchorElement_listInvoiceitemsPageLink(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::listInvoiceitemsPageLink;
  }-*/;

  native static void InvoiceitemDisplay_AnchorElement_listInvoiceitemsPageLink(InvoiceitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::listInvoiceitemsPageLink = value;
  }-*/;

  native static AnchorElement InvoiceitemDisplay_AnchorElement_editInvoiceitemBtn(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::editInvoiceitemBtn;
  }-*/;

  native static void InvoiceitemDisplay_AnchorElement_editInvoiceitemBtn(InvoiceitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::editInvoiceitemBtn = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_name(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::name;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_name(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::name = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_inventoryItem(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::inventoryItem;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_inventoryItem(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::inventoryItem = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_taxableFg(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::taxableFg;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_taxableFg(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::taxableFg = value;
  }-*/;

  native static Event InvoiceitemDisplay_Event_renderEditViewEvent(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::renderEditViewEvent;
  }-*/;

  native static void InvoiceitemDisplay_Event_renderEditViewEvent(InvoiceitemDisplay instance, Event<InvoiceitemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_unitPrice(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::unitPrice;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_unitPrice(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::unitPrice = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_quantity(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::quantity;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_quantity(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::quantity = value;
  }-*/;

  native static Span InvoiceitemDisplay_Span_lastModifiedDt(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::lastModifiedDt;
  }-*/;

  native static void InvoiceitemDisplay_Span_lastModifiedDt(InvoiceitemDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::lastModifiedDt = value;
  }-*/;

  native static TransitionTo InvoiceitemDisplay_TransitionTo_listInvoiceitemsPage(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::listInvoiceitemsPage;
  }-*/;

  native static void InvoiceitemDisplay_TransitionTo_listInvoiceitemsPage(InvoiceitemDisplay instance, TransitionTo<ListInvoiceitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::listInvoiceitemsPage = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_itemDescription(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::itemDescription;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_itemDescription(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::itemDescription = value;
  }-*/;

  native static Event InvoiceitemDisplay_Event_deleteEntityEvent(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::deleteEntityEvent;
  }-*/;

  native static void InvoiceitemDisplay_Event_deleteEntityEvent(InvoiceitemDisplay instance, Event<InvoiceitemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::deleteEntityEvent = value;
  }-*/;

  native static Heading InvoiceitemDisplay_Heading_code(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::code;
  }-*/;

  native static void InvoiceitemDisplay_Heading_code(InvoiceitemDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::code = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_itemTy(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::itemTy;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_itemTy(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::itemTy = value;
  }-*/;

  native static DataBinder InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder;
  }-*/;

  native static void InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance, DataBinder<Invoiceitem> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder = value;
  }-*/;

  native static TableCell InvoiceitemDisplay_TableCell_prodFeat(InvoiceitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::prodFeat;
  }-*/;

  native static void InvoiceitemDisplay_TableCell_prodFeat(InvoiceitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay::prodFeat = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
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

public class Type_factory__c_c_h_c_l_i_InvoiceitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InvoiceitemListItemDisplay.class, "Type_factory__c_c_h_c_l_i_InvoiceitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InvoiceitemListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InvoiceitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InvoiceitemListItemDisplay.class);
    handle.addAssignableType(InvoiceitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InvoiceitemListItemDisplay createInstance(final ContextManager contextManager) {
    final InvoiceitemListItemDisplay instance = new InvoiceitemListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell InvoiceitemListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_name);
    InvoiceitemListItemDisplay_TableCell_name(instance, InvoiceitemListItemDisplay_name);
    final TableCell InvoiceitemListItemDisplay_taxableFg = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_taxableFg);
    InvoiceitemListItemDisplay_TableCell_taxableFg(instance, InvoiceitemListItemDisplay_taxableFg);
    final TableCell InvoiceitemListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_entityCode);
    InvoiceitemListItemDisplay_TableCell_entityCode(instance, InvoiceitemListItemDisplay_entityCode);
    final TableCell InvoiceitemListItemDisplay_soldWithItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_soldWithItem);
    InvoiceitemListItemDisplay_TableCell_soldWithItem(instance, InvoiceitemListItemDisplay_soldWithItem);
    final TableCell InvoiceitemListItemDisplay_unitPrice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_unitPrice);
    InvoiceitemListItemDisplay_TableCell_unitPrice(instance, InvoiceitemListItemDisplay_unitPrice);
    final TableCell InvoiceitemListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_effectiveDt);
    InvoiceitemListItemDisplay_TableCell_effectiveDt(instance, InvoiceitemListItemDisplay_effectiveDt);
    final AnchorElement InvoiceitemListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_deleteEntityListItemBtn);
    InvoiceitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, InvoiceitemListItemDisplay_deleteEntityListItemBtn);
    final TableCell InvoiceitemListItemDisplay_invoice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_invoice);
    InvoiceitemListItemDisplay_TableCell_invoice(instance, InvoiceitemListItemDisplay_invoice);
    final TableRow InvoiceitemListItemDisplay_invoiceitemItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_invoiceitemItem);
    InvoiceitemListItemDisplay_TableRow_invoiceitemItem(instance, InvoiceitemListItemDisplay_invoiceitemItem);
    final TableCell InvoiceitemListItemDisplay_itemDescription = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_itemDescription);
    InvoiceitemListItemDisplay_TableCell_itemDescription(instance, InvoiceitemListItemDisplay_itemDescription);
    final AnchorElement InvoiceitemListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_editEntityListItemBtn);
    InvoiceitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance, InvoiceitemListItemDisplay_editEntityListItemBtn);
    final TableCell InvoiceitemListItemDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_amount);
    InvoiceitemListItemDisplay_TableCell_amount(instance, InvoiceitemListItemDisplay_amount);
    final TableCell InvoiceitemListItemDisplay_prod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_prod);
    InvoiceitemListItemDisplay_TableCell_prod(instance, InvoiceitemListItemDisplay_prod);
    final TableCell InvoiceitemListItemDisplay_quantity = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_quantity);
    InvoiceitemListItemDisplay_TableCell_quantity(instance, InvoiceitemListItemDisplay_quantity);
    final TableCell InvoiceitemListItemDisplay_prodFeat = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_prodFeat);
    InvoiceitemListItemDisplay_TableCell_prodFeat(instance, InvoiceitemListItemDisplay_prodFeat);
    final DataBinder InvoiceitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Invoiceitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InvoiceitemPresenter_binder);
    InvoiceitemPresenter_DataBinder_binder(instance, InvoiceitemPresenter_binder);
    final TableCell InvoiceitemListItemDisplay_itemTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_itemTy);
    InvoiceitemListItemDisplay_TableCell_itemTy(instance, InvoiceitemListItemDisplay_itemTy);
    final TableCell InvoiceitemListItemDisplay_inventoryItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_inventoryItem);
    InvoiceitemListItemDisplay_TableCell_inventoryItem(instance, InvoiceitemListItemDisplay_inventoryItem);
    final Event InvoiceitemListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceitemListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_renderSingleViewEvent);
    InvoiceitemListItemDisplay_Event_renderSingleViewEvent(instance, InvoiceitemListItemDisplay_renderSingleViewEvent);
    final Event InvoiceitemListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceitemListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_renderEditViewEvent);
    InvoiceitemListItemDisplay_Event_renderEditViewEvent(instance, InvoiceitemListItemDisplay_renderEditViewEvent);
    final Event InvoiceitemListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InvoiceitemListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InvoiceitemListItemDisplay_deleteEntityEvent);
    InvoiceitemListItemDisplay_Event_deleteEntityEvent(instance, InvoiceitemListItemDisplay_deleteEntityEvent);
    c_c_h_c_l_i_InvoiceitemListItemDisplayTemplateResource templateForInvoiceitemListItemDisplay = GWT.create(c_c_h_c_l_i_InvoiceitemListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfInvoiceitemListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForInvoiceitemListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", "invoiceitemItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableRow_invoiceitemItem(instance)));
      }
    }, dataFieldElements, "invoiceitemItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_itemTy(instance)));
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_prodFeat(instance)));
      }
    }, dataFieldElements, "prodFeat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_soldWithItem(instance)));
      }
    }, dataFieldElements, "soldWithItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_invoice(instance)));
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_inventoryItem(instance)));
      }
    }, dataFieldElements, "inventoryItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_prod(instance)));
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_itemDescription(instance)));
      }
    }, dataFieldElements, "itemDescription");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_taxableFg(instance)));
      }
    }, dataFieldElements, "taxableFg");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_quantity(instance)));
      }
    }, dataFieldElements, "quantity");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_unitPrice(instance)));
      }
    }, dataFieldElements, "unitPrice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com/cloderia/helion/client/local/invoiceitem/list-invoiceitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InvoiceitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("invoiceitemItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableRow_invoiceitemItem(instance))));
    templateFieldsMap.put("itemTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_itemTy(instance))));
    templateFieldsMap.put("prodFeat", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_prodFeat(instance))));
    templateFieldsMap.put("soldWithItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_soldWithItem(instance))));
    templateFieldsMap.put("invoice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_invoice(instance))));
    templateFieldsMap.put("inventoryItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_inventoryItem(instance))));
    templateFieldsMap.put("prod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_prod(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("itemDescription", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_itemDescription(instance))));
    templateFieldsMap.put("taxableFg", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_taxableFg(instance))));
    templateFieldsMap.put("quantity", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_quantity(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("unitPrice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_unitPrice(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InvoiceitemListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(InvoiceitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(InvoiceitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInvoiceitemListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = InvoiceitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_itemTy(instance))), "itemTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_prodFeat(instance))), "prodFeat.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_soldWithItem(instance))), "soldWithItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_invoice(instance))), "invoice.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_inventoryItem(instance))), "inventoryItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_prod(instance))), "prod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_itemDescription(instance))), "itemDescription", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_taxableFg(instance))), "taxableFg", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_quantity(instance))), "quantity", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_unitPrice(instance))), "unitPrice", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InvoiceitemListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InvoiceitemListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InvoiceitemListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InvoiceitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InvoiceitemListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement InvoiceitemListItemDisplay_AnchorElement_editEntityListItemBtn(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void InvoiceitemListItemDisplay_AnchorElement_editEntityListItemBtn(InvoiceitemListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_invoice(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::invoice;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_invoice(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::invoice = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_taxableFg(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::taxableFg;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_taxableFg(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::taxableFg = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_itemTy(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::itemTy;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_itemTy(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::itemTy = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_inventoryItem(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::inventoryItem;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_inventoryItem(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::inventoryItem = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_soldWithItem(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::soldWithItem;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_soldWithItem(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::soldWithItem = value;
  }-*/;

  native static AnchorElement InvoiceitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void InvoiceitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(InvoiceitemListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event InvoiceitemListItemDisplay_Event_deleteEntityEvent(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void InvoiceitemListItemDisplay_Event_deleteEntityEvent(InvoiceitemListItemDisplay instance, Event<InvoiceitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_unitPrice(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::unitPrice;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_unitPrice(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::unitPrice = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_prod(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::prod;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_prod(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::prod = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_quantity(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::quantity;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_quantity(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::quantity = value;
  }-*/;

  native static Event InvoiceitemListItemDisplay_Event_renderEditViewEvent(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void InvoiceitemListItemDisplay_Event_renderEditViewEvent(InvoiceitemListItemDisplay instance, Event<InvoiceitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_entityCode(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::entityCode;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_entityCode(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_name(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::name;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_name(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::name = value;
  }-*/;

  native static TableRow InvoiceitemListItemDisplay_TableRow_invoiceitemItem(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::invoiceitemItem;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableRow_invoiceitemItem(InvoiceitemListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::invoiceitemItem = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_itemDescription(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::itemDescription;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_itemDescription(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::itemDescription = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_amount(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::amount;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_amount(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::amount = value;
  }-*/;

  native static Event InvoiceitemListItemDisplay_Event_renderSingleViewEvent(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void InvoiceitemListItemDisplay_Event_renderSingleViewEvent(InvoiceitemListItemDisplay instance, Event<InvoiceitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_prodFeat(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::prodFeat;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_prodFeat(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::prodFeat = value;
  }-*/;

  native static DataBinder InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder;
  }-*/;

  native static void InvoiceitemPresenter_DataBinder_binder(InvoiceitemPresenter instance, DataBinder<Invoiceitem> value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter::binder = value;
  }-*/;

  native static TableCell InvoiceitemListItemDisplay_TableCell_effectiveDt(InvoiceitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::effectiveDt;
  }-*/;

  native static void InvoiceitemListItemDisplay_TableCell_effectiveDt(InvoiceitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay::effectiveDt = value;
  }-*/;
}
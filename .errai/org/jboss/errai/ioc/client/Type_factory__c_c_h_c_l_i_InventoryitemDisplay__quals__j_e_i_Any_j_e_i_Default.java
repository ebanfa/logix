package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter;
import com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Inventoryitem;
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

public class Type_factory__c_c_h_c_l_i_InventoryitemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InventoryitemDisplay.class, "Type_factory__c_c_h_c_l_i_InventoryitemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InventoryitemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InventoryitemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InventoryitemDisplay.class);
    handle.addAssignableType(InventoryitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InventoryitemDisplay createInstance(final ContextManager contextManager) {
    final InventoryitemDisplay instance = new InventoryitemDisplay();
    setIncompleteInstance(instance);
    final Event InventoryitemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InventoryitemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InventoryitemDisplay_renderEditViewEvent);
    InventoryitemDisplay_Event_renderEditViewEvent(instance, InventoryitemDisplay_renderEditViewEvent);
    final TableCell InventoryitemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_name);
    InventoryitemDisplay_TableCell_name(instance, InventoryitemDisplay_name);
    final TableCell InventoryitemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_entityCode);
    InventoryitemDisplay_TableCell_entityCode(instance, InventoryitemDisplay_entityCode);
    final Span InventoryitemDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_createdDt);
    InventoryitemDisplay_Span_createdDt(instance, InventoryitemDisplay_createdDt);
    final TableCell InventoryitemDisplay_quantityOnHand = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_quantityOnHand);
    InventoryitemDisplay_TableCell_quantityOnHand(instance, InventoryitemDisplay_quantityOnHand);
    final DataBinder InventoryitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Inventoryitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InventoryitemPresenter_binder);
    InventoryitemPresenter_DataBinder_binder(instance, InventoryitemPresenter_binder);
    final TableCell InventoryitemDisplay_itemTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_itemTy);
    InventoryitemDisplay_TableCell_itemTy(instance, InventoryitemDisplay_itemTy);
    final Span InventoryitemDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_lastModifiedDt);
    InventoryitemDisplay_Span_lastModifiedDt(instance, InventoryitemDisplay_lastModifiedDt);
    final TableCell InventoryitemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_description);
    InventoryitemDisplay_TableCell_description(instance, InventoryitemDisplay_description);
    final TransitionTo InventoryitemDisplay_listInventoryitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListInventoryitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InventoryitemDisplay_listInventoryitemsPage);
    InventoryitemDisplay_TransitionTo_listInventoryitemsPage(instance, InventoryitemDisplay_listInventoryitemsPage);
    final Heading InventoryitemDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, InventoryitemDisplay_code);
    InventoryitemDisplay_Heading_code(instance, InventoryitemDisplay_code);
    final TableCell InventoryitemDisplay_container = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_container);
    InventoryitemDisplay_TableCell_container(instance, InventoryitemDisplay_container);
    final Div InventoryitemDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_entityDisplayComponent);
    InventoryitemDisplay_Div_entityDisplayComponent(instance, InventoryitemDisplay_entityDisplayComponent);
    final Event InventoryitemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InventoryitemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InventoryitemDisplay_deleteEntityEvent);
    InventoryitemDisplay_Event_deleteEntityEvent(instance, InventoryitemDisplay_deleteEntityEvent);
    final TableCell InventoryitemDisplay_lot = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_lot);
    InventoryitemDisplay_TableCell_lot(instance, InventoryitemDisplay_lot);
    final TableCell InventoryitemDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_universe);
    InventoryitemDisplay_TableCell_universe(instance, InventoryitemDisplay_universe);
    final TableCell InventoryitemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_effectiveDt);
    InventoryitemDisplay_TableCell_effectiveDt(instance, InventoryitemDisplay_effectiveDt);
    final TableCell InventoryitemDisplay_status = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_status);
    InventoryitemDisplay_TableCell_status(instance, InventoryitemDisplay_status);
    final TableCell InventoryitemDisplay_facility = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_facility);
    InventoryitemDisplay_TableCell_facility(instance, InventoryitemDisplay_facility);
    final TableCell InventoryitemDisplay_serialNum = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_serialNum);
    InventoryitemDisplay_TableCell_serialNum(instance, InventoryitemDisplay_serialNum);
    final TableCell InventoryitemDisplay_prod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemDisplay_prod);
    InventoryitemDisplay_TableCell_prod(instance, InventoryitemDisplay_prod);
    c_c_h_c_l_i_InventoryitemDisplayTemplateResource templateForInventoryitemDisplay = GWT.create(c_c_h_c_l_i_InventoryitemDisplayTemplateResource.class);
    Element parentElementForTemplateOfInventoryitemDisplay = TemplateUtil.getRootTemplateParentElement(templateForInventoryitemDisplay.getContents().getText(), "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_lot(instance)));
      }
    }, dataFieldElements, "lot");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_container(instance)));
      }
    }, dataFieldElements, "container");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_status(instance)));
      }
    }, dataFieldElements, "status");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_itemTy(instance)));
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_prod(instance)));
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_facility(instance)));
      }
    }, dataFieldElements, "facility");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_quantityOnHand(instance)));
      }
    }, dataFieldElements, "quantityOnHand");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_serialNum(instance)));
      }
    }, dataFieldElements, "serialNum");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_editInventoryitemBtn(instance));
      }
    }, dataFieldElements, "editInventoryitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_deleteInventoryitemBtn(instance));
      }
    }, dataFieldElements, "deleteInventoryitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com/cloderia/helion/client/local/inventoryitem/view-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_listInventoryitemsPageLink(instance));
      }
    }, dataFieldElements, "listInventoryitemsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("lot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_lot(instance))));
    templateFieldsMap.put("container", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_container(instance))));
    templateFieldsMap.put("status", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_status(instance))));
    templateFieldsMap.put("itemTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_itemTy(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("prod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_prod(instance))));
    templateFieldsMap.put("facility", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_facility(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("quantityOnHand", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_quantityOnHand(instance))));
    templateFieldsMap.put("serialNum", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_serialNum(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editInventoryitemBtn", ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_editInventoryitemBtn(instance)));
    templateFieldsMap.put("deleteInventoryitemBtn", ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_deleteInventoryitemBtn(instance)));
    templateFieldsMap.put("listInventoryitemsPageLink", ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_listInventoryitemsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editInventoryitemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditInventoryitemBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteInventoryitemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteInventoryitemBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listInventoryitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = InventoryitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_lot(instance))), "lot.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_container(instance))), "container.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_status(instance))), "status.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_itemTy(instance))), "itemTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_prod(instance))), "prod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_facility(instance))), "facility.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_quantityOnHand(instance))), "quantityOnHand", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_serialNum(instance))), "serialNum", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InventoryitemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InventoryitemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_editInventoryitemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_deleteInventoryitemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InventoryitemDisplay_AnchorElement_listInventoryitemsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InventoryitemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Div InventoryitemDisplay_Div_entityDisplayComponent(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::entityDisplayComponent;
  }-*/;

  native static void InventoryitemDisplay_Div_entityDisplayComponent(InventoryitemDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_effectiveDt(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::effectiveDt;
  }-*/;

  native static void InventoryitemDisplay_TableCell_effectiveDt(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_container(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::container;
  }-*/;

  native static void InventoryitemDisplay_TableCell_container(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::container = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_universe(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::universe;
  }-*/;

  native static void InventoryitemDisplay_TableCell_universe(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::universe = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_serialNum(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::serialNum;
  }-*/;

  native static void InventoryitemDisplay_TableCell_serialNum(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::serialNum = value;
  }-*/;

  native static Span InventoryitemDisplay_Span_lastModifiedDt(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::lastModifiedDt;
  }-*/;

  native static void InventoryitemDisplay_Span_lastModifiedDt(InventoryitemDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_lot(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::lot;
  }-*/;

  native static void InventoryitemDisplay_TableCell_lot(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::lot = value;
  }-*/;

  native static Event InventoryitemDisplay_Event_renderEditViewEvent(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::renderEditViewEvent;
  }-*/;

  native static void InventoryitemDisplay_Event_renderEditViewEvent(InventoryitemDisplay instance, Event<InventoryitemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::renderEditViewEvent = value;
  }-*/;

  native static Heading InventoryitemDisplay_Heading_code(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::code;
  }-*/;

  native static void InventoryitemDisplay_Heading_code(InventoryitemDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::code = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_status(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::status;
  }-*/;

  native static void InventoryitemDisplay_TableCell_status(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::status = value;
  }-*/;

  native static Span InventoryitemDisplay_Span_createdDt(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::createdDt;
  }-*/;

  native static void InventoryitemDisplay_Span_createdDt(InventoryitemDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::createdDt = value;
  }-*/;

  native static AnchorElement InventoryitemDisplay_AnchorElement_editInventoryitemBtn(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::editInventoryitemBtn;
  }-*/;

  native static void InventoryitemDisplay_AnchorElement_editInventoryitemBtn(InventoryitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::editInventoryitemBtn = value;
  }-*/;

  native static AnchorElement InventoryitemDisplay_AnchorElement_listInventoryitemsPageLink(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::listInventoryitemsPageLink;
  }-*/;

  native static void InventoryitemDisplay_AnchorElement_listInventoryitemsPageLink(InventoryitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::listInventoryitemsPageLink = value;
  }-*/;

  native static TransitionTo InventoryitemDisplay_TransitionTo_listInventoryitemsPage(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::listInventoryitemsPage;
  }-*/;

  native static void InventoryitemDisplay_TransitionTo_listInventoryitemsPage(InventoryitemDisplay instance, TransitionTo<ListInventoryitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::listInventoryitemsPage = value;
  }-*/;

  native static Event InventoryitemDisplay_Event_deleteEntityEvent(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::deleteEntityEvent;
  }-*/;

  native static void InventoryitemDisplay_Event_deleteEntityEvent(InventoryitemDisplay instance, Event<InventoryitemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_name(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::name;
  }-*/;

  native static void InventoryitemDisplay_TableCell_name(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::name = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_itemTy(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::itemTy;
  }-*/;

  native static void InventoryitemDisplay_TableCell_itemTy(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::itemTy = value;
  }-*/;

  native static DataBinder InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder;
  }-*/;

  native static void InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance, DataBinder<Inventoryitem> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder = value;
  }-*/;

  native static AnchorElement InventoryitemDisplay_AnchorElement_deleteInventoryitemBtn(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::deleteInventoryitemBtn;
  }-*/;

  native static void InventoryitemDisplay_AnchorElement_deleteInventoryitemBtn(InventoryitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::deleteInventoryitemBtn = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_quantityOnHand(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::quantityOnHand;
  }-*/;

  native static void InventoryitemDisplay_TableCell_quantityOnHand(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::quantityOnHand = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_prod(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::prod;
  }-*/;

  native static void InventoryitemDisplay_TableCell_prod(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::prod = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_facility(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::facility;
  }-*/;

  native static void InventoryitemDisplay_TableCell_facility(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::facility = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_description(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::description;
  }-*/;

  native static void InventoryitemDisplay_TableCell_description(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::description = value;
  }-*/;

  native static TableCell InventoryitemDisplay_TableCell_entityCode(InventoryitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::entityCode;
  }-*/;

  native static void InventoryitemDisplay_TableCell_entityCode(InventoryitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay::entityCode = value;
  }-*/;
}
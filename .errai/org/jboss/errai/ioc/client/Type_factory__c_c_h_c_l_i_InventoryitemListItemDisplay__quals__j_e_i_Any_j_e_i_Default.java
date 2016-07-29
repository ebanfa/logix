package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
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

public class Type_factory__c_c_h_c_l_i_InventoryitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(InventoryitemListItemDisplay.class, "Type_factory__c_c_h_c_l_i_InventoryitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_i_InventoryitemListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_i_InventoryitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(InventoryitemListItemDisplay.class);
    handle.addAssignableType(InventoryitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public InventoryitemListItemDisplay createInstance(final ContextManager contextManager) {
    final InventoryitemListItemDisplay instance = new InventoryitemListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell InventoryitemListItemDisplay_lot = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_lot);
    InventoryitemListItemDisplay_TableCell_lot(instance, InventoryitemListItemDisplay_lot);
    final Event InventoryitemListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InventoryitemListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_deleteEntityEvent);
    InventoryitemListItemDisplay_Event_deleteEntityEvent(instance, InventoryitemListItemDisplay_deleteEntityEvent);
    final TableCell InventoryitemListItemDisplay_quantityOnHand = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_quantityOnHand);
    InventoryitemListItemDisplay_TableCell_quantityOnHand(instance, InventoryitemListItemDisplay_quantityOnHand);
    final AnchorElement InventoryitemListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_deleteEntityListItemBtn);
    InventoryitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, InventoryitemListItemDisplay_deleteEntityListItemBtn);
    final TableCell InventoryitemListItemDisplay_status = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_status);
    InventoryitemListItemDisplay_TableCell_status(instance, InventoryitemListItemDisplay_status);
    final TableCell InventoryitemListItemDisplay_prod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_prod);
    InventoryitemListItemDisplay_TableCell_prod(instance, InventoryitemListItemDisplay_prod);
    final TableCell InventoryitemListItemDisplay_serialNum = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_serialNum);
    InventoryitemListItemDisplay_TableCell_serialNum(instance, InventoryitemListItemDisplay_serialNum);
    final TableCell InventoryitemListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_name);
    InventoryitemListItemDisplay_TableCell_name(instance, InventoryitemListItemDisplay_name);
    final TableRow InventoryitemListItemDisplay_inventoryitemItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_inventoryitemItem);
    InventoryitemListItemDisplay_TableRow_inventoryitemItem(instance, InventoryitemListItemDisplay_inventoryitemItem);
    final TableCell InventoryitemListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_entityCode);
    InventoryitemListItemDisplay_TableCell_entityCode(instance, InventoryitemListItemDisplay_entityCode);
    final TableCell InventoryitemListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_description);
    InventoryitemListItemDisplay_TableCell_description(instance, InventoryitemListItemDisplay_description);
    final TableCell InventoryitemListItemDisplay_facility = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_facility);
    InventoryitemListItemDisplay_TableCell_facility(instance, InventoryitemListItemDisplay_facility);
    final TableCell InventoryitemListItemDisplay_container = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_container);
    InventoryitemListItemDisplay_TableCell_container(instance, InventoryitemListItemDisplay_container);
    final TableCell InventoryitemListItemDisplay_itemTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_itemTy);
    InventoryitemListItemDisplay_TableCell_itemTy(instance, InventoryitemListItemDisplay_itemTy);
    final TableCell InventoryitemListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_effectiveDt);
    InventoryitemListItemDisplay_TableCell_effectiveDt(instance, InventoryitemListItemDisplay_effectiveDt);
    final AnchorElement InventoryitemListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_editEntityListItemBtn);
    InventoryitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance, InventoryitemListItemDisplay_editEntityListItemBtn);
    final DataBinder InventoryitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Inventoryitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, InventoryitemPresenter_binder);
    InventoryitemPresenter_DataBinder_binder(instance, InventoryitemPresenter_binder);
    final Event InventoryitemListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InventoryitemListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_renderSingleViewEvent);
    InventoryitemListItemDisplay_Event_renderSingleViewEvent(instance, InventoryitemListItemDisplay_renderSingleViewEvent);
    final Event InventoryitemListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { InventoryitemListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, InventoryitemListItemDisplay_renderEditViewEvent);
    InventoryitemListItemDisplay_Event_renderEditViewEvent(instance, InventoryitemListItemDisplay_renderEditViewEvent);
    c_c_h_c_l_i_InventoryitemListItemDisplayTemplateResource templateForInventoryitemListItemDisplay = GWT.create(c_c_h_c_l_i_InventoryitemListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfInventoryitemListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForInventoryitemListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", "inventoryitemItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableRow_inventoryitemItem(instance)));
      }
    }, dataFieldElements, "inventoryitemItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_lot(instance)));
      }
    }, dataFieldElements, "lot");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_container(instance)));
      }
    }, dataFieldElements, "container");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_status(instance)));
      }
    }, dataFieldElements, "status");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_itemTy(instance)));
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_prod(instance)));
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_facility(instance)));
      }
    }, dataFieldElements, "facility");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_quantityOnHand(instance)));
      }
    }, dataFieldElements, "quantityOnHand");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_serialNum(instance)));
      }
    }, dataFieldElements, "serialNum");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InventoryitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com/cloderia/helion/client/local/inventoryitem/list-inventoryitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(InventoryitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("inventoryitemItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableRow_inventoryitemItem(instance))));
    templateFieldsMap.put("lot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_lot(instance))));
    templateFieldsMap.put("container", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_container(instance))));
    templateFieldsMap.put("status", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_status(instance))));
    templateFieldsMap.put("itemTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_itemTy(instance))));
    templateFieldsMap.put("prod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_prod(instance))));
    templateFieldsMap.put("facility", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_facility(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("quantityOnHand", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_quantityOnHand(instance))));
    templateFieldsMap.put("serialNum", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_serialNum(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(InventoryitemListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(InventoryitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(InventoryitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfInventoryitemListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = InventoryitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_lot(instance))), "lot.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_container(instance))), "container.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_status(instance))), "status.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_itemTy(instance))), "itemTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_prod(instance))), "prod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_facility(instance))), "facility.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_quantityOnHand(instance))), "quantityOnHand", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_serialNum(instance))), "serialNum", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(InventoryitemListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((InventoryitemListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final InventoryitemListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InventoryitemListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(InventoryitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final InventoryitemListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement InventoryitemListItemDisplay_AnchorElement_editEntityListItemBtn(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void InventoryitemListItemDisplay_AnchorElement_editEntityListItemBtn(InventoryitemListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_name(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::name;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_name(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::name = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_quantityOnHand(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::quantityOnHand;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_quantityOnHand(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::quantityOnHand = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_serialNum(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::serialNum;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_serialNum(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::serialNum = value;
  }-*/;

  native static Event InventoryitemListItemDisplay_Event_renderEditViewEvent(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void InventoryitemListItemDisplay_Event_renderEditViewEvent(InventoryitemListItemDisplay instance, Event<InventoryitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_effectiveDt(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::effectiveDt;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_effectiveDt(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::effectiveDt = value;
  }-*/;

  native static Event InventoryitemListItemDisplay_Event_deleteEntityEvent(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void InventoryitemListItemDisplay_Event_deleteEntityEvent(InventoryitemListItemDisplay instance, Event<InventoryitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static AnchorElement InventoryitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void InventoryitemListItemDisplay_AnchorElement_deleteEntityListItemBtn(InventoryitemListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableRow InventoryitemListItemDisplay_TableRow_inventoryitemItem(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::inventoryitemItem;
  }-*/;

  native static void InventoryitemListItemDisplay_TableRow_inventoryitemItem(InventoryitemListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::inventoryitemItem = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_facility(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::facility;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_facility(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::facility = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_lot(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::lot;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_lot(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::lot = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_prod(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::prod;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_prod(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::prod = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_description(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::description;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_description(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::description = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_status(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::status;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_status(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::status = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_entityCode(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::entityCode;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_entityCode(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_itemTy(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::itemTy;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_itemTy(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::itemTy = value;
  }-*/;

  native static DataBinder InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder;
  }-*/;

  native static void InventoryitemPresenter_DataBinder_binder(InventoryitemPresenter instance, DataBinder<Inventoryitem> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter::binder = value;
  }-*/;

  native static Event InventoryitemListItemDisplay_Event_renderSingleViewEvent(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void InventoryitemListItemDisplay_Event_renderSingleViewEvent(InventoryitemListItemDisplay instance, Event<InventoryitemListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell InventoryitemListItemDisplay_TableCell_container(InventoryitemListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::container;
  }-*/;

  native static void InventoryitemListItemDisplay_TableCell_container(InventoryitemListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay::container = value;
  }-*/;
}
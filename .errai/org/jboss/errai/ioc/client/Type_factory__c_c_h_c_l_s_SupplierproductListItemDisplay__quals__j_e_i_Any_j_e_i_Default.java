package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Supplierproduct;
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

public class Type_factory__c_c_h_c_l_s_SupplierproductListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SupplierproductListItemDisplay.class, "Type_factory__c_c_h_c_l_s_SupplierproductListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SupplierproductListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SupplierproductListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SupplierproductListItemDisplay.class);
    handle.addAssignableType(SupplierproductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SupplierproductListItemDisplay createInstance(final ContextManager contextManager) {
    final SupplierproductListItemDisplay instance = new SupplierproductListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell SupplierproductListItemDisplay_supplier = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_supplier);
    SupplierproductListItemDisplay_TableCell_supplier(instance, SupplierproductListItemDisplay_supplier);
    final Event SupplierproductListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SupplierproductListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_renderEditViewEvent);
    SupplierproductListItemDisplay_Event_renderEditViewEvent(instance, SupplierproductListItemDisplay_renderEditViewEvent);
    final TableCell SupplierproductListItemDisplay_availToDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_availToDt);
    SupplierproductListItemDisplay_TableCell_availToDt(instance, SupplierproductListItemDisplay_availToDt);
    final TableCell SupplierproductListItemDisplay_pref = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_pref);
    SupplierproductListItemDisplay_TableCell_pref(instance, SupplierproductListItemDisplay_pref);
    final TableCell SupplierproductListItemDisplay_rating = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_rating);
    SupplierproductListItemDisplay_TableCell_rating(instance, SupplierproductListItemDisplay_rating);
    final TableCell SupplierproductListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_entityCode);
    SupplierproductListItemDisplay_TableCell_entityCode(instance, SupplierproductListItemDisplay_entityCode);
    final Event SupplierproductListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SupplierproductListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_deleteEntityEvent);
    SupplierproductListItemDisplay_Event_deleteEntityEvent(instance, SupplierproductListItemDisplay_deleteEntityEvent);
    final Event SupplierproductListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SupplierproductListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_renderSingleViewEvent);
    SupplierproductListItemDisplay_Event_renderSingleViewEvent(instance, SupplierproductListItemDisplay_renderSingleViewEvent);
    final AnchorElement SupplierproductListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_editEntityListItemBtn);
    SupplierproductListItemDisplay_AnchorElement_editEntityListItemBtn(instance, SupplierproductListItemDisplay_editEntityListItemBtn);
    final TableCell SupplierproductListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_name);
    SupplierproductListItemDisplay_TableCell_name(instance, SupplierproductListItemDisplay_name);
    final TableRow SupplierproductListItemDisplay_supplierproductItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_supplierproductItem);
    SupplierproductListItemDisplay_TableRow_supplierproductItem(instance, SupplierproductListItemDisplay_supplierproductItem);
    final TableCell SupplierproductListItemDisplay_availFromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_availFromDt);
    SupplierproductListItemDisplay_TableCell_availFromDt(instance, SupplierproductListItemDisplay_availFromDt);
    final AnchorElement SupplierproductListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_deleteEntityListItemBtn);
    SupplierproductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, SupplierproductListItemDisplay_deleteEntityListItemBtn);
    final TableCell SupplierproductListItemDisplay_prod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_prod);
    SupplierproductListItemDisplay_TableCell_prod(instance, SupplierproductListItemDisplay_prod);
    final TableCell SupplierproductListItemDisplay_remarks = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductListItemDisplay_remarks);
    SupplierproductListItemDisplay_TableCell_remarks(instance, SupplierproductListItemDisplay_remarks);
    final DataBinder SupplierproductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Supplierproduct.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SupplierproductPresenter_binder);
    SupplierproductPresenter_DataBinder_binder(instance, SupplierproductPresenter_binder);
    c_c_h_c_l_s_SupplierproductListItemDisplayTemplateResource templateForSupplierproductListItemDisplay = GWT.create(c_c_h_c_l_s_SupplierproductListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfSupplierproductListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForSupplierproductListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", "supplierproductItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableRow_supplierproductItem(instance)));
      }
    }, dataFieldElements, "supplierproductItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_supplier(instance)));
      }
    }, dataFieldElements, "supplier");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_rating(instance)));
      }
    }, dataFieldElements, "rating");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_prod(instance)));
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_pref(instance)));
      }
    }, dataFieldElements, "pref");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_availFromDt(instance)));
      }
    }, dataFieldElements, "availFromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_availToDt(instance)));
      }
    }, dataFieldElements, "availToDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_remarks(instance)));
      }
    }, dataFieldElements, "remarks");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SupplierproductListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com/cloderia/helion/client/local/supplierproduct/list-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SupplierproductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("supplierproductItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableRow_supplierproductItem(instance))));
    templateFieldsMap.put("supplier", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_supplier(instance))));
    templateFieldsMap.put("rating", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_rating(instance))));
    templateFieldsMap.put("prod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_prod(instance))));
    templateFieldsMap.put("pref", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_pref(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("availFromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_availFromDt(instance))));
    templateFieldsMap.put("availToDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_availToDt(instance))));
    templateFieldsMap.put("remarks", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductListItemDisplay_TableCell_remarks(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(SupplierproductListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(SupplierproductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = SupplierproductPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_supplier(instance))), "supplier.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_rating(instance))), "rating.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_prod(instance))), "prod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_pref(instance))), "pref.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_availFromDt(instance))), "availFromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_availToDt(instance))), "availToDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductListItemDisplay_TableCell_remarks(instance))), "remarks", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SupplierproductListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final SupplierproductListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SupplierproductListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SupplierproductListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SupplierproductListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell SupplierproductListItemDisplay_TableCell_entityCode(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::entityCode;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_entityCode(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_pref(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::pref;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_pref(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::pref = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_supplier(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::supplier;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_supplier(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::supplier = value;
  }-*/;

  native static Event SupplierproductListItemDisplay_Event_renderSingleViewEvent(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void SupplierproductListItemDisplay_Event_renderSingleViewEvent(SupplierproductListItemDisplay instance, Event<SupplierproductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static AnchorElement SupplierproductListItemDisplay_AnchorElement_deleteEntityListItemBtn(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void SupplierproductListItemDisplay_AnchorElement_deleteEntityListItemBtn(SupplierproductListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static AnchorElement SupplierproductListItemDisplay_AnchorElement_editEntityListItemBtn(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void SupplierproductListItemDisplay_AnchorElement_editEntityListItemBtn(SupplierproductListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_prod(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::prod;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_prod(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::prod = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_availToDt(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::availToDt;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_availToDt(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::availToDt = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_rating(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::rating;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_rating(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::rating = value;
  }-*/;

  native static DataBinder SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder;
  }-*/;

  native static void SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance, DataBinder<Supplierproduct> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder = value;
  }-*/;

  native static TableRow SupplierproductListItemDisplay_TableRow_supplierproductItem(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::supplierproductItem;
  }-*/;

  native static void SupplierproductListItemDisplay_TableRow_supplierproductItem(SupplierproductListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::supplierproductItem = value;
  }-*/;

  native static Event SupplierproductListItemDisplay_Event_deleteEntityEvent(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void SupplierproductListItemDisplay_Event_deleteEntityEvent(SupplierproductListItemDisplay instance, Event<SupplierproductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_name(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::name;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_name(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::name = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_remarks(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::remarks;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_remarks(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::remarks = value;
  }-*/;

  native static Event SupplierproductListItemDisplay_Event_renderEditViewEvent(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void SupplierproductListItemDisplay_Event_renderEditViewEvent(SupplierproductListItemDisplay instance, Event<SupplierproductListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell SupplierproductListItemDisplay_TableCell_availFromDt(SupplierproductListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::availFromDt;
  }-*/;

  native static void SupplierproductListItemDisplay_TableCell_availFromDt(SupplierproductListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay::availFromDt = value;
  }-*/;
}
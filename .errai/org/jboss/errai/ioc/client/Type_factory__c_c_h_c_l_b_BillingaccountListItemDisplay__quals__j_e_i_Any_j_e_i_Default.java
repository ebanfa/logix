package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay;
import com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Billingaccount;
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

public class Type_factory__c_c_h_c_l_b_BillingaccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BillingaccountListItemDisplay.class, "Type_factory__c_c_h_c_l_b_BillingaccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BillingaccountListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BillingaccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BillingaccountListItemDisplay.class);
    handle.addAssignableType(BillingaccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BillingaccountListItemDisplay createInstance(final ContextManager contextManager) {
    final BillingaccountListItemDisplay instance = new BillingaccountListItemDisplay();
    setIncompleteInstance(instance);
    final Event BillingaccountListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BillingaccountListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_renderEditViewEvent);
    BillingaccountListItemDisplay_Event_renderEditViewEvent(instance, BillingaccountListItemDisplay_renderEditViewEvent);
    final TableRow BillingaccountListItemDisplay_billingaccountItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_billingaccountItem);
    BillingaccountListItemDisplay_TableRow_billingaccountItem(instance, BillingaccountListItemDisplay_billingaccountItem);
    final TableCell BillingaccountListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_name);
    BillingaccountListItemDisplay_TableCell_name(instance, BillingaccountListItemDisplay_name);
    final Event BillingaccountListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BillingaccountListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_renderSingleViewEvent);
    BillingaccountListItemDisplay_Event_renderSingleViewEvent(instance, BillingaccountListItemDisplay_renderSingleViewEvent);
    final Event BillingaccountListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BillingaccountListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_deleteEntityEvent);
    BillingaccountListItemDisplay_Event_deleteEntityEvent(instance, BillingaccountListItemDisplay_deleteEntityEvent);
    final AnchorElement BillingaccountListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_editEntityListItemBtn);
    BillingaccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance, BillingaccountListItemDisplay_editEntityListItemBtn);
    final AnchorElement BillingaccountListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_deleteEntityListItemBtn);
    BillingaccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, BillingaccountListItemDisplay_deleteEntityListItemBtn);
    final TableCell BillingaccountListItemDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_toDt);
    BillingaccountListItemDisplay_TableCell_toDt(instance, BillingaccountListItemDisplay_toDt);
    final TableCell BillingaccountListItemDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_fromDt);
    BillingaccountListItemDisplay_TableCell_fromDt(instance, BillingaccountListItemDisplay_fromDt);
    final DataBinder BillingaccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Billingaccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BillingaccountPresenter_binder);
    BillingaccountPresenter_DataBinder_binder(instance, BillingaccountPresenter_binder);
    final TableCell BillingaccountListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_entityCode);
    BillingaccountListItemDisplay_TableCell_entityCode(instance, BillingaccountListItemDisplay_entityCode);
    final TableCell BillingaccountListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_description);
    BillingaccountListItemDisplay_TableCell_description(instance, BillingaccountListItemDisplay_description);
    final TableCell BillingaccountListItemDisplay_toContMech = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountListItemDisplay_toContMech);
    BillingaccountListItemDisplay_TableCell_toContMech(instance, BillingaccountListItemDisplay_toContMech);
    c_c_h_c_l_b_BillingaccountListItemDisplayTemplateResource templateForBillingaccountListItemDisplay = GWT.create(c_c_h_c_l_b_BillingaccountListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfBillingaccountListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForBillingaccountListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", "billingaccountItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableRow_billingaccountItem(instance)));
      }
    }, dataFieldElements, "billingaccountItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_toContMech(instance)));
      }
    }, dataFieldElements, "toContMech");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BillingaccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BillingaccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("billingaccountItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableRow_billingaccountItem(instance))));
    templateFieldsMap.put("toContMech", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_toContMech(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListItemDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(BillingaccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(BillingaccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = BillingaccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountListItemDisplay_TableCell_toContMech(instance))), "toContMech.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountListItemDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountListItemDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BillingaccountListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final BillingaccountListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BillingaccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BillingaccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BillingaccountListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell BillingaccountListItemDisplay_TableCell_toContMech(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::toContMech;
  }-*/;

  native static void BillingaccountListItemDisplay_TableCell_toContMech(BillingaccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::toContMech = value;
  }-*/;

  native static TableCell BillingaccountListItemDisplay_TableCell_fromDt(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::fromDt;
  }-*/;

  native static void BillingaccountListItemDisplay_TableCell_fromDt(BillingaccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::fromDt = value;
  }-*/;

  native static TableCell BillingaccountListItemDisplay_TableCell_description(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::description;
  }-*/;

  native static void BillingaccountListItemDisplay_TableCell_description(BillingaccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::description = value;
  }-*/;

  native static Event BillingaccountListItemDisplay_Event_renderSingleViewEvent(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void BillingaccountListItemDisplay_Event_renderSingleViewEvent(BillingaccountListItemDisplay instance, Event<BillingaccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableRow BillingaccountListItemDisplay_TableRow_billingaccountItem(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::billingaccountItem;
  }-*/;

  native static void BillingaccountListItemDisplay_TableRow_billingaccountItem(BillingaccountListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::billingaccountItem = value;
  }-*/;

  native static AnchorElement BillingaccountListItemDisplay_AnchorElement_editEntityListItemBtn(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void BillingaccountListItemDisplay_AnchorElement_editEntityListItemBtn(BillingaccountListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event BillingaccountListItemDisplay_Event_renderEditViewEvent(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void BillingaccountListItemDisplay_Event_renderEditViewEvent(BillingaccountListItemDisplay instance, Event<BillingaccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement BillingaccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void BillingaccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(BillingaccountListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell BillingaccountListItemDisplay_TableCell_name(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::name;
  }-*/;

  native static void BillingaccountListItemDisplay_TableCell_name(BillingaccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::name = value;
  }-*/;

  native static TableCell BillingaccountListItemDisplay_TableCell_toDt(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::toDt;
  }-*/;

  native static void BillingaccountListItemDisplay_TableCell_toDt(BillingaccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::toDt = value;
  }-*/;

  native static DataBinder BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder;
  }-*/;

  native static void BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance, DataBinder<Billingaccount> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder = value;
  }-*/;

  native static TableCell BillingaccountListItemDisplay_TableCell_entityCode(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::entityCode;
  }-*/;

  native static void BillingaccountListItemDisplay_TableCell_entityCode(BillingaccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::entityCode = value;
  }-*/;

  native static Event BillingaccountListItemDisplay_Event_deleteEntityEvent(BillingaccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void BillingaccountListItemDisplay_Event_deleteEntityEvent(BillingaccountListItemDisplay instance, Event<BillingaccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay::deleteEntityEvent = value;
  }-*/;
}
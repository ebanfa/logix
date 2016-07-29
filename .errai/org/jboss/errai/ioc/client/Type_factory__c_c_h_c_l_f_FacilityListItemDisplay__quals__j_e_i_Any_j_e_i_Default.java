package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facility.FacilityListItemDisplay;
import com.cloderia.helion.client.local.facility.FacilityPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Facility;
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

public class Type_factory__c_c_h_c_l_f_FacilityListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilityListItemDisplay.class, "Type_factory__c_c_h_c_l_f_FacilityListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_FacilityListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facility/list-facility-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_FacilityListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilityListItemDisplay.class);
    handle.addAssignableType(FacilityPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilityListItemDisplay createInstance(final ContextManager contextManager) {
    final FacilityListItemDisplay instance = new FacilityListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell FacilityListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_effectiveDt);
    FacilityListItemDisplay_TableCell_effectiveDt(instance, FacilityListItemDisplay_effectiveDt);
    final Event FacilityListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilityListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, FacilityListItemDisplay_renderSingleViewEvent);
    FacilityListItemDisplay_Event_renderSingleViewEvent(instance, FacilityListItemDisplay_renderSingleViewEvent);
    final AnchorElement FacilityListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_deleteEntityListItemBtn);
    FacilityListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, FacilityListItemDisplay_deleteEntityListItemBtn);
    final AnchorElement FacilityListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_editEntityListItemBtn);
    FacilityListItemDisplay_AnchorElement_editEntityListItemBtn(instance, FacilityListItemDisplay_editEntityListItemBtn);
    final DataBinder FacilityPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facility.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilityPresenter_binder);
    FacilityPresenter_DataBinder_binder(instance, FacilityPresenter_binder);
    final TableCell FacilityListItemDisplay_facilityTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_facilityTy);
    FacilityListItemDisplay_TableCell_facilityTy(instance, FacilityListItemDisplay_facilityTy);
    final TableCell FacilityListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_name);
    FacilityListItemDisplay_TableCell_name(instance, FacilityListItemDisplay_name);
    final Event FacilityListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilityListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, FacilityListItemDisplay_renderEditViewEvent);
    FacilityListItemDisplay_Event_renderEditViewEvent(instance, FacilityListItemDisplay_renderEditViewEvent);
    final TableRow FacilityListItemDisplay_facilityItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_facilityItem);
    FacilityListItemDisplay_TableRow_facilityItem(instance, FacilityListItemDisplay_facilityItem);
    final Event FacilityListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilityListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilityListItemDisplay_deleteEntityEvent);
    FacilityListItemDisplay_Event_deleteEntityEvent(instance, FacilityListItemDisplay_deleteEntityEvent);
    final TableCell FacilityListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_description);
    FacilityListItemDisplay_TableCell_description(instance, FacilityListItemDisplay_description);
    final TableCell FacilityListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityListItemDisplay_entityCode);
    FacilityListItemDisplay_TableCell_entityCode(instance, FacilityListItemDisplay_entityCode);
    c_c_h_c_l_f_FacilityListItemDisplayTemplateResource templateForFacilityListItemDisplay = GWT.create(c_c_h_c_l_f_FacilityListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfFacilityListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForFacilityListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/facility/list-facility-page.html", "facilityItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facility/list-facility-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableRow_facilityItem(instance)));
      }
    }, dataFieldElements, "facilityItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_facilityTy(instance)));
      }
    }, dataFieldElements, "facilityTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilityListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilityListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("facilityItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableRow_facilityItem(instance))));
    templateFieldsMap.put("facilityTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_facilityTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(FacilityListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(FacilityListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = FacilityPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.facility.FacilityListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityListItemDisplay_TableCell_facilityTy(instance))), "facilityTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilityListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilityListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilityListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilityListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final FacilityListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell FacilityListItemDisplay_TableCell_facilityTy(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::facilityTy;
  }-*/;

  native static void FacilityListItemDisplay_TableCell_facilityTy(FacilityListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::facilityTy = value;
  }-*/;

  native static Event FacilityListItemDisplay_Event_renderSingleViewEvent(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void FacilityListItemDisplay_Event_renderSingleViewEvent(FacilityListItemDisplay instance, Event<FacilityListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static AnchorElement FacilityListItemDisplay_AnchorElement_editEntityListItemBtn(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void FacilityListItemDisplay_AnchorElement_editEntityListItemBtn(FacilityListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static AnchorElement FacilityListItemDisplay_AnchorElement_deleteEntityListItemBtn(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void FacilityListItemDisplay_AnchorElement_deleteEntityListItemBtn(FacilityListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event FacilityListItemDisplay_Event_renderEditViewEvent(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void FacilityListItemDisplay_Event_renderEditViewEvent(FacilityListItemDisplay instance, Event<FacilityListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell FacilityListItemDisplay_TableCell_effectiveDt(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::effectiveDt;
  }-*/;

  native static void FacilityListItemDisplay_TableCell_effectiveDt(FacilityListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell FacilityListItemDisplay_TableCell_entityCode(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::entityCode;
  }-*/;

  native static void FacilityListItemDisplay_TableCell_entityCode(FacilityListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::entityCode = value;
  }-*/;

  native static DataBinder FacilityPresenter_DataBinder_binder(FacilityPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder;
  }-*/;

  native static void FacilityPresenter_DataBinder_binder(FacilityPresenter instance, DataBinder<Facility> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder = value;
  }-*/;

  native static TableRow FacilityListItemDisplay_TableRow_facilityItem(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::facilityItem;
  }-*/;

  native static void FacilityListItemDisplay_TableRow_facilityItem(FacilityListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::facilityItem = value;
  }-*/;

  native static Event FacilityListItemDisplay_Event_deleteEntityEvent(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void FacilityListItemDisplay_Event_deleteEntityEvent(FacilityListItemDisplay instance, Event<FacilityListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell FacilityListItemDisplay_TableCell_name(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::name;
  }-*/;

  native static void FacilityListItemDisplay_TableCell_name(FacilityListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::name = value;
  }-*/;

  native static TableCell FacilityListItemDisplay_TableCell_description(FacilityListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::description;
  }-*/;

  native static void FacilityListItemDisplay_TableCell_description(FacilityListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListItemDisplay::description = value;
  }-*/;
}
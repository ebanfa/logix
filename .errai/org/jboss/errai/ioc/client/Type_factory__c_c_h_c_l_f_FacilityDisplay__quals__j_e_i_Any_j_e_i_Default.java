package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facility.FacilityDisplay;
import com.cloderia.helion.client.local.facility.FacilityPresenter;
import com.cloderia.helion.client.local.facility.ListFacilityPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_f_FacilityDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilityDisplay.class, "Type_factory__c_c_h_c_l_f_FacilityDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_FacilityDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facility/view-facility-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_FacilityDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilityDisplay.class);
    handle.addAssignableType(FacilityPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilityDisplay createInstance(final ContextManager contextManager) {
    final FacilityDisplay instance = new FacilityDisplay();
    setIncompleteInstance(instance);
    final TableCell FacilityDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_entityCode);
    FacilityDisplay_TableCell_entityCode(instance, FacilityDisplay_entityCode);
    final Span FacilityDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_createdDt);
    FacilityDisplay_Span_createdDt(instance, FacilityDisplay_createdDt);
    final Event FacilityDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilityDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilityDisplay_deleteEntityEvent);
    FacilityDisplay_Event_deleteEntityEvent(instance, FacilityDisplay_deleteEntityEvent);
    final TableCell FacilityDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_description);
    FacilityDisplay_TableCell_description(instance, FacilityDisplay_description);
    final DataBinder FacilityPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facility.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilityPresenter_binder);
    FacilityPresenter_DataBinder_binder(instance, FacilityPresenter_binder);
    final Div FacilityDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_entityDisplayComponent);
    FacilityDisplay_Div_entityDisplayComponent(instance, FacilityDisplay_entityDisplayComponent);
    final Event FacilityDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilityDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, FacilityDisplay_renderEditViewEvent);
    FacilityDisplay_Event_renderEditViewEvent(instance, FacilityDisplay_renderEditViewEvent);
    final TableCell FacilityDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_universe);
    FacilityDisplay_TableCell_universe(instance, FacilityDisplay_universe);
    final TableCell FacilityDisplay_facilityTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_facilityTy);
    FacilityDisplay_TableCell_facilityTy(instance, FacilityDisplay_facilityTy);
    final TransitionTo FacilityDisplay_listFacilitysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListFacilityPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilityDisplay_listFacilitysPage);
    FacilityDisplay_TransitionTo_listFacilitysPage(instance, FacilityDisplay_listFacilitysPage);
    final TableCell FacilityDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_effectiveDt);
    FacilityDisplay_TableCell_effectiveDt(instance, FacilityDisplay_effectiveDt);
    final Heading FacilityDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, FacilityDisplay_code);
    FacilityDisplay_Heading_code(instance, FacilityDisplay_code);
    final Span FacilityDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_lastModifiedDt);
    FacilityDisplay_Span_lastModifiedDt(instance, FacilityDisplay_lastModifiedDt);
    final TableCell FacilityDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityDisplay_name);
    FacilityDisplay_TableCell_name(instance, FacilityDisplay_name);
    c_c_h_c_l_f_FacilityDisplayTemplateResource templateForFacilityDisplay = GWT.create(c_c_h_c_l_f_FacilityDisplayTemplateResource.class);
    Element parentElementForTemplateOfFacilityDisplay = TemplateUtil.getRootTemplateParentElement(templateForFacilityDisplay.getContents().getText(), "com/cloderia/helion/client/local/facility/view-facility-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facility/view-facility-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_facilityTy(instance)));
      }
    }, dataFieldElements, "facilityTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_editFacilityBtn(instance));
      }
    }, dataFieldElements, "editFacilityBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_deleteFacilityBtn(instance));
      }
    }, dataFieldElements, "deleteFacilityBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityDisplay", "com/cloderia/helion/client/local/facility/view-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_listFacilitysPageLink(instance));
      }
    }, dataFieldElements, "listFacilitysPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("facilityTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_facilityTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editFacilityBtn", ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_editFacilityBtn(instance)));
    templateFieldsMap.put("deleteFacilityBtn", ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_deleteFacilityBtn(instance)));
    templateFieldsMap.put("listFacilitysPageLink", ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_listFacilitysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editFacilityBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditFacilityBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteFacilityBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteFacilityBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listFacilitysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = FacilityPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.facility.FacilityDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_TableCell_facilityTy(instance))), "facilityTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilityDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilityDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilityDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_editFacilityBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_deleteFacilityBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilityDisplay_AnchorElement_listFacilitysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final FacilityDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Heading FacilityDisplay_Heading_code(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::code;
  }-*/;

  native static void FacilityDisplay_Heading_code(FacilityDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::code = value;
  }-*/;

  native static Span FacilityDisplay_Span_createdDt(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::createdDt;
  }-*/;

  native static void FacilityDisplay_Span_createdDt(FacilityDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::createdDt = value;
  }-*/;

  native static Event FacilityDisplay_Event_renderEditViewEvent(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::renderEditViewEvent;
  }-*/;

  native static void FacilityDisplay_Event_renderEditViewEvent(FacilityDisplay instance, Event<FacilityDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell FacilityDisplay_TableCell_universe(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::universe;
  }-*/;

  native static void FacilityDisplay_TableCell_universe(FacilityDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::universe = value;
  }-*/;

  native static Span FacilityDisplay_Span_lastModifiedDt(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::lastModifiedDt;
  }-*/;

  native static void FacilityDisplay_Span_lastModifiedDt(FacilityDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell FacilityDisplay_TableCell_facilityTy(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::facilityTy;
  }-*/;

  native static void FacilityDisplay_TableCell_facilityTy(FacilityDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::facilityTy = value;
  }-*/;

  native static AnchorElement FacilityDisplay_AnchorElement_editFacilityBtn(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::editFacilityBtn;
  }-*/;

  native static void FacilityDisplay_AnchorElement_editFacilityBtn(FacilityDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::editFacilityBtn = value;
  }-*/;

  native static Div FacilityDisplay_Div_entityDisplayComponent(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::entityDisplayComponent;
  }-*/;

  native static void FacilityDisplay_Div_entityDisplayComponent(FacilityDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell FacilityDisplay_TableCell_entityCode(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::entityCode;
  }-*/;

  native static void FacilityDisplay_TableCell_entityCode(FacilityDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::entityCode = value;
  }-*/;

  native static Event FacilityDisplay_Event_deleteEntityEvent(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::deleteEntityEvent;
  }-*/;

  native static void FacilityDisplay_Event_deleteEntityEvent(FacilityDisplay instance, Event<FacilityDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell FacilityDisplay_TableCell_name(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::name;
  }-*/;

  native static void FacilityDisplay_TableCell_name(FacilityDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::name = value;
  }-*/;

  native static TableCell FacilityDisplay_TableCell_effectiveDt(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::effectiveDt;
  }-*/;

  native static void FacilityDisplay_TableCell_effectiveDt(FacilityDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::effectiveDt = value;
  }-*/;

  native static DataBinder FacilityPresenter_DataBinder_binder(FacilityPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder;
  }-*/;

  native static void FacilityPresenter_DataBinder_binder(FacilityPresenter instance, DataBinder<Facility> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder = value;
  }-*/;

  native static TransitionTo FacilityDisplay_TransitionTo_listFacilitysPage(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::listFacilitysPage;
  }-*/;

  native static void FacilityDisplay_TransitionTo_listFacilitysPage(FacilityDisplay instance, TransitionTo<ListFacilityPage> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::listFacilitysPage = value;
  }-*/;

  native static TableCell FacilityDisplay_TableCell_description(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::description;
  }-*/;

  native static void FacilityDisplay_TableCell_description(FacilityDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::description = value;
  }-*/;

  native static AnchorElement FacilityDisplay_AnchorElement_listFacilitysPageLink(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::listFacilitysPageLink;
  }-*/;

  native static void FacilityDisplay_AnchorElement_listFacilitysPageLink(FacilityDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::listFacilitysPageLink = value;
  }-*/;

  native static AnchorElement FacilityDisplay_AnchorElement_deleteFacilityBtn(FacilityDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::deleteFacilityBtn;
  }-*/;

  native static void FacilityDisplay_AnchorElement_deleteFacilityBtn(FacilityDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityDisplay::deleteFacilityBtn = value;
  }-*/;
}
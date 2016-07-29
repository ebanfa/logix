package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay;
import com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter;
import com.cloderia.helion.client.local.facilitytype.ListFacilitytypePage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Facilitytype;
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

public class Type_factory__c_c_h_c_l_f_FacilitytypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypeDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilitytypeDisplay.class, "Type_factory__c_c_h_c_l_f_FacilitytypeDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_FacilitytypeDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_FacilitytypeDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilitytypeDisplay.class);
    handle.addAssignableType(FacilitytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilitytypeDisplay createInstance(final ContextManager contextManager) {
    final FacilitytypeDisplay instance = new FacilitytypeDisplay();
    setIncompleteInstance(instance);
    final TableCell FacilitytypeDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_effectiveDt);
    FacilitytypeDisplay_TableCell_effectiveDt(instance, FacilitytypeDisplay_effectiveDt);
    final Event FacilitytypeDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilitytypeDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, FacilitytypeDisplay_renderEditViewEvent);
    FacilitytypeDisplay_Event_renderEditViewEvent(instance, FacilitytypeDisplay_renderEditViewEvent);
    final Div FacilitytypeDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_entityDisplayComponent);
    FacilitytypeDisplay_Div_entityDisplayComponent(instance, FacilitytypeDisplay_entityDisplayComponent);
    final Span FacilitytypeDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_createdDt);
    FacilitytypeDisplay_Span_createdDt(instance, FacilitytypeDisplay_createdDt);
    final TransitionTo FacilitytypeDisplay_listFacilitytypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListFacilitytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilitytypeDisplay_listFacilitytypesPage);
    FacilitytypeDisplay_TransitionTo_listFacilitytypesPage(instance, FacilitytypeDisplay_listFacilitytypesPage);
    final DataBinder FacilitytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facilitytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilitytypePresenter_binder);
    FacilitytypePresenter_DataBinder_binder(instance, FacilitytypePresenter_binder);
    final TableCell FacilitytypeDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_universe);
    FacilitytypeDisplay_TableCell_universe(instance, FacilitytypeDisplay_universe);
    final TableCell FacilitytypeDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_description);
    FacilitytypeDisplay_TableCell_description(instance, FacilitytypeDisplay_description);
    final Heading FacilitytypeDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, FacilitytypeDisplay_code);
    FacilitytypeDisplay_Heading_code(instance, FacilitytypeDisplay_code);
    final Span FacilitytypeDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_lastModifiedDt);
    FacilitytypeDisplay_Span_lastModifiedDt(instance, FacilitytypeDisplay_lastModifiedDt);
    final Event FacilitytypeDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilitytypeDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilitytypeDisplay_deleteEntityEvent);
    FacilitytypeDisplay_Event_deleteEntityEvent(instance, FacilitytypeDisplay_deleteEntityEvent);
    final TableCell FacilitytypeDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_entityCode);
    FacilitytypeDisplay_TableCell_entityCode(instance, FacilitytypeDisplay_entityCode);
    final TableCell FacilitytypeDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeDisplay_name);
    FacilitytypeDisplay_TableCell_name(instance, FacilitytypeDisplay_name);
    c_c_h_c_l_f_FacilitytypeDisplayTemplateResource templateForFacilitytypeDisplay = GWT.create(c_c_h_c_l_f_FacilitytypeDisplayTemplateResource.class);
    Element parentElementForTemplateOfFacilitytypeDisplay = TemplateUtil.getRootTemplateParentElement(templateForFacilitytypeDisplay.getContents().getText(), "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_editFacilitytypeBtn(instance));
      }
    }, dataFieldElements, "editFacilitytypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_deleteFacilitytypeBtn(instance));
      }
    }, dataFieldElements, "deleteFacilitytypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com/cloderia/helion/client/local/facilitytype/view-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_listFacilitytypesPageLink(instance));
      }
    }, dataFieldElements, "listFacilitytypesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editFacilitytypeBtn", ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_editFacilitytypeBtn(instance)));
    templateFieldsMap.put("deleteFacilitytypeBtn", ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_deleteFacilitytypeBtn(instance)));
    templateFieldsMap.put("listFacilitytypesPageLink", ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_listFacilitytypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editFacilitytypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditFacilitytypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteFacilitytypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteFacilitytypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listFacilitytypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = FacilitytypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilitytypeDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilitytypeDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_editFacilitytypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_deleteFacilitytypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilitytypeDisplay_AnchorElement_listFacilitytypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final FacilitytypeDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span FacilitytypeDisplay_Span_lastModifiedDt(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::lastModifiedDt;
  }-*/;

  native static void FacilitytypeDisplay_Span_lastModifiedDt(FacilitytypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::lastModifiedDt = value;
  }-*/;

  native static AnchorElement FacilitytypeDisplay_AnchorElement_editFacilitytypeBtn(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::editFacilitytypeBtn;
  }-*/;

  native static void FacilitytypeDisplay_AnchorElement_editFacilitytypeBtn(FacilitytypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::editFacilitytypeBtn = value;
  }-*/;

  native static Event FacilitytypeDisplay_Event_deleteEntityEvent(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::deleteEntityEvent;
  }-*/;

  native static void FacilitytypeDisplay_Event_deleteEntityEvent(FacilitytypeDisplay instance, Event<FacilitytypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell FacilitytypeDisplay_TableCell_description(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::description;
  }-*/;

  native static void FacilitytypeDisplay_TableCell_description(FacilitytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::description = value;
  }-*/;

  native static TableCell FacilitytypeDisplay_TableCell_universe(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::universe;
  }-*/;

  native static void FacilitytypeDisplay_TableCell_universe(FacilitytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::universe = value;
  }-*/;

  native static AnchorElement FacilitytypeDisplay_AnchorElement_deleteFacilitytypeBtn(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::deleteFacilitytypeBtn;
  }-*/;

  native static void FacilitytypeDisplay_AnchorElement_deleteFacilitytypeBtn(FacilitytypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::deleteFacilitytypeBtn = value;
  }-*/;

  native static Div FacilitytypeDisplay_Div_entityDisplayComponent(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::entityDisplayComponent;
  }-*/;

  native static void FacilitytypeDisplay_Div_entityDisplayComponent(FacilitytypeDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::entityDisplayComponent = value;
  }-*/;

  native static AnchorElement FacilitytypeDisplay_AnchorElement_listFacilitytypesPageLink(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::listFacilitytypesPageLink;
  }-*/;

  native static void FacilitytypeDisplay_AnchorElement_listFacilitytypesPageLink(FacilitytypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::listFacilitytypesPageLink = value;
  }-*/;

  native static TableCell FacilitytypeDisplay_TableCell_effectiveDt(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::effectiveDt;
  }-*/;

  native static void FacilitytypeDisplay_TableCell_effectiveDt(FacilitytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::effectiveDt = value;
  }-*/;

  native static TransitionTo FacilitytypeDisplay_TransitionTo_listFacilitytypesPage(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::listFacilitytypesPage;
  }-*/;

  native static void FacilitytypeDisplay_TransitionTo_listFacilitytypesPage(FacilitytypeDisplay instance, TransitionTo<ListFacilitytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::listFacilitytypesPage = value;
  }-*/;

  native static Heading FacilitytypeDisplay_Heading_code(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::code;
  }-*/;

  native static void FacilitytypeDisplay_Heading_code(FacilitytypeDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::code = value;
  }-*/;

  native static TableCell FacilitytypeDisplay_TableCell_entityCode(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::entityCode;
  }-*/;

  native static void FacilitytypeDisplay_TableCell_entityCode(FacilitytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::entityCode = value;
  }-*/;

  native static DataBinder FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder;
  }-*/;

  native static void FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance, DataBinder<Facilitytype> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder = value;
  }-*/;

  native static Span FacilitytypeDisplay_Span_createdDt(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::createdDt;
  }-*/;

  native static void FacilitytypeDisplay_Span_createdDt(FacilitytypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::createdDt = value;
  }-*/;

  native static TableCell FacilitytypeDisplay_TableCell_name(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::name;
  }-*/;

  native static void FacilitytypeDisplay_TableCell_name(FacilitytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::name = value;
  }-*/;

  native static Event FacilitytypeDisplay_Event_renderEditViewEvent(FacilitytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::renderEditViewEvent;
  }-*/;

  native static void FacilitytypeDisplay_Event_renderEditViewEvent(FacilitytypeDisplay instance, Event<FacilitytypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay::renderEditViewEvent = value;
  }-*/;
}
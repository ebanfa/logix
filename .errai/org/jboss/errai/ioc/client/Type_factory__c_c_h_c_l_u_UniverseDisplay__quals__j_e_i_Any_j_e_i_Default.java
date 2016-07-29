package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.universe.ListUniversePage;
import com.cloderia.helion.client.local.universe.UniverseDisplay;
import com.cloderia.helion.client.local.universe.UniversePresenter;
import com.cloderia.helion.client.shared.model.Universe;
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

public class Type_factory__c_c_h_c_l_u_UniverseDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(UniverseDisplay.class, "Type_factory__c_c_h_c_l_u_UniverseDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_u_UniverseDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/universe/view-universe-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_u_UniverseDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(UniverseDisplay.class);
    handle.addAssignableType(UniversePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public UniverseDisplay createInstance(final ContextManager contextManager) {
    final UniverseDisplay instance = new UniverseDisplay();
    setIncompleteInstance(instance);
    final DataBinder UniversePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Universe.class }, new Annotation[] { });
    registerDependentScopedReference(instance, UniversePresenter_binder);
    UniversePresenter_DataBinder_binder(instance, UniversePresenter_binder);
    final Heading UniverseDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, UniverseDisplay_code);
    UniverseDisplay_Heading_code(instance, UniverseDisplay_code);
    final TableCell UniverseDisplay_businessNo = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_businessNo);
    UniverseDisplay_TableCell_businessNo(instance, UniverseDisplay_businessNo);
    final TransitionTo UniverseDisplay_listUniversesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListUniversePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, UniverseDisplay_listUniversesPage);
    UniverseDisplay_TransitionTo_listUniversesPage(instance, UniverseDisplay_listUniversesPage);
    final TableCell UniverseDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_effectiveDt);
    UniverseDisplay_TableCell_effectiveDt(instance, UniverseDisplay_effectiveDt);
    final Span UniverseDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_createdDt);
    UniverseDisplay_Span_createdDt(instance, UniverseDisplay_createdDt);
    final Span UniverseDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_lastModifiedDt);
    UniverseDisplay_Span_lastModifiedDt(instance, UniverseDisplay_lastModifiedDt);
    final TableCell UniverseDisplay_parentUniverse = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_parentUniverse);
    UniverseDisplay_TableCell_parentUniverse(instance, UniverseDisplay_parentUniverse);
    final Event UniverseDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UniverseDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, UniverseDisplay_renderEditViewEvent);
    UniverseDisplay_Event_renderEditViewEvent(instance, UniverseDisplay_renderEditViewEvent);
    final TableCell UniverseDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_entityCode);
    UniverseDisplay_TableCell_entityCode(instance, UniverseDisplay_entityCode);
    final TableCell UniverseDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_description);
    UniverseDisplay_TableCell_description(instance, UniverseDisplay_description);
    final Event UniverseDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UniverseDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, UniverseDisplay_deleteEntityEvent);
    UniverseDisplay_Event_deleteEntityEvent(instance, UniverseDisplay_deleteEntityEvent);
    final TableCell UniverseDisplay_universeTyCd = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_universeTyCd);
    UniverseDisplay_TableCell_universeTyCd(instance, UniverseDisplay_universeTyCd);
    final Div UniverseDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_entityDisplayComponent);
    UniverseDisplay_Div_entityDisplayComponent(instance, UniverseDisplay_entityDisplayComponent);
    final TableCell UniverseDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseDisplay_name);
    UniverseDisplay_TableCell_name(instance, UniverseDisplay_name);
    c_c_h_c_l_u_UniverseDisplayTemplateResource templateForUniverseDisplay = GWT.create(c_c_h_c_l_u_UniverseDisplayTemplateResource.class);
    Element parentElementForTemplateOfUniverseDisplay = TemplateUtil.getRootTemplateParentElement(templateForUniverseDisplay.getContents().getText(), "com/cloderia/helion/client/local/universe/view-universe-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/universe/view-universe-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_parentUniverse(instance)));
      }
    }, dataFieldElements, "parentUniverse");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_businessNo(instance)));
      }
    }, dataFieldElements, "businessNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_universeTyCd(instance)));
      }
    }, dataFieldElements, "universeTyCd");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_editUniverseBtn(instance));
      }
    }, dataFieldElements, "editUniverseBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_deleteUniverseBtn(instance));
      }
    }, dataFieldElements, "deleteUniverseBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseDisplay", "com/cloderia/helion/client/local/universe/view-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_listUniversesPageLink(instance));
      }
    }, dataFieldElements, "listUniversesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("parentUniverse", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_parentUniverse(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("businessNo", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_businessNo(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("universeTyCd", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseDisplay_TableCell_universeTyCd(instance))));
    templateFieldsMap.put("editUniverseBtn", ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_editUniverseBtn(instance)));
    templateFieldsMap.put("deleteUniverseBtn", ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_deleteUniverseBtn(instance)));
    templateFieldsMap.put("listUniversesPageLink", ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_listUniversesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editUniverseBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditUniverseBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteUniverseBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteUniverseBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listUniversesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = UniversePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.universe.UniverseDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_TableCell_parentUniverse(instance))), "parentUniverse.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_TableCell_businessNo(instance))), "businessNo", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseDisplay_TableCell_universeTyCd(instance))), "universeTyCd", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((UniverseDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final UniverseDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_editUniverseBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_deleteUniverseBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(UniverseDisplay_AnchorElement_listUniversesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final UniverseDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span UniverseDisplay_Span_lastModifiedDt(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::lastModifiedDt;
  }-*/;

  native static void UniverseDisplay_Span_lastModifiedDt(UniverseDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::lastModifiedDt = value;
  }-*/;

  native static DataBinder UniversePresenter_DataBinder_binder(UniversePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder;
  }-*/;

  native static void UniversePresenter_DataBinder_binder(UniversePresenter instance, DataBinder<Universe> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder = value;
  }-*/;

  native static Event UniverseDisplay_Event_renderEditViewEvent(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::renderEditViewEvent;
  }-*/;

  native static void UniverseDisplay_Event_renderEditViewEvent(UniverseDisplay instance, Event<UniverseDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell UniverseDisplay_TableCell_entityCode(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::entityCode;
  }-*/;

  native static void UniverseDisplay_TableCell_entityCode(UniverseDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::entityCode = value;
  }-*/;

  native static TransitionTo UniverseDisplay_TransitionTo_listUniversesPage(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::listUniversesPage;
  }-*/;

  native static void UniverseDisplay_TransitionTo_listUniversesPage(UniverseDisplay instance, TransitionTo<ListUniversePage> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::listUniversesPage = value;
  }-*/;

  native static Event UniverseDisplay_Event_deleteEntityEvent(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::deleteEntityEvent;
  }-*/;

  native static void UniverseDisplay_Event_deleteEntityEvent(UniverseDisplay instance, Event<UniverseDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell UniverseDisplay_TableCell_businessNo(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::businessNo;
  }-*/;

  native static void UniverseDisplay_TableCell_businessNo(UniverseDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::businessNo = value;
  }-*/;

  native static TableCell UniverseDisplay_TableCell_description(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::description;
  }-*/;

  native static void UniverseDisplay_TableCell_description(UniverseDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::description = value;
  }-*/;

  native static Heading UniverseDisplay_Heading_code(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::code;
  }-*/;

  native static void UniverseDisplay_Heading_code(UniverseDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::code = value;
  }-*/;

  native static Span UniverseDisplay_Span_createdDt(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::createdDt;
  }-*/;

  native static void UniverseDisplay_Span_createdDt(UniverseDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::createdDt = value;
  }-*/;

  native static TableCell UniverseDisplay_TableCell_name(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::name;
  }-*/;

  native static void UniverseDisplay_TableCell_name(UniverseDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::name = value;
  }-*/;

  native static AnchorElement UniverseDisplay_AnchorElement_editUniverseBtn(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::editUniverseBtn;
  }-*/;

  native static void UniverseDisplay_AnchorElement_editUniverseBtn(UniverseDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::editUniverseBtn = value;
  }-*/;

  native static Div UniverseDisplay_Div_entityDisplayComponent(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::entityDisplayComponent;
  }-*/;

  native static void UniverseDisplay_Div_entityDisplayComponent(UniverseDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell UniverseDisplay_TableCell_universeTyCd(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::universeTyCd;
  }-*/;

  native static void UniverseDisplay_TableCell_universeTyCd(UniverseDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::universeTyCd = value;
  }-*/;

  native static AnchorElement UniverseDisplay_AnchorElement_deleteUniverseBtn(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::deleteUniverseBtn;
  }-*/;

  native static void UniverseDisplay_AnchorElement_deleteUniverseBtn(UniverseDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::deleteUniverseBtn = value;
  }-*/;

  native static TableCell UniverseDisplay_TableCell_effectiveDt(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::effectiveDt;
  }-*/;

  native static void UniverseDisplay_TableCell_effectiveDt(UniverseDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::effectiveDt = value;
  }-*/;

  native static TableCell UniverseDisplay_TableCell_parentUniverse(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::parentUniverse;
  }-*/;

  native static void UniverseDisplay_TableCell_parentUniverse(UniverseDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::parentUniverse = value;
  }-*/;

  native static AnchorElement UniverseDisplay_AnchorElement_listUniversesPageLink(UniverseDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::listUniversesPageLink;
  }-*/;

  native static void UniverseDisplay_AnchorElement_listUniversesPageLink(UniverseDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseDisplay::listUniversesPageLink = value;
  }-*/;
}
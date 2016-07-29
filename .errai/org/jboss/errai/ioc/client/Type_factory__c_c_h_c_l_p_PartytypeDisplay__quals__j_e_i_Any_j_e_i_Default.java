package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partytype.ListPartytypePage;
import com.cloderia.helion.client.local.partytype.PartytypeDisplay;
import com.cloderia.helion.client.local.partytype.PartytypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Partytype;
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

public class Type_factory__c_c_h_c_l_p_PartytypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartytypeDisplay.class, "Type_factory__c_c_h_c_l_p_PartytypeDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartytypeDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partytype/view-partytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartytypeDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartytypeDisplay.class);
    handle.addAssignableType(PartytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartytypeDisplay createInstance(final ContextManager contextManager) {
    final PartytypeDisplay instance = new PartytypeDisplay();
    setIncompleteInstance(instance);
    final TableCell PartytypeDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_effectiveDt);
    PartytypeDisplay_TableCell_effectiveDt(instance, PartytypeDisplay_effectiveDt);
    final Span PartytypeDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_lastModifiedDt);
    PartytypeDisplay_Span_lastModifiedDt(instance, PartytypeDisplay_lastModifiedDt);
    final Event PartytypeDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartytypeDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartytypeDisplay_renderEditViewEvent);
    PartytypeDisplay_Event_renderEditViewEvent(instance, PartytypeDisplay_renderEditViewEvent);
    final TransitionTo PartytypeDisplay_listPartytypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartytypeDisplay_listPartytypesPage);
    PartytypeDisplay_TransitionTo_listPartytypesPage(instance, PartytypeDisplay_listPartytypesPage);
    final Div PartytypeDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_entityDisplayComponent);
    PartytypeDisplay_Div_entityDisplayComponent(instance, PartytypeDisplay_entityDisplayComponent);
    final DataBinder PartytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartytypePresenter_binder);
    PartytypePresenter_DataBinder_binder(instance, PartytypePresenter_binder);
    final TableCell PartytypeDisplay_parentType = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_parentType);
    PartytypeDisplay_TableCell_parentType(instance, PartytypeDisplay_parentType);
    final TableCell PartytypeDisplay_parentCategory = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_parentCategory);
    PartytypeDisplay_TableCell_parentCategory(instance, PartytypeDisplay_parentCategory);
    final TableCell PartytypeDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_entityCode);
    PartytypeDisplay_TableCell_entityCode(instance, PartytypeDisplay_entityCode);
    final TableCell PartytypeDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_name);
    PartytypeDisplay_TableCell_name(instance, PartytypeDisplay_name);
    final Heading PartytypeDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, PartytypeDisplay_code);
    PartytypeDisplay_Heading_code(instance, PartytypeDisplay_code);
    final TableCell PartytypeDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_universe);
    PartytypeDisplay_TableCell_universe(instance, PartytypeDisplay_universe);
    final TableCell PartytypeDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_description);
    PartytypeDisplay_TableCell_description(instance, PartytypeDisplay_description);
    final Span PartytypeDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeDisplay_createdDt);
    PartytypeDisplay_Span_createdDt(instance, PartytypeDisplay_createdDt);
    final Event PartytypeDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartytypeDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartytypeDisplay_deleteEntityEvent);
    PartytypeDisplay_Event_deleteEntityEvent(instance, PartytypeDisplay_deleteEntityEvent);
    c_c_h_c_l_p_PartytypeDisplayTemplateResource templateForPartytypeDisplay = GWT.create(c_c_h_c_l_p_PartytypeDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartytypeDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartytypeDisplay.getContents().getText(), "com/cloderia/helion/client/local/partytype/view-partytype-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partytype/view-partytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_parentType(instance)));
      }
    }, dataFieldElements, "parentType");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_parentCategory(instance)));
      }
    }, dataFieldElements, "parentCategory");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_editPartytypeBtn(instance));
      }
    }, dataFieldElements, "editPartytypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_deletePartytypeBtn(instance));
      }
    }, dataFieldElements, "deletePartytypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com/cloderia/helion/client/local/partytype/view-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_listPartytypesPageLink(instance));
      }
    }, dataFieldElements, "listPartytypesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("parentType", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_parentType(instance))));
    templateFieldsMap.put("parentCategory", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_parentCategory(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editPartytypeBtn", ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_editPartytypeBtn(instance)));
    templateFieldsMap.put("deletePartytypeBtn", ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_deletePartytypeBtn(instance)));
    templateFieldsMap.put("listPartytypesPageLink", ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_listPartytypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editPartytypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditPartytypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deletePartytypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeletePartytypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartytypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartytypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partytype.PartytypeDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_TableCell_parentType(instance))), "parentType.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_TableCell_parentCategory(instance))), "parentCategory.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartytypeDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartytypeDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_editPartytypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_deletePartytypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartytypeDisplay_AnchorElement_listPartytypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartytypeDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event PartytypeDisplay_Event_renderEditViewEvent(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::renderEditViewEvent;
  }-*/;

  native static void PartytypeDisplay_Event_renderEditViewEvent(PartytypeDisplay instance, Event<PartytypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::renderEditViewEvent = value;
  }-*/;

  native static Heading PartytypeDisplay_Heading_code(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::code;
  }-*/;

  native static void PartytypeDisplay_Heading_code(PartytypeDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::code = value;
  }-*/;

  native static TableCell PartytypeDisplay_TableCell_entityCode(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::entityCode;
  }-*/;

  native static void PartytypeDisplay_TableCell_entityCode(PartytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::entityCode = value;
  }-*/;

  native static DataBinder PartytypePresenter_DataBinder_binder(PartytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder;
  }-*/;

  native static void PartytypePresenter_DataBinder_binder(PartytypePresenter instance, DataBinder<Partytype> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder = value;
  }-*/;

  native static AnchorElement PartytypeDisplay_AnchorElement_editPartytypeBtn(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::editPartytypeBtn;
  }-*/;

  native static void PartytypeDisplay_AnchorElement_editPartytypeBtn(PartytypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::editPartytypeBtn = value;
  }-*/;

  native static TableCell PartytypeDisplay_TableCell_description(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::description;
  }-*/;

  native static void PartytypeDisplay_TableCell_description(PartytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::description = value;
  }-*/;

  native static TransitionTo PartytypeDisplay_TransitionTo_listPartytypesPage(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::listPartytypesPage;
  }-*/;

  native static void PartytypeDisplay_TransitionTo_listPartytypesPage(PartytypeDisplay instance, TransitionTo<ListPartytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::listPartytypesPage = value;
  }-*/;

  native static TableCell PartytypeDisplay_TableCell_parentCategory(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::parentCategory;
  }-*/;

  native static void PartytypeDisplay_TableCell_parentCategory(PartytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::parentCategory = value;
  }-*/;

  native static TableCell PartytypeDisplay_TableCell_effectiveDt(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::effectiveDt;
  }-*/;

  native static void PartytypeDisplay_TableCell_effectiveDt(PartytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::effectiveDt = value;
  }-*/;

  native static Span PartytypeDisplay_Span_createdDt(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::createdDt;
  }-*/;

  native static void PartytypeDisplay_Span_createdDt(PartytypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::createdDt = value;
  }-*/;

  native static Span PartytypeDisplay_Span_lastModifiedDt(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::lastModifiedDt;
  }-*/;

  native static void PartytypeDisplay_Span_lastModifiedDt(PartytypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::lastModifiedDt = value;
  }-*/;

  native static AnchorElement PartytypeDisplay_AnchorElement_deletePartytypeBtn(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::deletePartytypeBtn;
  }-*/;

  native static void PartytypeDisplay_AnchorElement_deletePartytypeBtn(PartytypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::deletePartytypeBtn = value;
  }-*/;

  native static Event PartytypeDisplay_Event_deleteEntityEvent(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::deleteEntityEvent;
  }-*/;

  native static void PartytypeDisplay_Event_deleteEntityEvent(PartytypeDisplay instance, Event<PartytypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::deleteEntityEvent = value;
  }-*/;

  native static Div PartytypeDisplay_Div_entityDisplayComponent(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::entityDisplayComponent;
  }-*/;

  native static void PartytypeDisplay_Div_entityDisplayComponent(PartytypeDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell PartytypeDisplay_TableCell_name(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::name;
  }-*/;

  native static void PartytypeDisplay_TableCell_name(PartytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::name = value;
  }-*/;

  native static TableCell PartytypeDisplay_TableCell_parentType(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::parentType;
  }-*/;

  native static void PartytypeDisplay_TableCell_parentType(PartytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::parentType = value;
  }-*/;

  native static TableCell PartytypeDisplay_TableCell_universe(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::universe;
  }-*/;

  native static void PartytypeDisplay_TableCell_universe(PartytypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::universe = value;
  }-*/;

  native static AnchorElement PartytypeDisplay_AnchorElement_listPartytypesPageLink(PartytypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::listPartytypesPageLink;
  }-*/;

  native static void PartytypeDisplay_AnchorElement_listPartytypesPageLink(PartytypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeDisplay::listPartytypesPageLink = value;
  }-*/;
}
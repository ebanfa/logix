package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay;
import com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Partyroletype;
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

public class Type_factory__c_c_h_c_l_p_PartyroletypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroletypeDisplay.class, "Type_factory__c_c_h_c_l_p_PartyroletypeDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroletypeDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroletypeDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroletypeDisplay.class);
    handle.addAssignableType(PartyroletypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyroletypeDisplay createInstance(final ContextManager contextManager) {
    final PartyroletypeDisplay instance = new PartyroletypeDisplay();
    setIncompleteInstance(instance);
    final Event PartyroletypeDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroletypeDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroletypeDisplay_deleteEntityEvent);
    PartyroletypeDisplay_Event_deleteEntityEvent(instance, PartyroletypeDisplay_deleteEntityEvent);
    final TableCell PartyroletypeDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_effectiveDt);
    PartyroletypeDisplay_TableCell_effectiveDt(instance, PartyroletypeDisplay_effectiveDt);
    final TableCell PartyroletypeDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_entityCode);
    PartyroletypeDisplay_TableCell_entityCode(instance, PartyroletypeDisplay_entityCode);
    final TableCell PartyroletypeDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_name);
    PartyroletypeDisplay_TableCell_name(instance, PartyroletypeDisplay_name);
    final Heading PartyroletypeDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, PartyroletypeDisplay_code);
    PartyroletypeDisplay_Heading_code(instance, PartyroletypeDisplay_code);
    final DataBinder PartyroletypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyroletype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroletypePresenter_binder);
    PartyroletypePresenter_DataBinder_binder(instance, PartyroletypePresenter_binder);
    final Div PartyroletypeDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_entityDisplayComponent);
    PartyroletypeDisplay_Div_entityDisplayComponent(instance, PartyroletypeDisplay_entityDisplayComponent);
    final Event PartyroletypeDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroletypeDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartyroletypeDisplay_renderEditViewEvent);
    PartyroletypeDisplay_Event_renderEditViewEvent(instance, PartyroletypeDisplay_renderEditViewEvent);
    final Span PartyroletypeDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_createdDt);
    PartyroletypeDisplay_Span_createdDt(instance, PartyroletypeDisplay_createdDt);
    final TableCell PartyroletypeDisplay_parentRoleTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_parentRoleTy);
    PartyroletypeDisplay_TableCell_parentRoleTy(instance, PartyroletypeDisplay_parentRoleTy);
    final TransitionTo PartyroletypeDisplay_listPartyroletypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyroletypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroletypeDisplay_listPartyroletypesPage);
    PartyroletypeDisplay_TransitionTo_listPartyroletypesPage(instance, PartyroletypeDisplay_listPartyroletypesPage);
    final Span PartyroletypeDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_lastModifiedDt);
    PartyroletypeDisplay_Span_lastModifiedDt(instance, PartyroletypeDisplay_lastModifiedDt);
    final TableCell PartyroletypeDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_description);
    PartyroletypeDisplay_TableCell_description(instance, PartyroletypeDisplay_description);
    final TableCell PartyroletypeDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeDisplay_universe);
    PartyroletypeDisplay_TableCell_universe(instance, PartyroletypeDisplay_universe);
    c_c_h_c_l_p_PartyroletypeDisplayTemplateResource templateForPartyroletypeDisplay = GWT.create(c_c_h_c_l_p_PartyroletypeDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartyroletypeDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartyroletypeDisplay.getContents().getText(), "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_parentRoleTy(instance)));
      }
    }, dataFieldElements, "parentRoleTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_editPartyroletypeBtn(instance));
      }
    }, dataFieldElements, "editPartyroletypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_deletePartyroletypeBtn(instance));
      }
    }, dataFieldElements, "deletePartyroletypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com/cloderia/helion/client/local/partyroletype/view-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_listPartyroletypesPageLink(instance));
      }
    }, dataFieldElements, "listPartyroletypesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("parentRoleTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_parentRoleTy(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editPartyroletypeBtn", ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_editPartyroletypeBtn(instance)));
    templateFieldsMap.put("deletePartyroletypeBtn", ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_deletePartyroletypeBtn(instance)));
    templateFieldsMap.put("listPartyroletypesPageLink", ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_listPartyroletypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editPartyroletypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditPartyroletypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deletePartyroletypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeletePartyroletypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartyroletypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartyroletypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_TableCell_parentRoleTy(instance))), "parentRoleTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroletypeDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroletypeDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_editPartyroletypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_deletePartyroletypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroletypeDisplay_AnchorElement_listPartyroletypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroletypeDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell PartyroletypeDisplay_TableCell_parentRoleTy(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::parentRoleTy;
  }-*/;

  native static void PartyroletypeDisplay_TableCell_parentRoleTy(PartyroletypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::parentRoleTy = value;
  }-*/;

  native static Div PartyroletypeDisplay_Div_entityDisplayComponent(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::entityDisplayComponent;
  }-*/;

  native static void PartyroletypeDisplay_Div_entityDisplayComponent(PartyroletypeDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::entityDisplayComponent = value;
  }-*/;

  native static Event PartyroletypeDisplay_Event_renderEditViewEvent(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::renderEditViewEvent;
  }-*/;

  native static void PartyroletypeDisplay_Event_renderEditViewEvent(PartyroletypeDisplay instance, Event<PartyroletypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::renderEditViewEvent = value;
  }-*/;

  native static Event PartyroletypeDisplay_Event_deleteEntityEvent(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::deleteEntityEvent;
  }-*/;

  native static void PartyroletypeDisplay_Event_deleteEntityEvent(PartyroletypeDisplay instance, Event<PartyroletypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::deleteEntityEvent = value;
  }-*/;

  native static AnchorElement PartyroletypeDisplay_AnchorElement_deletePartyroletypeBtn(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::deletePartyroletypeBtn;
  }-*/;

  native static void PartyroletypeDisplay_AnchorElement_deletePartyroletypeBtn(PartyroletypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::deletePartyroletypeBtn = value;
  }-*/;

  native static TransitionTo PartyroletypeDisplay_TransitionTo_listPartyroletypesPage(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::listPartyroletypesPage;
  }-*/;

  native static void PartyroletypeDisplay_TransitionTo_listPartyroletypesPage(PartyroletypeDisplay instance, TransitionTo<ListPartyroletypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::listPartyroletypesPage = value;
  }-*/;

  native static TableCell PartyroletypeDisplay_TableCell_name(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::name;
  }-*/;

  native static void PartyroletypeDisplay_TableCell_name(PartyroletypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::name = value;
  }-*/;

  native static TableCell PartyroletypeDisplay_TableCell_universe(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::universe;
  }-*/;

  native static void PartyroletypeDisplay_TableCell_universe(PartyroletypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::universe = value;
  }-*/;

  native static TableCell PartyroletypeDisplay_TableCell_effectiveDt(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::effectiveDt;
  }-*/;

  native static void PartyroletypeDisplay_TableCell_effectiveDt(PartyroletypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::effectiveDt = value;
  }-*/;

  native static DataBinder PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder;
  }-*/;

  native static void PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance, DataBinder<Partyroletype> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder = value;
  }-*/;

  native static TableCell PartyroletypeDisplay_TableCell_description(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::description;
  }-*/;

  native static void PartyroletypeDisplay_TableCell_description(PartyroletypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::description = value;
  }-*/;

  native static Heading PartyroletypeDisplay_Heading_code(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::code;
  }-*/;

  native static void PartyroletypeDisplay_Heading_code(PartyroletypeDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::code = value;
  }-*/;

  native static Span PartyroletypeDisplay_Span_createdDt(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::createdDt;
  }-*/;

  native static void PartyroletypeDisplay_Span_createdDt(PartyroletypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::createdDt = value;
  }-*/;

  native static TableCell PartyroletypeDisplay_TableCell_entityCode(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::entityCode;
  }-*/;

  native static void PartyroletypeDisplay_TableCell_entityCode(PartyroletypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::entityCode = value;
  }-*/;

  native static AnchorElement PartyroletypeDisplay_AnchorElement_listPartyroletypesPageLink(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::listPartyroletypesPageLink;
  }-*/;

  native static void PartyroletypeDisplay_AnchorElement_listPartyroletypesPageLink(PartyroletypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::listPartyroletypesPageLink = value;
  }-*/;

  native static AnchorElement PartyroletypeDisplay_AnchorElement_editPartyroletypeBtn(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::editPartyroletypeBtn;
  }-*/;

  native static void PartyroletypeDisplay_AnchorElement_editPartyroletypeBtn(PartyroletypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::editPartyroletypeBtn = value;
  }-*/;

  native static Span PartyroletypeDisplay_Span_lastModifiedDt(PartyroletypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::lastModifiedDt;
  }-*/;

  native static void PartyroletypeDisplay_Span_lastModifiedDt(PartyroletypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay::lastModifiedDt = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.party.ListPartyPage;
import com.cloderia.helion.client.local.party.PartyDisplay;
import com.cloderia.helion.client.local.party.PartyPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Party;
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

public class Type_factory__c_c_h_c_l_p_PartyDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyDisplay.class, "Type_factory__c_c_h_c_l_p_PartyDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/party/view-party-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyDisplay.class);
    handle.addAssignableType(PartyPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyDisplay createInstance(final ContextManager contextManager) {
    final PartyDisplay instance = new PartyDisplay();
    setIncompleteInstance(instance);
    final Div PartyDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_entityDisplayComponent);
    PartyDisplay_Div_entityDisplayComponent(instance, PartyDisplay_entityDisplayComponent);
    final TableCell PartyDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_name);
    PartyDisplay_TableCell_name(instance, PartyDisplay_name);
    final Event PartyDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyDisplay_deleteEntityEvent);
    PartyDisplay_Event_deleteEntityEvent(instance, PartyDisplay_deleteEntityEvent);
    final TransitionTo PartyDisplay_listPartysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyDisplay_listPartysPage);
    PartyDisplay_TransitionTo_listPartysPage(instance, PartyDisplay_listPartysPage);
    final Span PartyDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_createdDt);
    PartyDisplay_Span_createdDt(instance, PartyDisplay_createdDt);
    final Event PartyDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartyDisplay_renderEditViewEvent);
    PartyDisplay_Event_renderEditViewEvent(instance, PartyDisplay_renderEditViewEvent);
    final TableCell PartyDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_effectiveDt);
    PartyDisplay_TableCell_effectiveDt(instance, PartyDisplay_effectiveDt);
    final TableCell PartyDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_universe);
    PartyDisplay_TableCell_universe(instance, PartyDisplay_universe);
    final TableCell PartyDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_entityCode);
    PartyDisplay_TableCell_entityCode(instance, PartyDisplay_entityCode);
    final TableCell PartyDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_description);
    PartyDisplay_TableCell_description(instance, PartyDisplay_description);
    final Span PartyDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_lastModifiedDt);
    PartyDisplay_Span_lastModifiedDt(instance, PartyDisplay_lastModifiedDt);
    final Heading PartyDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, PartyDisplay_code);
    PartyDisplay_Heading_code(instance, PartyDisplay_code);
    final DataBinder PartyPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Party.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyPresenter_binder);
    PartyPresenter_DataBinder_binder(instance, PartyPresenter_binder);
    final TableCell PartyDisplay_partyTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyDisplay_partyTy);
    PartyDisplay_TableCell_partyTy(instance, PartyDisplay_partyTy);
    c_c_h_c_l_p_PartyDisplayTemplateResource templateForPartyDisplay = GWT.create(c_c_h_c_l_p_PartyDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartyDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartyDisplay.getContents().getText(), "com/cloderia/helion/client/local/party/view-party-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/party/view-party-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_partyTy(instance)));
      }
    }, dataFieldElements, "partyTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_editPartyBtn(instance));
      }
    }, dataFieldElements, "editPartyBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_deletePartyBtn(instance));
      }
    }, dataFieldElements, "deletePartyBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyDisplay", "com/cloderia/helion/client/local/party/view-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_listPartysPageLink(instance));
      }
    }, dataFieldElements, "listPartysPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("partyTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_partyTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editPartyBtn", ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_editPartyBtn(instance)));
    templateFieldsMap.put("deletePartyBtn", ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_deletePartyBtn(instance)));
    templateFieldsMap.put("listPartysPageLink", ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_listPartysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editPartyBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditPartyBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deletePartyBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeletePartyBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartyPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.party.PartyDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_TableCell_partyTy(instance))), "partyTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_editPartyBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_deletePartyBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyDisplay_AnchorElement_listPartysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span PartyDisplay_Span_createdDt(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::createdDt;
  }-*/;

  native static void PartyDisplay_Span_createdDt(PartyDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::createdDt = value;
  }-*/;

  native static Heading PartyDisplay_Heading_code(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::code;
  }-*/;

  native static void PartyDisplay_Heading_code(PartyDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::code = value;
  }-*/;

  native static TableCell PartyDisplay_TableCell_entityCode(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::entityCode;
  }-*/;

  native static void PartyDisplay_TableCell_entityCode(PartyDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::entityCode = value;
  }-*/;

  native static Div PartyDisplay_Div_entityDisplayComponent(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::entityDisplayComponent;
  }-*/;

  native static void PartyDisplay_Div_entityDisplayComponent(PartyDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::entityDisplayComponent = value;
  }-*/;

  native static TransitionTo PartyDisplay_TransitionTo_listPartysPage(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::listPartysPage;
  }-*/;

  native static void PartyDisplay_TransitionTo_listPartysPage(PartyDisplay instance, TransitionTo<ListPartyPage> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::listPartysPage = value;
  }-*/;

  native static AnchorElement PartyDisplay_AnchorElement_deletePartyBtn(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::deletePartyBtn;
  }-*/;

  native static void PartyDisplay_AnchorElement_deletePartyBtn(PartyDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::deletePartyBtn = value;
  }-*/;

  native static AnchorElement PartyDisplay_AnchorElement_editPartyBtn(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::editPartyBtn;
  }-*/;

  native static void PartyDisplay_AnchorElement_editPartyBtn(PartyDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::editPartyBtn = value;
  }-*/;

  native static TableCell PartyDisplay_TableCell_description(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::description;
  }-*/;

  native static void PartyDisplay_TableCell_description(PartyDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::description = value;
  }-*/;

  native static Span PartyDisplay_Span_lastModifiedDt(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::lastModifiedDt;
  }-*/;

  native static void PartyDisplay_Span_lastModifiedDt(PartyDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::lastModifiedDt = value;
  }-*/;

  native static Event PartyDisplay_Event_renderEditViewEvent(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::renderEditViewEvent;
  }-*/;

  native static void PartyDisplay_Event_renderEditViewEvent(PartyDisplay instance, Event<PartyDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell PartyDisplay_TableCell_partyTy(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::partyTy;
  }-*/;

  native static void PartyDisplay_TableCell_partyTy(PartyDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::partyTy = value;
  }-*/;

  native static Event PartyDisplay_Event_deleteEntityEvent(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::deleteEntityEvent;
  }-*/;

  native static void PartyDisplay_Event_deleteEntityEvent(PartyDisplay instance, Event<PartyDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell PartyDisplay_TableCell_effectiveDt(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::effectiveDt;
  }-*/;

  native static void PartyDisplay_TableCell_effectiveDt(PartyDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::effectiveDt = value;
  }-*/;

  native static TableCell PartyDisplay_TableCell_name(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::name;
  }-*/;

  native static void PartyDisplay_TableCell_name(PartyDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::name = value;
  }-*/;

  native static AnchorElement PartyDisplay_AnchorElement_listPartysPageLink(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::listPartysPageLink;
  }-*/;

  native static void PartyDisplay_AnchorElement_listPartysPageLink(PartyDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::listPartysPageLink = value;
  }-*/;

  native static DataBinder PartyPresenter_DataBinder_binder(PartyPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder;
  }-*/;

  native static void PartyPresenter_DataBinder_binder(PartyPresenter instance, DataBinder<Party> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder = value;
  }-*/;

  native static TableCell PartyDisplay_TableCell_universe(PartyDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyDisplay::universe;
  }-*/;

  native static void PartyDisplay_TableCell_universe(PartyDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyDisplay::universe = value;
  }-*/;
}
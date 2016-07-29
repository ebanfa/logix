package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyrole.ListPartyrolePage;
import com.cloderia.helion.client.local.partyrole.PartyroleDisplay;
import com.cloderia.helion.client.local.partyrole.PartyrolePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Partyrole;
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

public class Type_factory__c_c_h_c_l_p_PartyroleDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroleDisplay.class, "Type_factory__c_c_h_c_l_p_PartyroleDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroleDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyrole/view-partyrole-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroleDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroleDisplay.class);
    handle.addAssignableType(PartyrolePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyroleDisplay createInstance(final ContextManager contextManager) {
    final PartyroleDisplay instance = new PartyroleDisplay();
    setIncompleteInstance(instance);
    final TableCell PartyroleDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_toDt);
    PartyroleDisplay_TableCell_toDt(instance, PartyroleDisplay_toDt);
    final TableCell PartyroleDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_description);
    PartyroleDisplay_TableCell_description(instance, PartyroleDisplay_description);
    final TableCell PartyroleDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_entityCode);
    PartyroleDisplay_TableCell_entityCode(instance, PartyroleDisplay_entityCode);
    final TableCell PartyroleDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_name);
    PartyroleDisplay_TableCell_name(instance, PartyroleDisplay_name);
    final Event PartyroleDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroleDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroleDisplay_deleteEntityEvent);
    PartyroleDisplay_Event_deleteEntityEvent(instance, PartyroleDisplay_deleteEntityEvent);
    final Heading PartyroleDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, PartyroleDisplay_code);
    PartyroleDisplay_Heading_code(instance, PartyroleDisplay_code);
    final TableCell PartyroleDisplay_partyRoleTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_partyRoleTy);
    PartyroleDisplay_TableCell_partyRoleTy(instance, PartyroleDisplay_partyRoleTy);
    final DataBinder PartyrolePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyrole.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyrolePresenter_binder);
    PartyrolePresenter_DataBinder_binder(instance, PartyrolePresenter_binder);
    final Span PartyroleDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_lastModifiedDt);
    PartyroleDisplay_Span_lastModifiedDt(instance, PartyroleDisplay_lastModifiedDt);
    final TableCell PartyroleDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_fromDt);
    PartyroleDisplay_TableCell_fromDt(instance, PartyroleDisplay_fromDt);
    final Event PartyroleDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroleDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartyroleDisplay_renderEditViewEvent);
    PartyroleDisplay_Event_renderEditViewEvent(instance, PartyroleDisplay_renderEditViewEvent);
    final Span PartyroleDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_createdDt);
    PartyroleDisplay_Span_createdDt(instance, PartyroleDisplay_createdDt);
    final TableCell PartyroleDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_party);
    PartyroleDisplay_TableCell_party(instance, PartyroleDisplay_party);
    final Div PartyroleDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_entityDisplayComponent);
    PartyroleDisplay_Div_entityDisplayComponent(instance, PartyroleDisplay_entityDisplayComponent);
    final TableCell PartyroleDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleDisplay_universe);
    PartyroleDisplay_TableCell_universe(instance, PartyroleDisplay_universe);
    final TransitionTo PartyroleDisplay_listPartyrolesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartyrolePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroleDisplay_listPartyrolesPage);
    PartyroleDisplay_TransitionTo_listPartyrolesPage(instance, PartyroleDisplay_listPartyrolesPage);
    c_c_h_c_l_p_PartyroleDisplayTemplateResource templateForPartyroleDisplay = GWT.create(c_c_h_c_l_p_PartyroleDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartyroleDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartyroleDisplay.getContents().getText(), "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_partyRoleTy(instance)));
      }
    }, dataFieldElements, "partyRoleTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_editPartyroleBtn(instance));
      }
    }, dataFieldElements, "editPartyroleBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_deletePartyroleBtn(instance));
      }
    }, dataFieldElements, "deletePartyroleBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com/cloderia/helion/client/local/partyrole/view-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_listPartyrolesPageLink(instance));
      }
    }, dataFieldElements, "listPartyrolesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_party(instance))));
    templateFieldsMap.put("partyRoleTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_partyRoleTy(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_description(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editPartyroleBtn", ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_editPartyroleBtn(instance)));
    templateFieldsMap.put("deletePartyroleBtn", ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_deletePartyroleBtn(instance)));
    templateFieldsMap.put("listPartyrolesPageLink", ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_listPartyrolesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editPartyroleBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditPartyroleBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deletePartyroleBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeletePartyroleBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartyrolesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartyrolePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyrole.PartyroleDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_partyRoleTy(instance))), "partyRoleTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroleDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroleDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_editPartyroleBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_deletePartyroleBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroleDisplay_AnchorElement_listPartyrolesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroleDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder;
  }-*/;

  native static void PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance, DataBinder<Partyrole> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_party(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::party;
  }-*/;

  native static void PartyroleDisplay_TableCell_party(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::party = value;
  }-*/;

  native static AnchorElement PartyroleDisplay_AnchorElement_deletePartyroleBtn(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::deletePartyroleBtn;
  }-*/;

  native static void PartyroleDisplay_AnchorElement_deletePartyroleBtn(PartyroleDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::deletePartyroleBtn = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_description(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::description;
  }-*/;

  native static void PartyroleDisplay_TableCell_description(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::description = value;
  }-*/;

  native static Span PartyroleDisplay_Span_createdDt(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::createdDt;
  }-*/;

  native static void PartyroleDisplay_Span_createdDt(PartyroleDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::createdDt = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_entityCode(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::entityCode;
  }-*/;

  native static void PartyroleDisplay_TableCell_entityCode(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::entityCode = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_universe(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::universe;
  }-*/;

  native static void PartyroleDisplay_TableCell_universe(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::universe = value;
  }-*/;

  native static AnchorElement PartyroleDisplay_AnchorElement_editPartyroleBtn(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::editPartyroleBtn;
  }-*/;

  native static void PartyroleDisplay_AnchorElement_editPartyroleBtn(PartyroleDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::editPartyroleBtn = value;
  }-*/;

  native static Event PartyroleDisplay_Event_renderEditViewEvent(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::renderEditViewEvent;
  }-*/;

  native static void PartyroleDisplay_Event_renderEditViewEvent(PartyroleDisplay instance, Event<PartyroleDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::renderEditViewEvent = value;
  }-*/;

  native static TransitionTo PartyroleDisplay_TransitionTo_listPartyrolesPage(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::listPartyrolesPage;
  }-*/;

  native static void PartyroleDisplay_TransitionTo_listPartyrolesPage(PartyroleDisplay instance, TransitionTo<ListPartyrolePage> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::listPartyrolesPage = value;
  }-*/;

  native static Span PartyroleDisplay_Span_lastModifiedDt(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::lastModifiedDt;
  }-*/;

  native static void PartyroleDisplay_Span_lastModifiedDt(PartyroleDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::lastModifiedDt = value;
  }-*/;

  native static AnchorElement PartyroleDisplay_AnchorElement_listPartyrolesPageLink(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::listPartyrolesPageLink;
  }-*/;

  native static void PartyroleDisplay_AnchorElement_listPartyrolesPageLink(PartyroleDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::listPartyrolesPageLink = value;
  }-*/;

  native static Div PartyroleDisplay_Div_entityDisplayComponent(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::entityDisplayComponent;
  }-*/;

  native static void PartyroleDisplay_Div_entityDisplayComponent(PartyroleDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_name(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::name;
  }-*/;

  native static void PartyroleDisplay_TableCell_name(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::name = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_toDt(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::toDt;
  }-*/;

  native static void PartyroleDisplay_TableCell_toDt(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::toDt = value;
  }-*/;

  native static Heading PartyroleDisplay_Heading_code(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::code;
  }-*/;

  native static void PartyroleDisplay_Heading_code(PartyroleDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::code = value;
  }-*/;

  native static Event PartyroleDisplay_Event_deleteEntityEvent(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::deleteEntityEvent;
  }-*/;

  native static void PartyroleDisplay_Event_deleteEntityEvent(PartyroleDisplay instance, Event<PartyroleDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_partyRoleTy(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::partyRoleTy;
  }-*/;

  native static void PartyroleDisplay_TableCell_partyRoleTy(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::partyRoleTy = value;
  }-*/;

  native static TableCell PartyroleDisplay_TableCell_fromDt(PartyroleDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::fromDt;
  }-*/;

  native static void PartyroleDisplay_TableCell_fromDt(PartyroleDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleDisplay::fromDt = value;
  }-*/;
}
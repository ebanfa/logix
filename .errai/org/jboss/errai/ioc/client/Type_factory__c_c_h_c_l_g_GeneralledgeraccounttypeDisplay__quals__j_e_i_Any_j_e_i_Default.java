package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter;
import com.cloderia.helion.client.local.generalledgeraccounttype.ListGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccounttypeDisplay.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_GeneralledgeraccounttypeDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccounttypeDisplay.class);
    handle.addAssignableType(GeneralledgeraccounttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccounttypeDisplay createInstance(final ContextManager contextManager) {
    final GeneralledgeraccounttypeDisplay instance = new GeneralledgeraccounttypeDisplay();
    setIncompleteInstance(instance);
    final Event GeneralledgeraccounttypeDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccounttypeDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_renderEditViewEvent);
    GeneralledgeraccounttypeDisplay_Event_renderEditViewEvent(instance, GeneralledgeraccounttypeDisplay_renderEditViewEvent);
    final TableCell GeneralledgeraccounttypeDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_effectiveDt);
    GeneralledgeraccounttypeDisplay_TableCell_effectiveDt(instance, GeneralledgeraccounttypeDisplay_effectiveDt);
    final DataBinder GeneralledgeraccounttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccounttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccounttypePresenter_binder);
    GeneralledgeraccounttypePresenter_DataBinder_binder(instance, GeneralledgeraccounttypePresenter_binder);
    final Div GeneralledgeraccounttypeDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_entityDisplayComponent);
    GeneralledgeraccounttypeDisplay_Div_entityDisplayComponent(instance, GeneralledgeraccounttypeDisplay_entityDisplayComponent);
    final Span GeneralledgeraccounttypeDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_createdDt);
    GeneralledgeraccounttypeDisplay_Span_createdDt(instance, GeneralledgeraccounttypeDisplay_createdDt);
    final TableCell GeneralledgeraccounttypeDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_description);
    GeneralledgeraccounttypeDisplay_TableCell_description(instance, GeneralledgeraccounttypeDisplay_description);
    final TableCell GeneralledgeraccounttypeDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_entityCode);
    GeneralledgeraccounttypeDisplay_TableCell_entityCode(instance, GeneralledgeraccounttypeDisplay_entityCode);
    final TableCell GeneralledgeraccounttypeDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_name);
    GeneralledgeraccounttypeDisplay_TableCell_name(instance, GeneralledgeraccounttypeDisplay_name);
    final TransitionTo GeneralledgeraccounttypeDisplay_listGeneralledgeraccounttypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListGeneralledgeraccounttypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_listGeneralledgeraccounttypesPage);
    GeneralledgeraccounttypeDisplay_TransitionTo_listGeneralledgeraccounttypesPage(instance, GeneralledgeraccounttypeDisplay_listGeneralledgeraccounttypesPage);
    final TableCell GeneralledgeraccounttypeDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_universe);
    GeneralledgeraccounttypeDisplay_TableCell_universe(instance, GeneralledgeraccounttypeDisplay_universe);
    final Event GeneralledgeraccounttypeDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccounttypeDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_deleteEntityEvent);
    GeneralledgeraccounttypeDisplay_Event_deleteEntityEvent(instance, GeneralledgeraccounttypeDisplay_deleteEntityEvent);
    final Heading GeneralledgeraccounttypeDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_code);
    GeneralledgeraccounttypeDisplay_Heading_code(instance, GeneralledgeraccounttypeDisplay_code);
    final Span GeneralledgeraccounttypeDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeDisplay_lastModifiedDt);
    GeneralledgeraccounttypeDisplay_Span_lastModifiedDt(instance, GeneralledgeraccounttypeDisplay_lastModifiedDt);
    c_c_h_c_l_g_GeneralledgeraccounttypeDisplayTemplateResource templateForGeneralledgeraccounttypeDisplay = GWT.create(c_c_h_c_l_g_GeneralledgeraccounttypeDisplayTemplateResource.class);
    Element parentElementForTemplateOfGeneralledgeraccounttypeDisplay = TemplateUtil.getRootTemplateParentElement(templateForGeneralledgeraccounttypeDisplay.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_editGeneralledgeraccounttypeBtn(instance));
      }
    }, dataFieldElements, "editGeneralledgeraccounttypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_deleteGeneralledgeraccounttypeBtn(instance));
      }
    }, dataFieldElements, "deleteGeneralledgeraccounttypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/view-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_listGeneralledgeraccounttypesPageLink(instance));
      }
    }, dataFieldElements, "listGeneralledgeraccounttypesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editGeneralledgeraccounttypeBtn", ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_editGeneralledgeraccounttypeBtn(instance)));
    templateFieldsMap.put("deleteGeneralledgeraccounttypeBtn", ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_deleteGeneralledgeraccounttypeBtn(instance)));
    templateFieldsMap.put("listGeneralledgeraccounttypesPageLink", ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_listGeneralledgeraccounttypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editGeneralledgeraccounttypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditGeneralledgeraccounttypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteGeneralledgeraccounttypeBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteGeneralledgeraccounttypeBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listGeneralledgeraccounttypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = GeneralledgeraccounttypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccounttypeDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccounttypeDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_editGeneralledgeraccounttypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_deleteGeneralledgeraccounttypeBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccounttypeDisplay_AnchorElement_listGeneralledgeraccounttypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final GeneralledgeraccounttypeDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement GeneralledgeraccounttypeDisplay_AnchorElement_editGeneralledgeraccounttypeBtn(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::editGeneralledgeraccounttypeBtn;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_AnchorElement_editGeneralledgeraccounttypeBtn(GeneralledgeraccounttypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::editGeneralledgeraccounttypeBtn = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeDisplay_TableCell_entityCode(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::entityCode;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_TableCell_entityCode(GeneralledgeraccounttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::entityCode = value;
  }-*/;

  native static Event GeneralledgeraccounttypeDisplay_Event_renderEditViewEvent(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::renderEditViewEvent;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_Event_renderEditViewEvent(GeneralledgeraccounttypeDisplay instance, Event<GeneralledgeraccounttypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement GeneralledgeraccounttypeDisplay_AnchorElement_deleteGeneralledgeraccounttypeBtn(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::deleteGeneralledgeraccounttypeBtn;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_AnchorElement_deleteGeneralledgeraccounttypeBtn(GeneralledgeraccounttypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::deleteGeneralledgeraccounttypeBtn = value;
  }-*/;

  native static AnchorElement GeneralledgeraccounttypeDisplay_AnchorElement_listGeneralledgeraccounttypesPageLink(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::listGeneralledgeraccounttypesPageLink;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_AnchorElement_listGeneralledgeraccounttypesPageLink(GeneralledgeraccounttypeDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::listGeneralledgeraccounttypesPageLink = value;
  }-*/;

  native static DataBinder GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder;
  }-*/;

  native static void GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance, DataBinder<Generalledgeraccounttype> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeDisplay_TableCell_name(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::name;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_TableCell_name(GeneralledgeraccounttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::name = value;
  }-*/;

  native static Span GeneralledgeraccounttypeDisplay_Span_lastModifiedDt(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::lastModifiedDt;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_Span_lastModifiedDt(GeneralledgeraccounttypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeDisplay_TableCell_effectiveDt(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::effectiveDt;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_TableCell_effectiveDt(GeneralledgeraccounttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::effectiveDt = value;
  }-*/;

  native static TransitionTo GeneralledgeraccounttypeDisplay_TransitionTo_listGeneralledgeraccounttypesPage(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::listGeneralledgeraccounttypesPage;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_TransitionTo_listGeneralledgeraccounttypesPage(GeneralledgeraccounttypeDisplay instance, TransitionTo<ListGeneralledgeraccounttypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::listGeneralledgeraccounttypesPage = value;
  }-*/;

  native static Span GeneralledgeraccounttypeDisplay_Span_createdDt(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::createdDt;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_Span_createdDt(GeneralledgeraccounttypeDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::createdDt = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeDisplay_TableCell_description(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::description;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_TableCell_description(GeneralledgeraccounttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::description = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeDisplay_TableCell_universe(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::universe;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_TableCell_universe(GeneralledgeraccounttypeDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::universe = value;
  }-*/;

  native static Event GeneralledgeraccounttypeDisplay_Event_deleteEntityEvent(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::deleteEntityEvent;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_Event_deleteEntityEvent(GeneralledgeraccounttypeDisplay instance, Event<GeneralledgeraccounttypeDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::deleteEntityEvent = value;
  }-*/;

  native static Div GeneralledgeraccounttypeDisplay_Div_entityDisplayComponent(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::entityDisplayComponent;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_Div_entityDisplayComponent(GeneralledgeraccounttypeDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::entityDisplayComponent = value;
  }-*/;

  native static Heading GeneralledgeraccounttypeDisplay_Heading_code(GeneralledgeraccounttypeDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::code;
  }-*/;

  native static void GeneralledgeraccounttypeDisplay_Heading_code(GeneralledgeraccounttypeDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay::code = value;
  }-*/;
}
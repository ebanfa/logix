package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organization.ListOrganizationPage;
import com.cloderia.helion.client.local.organization.OrganizationDisplay;
import com.cloderia.helion.client.local.organization.OrganizationPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Organization;
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

public class Type_factory__c_c_h_c_l_o_OrganizationDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationDisplay.class, "Type_factory__c_c_h_c_l_o_OrganizationDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organization/view-organization-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationDisplay.class);
    handle.addAssignableType(OrganizationPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationDisplay createInstance(final ContextManager contextManager) {
    final OrganizationDisplay instance = new OrganizationDisplay();
    setIncompleteInstance(instance);
    final Span OrganizationDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_lastModifiedDt);
    OrganizationDisplay_Span_lastModifiedDt(instance, OrganizationDisplay_lastModifiedDt);
    final TableCell OrganizationDisplay_tax = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_tax);
    OrganizationDisplay_TableCell_tax(instance, OrganizationDisplay_tax);
    final Heading OrganizationDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, OrganizationDisplay_code);
    OrganizationDisplay_Heading_code(instance, OrganizationDisplay_code);
    final Span OrganizationDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_createdDt);
    OrganizationDisplay_Span_createdDt(instance, OrganizationDisplay_createdDt);
    final Div OrganizationDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_entityDisplayComponent);
    OrganizationDisplay_Div_entityDisplayComponent(instance, OrganizationDisplay_entityDisplayComponent);
    final TableCell OrganizationDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_party);
    OrganizationDisplay_TableCell_party(instance, OrganizationDisplay_party);
    final TableCell OrganizationDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_name);
    OrganizationDisplay_TableCell_name(instance, OrganizationDisplay_name);
    final TableCell OrganizationDisplay_businessNo = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_businessNo);
    OrganizationDisplay_TableCell_businessNo(instance, OrganizationDisplay_businessNo);
    final DataBinder OrganizationPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organization.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationPresenter_binder);
    OrganizationPresenter_DataBinder_binder(instance, OrganizationPresenter_binder);
    final TableCell OrganizationDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_description);
    OrganizationDisplay_TableCell_description(instance, OrganizationDisplay_description);
    final TableCell OrganizationDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_effectiveDt);
    OrganizationDisplay_TableCell_effectiveDt(instance, OrganizationDisplay_effectiveDt);
    final Event OrganizationDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationDisplay_renderEditViewEvent);
    OrganizationDisplay_Event_renderEditViewEvent(instance, OrganizationDisplay_renderEditViewEvent);
    final TableCell OrganizationDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_universe);
    OrganizationDisplay_TableCell_universe(instance, OrganizationDisplay_universe);
    final TransitionTo OrganizationDisplay_listOrganizationsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationDisplay_listOrganizationsPage);
    OrganizationDisplay_TransitionTo_listOrganizationsPage(instance, OrganizationDisplay_listOrganizationsPage);
    final Event OrganizationDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationDisplay_deleteEntityEvent);
    OrganizationDisplay_Event_deleteEntityEvent(instance, OrganizationDisplay_deleteEntityEvent);
    final TableCell OrganizationDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationDisplay_entityCode);
    OrganizationDisplay_TableCell_entityCode(instance, OrganizationDisplay_entityCode);
    c_c_h_c_l_o_OrganizationDisplayTemplateResource templateForOrganizationDisplay = GWT.create(c_c_h_c_l_o_OrganizationDisplayTemplateResource.class);
    Element parentElementForTemplateOfOrganizationDisplay = TemplateUtil.getRootTemplateParentElement(templateForOrganizationDisplay.getContents().getText(), "com/cloderia/helion/client/local/organization/view-organization-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organization/view-organization-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_businessNo(instance)));
      }
    }, dataFieldElements, "businessNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_tax(instance)));
      }
    }, dataFieldElements, "tax");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_editOrganizationBtn(instance));
      }
    }, dataFieldElements, "editOrganizationBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_deleteOrganizationBtn(instance));
      }
    }, dataFieldElements, "deleteOrganizationBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com/cloderia/helion/client/local/organization/view-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_listOrganizationsPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_party(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_description(instance))));
    templateFieldsMap.put("businessNo", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_businessNo(instance))));
    templateFieldsMap.put("tax", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_tax(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editOrganizationBtn", ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_editOrganizationBtn(instance)));
    templateFieldsMap.put("deleteOrganizationBtn", ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_deleteOrganizationBtn(instance)));
    templateFieldsMap.put("listOrganizationsPageLink", ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_listOrganizationsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editOrganizationBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditOrganizationBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteOrganizationBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteOrganizationBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = OrganizationPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organization.OrganizationDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_businessNo(instance))), "businessNo", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_tax(instance))), "tax", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_editOrganizationBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_deleteOrganizationBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationDisplay_AnchorElement_listOrganizationsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell OrganizationDisplay_TableCell_tax(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::tax;
  }-*/;

  native static void OrganizationDisplay_TableCell_tax(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::tax = value;
  }-*/;

  native static Span OrganizationDisplay_Span_createdDt(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::createdDt;
  }-*/;

  native static void OrganizationDisplay_Span_createdDt(OrganizationDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::createdDt = value;
  }-*/;

  native static Div OrganizationDisplay_Div_entityDisplayComponent(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::entityDisplayComponent;
  }-*/;

  native static void OrganizationDisplay_Div_entityDisplayComponent(OrganizationDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell OrganizationDisplay_TableCell_description(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::description;
  }-*/;

  native static void OrganizationDisplay_TableCell_description(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::description = value;
  }-*/;

  native static Event OrganizationDisplay_Event_deleteEntityEvent(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::deleteEntityEvent;
  }-*/;

  native static void OrganizationDisplay_Event_deleteEntityEvent(OrganizationDisplay instance, Event<OrganizationDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::deleteEntityEvent = value;
  }-*/;

  native static DataBinder OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder;
  }-*/;

  native static void OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance, DataBinder<Organization> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder = value;
  }-*/;

  native static Span OrganizationDisplay_Span_lastModifiedDt(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::lastModifiedDt;
  }-*/;

  native static void OrganizationDisplay_Span_lastModifiedDt(OrganizationDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::lastModifiedDt = value;
  }-*/;

  native static AnchorElement OrganizationDisplay_AnchorElement_deleteOrganizationBtn(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::deleteOrganizationBtn;
  }-*/;

  native static void OrganizationDisplay_AnchorElement_deleteOrganizationBtn(OrganizationDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::deleteOrganizationBtn = value;
  }-*/;

  native static AnchorElement OrganizationDisplay_AnchorElement_listOrganizationsPageLink(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::listOrganizationsPageLink;
  }-*/;

  native static void OrganizationDisplay_AnchorElement_listOrganizationsPageLink(OrganizationDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::listOrganizationsPageLink = value;
  }-*/;

  native static TransitionTo OrganizationDisplay_TransitionTo_listOrganizationsPage(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::listOrganizationsPage;
  }-*/;

  native static void OrganizationDisplay_TransitionTo_listOrganizationsPage(OrganizationDisplay instance, TransitionTo<ListOrganizationPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::listOrganizationsPage = value;
  }-*/;

  native static TableCell OrganizationDisplay_TableCell_businessNo(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::businessNo;
  }-*/;

  native static void OrganizationDisplay_TableCell_businessNo(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::businessNo = value;
  }-*/;

  native static TableCell OrganizationDisplay_TableCell_effectiveDt(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::effectiveDt;
  }-*/;

  native static void OrganizationDisplay_TableCell_effectiveDt(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::effectiveDt = value;
  }-*/;

  native static Heading OrganizationDisplay_Heading_code(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::code;
  }-*/;

  native static void OrganizationDisplay_Heading_code(OrganizationDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::code = value;
  }-*/;

  native static Event OrganizationDisplay_Event_renderEditViewEvent(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::renderEditViewEvent;
  }-*/;

  native static void OrganizationDisplay_Event_renderEditViewEvent(OrganizationDisplay instance, Event<OrganizationDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement OrganizationDisplay_AnchorElement_editOrganizationBtn(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::editOrganizationBtn;
  }-*/;

  native static void OrganizationDisplay_AnchorElement_editOrganizationBtn(OrganizationDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::editOrganizationBtn = value;
  }-*/;

  native static TableCell OrganizationDisplay_TableCell_party(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::party;
  }-*/;

  native static void OrganizationDisplay_TableCell_party(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::party = value;
  }-*/;

  native static TableCell OrganizationDisplay_TableCell_name(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::name;
  }-*/;

  native static void OrganizationDisplay_TableCell_name(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::name = value;
  }-*/;

  native static TableCell OrganizationDisplay_TableCell_entityCode(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::entityCode;
  }-*/;

  native static void OrganizationDisplay_TableCell_entityCode(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::entityCode = value;
  }-*/;

  native static TableCell OrganizationDisplay_TableCell_universe(OrganizationDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::universe;
  }-*/;

  native static void OrganizationDisplay_TableCell_universe(OrganizationDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationDisplay::universe = value;
  }-*/;
}
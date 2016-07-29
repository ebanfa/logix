package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organization.OrganizationListItemDisplay;
import com.cloderia.helion.client.local.organization.OrganizationPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
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

public class Type_factory__c_c_h_c_l_o_OrganizationListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationListItemDisplay.class, "Type_factory__c_c_h_c_l_o_OrganizationListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organization/list-organization-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationListItemDisplay.class);
    handle.addAssignableType(OrganizationPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationListItemDisplay createInstance(final ContextManager contextManager) {
    final OrganizationListItemDisplay instance = new OrganizationListItemDisplay();
    setIncompleteInstance(instance);
    final Event OrganizationListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationListItemDisplay_renderEditViewEvent);
    OrganizationListItemDisplay_Event_renderEditViewEvent(instance, OrganizationListItemDisplay_renderEditViewEvent);
    final TableRow OrganizationListItemDisplay_organizationItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_organizationItem);
    OrganizationListItemDisplay_TableRow_organizationItem(instance, OrganizationListItemDisplay_organizationItem);
    final Event OrganizationListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationListItemDisplay_renderSingleViewEvent);
    OrganizationListItemDisplay_Event_renderSingleViewEvent(instance, OrganizationListItemDisplay_renderSingleViewEvent);
    final TableCell OrganizationListItemDisplay_businessNo = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_businessNo);
    OrganizationListItemDisplay_TableCell_businessNo(instance, OrganizationListItemDisplay_businessNo);
    final DataBinder OrganizationPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organization.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationPresenter_binder);
    OrganizationPresenter_DataBinder_binder(instance, OrganizationPresenter_binder);
    final TableCell OrganizationListItemDisplay_tax = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_tax);
    OrganizationListItemDisplay_TableCell_tax(instance, OrganizationListItemDisplay_tax);
    final Event OrganizationListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationListItemDisplay_deleteEntityEvent);
    OrganizationListItemDisplay_Event_deleteEntityEvent(instance, OrganizationListItemDisplay_deleteEntityEvent);
    final TableCell OrganizationListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_entityCode);
    OrganizationListItemDisplay_TableCell_entityCode(instance, OrganizationListItemDisplay_entityCode);
    final AnchorElement OrganizationListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_deleteEntityListItemBtn);
    OrganizationListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, OrganizationListItemDisplay_deleteEntityListItemBtn);
    final TableCell OrganizationListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_description);
    OrganizationListItemDisplay_TableCell_description(instance, OrganizationListItemDisplay_description);
    final AnchorElement OrganizationListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_editEntityListItemBtn);
    OrganizationListItemDisplay_AnchorElement_editEntityListItemBtn(instance, OrganizationListItemDisplay_editEntityListItemBtn);
    final TableCell OrganizationListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_effectiveDt);
    OrganizationListItemDisplay_TableCell_effectiveDt(instance, OrganizationListItemDisplay_effectiveDt);
    final TableCell OrganizationListItemDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_party);
    OrganizationListItemDisplay_TableCell_party(instance, OrganizationListItemDisplay_party);
    final TableCell OrganizationListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationListItemDisplay_name);
    OrganizationListItemDisplay_TableCell_name(instance, OrganizationListItemDisplay_name);
    c_c_h_c_l_o_OrganizationListItemDisplayTemplateResource templateForOrganizationListItemDisplay = GWT.create(c_c_h_c_l_o_OrganizationListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfOrganizationListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForOrganizationListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/organization/list-organization-page.html", "organizationItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organization/list-organization-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableRow_organizationItem(instance)));
      }
    }, dataFieldElements, "organizationItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_businessNo(instance)));
      }
    }, dataFieldElements, "businessNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_tax(instance)));
      }
    }, dataFieldElements, "tax");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com/cloderia/helion/client/local/organization/list-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("organizationItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableRow_organizationItem(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_party(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("businessNo", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_businessNo(instance))));
    templateFieldsMap.put("tax", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_tax(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(OrganizationListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(OrganizationListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = OrganizationPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organization.OrganizationListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationListItemDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationListItemDisplay_TableCell_businessNo(instance))), "businessNo", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationListItemDisplay_TableCell_tax(instance))), "tax", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell OrganizationListItemDisplay_TableCell_tax(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::tax;
  }-*/;

  native static void OrganizationListItemDisplay_TableCell_tax(OrganizationListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::tax = value;
  }-*/;

  native static TableCell OrganizationListItemDisplay_TableCell_effectiveDt(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::effectiveDt;
  }-*/;

  native static void OrganizationListItemDisplay_TableCell_effectiveDt(OrganizationListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::effectiveDt = value;
  }-*/;

  native static DataBinder OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder;
  }-*/;

  native static void OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance, DataBinder<Organization> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder = value;
  }-*/;

  native static Event OrganizationListItemDisplay_Event_renderSingleViewEvent(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void OrganizationListItemDisplay_Event_renderSingleViewEvent(OrganizationListItemDisplay instance, Event<OrganizationListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static AnchorElement OrganizationListItemDisplay_AnchorElement_deleteEntityListItemBtn(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void OrganizationListItemDisplay_AnchorElement_deleteEntityListItemBtn(OrganizationListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event OrganizationListItemDisplay_Event_renderEditViewEvent(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void OrganizationListItemDisplay_Event_renderEditViewEvent(OrganizationListItemDisplay instance, Event<OrganizationListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static Event OrganizationListItemDisplay_Event_deleteEntityEvent(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void OrganizationListItemDisplay_Event_deleteEntityEvent(OrganizationListItemDisplay instance, Event<OrganizationListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell OrganizationListItemDisplay_TableCell_party(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::party;
  }-*/;

  native static void OrganizationListItemDisplay_TableCell_party(OrganizationListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::party = value;
  }-*/;

  native static TableCell OrganizationListItemDisplay_TableCell_businessNo(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::businessNo;
  }-*/;

  native static void OrganizationListItemDisplay_TableCell_businessNo(OrganizationListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::businessNo = value;
  }-*/;

  native static TableRow OrganizationListItemDisplay_TableRow_organizationItem(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::organizationItem;
  }-*/;

  native static void OrganizationListItemDisplay_TableRow_organizationItem(OrganizationListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::organizationItem = value;
  }-*/;

  native static TableCell OrganizationListItemDisplay_TableCell_name(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::name;
  }-*/;

  native static void OrganizationListItemDisplay_TableCell_name(OrganizationListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::name = value;
  }-*/;

  native static TableCell OrganizationListItemDisplay_TableCell_entityCode(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::entityCode;
  }-*/;

  native static void OrganizationListItemDisplay_TableCell_entityCode(OrganizationListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell OrganizationListItemDisplay_TableCell_description(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::description;
  }-*/;

  native static void OrganizationListItemDisplay_TableCell_description(OrganizationListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::description = value;
  }-*/;

  native static AnchorElement OrganizationListItemDisplay_AnchorElement_editEntityListItemBtn(OrganizationListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void OrganizationListItemDisplay_AnchorElement_editEntityListItemBtn(OrganizationListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationListItemDisplay::editEntityListItemBtn = value;
  }-*/;
}
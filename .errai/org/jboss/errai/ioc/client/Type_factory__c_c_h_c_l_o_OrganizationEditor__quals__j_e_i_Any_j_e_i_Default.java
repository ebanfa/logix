package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organization.ListOrganizationPage;
import com.cloderia.helion.client.local.organization.OrganizationEditor;
import com.cloderia.helion.client.local.organization.OrganizationPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Organization;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.api.Convert;
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

public class Type_factory__c_c_h_c_l_o_OrganizationEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationEditor.class, "Type_factory__c_c_h_c_l_o_OrganizationEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organization/edit-organization-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationEditor.class);
    handle.addAssignableType(OrganizationPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationEditor createInstance(final ContextManager contextManager) {
    final OrganizationEditor instance = new OrganizationEditor();
    setIncompleteInstance(instance);
    final DataBinder OrganizationPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organization.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationPresenter_binder);
    OrganizationPresenter_DataBinder_binder(instance, OrganizationPresenter_binder);
    final TextBox OrganizationEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_entityCode);
    OrganizationEditor_TextBox_entityCode(instance, OrganizationEditor_entityCode);
    final TextBox OrganizationEditor_businessNo = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_businessNo);
    OrganizationEditor_TextBox_businessNo(instance, OrganizationEditor_businessNo);
    final ListBox OrganizationEditor_party = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_party);
    OrganizationEditor_ListBox_party(instance, OrganizationEditor_party);
    final Event OrganizationEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationEditor_editEntityEvent);
    OrganizationEditor_Event_editEntityEvent(instance, OrganizationEditor_editEntityEvent);
    final TextBox OrganizationEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_name);
    OrganizationEditor_TextBox_name(instance, OrganizationEditor_name);
    final Div OrganizationEditor_organizationEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationEditor_organizationEditor);
    OrganizationEditor_Div_organizationEditor(instance, OrganizationEditor_organizationEditor);
    final TextBox OrganizationEditor_tax = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_tax);
    OrganizationEditor_TextBox_tax(instance, OrganizationEditor_tax);
    final ListBox OrganizationEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_universe);
    OrganizationEditor_ListBox_universe(instance, OrganizationEditor_universe);
    final TransitionTo OrganizationEditor_listOrganizationsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationEditor_listOrganizationsPage);
    OrganizationEditor_TransitionTo_listOrganizationsPage(instance, OrganizationEditor_listOrganizationsPage);
    final TextBox OrganizationEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_description);
    OrganizationEditor_TextBox_description(instance, OrganizationEditor_description);
    final Event OrganizationEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationEditor_createEntityEvent);
    OrganizationEditor_Event_createEntityEvent(instance, OrganizationEditor_createEntityEvent);
    final TextBox OrganizationEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationEditor_effectiveDt);
    OrganizationEditor_TextBox_effectiveDt(instance, OrganizationEditor_effectiveDt);
    c_c_h_c_l_o_OrganizationEditorTemplateResource templateForOrganizationEditor = GWT.create(c_c_h_c_l_o_OrganizationEditorTemplateResource.class);
    Element parentElementForTemplateOfOrganizationEditor = TemplateUtil.getRootTemplateParentElement(templateForOrganizationEditor.getContents().getText(), "com/cloderia/helion/client/local/organization/edit-organization-page.html", "organizationEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organization/edit-organization-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationEditor_Div_organizationEditor(instance)));
      }
    }, dataFieldElements, "organizationEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_ListBox_party(instance).asWidget();
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_TextBox_businessNo(instance).asWidget();
      }
    }, dataFieldElements, "businessNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_TextBox_tax(instance).asWidget();
      }
    }, dataFieldElements, "tax");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationEditor_Button_editOrganizationBtn(instance).asWidget();
      }
    }, dataFieldElements, "editOrganizationBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organization.OrganizationEditor", "com/cloderia/helion/client/local/organization/edit-organization-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationEditor_AnchorElement_listOrganizationsPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationsPageLink");
    templateFieldsMap.put("organizationEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationEditor_Div_organizationEditor(instance))));
    templateFieldsMap.put("party", OrganizationEditor_ListBox_party(instance).asWidget());
    templateFieldsMap.put("universe", OrganizationEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", OrganizationEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", OrganizationEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", OrganizationEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("businessNo", OrganizationEditor_TextBox_businessNo(instance).asWidget());
    templateFieldsMap.put("tax", OrganizationEditor_TextBox_tax(instance).asWidget());
    templateFieldsMap.put("effectiveDt", OrganizationEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editOrganizationBtn", OrganizationEditor_Button_editOrganizationBtn(instance).asWidget());
    templateFieldsMap.put("listOrganizationsPageLink", ElementWrapperWidget.getWidget(OrganizationEditor_AnchorElement_listOrganizationsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editOrganizationBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editOrganization(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = OrganizationPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organization.OrganizationEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(OrganizationEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationEditor_TextBox_businessNo(instance), "businessNo", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationEditor_TextBox_tax(instance), "tax", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationEditor_AnchorElement_listOrganizationsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo OrganizationEditor_TransitionTo_listOrganizationsPage(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::listOrganizationsPage;
  }-*/;

  native static void OrganizationEditor_TransitionTo_listOrganizationsPage(OrganizationEditor instance, TransitionTo<ListOrganizationPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::listOrganizationsPage = value;
  }-*/;

  native static ListBox OrganizationEditor_ListBox_party(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::party;
  }-*/;

  native static void OrganizationEditor_ListBox_party(OrganizationEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::party = value;
  }-*/;

  native static Button OrganizationEditor_Button_editOrganizationBtn(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::editOrganizationBtn;
  }-*/;

  native static void OrganizationEditor_Button_editOrganizationBtn(OrganizationEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::editOrganizationBtn = value;
  }-*/;

  native static DataBinder OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder;
  }-*/;

  native static void OrganizationPresenter_DataBinder_binder(OrganizationPresenter instance, DataBinder<Organization> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationPresenter::binder = value;
  }-*/;

  native static TextBox OrganizationEditor_TextBox_description(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::description;
  }-*/;

  native static void OrganizationEditor_TextBox_description(OrganizationEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::description = value;
  }-*/;

  native static TextBox OrganizationEditor_TextBox_entityCode(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::entityCode;
  }-*/;

  native static void OrganizationEditor_TextBox_entityCode(OrganizationEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::entityCode = value;
  }-*/;

  native static Event OrganizationEditor_Event_createEntityEvent(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::createEntityEvent;
  }-*/;

  native static void OrganizationEditor_Event_createEntityEvent(OrganizationEditor instance, Event<OrganizationEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::createEntityEvent = value;
  }-*/;

  native static TextBox OrganizationEditor_TextBox_tax(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::tax;
  }-*/;

  native static void OrganizationEditor_TextBox_tax(OrganizationEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::tax = value;
  }-*/;

  native static AnchorElement OrganizationEditor_AnchorElement_listOrganizationsPageLink(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::listOrganizationsPageLink;
  }-*/;

  native static void OrganizationEditor_AnchorElement_listOrganizationsPageLink(OrganizationEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::listOrganizationsPageLink = value;
  }-*/;

  native static TextBox OrganizationEditor_TextBox_name(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::name;
  }-*/;

  native static void OrganizationEditor_TextBox_name(OrganizationEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::name = value;
  }-*/;

  native static Div OrganizationEditor_Div_organizationEditor(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::organizationEditor;
  }-*/;

  native static void OrganizationEditor_Div_organizationEditor(OrganizationEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::organizationEditor = value;
  }-*/;

  native static TextBox OrganizationEditor_TextBox_businessNo(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::businessNo;
  }-*/;

  native static void OrganizationEditor_TextBox_businessNo(OrganizationEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::businessNo = value;
  }-*/;

  native static Event OrganizationEditor_Event_editEntityEvent(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::editEntityEvent;
  }-*/;

  native static void OrganizationEditor_Event_editEntityEvent(OrganizationEditor instance, Event<OrganizationEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::editEntityEvent = value;
  }-*/;

  native static TextBox OrganizationEditor_TextBox_effectiveDt(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::effectiveDt;
  }-*/;

  native static void OrganizationEditor_TextBox_effectiveDt(OrganizationEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::effectiveDt = value;
  }-*/;

  native static ListBox OrganizationEditor_ListBox_universe(OrganizationEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::universe;
  }-*/;

  native static void OrganizationEditor_ListBox_universe(OrganizationEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organization.OrganizationEditor::universe = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationglaccountbalance.ListOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
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
import java.math.BigDecimal;
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

public class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationglaccountbalanceEditor.class, "Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationglaccountbalanceEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationglaccountbalanceEditor.class);
    handle.addAssignableType(OrganizationglaccountbalancePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationglaccountbalanceEditor createInstance(final ContextManager contextManager) {
    final OrganizationglaccountbalanceEditor instance = new OrganizationglaccountbalanceEditor();
    setIncompleteInstance(instance);
    final TransitionTo OrganizationglaccountbalanceEditor_listOrganizationglaccountbalancesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationglaccountbalancePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_listOrganizationglaccountbalancesPage);
    OrganizationglaccountbalanceEditor_TransitionTo_listOrganizationglaccountbalancesPage(instance, OrganizationglaccountbalanceEditor_listOrganizationglaccountbalancesPage);
    final TextBox OrganizationglaccountbalanceEditor_amount = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_amount);
    OrganizationglaccountbalanceEditor_TextBox_amount(instance, OrganizationglaccountbalanceEditor_amount);
    final ListBox OrganizationglaccountbalanceEditor_accountingPeriod = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_accountingPeriod);
    OrganizationglaccountbalanceEditor_ListBox_accountingPeriod(instance, OrganizationglaccountbalanceEditor_accountingPeriod);
    final Event OrganizationglaccountbalanceEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationglaccountbalanceEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_createEntityEvent);
    OrganizationglaccountbalanceEditor_Event_createEntityEvent(instance, OrganizationglaccountbalanceEditor_createEntityEvent);
    final TextBox OrganizationglaccountbalanceEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_entityCode);
    OrganizationglaccountbalanceEditor_TextBox_entityCode(instance, OrganizationglaccountbalanceEditor_entityCode);
    final ListBox OrganizationglaccountbalanceEditor_glAccount = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_glAccount);
    OrganizationglaccountbalanceEditor_ListBox_glAccount(instance, OrganizationglaccountbalanceEditor_glAccount);
    final ListBox OrganizationglaccountbalanceEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_universe);
    OrganizationglaccountbalanceEditor_ListBox_universe(instance, OrganizationglaccountbalanceEditor_universe);
    final TextBox OrganizationglaccountbalanceEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_effectiveDt);
    OrganizationglaccountbalanceEditor_TextBox_effectiveDt(instance, OrganizationglaccountbalanceEditor_effectiveDt);
    final Event OrganizationglaccountbalanceEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationglaccountbalanceEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_editEntityEvent);
    OrganizationglaccountbalanceEditor_Event_editEntityEvent(instance, OrganizationglaccountbalanceEditor_editEntityEvent);
    final Div OrganizationglaccountbalanceEditor_organizationglaccountbalanceEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceEditor_organizationglaccountbalanceEditor);
    OrganizationglaccountbalanceEditor_Div_organizationglaccountbalanceEditor(instance, OrganizationglaccountbalanceEditor_organizationglaccountbalanceEditor);
    final DataBinder OrganizationglaccountbalancePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationglaccountbalance.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationglaccountbalancePresenter_binder);
    OrganizationglaccountbalancePresenter_DataBinder_binder(instance, OrganizationglaccountbalancePresenter_binder);
    c_c_h_c_l_o_OrganizationglaccountbalanceEditorTemplateResource templateForOrganizationglaccountbalanceEditor = GWT.create(c_c_h_c_l_o_OrganizationglaccountbalanceEditorTemplateResource.class);
    Element parentElementForTemplateOfOrganizationglaccountbalanceEditor = TemplateUtil.getRootTemplateParentElement(templateForOrganizationglaccountbalanceEditor.getContents().getText(), "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", "organizationglaccountbalanceEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceEditor_Div_organizationglaccountbalanceEditor(instance)));
      }
    }, dataFieldElements, "organizationglaccountbalanceEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceEditor_ListBox_glAccount(instance).asWidget();
      }
    }, dataFieldElements, "glAccount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceEditor_ListBox_accountingPeriod(instance).asWidget();
      }
    }, dataFieldElements, "accountingPeriod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceEditor_TextBox_amount(instance).asWidget();
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceEditor_Button_editOrganizationglaccountbalanceBtn(instance).asWidget();
      }
    }, dataFieldElements, "editOrganizationglaccountbalanceBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com/cloderia/helion/client/local/organizationglaccountbalance/edit-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationglaccountbalanceEditor_AnchorElement_listOrganizationglaccountbalancesPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationglaccountbalancesPageLink");
    templateFieldsMap.put("organizationglaccountbalanceEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceEditor_Div_organizationglaccountbalanceEditor(instance))));
    templateFieldsMap.put("glAccount", OrganizationglaccountbalanceEditor_ListBox_glAccount(instance).asWidget());
    templateFieldsMap.put("universe", OrganizationglaccountbalanceEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("accountingPeriod", OrganizationglaccountbalanceEditor_ListBox_accountingPeriod(instance).asWidget());
    templateFieldsMap.put("entityCode", OrganizationglaccountbalanceEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("amount", OrganizationglaccountbalanceEditor_TextBox_amount(instance).asWidget());
    templateFieldsMap.put("effectiveDt", OrganizationglaccountbalanceEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editOrganizationglaccountbalanceBtn", OrganizationglaccountbalanceEditor_Button_editOrganizationglaccountbalanceBtn(instance).asWidget());
    templateFieldsMap.put("listOrganizationglaccountbalancesPageLink", ElementWrapperWidget.getWidget(OrganizationglaccountbalanceEditor_AnchorElement_listOrganizationglaccountbalancesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editOrganizationglaccountbalanceBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editOrganizationglaccountbalance(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationglaccountbalancesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = OrganizationglaccountbalancePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(OrganizationglaccountbalanceEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationglaccountbalanceEditor_TextBox_amount(instance), "amount", Convert.getConverter(BigDecimal.class, String.class), null, false);
    binder.bind(OrganizationglaccountbalanceEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationglaccountbalanceEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationglaccountbalanceEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationglaccountbalanceEditor_AnchorElement_listOrganizationglaccountbalancesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationglaccountbalanceEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox OrganizationglaccountbalanceEditor_TextBox_effectiveDt(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::effectiveDt;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_TextBox_effectiveDt(OrganizationglaccountbalanceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::effectiveDt = value;
  }-*/;

  native static ListBox OrganizationglaccountbalanceEditor_ListBox_glAccount(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::glAccount;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_ListBox_glAccount(OrganizationglaccountbalanceEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::glAccount = value;
  }-*/;

  native static ListBox OrganizationglaccountbalanceEditor_ListBox_universe(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::universe;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_ListBox_universe(OrganizationglaccountbalanceEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::universe = value;
  }-*/;

  native static ListBox OrganizationglaccountbalanceEditor_ListBox_accountingPeriod(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::accountingPeriod;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_ListBox_accountingPeriod(OrganizationglaccountbalanceEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::accountingPeriod = value;
  }-*/;

  native static TransitionTo OrganizationglaccountbalanceEditor_TransitionTo_listOrganizationglaccountbalancesPage(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::listOrganizationglaccountbalancesPage;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_TransitionTo_listOrganizationglaccountbalancesPage(OrganizationglaccountbalanceEditor instance, TransitionTo<ListOrganizationglaccountbalancePage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::listOrganizationglaccountbalancesPage = value;
  }-*/;

  native static Event OrganizationglaccountbalanceEditor_Event_editEntityEvent(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::editEntityEvent;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_Event_editEntityEvent(OrganizationglaccountbalanceEditor instance, Event<OrganizationglaccountbalanceEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::editEntityEvent = value;
  }-*/;

  native static Div OrganizationglaccountbalanceEditor_Div_organizationglaccountbalanceEditor(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::organizationglaccountbalanceEditor;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_Div_organizationglaccountbalanceEditor(OrganizationglaccountbalanceEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::organizationglaccountbalanceEditor = value;
  }-*/;

  native static DataBinder OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder;
  }-*/;

  native static void OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance, DataBinder<Organizationglaccountbalance> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder = value;
  }-*/;

  native static Button OrganizationglaccountbalanceEditor_Button_editOrganizationglaccountbalanceBtn(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::editOrganizationglaccountbalanceBtn;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_Button_editOrganizationglaccountbalanceBtn(OrganizationglaccountbalanceEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::editOrganizationglaccountbalanceBtn = value;
  }-*/;

  native static TextBox OrganizationglaccountbalanceEditor_TextBox_entityCode(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::entityCode;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_TextBox_entityCode(OrganizationglaccountbalanceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::entityCode = value;
  }-*/;

  native static AnchorElement OrganizationglaccountbalanceEditor_AnchorElement_listOrganizationglaccountbalancesPageLink(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::listOrganizationglaccountbalancesPageLink;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_AnchorElement_listOrganizationglaccountbalancesPageLink(OrganizationglaccountbalanceEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::listOrganizationglaccountbalancesPageLink = value;
  }-*/;

  native static TextBox OrganizationglaccountbalanceEditor_TextBox_amount(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::amount;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_TextBox_amount(OrganizationglaccountbalanceEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::amount = value;
  }-*/;

  native static Event OrganizationglaccountbalanceEditor_Event_createEntityEvent(OrganizationglaccountbalanceEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::createEntityEvent;
  }-*/;

  native static void OrganizationglaccountbalanceEditor_Event_createEntityEvent(OrganizationglaccountbalanceEditor instance, Event<OrganizationglaccountbalanceEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor::createEntityEvent = value;
  }-*/;
}
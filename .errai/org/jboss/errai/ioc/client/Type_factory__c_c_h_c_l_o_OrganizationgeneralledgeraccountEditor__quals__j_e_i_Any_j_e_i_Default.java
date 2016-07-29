package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ListOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
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

public class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationgeneralledgeraccountEditor.class, "Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationgeneralledgeraccountEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationgeneralledgeraccountEditor.class);
    handle.addAssignableType(OrganizationgeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationgeneralledgeraccountEditor createInstance(final ContextManager contextManager) {
    final OrganizationgeneralledgeraccountEditor instance = new OrganizationgeneralledgeraccountEditor();
    setIncompleteInstance(instance);
    final ListBox OrganizationgeneralledgeraccountEditor_glAccount = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_glAccount);
    OrganizationgeneralledgeraccountEditor_ListBox_glAccount(instance, OrganizationgeneralledgeraccountEditor_glAccount);
    final Div OrganizationgeneralledgeraccountEditor_organizationgeneralledgeraccountEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_organizationgeneralledgeraccountEditor);
    OrganizationgeneralledgeraccountEditor_Div_organizationgeneralledgeraccountEditor(instance, OrganizationgeneralledgeraccountEditor_organizationgeneralledgeraccountEditor);
    final ListBox OrganizationgeneralledgeraccountEditor_product = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_product);
    OrganizationgeneralledgeraccountEditor_ListBox_product(instance, OrganizationgeneralledgeraccountEditor_product);
    final TransitionTo OrganizationgeneralledgeraccountEditor_listOrganizationgeneralledgeraccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationgeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_listOrganizationgeneralledgeraccountsPage);
    OrganizationgeneralledgeraccountEditor_TransitionTo_listOrganizationgeneralledgeraccountsPage(instance, OrganizationgeneralledgeraccountEditor_listOrganizationgeneralledgeraccountsPage);
    final TextBox OrganizationgeneralledgeraccountEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_description);
    OrganizationgeneralledgeraccountEditor_TextBox_description(instance, OrganizationgeneralledgeraccountEditor_description);
    final TextBox OrganizationgeneralledgeraccountEditor_fromDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_fromDt);
    OrganizationgeneralledgeraccountEditor_TextBox_fromDt(instance, OrganizationgeneralledgeraccountEditor_fromDt);
    final Event OrganizationgeneralledgeraccountEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationgeneralledgeraccountEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_createEntityEvent);
    OrganizationgeneralledgeraccountEditor_Event_createEntityEvent(instance, OrganizationgeneralledgeraccountEditor_createEntityEvent);
    final ListBox OrganizationgeneralledgeraccountEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_universe);
    OrganizationgeneralledgeraccountEditor_ListBox_universe(instance, OrganizationgeneralledgeraccountEditor_universe);
    final ListBox OrganizationgeneralledgeraccountEditor_organization = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_organization);
    OrganizationgeneralledgeraccountEditor_ListBox_organization(instance, OrganizationgeneralledgeraccountEditor_organization);
    final TextBox OrganizationgeneralledgeraccountEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_name);
    OrganizationgeneralledgeraccountEditor_TextBox_name(instance, OrganizationgeneralledgeraccountEditor_name);
    final DataBinder OrganizationgeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationgeneralledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountPresenter_binder);
    OrganizationgeneralledgeraccountPresenter_DataBinder_binder(instance, OrganizationgeneralledgeraccountPresenter_binder);
    final Event OrganizationgeneralledgeraccountEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationgeneralledgeraccountEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_editEntityEvent);
    OrganizationgeneralledgeraccountEditor_Event_editEntityEvent(instance, OrganizationgeneralledgeraccountEditor_editEntityEvent);
    final ListBox OrganizationgeneralledgeraccountEditor_productCat = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_productCat);
    OrganizationgeneralledgeraccountEditor_ListBox_productCat(instance, OrganizationgeneralledgeraccountEditor_productCat);
    final TextBox OrganizationgeneralledgeraccountEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_entityCode);
    OrganizationgeneralledgeraccountEditor_TextBox_entityCode(instance, OrganizationgeneralledgeraccountEditor_entityCode);
    final TextBox OrganizationgeneralledgeraccountEditor_toDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountEditor_toDt);
    OrganizationgeneralledgeraccountEditor_TextBox_toDt(instance, OrganizationgeneralledgeraccountEditor_toDt);
    c_c_h_c_l_o_OrganizationgeneralledgeraccountEditorTemplateResource templateForOrganizationgeneralledgeraccountEditor = GWT.create(c_c_h_c_l_o_OrganizationgeneralledgeraccountEditorTemplateResource.class);
    Element parentElementForTemplateOfOrganizationgeneralledgeraccountEditor = TemplateUtil.getRootTemplateParentElement(templateForOrganizationgeneralledgeraccountEditor.getContents().getText(), "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", "organizationgeneralledgeraccountEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountEditor_Div_organizationgeneralledgeraccountEditor(instance)));
      }
    }, dataFieldElements, "organizationgeneralledgeraccountEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_ListBox_organization(instance).asWidget();
      }
    }, dataFieldElements, "organization");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_ListBox_productCat(instance).asWidget();
      }
    }, dataFieldElements, "productCat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_ListBox_product(instance).asWidget();
      }
    }, dataFieldElements, "product");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_ListBox_glAccount(instance).asWidget();
      }
    }, dataFieldElements, "glAccount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_TextBox_fromDt(instance).asWidget();
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_TextBox_toDt(instance).asWidget();
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountEditor_Button_editOrganizationgeneralledgeraccountBtn(instance).asWidget();
      }
    }, dataFieldElements, "editOrganizationgeneralledgeraccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/edit-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountEditor_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationgeneralledgeraccountsPageLink");
    templateFieldsMap.put("organizationgeneralledgeraccountEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountEditor_Div_organizationgeneralledgeraccountEditor(instance))));
    templateFieldsMap.put("organization", OrganizationgeneralledgeraccountEditor_ListBox_organization(instance).asWidget());
    templateFieldsMap.put("productCat", OrganizationgeneralledgeraccountEditor_ListBox_productCat(instance).asWidget());
    templateFieldsMap.put("universe", OrganizationgeneralledgeraccountEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("product", OrganizationgeneralledgeraccountEditor_ListBox_product(instance).asWidget());
    templateFieldsMap.put("glAccount", OrganizationgeneralledgeraccountEditor_ListBox_glAccount(instance).asWidget());
    templateFieldsMap.put("entityCode", OrganizationgeneralledgeraccountEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", OrganizationgeneralledgeraccountEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", OrganizationgeneralledgeraccountEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("fromDt", OrganizationgeneralledgeraccountEditor_TextBox_fromDt(instance).asWidget());
    templateFieldsMap.put("toDt", OrganizationgeneralledgeraccountEditor_TextBox_toDt(instance).asWidget());
    templateFieldsMap.put("editOrganizationgeneralledgeraccountBtn", OrganizationgeneralledgeraccountEditor_Button_editOrganizationgeneralledgeraccountBtn(instance).asWidget());
    templateFieldsMap.put("listOrganizationgeneralledgeraccountsPageLink", ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountEditor_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editOrganizationgeneralledgeraccountBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editOrganizationgeneralledgeraccount(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationgeneralledgeraccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = OrganizationgeneralledgeraccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(OrganizationgeneralledgeraccountEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationgeneralledgeraccountEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationgeneralledgeraccountEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(OrganizationgeneralledgeraccountEditor_TextBox_fromDt(instance), "fromDt", new DateConverter(), null, false);
    binder.bind(OrganizationgeneralledgeraccountEditor_TextBox_toDt(instance), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationgeneralledgeraccountEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationgeneralledgeraccountEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountEditor_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationgeneralledgeraccountEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox OrganizationgeneralledgeraccountEditor_TextBox_description(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::description;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_TextBox_description(OrganizationgeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::description = value;
  }-*/;

  native static TextBox OrganizationgeneralledgeraccountEditor_TextBox_name(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::name;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_TextBox_name(OrganizationgeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::name = value;
  }-*/;

  native static ListBox OrganizationgeneralledgeraccountEditor_ListBox_productCat(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::productCat;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_ListBox_productCat(OrganizationgeneralledgeraccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::productCat = value;
  }-*/;

  native static Button OrganizationgeneralledgeraccountEditor_Button_editOrganizationgeneralledgeraccountBtn(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::editOrganizationgeneralledgeraccountBtn;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_Button_editOrganizationgeneralledgeraccountBtn(OrganizationgeneralledgeraccountEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::editOrganizationgeneralledgeraccountBtn = value;
  }-*/;

  native static Event OrganizationgeneralledgeraccountEditor_Event_createEntityEvent(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::createEntityEvent;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_Event_createEntityEvent(OrganizationgeneralledgeraccountEditor instance, Event<OrganizationgeneralledgeraccountEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::createEntityEvent = value;
  }-*/;

  native static ListBox OrganizationgeneralledgeraccountEditor_ListBox_glAccount(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::glAccount;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_ListBox_glAccount(OrganizationgeneralledgeraccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::glAccount = value;
  }-*/;

  native static AnchorElement OrganizationgeneralledgeraccountEditor_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::listOrganizationgeneralledgeraccountsPageLink;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(OrganizationgeneralledgeraccountEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::listOrganizationgeneralledgeraccountsPageLink = value;
  }-*/;

  native static ListBox OrganizationgeneralledgeraccountEditor_ListBox_organization(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::organization;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_ListBox_organization(OrganizationgeneralledgeraccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::organization = value;
  }-*/;

  native static Div OrganizationgeneralledgeraccountEditor_Div_organizationgeneralledgeraccountEditor(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::organizationgeneralledgeraccountEditor;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_Div_organizationgeneralledgeraccountEditor(OrganizationgeneralledgeraccountEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::organizationgeneralledgeraccountEditor = value;
  }-*/;

  native static ListBox OrganizationgeneralledgeraccountEditor_ListBox_universe(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::universe;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_ListBox_universe(OrganizationgeneralledgeraccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::universe = value;
  }-*/;

  native static TextBox OrganizationgeneralledgeraccountEditor_TextBox_entityCode(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::entityCode;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_TextBox_entityCode(OrganizationgeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::entityCode = value;
  }-*/;

  native static ListBox OrganizationgeneralledgeraccountEditor_ListBox_product(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::product;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_ListBox_product(OrganizationgeneralledgeraccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::product = value;
  }-*/;

  native static DataBinder OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder;
  }-*/;

  native static void OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance, DataBinder<Organizationgeneralledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder = value;
  }-*/;

  native static TransitionTo OrganizationgeneralledgeraccountEditor_TransitionTo_listOrganizationgeneralledgeraccountsPage(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::listOrganizationgeneralledgeraccountsPage;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_TransitionTo_listOrganizationgeneralledgeraccountsPage(OrganizationgeneralledgeraccountEditor instance, TransitionTo<ListOrganizationgeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::listOrganizationgeneralledgeraccountsPage = value;
  }-*/;

  native static TextBox OrganizationgeneralledgeraccountEditor_TextBox_fromDt(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::fromDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_TextBox_fromDt(OrganizationgeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::fromDt = value;
  }-*/;

  native static Event OrganizationgeneralledgeraccountEditor_Event_editEntityEvent(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::editEntityEvent;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_Event_editEntityEvent(OrganizationgeneralledgeraccountEditor instance, Event<OrganizationgeneralledgeraccountEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::editEntityEvent = value;
  }-*/;

  native static TextBox OrganizationgeneralledgeraccountEditor_TextBox_toDt(OrganizationgeneralledgeraccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::toDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountEditor_TextBox_toDt(OrganizationgeneralledgeraccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor::toDt = value;
  }-*/;
}
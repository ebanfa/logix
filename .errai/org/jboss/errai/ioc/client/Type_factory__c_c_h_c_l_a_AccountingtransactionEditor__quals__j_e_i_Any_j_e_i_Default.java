package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter;
import com.cloderia.helion.client.local.accountingtransaction.ListAccountingtransactionPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Accountingtransaction;
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

public class Type_factory__c_c_h_c_l_a_AccountingtransactionEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AccountingtransactionEditor.class, "Type_factory__c_c_h_c_l_a_AccountingtransactionEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AccountingtransactionEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AccountingtransactionEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AccountingtransactionEditor.class);
    handle.addAssignableType(AccountingtransactionPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AccountingtransactionEditor createInstance(final ContextManager contextManager) {
    final AccountingtransactionEditor instance = new AccountingtransactionEditor();
    setIncompleteInstance(instance);
    final Div AccountingtransactionEditor_accountingtransactionEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionEditor_accountingtransactionEditor);
    AccountingtransactionEditor_Div_accountingtransactionEditor(instance, AccountingtransactionEditor_accountingtransactionEditor);
    final TextBox AccountingtransactionEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_description);
    AccountingtransactionEditor_TextBox_description(instance, AccountingtransactionEditor_description);
    final TextBox AccountingtransactionEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_name);
    AccountingtransactionEditor_TextBox_name(instance, AccountingtransactionEditor_name);
    final TextBox AccountingtransactionEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_entityCode);
    AccountingtransactionEditor_TextBox_entityCode(instance, AccountingtransactionEditor_entityCode);
    final ListBox AccountingtransactionEditor_invoice = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_invoice);
    AccountingtransactionEditor_ListBox_invoice(instance, AccountingtransactionEditor_invoice);
    final ListBox AccountingtransactionEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_universe);
    AccountingtransactionEditor_ListBox_universe(instance, AccountingtransactionEditor_universe);
    final ListBox AccountingtransactionEditor_fixedAsset = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_fixedAsset);
    AccountingtransactionEditor_ListBox_fixedAsset(instance, AccountingtransactionEditor_fixedAsset);
    final ListBox AccountingtransactionEditor_partyRole = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_partyRole);
    AccountingtransactionEditor_ListBox_partyRole(instance, AccountingtransactionEditor_partyRole);
    final DataBinder AccountingtransactionPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Accountingtransaction.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AccountingtransactionPresenter_binder);
    AccountingtransactionPresenter_DataBinder_binder(instance, AccountingtransactionPresenter_binder);
    final ListBox AccountingtransactionEditor_transactionTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_transactionTy);
    AccountingtransactionEditor_ListBox_transactionTy(instance, AccountingtransactionEditor_transactionTy);
    final TextBox AccountingtransactionEditor_entryDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_entryDt);
    AccountingtransactionEditor_TextBox_entryDt(instance, AccountingtransactionEditor_entryDt);
    final TextBox AccountingtransactionEditor_transactionDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_transactionDt);
    AccountingtransactionEditor_TextBox_transactionDt(instance, AccountingtransactionEditor_transactionDt);
    final Event AccountingtransactionEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AccountingtransactionEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, AccountingtransactionEditor_createEntityEvent);
    AccountingtransactionEditor_Event_createEntityEvent(instance, AccountingtransactionEditor_createEntityEvent);
    final ListBox AccountingtransactionEditor_payment = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_payment);
    AccountingtransactionEditor_ListBox_payment(instance, AccountingtransactionEditor_payment);
    final Event AccountingtransactionEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AccountingtransactionEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, AccountingtransactionEditor_editEntityEvent);
    AccountingtransactionEditor_Event_editEntityEvent(instance, AccountingtransactionEditor_editEntityEvent);
    final TransitionTo AccountingtransactionEditor_listAccountingtransactionsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListAccountingtransactionPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AccountingtransactionEditor_listAccountingtransactionsPage);
    AccountingtransactionEditor_TransitionTo_listAccountingtransactionsPage(instance, AccountingtransactionEditor_listAccountingtransactionsPage);
    final ListBox AccountingtransactionEditor_fromParty = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionEditor_fromParty);
    AccountingtransactionEditor_ListBox_fromParty(instance, AccountingtransactionEditor_fromParty);
    c_c_h_c_l_a_AccountingtransactionEditorTemplateResource templateForAccountingtransactionEditor = GWT.create(c_c_h_c_l_a_AccountingtransactionEditorTemplateResource.class);
    Element parentElementForTemplateOfAccountingtransactionEditor = TemplateUtil.getRootTemplateParentElement(templateForAccountingtransactionEditor.getContents().getText(), "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", "accountingtransactionEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionEditor_Div_accountingtransactionEditor(instance)));
      }
    }, dataFieldElements, "accountingtransactionEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_ListBox_payment(instance).asWidget();
      }
    }, dataFieldElements, "payment");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_ListBox_fromParty(instance).asWidget();
      }
    }, dataFieldElements, "fromParty");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_ListBox_invoice(instance).asWidget();
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_ListBox_fixedAsset(instance).asWidget();
      }
    }, dataFieldElements, "fixedAsset");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_ListBox_partyRole(instance).asWidget();
      }
    }, dataFieldElements, "partyRole");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_ListBox_transactionTy(instance).asWidget();
      }
    }, dataFieldElements, "transactionTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_TextBox_transactionDt(instance).asWidget();
      }
    }, dataFieldElements, "transactionDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_TextBox_entryDt(instance).asWidget();
      }
    }, dataFieldElements, "entryDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionEditor_Button_editAccountingtransactionBtn(instance).asWidget();
      }
    }, dataFieldElements, "editAccountingtransactionBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com/cloderia/helion/client/local/accountingtransaction/edit-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AccountingtransactionEditor_AnchorElement_listAccountingtransactionsPageLink(instance));
      }
    }, dataFieldElements, "listAccountingtransactionsPageLink");
    templateFieldsMap.put("accountingtransactionEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionEditor_Div_accountingtransactionEditor(instance))));
    templateFieldsMap.put("payment", AccountingtransactionEditor_ListBox_payment(instance).asWidget());
    templateFieldsMap.put("fromParty", AccountingtransactionEditor_ListBox_fromParty(instance).asWidget());
    templateFieldsMap.put("invoice", AccountingtransactionEditor_ListBox_invoice(instance).asWidget());
    templateFieldsMap.put("fixedAsset", AccountingtransactionEditor_ListBox_fixedAsset(instance).asWidget());
    templateFieldsMap.put("partyRole", AccountingtransactionEditor_ListBox_partyRole(instance).asWidget());
    templateFieldsMap.put("universe", AccountingtransactionEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("transactionTy", AccountingtransactionEditor_ListBox_transactionTy(instance).asWidget());
    templateFieldsMap.put("entityCode", AccountingtransactionEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", AccountingtransactionEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", AccountingtransactionEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("transactionDt", AccountingtransactionEditor_TextBox_transactionDt(instance).asWidget());
    templateFieldsMap.put("entryDt", AccountingtransactionEditor_TextBox_entryDt(instance).asWidget());
    templateFieldsMap.put("editAccountingtransactionBtn", AccountingtransactionEditor_Button_editAccountingtransactionBtn(instance).asWidget());
    templateFieldsMap.put("listAccountingtransactionsPageLink", ElementWrapperWidget.getWidget(AccountingtransactionEditor_AnchorElement_listAccountingtransactionsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editAccountingtransactionBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editAccountingtransaction(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listAccountingtransactionsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = AccountingtransactionPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(AccountingtransactionEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(AccountingtransactionEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(AccountingtransactionEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(AccountingtransactionEditor_TextBox_transactionDt(instance), "transactionDt", new DateConverter(), null, false);
    binder.bind(AccountingtransactionEditor_TextBox_entryDt(instance), "entryDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AccountingtransactionEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final AccountingtransactionEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AccountingtransactionEditor_AnchorElement_listAccountingtransactionsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AccountingtransactionEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox AccountingtransactionEditor_ListBox_fromParty(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::fromParty;
  }-*/;

  native static void AccountingtransactionEditor_ListBox_fromParty(AccountingtransactionEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::fromParty = value;
  }-*/;

  native static Div AccountingtransactionEditor_Div_accountingtransactionEditor(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::accountingtransactionEditor;
  }-*/;

  native static void AccountingtransactionEditor_Div_accountingtransactionEditor(AccountingtransactionEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::accountingtransactionEditor = value;
  }-*/;

  native static ListBox AccountingtransactionEditor_ListBox_invoice(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::invoice;
  }-*/;

  native static void AccountingtransactionEditor_ListBox_invoice(AccountingtransactionEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::invoice = value;
  }-*/;

  native static ListBox AccountingtransactionEditor_ListBox_transactionTy(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::transactionTy;
  }-*/;

  native static void AccountingtransactionEditor_ListBox_transactionTy(AccountingtransactionEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::transactionTy = value;
  }-*/;

  native static ListBox AccountingtransactionEditor_ListBox_universe(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::universe;
  }-*/;

  native static void AccountingtransactionEditor_ListBox_universe(AccountingtransactionEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::universe = value;
  }-*/;

  native static AnchorElement AccountingtransactionEditor_AnchorElement_listAccountingtransactionsPageLink(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::listAccountingtransactionsPageLink;
  }-*/;

  native static void AccountingtransactionEditor_AnchorElement_listAccountingtransactionsPageLink(AccountingtransactionEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::listAccountingtransactionsPageLink = value;
  }-*/;

  native static TextBox AccountingtransactionEditor_TextBox_name(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::name;
  }-*/;

  native static void AccountingtransactionEditor_TextBox_name(AccountingtransactionEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::name = value;
  }-*/;

  native static TextBox AccountingtransactionEditor_TextBox_transactionDt(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::transactionDt;
  }-*/;

  native static void AccountingtransactionEditor_TextBox_transactionDt(AccountingtransactionEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::transactionDt = value;
  }-*/;

  native static TextBox AccountingtransactionEditor_TextBox_entityCode(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::entityCode;
  }-*/;

  native static void AccountingtransactionEditor_TextBox_entityCode(AccountingtransactionEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::entityCode = value;
  }-*/;

  native static TextBox AccountingtransactionEditor_TextBox_description(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::description;
  }-*/;

  native static void AccountingtransactionEditor_TextBox_description(AccountingtransactionEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::description = value;
  }-*/;

  native static TransitionTo AccountingtransactionEditor_TransitionTo_listAccountingtransactionsPage(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::listAccountingtransactionsPage;
  }-*/;

  native static void AccountingtransactionEditor_TransitionTo_listAccountingtransactionsPage(AccountingtransactionEditor instance, TransitionTo<ListAccountingtransactionPage> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::listAccountingtransactionsPage = value;
  }-*/;

  native static DataBinder AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder;
  }-*/;

  native static void AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance, DataBinder<Accountingtransaction> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder = value;
  }-*/;

  native static TextBox AccountingtransactionEditor_TextBox_entryDt(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::entryDt;
  }-*/;

  native static void AccountingtransactionEditor_TextBox_entryDt(AccountingtransactionEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::entryDt = value;
  }-*/;

  native static ListBox AccountingtransactionEditor_ListBox_fixedAsset(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::fixedAsset;
  }-*/;

  native static void AccountingtransactionEditor_ListBox_fixedAsset(AccountingtransactionEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::fixedAsset = value;
  }-*/;

  native static Button AccountingtransactionEditor_Button_editAccountingtransactionBtn(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::editAccountingtransactionBtn;
  }-*/;

  native static void AccountingtransactionEditor_Button_editAccountingtransactionBtn(AccountingtransactionEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::editAccountingtransactionBtn = value;
  }-*/;

  native static ListBox AccountingtransactionEditor_ListBox_payment(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::payment;
  }-*/;

  native static void AccountingtransactionEditor_ListBox_payment(AccountingtransactionEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::payment = value;
  }-*/;

  native static ListBox AccountingtransactionEditor_ListBox_partyRole(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::partyRole;
  }-*/;

  native static void AccountingtransactionEditor_ListBox_partyRole(AccountingtransactionEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::partyRole = value;
  }-*/;

  native static Event AccountingtransactionEditor_Event_createEntityEvent(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::createEntityEvent;
  }-*/;

  native static void AccountingtransactionEditor_Event_createEntityEvent(AccountingtransactionEditor instance, Event<AccountingtransactionEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::createEntityEvent = value;
  }-*/;

  native static Event AccountingtransactionEditor_Event_editEntityEvent(AccountingtransactionEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::editEntityEvent;
  }-*/;

  native static void AccountingtransactionEditor_Event_editEntityEvent(AccountingtransactionEditor instance, Event<AccountingtransactionEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor::editEntityEvent = value;
  }-*/;
}
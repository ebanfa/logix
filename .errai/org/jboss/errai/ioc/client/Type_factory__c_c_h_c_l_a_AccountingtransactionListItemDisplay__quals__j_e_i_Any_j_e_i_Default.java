package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Accountingtransaction;
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

public class Type_factory__c_c_h_c_l_a_AccountingtransactionListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AccountingtransactionListItemDisplay.class, "Type_factory__c_c_h_c_l_a_AccountingtransactionListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AccountingtransactionListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AccountingtransactionListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AccountingtransactionListItemDisplay.class);
    handle.addAssignableType(AccountingtransactionPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AccountingtransactionListItemDisplay createInstance(final ContextManager contextManager) {
    final AccountingtransactionListItemDisplay instance = new AccountingtransactionListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell AccountingtransactionListItemDisplay_fixedAsset = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_fixedAsset);
    AccountingtransactionListItemDisplay_TableCell_fixedAsset(instance, AccountingtransactionListItemDisplay_fixedAsset);
    final TableCell AccountingtransactionListItemDisplay_payment = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_payment);
    AccountingtransactionListItemDisplay_TableCell_payment(instance, AccountingtransactionListItemDisplay_payment);
    final TableCell AccountingtransactionListItemDisplay_transactionTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_transactionTy);
    AccountingtransactionListItemDisplay_TableCell_transactionTy(instance, AccountingtransactionListItemDisplay_transactionTy);
    final TableCell AccountingtransactionListItemDisplay_partyRole = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_partyRole);
    AccountingtransactionListItemDisplay_TableCell_partyRole(instance, AccountingtransactionListItemDisplay_partyRole);
    final TableCell AccountingtransactionListItemDisplay_fromParty = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_fromParty);
    AccountingtransactionListItemDisplay_TableCell_fromParty(instance, AccountingtransactionListItemDisplay_fromParty);
    final TableCell AccountingtransactionListItemDisplay_entryDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_entryDt);
    AccountingtransactionListItemDisplay_TableCell_entryDt(instance, AccountingtransactionListItemDisplay_entryDt);
    final Event AccountingtransactionListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AccountingtransactionListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_renderEditViewEvent);
    AccountingtransactionListItemDisplay_Event_renderEditViewEvent(instance, AccountingtransactionListItemDisplay_renderEditViewEvent);
    final TableRow AccountingtransactionListItemDisplay_accountingtransactionItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_accountingtransactionItem);
    AccountingtransactionListItemDisplay_TableRow_accountingtransactionItem(instance, AccountingtransactionListItemDisplay_accountingtransactionItem);
    final TableCell AccountingtransactionListItemDisplay_transactionDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_transactionDt);
    AccountingtransactionListItemDisplay_TableCell_transactionDt(instance, AccountingtransactionListItemDisplay_transactionDt);
    final Event AccountingtransactionListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AccountingtransactionListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_renderSingleViewEvent);
    AccountingtransactionListItemDisplay_Event_renderSingleViewEvent(instance, AccountingtransactionListItemDisplay_renderSingleViewEvent);
    final AnchorElement AccountingtransactionListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_editEntityListItemBtn);
    AccountingtransactionListItemDisplay_AnchorElement_editEntityListItemBtn(instance, AccountingtransactionListItemDisplay_editEntityListItemBtn);
    final TableCell AccountingtransactionListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_description);
    AccountingtransactionListItemDisplay_TableCell_description(instance, AccountingtransactionListItemDisplay_description);
    final TableCell AccountingtransactionListItemDisplay_invoice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_invoice);
    AccountingtransactionListItemDisplay_TableCell_invoice(instance, AccountingtransactionListItemDisplay_invoice);
    final Event AccountingtransactionListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AccountingtransactionListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_deleteEntityEvent);
    AccountingtransactionListItemDisplay_Event_deleteEntityEvent(instance, AccountingtransactionListItemDisplay_deleteEntityEvent);
    final TableCell AccountingtransactionListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_name);
    AccountingtransactionListItemDisplay_TableCell_name(instance, AccountingtransactionListItemDisplay_name);
    final AnchorElement AccountingtransactionListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_deleteEntityListItemBtn);
    AccountingtransactionListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, AccountingtransactionListItemDisplay_deleteEntityListItemBtn);
    final TableCell AccountingtransactionListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionListItemDisplay_entityCode);
    AccountingtransactionListItemDisplay_TableCell_entityCode(instance, AccountingtransactionListItemDisplay_entityCode);
    final DataBinder AccountingtransactionPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Accountingtransaction.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AccountingtransactionPresenter_binder);
    AccountingtransactionPresenter_DataBinder_binder(instance, AccountingtransactionPresenter_binder);
    c_c_h_c_l_a_AccountingtransactionListItemDisplayTemplateResource templateForAccountingtransactionListItemDisplay = GWT.create(c_c_h_c_l_a_AccountingtransactionListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfAccountingtransactionListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForAccountingtransactionListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", "accountingtransactionItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableRow_accountingtransactionItem(instance)));
      }
    }, dataFieldElements, "accountingtransactionItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_payment(instance)));
      }
    }, dataFieldElements, "payment");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_fromParty(instance)));
      }
    }, dataFieldElements, "fromParty");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_invoice(instance)));
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_fixedAsset(instance)));
      }
    }, dataFieldElements, "fixedAsset");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_partyRole(instance)));
      }
    }, dataFieldElements, "partyRole");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_transactionTy(instance)));
      }
    }, dataFieldElements, "transactionTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_transactionDt(instance)));
      }
    }, dataFieldElements, "transactionDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_entryDt(instance)));
      }
    }, dataFieldElements, "entryDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AccountingtransactionListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AccountingtransactionListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("accountingtransactionItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableRow_accountingtransactionItem(instance))));
    templateFieldsMap.put("payment", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_payment(instance))));
    templateFieldsMap.put("fromParty", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_fromParty(instance))));
    templateFieldsMap.put("invoice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_invoice(instance))));
    templateFieldsMap.put("fixedAsset", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_fixedAsset(instance))));
    templateFieldsMap.put("partyRole", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_partyRole(instance))));
    templateFieldsMap.put("transactionTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_transactionTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("transactionDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_transactionDt(instance))));
    templateFieldsMap.put("entryDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListItemDisplay_TableCell_entryDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(AccountingtransactionListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(AccountingtransactionListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = AccountingtransactionPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_payment(instance))), "payment.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_fromParty(instance))), "fromParty.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_invoice(instance))), "invoice.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_fixedAsset(instance))), "fixedAsset.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_partyRole(instance))), "partyRole.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_transactionTy(instance))), "transactionTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_transactionDt(instance))), "transactionDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionListItemDisplay_TableCell_entryDt(instance))), "entryDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AccountingtransactionListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final AccountingtransactionListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AccountingtransactionListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AccountingtransactionListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AccountingtransactionListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell AccountingtransactionListItemDisplay_TableCell_entityCode(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::entityCode;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_entityCode(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_transactionDt(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::transactionDt;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_transactionDt(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::transactionDt = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_fromParty(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::fromParty;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_fromParty(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::fromParty = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_fixedAsset(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::fixedAsset;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_fixedAsset(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::fixedAsset = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_partyRole(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::partyRole;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_partyRole(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::partyRole = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_name(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::name;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_name(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::name = value;
  }-*/;

  native static TableRow AccountingtransactionListItemDisplay_TableRow_accountingtransactionItem(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::accountingtransactionItem;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableRow_accountingtransactionItem(AccountingtransactionListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::accountingtransactionItem = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_transactionTy(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::transactionTy;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_transactionTy(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::transactionTy = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_description(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::description;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_description(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::description = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_invoice(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::invoice;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_invoice(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::invoice = value;
  }-*/;

  native static AnchorElement AccountingtransactionListItemDisplay_AnchorElement_editEntityListItemBtn(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void AccountingtransactionListItemDisplay_AnchorElement_editEntityListItemBtn(AccountingtransactionListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event AccountingtransactionListItemDisplay_Event_renderEditViewEvent(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void AccountingtransactionListItemDisplay_Event_renderEditViewEvent(AccountingtransactionListItemDisplay instance, Event<AccountingtransactionListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static DataBinder AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder;
  }-*/;

  native static void AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance, DataBinder<Accountingtransaction> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder = value;
  }-*/;

  native static Event AccountingtransactionListItemDisplay_Event_renderSingleViewEvent(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void AccountingtransactionListItemDisplay_Event_renderSingleViewEvent(AccountingtransactionListItemDisplay instance, Event<AccountingtransactionListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static Event AccountingtransactionListItemDisplay_Event_deleteEntityEvent(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void AccountingtransactionListItemDisplay_Event_deleteEntityEvent(AccountingtransactionListItemDisplay instance, Event<AccountingtransactionListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_payment(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::payment;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_payment(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::payment = value;
  }-*/;

  native static TableCell AccountingtransactionListItemDisplay_TableCell_entryDt(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::entryDt;
  }-*/;

  native static void AccountingtransactionListItemDisplay_TableCell_entryDt(AccountingtransactionListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::entryDt = value;
  }-*/;

  native static AnchorElement AccountingtransactionListItemDisplay_AnchorElement_deleteEntityListItemBtn(AccountingtransactionListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void AccountingtransactionListItemDisplay_AnchorElement_deleteEntityListItemBtn(AccountingtransactionListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter;
import com.cloderia.helion.client.local.accountingtransaction.ListAccountingtransactionPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_a_AccountingtransactionDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AccountingtransactionDisplay.class, "Type_factory__c_c_h_c_l_a_AccountingtransactionDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AccountingtransactionDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AccountingtransactionDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AccountingtransactionDisplay.class);
    handle.addAssignableType(AccountingtransactionPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AccountingtransactionDisplay createInstance(final ContextManager contextManager) {
    final AccountingtransactionDisplay instance = new AccountingtransactionDisplay();
    setIncompleteInstance(instance);
    final TableCell AccountingtransactionDisplay_transactionTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_transactionTy);
    AccountingtransactionDisplay_TableCell_transactionTy(instance, AccountingtransactionDisplay_transactionTy);
    final TableCell AccountingtransactionDisplay_partyRole = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_partyRole);
    AccountingtransactionDisplay_TableCell_partyRole(instance, AccountingtransactionDisplay_partyRole);
    final TableCell AccountingtransactionDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_description);
    AccountingtransactionDisplay_TableCell_description(instance, AccountingtransactionDisplay_description);
    final TableCell AccountingtransactionDisplay_payment = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_payment);
    AccountingtransactionDisplay_TableCell_payment(instance, AccountingtransactionDisplay_payment);
    final Div AccountingtransactionDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_entityDisplayComponent);
    AccountingtransactionDisplay_Div_entityDisplayComponent(instance, AccountingtransactionDisplay_entityDisplayComponent);
    final TransitionTo AccountingtransactionDisplay_listAccountingtransactionsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListAccountingtransactionPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AccountingtransactionDisplay_listAccountingtransactionsPage);
    AccountingtransactionDisplay_TransitionTo_listAccountingtransactionsPage(instance, AccountingtransactionDisplay_listAccountingtransactionsPage);
    final DataBinder AccountingtransactionPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Accountingtransaction.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AccountingtransactionPresenter_binder);
    AccountingtransactionPresenter_DataBinder_binder(instance, AccountingtransactionPresenter_binder);
    final TableCell AccountingtransactionDisplay_invoice = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_invoice);
    AccountingtransactionDisplay_TableCell_invoice(instance, AccountingtransactionDisplay_invoice);
    final TableCell AccountingtransactionDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_name);
    AccountingtransactionDisplay_TableCell_name(instance, AccountingtransactionDisplay_name);
    final Span AccountingtransactionDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_lastModifiedDt);
    AccountingtransactionDisplay_Span_lastModifiedDt(instance, AccountingtransactionDisplay_lastModifiedDt);
    final Event AccountingtransactionDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AccountingtransactionDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, AccountingtransactionDisplay_deleteEntityEvent);
    AccountingtransactionDisplay_Event_deleteEntityEvent(instance, AccountingtransactionDisplay_deleteEntityEvent);
    final TableCell AccountingtransactionDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_universe);
    AccountingtransactionDisplay_TableCell_universe(instance, AccountingtransactionDisplay_universe);
    final TableCell AccountingtransactionDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_entityCode);
    AccountingtransactionDisplay_TableCell_entityCode(instance, AccountingtransactionDisplay_entityCode);
    final TableCell AccountingtransactionDisplay_transactionDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_transactionDt);
    AccountingtransactionDisplay_TableCell_transactionDt(instance, AccountingtransactionDisplay_transactionDt);
    final TableCell AccountingtransactionDisplay_fixedAsset = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_fixedAsset);
    AccountingtransactionDisplay_TableCell_fixedAsset(instance, AccountingtransactionDisplay_fixedAsset);
    final TableCell AccountingtransactionDisplay_fromParty = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_fromParty);
    AccountingtransactionDisplay_TableCell_fromParty(instance, AccountingtransactionDisplay_fromParty);
    final Heading AccountingtransactionDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_code);
    AccountingtransactionDisplay_Heading_code(instance, AccountingtransactionDisplay_code);
    final Span AccountingtransactionDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_createdDt);
    AccountingtransactionDisplay_Span_createdDt(instance, AccountingtransactionDisplay_createdDt);
    final TableCell AccountingtransactionDisplay_entryDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AccountingtransactionDisplay_entryDt);
    AccountingtransactionDisplay_TableCell_entryDt(instance, AccountingtransactionDisplay_entryDt);
    final Event AccountingtransactionDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AccountingtransactionDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, AccountingtransactionDisplay_renderEditViewEvent);
    AccountingtransactionDisplay_Event_renderEditViewEvent(instance, AccountingtransactionDisplay_renderEditViewEvent);
    c_c_h_c_l_a_AccountingtransactionDisplayTemplateResource templateForAccountingtransactionDisplay = GWT.create(c_c_h_c_l_a_AccountingtransactionDisplayTemplateResource.class);
    Element parentElementForTemplateOfAccountingtransactionDisplay = TemplateUtil.getRootTemplateParentElement(templateForAccountingtransactionDisplay.getContents().getText(), "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_payment(instance)));
      }
    }, dataFieldElements, "payment");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_fromParty(instance)));
      }
    }, dataFieldElements, "fromParty");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_invoice(instance)));
      }
    }, dataFieldElements, "invoice");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_fixedAsset(instance)));
      }
    }, dataFieldElements, "fixedAsset");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_partyRole(instance)));
      }
    }, dataFieldElements, "partyRole");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_transactionTy(instance)));
      }
    }, dataFieldElements, "transactionTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_transactionDt(instance)));
      }
    }, dataFieldElements, "transactionDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_entryDt(instance)));
      }
    }, dataFieldElements, "entryDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_editAccountingtransactionBtn(instance));
      }
    }, dataFieldElements, "editAccountingtransactionBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_deleteAccountingtransactionBtn(instance));
      }
    }, dataFieldElements, "deleteAccountingtransactionBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com/cloderia/helion/client/local/accountingtransaction/view-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_listAccountingtransactionsPageLink(instance));
      }
    }, dataFieldElements, "listAccountingtransactionsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("payment", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_payment(instance))));
    templateFieldsMap.put("fromParty", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_fromParty(instance))));
    templateFieldsMap.put("invoice", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_invoice(instance))));
    templateFieldsMap.put("fixedAsset", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_fixedAsset(instance))));
    templateFieldsMap.put("partyRole", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_partyRole(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("transactionTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_transactionTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_description(instance))));
    templateFieldsMap.put("transactionDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_transactionDt(instance))));
    templateFieldsMap.put("entryDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionDisplay_TableCell_entryDt(instance))));
    templateFieldsMap.put("editAccountingtransactionBtn", ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_editAccountingtransactionBtn(instance)));
    templateFieldsMap.put("deleteAccountingtransactionBtn", ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_deleteAccountingtransactionBtn(instance)));
    templateFieldsMap.put("listAccountingtransactionsPageLink", ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_listAccountingtransactionsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editAccountingtransactionBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditAccountingtransactionBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteAccountingtransactionBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteAccountingtransactionBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listAccountingtransactionsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = AccountingtransactionPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_payment(instance))), "payment.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_fromParty(instance))), "fromParty.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_invoice(instance))), "invoice.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_fixedAsset(instance))), "fixedAsset.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_partyRole(instance))), "partyRole.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_transactionTy(instance))), "transactionTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_transactionDt(instance))), "transactionDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AccountingtransactionDisplay_TableCell_entryDt(instance))), "entryDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AccountingtransactionDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final AccountingtransactionDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_editAccountingtransactionBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_deleteAccountingtransactionBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AccountingtransactionDisplay_AnchorElement_listAccountingtransactionsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AccountingtransactionDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell AccountingtransactionDisplay_TableCell_description(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::description;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_description(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::description = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_entryDt(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::entryDt;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_entryDt(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::entryDt = value;
  }-*/;

  native static AnchorElement AccountingtransactionDisplay_AnchorElement_listAccountingtransactionsPageLink(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::listAccountingtransactionsPageLink;
  }-*/;

  native static void AccountingtransactionDisplay_AnchorElement_listAccountingtransactionsPageLink(AccountingtransactionDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::listAccountingtransactionsPageLink = value;
  }-*/;

  native static AnchorElement AccountingtransactionDisplay_AnchorElement_editAccountingtransactionBtn(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::editAccountingtransactionBtn;
  }-*/;

  native static void AccountingtransactionDisplay_AnchorElement_editAccountingtransactionBtn(AccountingtransactionDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::editAccountingtransactionBtn = value;
  }-*/;

  native static Div AccountingtransactionDisplay_Div_entityDisplayComponent(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::entityDisplayComponent;
  }-*/;

  native static void AccountingtransactionDisplay_Div_entityDisplayComponent(AccountingtransactionDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::entityDisplayComponent = value;
  }-*/;

  native static Event AccountingtransactionDisplay_Event_deleteEntityEvent(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::deleteEntityEvent;
  }-*/;

  native static void AccountingtransactionDisplay_Event_deleteEntityEvent(AccountingtransactionDisplay instance, Event<AccountingtransactionDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_payment(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::payment;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_payment(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::payment = value;
  }-*/;

  native static AnchorElement AccountingtransactionDisplay_AnchorElement_deleteAccountingtransactionBtn(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::deleteAccountingtransactionBtn;
  }-*/;

  native static void AccountingtransactionDisplay_AnchorElement_deleteAccountingtransactionBtn(AccountingtransactionDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::deleteAccountingtransactionBtn = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_transactionDt(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::transactionDt;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_transactionDt(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::transactionDt = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_fromParty(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::fromParty;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_fromParty(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::fromParty = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_invoice(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::invoice;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_invoice(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::invoice = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_name(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::name;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_name(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::name = value;
  }-*/;

  native static Heading AccountingtransactionDisplay_Heading_code(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::code;
  }-*/;

  native static void AccountingtransactionDisplay_Heading_code(AccountingtransactionDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::code = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_universe(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::universe;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_universe(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::universe = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_entityCode(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::entityCode;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_entityCode(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::entityCode = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_partyRole(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::partyRole;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_partyRole(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::partyRole = value;
  }-*/;

  native static TransitionTo AccountingtransactionDisplay_TransitionTo_listAccountingtransactionsPage(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::listAccountingtransactionsPage;
  }-*/;

  native static void AccountingtransactionDisplay_TransitionTo_listAccountingtransactionsPage(AccountingtransactionDisplay instance, TransitionTo<ListAccountingtransactionPage> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::listAccountingtransactionsPage = value;
  }-*/;

  native static DataBinder AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder;
  }-*/;

  native static void AccountingtransactionPresenter_DataBinder_binder(AccountingtransactionPresenter instance, DataBinder<Accountingtransaction> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter::binder = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_transactionTy(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::transactionTy;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_transactionTy(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::transactionTy = value;
  }-*/;

  native static Span AccountingtransactionDisplay_Span_createdDt(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::createdDt;
  }-*/;

  native static void AccountingtransactionDisplay_Span_createdDt(AccountingtransactionDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::createdDt = value;
  }-*/;

  native static Event AccountingtransactionDisplay_Event_renderEditViewEvent(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::renderEditViewEvent;
  }-*/;

  native static void AccountingtransactionDisplay_Event_renderEditViewEvent(AccountingtransactionDisplay instance, Event<AccountingtransactionDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::renderEditViewEvent = value;
  }-*/;

  native static Span AccountingtransactionDisplay_Span_lastModifiedDt(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::lastModifiedDt;
  }-*/;

  native static void AccountingtransactionDisplay_Span_lastModifiedDt(AccountingtransactionDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell AccountingtransactionDisplay_TableCell_fixedAsset(AccountingtransactionDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::fixedAsset;
  }-*/;

  native static void AccountingtransactionDisplay_TableCell_fixedAsset(AccountingtransactionDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay::fixedAsset = value;
  }-*/;
}
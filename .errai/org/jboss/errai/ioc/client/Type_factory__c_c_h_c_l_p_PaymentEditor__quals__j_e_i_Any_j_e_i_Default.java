package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.payment.ListPaymentPage;
import com.cloderia.helion.client.local.payment.PaymentEditor;
import com.cloderia.helion.client.local.payment.PaymentPresenter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Payment;
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

public class Type_factory__c_c_h_c_l_p_PaymentEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PaymentEditor.class, "Type_factory__c_c_h_c_l_p_PaymentEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PaymentEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/payment/edit-payment-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PaymentEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PaymentEditor.class);
    handle.addAssignableType(PaymentPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PaymentEditor createInstance(final ContextManager contextManager) {
    final PaymentEditor instance = new PaymentEditor();
    setIncompleteInstance(instance);
    final TextBox PaymentEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_name);
    PaymentEditor_TextBox_name(instance, PaymentEditor_name);
    final TextBox PaymentEditor_amount = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_amount);
    PaymentEditor_TextBox_amount(instance, PaymentEditor_amount);
    final DataBinder PaymentPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Payment.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PaymentPresenter_binder);
    PaymentPresenter_DataBinder_binder(instance, PaymentPresenter_binder);
    final Event PaymentEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PaymentEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, PaymentEditor_editEntityEvent);
    PaymentEditor_Event_editEntityEvent(instance, PaymentEditor_editEntityEvent);
    final ListBox PaymentEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_universe);
    PaymentEditor_ListBox_universe(instance, PaymentEditor_universe);
    final Div PaymentEditor_paymentEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentEditor_paymentEditor);
    PaymentEditor_Div_paymentEditor(instance, PaymentEditor_paymentEditor);
    final TextBox PaymentEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_description);
    PaymentEditor_TextBox_description(instance, PaymentEditor_description);
    final Event PaymentEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PaymentEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, PaymentEditor_createEntityEvent);
    PaymentEditor_Event_createEntityEvent(instance, PaymentEditor_createEntityEvent);
    final ListBox PaymentEditor_paymentTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_paymentTy);
    PaymentEditor_ListBox_paymentTy(instance, PaymentEditor_paymentTy);
    final TextBox PaymentEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_entityCode);
    PaymentEditor_TextBox_entityCode(instance, PaymentEditor_entityCode);
    final TextBox PaymentEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_effectiveDt);
    PaymentEditor_TextBox_effectiveDt(instance, PaymentEditor_effectiveDt);
    final TransitionTo PaymentEditor_listPaymentsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPaymentPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PaymentEditor_listPaymentsPage);
    PaymentEditor_TransitionTo_listPaymentsPage(instance, PaymentEditor_listPaymentsPage);
    final ListBox PaymentEditor_methodTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_methodTy);
    PaymentEditor_ListBox_methodTy(instance, PaymentEditor_methodTy);
    final ListBox PaymentEditor_finAcct = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PaymentEditor_finAcct);
    PaymentEditor_ListBox_finAcct(instance, PaymentEditor_finAcct);
    c_c_h_c_l_p_PaymentEditorTemplateResource templateForPaymentEditor = GWT.create(c_c_h_c_l_p_PaymentEditorTemplateResource.class);
    Element parentElementForTemplateOfPaymentEditor = TemplateUtil.getRootTemplateParentElement(templateForPaymentEditor.getContents().getText(), "com/cloderia/helion/client/local/payment/edit-payment-page.html", "paymentEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/payment/edit-payment-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentEditor_Div_paymentEditor(instance)));
      }
    }, dataFieldElements, "paymentEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_ListBox_paymentTy(instance).asWidget();
      }
    }, dataFieldElements, "paymentTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_ListBox_methodTy(instance).asWidget();
      }
    }, dataFieldElements, "methodTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_ListBox_finAcct(instance).asWidget();
      }
    }, dataFieldElements, "finAcct");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_TextBox_amount(instance).asWidget();
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PaymentEditor_Button_editPaymentBtn(instance).asWidget();
      }
    }, dataFieldElements, "editPaymentBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentEditor", "com/cloderia/helion/client/local/payment/edit-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PaymentEditor_AnchorElement_listPaymentsPageLink(instance));
      }
    }, dataFieldElements, "listPaymentsPageLink");
    templateFieldsMap.put("paymentEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentEditor_Div_paymentEditor(instance))));
    templateFieldsMap.put("paymentTy", PaymentEditor_ListBox_paymentTy(instance).asWidget());
    templateFieldsMap.put("universe", PaymentEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("methodTy", PaymentEditor_ListBox_methodTy(instance).asWidget());
    templateFieldsMap.put("finAcct", PaymentEditor_ListBox_finAcct(instance).asWidget());
    templateFieldsMap.put("entityCode", PaymentEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", PaymentEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", PaymentEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("amount", PaymentEditor_TextBox_amount(instance).asWidget());
    templateFieldsMap.put("effectiveDt", PaymentEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editPaymentBtn", PaymentEditor_Button_editPaymentBtn(instance).asWidget());
    templateFieldsMap.put("listPaymentsPageLink", ElementWrapperWidget.getWidget(PaymentEditor_AnchorElement_listPaymentsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editPaymentBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editPayment(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPaymentsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PaymentPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.payment.PaymentEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PaymentEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PaymentEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PaymentEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(PaymentEditor_TextBox_amount(instance), "amount", Convert.getConverter(BigDecimal.class, String.class), null, false);
    binder.bind(PaymentEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PaymentEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final PaymentEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PaymentEditor_AnchorElement_listPaymentsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PaymentEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TransitionTo PaymentEditor_TransitionTo_listPaymentsPage(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::listPaymentsPage;
  }-*/;

  native static void PaymentEditor_TransitionTo_listPaymentsPage(PaymentEditor instance, TransitionTo<ListPaymentPage> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::listPaymentsPage = value;
  }-*/;

  native static TextBox PaymentEditor_TextBox_entityCode(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::entityCode;
  }-*/;

  native static void PaymentEditor_TextBox_entityCode(PaymentEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::entityCode = value;
  }-*/;

  native static Div PaymentEditor_Div_paymentEditor(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::paymentEditor;
  }-*/;

  native static void PaymentEditor_Div_paymentEditor(PaymentEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::paymentEditor = value;
  }-*/;

  native static TextBox PaymentEditor_TextBox_name(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::name;
  }-*/;

  native static void PaymentEditor_TextBox_name(PaymentEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::name = value;
  }-*/;

  native static Event PaymentEditor_Event_editEntityEvent(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::editEntityEvent;
  }-*/;

  native static void PaymentEditor_Event_editEntityEvent(PaymentEditor instance, Event<PaymentEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::editEntityEvent = value;
  }-*/;

  native static ListBox PaymentEditor_ListBox_paymentTy(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::paymentTy;
  }-*/;

  native static void PaymentEditor_ListBox_paymentTy(PaymentEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::paymentTy = value;
  }-*/;

  native static TextBox PaymentEditor_TextBox_effectiveDt(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::effectiveDt;
  }-*/;

  native static void PaymentEditor_TextBox_effectiveDt(PaymentEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::effectiveDt = value;
  }-*/;

  native static AnchorElement PaymentEditor_AnchorElement_listPaymentsPageLink(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::listPaymentsPageLink;
  }-*/;

  native static void PaymentEditor_AnchorElement_listPaymentsPageLink(PaymentEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::listPaymentsPageLink = value;
  }-*/;

  native static Event PaymentEditor_Event_createEntityEvent(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::createEntityEvent;
  }-*/;

  native static void PaymentEditor_Event_createEntityEvent(PaymentEditor instance, Event<PaymentEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::createEntityEvent = value;
  }-*/;

  native static ListBox PaymentEditor_ListBox_methodTy(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::methodTy;
  }-*/;

  native static void PaymentEditor_ListBox_methodTy(PaymentEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::methodTy = value;
  }-*/;

  native static TextBox PaymentEditor_TextBox_description(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::description;
  }-*/;

  native static void PaymentEditor_TextBox_description(PaymentEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::description = value;
  }-*/;

  native static DataBinder PaymentPresenter_DataBinder_binder(PaymentPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder;
  }-*/;

  native static void PaymentPresenter_DataBinder_binder(PaymentPresenter instance, DataBinder<Payment> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder = value;
  }-*/;

  native static ListBox PaymentEditor_ListBox_finAcct(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::finAcct;
  }-*/;

  native static void PaymentEditor_ListBox_finAcct(PaymentEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::finAcct = value;
  }-*/;

  native static TextBox PaymentEditor_TextBox_amount(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::amount;
  }-*/;

  native static void PaymentEditor_TextBox_amount(PaymentEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::amount = value;
  }-*/;

  native static Button PaymentEditor_Button_editPaymentBtn(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::editPaymentBtn;
  }-*/;

  native static void PaymentEditor_Button_editPaymentBtn(PaymentEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::editPaymentBtn = value;
  }-*/;

  native static ListBox PaymentEditor_ListBox_universe(PaymentEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentEditor::universe;
  }-*/;

  native static void PaymentEditor_ListBox_universe(PaymentEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentEditor::universe = value;
  }-*/;
}
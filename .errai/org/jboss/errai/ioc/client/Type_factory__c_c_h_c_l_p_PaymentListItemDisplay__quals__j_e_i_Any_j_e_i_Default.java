package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.payment.PaymentListItemDisplay;
import com.cloderia.helion.client.local.payment.PaymentPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Payment;
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

public class Type_factory__c_c_h_c_l_p_PaymentListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PaymentListItemDisplay.class, "Type_factory__c_c_h_c_l_p_PaymentListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PaymentListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/payment/list-payment-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PaymentListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PaymentListItemDisplay.class);
    handle.addAssignableType(PaymentPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PaymentListItemDisplay createInstance(final ContextManager contextManager) {
    final PaymentListItemDisplay instance = new PaymentListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell PaymentListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_name);
    PaymentListItemDisplay_TableCell_name(instance, PaymentListItemDisplay_name);
    final TableCell PaymentListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_description);
    PaymentListItemDisplay_TableCell_description(instance, PaymentListItemDisplay_description);
    final DataBinder PaymentPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Payment.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PaymentPresenter_binder);
    PaymentPresenter_DataBinder_binder(instance, PaymentPresenter_binder);
    final TableRow PaymentListItemDisplay_paymentItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_paymentItem);
    PaymentListItemDisplay_TableRow_paymentItem(instance, PaymentListItemDisplay_paymentItem);
    final TableCell PaymentListItemDisplay_methodTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_methodTy);
    PaymentListItemDisplay_TableCell_methodTy(instance, PaymentListItemDisplay_methodTy);
    final Event PaymentListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PaymentListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PaymentListItemDisplay_renderEditViewEvent);
    PaymentListItemDisplay_Event_renderEditViewEvent(instance, PaymentListItemDisplay_renderEditViewEvent);
    final Event PaymentListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PaymentListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PaymentListItemDisplay_deleteEntityEvent);
    PaymentListItemDisplay_Event_deleteEntityEvent(instance, PaymentListItemDisplay_deleteEntityEvent);
    final TableCell PaymentListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_entityCode);
    PaymentListItemDisplay_TableCell_entityCode(instance, PaymentListItemDisplay_entityCode);
    final TableCell PaymentListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_effectiveDt);
    PaymentListItemDisplay_TableCell_effectiveDt(instance, PaymentListItemDisplay_effectiveDt);
    final TableCell PaymentListItemDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_amount);
    PaymentListItemDisplay_TableCell_amount(instance, PaymentListItemDisplay_amount);
    final Event PaymentListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PaymentListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, PaymentListItemDisplay_renderSingleViewEvent);
    PaymentListItemDisplay_Event_renderSingleViewEvent(instance, PaymentListItemDisplay_renderSingleViewEvent);
    final AnchorElement PaymentListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_deleteEntityListItemBtn);
    PaymentListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, PaymentListItemDisplay_deleteEntityListItemBtn);
    final TableCell PaymentListItemDisplay_paymentTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_paymentTy);
    PaymentListItemDisplay_TableCell_paymentTy(instance, PaymentListItemDisplay_paymentTy);
    final TableCell PaymentListItemDisplay_finAcct = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_finAcct);
    PaymentListItemDisplay_TableCell_finAcct(instance, PaymentListItemDisplay_finAcct);
    final AnchorElement PaymentListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentListItemDisplay_editEntityListItemBtn);
    PaymentListItemDisplay_AnchorElement_editEntityListItemBtn(instance, PaymentListItemDisplay_editEntityListItemBtn);
    c_c_h_c_l_p_PaymentListItemDisplayTemplateResource templateForPaymentListItemDisplay = GWT.create(c_c_h_c_l_p_PaymentListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfPaymentListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForPaymentListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/payment/list-payment-page.html", "paymentItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/payment/list-payment-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableRow_paymentItem(instance)));
      }
    }, dataFieldElements, "paymentItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_paymentTy(instance)));
      }
    }, dataFieldElements, "paymentTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_methodTy(instance)));
      }
    }, dataFieldElements, "methodTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_finAcct(instance)));
      }
    }, dataFieldElements, "finAcct");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PaymentListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com/cloderia/helion/client/local/payment/list-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PaymentListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("paymentItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableRow_paymentItem(instance))));
    templateFieldsMap.put("paymentTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_paymentTy(instance))));
    templateFieldsMap.put("methodTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_methodTy(instance))));
    templateFieldsMap.put("finAcct", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_finAcct(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(PaymentListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(PaymentListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = PaymentPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.payment.PaymentListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_paymentTy(instance))), "paymentTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_methodTy(instance))), "methodTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_finAcct(instance))), "finAcct.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PaymentListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PaymentListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PaymentListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PaymentListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PaymentListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event PaymentListItemDisplay_Event_deleteEntityEvent(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void PaymentListItemDisplay_Event_deleteEntityEvent(PaymentListItemDisplay instance, Event<PaymentListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static Event PaymentListItemDisplay_Event_renderSingleViewEvent(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void PaymentListItemDisplay_Event_renderSingleViewEvent(PaymentListItemDisplay instance, Event<PaymentListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static AnchorElement PaymentListItemDisplay_AnchorElement_editEntityListItemBtn(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void PaymentListItemDisplay_AnchorElement_editEntityListItemBtn(PaymentListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_amount(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::amount;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_amount(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::amount = value;
  }-*/;

  native static TableRow PaymentListItemDisplay_TableRow_paymentItem(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::paymentItem;
  }-*/;

  native static void PaymentListItemDisplay_TableRow_paymentItem(PaymentListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::paymentItem = value;
  }-*/;

  native static AnchorElement PaymentListItemDisplay_AnchorElement_deleteEntityListItemBtn(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void PaymentListItemDisplay_AnchorElement_deleteEntityListItemBtn(PaymentListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_effectiveDt(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::effectiveDt;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_effectiveDt(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_methodTy(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::methodTy;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_methodTy(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::methodTy = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_finAcct(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::finAcct;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_finAcct(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::finAcct = value;
  }-*/;

  native static DataBinder PaymentPresenter_DataBinder_binder(PaymentPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder;
  }-*/;

  native static void PaymentPresenter_DataBinder_binder(PaymentPresenter instance, DataBinder<Payment> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_description(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::description;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_description(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::description = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_entityCode(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::entityCode;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_entityCode(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_name(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::name;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_name(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::name = value;
  }-*/;

  native static Event PaymentListItemDisplay_Event_renderEditViewEvent(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void PaymentListItemDisplay_Event_renderEditViewEvent(PaymentListItemDisplay instance, Event<PaymentListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell PaymentListItemDisplay_TableCell_paymentTy(PaymentListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::paymentTy;
  }-*/;

  native static void PaymentListItemDisplay_TableCell_paymentTy(PaymentListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentListItemDisplay::paymentTy = value;
  }-*/;
}
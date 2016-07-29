package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.payment.ListPaymentPage;
import com.cloderia.helion.client.local.payment.PaymentDisplay;
import com.cloderia.helion.client.local.payment.PaymentPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_p_PaymentDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PaymentDisplay.class, "Type_factory__c_c_h_c_l_p_PaymentDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PaymentDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/payment/view-payment-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PaymentDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PaymentDisplay.class);
    handle.addAssignableType(PaymentPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PaymentDisplay createInstance(final ContextManager contextManager) {
    final PaymentDisplay instance = new PaymentDisplay();
    setIncompleteInstance(instance);
    final TableCell PaymentDisplay_paymentTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_paymentTy);
    PaymentDisplay_TableCell_paymentTy(instance, PaymentDisplay_paymentTy);
    final TableCell PaymentDisplay_methodTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_methodTy);
    PaymentDisplay_TableCell_methodTy(instance, PaymentDisplay_methodTy);
    final TableCell PaymentDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_entityCode);
    PaymentDisplay_TableCell_entityCode(instance, PaymentDisplay_entityCode);
    final Heading PaymentDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, PaymentDisplay_code);
    PaymentDisplay_Heading_code(instance, PaymentDisplay_code);
    final DataBinder PaymentPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Payment.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PaymentPresenter_binder);
    PaymentPresenter_DataBinder_binder(instance, PaymentPresenter_binder);
    final TableCell PaymentDisplay_finAcct = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_finAcct);
    PaymentDisplay_TableCell_finAcct(instance, PaymentDisplay_finAcct);
    final Event PaymentDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PaymentDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PaymentDisplay_deleteEntityEvent);
    PaymentDisplay_Event_deleteEntityEvent(instance, PaymentDisplay_deleteEntityEvent);
    final TableCell PaymentDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_name);
    PaymentDisplay_TableCell_name(instance, PaymentDisplay_name);
    final TableCell PaymentDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_amount);
    PaymentDisplay_TableCell_amount(instance, PaymentDisplay_amount);
    final TransitionTo PaymentDisplay_listPaymentsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPaymentPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PaymentDisplay_listPaymentsPage);
    PaymentDisplay_TransitionTo_listPaymentsPage(instance, PaymentDisplay_listPaymentsPage);
    final Span PaymentDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_lastModifiedDt);
    PaymentDisplay_Span_lastModifiedDt(instance, PaymentDisplay_lastModifiedDt);
    final Span PaymentDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_createdDt);
    PaymentDisplay_Span_createdDt(instance, PaymentDisplay_createdDt);
    final Div PaymentDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_entityDisplayComponent);
    PaymentDisplay_Div_entityDisplayComponent(instance, PaymentDisplay_entityDisplayComponent);
    final TableCell PaymentDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_universe);
    PaymentDisplay_TableCell_universe(instance, PaymentDisplay_universe);
    final Event PaymentDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PaymentDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PaymentDisplay_renderEditViewEvent);
    PaymentDisplay_Event_renderEditViewEvent(instance, PaymentDisplay_renderEditViewEvent);
    final TableCell PaymentDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_description);
    PaymentDisplay_TableCell_description(instance, PaymentDisplay_description);
    final TableCell PaymentDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PaymentDisplay_effectiveDt);
    PaymentDisplay_TableCell_effectiveDt(instance, PaymentDisplay_effectiveDt);
    c_c_h_c_l_p_PaymentDisplayTemplateResource templateForPaymentDisplay = GWT.create(c_c_h_c_l_p_PaymentDisplayTemplateResource.class);
    Element parentElementForTemplateOfPaymentDisplay = TemplateUtil.getRootTemplateParentElement(templateForPaymentDisplay.getContents().getText(), "com/cloderia/helion/client/local/payment/view-payment-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/payment/view-payment-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_paymentTy(instance)));
      }
    }, dataFieldElements, "paymentTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_methodTy(instance)));
      }
    }, dataFieldElements, "methodTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_finAcct(instance)));
      }
    }, dataFieldElements, "finAcct");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_editPaymentBtn(instance));
      }
    }, dataFieldElements, "editPaymentBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_deletePaymentBtn(instance));
      }
    }, dataFieldElements, "deletePaymentBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.payment.PaymentDisplay", "com/cloderia/helion/client/local/payment/view-payment-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_listPaymentsPageLink(instance));
      }
    }, dataFieldElements, "listPaymentsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("paymentTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_paymentTy(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("methodTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_methodTy(instance))));
    templateFieldsMap.put("finAcct", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_finAcct(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_description(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PaymentDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editPaymentBtn", ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_editPaymentBtn(instance)));
    templateFieldsMap.put("deletePaymentBtn", ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_deletePaymentBtn(instance)));
    templateFieldsMap.put("listPaymentsPageLink", ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_listPaymentsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPaymentDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editPaymentBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditPaymentBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deletePaymentBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeletePaymentBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPaymentsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PaymentPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.payment.PaymentDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_paymentTy(instance))), "paymentTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_methodTy(instance))), "methodTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_finAcct(instance))), "finAcct.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PaymentDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PaymentDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PaymentDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_editPaymentBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_deletePaymentBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PaymentDisplay_AnchorElement_listPaymentsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PaymentDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span PaymentDisplay_Span_lastModifiedDt(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::lastModifiedDt;
  }-*/;

  native static void PaymentDisplay_Span_lastModifiedDt(PaymentDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_universe(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::universe;
  }-*/;

  native static void PaymentDisplay_TableCell_universe(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::universe = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_name(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::name;
  }-*/;

  native static void PaymentDisplay_TableCell_name(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::name = value;
  }-*/;

  native static Heading PaymentDisplay_Heading_code(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::code;
  }-*/;

  native static void PaymentDisplay_Heading_code(PaymentDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::code = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_finAcct(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::finAcct;
  }-*/;

  native static void PaymentDisplay_TableCell_finAcct(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::finAcct = value;
  }-*/;

  native static Event PaymentDisplay_Event_renderEditViewEvent(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::renderEditViewEvent;
  }-*/;

  native static void PaymentDisplay_Event_renderEditViewEvent(PaymentDisplay instance, Event<PaymentDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement PaymentDisplay_AnchorElement_listPaymentsPageLink(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::listPaymentsPageLink;
  }-*/;

  native static void PaymentDisplay_AnchorElement_listPaymentsPageLink(PaymentDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::listPaymentsPageLink = value;
  }-*/;

  native static AnchorElement PaymentDisplay_AnchorElement_editPaymentBtn(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::editPaymentBtn;
  }-*/;

  native static void PaymentDisplay_AnchorElement_editPaymentBtn(PaymentDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::editPaymentBtn = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_entityCode(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::entityCode;
  }-*/;

  native static void PaymentDisplay_TableCell_entityCode(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::entityCode = value;
  }-*/;

  native static AnchorElement PaymentDisplay_AnchorElement_deletePaymentBtn(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::deletePaymentBtn;
  }-*/;

  native static void PaymentDisplay_AnchorElement_deletePaymentBtn(PaymentDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::deletePaymentBtn = value;
  }-*/;

  native static Span PaymentDisplay_Span_createdDt(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::createdDt;
  }-*/;

  native static void PaymentDisplay_Span_createdDt(PaymentDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::createdDt = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_effectiveDt(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::effectiveDt;
  }-*/;

  native static void PaymentDisplay_TableCell_effectiveDt(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::effectiveDt = value;
  }-*/;

  native static DataBinder PaymentPresenter_DataBinder_binder(PaymentPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder;
  }-*/;

  native static void PaymentPresenter_DataBinder_binder(PaymentPresenter instance, DataBinder<Payment> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentPresenter::binder = value;
  }-*/;

  native static TransitionTo PaymentDisplay_TransitionTo_listPaymentsPage(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::listPaymentsPage;
  }-*/;

  native static void PaymentDisplay_TransitionTo_listPaymentsPage(PaymentDisplay instance, TransitionTo<ListPaymentPage> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::listPaymentsPage = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_methodTy(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::methodTy;
  }-*/;

  native static void PaymentDisplay_TableCell_methodTy(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::methodTy = value;
  }-*/;

  native static Event PaymentDisplay_Event_deleteEntityEvent(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::deleteEntityEvent;
  }-*/;

  native static void PaymentDisplay_Event_deleteEntityEvent(PaymentDisplay instance, Event<PaymentDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::deleteEntityEvent = value;
  }-*/;

  native static Div PaymentDisplay_Div_entityDisplayComponent(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::entityDisplayComponent;
  }-*/;

  native static void PaymentDisplay_Div_entityDisplayComponent(PaymentDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_paymentTy(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::paymentTy;
  }-*/;

  native static void PaymentDisplay_TableCell_paymentTy(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::paymentTy = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_description(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::description;
  }-*/;

  native static void PaymentDisplay_TableCell_description(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::description = value;
  }-*/;

  native static TableCell PaymentDisplay_TableCell_amount(PaymentDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::amount;
  }-*/;

  native static void PaymentDisplay_TableCell_amount(PaymentDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.payment.PaymentDisplay::amount = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay;
import com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter;
import com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Billingaccount;
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

public class Type_factory__c_c_h_c_l_b_BillingaccountDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BillingaccountDisplay.class, "Type_factory__c_c_h_c_l_b_BillingaccountDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BillingaccountDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BillingaccountDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BillingaccountDisplay.class);
    handle.addAssignableType(BillingaccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BillingaccountDisplay createInstance(final ContextManager contextManager) {
    final BillingaccountDisplay instance = new BillingaccountDisplay();
    setIncompleteInstance(instance);
    final TableCell BillingaccountDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_description);
    BillingaccountDisplay_TableCell_description(instance, BillingaccountDisplay_description);
    final TableCell BillingaccountDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_entityCode);
    BillingaccountDisplay_TableCell_entityCode(instance, BillingaccountDisplay_entityCode);
    final Event BillingaccountDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BillingaccountDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, BillingaccountDisplay_deleteEntityEvent);
    BillingaccountDisplay_Event_deleteEntityEvent(instance, BillingaccountDisplay_deleteEntityEvent);
    final Div BillingaccountDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_entityDisplayComponent);
    BillingaccountDisplay_Div_entityDisplayComponent(instance, BillingaccountDisplay_entityDisplayComponent);
    final DataBinder BillingaccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Billingaccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BillingaccountPresenter_binder);
    BillingaccountPresenter_DataBinder_binder(instance, BillingaccountPresenter_binder);
    final Event BillingaccountDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BillingaccountDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, BillingaccountDisplay_renderEditViewEvent);
    BillingaccountDisplay_Event_renderEditViewEvent(instance, BillingaccountDisplay_renderEditViewEvent);
    final TableCell BillingaccountDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_universe);
    BillingaccountDisplay_TableCell_universe(instance, BillingaccountDisplay_universe);
    final Span BillingaccountDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_lastModifiedDt);
    BillingaccountDisplay_Span_lastModifiedDt(instance, BillingaccountDisplay_lastModifiedDt);
    final TableCell BillingaccountDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_toDt);
    BillingaccountDisplay_TableCell_toDt(instance, BillingaccountDisplay_toDt);
    final Span BillingaccountDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_createdDt);
    BillingaccountDisplay_Span_createdDt(instance, BillingaccountDisplay_createdDt);
    final TableCell BillingaccountDisplay_toContMech = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_toContMech);
    BillingaccountDisplay_TableCell_toContMech(instance, BillingaccountDisplay_toContMech);
    final TableCell BillingaccountDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_name);
    BillingaccountDisplay_TableCell_name(instance, BillingaccountDisplay_name);
    final TableCell BillingaccountDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountDisplay_fromDt);
    BillingaccountDisplay_TableCell_fromDt(instance, BillingaccountDisplay_fromDt);
    final Heading BillingaccountDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, BillingaccountDisplay_code);
    BillingaccountDisplay_Heading_code(instance, BillingaccountDisplay_code);
    final TransitionTo BillingaccountDisplay_listBillingaccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBillingaccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BillingaccountDisplay_listBillingaccountsPage);
    BillingaccountDisplay_TransitionTo_listBillingaccountsPage(instance, BillingaccountDisplay_listBillingaccountsPage);
    c_c_h_c_l_b_BillingaccountDisplayTemplateResource templateForBillingaccountDisplay = GWT.create(c_c_h_c_l_b_BillingaccountDisplayTemplateResource.class);
    Element parentElementForTemplateOfBillingaccountDisplay = TemplateUtil.getRootTemplateParentElement(templateForBillingaccountDisplay.getContents().getText(), "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_toContMech(instance)));
      }
    }, dataFieldElements, "toContMech");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_editBillingaccountBtn(instance));
      }
    }, dataFieldElements, "editBillingaccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_deleteBillingaccountBtn(instance));
      }
    }, dataFieldElements, "deleteBillingaccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com/cloderia/helion/client/local/billingaccount/view-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_listBillingaccountsPageLink(instance));
      }
    }, dataFieldElements, "listBillingaccountsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("toContMech", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_toContMech(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_description(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editBillingaccountBtn", ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_editBillingaccountBtn(instance)));
    templateFieldsMap.put("deleteBillingaccountBtn", ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_deleteBillingaccountBtn(instance)));
    templateFieldsMap.put("listBillingaccountsPageLink", ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_listBillingaccountsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editBillingaccountBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditBillingaccountBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteBillingaccountBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteBillingaccountBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBillingaccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = BillingaccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_TableCell_toContMech(instance))), "toContMech.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BillingaccountDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BillingaccountDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final BillingaccountDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_editBillingaccountBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_deleteBillingaccountBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BillingaccountDisplay_AnchorElement_listBillingaccountsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BillingaccountDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span BillingaccountDisplay_Span_lastModifiedDt(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::lastModifiedDt;
  }-*/;

  native static void BillingaccountDisplay_Span_lastModifiedDt(BillingaccountDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell BillingaccountDisplay_TableCell_entityCode(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::entityCode;
  }-*/;

  native static void BillingaccountDisplay_TableCell_entityCode(BillingaccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::entityCode = value;
  }-*/;

  native static Event BillingaccountDisplay_Event_renderEditViewEvent(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::renderEditViewEvent;
  }-*/;

  native static void BillingaccountDisplay_Event_renderEditViewEvent(BillingaccountDisplay instance, Event<BillingaccountDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement BillingaccountDisplay_AnchorElement_listBillingaccountsPageLink(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::listBillingaccountsPageLink;
  }-*/;

  native static void BillingaccountDisplay_AnchorElement_listBillingaccountsPageLink(BillingaccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::listBillingaccountsPageLink = value;
  }-*/;

  native static Div BillingaccountDisplay_Div_entityDisplayComponent(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::entityDisplayComponent;
  }-*/;

  native static void BillingaccountDisplay_Div_entityDisplayComponent(BillingaccountDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::entityDisplayComponent = value;
  }-*/;

  native static TransitionTo BillingaccountDisplay_TransitionTo_listBillingaccountsPage(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::listBillingaccountsPage;
  }-*/;

  native static void BillingaccountDisplay_TransitionTo_listBillingaccountsPage(BillingaccountDisplay instance, TransitionTo<ListBillingaccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::listBillingaccountsPage = value;
  }-*/;

  native static Span BillingaccountDisplay_Span_createdDt(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::createdDt;
  }-*/;

  native static void BillingaccountDisplay_Span_createdDt(BillingaccountDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::createdDt = value;
  }-*/;

  native static TableCell BillingaccountDisplay_TableCell_universe(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::universe;
  }-*/;

  native static void BillingaccountDisplay_TableCell_universe(BillingaccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::universe = value;
  }-*/;

  native static TableCell BillingaccountDisplay_TableCell_toContMech(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::toContMech;
  }-*/;

  native static void BillingaccountDisplay_TableCell_toContMech(BillingaccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::toContMech = value;
  }-*/;

  native static AnchorElement BillingaccountDisplay_AnchorElement_deleteBillingaccountBtn(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::deleteBillingaccountBtn;
  }-*/;

  native static void BillingaccountDisplay_AnchorElement_deleteBillingaccountBtn(BillingaccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::deleteBillingaccountBtn = value;
  }-*/;

  native static TableCell BillingaccountDisplay_TableCell_name(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::name;
  }-*/;

  native static void BillingaccountDisplay_TableCell_name(BillingaccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::name = value;
  }-*/;

  native static TableCell BillingaccountDisplay_TableCell_fromDt(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::fromDt;
  }-*/;

  native static void BillingaccountDisplay_TableCell_fromDt(BillingaccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::fromDt = value;
  }-*/;

  native static TableCell BillingaccountDisplay_TableCell_toDt(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::toDt;
  }-*/;

  native static void BillingaccountDisplay_TableCell_toDt(BillingaccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::toDt = value;
  }-*/;

  native static AnchorElement BillingaccountDisplay_AnchorElement_editBillingaccountBtn(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::editBillingaccountBtn;
  }-*/;

  native static void BillingaccountDisplay_AnchorElement_editBillingaccountBtn(BillingaccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::editBillingaccountBtn = value;
  }-*/;

  native static DataBinder BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder;
  }-*/;

  native static void BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance, DataBinder<Billingaccount> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder = value;
  }-*/;

  native static Heading BillingaccountDisplay_Heading_code(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::code;
  }-*/;

  native static void BillingaccountDisplay_Heading_code(BillingaccountDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::code = value;
  }-*/;

  native static TableCell BillingaccountDisplay_TableCell_description(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::description;
  }-*/;

  native static void BillingaccountDisplay_TableCell_description(BillingaccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::description = value;
  }-*/;

  native static Event BillingaccountDisplay_Event_deleteEntityEvent(BillingaccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::deleteEntityEvent;
  }-*/;

  native static void BillingaccountDisplay_Event_deleteEntityEvent(BillingaccountDisplay instance, Event<BillingaccountDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay::deleteEntityEvent = value;
  }-*/;
}
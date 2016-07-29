package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationglaccountbalance.ListOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
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

public class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationglaccountbalanceDisplay.class, "Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationglaccountbalanceDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationglaccountbalanceDisplay.class);
    handle.addAssignableType(OrganizationglaccountbalancePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationglaccountbalanceDisplay createInstance(final ContextManager contextManager) {
    final OrganizationglaccountbalanceDisplay instance = new OrganizationglaccountbalanceDisplay();
    setIncompleteInstance(instance);
    final TableCell OrganizationglaccountbalanceDisplay_accountingPeriod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_accountingPeriod);
    OrganizationglaccountbalanceDisplay_TableCell_accountingPeriod(instance, OrganizationglaccountbalanceDisplay_accountingPeriod);
    final TableCell OrganizationglaccountbalanceDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_effectiveDt);
    OrganizationglaccountbalanceDisplay_TableCell_effectiveDt(instance, OrganizationglaccountbalanceDisplay_effectiveDt);
    final TableCell OrganizationglaccountbalanceDisplay_glAccount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_glAccount);
    OrganizationglaccountbalanceDisplay_TableCell_glAccount(instance, OrganizationglaccountbalanceDisplay_glAccount);
    final TransitionTo OrganizationglaccountbalanceDisplay_listOrganizationglaccountbalancesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationglaccountbalancePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_listOrganizationglaccountbalancesPage);
    OrganizationglaccountbalanceDisplay_TransitionTo_listOrganizationglaccountbalancesPage(instance, OrganizationglaccountbalanceDisplay_listOrganizationglaccountbalancesPage);
    final TableCell OrganizationglaccountbalanceDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_amount);
    OrganizationglaccountbalanceDisplay_TableCell_amount(instance, OrganizationglaccountbalanceDisplay_amount);
    final Div OrganizationglaccountbalanceDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_entityDisplayComponent);
    OrganizationglaccountbalanceDisplay_Div_entityDisplayComponent(instance, OrganizationglaccountbalanceDisplay_entityDisplayComponent);
    final Heading OrganizationglaccountbalanceDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_code);
    OrganizationglaccountbalanceDisplay_Heading_code(instance, OrganizationglaccountbalanceDisplay_code);
    final TableCell OrganizationglaccountbalanceDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_universe);
    OrganizationglaccountbalanceDisplay_TableCell_universe(instance, OrganizationglaccountbalanceDisplay_universe);
    final Span OrganizationglaccountbalanceDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_createdDt);
    OrganizationglaccountbalanceDisplay_Span_createdDt(instance, OrganizationglaccountbalanceDisplay_createdDt);
    final Event OrganizationglaccountbalanceDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationglaccountbalanceDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_deleteEntityEvent);
    OrganizationglaccountbalanceDisplay_Event_deleteEntityEvent(instance, OrganizationglaccountbalanceDisplay_deleteEntityEvent);
    final Event OrganizationglaccountbalanceDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationglaccountbalanceDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_renderEditViewEvent);
    OrganizationglaccountbalanceDisplay_Event_renderEditViewEvent(instance, OrganizationglaccountbalanceDisplay_renderEditViewEvent);
    final DataBinder OrganizationglaccountbalancePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationglaccountbalance.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationglaccountbalancePresenter_binder);
    OrganizationglaccountbalancePresenter_DataBinder_binder(instance, OrganizationglaccountbalancePresenter_binder);
    final Span OrganizationglaccountbalanceDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_lastModifiedDt);
    OrganizationglaccountbalanceDisplay_Span_lastModifiedDt(instance, OrganizationglaccountbalanceDisplay_lastModifiedDt);
    final TableCell OrganizationglaccountbalanceDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceDisplay_entityCode);
    OrganizationglaccountbalanceDisplay_TableCell_entityCode(instance, OrganizationglaccountbalanceDisplay_entityCode);
    c_c_h_c_l_o_OrganizationglaccountbalanceDisplayTemplateResource templateForOrganizationglaccountbalanceDisplay = GWT.create(c_c_h_c_l_o_OrganizationglaccountbalanceDisplayTemplateResource.class);
    Element parentElementForTemplateOfOrganizationglaccountbalanceDisplay = TemplateUtil.getRootTemplateParentElement(templateForOrganizationglaccountbalanceDisplay.getContents().getText(), "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_glAccount(instance)));
      }
    }, dataFieldElements, "glAccount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_accountingPeriod(instance)));
      }
    }, dataFieldElements, "accountingPeriod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_editOrganizationglaccountbalanceBtn(instance));
      }
    }, dataFieldElements, "editOrganizationglaccountbalanceBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_deleteOrganizationglaccountbalanceBtn(instance));
      }
    }, dataFieldElements, "deleteOrganizationglaccountbalanceBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/view-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_listOrganizationglaccountbalancesPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationglaccountbalancesPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("glAccount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_glAccount(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("accountingPeriod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_accountingPeriod(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editOrganizationglaccountbalanceBtn", ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_editOrganizationglaccountbalanceBtn(instance)));
    templateFieldsMap.put("deleteOrganizationglaccountbalanceBtn", ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_deleteOrganizationglaccountbalanceBtn(instance)));
    templateFieldsMap.put("listOrganizationglaccountbalancesPageLink", ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_listOrganizationglaccountbalancesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editOrganizationglaccountbalanceBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditOrganizationglaccountbalanceBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteOrganizationglaccountbalanceBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteOrganizationglaccountbalanceBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationglaccountbalancesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = OrganizationglaccountbalancePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_glAccount(instance))), "glAccount.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_accountingPeriod(instance))), "accountingPeriod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationglaccountbalanceDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationglaccountbalanceDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_editOrganizationglaccountbalanceBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_deleteOrganizationglaccountbalanceBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationglaccountbalanceDisplay_AnchorElement_listOrganizationglaccountbalancesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationglaccountbalanceDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span OrganizationglaccountbalanceDisplay_Span_lastModifiedDt(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::lastModifiedDt;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_Span_lastModifiedDt(OrganizationglaccountbalanceDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::lastModifiedDt = value;
  }-*/;

  native static AnchorElement OrganizationglaccountbalanceDisplay_AnchorElement_editOrganizationglaccountbalanceBtn(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::editOrganizationglaccountbalanceBtn;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_AnchorElement_editOrganizationglaccountbalanceBtn(OrganizationglaccountbalanceDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::editOrganizationglaccountbalanceBtn = value;
  }-*/;

  native static AnchorElement OrganizationglaccountbalanceDisplay_AnchorElement_listOrganizationglaccountbalancesPageLink(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::listOrganizationglaccountbalancesPageLink;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_AnchorElement_listOrganizationglaccountbalancesPageLink(OrganizationglaccountbalanceDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::listOrganizationglaccountbalancesPageLink = value;
  }-*/;

  native static Heading OrganizationglaccountbalanceDisplay_Heading_code(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::code;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_Heading_code(OrganizationglaccountbalanceDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::code = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceDisplay_TableCell_accountingPeriod(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::accountingPeriod;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_TableCell_accountingPeriod(OrganizationglaccountbalanceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::accountingPeriod = value;
  }-*/;

  native static TransitionTo OrganizationglaccountbalanceDisplay_TransitionTo_listOrganizationglaccountbalancesPage(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::listOrganizationglaccountbalancesPage;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_TransitionTo_listOrganizationglaccountbalancesPage(OrganizationglaccountbalanceDisplay instance, TransitionTo<ListOrganizationglaccountbalancePage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::listOrganizationglaccountbalancesPage = value;
  }-*/;

  native static Div OrganizationglaccountbalanceDisplay_Div_entityDisplayComponent(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::entityDisplayComponent;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_Div_entityDisplayComponent(OrganizationglaccountbalanceDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::entityDisplayComponent = value;
  }-*/;

  native static AnchorElement OrganizationglaccountbalanceDisplay_AnchorElement_deleteOrganizationglaccountbalanceBtn(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::deleteOrganizationglaccountbalanceBtn;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_AnchorElement_deleteOrganizationglaccountbalanceBtn(OrganizationglaccountbalanceDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::deleteOrganizationglaccountbalanceBtn = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceDisplay_TableCell_glAccount(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::glAccount;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_TableCell_glAccount(OrganizationglaccountbalanceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::glAccount = value;
  }-*/;

  native static Event OrganizationglaccountbalanceDisplay_Event_renderEditViewEvent(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::renderEditViewEvent;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_Event_renderEditViewEvent(OrganizationglaccountbalanceDisplay instance, Event<OrganizationglaccountbalanceDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::renderEditViewEvent = value;
  }-*/;

  native static Span OrganizationglaccountbalanceDisplay_Span_createdDt(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::createdDt;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_Span_createdDt(OrganizationglaccountbalanceDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::createdDt = value;
  }-*/;

  native static Event OrganizationglaccountbalanceDisplay_Event_deleteEntityEvent(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::deleteEntityEvent;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_Event_deleteEntityEvent(OrganizationglaccountbalanceDisplay instance, Event<OrganizationglaccountbalanceDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::deleteEntityEvent = value;
  }-*/;

  native static DataBinder OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder;
  }-*/;

  native static void OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance, DataBinder<Organizationglaccountbalance> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceDisplay_TableCell_amount(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::amount;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_TableCell_amount(OrganizationglaccountbalanceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::amount = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceDisplay_TableCell_universe(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::universe;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_TableCell_universe(OrganizationglaccountbalanceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::universe = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceDisplay_TableCell_entityCode(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::entityCode;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_TableCell_entityCode(OrganizationglaccountbalanceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::entityCode = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceDisplay_TableCell_effectiveDt(OrganizationglaccountbalanceDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::effectiveDt;
  }-*/;

  native static void OrganizationglaccountbalanceDisplay_TableCell_effectiveDt(OrganizationglaccountbalanceDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay::effectiveDt = value;
  }-*/;
}
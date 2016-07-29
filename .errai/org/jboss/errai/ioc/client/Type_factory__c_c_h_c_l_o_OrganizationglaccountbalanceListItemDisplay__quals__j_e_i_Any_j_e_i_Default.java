package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
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

public class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationglaccountbalanceListItemDisplay.class, "Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationglaccountbalanceListItemDisplay.class);
    handle.addAssignableType(OrganizationglaccountbalancePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationglaccountbalanceListItemDisplay createInstance(final ContextManager contextManager) {
    final OrganizationglaccountbalanceListItemDisplay instance = new OrganizationglaccountbalanceListItemDisplay();
    setIncompleteInstance(instance);
    final Event OrganizationglaccountbalanceListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationglaccountbalanceListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_renderSingleViewEvent);
    OrganizationglaccountbalanceListItemDisplay_Event_renderSingleViewEvent(instance, OrganizationglaccountbalanceListItemDisplay_renderSingleViewEvent);
    final DataBinder OrganizationglaccountbalancePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationglaccountbalance.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationglaccountbalancePresenter_binder);
    OrganizationglaccountbalancePresenter_DataBinder_binder(instance, OrganizationglaccountbalancePresenter_binder);
    final TableCell OrganizationglaccountbalanceListItemDisplay_glAccount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_glAccount);
    OrganizationglaccountbalanceListItemDisplay_TableCell_glAccount(instance, OrganizationglaccountbalanceListItemDisplay_glAccount);
    final TableCell OrganizationglaccountbalanceListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_effectiveDt);
    OrganizationglaccountbalanceListItemDisplay_TableCell_effectiveDt(instance, OrganizationglaccountbalanceListItemDisplay_effectiveDt);
    final TableCell OrganizationglaccountbalanceListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_entityCode);
    OrganizationglaccountbalanceListItemDisplay_TableCell_entityCode(instance, OrganizationglaccountbalanceListItemDisplay_entityCode);
    final TableCell OrganizationglaccountbalanceListItemDisplay_accountingPeriod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_accountingPeriod);
    OrganizationglaccountbalanceListItemDisplay_TableCell_accountingPeriod(instance, OrganizationglaccountbalanceListItemDisplay_accountingPeriod);
    final AnchorElement OrganizationglaccountbalanceListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_editEntityListItemBtn);
    OrganizationglaccountbalanceListItemDisplay_AnchorElement_editEntityListItemBtn(instance, OrganizationglaccountbalanceListItemDisplay_editEntityListItemBtn);
    final TableRow OrganizationglaccountbalanceListItemDisplay_organizationglaccountbalanceItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_organizationglaccountbalanceItem);
    OrganizationglaccountbalanceListItemDisplay_TableRow_organizationglaccountbalanceItem(instance, OrganizationglaccountbalanceListItemDisplay_organizationglaccountbalanceItem);
    final Event OrganizationglaccountbalanceListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationglaccountbalanceListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_renderEditViewEvent);
    OrganizationglaccountbalanceListItemDisplay_Event_renderEditViewEvent(instance, OrganizationglaccountbalanceListItemDisplay_renderEditViewEvent);
    final AnchorElement OrganizationglaccountbalanceListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_deleteEntityListItemBtn);
    OrganizationglaccountbalanceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, OrganizationglaccountbalanceListItemDisplay_deleteEntityListItemBtn);
    final Event OrganizationglaccountbalanceListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationglaccountbalanceListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_deleteEntityEvent);
    OrganizationglaccountbalanceListItemDisplay_Event_deleteEntityEvent(instance, OrganizationglaccountbalanceListItemDisplay_deleteEntityEvent);
    final TableCell OrganizationglaccountbalanceListItemDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListItemDisplay_amount);
    OrganizationglaccountbalanceListItemDisplay_TableCell_amount(instance, OrganizationglaccountbalanceListItemDisplay_amount);
    c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplayTemplateResource templateForOrganizationglaccountbalanceListItemDisplay = GWT.create(c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfOrganizationglaccountbalanceListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForOrganizationglaccountbalanceListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", "organizationglaccountbalanceItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableRow_organizationglaccountbalanceItem(instance)));
      }
    }, dataFieldElements, "organizationglaccountbalanceItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_glAccount(instance)));
      }
    }, dataFieldElements, "glAccount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_accountingPeriod(instance)));
      }
    }, dataFieldElements, "accountingPeriod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("organizationglaccountbalanceItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableRow_organizationglaccountbalanceItem(instance))));
    templateFieldsMap.put("glAccount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_glAccount(instance))));
    templateFieldsMap.put("accountingPeriod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_accountingPeriod(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = OrganizationglaccountbalancePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_glAccount(instance))), "glAccount.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_accountingPeriod(instance))), "accountingPeriod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationglaccountbalanceListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationglaccountbalanceListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationglaccountbalanceListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationglaccountbalanceListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell OrganizationglaccountbalanceListItemDisplay_TableCell_amount(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::amount;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_TableCell_amount(OrganizationglaccountbalanceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::amount = value;
  }-*/;

  native static DataBinder OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder;
  }-*/;

  native static void OrganizationglaccountbalancePresenter_DataBinder_binder(OrganizationglaccountbalancePresenter instance, DataBinder<Organizationglaccountbalance> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter::binder = value;
  }-*/;

  native static AnchorElement OrganizationglaccountbalanceListItemDisplay_AnchorElement_editEntityListItemBtn(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_AnchorElement_editEntityListItemBtn(OrganizationglaccountbalanceListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event OrganizationglaccountbalanceListItemDisplay_Event_deleteEntityEvent(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_Event_deleteEntityEvent(OrganizationglaccountbalanceListItemDisplay instance, Event<OrganizationglaccountbalanceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceListItemDisplay_TableCell_entityCode(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::entityCode;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_TableCell_entityCode(OrganizationglaccountbalanceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::entityCode = value;
  }-*/;

  native static AnchorElement OrganizationglaccountbalanceListItemDisplay_AnchorElement_deleteEntityListItemBtn(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_AnchorElement_deleteEntityListItemBtn(OrganizationglaccountbalanceListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceListItemDisplay_TableCell_effectiveDt(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::effectiveDt;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_TableCell_effectiveDt(OrganizationglaccountbalanceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::effectiveDt = value;
  }-*/;

  native static Event OrganizationglaccountbalanceListItemDisplay_Event_renderSingleViewEvent(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_Event_renderSingleViewEvent(OrganizationglaccountbalanceListItemDisplay instance, Event<OrganizationglaccountbalanceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceListItemDisplay_TableCell_glAccount(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::glAccount;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_TableCell_glAccount(OrganizationglaccountbalanceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::glAccount = value;
  }-*/;

  native static TableRow OrganizationglaccountbalanceListItemDisplay_TableRow_organizationglaccountbalanceItem(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::organizationglaccountbalanceItem;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_TableRow_organizationglaccountbalanceItem(OrganizationglaccountbalanceListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::organizationglaccountbalanceItem = value;
  }-*/;

  native static Event OrganizationglaccountbalanceListItemDisplay_Event_renderEditViewEvent(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_Event_renderEditViewEvent(OrganizationglaccountbalanceListItemDisplay instance, Event<OrganizationglaccountbalanceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell OrganizationglaccountbalanceListItemDisplay_TableCell_accountingPeriod(OrganizationglaccountbalanceListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::accountingPeriod;
  }-*/;

  native static void OrganizationglaccountbalanceListItemDisplay_TableCell_accountingPeriod(OrganizationglaccountbalanceListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay::accountingPeriod = value;
  }-*/;
}
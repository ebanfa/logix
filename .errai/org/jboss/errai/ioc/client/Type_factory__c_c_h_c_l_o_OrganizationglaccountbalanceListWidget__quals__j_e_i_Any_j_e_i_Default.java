package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.api.Convert;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.databinding.client.components.ListComponent;
import org.jboss.errai.databinding.client.components.ListContainer;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationglaccountbalanceListWidget.class, "Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationglaccountbalanceListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationglaccountbalanceListWidget.class);
    handle.addAssignableType(Composite.class);
    handle.addAssignableType(Widget.class);
    handle.addAssignableType(UIObject.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(HasVisibility.class);
    handle.addAssignableType(EventListener.class);
    handle.addAssignableType(HasAttachHandlers.class);
    handle.addAssignableType(HasHandlers.class);
    handle.addAssignableType(IsWidget.class);
    handle.addAssignableType(IsRenderable.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationglaccountbalanceListWidget createInstance(final ContextManager contextManager) {
    final OrganizationglaccountbalanceListWidget instance = new OrganizationglaccountbalanceListWidget();
    setIncompleteInstance(instance);
    final DataBinder OrganizationglaccountbalanceListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListWidget_binder);
    OrganizationglaccountbalanceListWidget_DataBinder_binder(instance, OrganizationglaccountbalanceListWidget_binder);
    final ListComponent OrganizationglaccountbalanceListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Organizationglaccountbalance.class, OrganizationglaccountbalanceListItemDisplay.class }, new Annotation[] { new ListContainer() {
        public Class annotationType() {
          return ListContainer.class;
        }
        public String toString() {
          return "@org.jboss.errai.databinding.client.components.ListContainer(value=tbody)";
        }
        public String value() {
          return "tbody";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListWidget_entityList);
    OrganizationglaccountbalanceListWidget_ListComponent_entityList(instance, OrganizationglaccountbalanceListWidget_entityList);
    final TableHeaderWidget OrganizationglaccountbalanceListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListWidget_tableHeaderWidget);
    OrganizationglaccountbalanceListWidget_TableHeaderWidget_tableHeaderWidget(instance, OrganizationglaccountbalanceListWidget_tableHeaderWidget);
    final HTMLElement OrganizationglaccountbalanceListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=tbody)";
        }
        public String value() {
          return "tbody";
        }
    } });
    registerDependentScopedReference(instance, OrganizationglaccountbalanceListWidget_emptyList);
    OrganizationglaccountbalanceListWidget_HTMLElement_emptyList(instance, OrganizationglaccountbalanceListWidget_emptyList);
    c_c_h_c_l_o_OrganizationglaccountbalanceListWidgetTemplateResource templateForOrganizationglaccountbalanceListWidget = GWT.create(c_c_h_c_l_o_OrganizationglaccountbalanceListWidgetTemplateResource.class);
    Element parentElementForTemplateOfOrganizationglaccountbalanceListWidget = TemplateUtil.getRootTemplateParentElement(templateForOrganizationglaccountbalanceListWidget.getContents().getText(), "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationglaccountbalanceListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget", "com/cloderia/helion/client/local/organizationglaccountbalance/list-organizationglaccountbalance-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationglaccountbalanceListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", OrganizationglaccountbalanceListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(OrganizationglaccountbalanceListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationglaccountbalanceListWidget), templateFieldsMap.values());
    DataBinder binder = OrganizationglaccountbalanceListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(OrganizationglaccountbalanceListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationglaccountbalanceListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationglaccountbalanceListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationglaccountbalanceListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HTMLElement OrganizationglaccountbalanceListWidget_HTMLElement_emptyList(OrganizationglaccountbalanceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::emptyList;
  }-*/;

  native static void OrganizationglaccountbalanceListWidget_HTMLElement_emptyList(OrganizationglaccountbalanceListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::emptyList = value;
  }-*/;

  native static ListComponent OrganizationglaccountbalanceListWidget_ListComponent_entityList(OrganizationglaccountbalanceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::entityList;
  }-*/;

  native static void OrganizationglaccountbalanceListWidget_ListComponent_entityList(OrganizationglaccountbalanceListWidget instance, ListComponent<Organizationglaccountbalance, OrganizationglaccountbalanceListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::entityList = value;
  }-*/;

  native static DataBinder OrganizationglaccountbalanceListWidget_DataBinder_binder(OrganizationglaccountbalanceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::binder;
  }-*/;

  native static void OrganizationglaccountbalanceListWidget_DataBinder_binder(OrganizationglaccountbalanceListWidget instance, DataBinder<List<Organizationglaccountbalance>> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::binder = value;
  }-*/;

  native static TableHeaderWidget OrganizationglaccountbalanceListWidget_TableHeaderWidget_tableHeaderWidget(OrganizationglaccountbalanceListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::tableHeaderWidget;
  }-*/;

  native static void OrganizationglaccountbalanceListWidget_TableHeaderWidget_tableHeaderWidget(OrganizationglaccountbalanceListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget::tableHeaderWidget = value;
  }-*/;
}
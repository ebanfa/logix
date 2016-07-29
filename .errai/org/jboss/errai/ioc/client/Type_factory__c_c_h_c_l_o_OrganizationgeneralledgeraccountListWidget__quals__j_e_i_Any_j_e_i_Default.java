package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
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

public class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationgeneralledgeraccountListWidget.class, "Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationgeneralledgeraccountListWidget.class);
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

  public OrganizationgeneralledgeraccountListWidget createInstance(final ContextManager contextManager) {
    final OrganizationgeneralledgeraccountListWidget instance = new OrganizationgeneralledgeraccountListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget OrganizationgeneralledgeraccountListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListWidget_tableHeaderWidget);
    OrganizationgeneralledgeraccountListWidget_TableHeaderWidget_tableHeaderWidget(instance, OrganizationgeneralledgeraccountListWidget_tableHeaderWidget);
    final HTMLElement OrganizationgeneralledgeraccountListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListWidget_emptyList);
    OrganizationgeneralledgeraccountListWidget_HTMLElement_emptyList(instance, OrganizationgeneralledgeraccountListWidget_emptyList);
    final ListComponent OrganizationgeneralledgeraccountListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Organizationgeneralledgeraccount.class, OrganizationgeneralledgeraccountListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListWidget_entityList);
    OrganizationgeneralledgeraccountListWidget_ListComponent_entityList(instance, OrganizationgeneralledgeraccountListWidget_entityList);
    final DataBinder OrganizationgeneralledgeraccountListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListWidget_binder);
    OrganizationgeneralledgeraccountListWidget_DataBinder_binder(instance, OrganizationgeneralledgeraccountListWidget_binder);
    c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidgetTemplateResource templateForOrganizationgeneralledgeraccountListWidget = GWT.create(c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidgetTemplateResource.class);
    Element parentElementForTemplateOfOrganizationgeneralledgeraccountListWidget = TemplateUtil.getRootTemplateParentElement(templateForOrganizationgeneralledgeraccountListWidget.getContents().getText(), "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return OrganizationgeneralledgeraccountListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", OrganizationgeneralledgeraccountListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountListWidget), templateFieldsMap.values());
    DataBinder binder = OrganizationgeneralledgeraccountListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(OrganizationgeneralledgeraccountListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationgeneralledgeraccountListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationgeneralledgeraccountListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationgeneralledgeraccountListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder OrganizationgeneralledgeraccountListWidget_DataBinder_binder(OrganizationgeneralledgeraccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::binder;
  }-*/;

  native static void OrganizationgeneralledgeraccountListWidget_DataBinder_binder(OrganizationgeneralledgeraccountListWidget instance, DataBinder<List<Organizationgeneralledgeraccount>> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::binder = value;
  }-*/;

  native static ListComponent OrganizationgeneralledgeraccountListWidget_ListComponent_entityList(OrganizationgeneralledgeraccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::entityList;
  }-*/;

  native static void OrganizationgeneralledgeraccountListWidget_ListComponent_entityList(OrganizationgeneralledgeraccountListWidget instance, ListComponent<Organizationgeneralledgeraccount, OrganizationgeneralledgeraccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::entityList = value;
  }-*/;

  native static HTMLElement OrganizationgeneralledgeraccountListWidget_HTMLElement_emptyList(OrganizationgeneralledgeraccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::emptyList;
  }-*/;

  native static void OrganizationgeneralledgeraccountListWidget_HTMLElement_emptyList(OrganizationgeneralledgeraccountListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::emptyList = value;
  }-*/;

  native static TableHeaderWidget OrganizationgeneralledgeraccountListWidget_TableHeaderWidget_tableHeaderWidget(OrganizationgeneralledgeraccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::tableHeaderWidget;
  }-*/;

  native static void OrganizationgeneralledgeraccountListWidget_TableHeaderWidget_tableHeaderWidget(OrganizationgeneralledgeraccountListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget::tableHeaderWidget = value;
  }-*/;
}
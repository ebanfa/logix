package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay;
import com.cloderia.helion.client.local.systemuser.SystemuserListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Systemuser;
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

public class Type_factory__c_c_h_c_l_s_SystemuserListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SystemuserListWidget.class, "Type_factory__c_c_h_c_l_s_SystemuserListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SystemuserListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/systemuser/list-systemuser-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SystemuserListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SystemuserListWidget.class);
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

  public SystemuserListWidget createInstance(final ContextManager contextManager) {
    final SystemuserListWidget instance = new SystemuserListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget SystemuserListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SystemuserListWidget_tableHeaderWidget);
    SystemuserListWidget_TableHeaderWidget_tableHeaderWidget(instance, SystemuserListWidget_tableHeaderWidget);
    final HTMLElement SystemuserListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, SystemuserListWidget_emptyList);
    SystemuserListWidget_HTMLElement_emptyList(instance, SystemuserListWidget_emptyList);
    final ListComponent SystemuserListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Systemuser.class, SystemuserListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, SystemuserListWidget_entityList);
    SystemuserListWidget_ListComponent_entityList(instance, SystemuserListWidget_entityList);
    final DataBinder SystemuserListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SystemuserListWidget_binder);
    SystemuserListWidget_DataBinder_binder(instance, SystemuserListWidget_binder);
    c_c_h_c_l_s_SystemuserListWidgetTemplateResource templateForSystemuserListWidget = GWT.create(c_c_h_c_l_s_SystemuserListWidgetTemplateResource.class);
    Element parentElementForTemplateOfSystemuserListWidget = TemplateUtil.getRootTemplateParentElement(templateForSystemuserListWidget.getContents().getText(), "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListWidget", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListWidget", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return SystemuserListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.systemuser.SystemuserListWidget", "com/cloderia/helion/client/local/systemuser/list-systemuser-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SystemuserListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SystemuserListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", SystemuserListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(SystemuserListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSystemuserListWidget), templateFieldsMap.values());
    DataBinder binder = SystemuserListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.systemuser.SystemuserListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(SystemuserListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SystemuserListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final SystemuserListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SystemuserListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HTMLElement SystemuserListWidget_HTMLElement_emptyList(SystemuserListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::emptyList;
  }-*/;

  native static void SystemuserListWidget_HTMLElement_emptyList(SystemuserListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::emptyList = value;
  }-*/;

  native static ListComponent SystemuserListWidget_ListComponent_entityList(SystemuserListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::entityList;
  }-*/;

  native static void SystemuserListWidget_ListComponent_entityList(SystemuserListWidget instance, ListComponent<Systemuser, SystemuserListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::entityList = value;
  }-*/;

  native static TableHeaderWidget SystemuserListWidget_TableHeaderWidget_tableHeaderWidget(SystemuserListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::tableHeaderWidget;
  }-*/;

  native static void SystemuserListWidget_TableHeaderWidget_tableHeaderWidget(SystemuserListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::tableHeaderWidget = value;
  }-*/;

  native static DataBinder SystemuserListWidget_DataBinder_binder(SystemuserListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::binder;
  }-*/;

  native static void SystemuserListWidget_DataBinder_binder(SystemuserListWidget instance, DataBinder<List<Systemuser>> value) /*-{
    instance.@com.cloderia.helion.client.local.systemuser.SystemuserListWidget::binder = value;
  }-*/;
}
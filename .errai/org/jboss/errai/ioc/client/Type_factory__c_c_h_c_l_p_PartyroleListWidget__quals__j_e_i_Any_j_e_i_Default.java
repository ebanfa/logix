package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay;
import com.cloderia.helion.client.local.partyrole.PartyroleListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Partyrole;
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

public class Type_factory__c_c_h_c_l_p_PartyroleListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroleListWidget.class, "Type_factory__c_c_h_c_l_p_PartyroleListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroleListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyrole/list-partyrole-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroleListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroleListWidget.class);
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

  public PartyroleListWidget createInstance(final ContextManager contextManager) {
    final PartyroleListWidget instance = new PartyroleListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget PartyroleListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroleListWidget_tableHeaderWidget);
    PartyroleListWidget_TableHeaderWidget_tableHeaderWidget(instance, PartyroleListWidget_tableHeaderWidget);
    final DataBinder PartyroleListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroleListWidget_binder);
    PartyroleListWidget_DataBinder_binder(instance, PartyroleListWidget_binder);
    final ListComponent PartyroleListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Partyrole.class, PartyroleListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, PartyroleListWidget_entityList);
    PartyroleListWidget_ListComponent_entityList(instance, PartyroleListWidget_entityList);
    final HTMLElement PartyroleListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, PartyroleListWidget_emptyList);
    PartyroleListWidget_HTMLElement_emptyList(instance, PartyroleListWidget_emptyList);
    c_c_h_c_l_p_PartyroleListWidgetTemplateResource templateForPartyroleListWidget = GWT.create(c_c_h_c_l_p_PartyroleListWidgetTemplateResource.class);
    Element parentElementForTemplateOfPartyroleListWidget = TemplateUtil.getRootTemplateParentElement(templateForPartyroleListWidget.getContents().getText(), "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListWidget", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListWidget", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroleListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListWidget", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroleListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", PartyroleListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(PartyroleListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleListWidget), templateFieldsMap.values());
    DataBinder binder = PartyroleListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyrole.PartyroleListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartyroleListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroleListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroleListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroleListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HTMLElement PartyroleListWidget_HTMLElement_emptyList(PartyroleListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::emptyList;
  }-*/;

  native static void PartyroleListWidget_HTMLElement_emptyList(PartyroleListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::emptyList = value;
  }-*/;

  native static TableHeaderWidget PartyroleListWidget_TableHeaderWidget_tableHeaderWidget(PartyroleListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::tableHeaderWidget;
  }-*/;

  native static void PartyroleListWidget_TableHeaderWidget_tableHeaderWidget(PartyroleListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent PartyroleListWidget_ListComponent_entityList(PartyroleListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::entityList;
  }-*/;

  native static void PartyroleListWidget_ListComponent_entityList(PartyroleListWidget instance, ListComponent<Partyrole, PartyroleListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::entityList = value;
  }-*/;

  native static DataBinder PartyroleListWidget_DataBinder_binder(PartyroleListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::binder;
  }-*/;

  native static void PartyroleListWidget_DataBinder_binder(PartyroleListWidget instance, DataBinder<List<Partyrole>> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListWidget::binder = value;
  }-*/;
}
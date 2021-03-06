package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay;
import com.cloderia.helion.client.local.partycategory.PartycategoryListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Partycategory;
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

public class Type_factory__c_c_h_c_l_p_PartycategoryListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartycategoryListWidget.class, "Type_factory__c_c_h_c_l_p_PartycategoryListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartycategoryListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partycategory/list-partycategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartycategoryListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartycategoryListWidget.class);
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

  public PartycategoryListWidget createInstance(final ContextManager contextManager) {
    final PartycategoryListWidget instance = new PartycategoryListWidget();
    setIncompleteInstance(instance);
    final ListComponent PartycategoryListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Partycategory.class, PartycategoryListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, PartycategoryListWidget_entityList);
    PartycategoryListWidget_ListComponent_entityList(instance, PartycategoryListWidget_entityList);
    final DataBinder PartycategoryListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartycategoryListWidget_binder);
    PartycategoryListWidget_DataBinder_binder(instance, PartycategoryListWidget_binder);
    final TableHeaderWidget PartycategoryListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartycategoryListWidget_tableHeaderWidget);
    PartycategoryListWidget_TableHeaderWidget_tableHeaderWidget(instance, PartycategoryListWidget_tableHeaderWidget);
    final HTMLElement PartycategoryListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, PartycategoryListWidget_emptyList);
    PartycategoryListWidget_HTMLElement_emptyList(instance, PartycategoryListWidget_emptyList);
    c_c_h_c_l_p_PartycategoryListWidgetTemplateResource templateForPartycategoryListWidget = GWT.create(c_c_h_c_l_p_PartycategoryListWidgetTemplateResource.class);
    Element parentElementForTemplateOfPartycategoryListWidget = TemplateUtil.getRootTemplateParentElement(templateForPartycategoryListWidget.getContents().getText(), "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListWidget", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListWidget", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartycategoryListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListWidget", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartycategoryListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", PartycategoryListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(PartycategoryListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryListWidget), templateFieldsMap.values());
    DataBinder binder = PartycategoryListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partycategory.PartycategoryListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartycategoryListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartycategoryListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartycategoryListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartycategoryListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget PartycategoryListWidget_TableHeaderWidget_tableHeaderWidget(PartycategoryListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::tableHeaderWidget;
  }-*/;

  native static void PartycategoryListWidget_TableHeaderWidget_tableHeaderWidget(PartycategoryListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent PartycategoryListWidget_ListComponent_entityList(PartycategoryListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::entityList;
  }-*/;

  native static void PartycategoryListWidget_ListComponent_entityList(PartycategoryListWidget instance, ListComponent<Partycategory, PartycategoryListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::entityList = value;
  }-*/;

  native static DataBinder PartycategoryListWidget_DataBinder_binder(PartycategoryListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::binder;
  }-*/;

  native static void PartycategoryListWidget_DataBinder_binder(PartycategoryListWidget instance, DataBinder<List<Partycategory>> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::binder = value;
  }-*/;

  native static HTMLElement PartycategoryListWidget_HTMLElement_emptyList(PartycategoryListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::emptyList;
  }-*/;

  native static void PartycategoryListWidget_HTMLElement_emptyList(PartycategoryListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListWidget::emptyList = value;
  }-*/;
}
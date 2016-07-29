package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.local.universe.UniverseListItemDisplay;
import com.cloderia.helion.client.local.universe.UniverseListWidget;
import com.cloderia.helion.client.shared.model.Universe;
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

public class Type_factory__c_c_h_c_l_u_UniverseListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(UniverseListWidget.class, "Type_factory__c_c_h_c_l_u_UniverseListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_u_UniverseListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/universe/list-universe-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_u_UniverseListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(UniverseListWidget.class);
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

  public UniverseListWidget createInstance(final ContextManager contextManager) {
    final UniverseListWidget instance = new UniverseListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget UniverseListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UniverseListWidget_tableHeaderWidget);
    UniverseListWidget_TableHeaderWidget_tableHeaderWidget(instance, UniverseListWidget_tableHeaderWidget);
    final ListComponent UniverseListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Universe.class, UniverseListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, UniverseListWidget_entityList);
    UniverseListWidget_ListComponent_entityList(instance, UniverseListWidget_entityList);
    final HTMLElement UniverseListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, UniverseListWidget_emptyList);
    UniverseListWidget_HTMLElement_emptyList(instance, UniverseListWidget_emptyList);
    final DataBinder UniverseListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, UniverseListWidget_binder);
    UniverseListWidget_DataBinder_binder(instance, UniverseListWidget_binder);
    c_c_h_c_l_u_UniverseListWidgetTemplateResource templateForUniverseListWidget = GWT.create(c_c_h_c_l_u_UniverseListWidgetTemplateResource.class);
    Element parentElementForTemplateOfUniverseListWidget = TemplateUtil.getRootTemplateParentElement(templateForUniverseListWidget.getContents().getText(), "com/cloderia/helion/client/local/universe/list-universe-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/universe/list-universe-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListWidget", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListWidget", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return UniverseListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListWidget", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(UniverseListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", UniverseListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(UniverseListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseListWidget), templateFieldsMap.values());
    DataBinder binder = UniverseListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.universe.UniverseListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(UniverseListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((UniverseListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final UniverseListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final UniverseListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder UniverseListWidget_DataBinder_binder(UniverseListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::binder;
  }-*/;

  native static void UniverseListWidget_DataBinder_binder(UniverseListWidget instance, DataBinder<List<Universe>> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::binder = value;
  }-*/;

  native static HTMLElement UniverseListWidget_HTMLElement_emptyList(UniverseListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::emptyList;
  }-*/;

  native static void UniverseListWidget_HTMLElement_emptyList(UniverseListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::emptyList = value;
  }-*/;

  native static TableHeaderWidget UniverseListWidget_TableHeaderWidget_tableHeaderWidget(UniverseListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::tableHeaderWidget;
  }-*/;

  native static void UniverseListWidget_TableHeaderWidget_tableHeaderWidget(UniverseListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent UniverseListWidget_ListComponent_entityList(UniverseListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::entityList;
  }-*/;

  native static void UniverseListWidget_ListComponent_entityList(UniverseListWidget instance, ListComponent<Universe, UniverseListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListWidget::entityList = value;
  }-*/;
}
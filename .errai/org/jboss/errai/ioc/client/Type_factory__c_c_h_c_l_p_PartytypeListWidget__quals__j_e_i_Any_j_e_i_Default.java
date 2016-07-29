package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay;
import com.cloderia.helion.client.local.partytype.PartytypeListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Partytype;
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

public class Type_factory__c_c_h_c_l_p_PartytypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartytypeListWidget.class, "Type_factory__c_c_h_c_l_p_PartytypeListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartytypeListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partytype/list-partytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartytypeListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartytypeListWidget.class);
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

  public PartytypeListWidget createInstance(final ContextManager contextManager) {
    final PartytypeListWidget instance = new PartytypeListWidget();
    setIncompleteInstance(instance);
    final DataBinder PartytypeListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartytypeListWidget_binder);
    PartytypeListWidget_DataBinder_binder(instance, PartytypeListWidget_binder);
    final ListComponent PartytypeListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Partytype.class, PartytypeListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, PartytypeListWidget_entityList);
    PartytypeListWidget_ListComponent_entityList(instance, PartytypeListWidget_entityList);
    final TableHeaderWidget PartytypeListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartytypeListWidget_tableHeaderWidget);
    PartytypeListWidget_TableHeaderWidget_tableHeaderWidget(instance, PartytypeListWidget_tableHeaderWidget);
    final HTMLElement PartytypeListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, PartytypeListWidget_emptyList);
    PartytypeListWidget_HTMLElement_emptyList(instance, PartytypeListWidget_emptyList);
    c_c_h_c_l_p_PartytypeListWidgetTemplateResource templateForPartytypeListWidget = GWT.create(c_c_h_c_l_p_PartytypeListWidgetTemplateResource.class);
    Element parentElementForTemplateOfPartytypeListWidget = TemplateUtil.getRootTemplateParentElement(templateForPartytypeListWidget.getContents().getText(), "com/cloderia/helion/client/local/partytype/list-partytype-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partytype/list-partytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListWidget", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListWidget", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartytypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListWidget", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartytypeListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", PartytypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(PartytypeListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeListWidget), templateFieldsMap.values());
    DataBinder binder = PartytypeListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partytype.PartytypeListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartytypeListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartytypeListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartytypeListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartytypeListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder PartytypeListWidget_DataBinder_binder(PartytypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::binder;
  }-*/;

  native static void PartytypeListWidget_DataBinder_binder(PartytypeListWidget instance, DataBinder<List<Partytype>> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::binder = value;
  }-*/;

  native static HTMLElement PartytypeListWidget_HTMLElement_emptyList(PartytypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::emptyList;
  }-*/;

  native static void PartytypeListWidget_HTMLElement_emptyList(PartytypeListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::emptyList = value;
  }-*/;

  native static TableHeaderWidget PartytypeListWidget_TableHeaderWidget_tableHeaderWidget(PartytypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::tableHeaderWidget;
  }-*/;

  native static void PartytypeListWidget_TableHeaderWidget_tableHeaderWidget(PartytypeListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent PartytypeListWidget_ListComponent_entityList(PartytypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::entityList;
  }-*/;

  native static void PartytypeListWidget_ListComponent_entityList(PartytypeListWidget instance, ListComponent<Partytype, PartytypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListWidget::entityList = value;
  }-*/;
}
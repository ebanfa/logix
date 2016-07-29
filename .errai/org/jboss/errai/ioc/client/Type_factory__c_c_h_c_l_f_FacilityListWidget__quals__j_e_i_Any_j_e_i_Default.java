package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facility.FacilityListItemDisplay;
import com.cloderia.helion.client.local.facility.FacilityListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Facility;
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

public class Type_factory__c_c_h_c_l_f_FacilityListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilityListWidget.class, "Type_factory__c_c_h_c_l_f_FacilityListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_FacilityListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facility/list-facility-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_FacilityListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilityListWidget.class);
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

  public FacilityListWidget createInstance(final ContextManager contextManager) {
    final FacilityListWidget instance = new FacilityListWidget();
    setIncompleteInstance(instance);
    final DataBinder FacilityListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilityListWidget_binder);
    FacilityListWidget_DataBinder_binder(instance, FacilityListWidget_binder);
    final HTMLElement FacilityListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, FacilityListWidget_emptyList);
    FacilityListWidget_HTMLElement_emptyList(instance, FacilityListWidget_emptyList);
    final TableHeaderWidget FacilityListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilityListWidget_tableHeaderWidget);
    FacilityListWidget_TableHeaderWidget_tableHeaderWidget(instance, FacilityListWidget_tableHeaderWidget);
    final ListComponent FacilityListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Facility.class, FacilityListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, FacilityListWidget_entityList);
    FacilityListWidget_ListComponent_entityList(instance, FacilityListWidget_entityList);
    c_c_h_c_l_f_FacilityListWidgetTemplateResource templateForFacilityListWidget = GWT.create(c_c_h_c_l_f_FacilityListWidgetTemplateResource.class);
    Element parentElementForTemplateOfFacilityListWidget = TemplateUtil.getRootTemplateParentElement(templateForFacilityListWidget.getContents().getText(), "com/cloderia/helion/client/local/facility/list-facility-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facility/list-facility-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListWidget", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListWidget", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityListWidget", "com/cloderia/helion/client/local/facility/list-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilityListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", FacilityListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(FacilityListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityListWidget), templateFieldsMap.values());
    DataBinder binder = FacilityListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.facility.FacilityListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(FacilityListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilityListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilityListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final FacilityListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget FacilityListWidget_TableHeaderWidget_tableHeaderWidget(FacilityListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::tableHeaderWidget;
  }-*/;

  native static void FacilityListWidget_TableHeaderWidget_tableHeaderWidget(FacilityListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::tableHeaderWidget = value;
  }-*/;

  native static DataBinder FacilityListWidget_DataBinder_binder(FacilityListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::binder;
  }-*/;

  native static void FacilityListWidget_DataBinder_binder(FacilityListWidget instance, DataBinder<List<Facility>> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::binder = value;
  }-*/;

  native static ListComponent FacilityListWidget_ListComponent_entityList(FacilityListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::entityList;
  }-*/;

  native static void FacilityListWidget_ListComponent_entityList(FacilityListWidget instance, ListComponent<Facility, FacilityListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::entityList = value;
  }-*/;

  native static HTMLElement FacilityListWidget_HTMLElement_emptyList(FacilityListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::emptyList;
  }-*/;

  native static void FacilityListWidget_HTMLElement_emptyList(FacilityListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityListWidget::emptyList = value;
  }-*/;
}
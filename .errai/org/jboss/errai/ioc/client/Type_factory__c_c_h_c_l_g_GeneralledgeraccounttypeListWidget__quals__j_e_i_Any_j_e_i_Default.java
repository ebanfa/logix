package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccounttypeListWidget.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_GeneralledgeraccounttypeListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccounttypeListWidget.class);
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

  public GeneralledgeraccounttypeListWidget createInstance(final ContextManager contextManager) {
    final GeneralledgeraccounttypeListWidget instance = new GeneralledgeraccounttypeListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget GeneralledgeraccounttypeListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListWidget_tableHeaderWidget);
    GeneralledgeraccounttypeListWidget_TableHeaderWidget_tableHeaderWidget(instance, GeneralledgeraccounttypeListWidget_tableHeaderWidget);
    final HTMLElement GeneralledgeraccounttypeListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListWidget_emptyList);
    GeneralledgeraccounttypeListWidget_HTMLElement_emptyList(instance, GeneralledgeraccounttypeListWidget_emptyList);
    final DataBinder GeneralledgeraccounttypeListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListWidget_binder);
    GeneralledgeraccounttypeListWidget_DataBinder_binder(instance, GeneralledgeraccounttypeListWidget_binder);
    final ListComponent GeneralledgeraccounttypeListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Generalledgeraccounttype.class, GeneralledgeraccounttypeListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListWidget_entityList);
    GeneralledgeraccounttypeListWidget_ListComponent_entityList(instance, GeneralledgeraccounttypeListWidget_entityList);
    c_c_h_c_l_g_GeneralledgeraccounttypeListWidgetTemplateResource templateForGeneralledgeraccounttypeListWidget = GWT.create(c_c_h_c_l_g_GeneralledgeraccounttypeListWidgetTemplateResource.class);
    Element parentElementForTemplateOfGeneralledgeraccounttypeListWidget = TemplateUtil.getRootTemplateParentElement(templateForGeneralledgeraccounttypeListWidget.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return GeneralledgeraccounttypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", GeneralledgeraccounttypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeListWidget), templateFieldsMap.values());
    DataBinder binder = GeneralledgeraccounttypeListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(GeneralledgeraccounttypeListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccounttypeListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccounttypeListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final GeneralledgeraccounttypeListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget GeneralledgeraccounttypeListWidget_TableHeaderWidget_tableHeaderWidget(GeneralledgeraccounttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::tableHeaderWidget;
  }-*/;

  native static void GeneralledgeraccounttypeListWidget_TableHeaderWidget_tableHeaderWidget(GeneralledgeraccounttypeListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::tableHeaderWidget = value;
  }-*/;

  native static DataBinder GeneralledgeraccounttypeListWidget_DataBinder_binder(GeneralledgeraccounttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::binder;
  }-*/;

  native static void GeneralledgeraccounttypeListWidget_DataBinder_binder(GeneralledgeraccounttypeListWidget instance, DataBinder<List<Generalledgeraccounttype>> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::binder = value;
  }-*/;

  native static HTMLElement GeneralledgeraccounttypeListWidget_HTMLElement_emptyList(GeneralledgeraccounttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::emptyList;
  }-*/;

  native static void GeneralledgeraccounttypeListWidget_HTMLElement_emptyList(GeneralledgeraccounttypeListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::emptyList = value;
  }-*/;

  native static ListComponent GeneralledgeraccounttypeListWidget_ListComponent_entityList(GeneralledgeraccounttypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::entityList;
  }-*/;

  native static void GeneralledgeraccounttypeListWidget_ListComponent_entityList(GeneralledgeraccounttypeListWidget instance, ListComponent<Generalledgeraccounttype, GeneralledgeraccounttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget::entityList = value;
  }-*/;
}
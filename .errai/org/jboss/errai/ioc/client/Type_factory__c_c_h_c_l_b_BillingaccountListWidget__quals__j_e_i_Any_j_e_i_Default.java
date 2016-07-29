package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay;
import com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Billingaccount;
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

public class Type_factory__c_c_h_c_l_b_BillingaccountListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BillingaccountListWidget.class, "Type_factory__c_c_h_c_l_b_BillingaccountListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BillingaccountListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BillingaccountListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BillingaccountListWidget.class);
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

  public BillingaccountListWidget createInstance(final ContextManager contextManager) {
    final BillingaccountListWidget instance = new BillingaccountListWidget();
    setIncompleteInstance(instance);
    final ListComponent BillingaccountListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Billingaccount.class, BillingaccountListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, BillingaccountListWidget_entityList);
    BillingaccountListWidget_ListComponent_entityList(instance, BillingaccountListWidget_entityList);
    final HTMLElement BillingaccountListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, BillingaccountListWidget_emptyList);
    BillingaccountListWidget_HTMLElement_emptyList(instance, BillingaccountListWidget_emptyList);
    final DataBinder BillingaccountListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BillingaccountListWidget_binder);
    BillingaccountListWidget_DataBinder_binder(instance, BillingaccountListWidget_binder);
    final TableHeaderWidget BillingaccountListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountListWidget_tableHeaderWidget);
    BillingaccountListWidget_TableHeaderWidget_tableHeaderWidget(instance, BillingaccountListWidget_tableHeaderWidget);
    c_c_h_c_l_b_BillingaccountListWidgetTemplateResource templateForBillingaccountListWidget = GWT.create(c_c_h_c_l_b_BillingaccountListWidgetTemplateResource.class);
    Element parentElementForTemplateOfBillingaccountListWidget = TemplateUtil.getRootTemplateParentElement(templateForBillingaccountListWidget.getContents().getText(), "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget", "com/cloderia/helion/client/local/billingaccount/list-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BillingaccountListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", BillingaccountListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(BillingaccountListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountListWidget), templateFieldsMap.values());
    DataBinder binder = BillingaccountListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(BillingaccountListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BillingaccountListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final BillingaccountListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BillingaccountListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static DataBinder BillingaccountListWidget_DataBinder_binder(BillingaccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::binder;
  }-*/;

  native static void BillingaccountListWidget_DataBinder_binder(BillingaccountListWidget instance, DataBinder<List<Billingaccount>> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::binder = value;
  }-*/;

  native static HTMLElement BillingaccountListWidget_HTMLElement_emptyList(BillingaccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::emptyList;
  }-*/;

  native static void BillingaccountListWidget_HTMLElement_emptyList(BillingaccountListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::emptyList = value;
  }-*/;

  native static ListComponent BillingaccountListWidget_ListComponent_entityList(BillingaccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::entityList;
  }-*/;

  native static void BillingaccountListWidget_ListComponent_entityList(BillingaccountListWidget instance, ListComponent<Billingaccount, BillingaccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::entityList = value;
  }-*/;

  native static TableHeaderWidget BillingaccountListWidget_TableHeaderWidget_tableHeaderWidget(BillingaccountListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::tableHeaderWidget;
  }-*/;

  native static void BillingaccountListWidget_TableHeaderWidget_tableHeaderWidget(BillingaccountListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget::tableHeaderWidget = value;
  }-*/;
}
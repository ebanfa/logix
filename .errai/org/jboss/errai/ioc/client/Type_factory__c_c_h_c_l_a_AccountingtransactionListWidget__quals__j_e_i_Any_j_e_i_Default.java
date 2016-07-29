package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Accountingtransaction;
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

public class Type_factory__c_c_h_c_l_a_AccountingtransactionListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AccountingtransactionListWidget.class, "Type_factory__c_c_h_c_l_a_AccountingtransactionListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AccountingtransactionListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AccountingtransactionListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AccountingtransactionListWidget.class);
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

  public AccountingtransactionListWidget createInstance(final ContextManager contextManager) {
    final AccountingtransactionListWidget instance = new AccountingtransactionListWidget();
    setIncompleteInstance(instance);
    final TableHeaderWidget AccountingtransactionListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AccountingtransactionListWidget_tableHeaderWidget);
    AccountingtransactionListWidget_TableHeaderWidget_tableHeaderWidget(instance, AccountingtransactionListWidget_tableHeaderWidget);
    final HTMLElement AccountingtransactionListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, AccountingtransactionListWidget_emptyList);
    AccountingtransactionListWidget_HTMLElement_emptyList(instance, AccountingtransactionListWidget_emptyList);
    final DataBinder AccountingtransactionListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AccountingtransactionListWidget_binder);
    AccountingtransactionListWidget_DataBinder_binder(instance, AccountingtransactionListWidget_binder);
    final ListComponent AccountingtransactionListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Accountingtransaction.class, AccountingtransactionListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, AccountingtransactionListWidget_entityList);
    AccountingtransactionListWidget_ListComponent_entityList(instance, AccountingtransactionListWidget_entityList);
    c_c_h_c_l_a_AccountingtransactionListWidgetTemplateResource templateForAccountingtransactionListWidget = GWT.create(c_c_h_c_l_a_AccountingtransactionListWidgetTemplateResource.class);
    Element parentElementForTemplateOfAccountingtransactionListWidget = TemplateUtil.getRootTemplateParentElement(templateForAccountingtransactionListWidget.getContents().getText(), "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AccountingtransactionListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget", "com/cloderia/helion/client/local/accountingtransaction/list-accountingtransaction-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AccountingtransactionListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AccountingtransactionListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", AccountingtransactionListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(AccountingtransactionListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAccountingtransactionListWidget), templateFieldsMap.values());
    DataBinder binder = AccountingtransactionListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(AccountingtransactionListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AccountingtransactionListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final AccountingtransactionListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AccountingtransactionListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget AccountingtransactionListWidget_TableHeaderWidget_tableHeaderWidget(AccountingtransactionListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::tableHeaderWidget;
  }-*/;

  native static void AccountingtransactionListWidget_TableHeaderWidget_tableHeaderWidget(AccountingtransactionListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent AccountingtransactionListWidget_ListComponent_entityList(AccountingtransactionListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::entityList;
  }-*/;

  native static void AccountingtransactionListWidget_ListComponent_entityList(AccountingtransactionListWidget instance, ListComponent<Accountingtransaction, AccountingtransactionListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::entityList = value;
  }-*/;

  native static HTMLElement AccountingtransactionListWidget_HTMLElement_emptyList(AccountingtransactionListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::emptyList;
  }-*/;

  native static void AccountingtransactionListWidget_HTMLElement_emptyList(AccountingtransactionListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::emptyList = value;
  }-*/;

  native static DataBinder AccountingtransactionListWidget_DataBinder_binder(AccountingtransactionListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::binder;
  }-*/;

  native static void AccountingtransactionListWidget_DataBinder_binder(AccountingtransactionListWidget instance, DataBinder<List<Accountingtransaction>> value) /*-{
    instance.@com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget::binder = value;
  }-*/;
}
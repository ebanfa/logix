package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.agreement.AgreementListItemDisplay;
import com.cloderia.helion.client.local.agreement.AgreementListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Agreement;
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

public class Type_factory__c_c_h_c_l_a_AgreementListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AgreementListWidget.class, "Type_factory__c_c_h_c_l_a_AgreementListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AgreementListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/agreement/list-agreement-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AgreementListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AgreementListWidget.class);
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

  public AgreementListWidget createInstance(final ContextManager contextManager) {
    final AgreementListWidget instance = new AgreementListWidget();
    setIncompleteInstance(instance);
    final HTMLElement AgreementListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, AgreementListWidget_emptyList);
    AgreementListWidget_HTMLElement_emptyList(instance, AgreementListWidget_emptyList);
    final DataBinder AgreementListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AgreementListWidget_binder);
    AgreementListWidget_DataBinder_binder(instance, AgreementListWidget_binder);
    final ListComponent AgreementListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Agreement.class, AgreementListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, AgreementListWidget_entityList);
    AgreementListWidget_ListComponent_entityList(instance, AgreementListWidget_entityList);
    final TableHeaderWidget AgreementListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AgreementListWidget_tableHeaderWidget);
    AgreementListWidget_TableHeaderWidget_tableHeaderWidget(instance, AgreementListWidget_tableHeaderWidget);
    c_c_h_c_l_a_AgreementListWidgetTemplateResource templateForAgreementListWidget = GWT.create(c_c_h_c_l_a_AgreementListWidgetTemplateResource.class);
    Element parentElementForTemplateOfAgreementListWidget = TemplateUtil.getRootTemplateParentElement(templateForAgreementListWidget.getContents().getText(), "com/cloderia/helion/client/local/agreement/list-agreement-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/agreement/list-agreement-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListWidget", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListWidget", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return AgreementListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListWidget", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AgreementListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", AgreementListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(AgreementListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementListWidget), templateFieldsMap.values());
    DataBinder binder = AgreementListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.agreement.AgreementListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(AgreementListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AgreementListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final AgreementListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AgreementListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static HTMLElement AgreementListWidget_HTMLElement_emptyList(AgreementListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::emptyList;
  }-*/;

  native static void AgreementListWidget_HTMLElement_emptyList(AgreementListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::emptyList = value;
  }-*/;

  native static TableHeaderWidget AgreementListWidget_TableHeaderWidget_tableHeaderWidget(AgreementListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::tableHeaderWidget;
  }-*/;

  native static void AgreementListWidget_TableHeaderWidget_tableHeaderWidget(AgreementListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent AgreementListWidget_ListComponent_entityList(AgreementListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::entityList;
  }-*/;

  native static void AgreementListWidget_ListComponent_entityList(AgreementListWidget instance, ListComponent<Agreement, AgreementListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::entityList = value;
  }-*/;

  native static DataBinder AgreementListWidget_DataBinder_binder(AgreementListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::binder;
  }-*/;

  native static void AgreementListWidget_DataBinder_binder(AgreementListWidget instance, DataBinder<List<Agreement>> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListWidget::binder = value;
  }-*/;
}
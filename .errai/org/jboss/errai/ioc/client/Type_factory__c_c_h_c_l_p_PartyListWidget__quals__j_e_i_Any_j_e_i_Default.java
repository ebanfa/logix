package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.party.PartyListItemDisplay;
import com.cloderia.helion.client.local.party.PartyListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Party;
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

public class Type_factory__c_c_h_c_l_p_PartyListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyListWidget.class, "Type_factory__c_c_h_c_l_p_PartyListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/party/list-party-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyListWidget.class);
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

  public PartyListWidget createInstance(final ContextManager contextManager) {
    final PartyListWidget instance = new PartyListWidget();
    setIncompleteInstance(instance);
    final HTMLElement PartyListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, PartyListWidget_emptyList);
    PartyListWidget_HTMLElement_emptyList(instance, PartyListWidget_emptyList);
    final TableHeaderWidget PartyListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyListWidget_tableHeaderWidget);
    PartyListWidget_TableHeaderWidget_tableHeaderWidget(instance, PartyListWidget_tableHeaderWidget);
    final ListComponent PartyListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Party.class, PartyListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, PartyListWidget_entityList);
    PartyListWidget_ListComponent_entityList(instance, PartyListWidget_entityList);
    final DataBinder PartyListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyListWidget_binder);
    PartyListWidget_DataBinder_binder(instance, PartyListWidget_binder);
    c_c_h_c_l_p_PartyListWidgetTemplateResource templateForPartyListWidget = GWT.create(c_c_h_c_l_p_PartyListWidgetTemplateResource.class);
    Element parentElementForTemplateOfPartyListWidget = TemplateUtil.getRootTemplateParentElement(templateForPartyListWidget.getContents().getText(), "com/cloderia/helion/client/local/party/list-party-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/party/list-party-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListWidget", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListWidget", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListWidget", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", PartyListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(PartyListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyListWidget), templateFieldsMap.values());
    DataBinder binder = PartyListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.party.PartyListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartyListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget PartyListWidget_TableHeaderWidget_tableHeaderWidget(PartyListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListWidget::tableHeaderWidget;
  }-*/;

  native static void PartyListWidget_TableHeaderWidget_tableHeaderWidget(PartyListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent PartyListWidget_ListComponent_entityList(PartyListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListWidget::entityList;
  }-*/;

  native static void PartyListWidget_ListComponent_entityList(PartyListWidget instance, ListComponent<Party, PartyListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListWidget::entityList = value;
  }-*/;

  native static HTMLElement PartyListWidget_HTMLElement_emptyList(PartyListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListWidget::emptyList;
  }-*/;

  native static void PartyListWidget_HTMLElement_emptyList(PartyListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListWidget::emptyList = value;
  }-*/;

  native static DataBinder PartyListWidget_DataBinder_binder(PartyListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListWidget::binder;
  }-*/;

  native static void PartyListWidget_DataBinder_binder(PartyListWidget instance, DataBinder<List<Party>> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListWidget::binder = value;
  }-*/;
}
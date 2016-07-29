package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Partyroletype;
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

public class Type_factory__c_c_h_c_l_p_PartyroletypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroletypeListWidget.class, "Type_factory__c_c_h_c_l_p_PartyroletypeListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroletypeListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroletypeListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroletypeListWidget.class);
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

  public PartyroletypeListWidget createInstance(final ContextManager contextManager) {
    final PartyroletypeListWidget instance = new PartyroletypeListWidget();
    setIncompleteInstance(instance);
    final HTMLElement PartyroletypeListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, PartyroletypeListWidget_emptyList);
    PartyroletypeListWidget_HTMLElement_emptyList(instance, PartyroletypeListWidget_emptyList);
    final DataBinder PartyroletypeListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroletypeListWidget_binder);
    PartyroletypeListWidget_DataBinder_binder(instance, PartyroletypeListWidget_binder);
    final TableHeaderWidget PartyroletypeListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PartyroletypeListWidget_tableHeaderWidget);
    PartyroletypeListWidget_TableHeaderWidget_tableHeaderWidget(instance, PartyroletypeListWidget_tableHeaderWidget);
    final ListComponent PartyroletypeListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Partyroletype.class, PartyroletypeListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, PartyroletypeListWidget_entityList);
    PartyroletypeListWidget_ListComponent_entityList(instance, PartyroletypeListWidget_entityList);
    c_c_h_c_l_p_PartyroletypeListWidgetTemplateResource templateForPartyroletypeListWidget = GWT.create(c_c_h_c_l_p_PartyroletypeListWidgetTemplateResource.class);
    Element parentElementForTemplateOfPartyroletypeListWidget = TemplateUtil.getRootTemplateParentElement(templateForPartyroletypeListWidget.getContents().getText(), "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PartyroletypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroletypeListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", PartyroletypeListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(PartyroletypeListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeListWidget), templateFieldsMap.values());
    DataBinder binder = PartyroletypeListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PartyroletypeListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroletypeListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroletypeListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroletypeListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListComponent PartyroletypeListWidget_ListComponent_entityList(PartyroletypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::entityList;
  }-*/;

  native static void PartyroletypeListWidget_ListComponent_entityList(PartyroletypeListWidget instance, ListComponent<Partyroletype, PartyroletypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::entityList = value;
  }-*/;

  native static HTMLElement PartyroletypeListWidget_HTMLElement_emptyList(PartyroletypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::emptyList;
  }-*/;

  native static void PartyroletypeListWidget_HTMLElement_emptyList(PartyroletypeListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::emptyList = value;
  }-*/;

  native static DataBinder PartyroletypeListWidget_DataBinder_binder(PartyroletypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::binder;
  }-*/;

  native static void PartyroletypeListWidget_DataBinder_binder(PartyroletypeListWidget instance, DataBinder<List<Partyroletype>> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::binder = value;
  }-*/;

  native static TableHeaderWidget PartyroletypeListWidget_TableHeaderWidget_tableHeaderWidget(PartyroletypeListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::tableHeaderWidget;
  }-*/;

  native static void PartyroletypeListWidget_TableHeaderWidget_tableHeaderWidget(PartyroletypeListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget::tableHeaderWidget = value;
  }-*/;
}
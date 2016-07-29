package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.person.PersonListItemDisplay;
import com.cloderia.helion.client.local.person.PersonListWidget;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Person;
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

public class Type_factory__c_c_h_c_l_p_PersonListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonListWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PersonListWidget.class, "Type_factory__c_c_h_c_l_p_PersonListWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PersonListWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/person/list-person-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PersonListWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PersonListWidget.class);
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

  public PersonListWidget createInstance(final ContextManager contextManager) {
    final PersonListWidget instance = new PersonListWidget();
    setIncompleteInstance(instance);
    final HTMLElement PersonListWidget_emptyList = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
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
    registerDependentScopedReference(instance, PersonListWidget_emptyList);
    PersonListWidget_HTMLElement_emptyList(instance, PersonListWidget_emptyList);
    final ListComponent PersonListWidget_entityList = (ListComponent) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal", new Class[] { Person.class, PersonListItemDisplay.class }, new Annotation[] { new ListContainer() {
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
    registerDependentScopedReference(instance, PersonListWidget_entityList);
    PersonListWidget_ListComponent_entityList(instance, PersonListWidget_entityList);
    final DataBinder PersonListWidget_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { List.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PersonListWidget_binder);
    PersonListWidget_DataBinder_binder(instance, PersonListWidget_binder);
    final TableHeaderWidget PersonListWidget_tableHeaderWidget = (TableHeaderWidget) contextManager.getInstance("Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PersonListWidget_tableHeaderWidget);
    PersonListWidget_TableHeaderWidget_tableHeaderWidget(instance, PersonListWidget_tableHeaderWidget);
    c_c_h_c_l_p_PersonListWidgetTemplateResource templateForPersonListWidget = GWT.create(c_c_h_c_l_p_PersonListWidgetTemplateResource.class);
    Element parentElementForTemplateOfPersonListWidget = TemplateUtil.getRootTemplateParentElement(templateForPersonListWidget.getContents().getText(), "com/cloderia/helion/client/local/person/list-person-page.html", "listWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/person/list-person-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonListWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonListWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListWidget", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListWidget_HTMLElement_emptyList(instance)));
      }
    }, dataFieldElements, "emptyList");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListWidget", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return PersonListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget();
      }
    }, dataFieldElements, "tableHeaderWidget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListWidget", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PersonListWidget_ListComponent_entityList(instance).getElement());
      }
    }, dataFieldElements, "entityList");
    templateFieldsMap.put("emptyList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListWidget_HTMLElement_emptyList(instance))));
    templateFieldsMap.put("tableHeaderWidget", PersonListWidget_TableHeaderWidget_tableHeaderWidget(instance).asWidget());
    templateFieldsMap.put("entityList", ElementWrapperWidget.getWidget(PersonListWidget_ListComponent_entityList(instance).getElement()));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonListWidget), templateFieldsMap.values());
    DataBinder binder = PersonListWidget_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.person.PersonListWidget has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(PersonListWidget_ListComponent_entityList(instance), "this", Convert.getConverter(List.class, List.class), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PersonListWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final PersonListWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PersonListWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableHeaderWidget PersonListWidget_TableHeaderWidget_tableHeaderWidget(PersonListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListWidget::tableHeaderWidget;
  }-*/;

  native static void PersonListWidget_TableHeaderWidget_tableHeaderWidget(PersonListWidget instance, TableHeaderWidget value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListWidget::tableHeaderWidget = value;
  }-*/;

  native static ListComponent PersonListWidget_ListComponent_entityList(PersonListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListWidget::entityList;
  }-*/;

  native static void PersonListWidget_ListComponent_entityList(PersonListWidget instance, ListComponent<Person, PersonListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListWidget::entityList = value;
  }-*/;

  native static DataBinder PersonListWidget_DataBinder_binder(PersonListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListWidget::binder;
  }-*/;

  native static void PersonListWidget_DataBinder_binder(PersonListWidget instance, DataBinder<List<Person>> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListWidget::binder = value;
  }-*/;

  native static HTMLElement PersonListWidget_HTMLElement_emptyList(PersonListWidget instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListWidget::emptyList;
  }-*/;

  native static void PersonListWidget_HTMLElement_emptyList(PersonListWidget instance, HTMLElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListWidget::emptyList = value;
  }-*/;
}
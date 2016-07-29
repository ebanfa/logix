package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.ui.TableHeaderWidget;
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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<TableHeaderWidget> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(TableHeaderWidget.class, "Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_u_TableHeaderWidgetTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/ui/list-entity-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(TableHeaderWidget.class);
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

  public TableHeaderWidget createInstance(final ContextManager contextManager) {
    final TableHeaderWidget instance = new TableHeaderWidget();
    setIncompleteInstance(instance);
    c_c_h_c_l_u_TableHeaderWidgetTemplateResource templateForTableHeaderWidget = GWT.create(c_c_h_c_l_u_TableHeaderWidgetTemplateResource.class);
    Element parentElementForTemplateOfTableHeaderWidget = TemplateUtil.getRootTemplateParentElement(templateForTableHeaderWidget.getContents().getText(), "com/cloderia/helion/client/local/ui/list-entity-page.html", "tableHeaderWidget");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/ui/list-entity-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfTableHeaderWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfTableHeaderWidget));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfTableHeaderWidget), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((TableHeaderWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final TableHeaderWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final TableHeaderWidget instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }
}
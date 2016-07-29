package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay;
import com.cloderia.helion.client.local.partycategory.PartycategoryPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Partycategory;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.dom.TableRow;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.BoundUtil;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandle;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_p_PartycategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartycategoryListItemDisplay.class, "Type_factory__c_c_h_c_l_p_PartycategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartycategoryListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partycategory/list-partycategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartycategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartycategoryListItemDisplay.class);
    handle.addAssignableType(PartycategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartycategoryListItemDisplay createInstance(final ContextManager contextManager) {
    final PartycategoryListItemDisplay instance = new PartycategoryListItemDisplay();
    setIncompleteInstance(instance);
    final DataBinder PartycategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partycategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartycategoryPresenter_binder);
    PartycategoryPresenter_DataBinder_binder(instance, PartycategoryPresenter_binder);
    final AnchorElement PartycategoryListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_editEntityListItemBtn);
    PartycategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance, PartycategoryListItemDisplay_editEntityListItemBtn);
    final TableCell PartycategoryListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_entityCode);
    PartycategoryListItemDisplay_TableCell_entityCode(instance, PartycategoryListItemDisplay_entityCode);
    final AnchorElement PartycategoryListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_deleteEntityListItemBtn);
    PartycategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, PartycategoryListItemDisplay_deleteEntityListItemBtn);
    final Event PartycategoryListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartycategoryListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_renderEditViewEvent);
    PartycategoryListItemDisplay_Event_renderEditViewEvent(instance, PartycategoryListItemDisplay_renderEditViewEvent);
    final Event PartycategoryListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartycategoryListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_deleteEntityEvent);
    PartycategoryListItemDisplay_Event_deleteEntityEvent(instance, PartycategoryListItemDisplay_deleteEntityEvent);
    final TableCell PartycategoryListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_name);
    PartycategoryListItemDisplay_TableCell_name(instance, PartycategoryListItemDisplay_name);
    final TableCell PartycategoryListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_description);
    PartycategoryListItemDisplay_TableCell_description(instance, PartycategoryListItemDisplay_description);
    final Event PartycategoryListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartycategoryListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_renderSingleViewEvent);
    PartycategoryListItemDisplay_Event_renderSingleViewEvent(instance, PartycategoryListItemDisplay_renderSingleViewEvent);
    final TableRow PartycategoryListItemDisplay_partycategoryItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_partycategoryItem);
    PartycategoryListItemDisplay_TableRow_partycategoryItem(instance, PartycategoryListItemDisplay_partycategoryItem);
    final TableCell PartycategoryListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryListItemDisplay_effectiveDt);
    PartycategoryListItemDisplay_TableCell_effectiveDt(instance, PartycategoryListItemDisplay_effectiveDt);
    c_c_h_c_l_p_PartycategoryListItemDisplayTemplateResource templateForPartycategoryListItemDisplay = GWT.create(c_c_h_c_l_p_PartycategoryListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartycategoryListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartycategoryListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", "partycategoryItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableRow_partycategoryItem(instance)));
      }
    }, dataFieldElements, "partycategoryItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartycategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com/cloderia/helion/client/local/partycategory/list-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartycategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("partycategoryItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableRow_partycategoryItem(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(PartycategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(PartycategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryListItemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderEditView(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteEntityListItemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.renderDeleteView(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartycategoryPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartycategoryListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartycategoryListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartycategoryListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartycategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartycategoryListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableRow PartycategoryListItemDisplay_TableRow_partycategoryItem(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::partycategoryItem;
  }-*/;

  native static void PartycategoryListItemDisplay_TableRow_partycategoryItem(PartycategoryListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::partycategoryItem = value;
  }-*/;

  native static TableCell PartycategoryListItemDisplay_TableCell_entityCode(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::entityCode;
  }-*/;

  native static void PartycategoryListItemDisplay_TableCell_entityCode(PartycategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell PartycategoryListItemDisplay_TableCell_name(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::name;
  }-*/;

  native static void PartycategoryListItemDisplay_TableCell_name(PartycategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::name = value;
  }-*/;

  native static AnchorElement PartycategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void PartycategoryListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartycategoryListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell PartycategoryListItemDisplay_TableCell_description(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::description;
  }-*/;

  native static void PartycategoryListItemDisplay_TableCell_description(PartycategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::description = value;
  }-*/;

  native static Event PartycategoryListItemDisplay_Event_deleteEntityEvent(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void PartycategoryListItemDisplay_Event_deleteEntityEvent(PartycategoryListItemDisplay instance, Event<PartycategoryListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static AnchorElement PartycategoryListItemDisplay_AnchorElement_editEntityListItemBtn(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void PartycategoryListItemDisplay_AnchorElement_editEntityListItemBtn(PartycategoryListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static DataBinder PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder;
  }-*/;

  native static void PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance, DataBinder<Partycategory> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder = value;
  }-*/;

  native static Event PartycategoryListItemDisplay_Event_renderSingleViewEvent(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void PartycategoryListItemDisplay_Event_renderSingleViewEvent(PartycategoryListItemDisplay instance, Event<PartycategoryListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell PartycategoryListItemDisplay_TableCell_effectiveDt(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::effectiveDt;
  }-*/;

  native static void PartycategoryListItemDisplay_TableCell_effectiveDt(PartycategoryListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::effectiveDt = value;
  }-*/;

  native static Event PartycategoryListItemDisplay_Event_renderEditViewEvent(PartycategoryListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void PartycategoryListItemDisplay_Event_renderEditViewEvent(PartycategoryListItemDisplay instance, Event<PartycategoryListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay::renderEditViewEvent = value;
  }-*/;
}
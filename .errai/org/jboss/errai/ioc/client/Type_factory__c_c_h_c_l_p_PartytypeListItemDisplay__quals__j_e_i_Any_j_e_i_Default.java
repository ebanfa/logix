package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay;
import com.cloderia.helion.client.local.partytype.PartytypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Partytype;
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

public class Type_factory__c_c_h_c_l_p_PartytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartytypeListItemDisplay.class, "Type_factory__c_c_h_c_l_p_PartytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartytypeListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partytype/list-partytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartytypeListItemDisplay.class);
    handle.addAssignableType(PartytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartytypeListItemDisplay createInstance(final ContextManager contextManager) {
    final PartytypeListItemDisplay instance = new PartytypeListItemDisplay();
    setIncompleteInstance(instance);
    final Event PartytypeListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartytypeListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartytypeListItemDisplay_deleteEntityEvent);
    PartytypeListItemDisplay_Event_deleteEntityEvent(instance, PartytypeListItemDisplay_deleteEntityEvent);
    final DataBinder PartytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartytypePresenter_binder);
    PartytypePresenter_DataBinder_binder(instance, PartytypePresenter_binder);
    final TableCell PartytypeListItemDisplay_parentCategory = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_parentCategory);
    PartytypeListItemDisplay_TableCell_parentCategory(instance, PartytypeListItemDisplay_parentCategory);
    final TableCell PartytypeListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_effectiveDt);
    PartytypeListItemDisplay_TableCell_effectiveDt(instance, PartytypeListItemDisplay_effectiveDt);
    final AnchorElement PartytypeListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_deleteEntityListItemBtn);
    PartytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, PartytypeListItemDisplay_deleteEntityListItemBtn);
    final Event PartytypeListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartytypeListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartytypeListItemDisplay_renderEditViewEvent);
    PartytypeListItemDisplay_Event_renderEditViewEvent(instance, PartytypeListItemDisplay_renderEditViewEvent);
    final AnchorElement PartytypeListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_editEntityListItemBtn);
    PartytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance, PartytypeListItemDisplay_editEntityListItemBtn);
    final TableCell PartytypeListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_name);
    PartytypeListItemDisplay_TableCell_name(instance, PartytypeListItemDisplay_name);
    final TableCell PartytypeListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_description);
    PartytypeListItemDisplay_TableCell_description(instance, PartytypeListItemDisplay_description);
    final TableRow PartytypeListItemDisplay_partytypeItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_partytypeItem);
    PartytypeListItemDisplay_TableRow_partytypeItem(instance, PartytypeListItemDisplay_partytypeItem);
    final Event PartytypeListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartytypeListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, PartytypeListItemDisplay_renderSingleViewEvent);
    PartytypeListItemDisplay_Event_renderSingleViewEvent(instance, PartytypeListItemDisplay_renderSingleViewEvent);
    final TableCell PartytypeListItemDisplay_parentType = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_parentType);
    PartytypeListItemDisplay_TableCell_parentType(instance, PartytypeListItemDisplay_parentType);
    final TableCell PartytypeListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartytypeListItemDisplay_entityCode);
    PartytypeListItemDisplay_TableCell_entityCode(instance, PartytypeListItemDisplay_entityCode);
    c_c_h_c_l_p_PartytypeListItemDisplayTemplateResource templateForPartytypeListItemDisplay = GWT.create(c_c_h_c_l_p_PartytypeListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartytypeListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartytypeListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/partytype/list-partytype-page.html", "partytypeItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partytype/list-partytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableRow_partytypeItem(instance)));
      }
    }, dataFieldElements, "partytypeItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_parentType(instance)));
      }
    }, dataFieldElements, "parentType");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_parentCategory(instance)));
      }
    }, dataFieldElements, "parentCategory");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com/cloderia/helion/client/local/partytype/list-partytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("partytypeItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableRow_partytypeItem(instance))));
    templateFieldsMap.put("parentType", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_parentType(instance))));
    templateFieldsMap.put("parentCategory", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_parentCategory(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartytypeListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(PartytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(PartytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartytypeListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = PartytypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeListItemDisplay_TableCell_parentType(instance))), "parentType.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeListItemDisplay_TableCell_parentCategory(instance))), "parentCategory.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartytypeListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartytypeListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartytypeListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartytypeListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell PartytypeListItemDisplay_TableCell_description(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::description;
  }-*/;

  native static void PartytypeListItemDisplay_TableCell_description(PartytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::description = value;
  }-*/;

  native static DataBinder PartytypePresenter_DataBinder_binder(PartytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder;
  }-*/;

  native static void PartytypePresenter_DataBinder_binder(PartytypePresenter instance, DataBinder<Partytype> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypePresenter::binder = value;
  }-*/;

  native static Event PartytypeListItemDisplay_Event_deleteEntityEvent(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void PartytypeListItemDisplay_Event_deleteEntityEvent(PartytypeListItemDisplay instance, Event<PartytypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell PartytypeListItemDisplay_TableCell_effectiveDt(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::effectiveDt;
  }-*/;

  native static void PartytypeListItemDisplay_TableCell_effectiveDt(PartytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::effectiveDt = value;
  }-*/;

  native static AnchorElement PartytypeListItemDisplay_AnchorElement_editEntityListItemBtn(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void PartytypeListItemDisplay_AnchorElement_editEntityListItemBtn(PartytypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event PartytypeListItemDisplay_Event_renderSingleViewEvent(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void PartytypeListItemDisplay_Event_renderSingleViewEvent(PartytypeListItemDisplay instance, Event<PartytypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static Event PartytypeListItemDisplay_Event_renderEditViewEvent(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void PartytypeListItemDisplay_Event_renderEditViewEvent(PartytypeListItemDisplay instance, Event<PartytypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableRow PartytypeListItemDisplay_TableRow_partytypeItem(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::partytypeItem;
  }-*/;

  native static void PartytypeListItemDisplay_TableRow_partytypeItem(PartytypeListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::partytypeItem = value;
  }-*/;

  native static TableCell PartytypeListItemDisplay_TableCell_parentCategory(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::parentCategory;
  }-*/;

  native static void PartytypeListItemDisplay_TableCell_parentCategory(PartytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::parentCategory = value;
  }-*/;

  native static TableCell PartytypeListItemDisplay_TableCell_entityCode(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::entityCode;
  }-*/;

  native static void PartytypeListItemDisplay_TableCell_entityCode(PartytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell PartytypeListItemDisplay_TableCell_parentType(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::parentType;
  }-*/;

  native static void PartytypeListItemDisplay_TableCell_parentType(PartytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::parentType = value;
  }-*/;

  native static TableCell PartytypeListItemDisplay_TableCell_name(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::name;
  }-*/;

  native static void PartytypeListItemDisplay_TableCell_name(PartytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::name = value;
  }-*/;

  native static AnchorElement PartytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void PartytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartytypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;
}
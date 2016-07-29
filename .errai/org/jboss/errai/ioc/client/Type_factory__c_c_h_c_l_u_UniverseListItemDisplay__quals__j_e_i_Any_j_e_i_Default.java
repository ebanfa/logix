package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.local.universe.UniverseListItemDisplay;
import com.cloderia.helion.client.local.universe.UniversePresenter;
import com.cloderia.helion.client.shared.model.Universe;
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

public class Type_factory__c_c_h_c_l_u_UniverseListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(UniverseListItemDisplay.class, "Type_factory__c_c_h_c_l_u_UniverseListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_u_UniverseListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/universe/list-universe-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_u_UniverseListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(UniverseListItemDisplay.class);
    handle.addAssignableType(UniversePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public UniverseListItemDisplay createInstance(final ContextManager contextManager) {
    final UniverseListItemDisplay instance = new UniverseListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell UniverseListItemDisplay_parentUniverse = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_parentUniverse);
    UniverseListItemDisplay_TableCell_parentUniverse(instance, UniverseListItemDisplay_parentUniverse);
    final DataBinder UniversePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Universe.class }, new Annotation[] { });
    registerDependentScopedReference(instance, UniversePresenter_binder);
    UniversePresenter_DataBinder_binder(instance, UniversePresenter_binder);
    final TableCell UniverseListItemDisplay_businessNo = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_businessNo);
    UniverseListItemDisplay_TableCell_businessNo(instance, UniverseListItemDisplay_businessNo);
    final TableCell UniverseListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_name);
    UniverseListItemDisplay_TableCell_name(instance, UniverseListItemDisplay_name);
    final TableCell UniverseListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_effectiveDt);
    UniverseListItemDisplay_TableCell_effectiveDt(instance, UniverseListItemDisplay_effectiveDt);
    final TableCell UniverseListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_description);
    UniverseListItemDisplay_TableCell_description(instance, UniverseListItemDisplay_description);
    final AnchorElement UniverseListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_deleteEntityListItemBtn);
    UniverseListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, UniverseListItemDisplay_deleteEntityListItemBtn);
    final TableRow UniverseListItemDisplay_universeItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_universeItem);
    UniverseListItemDisplay_TableRow_universeItem(instance, UniverseListItemDisplay_universeItem);
    final TableCell UniverseListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_entityCode);
    UniverseListItemDisplay_TableCell_entityCode(instance, UniverseListItemDisplay_entityCode);
    final TableCell UniverseListItemDisplay_universeTyCd = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_universeTyCd);
    UniverseListItemDisplay_TableCell_universeTyCd(instance, UniverseListItemDisplay_universeTyCd);
    final Event UniverseListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UniverseListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, UniverseListItemDisplay_renderEditViewEvent);
    UniverseListItemDisplay_Event_renderEditViewEvent(instance, UniverseListItemDisplay_renderEditViewEvent);
    final Event UniverseListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UniverseListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, UniverseListItemDisplay_renderSingleViewEvent);
    UniverseListItemDisplay_Event_renderSingleViewEvent(instance, UniverseListItemDisplay_renderSingleViewEvent);
    final Event UniverseListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UniverseListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, UniverseListItemDisplay_deleteEntityEvent);
    UniverseListItemDisplay_Event_deleteEntityEvent(instance, UniverseListItemDisplay_deleteEntityEvent);
    final AnchorElement UniverseListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UniverseListItemDisplay_editEntityListItemBtn);
    UniverseListItemDisplay_AnchorElement_editEntityListItemBtn(instance, UniverseListItemDisplay_editEntityListItemBtn);
    c_c_h_c_l_u_UniverseListItemDisplayTemplateResource templateForUniverseListItemDisplay = GWT.create(c_c_h_c_l_u_UniverseListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfUniverseListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForUniverseListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/universe/list-universe-page.html", "universeItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/universe/list-universe-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableRow_universeItem(instance)));
      }
    }, dataFieldElements, "universeItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_parentUniverse(instance)));
      }
    }, dataFieldElements, "parentUniverse");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_businessNo(instance)));
      }
    }, dataFieldElements, "businessNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_universeTyCd(instance)));
      }
    }, dataFieldElements, "universeTyCd");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(UniverseListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com/cloderia/helion/client/local/universe/list-universe-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(UniverseListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("universeItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableRow_universeItem(instance))));
    templateFieldsMap.put("parentUniverse", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_parentUniverse(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("businessNo", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_businessNo(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("universeTyCd", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UniverseListItemDisplay_TableCell_universeTyCd(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(UniverseListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(UniverseListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUniverseListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = UniversePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.universe.UniverseListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseListItemDisplay_TableCell_parentUniverse(instance))), "parentUniverse.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseListItemDisplay_TableCell_businessNo(instance))), "businessNo", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(UniverseListItemDisplay_TableCell_universeTyCd(instance))), "universeTyCd", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((UniverseListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final UniverseListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(UniverseListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(UniverseListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final UniverseListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableRow UniverseListItemDisplay_TableRow_universeItem(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::universeItem;
  }-*/;

  native static void UniverseListItemDisplay_TableRow_universeItem(UniverseListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::universeItem = value;
  }-*/;

  native static TableCell UniverseListItemDisplay_TableCell_parentUniverse(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::parentUniverse;
  }-*/;

  native static void UniverseListItemDisplay_TableCell_parentUniverse(UniverseListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::parentUniverse = value;
  }-*/;

  native static AnchorElement UniverseListItemDisplay_AnchorElement_editEntityListItemBtn(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void UniverseListItemDisplay_AnchorElement_editEntityListItemBtn(UniverseListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static DataBinder UniversePresenter_DataBinder_binder(UniversePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder;
  }-*/;

  native static void UniversePresenter_DataBinder_binder(UniversePresenter instance, DataBinder<Universe> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniversePresenter::binder = value;
  }-*/;

  native static AnchorElement UniverseListItemDisplay_AnchorElement_deleteEntityListItemBtn(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void UniverseListItemDisplay_AnchorElement_deleteEntityListItemBtn(UniverseListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event UniverseListItemDisplay_Event_deleteEntityEvent(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void UniverseListItemDisplay_Event_deleteEntityEvent(UniverseListItemDisplay instance, Event<UniverseListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell UniverseListItemDisplay_TableCell_effectiveDt(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::effectiveDt;
  }-*/;

  native static void UniverseListItemDisplay_TableCell_effectiveDt(UniverseListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell UniverseListItemDisplay_TableCell_businessNo(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::businessNo;
  }-*/;

  native static void UniverseListItemDisplay_TableCell_businessNo(UniverseListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::businessNo = value;
  }-*/;

  native static TableCell UniverseListItemDisplay_TableCell_description(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::description;
  }-*/;

  native static void UniverseListItemDisplay_TableCell_description(UniverseListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::description = value;
  }-*/;

  native static TableCell UniverseListItemDisplay_TableCell_universeTyCd(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::universeTyCd;
  }-*/;

  native static void UniverseListItemDisplay_TableCell_universeTyCd(UniverseListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::universeTyCd = value;
  }-*/;

  native static Event UniverseListItemDisplay_Event_renderEditViewEvent(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void UniverseListItemDisplay_Event_renderEditViewEvent(UniverseListItemDisplay instance, Event<UniverseListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static Event UniverseListItemDisplay_Event_renderSingleViewEvent(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void UniverseListItemDisplay_Event_renderSingleViewEvent(UniverseListItemDisplay instance, Event<UniverseListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell UniverseListItemDisplay_TableCell_entityCode(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::entityCode;
  }-*/;

  native static void UniverseListItemDisplay_TableCell_entityCode(UniverseListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell UniverseListItemDisplay_TableCell_name(UniverseListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::name;
  }-*/;

  native static void UniverseListItemDisplay_TableCell_name(UniverseListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.universe.UniverseListItemDisplay::name = value;
  }-*/;
}
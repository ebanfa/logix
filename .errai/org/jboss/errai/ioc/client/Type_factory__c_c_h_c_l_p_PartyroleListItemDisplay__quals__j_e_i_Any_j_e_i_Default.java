package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay;
import com.cloderia.helion.client.local.partyrole.PartyrolePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Partyrole;
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

public class Type_factory__c_c_h_c_l_p_PartyroleListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroleListItemDisplay.class, "Type_factory__c_c_h_c_l_p_PartyroleListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroleListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyrole/list-partyrole-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroleListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroleListItemDisplay.class);
    handle.addAssignableType(PartyrolePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyroleListItemDisplay createInstance(final ContextManager contextManager) {
    final PartyroleListItemDisplay instance = new PartyroleListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell PartyroleListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_name);
    PartyroleListItemDisplay_TableCell_name(instance, PartyroleListItemDisplay_name);
    final TableCell PartyroleListItemDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_party);
    PartyroleListItemDisplay_TableCell_party(instance, PartyroleListItemDisplay_party);
    final DataBinder PartyrolePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyrole.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyrolePresenter_binder);
    PartyrolePresenter_DataBinder_binder(instance, PartyrolePresenter_binder);
    final TableCell PartyroleListItemDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_toDt);
    PartyroleListItemDisplay_TableCell_toDt(instance, PartyroleListItemDisplay_toDt);
    final TableCell PartyroleListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_description);
    PartyroleListItemDisplay_TableCell_description(instance, PartyroleListItemDisplay_description);
    final TableRow PartyroleListItemDisplay_partyroleItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_partyroleItem);
    PartyroleListItemDisplay_TableRow_partyroleItem(instance, PartyroleListItemDisplay_partyroleItem);
    final TableCell PartyroleListItemDisplay_partyRoleTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_partyRoleTy);
    PartyroleListItemDisplay_TableCell_partyRoleTy(instance, PartyroleListItemDisplay_partyRoleTy);
    final AnchorElement PartyroleListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_editEntityListItemBtn);
    PartyroleListItemDisplay_AnchorElement_editEntityListItemBtn(instance, PartyroleListItemDisplay_editEntityListItemBtn);
    final Event PartyroleListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroleListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartyroleListItemDisplay_renderEditViewEvent);
    PartyroleListItemDisplay_Event_renderEditViewEvent(instance, PartyroleListItemDisplay_renderEditViewEvent);
    final AnchorElement PartyroleListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_deleteEntityListItemBtn);
    PartyroleListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, PartyroleListItemDisplay_deleteEntityListItemBtn);
    final TableCell PartyroleListItemDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_fromDt);
    PartyroleListItemDisplay_TableCell_fromDt(instance, PartyroleListItemDisplay_fromDt);
    final TableCell PartyroleListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroleListItemDisplay_entityCode);
    PartyroleListItemDisplay_TableCell_entityCode(instance, PartyroleListItemDisplay_entityCode);
    final Event PartyroleListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroleListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, PartyroleListItemDisplay_renderSingleViewEvent);
    PartyroleListItemDisplay_Event_renderSingleViewEvent(instance, PartyroleListItemDisplay_renderSingleViewEvent);
    final Event PartyroleListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroleListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroleListItemDisplay_deleteEntityEvent);
    PartyroleListItemDisplay_Event_deleteEntityEvent(instance, PartyroleListItemDisplay_deleteEntityEvent);
    c_c_h_c_l_p_PartyroleListItemDisplayTemplateResource templateForPartyroleListItemDisplay = GWT.create(c_c_h_c_l_p_PartyroleListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartyroleListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartyroleListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", "partyroleItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableRow_partyroleItem(instance)));
      }
    }, dataFieldElements, "partyroleItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_partyRoleTy(instance)));
      }
    }, dataFieldElements, "partyRoleTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroleListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com/cloderia/helion/client/local/partyrole/list-partyrole-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroleListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("partyroleItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableRow_partyroleItem(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_party(instance))));
    templateFieldsMap.put("partyRoleTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_partyRoleTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroleListItemDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(PartyroleListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(PartyroleListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroleListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = PartyrolePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleListItemDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleListItemDisplay_TableCell_partyRoleTy(instance))), "partyRoleTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleListItemDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroleListItemDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroleListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroleListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroleListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroleListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroleListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell PartyroleListItemDisplay_TableCell_party(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::party;
  }-*/;

  native static void PartyroleListItemDisplay_TableCell_party(PartyroleListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::party = value;
  }-*/;

  native static DataBinder PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder;
  }-*/;

  native static void PartyrolePresenter_DataBinder_binder(PartyrolePresenter instance, DataBinder<Partyrole> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyrolePresenter::binder = value;
  }-*/;

  native static Event PartyroleListItemDisplay_Event_deleteEntityEvent(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void PartyroleListItemDisplay_Event_deleteEntityEvent(PartyroleListItemDisplay instance, Event<PartyroleListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell PartyroleListItemDisplay_TableCell_name(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::name;
  }-*/;

  native static void PartyroleListItemDisplay_TableCell_name(PartyroleListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::name = value;
  }-*/;

  native static TableCell PartyroleListItemDisplay_TableCell_toDt(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::toDt;
  }-*/;

  native static void PartyroleListItemDisplay_TableCell_toDt(PartyroleListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::toDt = value;
  }-*/;

  native static TableCell PartyroleListItemDisplay_TableCell_partyRoleTy(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::partyRoleTy;
  }-*/;

  native static void PartyroleListItemDisplay_TableCell_partyRoleTy(PartyroleListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::partyRoleTy = value;
  }-*/;

  native static TableCell PartyroleListItemDisplay_TableCell_fromDt(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::fromDt;
  }-*/;

  native static void PartyroleListItemDisplay_TableCell_fromDt(PartyroleListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::fromDt = value;
  }-*/;

  native static Event PartyroleListItemDisplay_Event_renderSingleViewEvent(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void PartyroleListItemDisplay_Event_renderSingleViewEvent(PartyroleListItemDisplay instance, Event<PartyroleListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell PartyroleListItemDisplay_TableCell_entityCode(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::entityCode;
  }-*/;

  native static void PartyroleListItemDisplay_TableCell_entityCode(PartyroleListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::entityCode = value;
  }-*/;

  native static AnchorElement PartyroleListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void PartyroleListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartyroleListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableRow PartyroleListItemDisplay_TableRow_partyroleItem(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::partyroleItem;
  }-*/;

  native static void PartyroleListItemDisplay_TableRow_partyroleItem(PartyroleListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::partyroleItem = value;
  }-*/;

  native static TableCell PartyroleListItemDisplay_TableCell_description(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::description;
  }-*/;

  native static void PartyroleListItemDisplay_TableCell_description(PartyroleListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::description = value;
  }-*/;

  native static AnchorElement PartyroleListItemDisplay_AnchorElement_editEntityListItemBtn(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void PartyroleListItemDisplay_AnchorElement_editEntityListItemBtn(PartyroleListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event PartyroleListItemDisplay_Event_renderEditViewEvent(PartyroleListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void PartyroleListItemDisplay_Event_renderEditViewEvent(PartyroleListItemDisplay instance, Event<PartyroleListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay::renderEditViewEvent = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay;
import com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Facilitytype;
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

public class Type_factory__c_c_h_c_l_f_FacilitytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypeListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilitytypeListItemDisplay.class, "Type_factory__c_c_h_c_l_f_FacilitytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_FacilitytypeListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_FacilitytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilitytypeListItemDisplay.class);
    handle.addAssignableType(FacilitytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilitytypeListItemDisplay createInstance(final ContextManager contextManager) {
    final FacilitytypeListItemDisplay instance = new FacilitytypeListItemDisplay();
    setIncompleteInstance(instance);
    final Event FacilitytypeListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilitytypeListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_renderEditViewEvent);
    FacilitytypeListItemDisplay_Event_renderEditViewEvent(instance, FacilitytypeListItemDisplay_renderEditViewEvent);
    final TableCell FacilitytypeListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_entityCode);
    FacilitytypeListItemDisplay_TableCell_entityCode(instance, FacilitytypeListItemDisplay_entityCode);
    final AnchorElement FacilitytypeListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_deleteEntityListItemBtn);
    FacilitytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, FacilitytypeListItemDisplay_deleteEntityListItemBtn);
    final Event FacilitytypeListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilitytypeListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_renderSingleViewEvent);
    FacilitytypeListItemDisplay_Event_renderSingleViewEvent(instance, FacilitytypeListItemDisplay_renderSingleViewEvent);
    final TableRow FacilitytypeListItemDisplay_facilitytypeItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_facilitytypeItem);
    FacilitytypeListItemDisplay_TableRow_facilitytypeItem(instance, FacilitytypeListItemDisplay_facilitytypeItem);
    final Event FacilitytypeListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilitytypeListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_deleteEntityEvent);
    FacilitytypeListItemDisplay_Event_deleteEntityEvent(instance, FacilitytypeListItemDisplay_deleteEntityEvent);
    final TableCell FacilitytypeListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_description);
    FacilitytypeListItemDisplay_TableCell_description(instance, FacilitytypeListItemDisplay_description);
    final TableCell FacilitytypeListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_effectiveDt);
    FacilitytypeListItemDisplay_TableCell_effectiveDt(instance, FacilitytypeListItemDisplay_effectiveDt);
    final AnchorElement FacilitytypeListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_editEntityListItemBtn);
    FacilitytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance, FacilitytypeListItemDisplay_editEntityListItemBtn);
    final TableCell FacilitytypeListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeListItemDisplay_name);
    FacilitytypeListItemDisplay_TableCell_name(instance, FacilitytypeListItemDisplay_name);
    final DataBinder FacilitytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facilitytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilitytypePresenter_binder);
    FacilitytypePresenter_DataBinder_binder(instance, FacilitytypePresenter_binder);
    c_c_h_c_l_f_FacilitytypeListItemDisplayTemplateResource templateForFacilitytypeListItemDisplay = GWT.create(c_c_h_c_l_f_FacilitytypeListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfFacilitytypeListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForFacilitytypeListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", "facilitytypeItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableRow_facilitytypeItem(instance)));
      }
    }, dataFieldElements, "facilitytypeItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilitytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com/cloderia/helion/client/local/facilitytype/list-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilitytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("facilitytypeItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableRow_facilitytypeItem(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(FacilitytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(FacilitytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = FacilitytypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(FacilitytypeListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilitytypeListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilitytypeListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilitytypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilitytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final FacilitytypeListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event FacilitytypeListItemDisplay_Event_renderSingleViewEvent(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void FacilitytypeListItemDisplay_Event_renderSingleViewEvent(FacilitytypeListItemDisplay instance, Event<FacilitytypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell FacilitytypeListItemDisplay_TableCell_entityCode(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::entityCode;
  }-*/;

  native static void FacilitytypeListItemDisplay_TableCell_entityCode(FacilitytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell FacilitytypeListItemDisplay_TableCell_name(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::name;
  }-*/;

  native static void FacilitytypeListItemDisplay_TableCell_name(FacilitytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::name = value;
  }-*/;

  native static AnchorElement FacilitytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void FacilitytypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(FacilitytypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell FacilitytypeListItemDisplay_TableCell_effectiveDt(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::effectiveDt;
  }-*/;

  native static void FacilitytypeListItemDisplay_TableCell_effectiveDt(FacilitytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::effectiveDt = value;
  }-*/;

  native static AnchorElement FacilitytypeListItemDisplay_AnchorElement_editEntityListItemBtn(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void FacilitytypeListItemDisplay_AnchorElement_editEntityListItemBtn(FacilitytypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static DataBinder FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder;
  }-*/;

  native static void FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance, DataBinder<Facilitytype> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder = value;
  }-*/;

  native static TableRow FacilitytypeListItemDisplay_TableRow_facilitytypeItem(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::facilitytypeItem;
  }-*/;

  native static void FacilitytypeListItemDisplay_TableRow_facilitytypeItem(FacilitytypeListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::facilitytypeItem = value;
  }-*/;

  native static TableCell FacilitytypeListItemDisplay_TableCell_description(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::description;
  }-*/;

  native static void FacilitytypeListItemDisplay_TableCell_description(FacilitytypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::description = value;
  }-*/;

  native static Event FacilitytypeListItemDisplay_Event_renderEditViewEvent(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void FacilitytypeListItemDisplay_Event_renderEditViewEvent(FacilitytypeListItemDisplay instance, Event<FacilitytypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static Event FacilitytypeListItemDisplay_Event_deleteEntityEvent(FacilitytypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void FacilitytypeListItemDisplay_Event_deleteEntityEvent(FacilitytypeListItemDisplay instance, Event<FacilitytypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay::deleteEntityEvent = value;
  }-*/;
}
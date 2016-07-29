package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccounttypeListItemDisplay.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccounttypeListItemDisplay.class);
    handle.addAssignableType(GeneralledgeraccounttypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccounttypeListItemDisplay createInstance(final ContextManager contextManager) {
    final GeneralledgeraccounttypeListItemDisplay instance = new GeneralledgeraccounttypeListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell GeneralledgeraccounttypeListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_description);
    GeneralledgeraccounttypeListItemDisplay_TableCell_description(instance, GeneralledgeraccounttypeListItemDisplay_description);
    final Event GeneralledgeraccounttypeListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccounttypeListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_renderSingleViewEvent);
    GeneralledgeraccounttypeListItemDisplay_Event_renderSingleViewEvent(instance, GeneralledgeraccounttypeListItemDisplay_renderSingleViewEvent);
    final TableCell GeneralledgeraccounttypeListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_entityCode);
    GeneralledgeraccounttypeListItemDisplay_TableCell_entityCode(instance, GeneralledgeraccounttypeListItemDisplay_entityCode);
    final TableCell GeneralledgeraccounttypeListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_name);
    GeneralledgeraccounttypeListItemDisplay_TableCell_name(instance, GeneralledgeraccounttypeListItemDisplay_name);
    final Event GeneralledgeraccounttypeListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccounttypeListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_renderEditViewEvent);
    GeneralledgeraccounttypeListItemDisplay_Event_renderEditViewEvent(instance, GeneralledgeraccounttypeListItemDisplay_renderEditViewEvent);
    final TableCell GeneralledgeraccounttypeListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_effectiveDt);
    GeneralledgeraccounttypeListItemDisplay_TableCell_effectiveDt(instance, GeneralledgeraccounttypeListItemDisplay_effectiveDt);
    final AnchorElement GeneralledgeraccounttypeListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_deleteEntityListItemBtn);
    GeneralledgeraccounttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, GeneralledgeraccounttypeListItemDisplay_deleteEntityListItemBtn);
    final DataBinder GeneralledgeraccounttypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccounttype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccounttypePresenter_binder);
    GeneralledgeraccounttypePresenter_DataBinder_binder(instance, GeneralledgeraccounttypePresenter_binder);
    final Event GeneralledgeraccounttypeListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccounttypeListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_deleteEntityEvent);
    GeneralledgeraccounttypeListItemDisplay_Event_deleteEntityEvent(instance, GeneralledgeraccounttypeListItemDisplay_deleteEntityEvent);
    final AnchorElement GeneralledgeraccounttypeListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_editEntityListItemBtn);
    GeneralledgeraccounttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance, GeneralledgeraccounttypeListItemDisplay_editEntityListItemBtn);
    final TableRow GeneralledgeraccounttypeListItemDisplay_generalledgeraccounttypeItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccounttypeListItemDisplay_generalledgeraccounttypeItem);
    GeneralledgeraccounttypeListItemDisplay_TableRow_generalledgeraccounttypeItem(instance, GeneralledgeraccounttypeListItemDisplay_generalledgeraccounttypeItem);
    c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplayTemplateResource templateForGeneralledgeraccounttypeListItemDisplay = GWT.create(c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfGeneralledgeraccounttypeListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForGeneralledgeraccounttypeListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", "generalledgeraccounttypeItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableRow_generalledgeraccounttypeItem(instance)));
      }
    }, dataFieldElements, "generalledgeraccounttypeItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccounttype/list-generalledgeraccounttype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("generalledgeraccounttypeItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableRow_generalledgeraccounttypeItem(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccounttypeListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = GeneralledgeraccounttypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccounttypeListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccounttypeListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccounttypeListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccounttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final GeneralledgeraccounttypeListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement GeneralledgeraccounttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(GeneralledgeraccounttypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event GeneralledgeraccounttypeListItemDisplay_Event_renderSingleViewEvent(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_Event_renderSingleViewEvent(GeneralledgeraccounttypeListItemDisplay instance, Event<GeneralledgeraccounttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeListItemDisplay_TableCell_effectiveDt(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::effectiveDt;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_TableCell_effectiveDt(GeneralledgeraccounttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeListItemDisplay_TableCell_name(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::name;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_TableCell_name(GeneralledgeraccounttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::name = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeListItemDisplay_TableCell_description(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::description;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_TableCell_description(GeneralledgeraccounttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::description = value;
  }-*/;

  native static AnchorElement GeneralledgeraccounttypeListItemDisplay_AnchorElement_editEntityListItemBtn(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_AnchorElement_editEntityListItemBtn(GeneralledgeraccounttypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static DataBinder GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder;
  }-*/;

  native static void GeneralledgeraccounttypePresenter_DataBinder_binder(GeneralledgeraccounttypePresenter instance, DataBinder<Generalledgeraccounttype> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter::binder = value;
  }-*/;

  native static TableRow GeneralledgeraccounttypeListItemDisplay_TableRow_generalledgeraccounttypeItem(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::generalledgeraccounttypeItem;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_TableRow_generalledgeraccounttypeItem(GeneralledgeraccounttypeListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::generalledgeraccounttypeItem = value;
  }-*/;

  native static TableCell GeneralledgeraccounttypeListItemDisplay_TableCell_entityCode(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::entityCode;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_TableCell_entityCode(GeneralledgeraccounttypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::entityCode = value;
  }-*/;

  native static Event GeneralledgeraccounttypeListItemDisplay_Event_deleteEntityEvent(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_Event_deleteEntityEvent(GeneralledgeraccounttypeListItemDisplay instance, Event<GeneralledgeraccounttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static Event GeneralledgeraccounttypeListItemDisplay_Event_renderEditViewEvent(GeneralledgeraccounttypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void GeneralledgeraccounttypeListItemDisplay_Event_renderEditViewEvent(GeneralledgeraccounttypeListItemDisplay instance, Event<GeneralledgeraccounttypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay::renderEditViewEvent = value;
  }-*/;
}
package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Generalledgeraccount;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccountListItemDisplay.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_GeneralledgeraccountListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccountListItemDisplay.class);
    handle.addAssignableType(GeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccountListItemDisplay createInstance(final ContextManager contextManager) {
    final GeneralledgeraccountListItemDisplay instance = new GeneralledgeraccountListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell GeneralledgeraccountListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_name);
    GeneralledgeraccountListItemDisplay_TableCell_name(instance, GeneralledgeraccountListItemDisplay_name);
    final DataBinder GeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccountPresenter_binder);
    GeneralledgeraccountPresenter_DataBinder_binder(instance, GeneralledgeraccountPresenter_binder);
    final TableCell GeneralledgeraccountListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_description);
    GeneralledgeraccountListItemDisplay_TableCell_description(instance, GeneralledgeraccountListItemDisplay_description);
    final Event GeneralledgeraccountListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccountListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_renderEditViewEvent);
    GeneralledgeraccountListItemDisplay_Event_renderEditViewEvent(instance, GeneralledgeraccountListItemDisplay_renderEditViewEvent);
    final TableCell GeneralledgeraccountListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_entityCode);
    GeneralledgeraccountListItemDisplay_TableCell_entityCode(instance, GeneralledgeraccountListItemDisplay_entityCode);
    final AnchorElement GeneralledgeraccountListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_deleteEntityListItemBtn);
    GeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, GeneralledgeraccountListItemDisplay_deleteEntityListItemBtn);
    final TableCell GeneralledgeraccountListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_effectiveDt);
    GeneralledgeraccountListItemDisplay_TableCell_effectiveDt(instance, GeneralledgeraccountListItemDisplay_effectiveDt);
    final TableCell GeneralledgeraccountListItemDisplay_glAcctTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_glAcctTy);
    GeneralledgeraccountListItemDisplay_TableCell_glAcctTy(instance, GeneralledgeraccountListItemDisplay_glAcctTy);
    final Event GeneralledgeraccountListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccountListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_renderSingleViewEvent);
    GeneralledgeraccountListItemDisplay_Event_renderSingleViewEvent(instance, GeneralledgeraccountListItemDisplay_renderSingleViewEvent);
    final TableRow GeneralledgeraccountListItemDisplay_generalledgeraccountItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_generalledgeraccountItem);
    GeneralledgeraccountListItemDisplay_TableRow_generalledgeraccountItem(instance, GeneralledgeraccountListItemDisplay_generalledgeraccountItem);
    final AnchorElement GeneralledgeraccountListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_editEntityListItemBtn);
    GeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance, GeneralledgeraccountListItemDisplay_editEntityListItemBtn);
    final Event GeneralledgeraccountListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccountListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccountListItemDisplay_deleteEntityEvent);
    GeneralledgeraccountListItemDisplay_Event_deleteEntityEvent(instance, GeneralledgeraccountListItemDisplay_deleteEntityEvent);
    c_c_h_c_l_g_GeneralledgeraccountListItemDisplayTemplateResource templateForGeneralledgeraccountListItemDisplay = GWT.create(c_c_h_c_l_g_GeneralledgeraccountListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfGeneralledgeraccountListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForGeneralledgeraccountListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", "generalledgeraccountItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableRow_generalledgeraccountItem(instance)));
      }
    }, dataFieldElements, "generalledgeraccountItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_glAcctTy(instance)));
      }
    }, dataFieldElements, "glAcctTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/generalledgeraccount/list-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("generalledgeraccountItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableRow_generalledgeraccountItem(instance))));
    templateFieldsMap.put("glAcctTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_glAcctTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(GeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(GeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = GeneralledgeraccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_glAcctTy(instance))), "glAcctTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccountListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccountListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final GeneralledgeraccountListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell GeneralledgeraccountListItemDisplay_TableCell_description(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::description;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_TableCell_description(GeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::description = value;
  }-*/;

  native static TableRow GeneralledgeraccountListItemDisplay_TableRow_generalledgeraccountItem(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::generalledgeraccountItem;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_TableRow_generalledgeraccountItem(GeneralledgeraccountListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::generalledgeraccountItem = value;
  }-*/;

  native static DataBinder GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder;
  }-*/;

  native static void GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance, DataBinder<Generalledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder = value;
  }-*/;

  native static Event GeneralledgeraccountListItemDisplay_Event_renderEditViewEvent(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_Event_renderEditViewEvent(GeneralledgeraccountListItemDisplay instance, Event<GeneralledgeraccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell GeneralledgeraccountListItemDisplay_TableCell_entityCode(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::entityCode;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_TableCell_entityCode(GeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::entityCode = value;
  }-*/;

  native static Event GeneralledgeraccountListItemDisplay_Event_deleteEntityEvent(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_Event_deleteEntityEvent(GeneralledgeraccountListItemDisplay instance, Event<GeneralledgeraccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static AnchorElement GeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(GeneralledgeraccountListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event GeneralledgeraccountListItemDisplay_Event_renderSingleViewEvent(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_Event_renderSingleViewEvent(GeneralledgeraccountListItemDisplay instance, Event<GeneralledgeraccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell GeneralledgeraccountListItemDisplay_TableCell_name(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::name;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_TableCell_name(GeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::name = value;
  }-*/;

  native static AnchorElement GeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(GeneralledgeraccountListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell GeneralledgeraccountListItemDisplay_TableCell_effectiveDt(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::effectiveDt;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_TableCell_effectiveDt(GeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell GeneralledgeraccountListItemDisplay_TableCell_glAcctTy(GeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::glAcctTy;
  }-*/;

  native static void GeneralledgeraccountListItemDisplay_TableCell_glAcctTy(GeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay::glAcctTy = value;
  }-*/;
}
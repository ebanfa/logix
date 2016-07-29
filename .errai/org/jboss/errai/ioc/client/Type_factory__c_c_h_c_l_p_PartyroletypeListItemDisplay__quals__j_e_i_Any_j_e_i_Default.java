package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay;
import com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Partyroletype;
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

public class Type_factory__c_c_h_c_l_p_PartyroletypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyroletypeListItemDisplay.class, "Type_factory__c_c_h_c_l_p_PartyroletypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyroletypeListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyroletypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyroletypeListItemDisplay.class);
    handle.addAssignableType(PartyroletypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyroletypeListItemDisplay createInstance(final ContextManager contextManager) {
    final PartyroletypeListItemDisplay instance = new PartyroletypeListItemDisplay();
    setIncompleteInstance(instance);
    final TableRow PartyroletypeListItemDisplay_partyroletypeItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_partyroletypeItem);
    PartyroletypeListItemDisplay_TableRow_partyroletypeItem(instance, PartyroletypeListItemDisplay_partyroletypeItem);
    final AnchorElement PartyroletypeListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_deleteEntityListItemBtn);
    PartyroletypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, PartyroletypeListItemDisplay_deleteEntityListItemBtn);
    final TableCell PartyroletypeListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_name);
    PartyroletypeListItemDisplay_TableCell_name(instance, PartyroletypeListItemDisplay_name);
    final Event PartyroletypeListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroletypeListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_renderSingleViewEvent);
    PartyroletypeListItemDisplay_Event_renderSingleViewEvent(instance, PartyroletypeListItemDisplay_renderSingleViewEvent);
    final Event PartyroletypeListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroletypeListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_renderEditViewEvent);
    PartyroletypeListItemDisplay_Event_renderEditViewEvent(instance, PartyroletypeListItemDisplay_renderEditViewEvent);
    final TableCell PartyroletypeListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_description);
    PartyroletypeListItemDisplay_TableCell_description(instance, PartyroletypeListItemDisplay_description);
    final TableCell PartyroletypeListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_effectiveDt);
    PartyroletypeListItemDisplay_TableCell_effectiveDt(instance, PartyroletypeListItemDisplay_effectiveDt);
    final AnchorElement PartyroletypeListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_editEntityListItemBtn);
    PartyroletypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance, PartyroletypeListItemDisplay_editEntityListItemBtn);
    final TableCell PartyroletypeListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_entityCode);
    PartyroletypeListItemDisplay_TableCell_entityCode(instance, PartyroletypeListItemDisplay_entityCode);
    final TableCell PartyroletypeListItemDisplay_parentRoleTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_parentRoleTy);
    PartyroletypeListItemDisplay_TableCell_parentRoleTy(instance, PartyroletypeListItemDisplay_parentRoleTy);
    final Event PartyroletypeListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyroletypeListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyroletypeListItemDisplay_deleteEntityEvent);
    PartyroletypeListItemDisplay_Event_deleteEntityEvent(instance, PartyroletypeListItemDisplay_deleteEntityEvent);
    final DataBinder PartyroletypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partyroletype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyroletypePresenter_binder);
    PartyroletypePresenter_DataBinder_binder(instance, PartyroletypePresenter_binder);
    c_c_h_c_l_p_PartyroletypeListItemDisplayTemplateResource templateForPartyroletypeListItemDisplay = GWT.create(c_c_h_c_l_p_PartyroletypeListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartyroletypeListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartyroletypeListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", "partyroletypeItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableRow_partyroletypeItem(instance)));
      }
    }, dataFieldElements, "partyroletypeItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_parentRoleTy(instance)));
      }
    }, dataFieldElements, "parentRoleTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroletypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com/cloderia/helion/client/local/partyroletype/list-partyroletype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyroletypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("partyroletypeItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableRow_partyroletypeItem(instance))));
    templateFieldsMap.put("parentRoleTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_parentRoleTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyroletypeListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(PartyroletypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(PartyroletypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyroletypeListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = PartyroletypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeListItemDisplay_TableCell_parentRoleTy(instance))), "parentRoleTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyroletypeListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyroletypeListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyroletypeListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroletypeListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyroletypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyroletypeListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableRow PartyroletypeListItemDisplay_TableRow_partyroletypeItem(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::partyroletypeItem;
  }-*/;

  native static void PartyroletypeListItemDisplay_TableRow_partyroletypeItem(PartyroletypeListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::partyroletypeItem = value;
  }-*/;

  native static AnchorElement PartyroletypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void PartyroletypeListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartyroletypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event PartyroletypeListItemDisplay_Event_renderEditViewEvent(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void PartyroletypeListItemDisplay_Event_renderEditViewEvent(PartyroletypeListItemDisplay instance, Event<PartyroletypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell PartyroletypeListItemDisplay_TableCell_parentRoleTy(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::parentRoleTy;
  }-*/;

  native static void PartyroletypeListItemDisplay_TableCell_parentRoleTy(PartyroletypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::parentRoleTy = value;
  }-*/;

  native static TableCell PartyroletypeListItemDisplay_TableCell_effectiveDt(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::effectiveDt;
  }-*/;

  native static void PartyroletypeListItemDisplay_TableCell_effectiveDt(PartyroletypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell PartyroletypeListItemDisplay_TableCell_entityCode(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::entityCode;
  }-*/;

  native static void PartyroletypeListItemDisplay_TableCell_entityCode(PartyroletypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::entityCode = value;
  }-*/;

  native static AnchorElement PartyroletypeListItemDisplay_AnchorElement_editEntityListItemBtn(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void PartyroletypeListItemDisplay_AnchorElement_editEntityListItemBtn(PartyroletypeListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event PartyroletypeListItemDisplay_Event_deleteEntityEvent(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void PartyroletypeListItemDisplay_Event_deleteEntityEvent(PartyroletypeListItemDisplay instance, Event<PartyroletypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell PartyroletypeListItemDisplay_TableCell_description(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::description;
  }-*/;

  native static void PartyroletypeListItemDisplay_TableCell_description(PartyroletypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::description = value;
  }-*/;

  native static TableCell PartyroletypeListItemDisplay_TableCell_name(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::name;
  }-*/;

  native static void PartyroletypeListItemDisplay_TableCell_name(PartyroletypeListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::name = value;
  }-*/;

  native static Event PartyroletypeListItemDisplay_Event_renderSingleViewEvent(PartyroletypeListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void PartyroletypeListItemDisplay_Event_renderSingleViewEvent(PartyroletypeListItemDisplay instance, Event<PartyroletypeListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static DataBinder PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder;
  }-*/;

  native static void PartyroletypePresenter_DataBinder_binder(PartyroletypePresenter instance, DataBinder<Partyroletype> value) /*-{
    instance.@com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter::binder = value;
  }-*/;
}
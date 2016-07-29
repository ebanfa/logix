package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.party.PartyListItemDisplay;
import com.cloderia.helion.client.local.party.PartyPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Party;
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

public class Type_factory__c_c_h_c_l_p_PartyListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartyListItemDisplay.class, "Type_factory__c_c_h_c_l_p_PartyListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartyListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/party/list-party-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartyListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartyListItemDisplay.class);
    handle.addAssignableType(PartyPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartyListItemDisplay createInstance(final ContextManager contextManager) {
    final PartyListItemDisplay instance = new PartyListItemDisplay();
    setIncompleteInstance(instance);
    final TableRow PartyListItemDisplay_partyItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_partyItem);
    PartyListItemDisplay_TableRow_partyItem(instance, PartyListItemDisplay_partyItem);
    final TableCell PartyListItemDisplay_partyTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_partyTy);
    PartyListItemDisplay_TableCell_partyTy(instance, PartyListItemDisplay_partyTy);
    final TableCell PartyListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_entityCode);
    PartyListItemDisplay_TableCell_entityCode(instance, PartyListItemDisplay_entityCode);
    final TableCell PartyListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_name);
    PartyListItemDisplay_TableCell_name(instance, PartyListItemDisplay_name);
    final TableCell PartyListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_description);
    PartyListItemDisplay_TableCell_description(instance, PartyListItemDisplay_description);
    final DataBinder PartyPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Party.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartyPresenter_binder);
    PartyPresenter_DataBinder_binder(instance, PartyPresenter_binder);
    final Event PartyListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartyListItemDisplay_renderEditViewEvent);
    PartyListItemDisplay_Event_renderEditViewEvent(instance, PartyListItemDisplay_renderEditViewEvent);
    final Event PartyListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartyListItemDisplay_deleteEntityEvent);
    PartyListItemDisplay_Event_deleteEntityEvent(instance, PartyListItemDisplay_deleteEntityEvent);
    final AnchorElement PartyListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_editEntityListItemBtn);
    PartyListItemDisplay_AnchorElement_editEntityListItemBtn(instance, PartyListItemDisplay_editEntityListItemBtn);
    final TableCell PartyListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_effectiveDt);
    PartyListItemDisplay_TableCell_effectiveDt(instance, PartyListItemDisplay_effectiveDt);
    final AnchorElement PartyListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartyListItemDisplay_deleteEntityListItemBtn);
    PartyListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, PartyListItemDisplay_deleteEntityListItemBtn);
    final Event PartyListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartyListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, PartyListItemDisplay_renderSingleViewEvent);
    PartyListItemDisplay_Event_renderSingleViewEvent(instance, PartyListItemDisplay_renderSingleViewEvent);
    c_c_h_c_l_p_PartyListItemDisplayTemplateResource templateForPartyListItemDisplay = GWT.create(c_c_h_c_l_p_PartyListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartyListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartyListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/party/list-party-page.html", "partyItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/party/list-party-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableRow_partyItem(instance)));
      }
    }, dataFieldElements, "partyItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_partyTy(instance)));
      }
    }, dataFieldElements, "partyTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com/cloderia/helion/client/local/party/list-party-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartyListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("partyItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableRow_partyItem(instance))));
    templateFieldsMap.put("partyTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_partyTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartyListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(PartyListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(PartyListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartyListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = PartyPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.party.PartyListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyListItemDisplay_TableCell_partyTy(instance))), "partyTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartyListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartyListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartyListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartyListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartyListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell PartyListItemDisplay_TableCell_partyTy(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::partyTy;
  }-*/;

  native static void PartyListItemDisplay_TableCell_partyTy(PartyListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::partyTy = value;
  }-*/;

  native static AnchorElement PartyListItemDisplay_AnchorElement_editEntityListItemBtn(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void PartyListItemDisplay_AnchorElement_editEntityListItemBtn(PartyListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static TableCell PartyListItemDisplay_TableCell_entityCode(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::entityCode;
  }-*/;

  native static void PartyListItemDisplay_TableCell_entityCode(PartyListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::entityCode = value;
  }-*/;

  native static AnchorElement PartyListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void PartyListItemDisplay_AnchorElement_deleteEntityListItemBtn(PartyListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static Event PartyListItemDisplay_Event_renderSingleViewEvent(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void PartyListItemDisplay_Event_renderSingleViewEvent(PartyListItemDisplay instance, Event<PartyListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell PartyListItemDisplay_TableCell_name(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::name;
  }-*/;

  native static void PartyListItemDisplay_TableCell_name(PartyListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::name = value;
  }-*/;

  native static TableCell PartyListItemDisplay_TableCell_description(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::description;
  }-*/;

  native static void PartyListItemDisplay_TableCell_description(PartyListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::description = value;
  }-*/;

  native static TableRow PartyListItemDisplay_TableRow_partyItem(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::partyItem;
  }-*/;

  native static void PartyListItemDisplay_TableRow_partyItem(PartyListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::partyItem = value;
  }-*/;

  native static Event PartyListItemDisplay_Event_deleteEntityEvent(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void PartyListItemDisplay_Event_deleteEntityEvent(PartyListItemDisplay instance, Event<PartyListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static DataBinder PartyPresenter_DataBinder_binder(PartyPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder;
  }-*/;

  native static void PartyPresenter_DataBinder_binder(PartyPresenter instance, DataBinder<Party> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyPresenter::binder = value;
  }-*/;

  native static Event PartyListItemDisplay_Event_renderEditViewEvent(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void PartyListItemDisplay_Event_renderEditViewEvent(PartyListItemDisplay instance, Event<PartyListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell PartyListItemDisplay_TableCell_effectiveDt(PartyListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::effectiveDt;
  }-*/;

  native static void PartyListItemDisplay_TableCell_effectiveDt(PartyListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.party.PartyListItemDisplay::effectiveDt = value;
  }-*/;
}
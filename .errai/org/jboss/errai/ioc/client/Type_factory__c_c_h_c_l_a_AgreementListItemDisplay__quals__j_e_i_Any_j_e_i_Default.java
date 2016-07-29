package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.agreement.AgreementListItemDisplay;
import com.cloderia.helion.client.local.agreement.AgreementPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Agreement;
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

public class Type_factory__c_c_h_c_l_a_AgreementListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AgreementListItemDisplay.class, "Type_factory__c_c_h_c_l_a_AgreementListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AgreementListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/agreement/list-agreement-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AgreementListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AgreementListItemDisplay.class);
    handle.addAssignableType(AgreementPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AgreementListItemDisplay createInstance(final ContextManager contextManager) {
    final AgreementListItemDisplay instance = new AgreementListItemDisplay();
    setIncompleteInstance(instance);
    final TableRow AgreementListItemDisplay_agreementItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_agreementItem);
    AgreementListItemDisplay_TableRow_agreementItem(instance, AgreementListItemDisplay_agreementItem);
    final TableCell AgreementListItemDisplay_agreementTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_agreementTy);
    AgreementListItemDisplay_TableCell_agreementTy(instance, AgreementListItemDisplay_agreementTy);
    final AnchorElement AgreementListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_editEntityListItemBtn);
    AgreementListItemDisplay_AnchorElement_editEntityListItemBtn(instance, AgreementListItemDisplay_editEntityListItemBtn);
    final TableCell AgreementListItemDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_toDt);
    AgreementListItemDisplay_TableCell_toDt(instance, AgreementListItemDisplay_toDt);
    final TableCell AgreementListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_description);
    AgreementListItemDisplay_TableCell_description(instance, AgreementListItemDisplay_description);
    final TableCell AgreementListItemDisplay_agreementDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_agreementDt);
    AgreementListItemDisplay_TableCell_agreementDt(instance, AgreementListItemDisplay_agreementDt);
    final AnchorElement AgreementListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_deleteEntityListItemBtn);
    AgreementListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, AgreementListItemDisplay_deleteEntityListItemBtn);
    final Event AgreementListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AgreementListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, AgreementListItemDisplay_renderSingleViewEvent);
    AgreementListItemDisplay_Event_renderSingleViewEvent(instance, AgreementListItemDisplay_renderSingleViewEvent);
    final DataBinder AgreementPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Agreement.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AgreementPresenter_binder);
    AgreementPresenter_DataBinder_binder(instance, AgreementPresenter_binder);
    final TableCell AgreementListItemDisplay_text = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_text);
    AgreementListItemDisplay_TableCell_text(instance, AgreementListItemDisplay_text);
    final TableCell AgreementListItemDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_fromDt);
    AgreementListItemDisplay_TableCell_fromDt(instance, AgreementListItemDisplay_fromDt);
    final Event AgreementListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AgreementListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, AgreementListItemDisplay_deleteEntityEvent);
    AgreementListItemDisplay_Event_deleteEntityEvent(instance, AgreementListItemDisplay_deleteEntityEvent);
    final TableCell AgreementListItemDisplay_partyRel = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_partyRel);
    AgreementListItemDisplay_TableCell_partyRel(instance, AgreementListItemDisplay_partyRel);
    final Event AgreementListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AgreementListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, AgreementListItemDisplay_renderEditViewEvent);
    AgreementListItemDisplay_Event_renderEditViewEvent(instance, AgreementListItemDisplay_renderEditViewEvent);
    final TableCell AgreementListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_name);
    AgreementListItemDisplay_TableCell_name(instance, AgreementListItemDisplay_name);
    final TableCell AgreementListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementListItemDisplay_entityCode);
    AgreementListItemDisplay_TableCell_entityCode(instance, AgreementListItemDisplay_entityCode);
    c_c_h_c_l_a_AgreementListItemDisplayTemplateResource templateForAgreementListItemDisplay = GWT.create(c_c_h_c_l_a_AgreementListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfAgreementListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForAgreementListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/agreement/list-agreement-page.html", "agreementItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/agreement/list-agreement-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableRow_agreementItem(instance)));
      }
    }, dataFieldElements, "agreementItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_agreementTy(instance)));
      }
    }, dataFieldElements, "agreementTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_partyRel(instance)));
      }
    }, dataFieldElements, "partyRel");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_text(instance)));
      }
    }, dataFieldElements, "text");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_agreementDt(instance)));
      }
    }, dataFieldElements, "agreementDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AgreementListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com/cloderia/helion/client/local/agreement/list-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AgreementListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("agreementItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableRow_agreementItem(instance))));
    templateFieldsMap.put("agreementTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_agreementTy(instance))));
    templateFieldsMap.put("partyRel", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_partyRel(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("text", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_text(instance))));
    templateFieldsMap.put("agreementDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_agreementDt(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementListItemDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(AgreementListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(AgreementListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = AgreementPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.agreement.AgreementListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_agreementTy(instance))), "agreementTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_partyRel(instance))), "partyRel.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_text(instance))), "text", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_agreementDt(instance))), "agreementDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementListItemDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AgreementListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final AgreementListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AgreementListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AgreementListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AgreementListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell AgreementListItemDisplay_TableCell_partyRel(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::partyRel;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_partyRel(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::partyRel = value;
  }-*/;

  native static DataBinder AgreementPresenter_DataBinder_binder(AgreementPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder;
  }-*/;

  native static void AgreementPresenter_DataBinder_binder(AgreementPresenter instance, DataBinder<Agreement> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder = value;
  }-*/;

  native static TableRow AgreementListItemDisplay_TableRow_agreementItem(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::agreementItem;
  }-*/;

  native static void AgreementListItemDisplay_TableRow_agreementItem(AgreementListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::agreementItem = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_toDt(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::toDt;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_toDt(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::toDt = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_entityCode(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::entityCode;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_entityCode(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_name(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::name;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_name(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::name = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_agreementTy(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::agreementTy;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_agreementTy(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::agreementTy = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_text(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::text;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_text(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::text = value;
  }-*/;

  native static Event AgreementListItemDisplay_Event_renderEditViewEvent(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void AgreementListItemDisplay_Event_renderEditViewEvent(AgreementListItemDisplay instance, Event<AgreementListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement AgreementListItemDisplay_AnchorElement_editEntityListItemBtn(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void AgreementListItemDisplay_AnchorElement_editEntityListItemBtn(AgreementListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static AnchorElement AgreementListItemDisplay_AnchorElement_deleteEntityListItemBtn(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void AgreementListItemDisplay_AnchorElement_deleteEntityListItemBtn(AgreementListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_agreementDt(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::agreementDt;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_agreementDt(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::agreementDt = value;
  }-*/;

  native static Event AgreementListItemDisplay_Event_deleteEntityEvent(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void AgreementListItemDisplay_Event_deleteEntityEvent(AgreementListItemDisplay instance, Event<AgreementListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_description(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::description;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_description(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::description = value;
  }-*/;

  native static Event AgreementListItemDisplay_Event_renderSingleViewEvent(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void AgreementListItemDisplay_Event_renderSingleViewEvent(AgreementListItemDisplay instance, Event<AgreementListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell AgreementListItemDisplay_TableCell_fromDt(AgreementListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::fromDt;
  }-*/;

  native static void AgreementListItemDisplay_TableCell_fromDt(AgreementListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementListItemDisplay::fromDt = value;
  }-*/;
}
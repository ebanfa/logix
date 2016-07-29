package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.agreement.AgreementDisplay;
import com.cloderia.helion.client.local.agreement.AgreementPresenter;
import com.cloderia.helion.client.local.agreement.ListAgreementPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.TableCell;
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
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_c_h_c_l_a_AgreementDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(AgreementDisplay.class, "Type_factory__c_c_h_c_l_a_AgreementDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_a_AgreementDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/agreement/view-agreement-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_a_AgreementDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(AgreementDisplay.class);
    handle.addAssignableType(AgreementPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public AgreementDisplay createInstance(final ContextManager contextManager) {
    final AgreementDisplay instance = new AgreementDisplay();
    setIncompleteInstance(instance);
    final Heading AgreementDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, AgreementDisplay_code);
    AgreementDisplay_Heading_code(instance, AgreementDisplay_code);
    final TableCell AgreementDisplay_partyRel = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_partyRel);
    AgreementDisplay_TableCell_partyRel(instance, AgreementDisplay_partyRel);
    final TableCell AgreementDisplay_agreementTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_agreementTy);
    AgreementDisplay_TableCell_agreementTy(instance, AgreementDisplay_agreementTy);
    final TableCell AgreementDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_name);
    AgreementDisplay_TableCell_name(instance, AgreementDisplay_name);
    final TableCell AgreementDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_entityCode);
    AgreementDisplay_TableCell_entityCode(instance, AgreementDisplay_entityCode);
    final TableCell AgreementDisplay_agreementDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_agreementDt);
    AgreementDisplay_TableCell_agreementDt(instance, AgreementDisplay_agreementDt);
    final TransitionTo AgreementDisplay_listAgreementsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListAgreementPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AgreementDisplay_listAgreementsPage);
    AgreementDisplay_TransitionTo_listAgreementsPage(instance, AgreementDisplay_listAgreementsPage);
    final Span AgreementDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_createdDt);
    AgreementDisplay_Span_createdDt(instance, AgreementDisplay_createdDt);
    final TableCell AgreementDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_description);
    AgreementDisplay_TableCell_description(instance, AgreementDisplay_description);
    final Div AgreementDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_entityDisplayComponent);
    AgreementDisplay_Div_entityDisplayComponent(instance, AgreementDisplay_entityDisplayComponent);
    final Event AgreementDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AgreementDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, AgreementDisplay_renderEditViewEvent);
    AgreementDisplay_Event_renderEditViewEvent(instance, AgreementDisplay_renderEditViewEvent);
    final TableCell AgreementDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_fromDt);
    AgreementDisplay_TableCell_fromDt(instance, AgreementDisplay_fromDt);
    final TableCell AgreementDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_toDt);
    AgreementDisplay_TableCell_toDt(instance, AgreementDisplay_toDt);
    final TableCell AgreementDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_universe);
    AgreementDisplay_TableCell_universe(instance, AgreementDisplay_universe);
    final Event AgreementDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { AgreementDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, AgreementDisplay_deleteEntityEvent);
    AgreementDisplay_Event_deleteEntityEvent(instance, AgreementDisplay_deleteEntityEvent);
    final TableCell AgreementDisplay_text = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_text);
    AgreementDisplay_TableCell_text(instance, AgreementDisplay_text);
    final DataBinder AgreementPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Agreement.class }, new Annotation[] { });
    registerDependentScopedReference(instance, AgreementPresenter_binder);
    AgreementPresenter_DataBinder_binder(instance, AgreementPresenter_binder);
    final Span AgreementDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AgreementDisplay_lastModifiedDt);
    AgreementDisplay_Span_lastModifiedDt(instance, AgreementDisplay_lastModifiedDt);
    c_c_h_c_l_a_AgreementDisplayTemplateResource templateForAgreementDisplay = GWT.create(c_c_h_c_l_a_AgreementDisplayTemplateResource.class);
    Element parentElementForTemplateOfAgreementDisplay = TemplateUtil.getRootTemplateParentElement(templateForAgreementDisplay.getContents().getText(), "com/cloderia/helion/client/local/agreement/view-agreement-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/agreement/view-agreement-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_agreementTy(instance)));
      }
    }, dataFieldElements, "agreementTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_partyRel(instance)));
      }
    }, dataFieldElements, "partyRel");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_text(instance)));
      }
    }, dataFieldElements, "text");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_agreementDt(instance)));
      }
    }, dataFieldElements, "agreementDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_editAgreementBtn(instance));
      }
    }, dataFieldElements, "editAgreementBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_deleteAgreementBtn(instance));
      }
    }, dataFieldElements, "deleteAgreementBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com/cloderia/helion/client/local/agreement/view-agreement-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_listAgreementsPageLink(instance));
      }
    }, dataFieldElements, "listAgreementsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("agreementTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_agreementTy(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("partyRel", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_partyRel(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_description(instance))));
    templateFieldsMap.put("text", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_text(instance))));
    templateFieldsMap.put("agreementDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_agreementDt(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AgreementDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editAgreementBtn", ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_editAgreementBtn(instance)));
    templateFieldsMap.put("deleteAgreementBtn", ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_deleteAgreementBtn(instance)));
    templateFieldsMap.put("listAgreementsPageLink", ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_listAgreementsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAgreementDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editAgreementBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditAgreementBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteAgreementBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteAgreementBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listAgreementsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = AgreementPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.agreement.AgreementDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_agreementTy(instance))), "agreementTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_partyRel(instance))), "partyRel.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_text(instance))), "text", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_agreementDt(instance))), "agreementDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(AgreementDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AgreementDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final AgreementDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_editAgreementBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_deleteAgreementBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(AgreementDisplay_AnchorElement_listAgreementsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final AgreementDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static AnchorElement AgreementDisplay_AnchorElement_deleteAgreementBtn(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::deleteAgreementBtn;
  }-*/;

  native static void AgreementDisplay_AnchorElement_deleteAgreementBtn(AgreementDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::deleteAgreementBtn = value;
  }-*/;

  native static Heading AgreementDisplay_Heading_code(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::code;
  }-*/;

  native static void AgreementDisplay_Heading_code(AgreementDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::code = value;
  }-*/;

  native static DataBinder AgreementPresenter_DataBinder_binder(AgreementPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder;
  }-*/;

  native static void AgreementPresenter_DataBinder_binder(AgreementPresenter instance, DataBinder<Agreement> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementPresenter::binder = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_fromDt(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::fromDt;
  }-*/;

  native static void AgreementDisplay_TableCell_fromDt(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::fromDt = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_description(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::description;
  }-*/;

  native static void AgreementDisplay_TableCell_description(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::description = value;
  }-*/;

  native static TransitionTo AgreementDisplay_TransitionTo_listAgreementsPage(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::listAgreementsPage;
  }-*/;

  native static void AgreementDisplay_TransitionTo_listAgreementsPage(AgreementDisplay instance, TransitionTo<ListAgreementPage> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::listAgreementsPage = value;
  }-*/;

  native static Event AgreementDisplay_Event_deleteEntityEvent(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::deleteEntityEvent;
  }-*/;

  native static void AgreementDisplay_Event_deleteEntityEvent(AgreementDisplay instance, Event<AgreementDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_name(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::name;
  }-*/;

  native static void AgreementDisplay_TableCell_name(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::name = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_toDt(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::toDt;
  }-*/;

  native static void AgreementDisplay_TableCell_toDt(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::toDt = value;
  }-*/;

  native static Span AgreementDisplay_Span_createdDt(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::createdDt;
  }-*/;

  native static void AgreementDisplay_Span_createdDt(AgreementDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::createdDt = value;
  }-*/;

  native static Div AgreementDisplay_Div_entityDisplayComponent(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::entityDisplayComponent;
  }-*/;

  native static void AgreementDisplay_Div_entityDisplayComponent(AgreementDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_entityCode(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::entityCode;
  }-*/;

  native static void AgreementDisplay_TableCell_entityCode(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::entityCode = value;
  }-*/;

  native static Event AgreementDisplay_Event_renderEditViewEvent(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::renderEditViewEvent;
  }-*/;

  native static void AgreementDisplay_Event_renderEditViewEvent(AgreementDisplay instance, Event<AgreementDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement AgreementDisplay_AnchorElement_listAgreementsPageLink(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::listAgreementsPageLink;
  }-*/;

  native static void AgreementDisplay_AnchorElement_listAgreementsPageLink(AgreementDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::listAgreementsPageLink = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_agreementTy(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::agreementTy;
  }-*/;

  native static void AgreementDisplay_TableCell_agreementTy(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::agreementTy = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_universe(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::universe;
  }-*/;

  native static void AgreementDisplay_TableCell_universe(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::universe = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_partyRel(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::partyRel;
  }-*/;

  native static void AgreementDisplay_TableCell_partyRel(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::partyRel = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_text(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::text;
  }-*/;

  native static void AgreementDisplay_TableCell_text(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::text = value;
  }-*/;

  native static Span AgreementDisplay_Span_lastModifiedDt(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::lastModifiedDt;
  }-*/;

  native static void AgreementDisplay_Span_lastModifiedDt(AgreementDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell AgreementDisplay_TableCell_agreementDt(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::agreementDt;
  }-*/;

  native static void AgreementDisplay_TableCell_agreementDt(AgreementDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::agreementDt = value;
  }-*/;

  native static AnchorElement AgreementDisplay_AnchorElement_editAgreementBtn(AgreementDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::editAgreementBtn;
  }-*/;

  native static void AgreementDisplay_AnchorElement_editAgreementBtn(AgreementDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.agreement.AgreementDisplay::editAgreementBtn = value;
  }-*/;
}
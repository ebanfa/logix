package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.person.ListPersonPage;
import com.cloderia.helion.client.local.person.PersonDisplay;
import com.cloderia.helion.client.local.person.PersonPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Person;
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

public class Type_factory__c_c_h_c_l_p_PersonDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PersonDisplay.class, "Type_factory__c_c_h_c_l_p_PersonDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PersonDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/person/view-person-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PersonDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PersonDisplay.class);
    handle.addAssignableType(PersonPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PersonDisplay createInstance(final ContextManager contextManager) {
    final PersonDisplay instance = new PersonDisplay();
    setIncompleteInstance(instance);
    final DataBinder PersonPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Person.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PersonPresenter_binder);
    PersonPresenter_DataBinder_binder(instance, PersonPresenter_binder);
    final Span PersonDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_lastModifiedDt);
    PersonDisplay_Span_lastModifiedDt(instance, PersonDisplay_lastModifiedDt);
    final TableCell PersonDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_party);
    PersonDisplay_TableCell_party(instance, PersonDisplay_party);
    final TableCell PersonDisplay_taxPin = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_taxPin);
    PersonDisplay_TableCell_taxPin(instance, PersonDisplay_taxPin);
    final Span PersonDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_createdDt);
    PersonDisplay_Span_createdDt(instance, PersonDisplay_createdDt);
    final Div PersonDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_entityDisplayComponent);
    PersonDisplay_Div_entityDisplayComponent(instance, PersonDisplay_entityDisplayComponent);
    final TableCell PersonDisplay_firstNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_firstNm);
    PersonDisplay_TableCell_firstNm(instance, PersonDisplay_firstNm);
    final TableCell PersonDisplay_middleNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_middleNm);
    PersonDisplay_TableCell_middleNm(instance, PersonDisplay_middleNm);
    final TableCell PersonDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_entityCode);
    PersonDisplay_TableCell_entityCode(instance, PersonDisplay_entityCode);
    final TableCell PersonDisplay_gender = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_gender);
    PersonDisplay_TableCell_gender(instance, PersonDisplay_gender);
    final TableCell PersonDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_universe);
    PersonDisplay_TableCell_universe(instance, PersonDisplay_universe);
    final TableCell PersonDisplay_lastNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_lastNm);
    PersonDisplay_TableCell_lastNm(instance, PersonDisplay_lastNm);
    final TableCell PersonDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_effectiveDt);
    PersonDisplay_TableCell_effectiveDt(instance, PersonDisplay_effectiveDt);
    final TableCell PersonDisplay_height = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_height);
    PersonDisplay_TableCell_height(instance, PersonDisplay_height);
    final TableCell PersonDisplay_weigth = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_weigth);
    PersonDisplay_TableCell_weigth(instance, PersonDisplay_weigth);
    final Event PersonDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PersonDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PersonDisplay_deleteEntityEvent);
    PersonDisplay_Event_deleteEntityEvent(instance, PersonDisplay_deleteEntityEvent);
    final Heading PersonDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, PersonDisplay_code);
    PersonDisplay_Heading_code(instance, PersonDisplay_code);
    final TableCell PersonDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_name);
    PersonDisplay_TableCell_name(instance, PersonDisplay_name);
    final TransitionTo PersonDisplay_listPersonsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPersonPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PersonDisplay_listPersonsPage);
    PersonDisplay_TransitionTo_listPersonsPage(instance, PersonDisplay_listPersonsPage);
    final Event PersonDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PersonDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PersonDisplay_renderEditViewEvent);
    PersonDisplay_Event_renderEditViewEvent(instance, PersonDisplay_renderEditViewEvent);
    final TableCell PersonDisplay_passportNo = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_passportNo);
    PersonDisplay_TableCell_passportNo(instance, PersonDisplay_passportNo);
    final TableCell PersonDisplay_passportExpDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonDisplay_passportExpDt);
    PersonDisplay_TableCell_passportExpDt(instance, PersonDisplay_passportExpDt);
    c_c_h_c_l_p_PersonDisplayTemplateResource templateForPersonDisplay = GWT.create(c_c_h_c_l_p_PersonDisplayTemplateResource.class);
    Element parentElementForTemplateOfPersonDisplay = TemplateUtil.getRootTemplateParentElement(templateForPersonDisplay.getContents().getText(), "com/cloderia/helion/client/local/person/view-person-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/person/view-person-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_firstNm(instance)));
      }
    }, dataFieldElements, "firstNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_middleNm(instance)));
      }
    }, dataFieldElements, "middleNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_lastNm(instance)));
      }
    }, dataFieldElements, "lastNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_gender(instance)));
      }
    }, dataFieldElements, "gender");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_height(instance)));
      }
    }, dataFieldElements, "height");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_weigth(instance)));
      }
    }, dataFieldElements, "weigth");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_taxPin(instance)));
      }
    }, dataFieldElements, "taxPin");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_passportNo(instance)));
      }
    }, dataFieldElements, "passportNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_passportExpDt(instance)));
      }
    }, dataFieldElements, "passportExpDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_editPersonBtn(instance));
      }
    }, dataFieldElements, "editPersonBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_deletePersonBtn(instance));
      }
    }, dataFieldElements, "deletePersonBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonDisplay", "com/cloderia/helion/client/local/person/view-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_listPersonsPageLink(instance));
      }
    }, dataFieldElements, "listPersonsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_party(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_name(instance))));
    templateFieldsMap.put("firstNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_firstNm(instance))));
    templateFieldsMap.put("middleNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_middleNm(instance))));
    templateFieldsMap.put("lastNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_lastNm(instance))));
    templateFieldsMap.put("gender", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_gender(instance))));
    templateFieldsMap.put("height", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_height(instance))));
    templateFieldsMap.put("weigth", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_weigth(instance))));
    templateFieldsMap.put("taxPin", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_taxPin(instance))));
    templateFieldsMap.put("passportNo", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_passportNo(instance))));
    templateFieldsMap.put("passportExpDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_passportExpDt(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editPersonBtn", ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_editPersonBtn(instance)));
    templateFieldsMap.put("deletePersonBtn", ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_deletePersonBtn(instance)));
    templateFieldsMap.put("listPersonsPageLink", ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_listPersonsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editPersonBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditPersonBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deletePersonBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeletePersonBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPersonsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PersonPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.person.PersonDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_firstNm(instance))), "firstNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_middleNm(instance))), "middleNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_lastNm(instance))), "lastNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_gender(instance))), "gender", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_height(instance))), "height", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_weigth(instance))), "weigth", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_taxPin(instance))), "taxPin", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_passportNo(instance))), "passportNo", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_passportExpDt(instance))), "passportExpDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PersonDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PersonDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_editPersonBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_deletePersonBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PersonDisplay_AnchorElement_listPersonsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PersonDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell PersonDisplay_TableCell_weigth(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::weigth;
  }-*/;

  native static void PersonDisplay_TableCell_weigth(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::weigth = value;
  }-*/;

  native static AnchorElement PersonDisplay_AnchorElement_editPersonBtn(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::editPersonBtn;
  }-*/;

  native static void PersonDisplay_AnchorElement_editPersonBtn(PersonDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::editPersonBtn = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_entityCode(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::entityCode;
  }-*/;

  native static void PersonDisplay_TableCell_entityCode(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::entityCode = value;
  }-*/;

  native static Event PersonDisplay_Event_deleteEntityEvent(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::deleteEntityEvent;
  }-*/;

  native static void PersonDisplay_Event_deleteEntityEvent(PersonDisplay instance, Event<PersonDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::deleteEntityEvent = value;
  }-*/;

  native static AnchorElement PersonDisplay_AnchorElement_deletePersonBtn(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::deletePersonBtn;
  }-*/;

  native static void PersonDisplay_AnchorElement_deletePersonBtn(PersonDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::deletePersonBtn = value;
  }-*/;

  native static Event PersonDisplay_Event_renderEditViewEvent(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::renderEditViewEvent;
  }-*/;

  native static void PersonDisplay_Event_renderEditViewEvent(PersonDisplay instance, Event<PersonDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::renderEditViewEvent = value;
  }-*/;

  native static Heading PersonDisplay_Heading_code(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::code;
  }-*/;

  native static void PersonDisplay_Heading_code(PersonDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::code = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_passportExpDt(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::passportExpDt;
  }-*/;

  native static void PersonDisplay_TableCell_passportExpDt(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::passportExpDt = value;
  }-*/;

  native static Div PersonDisplay_Div_entityDisplayComponent(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::entityDisplayComponent;
  }-*/;

  native static void PersonDisplay_Div_entityDisplayComponent(PersonDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_universe(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::universe;
  }-*/;

  native static void PersonDisplay_TableCell_universe(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::universe = value;
  }-*/;

  native static DataBinder PersonPresenter_DataBinder_binder(PersonPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder;
  }-*/;

  native static void PersonPresenter_DataBinder_binder(PersonPresenter instance, DataBinder<Person> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_gender(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::gender;
  }-*/;

  native static void PersonDisplay_TableCell_gender(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::gender = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_middleNm(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::middleNm;
  }-*/;

  native static void PersonDisplay_TableCell_middleNm(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::middleNm = value;
  }-*/;

  native static AnchorElement PersonDisplay_AnchorElement_listPersonsPageLink(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::listPersonsPageLink;
  }-*/;

  native static void PersonDisplay_AnchorElement_listPersonsPageLink(PersonDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::listPersonsPageLink = value;
  }-*/;

  native static Span PersonDisplay_Span_createdDt(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::createdDt;
  }-*/;

  native static void PersonDisplay_Span_createdDt(PersonDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::createdDt = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_firstNm(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::firstNm;
  }-*/;

  native static void PersonDisplay_TableCell_firstNm(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::firstNm = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_lastNm(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::lastNm;
  }-*/;

  native static void PersonDisplay_TableCell_lastNm(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::lastNm = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_passportNo(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::passportNo;
  }-*/;

  native static void PersonDisplay_TableCell_passportNo(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::passportNo = value;
  }-*/;

  native static Span PersonDisplay_Span_lastModifiedDt(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::lastModifiedDt;
  }-*/;

  native static void PersonDisplay_Span_lastModifiedDt(PersonDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_name(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::name;
  }-*/;

  native static void PersonDisplay_TableCell_name(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::name = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_party(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::party;
  }-*/;

  native static void PersonDisplay_TableCell_party(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::party = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_taxPin(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::taxPin;
  }-*/;

  native static void PersonDisplay_TableCell_taxPin(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::taxPin = value;
  }-*/;

  native static TransitionTo PersonDisplay_TransitionTo_listPersonsPage(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::listPersonsPage;
  }-*/;

  native static void PersonDisplay_TransitionTo_listPersonsPage(PersonDisplay instance, TransitionTo<ListPersonPage> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::listPersonsPage = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_effectiveDt(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::effectiveDt;
  }-*/;

  native static void PersonDisplay_TableCell_effectiveDt(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::effectiveDt = value;
  }-*/;

  native static TableCell PersonDisplay_TableCell_height(PersonDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonDisplay::height;
  }-*/;

  native static void PersonDisplay_TableCell_height(PersonDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonDisplay::height = value;
  }-*/;
}
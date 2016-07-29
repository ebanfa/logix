package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.person.PersonListItemDisplay;
import com.cloderia.helion.client.local.person.PersonPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
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

public class Type_factory__c_c_h_c_l_p_PersonListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PersonListItemDisplay.class, "Type_factory__c_c_h_c_l_p_PersonListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PersonListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/person/list-person-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PersonListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PersonListItemDisplay.class);
    handle.addAssignableType(PersonPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PersonListItemDisplay createInstance(final ContextManager contextManager) {
    final PersonListItemDisplay instance = new PersonListItemDisplay();
    setIncompleteInstance(instance);
    final TableCell PersonListItemDisplay_gender = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_gender);
    PersonListItemDisplay_TableCell_gender(instance, PersonListItemDisplay_gender);
    final DataBinder PersonPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Person.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PersonPresenter_binder);
    PersonPresenter_DataBinder_binder(instance, PersonPresenter_binder);
    final TableCell PersonListItemDisplay_taxPin = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_taxPin);
    PersonListItemDisplay_TableCell_taxPin(instance, PersonListItemDisplay_taxPin);
    final AnchorElement PersonListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_editEntityListItemBtn);
    PersonListItemDisplay_AnchorElement_editEntityListItemBtn(instance, PersonListItemDisplay_editEntityListItemBtn);
    final TableCell PersonListItemDisplay_firstNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_firstNm);
    PersonListItemDisplay_TableCell_firstNm(instance, PersonListItemDisplay_firstNm);
    final TableCell PersonListItemDisplay_middleNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_middleNm);
    PersonListItemDisplay_TableCell_middleNm(instance, PersonListItemDisplay_middleNm);
    final Event PersonListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PersonListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PersonListItemDisplay_deleteEntityEvent);
    PersonListItemDisplay_Event_deleteEntityEvent(instance, PersonListItemDisplay_deleteEntityEvent);
    final Event PersonListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PersonListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, PersonListItemDisplay_renderSingleViewEvent);
    PersonListItemDisplay_Event_renderSingleViewEvent(instance, PersonListItemDisplay_renderSingleViewEvent);
    final TableCell PersonListItemDisplay_height = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_height);
    PersonListItemDisplay_TableCell_height(instance, PersonListItemDisplay_height);
    final TableCell PersonListItemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_effectiveDt);
    PersonListItemDisplay_TableCell_effectiveDt(instance, PersonListItemDisplay_effectiveDt);
    final TableRow PersonListItemDisplay_personItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_personItem);
    PersonListItemDisplay_TableRow_personItem(instance, PersonListItemDisplay_personItem);
    final Event PersonListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PersonListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PersonListItemDisplay_renderEditViewEvent);
    PersonListItemDisplay_Event_renderEditViewEvent(instance, PersonListItemDisplay_renderEditViewEvent);
    final TableCell PersonListItemDisplay_passportNo = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_passportNo);
    PersonListItemDisplay_TableCell_passportNo(instance, PersonListItemDisplay_passportNo);
    final AnchorElement PersonListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_deleteEntityListItemBtn);
    PersonListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, PersonListItemDisplay_deleteEntityListItemBtn);
    final TableCell PersonListItemDisplay_lastNm = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_lastNm);
    PersonListItemDisplay_TableCell_lastNm(instance, PersonListItemDisplay_lastNm);
    final TableCell PersonListItemDisplay_passportExpDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_passportExpDt);
    PersonListItemDisplay_TableCell_passportExpDt(instance, PersonListItemDisplay_passportExpDt);
    final TableCell PersonListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_entityCode);
    PersonListItemDisplay_TableCell_entityCode(instance, PersonListItemDisplay_entityCode);
    final TableCell PersonListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_name);
    PersonListItemDisplay_TableCell_name(instance, PersonListItemDisplay_name);
    final TableCell PersonListItemDisplay_party = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_party);
    PersonListItemDisplay_TableCell_party(instance, PersonListItemDisplay_party);
    final TableCell PersonListItemDisplay_weigth = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PersonListItemDisplay_weigth);
    PersonListItemDisplay_TableCell_weigth(instance, PersonListItemDisplay_weigth);
    c_c_h_c_l_p_PersonListItemDisplayTemplateResource templateForPersonListItemDisplay = GWT.create(c_c_h_c_l_p_PersonListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfPersonListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForPersonListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/person/list-person-page.html", "personItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/person/list-person-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableRow_personItem(instance)));
      }
    }, dataFieldElements, "personItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_party(instance)));
      }
    }, dataFieldElements, "party");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_firstNm(instance)));
      }
    }, dataFieldElements, "firstNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_middleNm(instance)));
      }
    }, dataFieldElements, "middleNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_lastNm(instance)));
      }
    }, dataFieldElements, "lastNm");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_gender(instance)));
      }
    }, dataFieldElements, "gender");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_height(instance)));
      }
    }, dataFieldElements, "height");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_weigth(instance)));
      }
    }, dataFieldElements, "weigth");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_taxPin(instance)));
      }
    }, dataFieldElements, "taxPin");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_passportNo(instance)));
      }
    }, dataFieldElements, "passportNo");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_passportExpDt(instance)));
      }
    }, dataFieldElements, "passportExpDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PersonListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com/cloderia/helion/client/local/person/list-person-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PersonListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("personItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableRow_personItem(instance))));
    templateFieldsMap.put("party", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_party(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("firstNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_firstNm(instance))));
    templateFieldsMap.put("middleNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_middleNm(instance))));
    templateFieldsMap.put("lastNm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_lastNm(instance))));
    templateFieldsMap.put("gender", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_gender(instance))));
    templateFieldsMap.put("height", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_height(instance))));
    templateFieldsMap.put("weigth", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_weigth(instance))));
    templateFieldsMap.put("taxPin", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_taxPin(instance))));
    templateFieldsMap.put("passportNo", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_passportNo(instance))));
    templateFieldsMap.put("passportExpDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_passportExpDt(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PersonListItemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(PersonListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(PersonListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPersonListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = PersonPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.person.PersonListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_party(instance))), "party.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_firstNm(instance))), "firstNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_middleNm(instance))), "middleNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_lastNm(instance))), "lastNm", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_gender(instance))), "gender", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_height(instance))), "height", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_weigth(instance))), "weigth", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_taxPin(instance))), "taxPin", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_passportNo(instance))), "passportNo", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_passportExpDt(instance))), "passportExpDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PersonListItemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PersonListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PersonListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PersonListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PersonListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PersonListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell PersonListItemDisplay_TableCell_middleNm(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::middleNm;
  }-*/;

  native static void PersonListItemDisplay_TableCell_middleNm(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::middleNm = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_firstNm(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::firstNm;
  }-*/;

  native static void PersonListItemDisplay_TableCell_firstNm(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::firstNm = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_effectiveDt(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::effectiveDt;
  }-*/;

  native static void PersonListItemDisplay_TableCell_effectiveDt(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::effectiveDt = value;
  }-*/;

  native static AnchorElement PersonListItemDisplay_AnchorElement_deleteEntityListItemBtn(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void PersonListItemDisplay_AnchorElement_deleteEntityListItemBtn(PersonListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_party(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::party;
  }-*/;

  native static void PersonListItemDisplay_TableCell_party(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::party = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_gender(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::gender;
  }-*/;

  native static void PersonListItemDisplay_TableCell_gender(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::gender = value;
  }-*/;

  native static TableRow PersonListItemDisplay_TableRow_personItem(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::personItem;
  }-*/;

  native static void PersonListItemDisplay_TableRow_personItem(PersonListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::personItem = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_entityCode(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::entityCode;
  }-*/;

  native static void PersonListItemDisplay_TableCell_entityCode(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_weigth(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::weigth;
  }-*/;

  native static void PersonListItemDisplay_TableCell_weigth(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::weigth = value;
  }-*/;

  native static AnchorElement PersonListItemDisplay_AnchorElement_editEntityListItemBtn(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void PersonListItemDisplay_AnchorElement_editEntityListItemBtn(PersonListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static Event PersonListItemDisplay_Event_renderEditViewEvent(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void PersonListItemDisplay_Event_renderEditViewEvent(PersonListItemDisplay instance, Event<PersonListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_taxPin(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::taxPin;
  }-*/;

  native static void PersonListItemDisplay_TableCell_taxPin(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::taxPin = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_passportExpDt(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::passportExpDt;
  }-*/;

  native static void PersonListItemDisplay_TableCell_passportExpDt(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::passportExpDt = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_lastNm(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::lastNm;
  }-*/;

  native static void PersonListItemDisplay_TableCell_lastNm(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::lastNm = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_height(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::height;
  }-*/;

  native static void PersonListItemDisplay_TableCell_height(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::height = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_passportNo(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::passportNo;
  }-*/;

  native static void PersonListItemDisplay_TableCell_passportNo(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::passportNo = value;
  }-*/;

  native static TableCell PersonListItemDisplay_TableCell_name(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::name;
  }-*/;

  native static void PersonListItemDisplay_TableCell_name(PersonListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::name = value;
  }-*/;

  native static Event PersonListItemDisplay_Event_deleteEntityEvent(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void PersonListItemDisplay_Event_deleteEntityEvent(PersonListItemDisplay instance, Event<PersonListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static Event PersonListItemDisplay_Event_renderSingleViewEvent(PersonListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void PersonListItemDisplay_Event_renderSingleViewEvent(PersonListItemDisplay instance, Event<PersonListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static DataBinder PersonPresenter_DataBinder_binder(PersonPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder;
  }-*/;

  native static void PersonPresenter_DataBinder_binder(PersonPresenter instance, DataBinder<Person> value) /*-{
    instance.@com.cloderia.helion.client.local.person.PersonPresenter::binder = value;
  }-*/;
}
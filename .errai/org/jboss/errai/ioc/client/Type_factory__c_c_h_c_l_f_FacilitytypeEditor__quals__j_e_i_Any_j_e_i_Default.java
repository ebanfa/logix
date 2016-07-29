package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor;
import com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter;
import com.cloderia.helion.client.local.facilitytype.ListFacilitytypePage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Facilitytype;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.function.Supplier;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.databinding.client.api.Convert;
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

public class Type_factory__c_c_h_c_l_f_FacilitytypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypeEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilitytypeEditor.class, "Type_factory__c_c_h_c_l_f_FacilitytypeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_FacilitytypeEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_FacilitytypeEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilitytypeEditor.class);
    handle.addAssignableType(FacilitytypePresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilitytypeEditor createInstance(final ContextManager contextManager) {
    final FacilitytypeEditor instance = new FacilitytypeEditor();
    setIncompleteInstance(instance);
    final Event FacilitytypeEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilitytypeEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilitytypeEditor_createEntityEvent);
    FacilitytypeEditor_Event_createEntityEvent(instance, FacilitytypeEditor_createEntityEvent);
    final ListBox FacilitytypeEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilitytypeEditor_universe);
    FacilitytypeEditor_ListBox_universe(instance, FacilitytypeEditor_universe);
    final TextBox FacilitytypeEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilitytypeEditor_description);
    FacilitytypeEditor_TextBox_description(instance, FacilitytypeEditor_description);
    final TransitionTo FacilitytypeEditor_listFacilitytypesPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListFacilitytypePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilitytypeEditor_listFacilitytypesPage);
    FacilitytypeEditor_TransitionTo_listFacilitytypesPage(instance, FacilitytypeEditor_listFacilitytypesPage);
    final Event FacilitytypeEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilitytypeEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilitytypeEditor_editEntityEvent);
    FacilitytypeEditor_Event_editEntityEvent(instance, FacilitytypeEditor_editEntityEvent);
    final TextBox FacilitytypeEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilitytypeEditor_entityCode);
    FacilitytypeEditor_TextBox_entityCode(instance, FacilitytypeEditor_entityCode);
    final TextBox FacilitytypeEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilitytypeEditor_effectiveDt);
    FacilitytypeEditor_TextBox_effectiveDt(instance, FacilitytypeEditor_effectiveDt);
    final Div FacilitytypeEditor_facilitytypeEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilitytypeEditor_facilitytypeEditor);
    FacilitytypeEditor_Div_facilitytypeEditor(instance, FacilitytypeEditor_facilitytypeEditor);
    final DataBinder FacilitytypePresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facilitytype.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilitytypePresenter_binder);
    FacilitytypePresenter_DataBinder_binder(instance, FacilitytypePresenter_binder);
    final TextBox FacilitytypeEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilitytypeEditor_name);
    FacilitytypeEditor_TextBox_name(instance, FacilitytypeEditor_name);
    c_c_h_c_l_f_FacilitytypeEditorTemplateResource templateForFacilitytypeEditor = GWT.create(c_c_h_c_l_f_FacilitytypeEditorTemplateResource.class);
    Element parentElementForTemplateOfFacilitytypeEditor = TemplateUtil.getRootTemplateParentElement(templateForFacilitytypeEditor.getContents().getText(), "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", "facilitytypeEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeEditor_Div_facilitytypeEditor(instance)));
      }
    }, dataFieldElements, "facilitytypeEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilitytypeEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilitytypeEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilitytypeEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilitytypeEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilitytypeEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilitytypeEditor_Button_editFacilitytypeBtn(instance).asWidget();
      }
    }, dataFieldElements, "editFacilitytypeBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com/cloderia/helion/client/local/facilitytype/edit-facilitytype-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilitytypeEditor_AnchorElement_listFacilitytypesPageLink(instance));
      }
    }, dataFieldElements, "listFacilitytypesPageLink");
    templateFieldsMap.put("facilitytypeEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilitytypeEditor_Div_facilitytypeEditor(instance))));
    templateFieldsMap.put("universe", FacilitytypeEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", FacilitytypeEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", FacilitytypeEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", FacilitytypeEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", FacilitytypeEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editFacilitytypeBtn", FacilitytypeEditor_Button_editFacilitytypeBtn(instance).asWidget());
    templateFieldsMap.put("listFacilitytypesPageLink", ElementWrapperWidget.getWidget(FacilitytypeEditor_AnchorElement_listFacilitytypesPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilitytypeEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editFacilitytypeBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editFacilitytype(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listFacilitytypesPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = FacilitytypePresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(FacilitytypeEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(FacilitytypeEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(FacilitytypeEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(FacilitytypeEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilitytypeEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilitytypeEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilitytypeEditor_AnchorElement_listFacilitytypesPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final FacilitytypeEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static ListBox FacilitytypeEditor_ListBox_universe(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::universe;
  }-*/;

  native static void FacilitytypeEditor_ListBox_universe(FacilitytypeEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::universe = value;
  }-*/;

  native static TextBox FacilitytypeEditor_TextBox_entityCode(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::entityCode;
  }-*/;

  native static void FacilitytypeEditor_TextBox_entityCode(FacilitytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::entityCode = value;
  }-*/;

  native static Event FacilitytypeEditor_Event_createEntityEvent(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::createEntityEvent;
  }-*/;

  native static void FacilitytypeEditor_Event_createEntityEvent(FacilitytypeEditor instance, Event<FacilitytypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::createEntityEvent = value;
  }-*/;

  native static TextBox FacilitytypeEditor_TextBox_effectiveDt(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::effectiveDt;
  }-*/;

  native static void FacilitytypeEditor_TextBox_effectiveDt(FacilitytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::effectiveDt = value;
  }-*/;

  native static DataBinder FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder;
  }-*/;

  native static void FacilitytypePresenter_DataBinder_binder(FacilitytypePresenter instance, DataBinder<Facilitytype> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter::binder = value;
  }-*/;

  native static Div FacilitytypeEditor_Div_facilitytypeEditor(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::facilitytypeEditor;
  }-*/;

  native static void FacilitytypeEditor_Div_facilitytypeEditor(FacilitytypeEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::facilitytypeEditor = value;
  }-*/;

  native static TextBox FacilitytypeEditor_TextBox_description(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::description;
  }-*/;

  native static void FacilitytypeEditor_TextBox_description(FacilitytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::description = value;
  }-*/;

  native static AnchorElement FacilitytypeEditor_AnchorElement_listFacilitytypesPageLink(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::listFacilitytypesPageLink;
  }-*/;

  native static void FacilitytypeEditor_AnchorElement_listFacilitytypesPageLink(FacilitytypeEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::listFacilitytypesPageLink = value;
  }-*/;

  native static Button FacilitytypeEditor_Button_editFacilitytypeBtn(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::editFacilitytypeBtn;
  }-*/;

  native static void FacilitytypeEditor_Button_editFacilitytypeBtn(FacilitytypeEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::editFacilitytypeBtn = value;
  }-*/;

  native static TextBox FacilitytypeEditor_TextBox_name(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::name;
  }-*/;

  native static void FacilitytypeEditor_TextBox_name(FacilitytypeEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::name = value;
  }-*/;

  native static TransitionTo FacilitytypeEditor_TransitionTo_listFacilitytypesPage(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::listFacilitytypesPage;
  }-*/;

  native static void FacilitytypeEditor_TransitionTo_listFacilitytypesPage(FacilitytypeEditor instance, TransitionTo<ListFacilitytypePage> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::listFacilitytypesPage = value;
  }-*/;

  native static Event FacilitytypeEditor_Event_editEntityEvent(FacilitytypeEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::editEntityEvent;
  }-*/;

  native static void FacilitytypeEditor_Event_editEntityEvent(FacilitytypeEditor instance, Event<FacilitytypeEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor::editEntityEvent = value;
  }-*/;
}
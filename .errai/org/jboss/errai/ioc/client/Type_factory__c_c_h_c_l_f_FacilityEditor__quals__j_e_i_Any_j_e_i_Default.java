package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.facility.FacilityEditor;
import com.cloderia.helion.client.local.facility.FacilityPresenter;
import com.cloderia.helion.client.local.facility.ListFacilityPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Facility;
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

public class Type_factory__c_c_h_c_l_f_FacilityEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(FacilityEditor.class, "Type_factory__c_c_h_c_l_f_FacilityEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_f_FacilityEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/facility/edit-facility-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_f_FacilityEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(FacilityEditor.class);
    handle.addAssignableType(FacilityPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public FacilityEditor createInstance(final ContextManager contextManager) {
    final FacilityEditor instance = new FacilityEditor();
    setIncompleteInstance(instance);
    final TransitionTo FacilityEditor_listFacilitysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListFacilityPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilityEditor_listFacilitysPage);
    FacilityEditor_TransitionTo_listFacilitysPage(instance, FacilityEditor_listFacilitysPage);
    final TextBox FacilityEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilityEditor_entityCode);
    FacilityEditor_TextBox_entityCode(instance, FacilityEditor_entityCode);
    final Div FacilityEditor_facilityEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FacilityEditor_facilityEditor);
    FacilityEditor_Div_facilityEditor(instance, FacilityEditor_facilityEditor);
    final TextBox FacilityEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilityEditor_description);
    FacilityEditor_TextBox_description(instance, FacilityEditor_description);
    final Event FacilityEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilityEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilityEditor_editEntityEvent);
    FacilityEditor_Event_editEntityEvent(instance, FacilityEditor_editEntityEvent);
    final ListBox FacilityEditor_facilityTy = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilityEditor_facilityTy);
    FacilityEditor_ListBox_facilityTy(instance, FacilityEditor_facilityTy);
    final ListBox FacilityEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilityEditor_universe);
    FacilityEditor_ListBox_universe(instance, FacilityEditor_universe);
    final TextBox FacilityEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilityEditor_name);
    FacilityEditor_TextBox_name(instance, FacilityEditor_name);
    final DataBinder FacilityPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Facility.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FacilityPresenter_binder);
    FacilityPresenter_DataBinder_binder(instance, FacilityPresenter_binder);
    final TextBox FacilityEditor_effectiveDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FacilityEditor_effectiveDt);
    FacilityEditor_TextBox_effectiveDt(instance, FacilityEditor_effectiveDt);
    final Event FacilityEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { FacilityEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, FacilityEditor_createEntityEvent);
    FacilityEditor_Event_createEntityEvent(instance, FacilityEditor_createEntityEvent);
    c_c_h_c_l_f_FacilityEditorTemplateResource templateForFacilityEditor = GWT.create(c_c_h_c_l_f_FacilityEditorTemplateResource.class);
    Element parentElementForTemplateOfFacilityEditor = TemplateUtil.getRootTemplateParentElement(templateForFacilityEditor.getContents().getText(), "com/cloderia/helion/client/local/facility/edit-facility-page.html", "facilityEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/facility/edit-facility-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityEditor_Div_facilityEditor(instance)));
      }
    }, dataFieldElements, "facilityEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityEditor_ListBox_facilityTy(instance).asWidget();
      }
    }, dataFieldElements, "facilityTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityEditor_TextBox_effectiveDt(instance).asWidget();
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return FacilityEditor_Button_editFacilityBtn(instance).asWidget();
      }
    }, dataFieldElements, "editFacilityBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.facility.FacilityEditor", "com/cloderia/helion/client/local/facility/edit-facility-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FacilityEditor_AnchorElement_listFacilitysPageLink(instance));
      }
    }, dataFieldElements, "listFacilitysPageLink");
    templateFieldsMap.put("facilityEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FacilityEditor_Div_facilityEditor(instance))));
    templateFieldsMap.put("universe", FacilityEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("facilityTy", FacilityEditor_ListBox_facilityTy(instance).asWidget());
    templateFieldsMap.put("entityCode", FacilityEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", FacilityEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", FacilityEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("effectiveDt", FacilityEditor_TextBox_effectiveDt(instance).asWidget());
    templateFieldsMap.put("editFacilityBtn", FacilityEditor_Button_editFacilityBtn(instance).asWidget());
    templateFieldsMap.put("listFacilitysPageLink", ElementWrapperWidget.getWidget(FacilityEditor_AnchorElement_listFacilitysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFacilityEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editFacilityBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editFacility(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listFacilitysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = FacilityPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.facility.FacilityEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(FacilityEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(FacilityEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(FacilityEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(FacilityEditor_TextBox_effectiveDt(instance), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FacilityEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final FacilityEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FacilityEditor_AnchorElement_listFacilitysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final FacilityEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TextBox FacilityEditor_TextBox_entityCode(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::entityCode;
  }-*/;

  native static void FacilityEditor_TextBox_entityCode(FacilityEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::entityCode = value;
  }-*/;

  native static TextBox FacilityEditor_TextBox_name(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::name;
  }-*/;

  native static void FacilityEditor_TextBox_name(FacilityEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::name = value;
  }-*/;

  native static ListBox FacilityEditor_ListBox_universe(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::universe;
  }-*/;

  native static void FacilityEditor_ListBox_universe(FacilityEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::universe = value;
  }-*/;

  native static AnchorElement FacilityEditor_AnchorElement_listFacilitysPageLink(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::listFacilitysPageLink;
  }-*/;

  native static void FacilityEditor_AnchorElement_listFacilitysPageLink(FacilityEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::listFacilitysPageLink = value;
  }-*/;

  native static TextBox FacilityEditor_TextBox_effectiveDt(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::effectiveDt;
  }-*/;

  native static void FacilityEditor_TextBox_effectiveDt(FacilityEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::effectiveDt = value;
  }-*/;

  native static TextBox FacilityEditor_TextBox_description(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::description;
  }-*/;

  native static void FacilityEditor_TextBox_description(FacilityEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::description = value;
  }-*/;

  native static Event FacilityEditor_Event_editEntityEvent(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::editEntityEvent;
  }-*/;

  native static void FacilityEditor_Event_editEntityEvent(FacilityEditor instance, Event<FacilityEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::editEntityEvent = value;
  }-*/;

  native static Event FacilityEditor_Event_createEntityEvent(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::createEntityEvent;
  }-*/;

  native static void FacilityEditor_Event_createEntityEvent(FacilityEditor instance, Event<FacilityEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::createEntityEvent = value;
  }-*/;

  native static ListBox FacilityEditor_ListBox_facilityTy(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::facilityTy;
  }-*/;

  native static void FacilityEditor_ListBox_facilityTy(FacilityEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::facilityTy = value;
  }-*/;

  native static DataBinder FacilityPresenter_DataBinder_binder(FacilityPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder;
  }-*/;

  native static void FacilityPresenter_DataBinder_binder(FacilityPresenter instance, DataBinder<Facility> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityPresenter::binder = value;
  }-*/;

  native static Div FacilityEditor_Div_facilityEditor(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::facilityEditor;
  }-*/;

  native static void FacilityEditor_Div_facilityEditor(FacilityEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::facilityEditor = value;
  }-*/;

  native static TransitionTo FacilityEditor_TransitionTo_listFacilitysPage(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::listFacilitysPage;
  }-*/;

  native static void FacilityEditor_TransitionTo_listFacilitysPage(FacilityEditor instance, TransitionTo<ListFacilityPage> value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::listFacilitysPage = value;
  }-*/;

  native static Button FacilityEditor_Button_editFacilityBtn(FacilityEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.facility.FacilityEditor::editFacilityBtn;
  }-*/;

  native static void FacilityEditor_Button_editFacilityBtn(FacilityEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.facility.FacilityEditor::editFacilityBtn = value;
  }-*/;
}
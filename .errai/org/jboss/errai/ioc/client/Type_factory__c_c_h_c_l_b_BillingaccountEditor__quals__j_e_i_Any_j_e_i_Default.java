package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.billingaccount.BillingaccountEditor;
import com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter;
import com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Billingaccount;
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

public class Type_factory__c_c_h_c_l_b_BillingaccountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountEditor> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BillingaccountEditor.class, "Type_factory__c_c_h_c_l_b_BillingaccountEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BillingaccountEditorTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BillingaccountEditor__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BillingaccountEditor.class);
    handle.addAssignableType(BillingaccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BillingaccountEditor createInstance(final ContextManager contextManager) {
    final BillingaccountEditor instance = new BillingaccountEditor();
    setIncompleteInstance(instance);
    final Div BillingaccountEditor_billingaccountEditor = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BillingaccountEditor_billingaccountEditor);
    BillingaccountEditor_Div_billingaccountEditor(instance, BillingaccountEditor_billingaccountEditor);
    final TextBox BillingaccountEditor_description = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountEditor_description);
    BillingaccountEditor_TextBox_description(instance, BillingaccountEditor_description);
    final TransitionTo BillingaccountEditor_listBillingaccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBillingaccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BillingaccountEditor_listBillingaccountsPage);
    BillingaccountEditor_TransitionTo_listBillingaccountsPage(instance, BillingaccountEditor_listBillingaccountsPage);
    final TextBox BillingaccountEditor_entityCode = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountEditor_entityCode);
    BillingaccountEditor_TextBox_entityCode(instance, BillingaccountEditor_entityCode);
    final ListBox BillingaccountEditor_universe = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountEditor_universe);
    BillingaccountEditor_ListBox_universe(instance, BillingaccountEditor_universe);
    final TextBox BillingaccountEditor_fromDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountEditor_fromDt);
    BillingaccountEditor_TextBox_fromDt(instance, BillingaccountEditor_fromDt);
    final TextBox BillingaccountEditor_name = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountEditor_name);
    BillingaccountEditor_TextBox_name(instance, BillingaccountEditor_name);
    final DataBinder BillingaccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Billingaccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BillingaccountPresenter_binder);
    BillingaccountPresenter_DataBinder_binder(instance, BillingaccountPresenter_binder);
    final TextBox BillingaccountEditor_toDt = (TextBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountEditor_toDt);
    BillingaccountEditor_TextBox_toDt(instance, BillingaccountEditor_toDt);
    final Event BillingaccountEditor_editEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BillingaccountEditor.class }, new Annotation[] { new EditEntity() {
        public Class annotationType() {
          return EditEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.EditEntity()";
        }
    } });
    registerDependentScopedReference(instance, BillingaccountEditor_editEntityEvent);
    BillingaccountEditor_Event_editEntityEvent(instance, BillingaccountEditor_editEntityEvent);
    final ListBox BillingaccountEditor_toContMech = (ListBox) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, BillingaccountEditor_toContMech);
    BillingaccountEditor_ListBox_toContMech(instance, BillingaccountEditor_toContMech);
    final Event BillingaccountEditor_createEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BillingaccountEditor.class }, new Annotation[] { new CreateEntity() {
        public Class annotationType() {
          return CreateEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.CreateEntity()";
        }
    } });
    registerDependentScopedReference(instance, BillingaccountEditor_createEntityEvent);
    BillingaccountEditor_Event_createEntityEvent(instance, BillingaccountEditor_createEntityEvent);
    c_c_h_c_l_b_BillingaccountEditorTemplateResource templateForBillingaccountEditor = GWT.create(c_c_h_c_l_b_BillingaccountEditorTemplateResource.class);
    Element parentElementForTemplateOfBillingaccountEditor = TemplateUtil.getRootTemplateParentElement(templateForBillingaccountEditor.getContents().getText(), "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", "billingaccountEditor");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountEditor));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountEditor));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountEditor_Div_billingaccountEditor(instance)));
      }
    }, dataFieldElements, "billingaccountEditor");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_ListBox_toContMech(instance).asWidget();
      }
    }, dataFieldElements, "toContMech");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_ListBox_universe(instance).asWidget();
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_TextBox_entityCode(instance).asWidget();
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_TextBox_name(instance).asWidget();
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_TextBox_description(instance).asWidget();
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_TextBox_fromDt(instance).asWidget();
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_TextBox_toDt(instance).asWidget();
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return BillingaccountEditor_Button_editBillingaccountBtn(instance).asWidget();
      }
    }, dataFieldElements, "editBillingaccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com/cloderia/helion/client/local/billingaccount/edit-billingaccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BillingaccountEditor_AnchorElement_listBillingaccountsPageLink(instance));
      }
    }, dataFieldElements, "listBillingaccountsPageLink");
    templateFieldsMap.put("billingaccountEditor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BillingaccountEditor_Div_billingaccountEditor(instance))));
    templateFieldsMap.put("toContMech", BillingaccountEditor_ListBox_toContMech(instance).asWidget());
    templateFieldsMap.put("universe", BillingaccountEditor_ListBox_universe(instance).asWidget());
    templateFieldsMap.put("entityCode", BillingaccountEditor_TextBox_entityCode(instance).asWidget());
    templateFieldsMap.put("name", BillingaccountEditor_TextBox_name(instance).asWidget());
    templateFieldsMap.put("description", BillingaccountEditor_TextBox_description(instance).asWidget());
    templateFieldsMap.put("fromDt", BillingaccountEditor_TextBox_fromDt(instance).asWidget());
    templateFieldsMap.put("toDt", BillingaccountEditor_TextBox_toDt(instance).asWidget());
    templateFieldsMap.put("editBillingaccountBtn", BillingaccountEditor_Button_editBillingaccountBtn(instance).asWidget());
    templateFieldsMap.put("listBillingaccountsPageLink", ElementWrapperWidget.getWidget(BillingaccountEditor_AnchorElement_listBillingaccountsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBillingaccountEditor), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("editBillingaccountBtn")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.editBillingaccount(event);
      }
    });
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBillingaccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.submit(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = BillingaccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.billingaccount.BillingaccountEditor has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(BillingaccountEditor_TextBox_entityCode(instance), "entityCode", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BillingaccountEditor_TextBox_name(instance), "name", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BillingaccountEditor_TextBox_description(instance), "description", Convert.getConverter(String.class, String.class), null, false);
    binder.bind(BillingaccountEditor_TextBox_fromDt(instance), "fromDt", new DateConverter(), null, false);
    binder.bind(BillingaccountEditor_TextBox_toDt(instance), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BillingaccountEditor) instance, contextManager);
  }

  public void destroyInstanceHelper(final BillingaccountEditor instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BillingaccountEditor_AnchorElement_listBillingaccountsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BillingaccountEditor instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Button BillingaccountEditor_Button_editBillingaccountBtn(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::editBillingaccountBtn;
  }-*/;

  native static void BillingaccountEditor_Button_editBillingaccountBtn(BillingaccountEditor instance, Button value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::editBillingaccountBtn = value;
  }-*/;

  native static TextBox BillingaccountEditor_TextBox_name(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::name;
  }-*/;

  native static void BillingaccountEditor_TextBox_name(BillingaccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::name = value;
  }-*/;

  native static TransitionTo BillingaccountEditor_TransitionTo_listBillingaccountsPage(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::listBillingaccountsPage;
  }-*/;

  native static void BillingaccountEditor_TransitionTo_listBillingaccountsPage(BillingaccountEditor instance, TransitionTo<ListBillingaccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::listBillingaccountsPage = value;
  }-*/;

  native static TextBox BillingaccountEditor_TextBox_description(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::description;
  }-*/;

  native static void BillingaccountEditor_TextBox_description(BillingaccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::description = value;
  }-*/;

  native static ListBox BillingaccountEditor_ListBox_universe(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::universe;
  }-*/;

  native static void BillingaccountEditor_ListBox_universe(BillingaccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::universe = value;
  }-*/;

  native static TextBox BillingaccountEditor_TextBox_entityCode(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::entityCode;
  }-*/;

  native static void BillingaccountEditor_TextBox_entityCode(BillingaccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::entityCode = value;
  }-*/;

  native static AnchorElement BillingaccountEditor_AnchorElement_listBillingaccountsPageLink(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::listBillingaccountsPageLink;
  }-*/;

  native static void BillingaccountEditor_AnchorElement_listBillingaccountsPageLink(BillingaccountEditor instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::listBillingaccountsPageLink = value;
  }-*/;

  native static TextBox BillingaccountEditor_TextBox_fromDt(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::fromDt;
  }-*/;

  native static void BillingaccountEditor_TextBox_fromDt(BillingaccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::fromDt = value;
  }-*/;

  native static Event BillingaccountEditor_Event_editEntityEvent(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::editEntityEvent;
  }-*/;

  native static void BillingaccountEditor_Event_editEntityEvent(BillingaccountEditor instance, Event<BillingaccountEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::editEntityEvent = value;
  }-*/;

  native static ListBox BillingaccountEditor_ListBox_toContMech(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::toContMech;
  }-*/;

  native static void BillingaccountEditor_ListBox_toContMech(BillingaccountEditor instance, ListBox value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::toContMech = value;
  }-*/;

  native static Event BillingaccountEditor_Event_createEntityEvent(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::createEntityEvent;
  }-*/;

  native static void BillingaccountEditor_Event_createEntityEvent(BillingaccountEditor instance, Event<BillingaccountEditor> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::createEntityEvent = value;
  }-*/;

  native static DataBinder BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder;
  }-*/;

  native static void BillingaccountPresenter_DataBinder_binder(BillingaccountPresenter instance, DataBinder<Billingaccount> value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter::binder = value;
  }-*/;

  native static Div BillingaccountEditor_Div_billingaccountEditor(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::billingaccountEditor;
  }-*/;

  native static void BillingaccountEditor_Div_billingaccountEditor(BillingaccountEditor instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::billingaccountEditor = value;
  }-*/;

  native static TextBox BillingaccountEditor_TextBox_toDt(BillingaccountEditor instance) /*-{
    return instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::toDt;
  }-*/;

  native static void BillingaccountEditor_TextBox_toDt(BillingaccountEditor instance, TextBox value) /*-{
    instance.@com.cloderia.helion.client.local.billingaccount.BillingaccountEditor::toDt = value;
  }-*/;
}
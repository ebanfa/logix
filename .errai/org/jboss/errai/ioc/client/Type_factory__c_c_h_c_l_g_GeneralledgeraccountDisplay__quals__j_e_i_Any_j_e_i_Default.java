package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.generalledgeraccount.ListGeneralledgeraccountPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_g_GeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(GeneralledgeraccountDisplay.class, "Type_factory__c_c_h_c_l_g_GeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_g_GeneralledgeraccountDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_g_GeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(GeneralledgeraccountDisplay.class);
    handle.addAssignableType(GeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public GeneralledgeraccountDisplay createInstance(final ContextManager contextManager) {
    final GeneralledgeraccountDisplay instance = new GeneralledgeraccountDisplay();
    setIncompleteInstance(instance);
    final TableCell GeneralledgeraccountDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_name);
    GeneralledgeraccountDisplay_TableCell_name(instance, GeneralledgeraccountDisplay_name);
    final Div GeneralledgeraccountDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_entityDisplayComponent);
    GeneralledgeraccountDisplay_Div_entityDisplayComponent(instance, GeneralledgeraccountDisplay_entityDisplayComponent);
    final TransitionTo GeneralledgeraccountDisplay_listGeneralledgeraccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListGeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_listGeneralledgeraccountsPage);
    GeneralledgeraccountDisplay_TransitionTo_listGeneralledgeraccountsPage(instance, GeneralledgeraccountDisplay_listGeneralledgeraccountsPage);
    final Span GeneralledgeraccountDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_lastModifiedDt);
    GeneralledgeraccountDisplay_Span_lastModifiedDt(instance, GeneralledgeraccountDisplay_lastModifiedDt);
    final TableCell GeneralledgeraccountDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_entityCode);
    GeneralledgeraccountDisplay_TableCell_entityCode(instance, GeneralledgeraccountDisplay_entityCode);
    final Event GeneralledgeraccountDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccountDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_deleteEntityEvent);
    GeneralledgeraccountDisplay_Event_deleteEntityEvent(instance, GeneralledgeraccountDisplay_deleteEntityEvent);
    final TableCell GeneralledgeraccountDisplay_glAcctTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_glAcctTy);
    GeneralledgeraccountDisplay_TableCell_glAcctTy(instance, GeneralledgeraccountDisplay_glAcctTy);
    final TableCell GeneralledgeraccountDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_description);
    GeneralledgeraccountDisplay_TableCell_description(instance, GeneralledgeraccountDisplay_description);
    final TableCell GeneralledgeraccountDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_effectiveDt);
    GeneralledgeraccountDisplay_TableCell_effectiveDt(instance, GeneralledgeraccountDisplay_effectiveDt);
    final Event GeneralledgeraccountDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { GeneralledgeraccountDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_renderEditViewEvent);
    GeneralledgeraccountDisplay_Event_renderEditViewEvent(instance, GeneralledgeraccountDisplay_renderEditViewEvent);
    final Heading GeneralledgeraccountDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_code);
    GeneralledgeraccountDisplay_Heading_code(instance, GeneralledgeraccountDisplay_code);
    final Span GeneralledgeraccountDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_createdDt);
    GeneralledgeraccountDisplay_Span_createdDt(instance, GeneralledgeraccountDisplay_createdDt);
    final DataBinder GeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Generalledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, GeneralledgeraccountPresenter_binder);
    GeneralledgeraccountPresenter_DataBinder_binder(instance, GeneralledgeraccountPresenter_binder);
    final TableCell GeneralledgeraccountDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, GeneralledgeraccountDisplay_universe);
    GeneralledgeraccountDisplay_TableCell_universe(instance, GeneralledgeraccountDisplay_universe);
    c_c_h_c_l_g_GeneralledgeraccountDisplayTemplateResource templateForGeneralledgeraccountDisplay = GWT.create(c_c_h_c_l_g_GeneralledgeraccountDisplayTemplateResource.class);
    Element parentElementForTemplateOfGeneralledgeraccountDisplay = TemplateUtil.getRootTemplateParentElement(templateForGeneralledgeraccountDisplay.getContents().getText(), "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_glAcctTy(instance)));
      }
    }, dataFieldElements, "glAcctTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_editGeneralledgeraccountBtn(instance));
      }
    }, dataFieldElements, "editGeneralledgeraccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_deleteGeneralledgeraccountBtn(instance));
      }
    }, dataFieldElements, "deleteGeneralledgeraccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com/cloderia/helion/client/local/generalledgeraccount/view-generalledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_listGeneralledgeraccountsPageLink(instance));
      }
    }, dataFieldElements, "listGeneralledgeraccountsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("glAcctTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_glAcctTy(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(GeneralledgeraccountDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editGeneralledgeraccountBtn", ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_editGeneralledgeraccountBtn(instance)));
    templateFieldsMap.put("deleteGeneralledgeraccountBtn", ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_deleteGeneralledgeraccountBtn(instance)));
    templateFieldsMap.put("listGeneralledgeraccountsPageLink", ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_listGeneralledgeraccountsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfGeneralledgeraccountDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editGeneralledgeraccountBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditGeneralledgeraccountBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteGeneralledgeraccountBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteGeneralledgeraccountBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listGeneralledgeraccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = GeneralledgeraccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_TableCell_glAcctTy(instance))), "glAcctTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(GeneralledgeraccountDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((GeneralledgeraccountDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final GeneralledgeraccountDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_editGeneralledgeraccountBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_deleteGeneralledgeraccountBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(GeneralledgeraccountDisplay_AnchorElement_listGeneralledgeraccountsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final GeneralledgeraccountDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Span GeneralledgeraccountDisplay_Span_createdDt(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::createdDt;
  }-*/;

  native static void GeneralledgeraccountDisplay_Span_createdDt(GeneralledgeraccountDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::createdDt = value;
  }-*/;

  native static Span GeneralledgeraccountDisplay_Span_lastModifiedDt(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::lastModifiedDt;
  }-*/;

  native static void GeneralledgeraccountDisplay_Span_lastModifiedDt(GeneralledgeraccountDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell GeneralledgeraccountDisplay_TableCell_description(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::description;
  }-*/;

  native static void GeneralledgeraccountDisplay_TableCell_description(GeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::description = value;
  }-*/;

  native static Div GeneralledgeraccountDisplay_Div_entityDisplayComponent(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::entityDisplayComponent;
  }-*/;

  native static void GeneralledgeraccountDisplay_Div_entityDisplayComponent(GeneralledgeraccountDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell GeneralledgeraccountDisplay_TableCell_entityCode(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::entityCode;
  }-*/;

  native static void GeneralledgeraccountDisplay_TableCell_entityCode(GeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::entityCode = value;
  }-*/;

  native static TableCell GeneralledgeraccountDisplay_TableCell_universe(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::universe;
  }-*/;

  native static void GeneralledgeraccountDisplay_TableCell_universe(GeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::universe = value;
  }-*/;

  native static AnchorElement GeneralledgeraccountDisplay_AnchorElement_listGeneralledgeraccountsPageLink(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::listGeneralledgeraccountsPageLink;
  }-*/;

  native static void GeneralledgeraccountDisplay_AnchorElement_listGeneralledgeraccountsPageLink(GeneralledgeraccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::listGeneralledgeraccountsPageLink = value;
  }-*/;

  native static AnchorElement GeneralledgeraccountDisplay_AnchorElement_deleteGeneralledgeraccountBtn(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::deleteGeneralledgeraccountBtn;
  }-*/;

  native static void GeneralledgeraccountDisplay_AnchorElement_deleteGeneralledgeraccountBtn(GeneralledgeraccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::deleteGeneralledgeraccountBtn = value;
  }-*/;

  native static Event GeneralledgeraccountDisplay_Event_renderEditViewEvent(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::renderEditViewEvent;
  }-*/;

  native static void GeneralledgeraccountDisplay_Event_renderEditViewEvent(GeneralledgeraccountDisplay instance, Event<GeneralledgeraccountDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::renderEditViewEvent = value;
  }-*/;

  native static DataBinder GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder;
  }-*/;

  native static void GeneralledgeraccountPresenter_DataBinder_binder(GeneralledgeraccountPresenter instance, DataBinder<Generalledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter::binder = value;
  }-*/;

  native static TableCell GeneralledgeraccountDisplay_TableCell_effectiveDt(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::effectiveDt;
  }-*/;

  native static void GeneralledgeraccountDisplay_TableCell_effectiveDt(GeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::effectiveDt = value;
  }-*/;

  native static TableCell GeneralledgeraccountDisplay_TableCell_glAcctTy(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::glAcctTy;
  }-*/;

  native static void GeneralledgeraccountDisplay_TableCell_glAcctTy(GeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::glAcctTy = value;
  }-*/;

  native static TransitionTo GeneralledgeraccountDisplay_TransitionTo_listGeneralledgeraccountsPage(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::listGeneralledgeraccountsPage;
  }-*/;

  native static void GeneralledgeraccountDisplay_TransitionTo_listGeneralledgeraccountsPage(GeneralledgeraccountDisplay instance, TransitionTo<ListGeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::listGeneralledgeraccountsPage = value;
  }-*/;

  native static AnchorElement GeneralledgeraccountDisplay_AnchorElement_editGeneralledgeraccountBtn(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::editGeneralledgeraccountBtn;
  }-*/;

  native static void GeneralledgeraccountDisplay_AnchorElement_editGeneralledgeraccountBtn(GeneralledgeraccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::editGeneralledgeraccountBtn = value;
  }-*/;

  native static Heading GeneralledgeraccountDisplay_Heading_code(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::code;
  }-*/;

  native static void GeneralledgeraccountDisplay_Heading_code(GeneralledgeraccountDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::code = value;
  }-*/;

  native static TableCell GeneralledgeraccountDisplay_TableCell_name(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::name;
  }-*/;

  native static void GeneralledgeraccountDisplay_TableCell_name(GeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::name = value;
  }-*/;

  native static Event GeneralledgeraccountDisplay_Event_deleteEntityEvent(GeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::deleteEntityEvent;
  }-*/;

  native static void GeneralledgeraccountDisplay_Event_deleteEntityEvent(GeneralledgeraccountDisplay instance, Event<GeneralledgeraccountDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay::deleteEntityEvent = value;
  }-*/;
}
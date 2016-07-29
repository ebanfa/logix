package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.partycategory.ListPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.PartycategoryDisplay;
import com.cloderia.helion.client.local.partycategory.PartycategoryPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Partycategory;
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

public class Type_factory__c_c_h_c_l_p_PartycategoryDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(PartycategoryDisplay.class, "Type_factory__c_c_h_c_l_p_PartycategoryDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_p_PartycategoryDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/partycategory/view-partycategory-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_p_PartycategoryDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(PartycategoryDisplay.class);
    handle.addAssignableType(PartycategoryPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public PartycategoryDisplay createInstance(final ContextManager contextManager) {
    final PartycategoryDisplay instance = new PartycategoryDisplay();
    setIncompleteInstance(instance);
    final TableCell PartycategoryDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_name);
    PartycategoryDisplay_TableCell_name(instance, PartycategoryDisplay_name);
    final Heading PartycategoryDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, PartycategoryDisplay_code);
    PartycategoryDisplay_Heading_code(instance, PartycategoryDisplay_code);
    final Event PartycategoryDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartycategoryDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, PartycategoryDisplay_renderEditViewEvent);
    PartycategoryDisplay_Event_renderEditViewEvent(instance, PartycategoryDisplay_renderEditViewEvent);
    final Span PartycategoryDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_lastModifiedDt);
    PartycategoryDisplay_Span_lastModifiedDt(instance, PartycategoryDisplay_lastModifiedDt);
    final TableCell PartycategoryDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_effectiveDt);
    PartycategoryDisplay_TableCell_effectiveDt(instance, PartycategoryDisplay_effectiveDt);
    final TableCell PartycategoryDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_universe);
    PartycategoryDisplay_TableCell_universe(instance, PartycategoryDisplay_universe);
    final TableCell PartycategoryDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_entityCode);
    PartycategoryDisplay_TableCell_entityCode(instance, PartycategoryDisplay_entityCode);
    final TableCell PartycategoryDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_description);
    PartycategoryDisplay_TableCell_description(instance, PartycategoryDisplay_description);
    final Span PartycategoryDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_createdDt);
    PartycategoryDisplay_Span_createdDt(instance, PartycategoryDisplay_createdDt);
    final TransitionTo PartycategoryDisplay_listPartycategorysPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListPartycategoryPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartycategoryDisplay_listPartycategorysPage);
    PartycategoryDisplay_TransitionTo_listPartycategorysPage(instance, PartycategoryDisplay_listPartycategorysPage);
    final Event PartycategoryDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PartycategoryDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, PartycategoryDisplay_deleteEntityEvent);
    PartycategoryDisplay_Event_deleteEntityEvent(instance, PartycategoryDisplay_deleteEntityEvent);
    final Div PartycategoryDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, PartycategoryDisplay_entityDisplayComponent);
    PartycategoryDisplay_Div_entityDisplayComponent(instance, PartycategoryDisplay_entityDisplayComponent);
    final DataBinder PartycategoryPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Partycategory.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PartycategoryPresenter_binder);
    PartycategoryPresenter_DataBinder_binder(instance, PartycategoryPresenter_binder);
    c_c_h_c_l_p_PartycategoryDisplayTemplateResource templateForPartycategoryDisplay = GWT.create(c_c_h_c_l_p_PartycategoryDisplayTemplateResource.class);
    Element parentElementForTemplateOfPartycategoryDisplay = TemplateUtil.getRootTemplateParentElement(templateForPartycategoryDisplay.getContents().getText(), "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_editPartycategoryBtn(instance));
      }
    }, dataFieldElements, "editPartycategoryBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_deletePartycategoryBtn(instance));
      }
    }, dataFieldElements, "deletePartycategoryBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com/cloderia/helion/client/local/partycategory/view-partycategory-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_listPartycategorysPageLink(instance));
      }
    }, dataFieldElements, "listPartycategorysPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_description(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(PartycategoryDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editPartycategoryBtn", ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_editPartycategoryBtn(instance)));
    templateFieldsMap.put("deletePartycategoryBtn", ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_deletePartycategoryBtn(instance)));
    templateFieldsMap.put("listPartycategorysPageLink", ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_listPartycategorysPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfPartycategoryDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editPartycategoryBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditPartycategoryBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deletePartycategoryBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeletePartycategoryBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listPartycategorysPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = PartycategoryPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.partycategory.PartycategoryDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(PartycategoryDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((PartycategoryDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final PartycategoryDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_editPartycategoryBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_deletePartycategoryBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(PartycategoryDisplay_AnchorElement_listPartycategorysPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final PartycategoryDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell PartycategoryDisplay_TableCell_entityCode(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::entityCode;
  }-*/;

  native static void PartycategoryDisplay_TableCell_entityCode(PartycategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::entityCode = value;
  }-*/;

  native static Heading PartycategoryDisplay_Heading_code(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::code;
  }-*/;

  native static void PartycategoryDisplay_Heading_code(PartycategoryDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::code = value;
  }-*/;

  native static TableCell PartycategoryDisplay_TableCell_description(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::description;
  }-*/;

  native static void PartycategoryDisplay_TableCell_description(PartycategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::description = value;
  }-*/;

  native static TableCell PartycategoryDisplay_TableCell_effectiveDt(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::effectiveDt;
  }-*/;

  native static void PartycategoryDisplay_TableCell_effectiveDt(PartycategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::effectiveDt = value;
  }-*/;

  native static Span PartycategoryDisplay_Span_createdDt(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::createdDt;
  }-*/;

  native static void PartycategoryDisplay_Span_createdDt(PartycategoryDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::createdDt = value;
  }-*/;

  native static AnchorElement PartycategoryDisplay_AnchorElement_listPartycategorysPageLink(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::listPartycategorysPageLink;
  }-*/;

  native static void PartycategoryDisplay_AnchorElement_listPartycategorysPageLink(PartycategoryDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::listPartycategorysPageLink = value;
  }-*/;

  native static DataBinder PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder;
  }-*/;

  native static void PartycategoryPresenter_DataBinder_binder(PartycategoryPresenter instance, DataBinder<Partycategory> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryPresenter::binder = value;
  }-*/;

  native static TableCell PartycategoryDisplay_TableCell_universe(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::universe;
  }-*/;

  native static void PartycategoryDisplay_TableCell_universe(PartycategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::universe = value;
  }-*/;

  native static TransitionTo PartycategoryDisplay_TransitionTo_listPartycategorysPage(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::listPartycategorysPage;
  }-*/;

  native static void PartycategoryDisplay_TransitionTo_listPartycategorysPage(PartycategoryDisplay instance, TransitionTo<ListPartycategoryPage> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::listPartycategorysPage = value;
  }-*/;

  native static Event PartycategoryDisplay_Event_deleteEntityEvent(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::deleteEntityEvent;
  }-*/;

  native static void PartycategoryDisplay_Event_deleteEntityEvent(PartycategoryDisplay instance, Event<PartycategoryDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::deleteEntityEvent = value;
  }-*/;

  native static AnchorElement PartycategoryDisplay_AnchorElement_deletePartycategoryBtn(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::deletePartycategoryBtn;
  }-*/;

  native static void PartycategoryDisplay_AnchorElement_deletePartycategoryBtn(PartycategoryDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::deletePartycategoryBtn = value;
  }-*/;

  native static AnchorElement PartycategoryDisplay_AnchorElement_editPartycategoryBtn(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::editPartycategoryBtn;
  }-*/;

  native static void PartycategoryDisplay_AnchorElement_editPartycategoryBtn(PartycategoryDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::editPartycategoryBtn = value;
  }-*/;

  native static Event PartycategoryDisplay_Event_renderEditViewEvent(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::renderEditViewEvent;
  }-*/;

  native static void PartycategoryDisplay_Event_renderEditViewEvent(PartycategoryDisplay instance, Event<PartycategoryDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::renderEditViewEvent = value;
  }-*/;

  native static Span PartycategoryDisplay_Span_lastModifiedDt(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::lastModifiedDt;
  }-*/;

  native static void PartycategoryDisplay_Span_lastModifiedDt(PartycategoryDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::lastModifiedDt = value;
  }-*/;

  native static TableCell PartycategoryDisplay_TableCell_name(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::name;
  }-*/;

  native static void PartycategoryDisplay_TableCell_name(PartycategoryDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::name = value;
  }-*/;

  native static Div PartycategoryDisplay_Div_entityDisplayComponent(PartycategoryDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::entityDisplayComponent;
  }-*/;

  native static void PartycategoryDisplay_Div_entityDisplayComponent(PartycategoryDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.partycategory.PartycategoryDisplay::entityDisplayComponent = value;
  }-*/;
}
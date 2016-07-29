package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay;
import com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter;
import com.cloderia.helion.client.local.budgetitem.ListBudgetitemPage;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Budgetitem;
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

public class Type_factory__c_c_h_c_l_b_BudgetitemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(BudgetitemDisplay.class, "Type_factory__c_c_h_c_l_b_BudgetitemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_b_BudgetitemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_b_BudgetitemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(BudgetitemDisplay.class);
    handle.addAssignableType(BudgetitemPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public BudgetitemDisplay createInstance(final ContextManager contextManager) {
    final BudgetitemDisplay instance = new BudgetitemDisplay();
    setIncompleteInstance(instance);
    final Span BudgetitemDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_lastModifiedDt);
    BudgetitemDisplay_Span_lastModifiedDt(instance, BudgetitemDisplay_lastModifiedDt);
    final Span BudgetitemDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_createdDt);
    BudgetitemDisplay_Span_createdDt(instance, BudgetitemDisplay_createdDt);
    final DataBinder BudgetitemPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Budgetitem.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetitemPresenter_binder);
    BudgetitemPresenter_DataBinder_binder(instance, BudgetitemPresenter_binder);
    final TableCell BudgetitemDisplay_budget = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_budget);
    BudgetitemDisplay_TableCell_budget(instance, BudgetitemDisplay_budget);
    final TableCell BudgetitemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_name);
    BudgetitemDisplay_TableCell_name(instance, BudgetitemDisplay_name);
    final TableCell BudgetitemDisplay_amount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_amount);
    BudgetitemDisplay_TableCell_amount(instance, BudgetitemDisplay_amount);
    final TableCell BudgetitemDisplay_justification = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_justification);
    BudgetitemDisplay_TableCell_justification(instance, BudgetitemDisplay_justification);
    final TableCell BudgetitemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_entityCode);
    BudgetitemDisplay_TableCell_entityCode(instance, BudgetitemDisplay_entityCode);
    final TransitionTo BudgetitemDisplay_listBudgetitemsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListBudgetitemPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BudgetitemDisplay_listBudgetitemsPage);
    BudgetitemDisplay_TransitionTo_listBudgetitemsPage(instance, BudgetitemDisplay_listBudgetitemsPage);
    final TableCell BudgetitemDisplay_parentItem = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_parentItem);
    BudgetitemDisplay_TableCell_parentItem(instance, BudgetitemDisplay_parentItem);
    final Div BudgetitemDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_entityDisplayComponent);
    BudgetitemDisplay_Div_entityDisplayComponent(instance, BudgetitemDisplay_entityDisplayComponent);
    final TableCell BudgetitemDisplay_purpose = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_purpose);
    BudgetitemDisplay_TableCell_purpose(instance, BudgetitemDisplay_purpose);
    final TableCell BudgetitemDisplay_effectiveDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_effectiveDt);
    BudgetitemDisplay_TableCell_effectiveDt(instance, BudgetitemDisplay_effectiveDt);
    final Event BudgetitemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetitemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, BudgetitemDisplay_deleteEntityEvent);
    BudgetitemDisplay_Event_deleteEntityEvent(instance, BudgetitemDisplay_deleteEntityEvent);
    final Heading BudgetitemDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, BudgetitemDisplay_code);
    BudgetitemDisplay_Heading_code(instance, BudgetitemDisplay_code);
    final TableCell BudgetitemDisplay_itemTy = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_itemTy);
    BudgetitemDisplay_TableCell_itemTy(instance, BudgetitemDisplay_itemTy);
    final TableCell BudgetitemDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, BudgetitemDisplay_universe);
    BudgetitemDisplay_TableCell_universe(instance, BudgetitemDisplay_universe);
    final Event BudgetitemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { BudgetitemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, BudgetitemDisplay_renderEditViewEvent);
    BudgetitemDisplay_Event_renderEditViewEvent(instance, BudgetitemDisplay_renderEditViewEvent);
    c_c_h_c_l_b_BudgetitemDisplayTemplateResource templateForBudgetitemDisplay = GWT.create(c_c_h_c_l_b_BudgetitemDisplayTemplateResource.class);
    Element parentElementForTemplateOfBudgetitemDisplay = TemplateUtil.getRootTemplateParentElement(templateForBudgetitemDisplay.getContents().getText(), "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_itemTy(instance)));
      }
    }, dataFieldElements, "itemTy");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_parentItem(instance)));
      }
    }, dataFieldElements, "parentItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_budget(instance)));
      }
    }, dataFieldElements, "budget");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_amount(instance)));
      }
    }, dataFieldElements, "amount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_justification(instance)));
      }
    }, dataFieldElements, "justification");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_purpose(instance)));
      }
    }, dataFieldElements, "purpose");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_effectiveDt(instance)));
      }
    }, dataFieldElements, "effectiveDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_editBudgetitemBtn(instance));
      }
    }, dataFieldElements, "editBudgetitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_deleteBudgetitemBtn(instance));
      }
    }, dataFieldElements, "deleteBudgetitemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com/cloderia/helion/client/local/budgetitem/view-budgetitem-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_listBudgetitemsPageLink(instance));
      }
    }, dataFieldElements, "listBudgetitemsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("itemTy", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_itemTy(instance))));
    templateFieldsMap.put("parentItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_parentItem(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("budget", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_budget(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("amount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_amount(instance))));
    templateFieldsMap.put("justification", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_justification(instance))));
    templateFieldsMap.put("purpose", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_purpose(instance))));
    templateFieldsMap.put("effectiveDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(BudgetitemDisplay_TableCell_effectiveDt(instance))));
    templateFieldsMap.put("editBudgetitemBtn", ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_editBudgetitemBtn(instance)));
    templateFieldsMap.put("deleteBudgetitemBtn", ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_deleteBudgetitemBtn(instance)));
    templateFieldsMap.put("listBudgetitemsPageLink", ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_listBudgetitemsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfBudgetitemDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editBudgetitemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditBudgetitemBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteBudgetitemBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteBudgetitemBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listBudgetitemsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = BudgetitemPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_itemTy(instance))), "itemTy.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_parentItem(instance))), "parentItem.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_budget(instance))), "budget.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_amount(instance))), "amount", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_justification(instance))), "justification", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_purpose(instance))), "purpose", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(BudgetitemDisplay_TableCell_effectiveDt(instance))), "effectiveDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BudgetitemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final BudgetitemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_editBudgetitemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_deleteBudgetitemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(BudgetitemDisplay_AnchorElement_listBudgetitemsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final BudgetitemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event BudgetitemDisplay_Event_deleteEntityEvent(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::deleteEntityEvent;
  }-*/;

  native static void BudgetitemDisplay_Event_deleteEntityEvent(BudgetitemDisplay instance, Event<BudgetitemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_purpose(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::purpose;
  }-*/;

  native static void BudgetitemDisplay_TableCell_purpose(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::purpose = value;
  }-*/;

  native static TransitionTo BudgetitemDisplay_TransitionTo_listBudgetitemsPage(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::listBudgetitemsPage;
  }-*/;

  native static void BudgetitemDisplay_TransitionTo_listBudgetitemsPage(BudgetitemDisplay instance, TransitionTo<ListBudgetitemPage> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::listBudgetitemsPage = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_budget(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::budget;
  }-*/;

  native static void BudgetitemDisplay_TableCell_budget(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::budget = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_itemTy(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::itemTy;
  }-*/;

  native static void BudgetitemDisplay_TableCell_itemTy(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::itemTy = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_justification(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::justification;
  }-*/;

  native static void BudgetitemDisplay_TableCell_justification(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::justification = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_universe(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::universe;
  }-*/;

  native static void BudgetitemDisplay_TableCell_universe(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::universe = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_name(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::name;
  }-*/;

  native static void BudgetitemDisplay_TableCell_name(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::name = value;
  }-*/;

  native static DataBinder BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder;
  }-*/;

  native static void BudgetitemPresenter_DataBinder_binder(BudgetitemPresenter instance, DataBinder<Budgetitem> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter::binder = value;
  }-*/;

  native static AnchorElement BudgetitemDisplay_AnchorElement_editBudgetitemBtn(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::editBudgetitemBtn;
  }-*/;

  native static void BudgetitemDisplay_AnchorElement_editBudgetitemBtn(BudgetitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::editBudgetitemBtn = value;
  }-*/;

  native static AnchorElement BudgetitemDisplay_AnchorElement_deleteBudgetitemBtn(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::deleteBudgetitemBtn;
  }-*/;

  native static void BudgetitemDisplay_AnchorElement_deleteBudgetitemBtn(BudgetitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::deleteBudgetitemBtn = value;
  }-*/;

  native static Event BudgetitemDisplay_Event_renderEditViewEvent(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::renderEditViewEvent;
  }-*/;

  native static void BudgetitemDisplay_Event_renderEditViewEvent(BudgetitemDisplay instance, Event<BudgetitemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::renderEditViewEvent = value;
  }-*/;

  native static AnchorElement BudgetitemDisplay_AnchorElement_listBudgetitemsPageLink(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::listBudgetitemsPageLink;
  }-*/;

  native static void BudgetitemDisplay_AnchorElement_listBudgetitemsPageLink(BudgetitemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::listBudgetitemsPageLink = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_parentItem(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::parentItem;
  }-*/;

  native static void BudgetitemDisplay_TableCell_parentItem(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::parentItem = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_effectiveDt(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::effectiveDt;
  }-*/;

  native static void BudgetitemDisplay_TableCell_effectiveDt(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::effectiveDt = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_entityCode(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::entityCode;
  }-*/;

  native static void BudgetitemDisplay_TableCell_entityCode(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::entityCode = value;
  }-*/;

  native static Heading BudgetitemDisplay_Heading_code(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::code;
  }-*/;

  native static void BudgetitemDisplay_Heading_code(BudgetitemDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::code = value;
  }-*/;

  native static Span BudgetitemDisplay_Span_createdDt(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::createdDt;
  }-*/;

  native static void BudgetitemDisplay_Span_createdDt(BudgetitemDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::createdDt = value;
  }-*/;

  native static Div BudgetitemDisplay_Div_entityDisplayComponent(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::entityDisplayComponent;
  }-*/;

  native static void BudgetitemDisplay_Div_entityDisplayComponent(BudgetitemDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell BudgetitemDisplay_TableCell_amount(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::amount;
  }-*/;

  native static void BudgetitemDisplay_TableCell_amount(BudgetitemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::amount = value;
  }-*/;

  native static Span BudgetitemDisplay_Span_lastModifiedDt(BudgetitemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::lastModifiedDt;
  }-*/;

  native static void BudgetitemDisplay_Span_lastModifiedDt(BudgetitemDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay::lastModifiedDt = value;
  }-*/;
}
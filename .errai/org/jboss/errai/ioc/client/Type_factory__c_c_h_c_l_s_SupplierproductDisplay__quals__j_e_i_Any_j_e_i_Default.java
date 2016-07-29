package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.supplierproduct.ListSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.shared.model.Supplierproduct;
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

public class Type_factory__c_c_h_c_l_s_SupplierproductDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(SupplierproductDisplay.class, "Type_factory__c_c_h_c_l_s_SupplierproductDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_s_SupplierproductDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_s_SupplierproductDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(SupplierproductDisplay.class);
    handle.addAssignableType(SupplierproductPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public SupplierproductDisplay createInstance(final ContextManager contextManager) {
    final SupplierproductDisplay instance = new SupplierproductDisplay();
    setIncompleteInstance(instance);
    final Span SupplierproductDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_lastModifiedDt);
    SupplierproductDisplay_Span_lastModifiedDt(instance, SupplierproductDisplay_lastModifiedDt);
    final TableCell SupplierproductDisplay_rating = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_rating);
    SupplierproductDisplay_TableCell_rating(instance, SupplierproductDisplay_rating);
    final TableCell SupplierproductDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_entityCode);
    SupplierproductDisplay_TableCell_entityCode(instance, SupplierproductDisplay_entityCode);
    final TableCell SupplierproductDisplay_availFromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_availFromDt);
    SupplierproductDisplay_TableCell_availFromDt(instance, SupplierproductDisplay_availFromDt);
    final TableCell SupplierproductDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_universe);
    SupplierproductDisplay_TableCell_universe(instance, SupplierproductDisplay_universe);
    final TableCell SupplierproductDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_name);
    SupplierproductDisplay_TableCell_name(instance, SupplierproductDisplay_name);
    final Event SupplierproductDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SupplierproductDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, SupplierproductDisplay_renderEditViewEvent);
    SupplierproductDisplay_Event_renderEditViewEvent(instance, SupplierproductDisplay_renderEditViewEvent);
    final Heading SupplierproductDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, SupplierproductDisplay_code);
    SupplierproductDisplay_Heading_code(instance, SupplierproductDisplay_code);
    final Div SupplierproductDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_entityDisplayComponent);
    SupplierproductDisplay_Div_entityDisplayComponent(instance, SupplierproductDisplay_entityDisplayComponent);
    final TransitionTo SupplierproductDisplay_listSupplierproductsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListSupplierproductPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SupplierproductDisplay_listSupplierproductsPage);
    SupplierproductDisplay_TransitionTo_listSupplierproductsPage(instance, SupplierproductDisplay_listSupplierproductsPage);
    final TableCell SupplierproductDisplay_remarks = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_remarks);
    SupplierproductDisplay_TableCell_remarks(instance, SupplierproductDisplay_remarks);
    final TableCell SupplierproductDisplay_pref = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_pref);
    SupplierproductDisplay_TableCell_pref(instance, SupplierproductDisplay_pref);
    final DataBinder SupplierproductPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Supplierproduct.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SupplierproductPresenter_binder);
    SupplierproductPresenter_DataBinder_binder(instance, SupplierproductPresenter_binder);
    final TableCell SupplierproductDisplay_availToDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_availToDt);
    SupplierproductDisplay_TableCell_availToDt(instance, SupplierproductDisplay_availToDt);
    final Event SupplierproductDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { SupplierproductDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, SupplierproductDisplay_deleteEntityEvent);
    SupplierproductDisplay_Event_deleteEntityEvent(instance, SupplierproductDisplay_deleteEntityEvent);
    final TableCell SupplierproductDisplay_prod = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_prod);
    SupplierproductDisplay_TableCell_prod(instance, SupplierproductDisplay_prod);
    final Span SupplierproductDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_createdDt);
    SupplierproductDisplay_Span_createdDt(instance, SupplierproductDisplay_createdDt);
    final TableCell SupplierproductDisplay_supplier = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SupplierproductDisplay_supplier);
    SupplierproductDisplay_TableCell_supplier(instance, SupplierproductDisplay_supplier);
    c_c_h_c_l_s_SupplierproductDisplayTemplateResource templateForSupplierproductDisplay = GWT.create(c_c_h_c_l_s_SupplierproductDisplayTemplateResource.class);
    Element parentElementForTemplateOfSupplierproductDisplay = TemplateUtil.getRootTemplateParentElement(templateForSupplierproductDisplay.getContents().getText(), "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_supplier(instance)));
      }
    }, dataFieldElements, "supplier");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_rating(instance)));
      }
    }, dataFieldElements, "rating");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_prod(instance)));
      }
    }, dataFieldElements, "prod");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_pref(instance)));
      }
    }, dataFieldElements, "pref");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_availFromDt(instance)));
      }
    }, dataFieldElements, "availFromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_availToDt(instance)));
      }
    }, dataFieldElements, "availToDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_remarks(instance)));
      }
    }, dataFieldElements, "remarks");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_editSupplierproductBtn(instance));
      }
    }, dataFieldElements, "editSupplierproductBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_deleteSupplierproductBtn(instance));
      }
    }, dataFieldElements, "deleteSupplierproductBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com/cloderia/helion/client/local/supplierproduct/view-supplierproduct-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_listSupplierproductsPageLink(instance));
      }
    }, dataFieldElements, "listSupplierproductsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("supplier", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_supplier(instance))));
    templateFieldsMap.put("rating", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_rating(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("prod", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_prod(instance))));
    templateFieldsMap.put("pref", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_pref(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_name(instance))));
    templateFieldsMap.put("availFromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_availFromDt(instance))));
    templateFieldsMap.put("availToDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_availToDt(instance))));
    templateFieldsMap.put("remarks", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SupplierproductDisplay_TableCell_remarks(instance))));
    templateFieldsMap.put("editSupplierproductBtn", ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_editSupplierproductBtn(instance)));
    templateFieldsMap.put("deleteSupplierproductBtn", ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_deleteSupplierproductBtn(instance)));
    templateFieldsMap.put("listSupplierproductsPageLink", ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_listSupplierproductsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSupplierproductDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editSupplierproductBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditSupplierproductBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteSupplierproductBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteSupplierproductBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listSupplierproductsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = SupplierproductPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_supplier(instance))), "supplier.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_rating(instance))), "rating.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_prod(instance))), "prod.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_pref(instance))), "pref.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_availFromDt(instance))), "availFromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_availToDt(instance))), "availToDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(SupplierproductDisplay_TableCell_remarks(instance))), "remarks", null, null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SupplierproductDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final SupplierproductDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_editSupplierproductBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_deleteSupplierproductBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(SupplierproductDisplay_AnchorElement_listSupplierproductsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final SupplierproductDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static Event SupplierproductDisplay_Event_deleteEntityEvent(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::deleteEntityEvent;
  }-*/;

  native static void SupplierproductDisplay_Event_deleteEntityEvent(SupplierproductDisplay instance, Event<SupplierproductDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::deleteEntityEvent = value;
  }-*/;

  native static TransitionTo SupplierproductDisplay_TransitionTo_listSupplierproductsPage(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::listSupplierproductsPage;
  }-*/;

  native static void SupplierproductDisplay_TransitionTo_listSupplierproductsPage(SupplierproductDisplay instance, TransitionTo<ListSupplierproductPage> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::listSupplierproductsPage = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_availFromDt(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::availFromDt;
  }-*/;

  native static void SupplierproductDisplay_TableCell_availFromDt(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::availFromDt = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_name(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::name;
  }-*/;

  native static void SupplierproductDisplay_TableCell_name(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::name = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_entityCode(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::entityCode;
  }-*/;

  native static void SupplierproductDisplay_TableCell_entityCode(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::entityCode = value;
  }-*/;

  native static Event SupplierproductDisplay_Event_renderEditViewEvent(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::renderEditViewEvent;
  }-*/;

  native static void SupplierproductDisplay_Event_renderEditViewEvent(SupplierproductDisplay instance, Event<SupplierproductDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::renderEditViewEvent = value;
  }-*/;

  native static Heading SupplierproductDisplay_Heading_code(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::code;
  }-*/;

  native static void SupplierproductDisplay_Heading_code(SupplierproductDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::code = value;
  }-*/;

  native static Div SupplierproductDisplay_Div_entityDisplayComponent(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::entityDisplayComponent;
  }-*/;

  native static void SupplierproductDisplay_Div_entityDisplayComponent(SupplierproductDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::entityDisplayComponent = value;
  }-*/;

  native static Span SupplierproductDisplay_Span_createdDt(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::createdDt;
  }-*/;

  native static void SupplierproductDisplay_Span_createdDt(SupplierproductDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::createdDt = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_supplier(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::supplier;
  }-*/;

  native static void SupplierproductDisplay_TableCell_supplier(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::supplier = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_availToDt(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::availToDt;
  }-*/;

  native static void SupplierproductDisplay_TableCell_availToDt(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::availToDt = value;
  }-*/;

  native static AnchorElement SupplierproductDisplay_AnchorElement_editSupplierproductBtn(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::editSupplierproductBtn;
  }-*/;

  native static void SupplierproductDisplay_AnchorElement_editSupplierproductBtn(SupplierproductDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::editSupplierproductBtn = value;
  }-*/;

  native static Span SupplierproductDisplay_Span_lastModifiedDt(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::lastModifiedDt;
  }-*/;

  native static void SupplierproductDisplay_Span_lastModifiedDt(SupplierproductDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::lastModifiedDt = value;
  }-*/;

  native static DataBinder SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder;
  }-*/;

  native static void SupplierproductPresenter_DataBinder_binder(SupplierproductPresenter instance, DataBinder<Supplierproduct> value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter::binder = value;
  }-*/;

  native static AnchorElement SupplierproductDisplay_AnchorElement_listSupplierproductsPageLink(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::listSupplierproductsPageLink;
  }-*/;

  native static void SupplierproductDisplay_AnchorElement_listSupplierproductsPageLink(SupplierproductDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::listSupplierproductsPageLink = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_remarks(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::remarks;
  }-*/;

  native static void SupplierproductDisplay_TableCell_remarks(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::remarks = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_rating(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::rating;
  }-*/;

  native static void SupplierproductDisplay_TableCell_rating(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::rating = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_universe(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::universe;
  }-*/;

  native static void SupplierproductDisplay_TableCell_universe(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::universe = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_pref(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::pref;
  }-*/;

  native static void SupplierproductDisplay_TableCell_pref(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::pref = value;
  }-*/;

  native static TableCell SupplierproductDisplay_TableCell_prod(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::prod;
  }-*/;

  native static void SupplierproductDisplay_TableCell_prod(SupplierproductDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::prod = value;
  }-*/;

  native static AnchorElement SupplierproductDisplay_AnchorElement_deleteSupplierproductBtn(SupplierproductDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::deleteSupplierproductBtn;
  }-*/;

  native static void SupplierproductDisplay_AnchorElement_deleteSupplierproductBtn(SupplierproductDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay::deleteSupplierproductBtn = value;
  }-*/;
}
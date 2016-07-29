package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
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

public class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountListItemDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationgeneralledgeraccountListItemDisplay.class, "Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationgeneralledgeraccountListItemDisplay.class);
    handle.addAssignableType(OrganizationgeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationgeneralledgeraccountListItemDisplay createInstance(final ContextManager contextManager) {
    final OrganizationgeneralledgeraccountListItemDisplay instance = new OrganizationgeneralledgeraccountListItemDisplay();
    setIncompleteInstance(instance);
    final TableRow OrganizationgeneralledgeraccountListItemDisplay_organizationgeneralledgeraccountItem = (TableRow) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_organizationgeneralledgeraccountItem);
    OrganizationgeneralledgeraccountListItemDisplay_TableRow_organizationgeneralledgeraccountItem(instance, OrganizationgeneralledgeraccountListItemDisplay_organizationgeneralledgeraccountItem);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_organization = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_organization);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_organization(instance, OrganizationgeneralledgeraccountListItemDisplay_organization);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_productCat = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_productCat);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_productCat(instance, OrganizationgeneralledgeraccountListItemDisplay_productCat);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_name);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_name(instance, OrganizationgeneralledgeraccountListItemDisplay_name);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_fromDt);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_fromDt(instance, OrganizationgeneralledgeraccountListItemDisplay_fromDt);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_product = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_product);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_product(instance, OrganizationgeneralledgeraccountListItemDisplay_product);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_description);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_description(instance, OrganizationgeneralledgeraccountListItemDisplay_description);
    final Event OrganizationgeneralledgeraccountListItemDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationgeneralledgeraccountListItemDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_renderEditViewEvent);
    OrganizationgeneralledgeraccountListItemDisplay_Event_renderEditViewEvent(instance, OrganizationgeneralledgeraccountListItemDisplay_renderEditViewEvent);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_glAccount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_glAccount);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_glAccount(instance, OrganizationgeneralledgeraccountListItemDisplay_glAccount);
    final DataBinder OrganizationgeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationgeneralledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountPresenter_binder);
    OrganizationgeneralledgeraccountPresenter_DataBinder_binder(instance, OrganizationgeneralledgeraccountPresenter_binder);
    final AnchorElement OrganizationgeneralledgeraccountListItemDisplay_deleteEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_deleteEntityListItemBtn);
    OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance, OrganizationgeneralledgeraccountListItemDisplay_deleteEntityListItemBtn);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_entityCode);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_entityCode(instance, OrganizationgeneralledgeraccountListItemDisplay_entityCode);
    final Event OrganizationgeneralledgeraccountListItemDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationgeneralledgeraccountListItemDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_deleteEntityEvent);
    OrganizationgeneralledgeraccountListItemDisplay_Event_deleteEntityEvent(instance, OrganizationgeneralledgeraccountListItemDisplay_deleteEntityEvent);
    final TableCell OrganizationgeneralledgeraccountListItemDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_toDt);
    OrganizationgeneralledgeraccountListItemDisplay_TableCell_toDt(instance, OrganizationgeneralledgeraccountListItemDisplay_toDt);
    final AnchorElement OrganizationgeneralledgeraccountListItemDisplay_editEntityListItemBtn = (AnchorElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_editEntityListItemBtn);
    OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance, OrganizationgeneralledgeraccountListItemDisplay_editEntityListItemBtn);
    final Event OrganizationgeneralledgeraccountListItemDisplay_renderSingleViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationgeneralledgeraccountListItemDisplay.class }, new Annotation[] { new RenderSingleView() {
        public Class annotationType() {
          return RenderSingleView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderSingleView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountListItemDisplay_renderSingleViewEvent);
    OrganizationgeneralledgeraccountListItemDisplay_Event_renderSingleViewEvent(instance, OrganizationgeneralledgeraccountListItemDisplay_renderSingleViewEvent);
    c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplayTemplateResource templateForOrganizationgeneralledgeraccountListItemDisplay = GWT.create(c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplayTemplateResource.class);
    Element parentElementForTemplateOfOrganizationgeneralledgeraccountListItemDisplay = TemplateUtil.getRootTemplateParentElement(templateForOrganizationgeneralledgeraccountListItemDisplay.getContents().getText(), "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", "organizationgeneralledgeraccountItem");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountListItemDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountListItemDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableRow_organizationgeneralledgeraccountItem(instance)));
      }
    }, dataFieldElements, "organizationgeneralledgeraccountItem");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_organization(instance)));
      }
    }, dataFieldElements, "organization");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_productCat(instance)));
      }
    }, dataFieldElements, "productCat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_product(instance)));
      }
    }, dataFieldElements, "product");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_glAccount(instance)));
      }
    }, dataFieldElements, "glAccount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance));
      }
    }, dataFieldElements, "editEntityListItemBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/list-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance));
      }
    }, dataFieldElements, "deleteEntityListItemBtn");
    templateFieldsMap.put("organizationgeneralledgeraccountItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableRow_organizationgeneralledgeraccountItem(instance))));
    templateFieldsMap.put("organization", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_organization(instance))));
    templateFieldsMap.put("productCat", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_productCat(instance))));
    templateFieldsMap.put("product", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_product(instance))));
    templateFieldsMap.put("glAccount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_glAccount(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_description(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editEntityListItemBtn", ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    templateFieldsMap.put("deleteEntityListItemBtn", ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountListItemDisplay), templateFieldsMap.values());
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
    DataBinder binder = OrganizationgeneralledgeraccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_organization(instance))), "organization.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_productCat(instance))), "productCat.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_product(instance))), "product.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_glAccount(instance))), "glAccount.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountListItemDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationgeneralledgeraccountListItemDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationgeneralledgeraccountListItemDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationgeneralledgeraccountListItemDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_entityCode(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::entityCode;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_entityCode(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::entityCode = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_name(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::name;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_name(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::name = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_organization(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::organization;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_organization(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::organization = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_glAccount(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::glAccount;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_glAccount(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::glAccount = value;
  }-*/;

  native static Event OrganizationgeneralledgeraccountListItemDisplay_Event_renderEditViewEvent(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::renderEditViewEvent;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_Event_renderEditViewEvent(OrganizationgeneralledgeraccountListItemDisplay instance, Event<OrganizationgeneralledgeraccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::renderEditViewEvent = value;
  }-*/;

  native static Event OrganizationgeneralledgeraccountListItemDisplay_Event_deleteEntityEvent(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::deleteEntityEvent;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_Event_deleteEntityEvent(OrganizationgeneralledgeraccountListItemDisplay instance, Event<OrganizationgeneralledgeraccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_product(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::product;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_product(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::product = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_toDt(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::toDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_toDt(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::toDt = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_productCat(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::productCat;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_productCat(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::productCat = value;
  }-*/;

  native static Event OrganizationgeneralledgeraccountListItemDisplay_Event_renderSingleViewEvent(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::renderSingleViewEvent;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_Event_renderSingleViewEvent(OrganizationgeneralledgeraccountListItemDisplay instance, Event<OrganizationgeneralledgeraccountListItemDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::renderSingleViewEvent = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_fromDt(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::fromDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_fromDt(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::fromDt = value;
  }-*/;

  native static AnchorElement OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::editEntityListItemBtn;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_editEntityListItemBtn(OrganizationgeneralledgeraccountListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::editEntityListItemBtn = value;
  }-*/;

  native static DataBinder OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder;
  }-*/;

  native static void OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance, DataBinder<Organizationgeneralledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder = value;
  }-*/;

  native static TableRow OrganizationgeneralledgeraccountListItemDisplay_TableRow_organizationgeneralledgeraccountItem(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::organizationgeneralledgeraccountItem;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableRow_organizationgeneralledgeraccountItem(OrganizationgeneralledgeraccountListItemDisplay instance, TableRow value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::organizationgeneralledgeraccountItem = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountListItemDisplay_TableCell_description(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::description;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_TableCell_description(OrganizationgeneralledgeraccountListItemDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::description = value;
  }-*/;

  native static AnchorElement OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(OrganizationgeneralledgeraccountListItemDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::deleteEntityListItemBtn;
  }-*/;

  native static void OrganizationgeneralledgeraccountListItemDisplay_AnchorElement_deleteEntityListItemBtn(OrganizationgeneralledgeraccountListItemDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay::deleteEntityListItemBtn = value;
  }-*/;
}
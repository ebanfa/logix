package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ListOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
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

public class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountDisplay> {
  private FactoryHandleImpl handle = new FactoryHandleImpl(OrganizationgeneralledgeraccountDisplay.class, "Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true);
  public interface c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplayTemplateResource extends Template, ClientBundle { @Source("com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html") public TextResource getContents(); }
  public Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default() {
    handle.addAssignableType(OrganizationgeneralledgeraccountDisplay.class);
    handle.addAssignableType(OrganizationgeneralledgeraccountPresenter.class);
    handle.addAssignableType(Object.class);
    handle.addAssignableType(TakesValue.class);
    handle.addAssignableType(IsElement.class);
    handle.addQualifier(QualifierUtil.ANY_ANNOTATION);
    handle.addQualifier(QualifierUtil.DEFAULT_ANNOTATION);
  }

  public void init(final Context context) {

  }

  public OrganizationgeneralledgeraccountDisplay createInstance(final ContextManager contextManager) {
    final OrganizationgeneralledgeraccountDisplay instance = new OrganizationgeneralledgeraccountDisplay();
    setIncompleteInstance(instance);
    final Event OrganizationgeneralledgeraccountDisplay_renderEditViewEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationgeneralledgeraccountDisplay.class }, new Annotation[] { new RenderEditView() {
        public Class annotationType() {
          return RenderEditView.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.RenderEditView()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_renderEditViewEvent);
    OrganizationgeneralledgeraccountDisplay_Event_renderEditViewEvent(instance, OrganizationgeneralledgeraccountDisplay_renderEditViewEvent);
    final TableCell OrganizationgeneralledgeraccountDisplay_entityCode = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_entityCode);
    OrganizationgeneralledgeraccountDisplay_TableCell_entityCode(instance, OrganizationgeneralledgeraccountDisplay_entityCode);
    final Event OrganizationgeneralledgeraccountDisplay_deleteEntityEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { OrganizationgeneralledgeraccountDisplay.class }, new Annotation[] { new DeleteEntity() {
        public Class annotationType() {
          return DeleteEntity.class;
        }
        public String toString() {
          return "@com.cloderia.helion.client.local.ui.DeleteEntity()";
        }
    } });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_deleteEntityEvent);
    OrganizationgeneralledgeraccountDisplay_Event_deleteEntityEvent(instance, OrganizationgeneralledgeraccountDisplay_deleteEntityEvent);
    final TableCell OrganizationgeneralledgeraccountDisplay_description = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_description);
    OrganizationgeneralledgeraccountDisplay_TableCell_description(instance, OrganizationgeneralledgeraccountDisplay_description);
    final TransitionTo OrganizationgeneralledgeraccountDisplay_listOrganizationgeneralledgeraccountsPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ListOrganizationgeneralledgeraccountPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_listOrganizationgeneralledgeraccountsPage);
    OrganizationgeneralledgeraccountDisplay_TransitionTo_listOrganizationgeneralledgeraccountsPage(instance, OrganizationgeneralledgeraccountDisplay_listOrganizationgeneralledgeraccountsPage);
    final TableCell OrganizationgeneralledgeraccountDisplay_universe = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_universe);
    OrganizationgeneralledgeraccountDisplay_TableCell_universe(instance, OrganizationgeneralledgeraccountDisplay_universe);
    final Heading OrganizationgeneralledgeraccountDisplay_code = (Heading) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_code);
    OrganizationgeneralledgeraccountDisplay_Heading_code(instance, OrganizationgeneralledgeraccountDisplay_code);
    final DataBinder OrganizationgeneralledgeraccountPresenter_binder = (DataBinder) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal", new Class[] { Organizationgeneralledgeraccount.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountPresenter_binder);
    OrganizationgeneralledgeraccountPresenter_DataBinder_binder(instance, OrganizationgeneralledgeraccountPresenter_binder);
    final TableCell OrganizationgeneralledgeraccountDisplay_product = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_product);
    OrganizationgeneralledgeraccountDisplay_TableCell_product(instance, OrganizationgeneralledgeraccountDisplay_product);
    final TableCell OrganizationgeneralledgeraccountDisplay_fromDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_fromDt);
    OrganizationgeneralledgeraccountDisplay_TableCell_fromDt(instance, OrganizationgeneralledgeraccountDisplay_fromDt);
    final TableCell OrganizationgeneralledgeraccountDisplay_toDt = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_toDt);
    OrganizationgeneralledgeraccountDisplay_TableCell_toDt(instance, OrganizationgeneralledgeraccountDisplay_toDt);
    final Div OrganizationgeneralledgeraccountDisplay_entityDisplayComponent = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_entityDisplayComponent);
    OrganizationgeneralledgeraccountDisplay_Div_entityDisplayComponent(instance, OrganizationgeneralledgeraccountDisplay_entityDisplayComponent);
    final Span OrganizationgeneralledgeraccountDisplay_lastModifiedDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_lastModifiedDt);
    OrganizationgeneralledgeraccountDisplay_Span_lastModifiedDt(instance, OrganizationgeneralledgeraccountDisplay_lastModifiedDt);
    final TableCell OrganizationgeneralledgeraccountDisplay_organization = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_organization);
    OrganizationgeneralledgeraccountDisplay_TableCell_organization(instance, OrganizationgeneralledgeraccountDisplay_organization);
    final TableCell OrganizationgeneralledgeraccountDisplay_glAccount = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_glAccount);
    OrganizationgeneralledgeraccountDisplay_TableCell_glAccount(instance, OrganizationgeneralledgeraccountDisplay_glAccount);
    final TableCell OrganizationgeneralledgeraccountDisplay_productCat = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_productCat);
    OrganizationgeneralledgeraccountDisplay_TableCell_productCat(instance, OrganizationgeneralledgeraccountDisplay_productCat);
    final TableCell OrganizationgeneralledgeraccountDisplay_name = (TableCell) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_name);
    OrganizationgeneralledgeraccountDisplay_TableCell_name(instance, OrganizationgeneralledgeraccountDisplay_name);
    final Span OrganizationgeneralledgeraccountDisplay_createdDt = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, OrganizationgeneralledgeraccountDisplay_createdDt);
    OrganizationgeneralledgeraccountDisplay_Span_createdDt(instance, OrganizationgeneralledgeraccountDisplay_createdDt);
    c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplayTemplateResource templateForOrganizationgeneralledgeraccountDisplay = GWT.create(c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplayTemplateResource.class);
    Element parentElementForTemplateOfOrganizationgeneralledgeraccountDisplay = TemplateUtil.getRootTemplateParentElement(templateForOrganizationgeneralledgeraccountDisplay.getContents().getText(), "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", "entityDisplayComponent");
    TemplateUtil.translateTemplate("com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountDisplay));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountDisplay));
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Div_entityDisplayComponent(instance)));
      }
    }, dataFieldElements, "entityDisplayComponent");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Heading_code(instance)));
      }
    }, dataFieldElements, "code");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Span_createdDt(instance)));
      }
    }, dataFieldElements, "createdDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Span_lastModifiedDt(instance)));
      }
    }, dataFieldElements, "lastModifiedDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_organization(instance)));
      }
    }, dataFieldElements, "organization");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_productCat(instance)));
      }
    }, dataFieldElements, "productCat");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_universe(instance)));
      }
    }, dataFieldElements, "universe");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_product(instance)));
      }
    }, dataFieldElements, "product");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_glAccount(instance)));
      }
    }, dataFieldElements, "glAccount");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_entityCode(instance)));
      }
    }, dataFieldElements, "entityCode");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_name(instance)));
      }
    }, dataFieldElements, "name");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_description(instance)));
      }
    }, dataFieldElements, "description");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_fromDt(instance)));
      }
    }, dataFieldElements, "fromDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_toDt(instance)));
      }
    }, dataFieldElements, "toDt");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_editOrganizationgeneralledgeraccountBtn(instance));
      }
    }, dataFieldElements, "editOrganizationgeneralledgeraccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_deleteOrganizationgeneralledgeraccountBtn(instance));
      }
    }, dataFieldElements, "deleteOrganizationgeneralledgeraccountBtn");
    TemplateUtil.compositeComponentReplace("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com/cloderia/helion/client/local/organizationgeneralledgeraccount/view-organizationgeneralledgeraccount-page.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance));
      }
    }, dataFieldElements, "listOrganizationgeneralledgeraccountsPageLink");
    templateFieldsMap.put("entityDisplayComponent", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Div_entityDisplayComponent(instance))));
    templateFieldsMap.put("code", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Heading_code(instance))));
    templateFieldsMap.put("createdDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Span_createdDt(instance))));
    templateFieldsMap.put("lastModifiedDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_Span_lastModifiedDt(instance))));
    templateFieldsMap.put("organization", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_organization(instance))));
    templateFieldsMap.put("productCat", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_productCat(instance))));
    templateFieldsMap.put("universe", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_universe(instance))));
    templateFieldsMap.put("product", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_product(instance))));
    templateFieldsMap.put("glAccount", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_glAccount(instance))));
    templateFieldsMap.put("entityCode", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_entityCode(instance))));
    templateFieldsMap.put("name", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_name(instance))));
    templateFieldsMap.put("description", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_description(instance))));
    templateFieldsMap.put("fromDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_fromDt(instance))));
    templateFieldsMap.put("toDt", ElementWrapperWidget.getWidget(TemplateUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_toDt(instance))));
    templateFieldsMap.put("editOrganizationgeneralledgeraccountBtn", ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_editOrganizationgeneralledgeraccountBtn(instance)));
    templateFieldsMap.put("deleteOrganizationgeneralledgeraccountBtn", ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_deleteOrganizationgeneralledgeraccountBtn(instance)));
    templateFieldsMap.put("listOrganizationgeneralledgeraccountsPageLink", ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance)));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOrganizationgeneralledgeraccountDisplay), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("editOrganizationgeneralledgeraccountBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onEditOrganizationgeneralledgeraccountBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("deleteOrganizationgeneralledgeraccountBtn"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onDeleteOrganizationgeneralledgeraccountBtnClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("listOrganizationgeneralledgeraccountsPageLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onClickViewAllBtn(event);
      }
    }, ClickEvent.getType());
    DataBinder binder = OrganizationgeneralledgeraccountPresenter_DataBinder_binder(instance);
    if (binder == null) {
      throw new RuntimeException("@AutoBound data binder for class com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay has not been initialized. Either initialize or add @Inject!");
    }
    thisInstance.setReference(instance, "DataModelBinder", binder);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_Heading_code(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_Span_createdDt(instance))), "createdDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_Span_lastModifiedDt(instance))), "lastModifiedDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_organization(instance))), "organization.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_productCat(instance))), "productCat.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_universe(instance))), "universe.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_product(instance))), "product.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_glAccount(instance))), "glAccount.name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_entityCode(instance))), "entityCode", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_name(instance))), "name", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_description(instance))), "description", null, null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_fromDt(instance))), "fromDt", new DateConverter(), null, false);
    binder.bind(ElementWrapperWidget.getWidget(BoundUtil.asElement(OrganizationgeneralledgeraccountDisplay_TableCell_toDt(instance))), "toDt", new DateConverter(), null, false);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OrganizationgeneralledgeraccountDisplay) instance, contextManager);
  }

  public void destroyInstanceHelper(final OrganizationgeneralledgeraccountDisplay instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_editOrganizationgeneralledgeraccountBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_deleteOrganizationgeneralledgeraccountBtn(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(OrganizationgeneralledgeraccountDisplay_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(instance)));
    TemplateUtil.cleanupTemplated(instance);
    ((DataBinder) thisInstance.getReferenceAs(instance, "DataModelBinder", DataBinder.class)).unbind();
  }

  public void invokePostConstructs(final OrganizationgeneralledgeraccountDisplay instance) {

  }

  public Proxy createProxy(final Context context) {
    return null;
  }

  public FactoryHandle getHandle() {
    return handle;
  }

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_fromDt(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::fromDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_fromDt(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::fromDt = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_productCat(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::productCat;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_productCat(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::productCat = value;
  }-*/;

  native static TransitionTo OrganizationgeneralledgeraccountDisplay_TransitionTo_listOrganizationgeneralledgeraccountsPage(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::listOrganizationgeneralledgeraccountsPage;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TransitionTo_listOrganizationgeneralledgeraccountsPage(OrganizationgeneralledgeraccountDisplay instance, TransitionTo<ListOrganizationgeneralledgeraccountPage> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::listOrganizationgeneralledgeraccountsPage = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_organization(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::organization;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_organization(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::organization = value;
  }-*/;

  native static AnchorElement OrganizationgeneralledgeraccountDisplay_AnchorElement_editOrganizationgeneralledgeraccountBtn(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::editOrganizationgeneralledgeraccountBtn;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_AnchorElement_editOrganizationgeneralledgeraccountBtn(OrganizationgeneralledgeraccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::editOrganizationgeneralledgeraccountBtn = value;
  }-*/;

  native static Event OrganizationgeneralledgeraccountDisplay_Event_renderEditViewEvent(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::renderEditViewEvent;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_Event_renderEditViewEvent(OrganizationgeneralledgeraccountDisplay instance, Event<OrganizationgeneralledgeraccountDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::renderEditViewEvent = value;
  }-*/;

  native static Span OrganizationgeneralledgeraccountDisplay_Span_lastModifiedDt(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::lastModifiedDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_Span_lastModifiedDt(OrganizationgeneralledgeraccountDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::lastModifiedDt = value;
  }-*/;

  native static Heading OrganizationgeneralledgeraccountDisplay_Heading_code(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::code;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_Heading_code(OrganizationgeneralledgeraccountDisplay instance, Heading value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::code = value;
  }-*/;

  native static Span OrganizationgeneralledgeraccountDisplay_Span_createdDt(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::createdDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_Span_createdDt(OrganizationgeneralledgeraccountDisplay instance, Span value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::createdDt = value;
  }-*/;

  native static Event OrganizationgeneralledgeraccountDisplay_Event_deleteEntityEvent(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::deleteEntityEvent;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_Event_deleteEntityEvent(OrganizationgeneralledgeraccountDisplay instance, Event<OrganizationgeneralledgeraccountDisplay> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::deleteEntityEvent = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_name(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::name;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_name(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::name = value;
  }-*/;

  native static AnchorElement OrganizationgeneralledgeraccountDisplay_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::listOrganizationgeneralledgeraccountsPageLink;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_AnchorElement_listOrganizationgeneralledgeraccountsPageLink(OrganizationgeneralledgeraccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::listOrganizationgeneralledgeraccountsPageLink = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_toDt(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::toDt;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_toDt(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::toDt = value;
  }-*/;

  native static Div OrganizationgeneralledgeraccountDisplay_Div_entityDisplayComponent(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::entityDisplayComponent;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_Div_entityDisplayComponent(OrganizationgeneralledgeraccountDisplay instance, Div value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::entityDisplayComponent = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_entityCode(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::entityCode;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_entityCode(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::entityCode = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_description(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::description;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_description(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::description = value;
  }-*/;

  native static DataBinder OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder;
  }-*/;

  native static void OrganizationgeneralledgeraccountPresenter_DataBinder_binder(OrganizationgeneralledgeraccountPresenter instance, DataBinder<Organizationgeneralledgeraccount> value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter::binder = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_universe(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::universe;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_universe(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::universe = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_product(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::product;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_product(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::product = value;
  }-*/;

  native static AnchorElement OrganizationgeneralledgeraccountDisplay_AnchorElement_deleteOrganizationgeneralledgeraccountBtn(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::deleteOrganizationgeneralledgeraccountBtn;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_AnchorElement_deleteOrganizationgeneralledgeraccountBtn(OrganizationgeneralledgeraccountDisplay instance, AnchorElement value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::deleteOrganizationgeneralledgeraccountBtn = value;
  }-*/;

  native static TableCell OrganizationgeneralledgeraccountDisplay_TableCell_glAccount(OrganizationgeneralledgeraccountDisplay instance) /*-{
    return instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::glAccount;
  }-*/;

  native static void OrganizationgeneralledgeraccountDisplay_TableCell_glAccount(OrganizationgeneralledgeraccountDisplay instance, TableCell value) /*-{
    instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay::glAccount = value;
  }-*/;
}
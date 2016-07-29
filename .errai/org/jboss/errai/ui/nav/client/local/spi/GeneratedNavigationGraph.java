package org.jboss.errai.ui.nav.client.local.spi;

import com.cloderia.helion.client.local.accountingtransaction.CreateAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.ListAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.ViewAccountingtransactionPage;
import com.cloderia.helion.client.local.agreement.CreateAgreementPage;
import com.cloderia.helion.client.local.agreement.EditAgreementPage;
import com.cloderia.helion.client.local.agreement.ListAgreementPage;
import com.cloderia.helion.client.local.agreement.ViewAgreementPage;
import com.cloderia.helion.client.local.auth.LoginPage;
import com.cloderia.helion.client.local.auth.PasswordPage;
import com.cloderia.helion.client.local.auth.SignUpPage;
import com.cloderia.helion.client.local.billingaccount.CreateBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.EditBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.ViewBillingaccountPage;
import com.cloderia.helion.client.local.budget.CreateBudgetPage;
import com.cloderia.helion.client.local.budget.EditBudgetPage;
import com.cloderia.helion.client.local.budget.ListBudgetPage;
import com.cloderia.helion.client.local.budget.ViewBudgetPage;
import com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.EditBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.ListBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.ViewBudgetitemPage;
import com.cloderia.helion.client.local.facility.CreateFacilityPage;
import com.cloderia.helion.client.local.facility.EditFacilityPage;
import com.cloderia.helion.client.local.facility.ListFacilityPage;
import com.cloderia.helion.client.local.facility.ViewFacilityPage;
import com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.EditFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.ListFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.ViewFacilitytypePage;
import com.cloderia.helion.client.local.generalledgeraccount.CreateGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.EditGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.ListGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.ViewGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccounttype.CreateGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.EditGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.ListGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.ViewGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.inventoryitem.CreateInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.EditInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.ViewInventoryitemPage;
import com.cloderia.helion.client.local.invoice.CreateInvoicePage;
import com.cloderia.helion.client.local.invoice.EditInvoicePage;
import com.cloderia.helion.client.local.invoice.ListInvoicePage;
import com.cloderia.helion.client.local.invoice.ViewInvoicePage;
import com.cloderia.helion.client.local.invoiceitem.CreateInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.EditInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.ViewInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceterm.CreateInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.EditInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.ViewInvoicetermPage;
import com.cloderia.helion.client.local.organization.CreateOrganizationPage;
import com.cloderia.helion.client.local.organization.EditOrganizationPage;
import com.cloderia.helion.client.local.organization.ListOrganizationPage;
import com.cloderia.helion.client.local.organization.ViewOrganizationPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.CreateOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.EditOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ListOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationglaccountbalance.CreateOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.EditOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.ListOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.party.CreatePartyPage;
import com.cloderia.helion.client.local.party.EditPartyPage;
import com.cloderia.helion.client.local.party.ListPartyPage;
import com.cloderia.helion.client.local.party.ViewPartyPage;
import com.cloderia.helion.client.local.partycategory.CreatePartycategoryPage;
import com.cloderia.helion.client.local.partycategory.EditPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.ListPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage;
import com.cloderia.helion.client.local.partyrole.CreatePartyrolePage;
import com.cloderia.helion.client.local.partyrole.EditPartyrolePage;
import com.cloderia.helion.client.local.partyrole.ListPartyrolePage;
import com.cloderia.helion.client.local.partyrole.ViewPartyrolePage;
import com.cloderia.helion.client.local.partyroletype.CreatePartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.EditPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.ViewPartyroletypePage;
import com.cloderia.helion.client.local.partytype.CreatePartytypePage;
import com.cloderia.helion.client.local.partytype.EditPartytypePage;
import com.cloderia.helion.client.local.partytype.ListPartytypePage;
import com.cloderia.helion.client.local.partytype.ViewPartytypePage;
import com.cloderia.helion.client.local.payment.CreatePaymentPage;
import com.cloderia.helion.client.local.payment.EditPaymentPage;
import com.cloderia.helion.client.local.payment.ListPaymentPage;
import com.cloderia.helion.client.local.payment.ViewPaymentPage;
import com.cloderia.helion.client.local.person.CreatePersonPage;
import com.cloderia.helion.client.local.person.EditPersonPage;
import com.cloderia.helion.client.local.person.ListPersonPage;
import com.cloderia.helion.client.local.person.ViewPersonPage;
import com.cloderia.helion.client.local.product.CreateProductPage;
import com.cloderia.helion.client.local.product.EditProductPage;
import com.cloderia.helion.client.local.product.ListProductPage;
import com.cloderia.helion.client.local.product.ViewProductPage;
import com.cloderia.helion.client.local.productcategory.CreateProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.EditProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ListProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ViewProductcategoryPage;
import com.cloderia.helion.client.local.productfeature.CreateProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.EditProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ListProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ViewProductfeaturePage;
import com.cloderia.helion.client.local.productfeaturetype.CreateProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.EditProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ListProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ViewProductfeaturetypePage;
import com.cloderia.helion.client.local.producttype.CreateProducttypePage;
import com.cloderia.helion.client.local.producttype.EditProducttypePage;
import com.cloderia.helion.client.local.producttype.ListProducttypePage;
import com.cloderia.helion.client.local.producttype.ViewProducttypePage;
import com.cloderia.helion.client.local.supplierproduct.CreateSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.EditSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.ListSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage;
import com.cloderia.helion.client.local.systemuser.CreateSystemuserPage;
import com.cloderia.helion.client.local.systemuser.EditSystemuserPage;
import com.cloderia.helion.client.local.systemuser.ListSystemuserPage;
import com.cloderia.helion.client.local.systemuser.ViewSystemuserPage;
import com.cloderia.helion.client.local.ui.BasePage;
import com.cloderia.helion.client.local.ui.Dashboard;
import com.cloderia.helion.client.local.universe.CreateUniversePage;
import com.cloderia.helion.client.local.universe.EditUniversePage;
import com.cloderia.helion.client.local.universe.ListUniversePage;
import com.cloderia.helion.client.local.universe.ViewUniversePage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.jboss.errai.common.client.PageRequest;
import org.jboss.errai.common.client.util.CreationalCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.HistoryToken;
import org.jboss.errai.ui.nav.client.local.api.NavigationControl;
import org.jboss.errai.ui.nav.client.shared.NavigationEvent;

public class GeneratedNavigationGraph extends NavigationGraph { public GeneratedNavigationGraph() {
    final PageNode defaultPage = new PageNode<LoginPage>() {
      public String name() {
        return "LoginPage";
      }

      public String toString() {
        return "LoginPage";
      }

      public String getURL() {
        return "/login";
      }

      public Class contentType() {
        return LoginPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(LoginPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(LoginPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(LoginPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(LoginPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("LoginPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(LoginPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(LoginPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("", defaultPage);
    pagesByRole.put(DefaultPage.class, defaultPage);
    final PageNode loginPage = defaultPage;
    pagesByName.put("LoginPage", loginPage);
    final PageNode viewAccountingtransactionPage = new PageNode<ViewAccountingtransactionPage>() {
      public String name() {
        return "ViewAccountingtransactionPage";
      }

      public String toString() {
        return "ViewAccountingtransactionPage";
      }

      public String getURL() {
        return "/viewaccountingtransaction";
      }

      public Class contentType() {
        return ViewAccountingtransactionPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewAccountingtransactionPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewAccountingtransactionPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewAccountingtransactionPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewAccountingtransactionPage_Long_id(ViewAccountingtransactionPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.accountingtransaction.ViewAccountingtransactionPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewAccountingtransactionPage_Long_id(widget, null);
        } else {
          ViewAccountingtransactionPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewAccountingtransactionPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewAccountingtransactionPage_Long_id(widget, null);
        } else {
          ViewAccountingtransactionPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewAccountingtransactionPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewAccountingtransactionPage", viewAccountingtransactionPage);
    final PageNode createProductfeaturePage = new PageNode<CreateProductfeaturePage>() {
      public String name() {
        return "CreateProductfeaturePage";
      }

      public String toString() {
        return "CreateProductfeaturePage";
      }

      public String getURL() {
        return "/createproductfeature";
      }

      public Class contentType() {
        return CreateProductfeaturePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateProductfeaturePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateProductfeaturePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateProductfeaturePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateProductfeaturePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateProductfeaturePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateProductfeaturePage", createProductfeaturePage);
    final PageNode createPartyroletypePage = new PageNode<CreatePartyroletypePage>() {
      public String name() {
        return "CreatePartyroletypePage";
      }

      public String toString() {
        return "CreatePartyroletypePage";
      }

      public String getURL() {
        return "/createpartyroletype";
      }

      public Class contentType() {
        return CreatePartyroletypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreatePartyroletypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreatePartyroletypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreatePartyroletypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreatePartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreatePartyroletypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreatePartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreatePartyroletypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreatePartyroletypePage", createPartyroletypePage);
    final PageNode viewGeneralledgeraccounttypePage = new PageNode<ViewGeneralledgeraccounttypePage>() {
      public String name() {
        return "ViewGeneralledgeraccounttypePage";
      }

      public String toString() {
        return "ViewGeneralledgeraccounttypePage";
      }

      public String getURL() {
        return "/viewgeneralledgeraccounttype";
      }

      public Class contentType() {
        return ViewGeneralledgeraccounttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewGeneralledgeraccounttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewGeneralledgeraccounttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewGeneralledgeraccounttypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewGeneralledgeraccounttypePage_Long_id(ViewGeneralledgeraccounttypePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.generalledgeraccounttype.ViewGeneralledgeraccounttypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewGeneralledgeraccounttypePage_Long_id(widget, null);
        } else {
          ViewGeneralledgeraccounttypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewGeneralledgeraccounttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewGeneralledgeraccounttypePage_Long_id(widget, null);
        } else {
          ViewGeneralledgeraccounttypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewGeneralledgeraccounttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewGeneralledgeraccounttypePage", viewGeneralledgeraccounttypePage);
    final PageNode createSupplierproductPage = new PageNode<CreateSupplierproductPage>() {
      public String name() {
        return "CreateSupplierproductPage";
      }

      public String toString() {
        return "CreateSupplierproductPage";
      }

      public String getURL() {
        return "/createsupplierproduct";
      }

      public Class contentType() {
        return CreateSupplierproductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateSupplierproductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateSupplierproductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateSupplierproductPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateSupplierproductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateSupplierproductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateSupplierproductPage", createSupplierproductPage);
    final PageNode listPartyrolePage = new PageNode<ListPartyrolePage>() {
      public String name() {
        return "ListPartyrolePage";
      }

      public String toString() {
        return "ListPartyrolePage";
      }

      public String getURL() {
        return "/listpartyrole";
      }

      public Class contentType() {
        return ListPartyrolePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListPartyrolePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListPartyrolePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListPartyrolePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListPartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListPartyrolePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListPartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListPartyrolePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListPartyrolePage", listPartyrolePage);
    final PageNode editInvoicetermPage = new PageNode<EditInvoicetermPage>() {
      public String name() {
        return "EditInvoicetermPage";
      }

      public String toString() {
        return "EditInvoicetermPage";
      }

      public String getURL() {
        return "/editinvoiceterm";
      }

      public Class contentType() {
        return EditInvoicetermPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditInvoicetermPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditInvoicetermPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditInvoicetermPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditInvoicetermPage_int_id(EditInvoicetermPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.invoiceterm.EditInvoicetermPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInvoicetermPage_int_id(widget, (int) 0);
        } else {
          EditInvoicetermPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditInvoicetermPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInvoicetermPage_int_id(widget, (int) 0);
        } else {
          EditInvoicetermPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditInvoicetermPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditInvoicetermPage", editInvoicetermPage);
    final PageNode viewInvoicePage = new PageNode<ViewInvoicePage>() {
      public String name() {
        return "ViewInvoicePage";
      }

      public String toString() {
        return "ViewInvoicePage";
      }

      public String getURL() {
        return "/viewinvoice";
      }

      public Class contentType() {
        return ViewInvoicePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewInvoicePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewInvoicePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewInvoicePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewInvoicePage_Long_id(ViewInvoicePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.invoice.ViewInvoicePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInvoicePage_Long_id(widget, null);
        } else {
          ViewInvoicePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewInvoicePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInvoicePage_Long_id(widget, null);
        } else {
          ViewInvoicePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewInvoicePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewInvoicePage", viewInvoicePage);
    final PageNode listPersonPage = new PageNode<ListPersonPage>() {
      public String name() {
        return "ListPersonPage";
      }

      public String toString() {
        return "ListPersonPage";
      }

      public String getURL() {
        return "/listperson";
      }

      public Class contentType() {
        return ListPersonPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListPersonPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListPersonPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListPersonPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListPersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListPersonPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListPersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListPersonPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListPersonPage", listPersonPage);
    final PageNode viewProductfeaturePage = new PageNode<ViewProductfeaturePage>() {
      public String name() {
        return "ViewProductfeaturePage";
      }

      public String toString() {
        return "ViewProductfeaturePage";
      }

      public String getURL() {
        return "/viewproductfeature";
      }

      public Class contentType() {
        return ViewProductfeaturePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewProductfeaturePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewProductfeaturePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewProductfeaturePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewProductfeaturePage_Long_id(ViewProductfeaturePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.productfeature.ViewProductfeaturePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductfeaturePage_Long_id(widget, null);
        } else {
          ViewProductfeaturePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewProductfeaturePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductfeaturePage_Long_id(widget, null);
        } else {
          ViewProductfeaturePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewProductfeaturePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewProductfeaturePage", viewProductfeaturePage);
    final PageNode editBudgetitemPage = new PageNode<EditBudgetitemPage>() {
      public String name() {
        return "EditBudgetitemPage";
      }

      public String toString() {
        return "EditBudgetitemPage";
      }

      public String getURL() {
        return "/editbudgetitem";
      }

      public Class contentType() {
        return EditBudgetitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditBudgetitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditBudgetitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditBudgetitemPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditBudgetitemPage_int_id(EditBudgetitemPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.budgetitem.EditBudgetitemPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditBudgetitemPage_int_id(widget, (int) 0);
        } else {
          EditBudgetitemPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditBudgetitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditBudgetitemPage_int_id(widget, (int) 0);
        } else {
          EditBudgetitemPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditBudgetitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditBudgetitemPage", editBudgetitemPage);
    final PageNode listInventoryitemPage = new PageNode<ListInventoryitemPage>() {
      public String name() {
        return "ListInventoryitemPage";
      }

      public String toString() {
        return "ListInventoryitemPage";
      }

      public String getURL() {
        return "/listinventoryitem";
      }

      public Class contentType() {
        return ListInventoryitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListInventoryitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListInventoryitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListInventoryitemPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListInventoryitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListInventoryitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListInventoryitemPage", listInventoryitemPage);
    final PageNode editOrganizationPage = new PageNode<EditOrganizationPage>() {
      public String name() {
        return "EditOrganizationPage";
      }

      public String toString() {
        return "EditOrganizationPage";
      }

      public String getURL() {
        return "/editorganization";
      }

      public Class contentType() {
        return EditOrganizationPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditOrganizationPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditOrganizationPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditOrganizationPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditOrganizationPage_int_id(EditOrganizationPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.organization.EditOrganizationPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditOrganizationPage_int_id(widget, (int) 0);
        } else {
          EditOrganizationPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditOrganizationPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditOrganizationPage_int_id(widget, (int) 0);
        } else {
          EditOrganizationPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditOrganizationPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditOrganizationPage", editOrganizationPage);
    final PageNode editFacilitytypePage = new PageNode<EditFacilitytypePage>() {
      public String name() {
        return "EditFacilitytypePage";
      }

      public String toString() {
        return "EditFacilitytypePage";
      }

      public String getURL() {
        return "/editfacilitytype";
      }

      public Class contentType() {
        return EditFacilitytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditFacilitytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditFacilitytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditFacilitytypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditFacilitytypePage_int_id(EditFacilitytypePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.facilitytype.EditFacilitytypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditFacilitytypePage_int_id(widget, (int) 0);
        } else {
          EditFacilitytypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditFacilitytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditFacilitytypePage_int_id(widget, (int) 0);
        } else {
          EditFacilitytypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditFacilitytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditFacilitytypePage", editFacilitytypePage);
    final PageNode viewOrganizationgeneralledgeraccountPage = new PageNode<ViewOrganizationgeneralledgeraccountPage>() {
      public String name() {
        return "ViewOrganizationgeneralledgeraccountPage";
      }

      public String toString() {
        return "ViewOrganizationgeneralledgeraccountPage";
      }

      public String getURL() {
        return "/vieworganizationgeneralledgeraccount";
      }

      public Class contentType() {
        return ViewOrganizationgeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewOrganizationgeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewOrganizationgeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewOrganizationgeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewOrganizationgeneralledgeraccountPage_Long_id(ViewOrganizationgeneralledgeraccountPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewOrganizationgeneralledgeraccountPage_Long_id(widget, null);
        } else {
          ViewOrganizationgeneralledgeraccountPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewOrganizationgeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewOrganizationgeneralledgeraccountPage_Long_id(widget, null);
        } else {
          ViewOrganizationgeneralledgeraccountPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewOrganizationgeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewOrganizationgeneralledgeraccountPage", viewOrganizationgeneralledgeraccountPage);
    final PageNode listGeneralledgeraccounttypePage = new PageNode<ListGeneralledgeraccounttypePage>() {
      public String name() {
        return "ListGeneralledgeraccounttypePage";
      }

      public String toString() {
        return "ListGeneralledgeraccounttypePage";
      }

      public String getURL() {
        return "/listgeneralledgeraccounttype";
      }

      public Class contentType() {
        return ListGeneralledgeraccounttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListGeneralledgeraccounttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListGeneralledgeraccounttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListGeneralledgeraccounttypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListGeneralledgeraccounttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListGeneralledgeraccounttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListGeneralledgeraccounttypePage", listGeneralledgeraccounttypePage);
    final PageNode createOrganizationPage = new PageNode<CreateOrganizationPage>() {
      public String name() {
        return "CreateOrganizationPage";
      }

      public String toString() {
        return "CreateOrganizationPage";
      }

      public String getURL() {
        return "/createorganization";
      }

      public Class contentType() {
        return CreateOrganizationPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateOrganizationPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateOrganizationPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateOrganizationPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateOrganizationPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateOrganizationPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateOrganizationPage", createOrganizationPage);
    final PageNode createFacilityPage = new PageNode<CreateFacilityPage>() {
      public String name() {
        return "CreateFacilityPage";
      }

      public String toString() {
        return "CreateFacilityPage";
      }

      public String getURL() {
        return "/createfacility";
      }

      public Class contentType() {
        return CreateFacilityPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateFacilityPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateFacilityPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateFacilityPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateFacilityPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateFacilityPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateFacilityPage", createFacilityPage);
    final PageNode listPartyroletypePage = new PageNode<ListPartyroletypePage>() {
      public String name() {
        return "ListPartyroletypePage";
      }

      public String toString() {
        return "ListPartyroletypePage";
      }

      public String getURL() {
        return "/listpartyroletype";
      }

      public Class contentType() {
        return ListPartyroletypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListPartyroletypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListPartyroletypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListPartyroletypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListPartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListPartyroletypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListPartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListPartyroletypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListPartyroletypePage", listPartyroletypePage);
    final PageNode listBudgetPage = new PageNode<ListBudgetPage>() {
      public String name() {
        return "ListBudgetPage";
      }

      public String toString() {
        return "ListBudgetPage";
      }

      public String getURL() {
        return "/listbudget";
      }

      public Class contentType() {
        return ListBudgetPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListBudgetPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListBudgetPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListBudgetPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListBudgetPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListBudgetPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListBudgetPage", listBudgetPage);
    final PageNode editInventoryitemPage = new PageNode<EditInventoryitemPage>() {
      public String name() {
        return "EditInventoryitemPage";
      }

      public String toString() {
        return "EditInventoryitemPage";
      }

      public String getURL() {
        return "/editinventoryitem";
      }

      public Class contentType() {
        return EditInventoryitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditInventoryitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditInventoryitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditInventoryitemPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditInventoryitemPage_int_id(EditInventoryitemPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.inventoryitem.EditInventoryitemPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInventoryitemPage_int_id(widget, (int) 0);
        } else {
          EditInventoryitemPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditInventoryitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInventoryitemPage_int_id(widget, (int) 0);
        } else {
          EditInventoryitemPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditInventoryitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditInventoryitemPage", editInventoryitemPage);
    final PageNode listOrganizationgeneralledgeraccountPage = new PageNode<ListOrganizationgeneralledgeraccountPage>() {
      public String name() {
        return "ListOrganizationgeneralledgeraccountPage";
      }

      public String toString() {
        return "ListOrganizationgeneralledgeraccountPage";
      }

      public String getURL() {
        return "/listorganizationgeneralledgeraccount";
      }

      public Class contentType() {
        return ListOrganizationgeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListOrganizationgeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListOrganizationgeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListOrganizationgeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListOrganizationgeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListOrganizationgeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListOrganizationgeneralledgeraccountPage", listOrganizationgeneralledgeraccountPage);
    final PageNode listProductfeaturePage = new PageNode<ListProductfeaturePage>() {
      public String name() {
        return "ListProductfeaturePage";
      }

      public String toString() {
        return "ListProductfeaturePage";
      }

      public String getURL() {
        return "/listproductfeature";
      }

      public Class contentType() {
        return ListProductfeaturePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListProductfeaturePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListProductfeaturePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListProductfeaturePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListProductfeaturePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListProductfeaturePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListProductfeaturePage", listProductfeaturePage);
    final PageNode createPartyrolePage = new PageNode<CreatePartyrolePage>() {
      public String name() {
        return "CreatePartyrolePage";
      }

      public String toString() {
        return "CreatePartyrolePage";
      }

      public String getURL() {
        return "/createpartyrole";
      }

      public Class contentType() {
        return CreatePartyrolePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreatePartyrolePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreatePartyrolePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreatePartyrolePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreatePartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreatePartyrolePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreatePartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreatePartyrolePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreatePartyrolePage", createPartyrolePage);
    final PageNode viewInvoicetermPage = new PageNode<ViewInvoicetermPage>() {
      public String name() {
        return "ViewInvoicetermPage";
      }

      public String toString() {
        return "ViewInvoicetermPage";
      }

      public String getURL() {
        return "/viewinvoiceterm";
      }

      public Class contentType() {
        return ViewInvoicetermPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewInvoicetermPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewInvoicetermPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewInvoicetermPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewInvoicetermPage_Long_id(ViewInvoicetermPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.invoiceterm.ViewInvoicetermPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInvoicetermPage_Long_id(widget, null);
        } else {
          ViewInvoicetermPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewInvoicetermPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInvoicetermPage_Long_id(widget, null);
        } else {
          ViewInvoicetermPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewInvoicetermPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewInvoicetermPage", viewInvoicetermPage);
    final PageNode editAccountingtransactionPage = new PageNode<EditAccountingtransactionPage>() {
      public String name() {
        return "EditAccountingtransactionPage";
      }

      public String toString() {
        return "EditAccountingtransactionPage";
      }

      public String getURL() {
        return "/editaccountingtransaction";
      }

      public Class contentType() {
        return EditAccountingtransactionPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditAccountingtransactionPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditAccountingtransactionPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditAccountingtransactionPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditAccountingtransactionPage_int_id(EditAccountingtransactionPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditAccountingtransactionPage_int_id(widget, (int) 0);
        } else {
          EditAccountingtransactionPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditAccountingtransactionPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditAccountingtransactionPage_int_id(widget, (int) 0);
        } else {
          EditAccountingtransactionPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditAccountingtransactionPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditAccountingtransactionPage", editAccountingtransactionPage);
    final PageNode createInvoiceitemPage = new PageNode<CreateInvoiceitemPage>() {
      public String name() {
        return "CreateInvoiceitemPage";
      }

      public String toString() {
        return "CreateInvoiceitemPage";
      }

      public String getURL() {
        return "/createinvoiceitem";
      }

      public Class contentType() {
        return CreateInvoiceitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateInvoiceitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateInvoiceitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateInvoiceitemPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateInvoiceitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateInvoiceitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateInvoiceitemPage", createInvoiceitemPage);
    final PageNode editProductPage = new PageNode<EditProductPage>() {
      public String name() {
        return "EditProductPage";
      }

      public String toString() {
        return "EditProductPage";
      }

      public String getURL() {
        return "/editproduct";
      }

      public Class contentType() {
        return EditProductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditProductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditProductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditProductPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditProductPage_int_id(EditProductPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.product.EditProductPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductPage_int_id(widget, (int) 0);
        } else {
          EditProductPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditProductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductPage_int_id(widget, (int) 0);
        } else {
          EditProductPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditProductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditProductPage", editProductPage);
    final PageNode listInvoicePage = new PageNode<ListInvoicePage>() {
      public String name() {
        return "ListInvoicePage";
      }

      public String toString() {
        return "ListInvoicePage";
      }

      public String getURL() {
        return "/listinvoice";
      }

      public Class contentType() {
        return ListInvoicePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListInvoicePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListInvoicePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListInvoicePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListInvoicePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListInvoicePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListInvoicePage", listInvoicePage);
    final PageNode viewPaymentPage = new PageNode<ViewPaymentPage>() {
      public String name() {
        return "ViewPaymentPage";
      }

      public String toString() {
        return "ViewPaymentPage";
      }

      public String getURL() {
        return "/viewpayment";
      }

      public Class contentType() {
        return ViewPaymentPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewPaymentPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewPaymentPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewPaymentPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewPaymentPage_Long_id(ViewPaymentPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.payment.ViewPaymentPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewPaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPaymentPage_Long_id(widget, null);
        } else {
          ViewPaymentPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewPaymentPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewPaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPaymentPage_Long_id(widget, null);
        } else {
          ViewPaymentPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewPaymentPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewPaymentPage", viewPaymentPage);
    final PageNode listPaymentPage = new PageNode<ListPaymentPage>() {
      public String name() {
        return "ListPaymentPage";
      }

      public String toString() {
        return "ListPaymentPage";
      }

      public String getURL() {
        return "/listpayment";
      }

      public Class contentType() {
        return ListPaymentPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListPaymentPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListPaymentPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListPaymentPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListPaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListPaymentPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListPaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListPaymentPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListPaymentPage", listPaymentPage);
    final PageNode dashboard = new PageNode<Dashboard>() {
      public String name() {
        return "Dashboard";
      }

      public String toString() {
        return "Dashboard";
      }

      public String getURL() {
        return "/dashboard";
      }

      public Class contentType() {
        return Dashboard.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(Dashboard.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(Dashboard widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(Dashboard widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(Dashboard widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("Dashboard", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(Dashboard widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(Dashboard widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("Dashboard", dashboard);
    final PageNode editPersonPage = new PageNode<EditPersonPage>() {
      public String name() {
        return "EditPersonPage";
      }

      public String toString() {
        return "EditPersonPage";
      }

      public String getURL() {
        return "/editperson";
      }

      public Class contentType() {
        return EditPersonPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditPersonPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditPersonPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditPersonPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditPersonPage_int_id(EditPersonPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.person.EditPersonPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditPersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPersonPage_int_id(widget, (int) 0);
        } else {
          EditPersonPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditPersonPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditPersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPersonPage_int_id(widget, (int) 0);
        } else {
          EditPersonPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditPersonPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditPersonPage", editPersonPage);
    final PageNode listProductfeaturetypePage = new PageNode<ListProductfeaturetypePage>() {
      public String name() {
        return "ListProductfeaturetypePage";
      }

      public String toString() {
        return "ListProductfeaturetypePage";
      }

      public String getURL() {
        return "/listproductfeaturetype";
      }

      public Class contentType() {
        return ListProductfeaturetypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListProductfeaturetypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListProductfeaturetypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListProductfeaturetypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListProductfeaturetypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListProductfeaturetypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListProductfeaturetypePage", listProductfeaturetypePage);
    final PageNode createProductcategoryPage = new PageNode<CreateProductcategoryPage>() {
      public String name() {
        return "CreateProductcategoryPage";
      }

      public String toString() {
        return "CreateProductcategoryPage";
      }

      public String getURL() {
        return "/createproductcategory";
      }

      public Class contentType() {
        return CreateProductcategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateProductcategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateProductcategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateProductcategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateProductcategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateProductcategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateProductcategoryPage", createProductcategoryPage);
    final PageNode editPartyroletypePage = new PageNode<EditPartyroletypePage>() {
      public String name() {
        return "EditPartyroletypePage";
      }

      public String toString() {
        return "EditPartyroletypePage";
      }

      public String getURL() {
        return "/editpartyroletype";
      }

      public Class contentType() {
        return EditPartyroletypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditPartyroletypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditPartyroletypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditPartyroletypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditPartyroletypePage_int_id(EditPartyroletypePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.partyroletype.EditPartyroletypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditPartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartyroletypePage_int_id(widget, (int) 0);
        } else {
          EditPartyroletypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditPartyroletypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditPartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartyroletypePage_int_id(widget, (int) 0);
        } else {
          EditPartyroletypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditPartyroletypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditPartyroletypePage", editPartyroletypePage);
    final PageNode editUniversePage = new PageNode<EditUniversePage>() {
      public String name() {
        return "EditUniversePage";
      }

      public String toString() {
        return "EditUniversePage";
      }

      public String getURL() {
        return "/edituniverse";
      }

      public Class contentType() {
        return EditUniversePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditUniversePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditUniversePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditUniversePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditUniversePage_int_id(EditUniversePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.universe.EditUniversePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditUniversePage_int_id(widget, (int) 0);
        } else {
          EditUniversePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditUniversePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditUniversePage_int_id(widget, (int) 0);
        } else {
          EditUniversePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditUniversePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditUniversePage", editUniversePage);
    final PageNode createPartytypePage = new PageNode<CreatePartytypePage>() {
      public String name() {
        return "CreatePartytypePage";
      }

      public String toString() {
        return "CreatePartytypePage";
      }

      public String getURL() {
        return "/createpartytype";
      }

      public Class contentType() {
        return CreatePartytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreatePartytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreatePartytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreatePartytypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreatePartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreatePartytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreatePartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreatePartytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreatePartytypePage", createPartytypePage);
    final PageNode viewSystemuserPage = new PageNode<ViewSystemuserPage>() {
      public String name() {
        return "ViewSystemuserPage";
      }

      public String toString() {
        return "ViewSystemuserPage";
      }

      public String getURL() {
        return "/viewsystemuser";
      }

      public Class contentType() {
        return ViewSystemuserPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewSystemuserPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewSystemuserPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewSystemuserPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewSystemuserPage_Long_id(ViewSystemuserPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.systemuser.ViewSystemuserPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewSystemuserPage_Long_id(widget, null);
        } else {
          ViewSystemuserPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewSystemuserPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewSystemuserPage_Long_id(widget, null);
        } else {
          ViewSystemuserPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewSystemuserPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewSystemuserPage", viewSystemuserPage);
    final PageNode listSystemuserPage = new PageNode<ListSystemuserPage>() {
      public String name() {
        return "ListSystemuserPage";
      }

      public String toString() {
        return "ListSystemuserPage";
      }

      public String getURL() {
        return "/listsystemuser";
      }

      public Class contentType() {
        return ListSystemuserPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListSystemuserPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListSystemuserPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListSystemuserPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListSystemuserPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListSystemuserPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListSystemuserPage", listSystemuserPage);
    final PageNode createGeneralledgeraccountPage = new PageNode<CreateGeneralledgeraccountPage>() {
      public String name() {
        return "CreateGeneralledgeraccountPage";
      }

      public String toString() {
        return "CreateGeneralledgeraccountPage";
      }

      public String getURL() {
        return "/creategeneralledgeraccount";
      }

      public Class contentType() {
        return CreateGeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateGeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateGeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateGeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateGeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateGeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateGeneralledgeraccountPage", createGeneralledgeraccountPage);
    final PageNode viewFacilityPage = new PageNode<ViewFacilityPage>() {
      public String name() {
        return "ViewFacilityPage";
      }

      public String toString() {
        return "ViewFacilityPage";
      }

      public String getURL() {
        return "/viewfacility";
      }

      public Class contentType() {
        return ViewFacilityPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewFacilityPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewFacilityPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewFacilityPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewFacilityPage_Long_id(ViewFacilityPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.facility.ViewFacilityPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewFacilityPage_Long_id(widget, null);
        } else {
          ViewFacilityPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewFacilityPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewFacilityPage_Long_id(widget, null);
        } else {
          ViewFacilityPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewFacilityPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewFacilityPage", viewFacilityPage);
    final PageNode listProducttypePage = new PageNode<ListProducttypePage>() {
      public String name() {
        return "ListProducttypePage";
      }

      public String toString() {
        return "ListProducttypePage";
      }

      public String getURL() {
        return "/listproducttype";
      }

      public Class contentType() {
        return ListProducttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListProducttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListProducttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListProducttypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListProducttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListProducttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListProducttypePage", listProducttypePage);
    final PageNode editPartyrolePage = new PageNode<EditPartyrolePage>() {
      public String name() {
        return "EditPartyrolePage";
      }

      public String toString() {
        return "EditPartyrolePage";
      }

      public String getURL() {
        return "/editpartyrole";
      }

      public Class contentType() {
        return EditPartyrolePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditPartyrolePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditPartyrolePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditPartyrolePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditPartyrolePage_int_id(EditPartyrolePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.partyrole.EditPartyrolePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditPartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartyrolePage_int_id(widget, (int) 0);
        } else {
          EditPartyrolePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditPartyrolePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditPartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartyrolePage_int_id(widget, (int) 0);
        } else {
          EditPartyrolePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditPartyrolePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditPartyrolePage", editPartyrolePage);
    final PageNode createGeneralledgeraccounttypePage = new PageNode<CreateGeneralledgeraccounttypePage>() {
      public String name() {
        return "CreateGeneralledgeraccounttypePage";
      }

      public String toString() {
        return "CreateGeneralledgeraccounttypePage";
      }

      public String getURL() {
        return "/creategeneralledgeraccounttype";
      }

      public Class contentType() {
        return CreateGeneralledgeraccounttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateGeneralledgeraccounttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateGeneralledgeraccounttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateGeneralledgeraccounttypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateGeneralledgeraccounttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateGeneralledgeraccounttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateGeneralledgeraccounttypePage", createGeneralledgeraccounttypePage);
    final PageNode listBillingaccountPage = new PageNode<ListBillingaccountPage>() {
      public String name() {
        return "ListBillingaccountPage";
      }

      public String toString() {
        return "ListBillingaccountPage";
      }

      public String getURL() {
        return "/listbillingaccount";
      }

      public Class contentType() {
        return ListBillingaccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListBillingaccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListBillingaccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListBillingaccountPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListBillingaccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListBillingaccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListBillingaccountPage", listBillingaccountPage);
    final PageNode editInvoiceitemPage = new PageNode<EditInvoiceitemPage>() {
      public String name() {
        return "EditInvoiceitemPage";
      }

      public String toString() {
        return "EditInvoiceitemPage";
      }

      public String getURL() {
        return "/editinvoiceitem";
      }

      public Class contentType() {
        return EditInvoiceitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditInvoiceitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditInvoiceitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditInvoiceitemPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditInvoiceitemPage_int_id(EditInvoiceitemPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.invoiceitem.EditInvoiceitemPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInvoiceitemPage_int_id(widget, (int) 0);
        } else {
          EditInvoiceitemPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditInvoiceitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInvoiceitemPage_int_id(widget, (int) 0);
        } else {
          EditInvoiceitemPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditInvoiceitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditInvoiceitemPage", editInvoiceitemPage);
    final PageNode viewUniversePage = new PageNode<ViewUniversePage>() {
      public String name() {
        return "ViewUniversePage";
      }

      public String toString() {
        return "ViewUniversePage";
      }

      public String getURL() {
        return "/viewuniverse";
      }

      public Class contentType() {
        return ViewUniversePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewUniversePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewUniversePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewUniversePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewUniversePage_Long_id(ViewUniversePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.universe.ViewUniversePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewUniversePage_Long_id(widget, null);
        } else {
          ViewUniversePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewUniversePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewUniversePage_Long_id(widget, null);
        } else {
          ViewUniversePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewUniversePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewUniversePage", viewUniversePage);
    final PageNode listOrganizationPage = new PageNode<ListOrganizationPage>() {
      public String name() {
        return "ListOrganizationPage";
      }

      public String toString() {
        return "ListOrganizationPage";
      }

      public String getURL() {
        return "/listorganization";
      }

      public Class contentType() {
        return ListOrganizationPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListOrganizationPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListOrganizationPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListOrganizationPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListOrganizationPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListOrganizationPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListOrganizationPage", listOrganizationPage);
    final PageNode editSupplierproductPage = new PageNode<EditSupplierproductPage>() {
      public String name() {
        return "EditSupplierproductPage";
      }

      public String toString() {
        return "EditSupplierproductPage";
      }

      public String getURL() {
        return "/editsupplierproduct";
      }

      public Class contentType() {
        return EditSupplierproductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditSupplierproductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditSupplierproductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditSupplierproductPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditSupplierproductPage_int_id(EditSupplierproductPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.supplierproduct.EditSupplierproductPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditSupplierproductPage_int_id(widget, (int) 0);
        } else {
          EditSupplierproductPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditSupplierproductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditSupplierproductPage_int_id(widget, (int) 0);
        } else {
          EditSupplierproductPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditSupplierproductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditSupplierproductPage", editSupplierproductPage);
    final PageNode editGeneralledgeraccountPage = new PageNode<EditGeneralledgeraccountPage>() {
      public String name() {
        return "EditGeneralledgeraccountPage";
      }

      public String toString() {
        return "EditGeneralledgeraccountPage";
      }

      public String getURL() {
        return "/editgeneralledgeraccount";
      }

      public Class contentType() {
        return EditGeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditGeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditGeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditGeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditGeneralledgeraccountPage_int_id(EditGeneralledgeraccountPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.generalledgeraccount.EditGeneralledgeraccountPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditGeneralledgeraccountPage_int_id(widget, (int) 0);
        } else {
          EditGeneralledgeraccountPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditGeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditGeneralledgeraccountPage_int_id(widget, (int) 0);
        } else {
          EditGeneralledgeraccountPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditGeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditGeneralledgeraccountPage", editGeneralledgeraccountPage);
    final PageNode createBudgetitemPage = new PageNode<CreateBudgetitemPage>() {
      public String name() {
        return "CreateBudgetitemPage";
      }

      public String toString() {
        return "CreateBudgetitemPage";
      }

      public String getURL() {
        return "/createbudgetitem";
      }

      public Class contentType() {
        return CreateBudgetitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateBudgetitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateBudgetitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateBudgetitemPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateBudgetitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateBudgetitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateBudgetitemPage", createBudgetitemPage);
    final PageNode viewBudgetPage = new PageNode<ViewBudgetPage>() {
      public String name() {
        return "ViewBudgetPage";
      }

      public String toString() {
        return "ViewBudgetPage";
      }

      public String getURL() {
        return "/viewbudget";
      }

      public Class contentType() {
        return ViewBudgetPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewBudgetPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewBudgetPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewBudgetPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewBudgetPage_Long_id(ViewBudgetPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.budget.ViewBudgetPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewBudgetPage_Long_id(widget, null);
        } else {
          ViewBudgetPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewBudgetPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewBudgetPage_Long_id(widget, null);
        } else {
          ViewBudgetPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewBudgetPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewBudgetPage", viewBudgetPage);
    final PageNode createPartycategoryPage = new PageNode<CreatePartycategoryPage>() {
      public String name() {
        return "CreatePartycategoryPage";
      }

      public String toString() {
        return "CreatePartycategoryPage";
      }

      public String getURL() {
        return "/createpartycategory";
      }

      public Class contentType() {
        return CreatePartycategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreatePartycategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreatePartycategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreatePartycategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreatePartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreatePartycategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreatePartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreatePartycategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreatePartycategoryPage", createPartycategoryPage);
    final PageNode viewOrganizationglaccountbalancePage = new PageNode<ViewOrganizationglaccountbalancePage>() {
      public String name() {
        return "ViewOrganizationglaccountbalancePage";
      }

      public String toString() {
        return "ViewOrganizationglaccountbalancePage";
      }

      public String getURL() {
        return "/vieworganizationglaccountbalance";
      }

      public Class contentType() {
        return ViewOrganizationglaccountbalancePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewOrganizationglaccountbalancePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewOrganizationglaccountbalancePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewOrganizationglaccountbalancePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewOrganizationglaccountbalancePage_Long_id(ViewOrganizationglaccountbalancePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewOrganizationglaccountbalancePage_Long_id(widget, null);
        } else {
          ViewOrganizationglaccountbalancePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewOrganizationglaccountbalancePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewOrganizationglaccountbalancePage_Long_id(widget, null);
        } else {
          ViewOrganizationglaccountbalancePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewOrganizationglaccountbalancePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewOrganizationglaccountbalancePage", viewOrganizationglaccountbalancePage);
    final PageNode createInvoicePage = new PageNode<CreateInvoicePage>() {
      public String name() {
        return "CreateInvoicePage";
      }

      public String toString() {
        return "CreateInvoicePage";
      }

      public String getURL() {
        return "/createinvoice";
      }

      public Class contentType() {
        return CreateInvoicePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateInvoicePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateInvoicePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateInvoicePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateInvoicePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateInvoicePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateInvoicePage", createInvoicePage);
    final PageNode editBudgetPage = new PageNode<EditBudgetPage>() {
      public String name() {
        return "EditBudgetPage";
      }

      public String toString() {
        return "EditBudgetPage";
      }

      public String getURL() {
        return "/editbudget";
      }

      public Class contentType() {
        return EditBudgetPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditBudgetPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditBudgetPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditBudgetPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditBudgetPage_int_id(EditBudgetPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.budget.EditBudgetPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditBudgetPage_int_id(widget, (int) 0);
        } else {
          EditBudgetPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditBudgetPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditBudgetPage_int_id(widget, (int) 0);
        } else {
          EditBudgetPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditBudgetPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditBudgetPage", editBudgetPage);
    final PageNode createPartyPage = new PageNode<CreatePartyPage>() {
      public String name() {
        return "CreatePartyPage";
      }

      public String toString() {
        return "CreatePartyPage";
      }

      public String getURL() {
        return "/createparty";
      }

      public Class contentType() {
        return CreatePartyPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreatePartyPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreatePartyPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreatePartyPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreatePartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreatePartyPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreatePartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreatePartyPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreatePartyPage", createPartyPage);
    final PageNode viewProductfeaturetypePage = new PageNode<ViewProductfeaturetypePage>() {
      public String name() {
        return "ViewProductfeaturetypePage";
      }

      public String toString() {
        return "ViewProductfeaturetypePage";
      }

      public String getURL() {
        return "/viewproductfeaturetype";
      }

      public Class contentType() {
        return ViewProductfeaturetypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewProductfeaturetypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewProductfeaturetypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewProductfeaturetypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewProductfeaturetypePage_Long_id(ViewProductfeaturetypePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.productfeaturetype.ViewProductfeaturetypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductfeaturetypePage_Long_id(widget, null);
        } else {
          ViewProductfeaturetypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewProductfeaturetypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductfeaturetypePage_Long_id(widget, null);
        } else {
          ViewProductfeaturetypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewProductfeaturetypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewProductfeaturetypePage", viewProductfeaturetypePage);
    final PageNode editGeneralledgeraccounttypePage = new PageNode<EditGeneralledgeraccounttypePage>() {
      public String name() {
        return "EditGeneralledgeraccounttypePage";
      }

      public String toString() {
        return "EditGeneralledgeraccounttypePage";
      }

      public String getURL() {
        return "/editgeneralledgeraccounttype";
      }

      public Class contentType() {
        return EditGeneralledgeraccounttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditGeneralledgeraccounttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditGeneralledgeraccounttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditGeneralledgeraccounttypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditGeneralledgeraccounttypePage_int_id(EditGeneralledgeraccounttypePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.generalledgeraccounttype.EditGeneralledgeraccounttypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditGeneralledgeraccounttypePage_int_id(widget, (int) 0);
        } else {
          EditGeneralledgeraccounttypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditGeneralledgeraccounttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditGeneralledgeraccounttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditGeneralledgeraccounttypePage_int_id(widget, (int) 0);
        } else {
          EditGeneralledgeraccounttypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditGeneralledgeraccounttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditGeneralledgeraccounttypePage", editGeneralledgeraccounttypePage);
    final PageNode editOrganizationglaccountbalancePage = new PageNode<EditOrganizationglaccountbalancePage>() {
      public String name() {
        return "EditOrganizationglaccountbalancePage";
      }

      public String toString() {
        return "EditOrganizationglaccountbalancePage";
      }

      public String getURL() {
        return "/editorganizationglaccountbalance";
      }

      public Class contentType() {
        return EditOrganizationglaccountbalancePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditOrganizationglaccountbalancePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditOrganizationglaccountbalancePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditOrganizationglaccountbalancePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditOrganizationglaccountbalancePage_int_id(EditOrganizationglaccountbalancePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.organizationglaccountbalance.EditOrganizationglaccountbalancePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditOrganizationglaccountbalancePage_int_id(widget, (int) 0);
        } else {
          EditOrganizationglaccountbalancePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditOrganizationglaccountbalancePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditOrganizationglaccountbalancePage_int_id(widget, (int) 0);
        } else {
          EditOrganizationglaccountbalancePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditOrganizationglaccountbalancePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditOrganizationglaccountbalancePage", editOrganizationglaccountbalancePage);
    final PageNode listBudgetitemPage = new PageNode<ListBudgetitemPage>() {
      public String name() {
        return "ListBudgetitemPage";
      }

      public String toString() {
        return "ListBudgetitemPage";
      }

      public String getURL() {
        return "/listbudgetitem";
      }

      public Class contentType() {
        return ListBudgetitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListBudgetitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListBudgetitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListBudgetitemPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListBudgetitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListBudgetitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListBudgetitemPage", listBudgetitemPage);
    final PageNode editFacilityPage = new PageNode<EditFacilityPage>() {
      public String name() {
        return "EditFacilityPage";
      }

      public String toString() {
        return "EditFacilityPage";
      }

      public String getURL() {
        return "/editfacility";
      }

      public Class contentType() {
        return EditFacilityPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditFacilityPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditFacilityPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditFacilityPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditFacilityPage_int_id(EditFacilityPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.facility.EditFacilityPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditFacilityPage_int_id(widget, (int) 0);
        } else {
          EditFacilityPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditFacilityPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditFacilityPage_int_id(widget, (int) 0);
        } else {
          EditFacilityPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditFacilityPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditFacilityPage", editFacilityPage);
    final PageNode createUniversePage = new PageNode<CreateUniversePage>() {
      public String name() {
        return "CreateUniversePage";
      }

      public String toString() {
        return "CreateUniversePage";
      }

      public String getURL() {
        return "/createuniverse";
      }

      public Class contentType() {
        return CreateUniversePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateUniversePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateUniversePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateUniversePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateUniversePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateUniversePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateUniversePage", createUniversePage);
    final PageNode editInvoicePage = new PageNode<EditInvoicePage>() {
      public String name() {
        return "EditInvoicePage";
      }

      public String toString() {
        return "EditInvoicePage";
      }

      public String getURL() {
        return "/editinvoice";
      }

      public Class contentType() {
        return EditInvoicePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditInvoicePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditInvoicePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditInvoicePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditInvoicePage_int_id(EditInvoicePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.invoice.EditInvoicePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInvoicePage_int_id(widget, (int) 0);
        } else {
          EditInvoicePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditInvoicePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditInvoicePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditInvoicePage_int_id(widget, (int) 0);
        } else {
          EditInvoicePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditInvoicePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditInvoicePage", editInvoicePage);
    final PageNode listInvoiceitemPage = new PageNode<ListInvoiceitemPage>() {
      public String name() {
        return "ListInvoiceitemPage";
      }

      public String toString() {
        return "ListInvoiceitemPage";
      }

      public String getURL() {
        return "/listinvoiceitem";
      }

      public Class contentType() {
        return ListInvoiceitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListInvoiceitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListInvoiceitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListInvoiceitemPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListInvoiceitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListInvoiceitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListInvoiceitemPage", listInvoiceitemPage);
    final PageNode createOrganizationgeneralledgeraccountPage = new PageNode<CreateOrganizationgeneralledgeraccountPage>() {
      public String name() {
        return "CreateOrganizationgeneralledgeraccountPage";
      }

      public String toString() {
        return "CreateOrganizationgeneralledgeraccountPage";
      }

      public String getURL() {
        return "/createorganizationgeneralledgeraccount";
      }

      public Class contentType() {
        return CreateOrganizationgeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateOrganizationgeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateOrganizationgeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateOrganizationgeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateOrganizationgeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateOrganizationgeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateOrganizationgeneralledgeraccountPage", createOrganizationgeneralledgeraccountPage);
    final PageNode viewFacilitytypePage = new PageNode<ViewFacilitytypePage>() {
      public String name() {
        return "ViewFacilitytypePage";
      }

      public String toString() {
        return "ViewFacilitytypePage";
      }

      public String getURL() {
        return "/viewfacilitytype";
      }

      public Class contentType() {
        return ViewFacilitytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewFacilitytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewFacilitytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewFacilitytypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewFacilitytypePage_Long_id(ViewFacilitytypePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.facilitytype.ViewFacilitytypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewFacilitytypePage_Long_id(widget, null);
        } else {
          ViewFacilitytypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewFacilitytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewFacilitytypePage_Long_id(widget, null);
        } else {
          ViewFacilitytypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewFacilitytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewFacilitytypePage", viewFacilitytypePage);
    final PageNode viewBudgetitemPage = new PageNode<ViewBudgetitemPage>() {
      public String name() {
        return "ViewBudgetitemPage";
      }

      public String toString() {
        return "ViewBudgetitemPage";
      }

      public String getURL() {
        return "/viewbudgetitem";
      }

      public Class contentType() {
        return ViewBudgetitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewBudgetitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewBudgetitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewBudgetitemPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewBudgetitemPage_Long_id(ViewBudgetitemPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.budgetitem.ViewBudgetitemPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewBudgetitemPage_Long_id(widget, null);
        } else {
          ViewBudgetitemPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewBudgetitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewBudgetitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewBudgetitemPage_Long_id(widget, null);
        } else {
          ViewBudgetitemPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewBudgetitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewBudgetitemPage", viewBudgetitemPage);
    final PageNode viewProducttypePage = new PageNode<ViewProducttypePage>() {
      public String name() {
        return "ViewProducttypePage";
      }

      public String toString() {
        return "ViewProducttypePage";
      }

      public String getURL() {
        return "/viewproducttype";
      }

      public Class contentType() {
        return ViewProducttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewProducttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewProducttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewProducttypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewProducttypePage_Long_id(ViewProducttypePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.producttype.ViewProducttypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProducttypePage_Long_id(widget, null);
        } else {
          ViewProducttypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewProducttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProducttypePage_Long_id(widget, null);
        } else {
          ViewProducttypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewProducttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewProducttypePage", viewProducttypePage);
    final PageNode viewAgreementPage = new PageNode<ViewAgreementPage>() {
      public String name() {
        return "ViewAgreementPage";
      }

      public String toString() {
        return "ViewAgreementPage";
      }

      public String getURL() {
        return "/viewagreement";
      }

      public Class contentType() {
        return ViewAgreementPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewAgreementPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewAgreementPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewAgreementPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewAgreementPage_Long_id(ViewAgreementPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.agreement.ViewAgreementPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewAgreementPage_Long_id(widget, null);
        } else {
          ViewAgreementPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewAgreementPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewAgreementPage_Long_id(widget, null);
        } else {
          ViewAgreementPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewAgreementPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewAgreementPage", viewAgreementPage);
    final PageNode listInvoicetermPage = new PageNode<ListInvoicetermPage>() {
      public String name() {
        return "ListInvoicetermPage";
      }

      public String toString() {
        return "ListInvoicetermPage";
      }

      public String getURL() {
        return "/listinvoiceterm";
      }

      public Class contentType() {
        return ListInvoicetermPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListInvoicetermPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListInvoicetermPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListInvoicetermPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListInvoicetermPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListInvoicetermPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListInvoicetermPage", listInvoicetermPage);
    final PageNode viewInventoryitemPage = new PageNode<ViewInventoryitemPage>() {
      public String name() {
        return "ViewInventoryitemPage";
      }

      public String toString() {
        return "ViewInventoryitemPage";
      }

      public String getURL() {
        return "/viewinventoryitem";
      }

      public Class contentType() {
        return ViewInventoryitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewInventoryitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewInventoryitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewInventoryitemPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewInventoryitemPage_Long_id(ViewInventoryitemPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.inventoryitem.ViewInventoryitemPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInventoryitemPage_Long_id(widget, null);
        } else {
          ViewInventoryitemPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewInventoryitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInventoryitemPage_Long_id(widget, null);
        } else {
          ViewInventoryitemPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewInventoryitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewInventoryitemPage", viewInventoryitemPage);
    final PageNode createProductPage = new PageNode<CreateProductPage>() {
      public String name() {
        return "CreateProductPage";
      }

      public String toString() {
        return "CreateProductPage";
      }

      public String getURL() {
        return "/createproduct";
      }

      public Class contentType() {
        return CreateProductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateProductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateProductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateProductPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateProductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateProductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateProductPage", createProductPage);
    final PageNode viewInvoiceitemPage = new PageNode<ViewInvoiceitemPage>() {
      public String name() {
        return "ViewInvoiceitemPage";
      }

      public String toString() {
        return "ViewInvoiceitemPage";
      }

      public String getURL() {
        return "/viewinvoiceitem";
      }

      public Class contentType() {
        return ViewInvoiceitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewInvoiceitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewInvoiceitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewInvoiceitemPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewInvoiceitemPage_Long_id(ViewInvoiceitemPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.invoiceitem.ViewInvoiceitemPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInvoiceitemPage_Long_id(widget, null);
        } else {
          ViewInvoiceitemPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewInvoiceitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewInvoiceitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewInvoiceitemPage_Long_id(widget, null);
        } else {
          ViewInvoiceitemPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewInvoiceitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewInvoiceitemPage", viewInvoiceitemPage);
    final PageNode listOrganizationglaccountbalancePage = new PageNode<ListOrganizationglaccountbalancePage>() {
      public String name() {
        return "ListOrganizationglaccountbalancePage";
      }

      public String toString() {
        return "ListOrganizationglaccountbalancePage";
      }

      public String getURL() {
        return "/listorganizationglaccountbalance";
      }

      public Class contentType() {
        return ListOrganizationglaccountbalancePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListOrganizationglaccountbalancePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListOrganizationglaccountbalancePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListOrganizationglaccountbalancePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListOrganizationglaccountbalancePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListOrganizationglaccountbalancePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListOrganizationglaccountbalancePage", listOrganizationglaccountbalancePage);
    final PageNode viewPartytypePage = new PageNode<ViewPartytypePage>() {
      public String name() {
        return "ViewPartytypePage";
      }

      public String toString() {
        return "ViewPartytypePage";
      }

      public String getURL() {
        return "/viewpartytype";
      }

      public Class contentType() {
        return ViewPartytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewPartytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewPartytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewPartytypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewPartytypePage_Long_id(ViewPartytypePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.partytype.ViewPartytypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewPartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartytypePage_Long_id(widget, null);
        } else {
          ViewPartytypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewPartytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewPartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartytypePage_Long_id(widget, null);
        } else {
          ViewPartytypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewPartytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewPartytypePage", viewPartytypePage);
    final PageNode createPaymentPage = new PageNode<CreatePaymentPage>() {
      public String name() {
        return "CreatePaymentPage";
      }

      public String toString() {
        return "CreatePaymentPage";
      }

      public String getURL() {
        return "/createpayment";
      }

      public Class contentType() {
        return CreatePaymentPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreatePaymentPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreatePaymentPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreatePaymentPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreatePaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreatePaymentPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreatePaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreatePaymentPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreatePaymentPage", createPaymentPage);
    final PageNode editProductfeaturePage = new PageNode<EditProductfeaturePage>() {
      public String name() {
        return "EditProductfeaturePage";
      }

      public String toString() {
        return "EditProductfeaturePage";
      }

      public String getURL() {
        return "/editproductfeature";
      }

      public Class contentType() {
        return EditProductfeaturePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditProductfeaturePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditProductfeaturePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditProductfeaturePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditProductfeaturePage_int_id(EditProductfeaturePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.productfeature.EditProductfeaturePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductfeaturePage_int_id(widget, (int) 0);
        } else {
          EditProductfeaturePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditProductfeaturePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditProductfeaturePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductfeaturePage_int_id(widget, (int) 0);
        } else {
          EditProductfeaturePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditProductfeaturePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditProductfeaturePage", editProductfeaturePage);
    final PageNode viewPartyroletypePage = new PageNode<ViewPartyroletypePage>() {
      public String name() {
        return "ViewPartyroletypePage";
      }

      public String toString() {
        return "ViewPartyroletypePage";
      }

      public String getURL() {
        return "/viewpartyroletype";
      }

      public Class contentType() {
        return ViewPartyroletypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewPartyroletypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewPartyroletypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewPartyroletypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewPartyroletypePage_Long_id(ViewPartyroletypePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.partyroletype.ViewPartyroletypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewPartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartyroletypePage_Long_id(widget, null);
        } else {
          ViewPartyroletypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewPartyroletypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewPartyroletypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartyroletypePage_Long_id(widget, null);
        } else {
          ViewPartyroletypePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewPartyroletypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewPartyroletypePage", viewPartyroletypePage);
    final PageNode createInventoryitemPage = new PageNode<CreateInventoryitemPage>() {
      public String name() {
        return "CreateInventoryitemPage";
      }

      public String toString() {
        return "CreateInventoryitemPage";
      }

      public String getURL() {
        return "/createinventoryitem";
      }

      public Class contentType() {
        return CreateInventoryitemPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateInventoryitemPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateInventoryitemPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateInventoryitemPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateInventoryitemPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateInventoryitemPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateInventoryitemPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateInventoryitemPage", createInventoryitemPage);
    final PageNode editBillingaccountPage = new PageNode<EditBillingaccountPage>() {
      public String name() {
        return "EditBillingaccountPage";
      }

      public String toString() {
        return "EditBillingaccountPage";
      }

      public String getURL() {
        return "/editbillingaccount";
      }

      public Class contentType() {
        return EditBillingaccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditBillingaccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditBillingaccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditBillingaccountPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditBillingaccountPage_int_id(EditBillingaccountPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.billingaccount.EditBillingaccountPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditBillingaccountPage_int_id(widget, (int) 0);
        } else {
          EditBillingaccountPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditBillingaccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditBillingaccountPage_int_id(widget, (int) 0);
        } else {
          EditBillingaccountPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditBillingaccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditBillingaccountPage", editBillingaccountPage);
    final PageNode signUpPage = new PageNode<SignUpPage>() {
      public String name() {
        return "SignUpPage";
      }

      public String toString() {
        return "SignUpPage";
      }

      public String getURL() {
        return "/signup";
      }

      public Class contentType() {
        return SignUpPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(SignUpPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(SignUpPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(SignUpPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(SignUpPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("SignUpPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(SignUpPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(SignUpPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("SignUpPage", signUpPage);
    final PageNode createInvoicetermPage = new PageNode<CreateInvoicetermPage>() {
      public String name() {
        return "CreateInvoicetermPage";
      }

      public String toString() {
        return "CreateInvoicetermPage";
      }

      public String getURL() {
        return "/createinvoiceterm";
      }

      public Class contentType() {
        return CreateInvoicetermPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateInvoicetermPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateInvoicetermPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateInvoicetermPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateInvoicetermPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateInvoicetermPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateInvoicetermPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateInvoicetermPage", createInvoicetermPage);
    final PageNode viewSupplierproductPage = new PageNode<ViewSupplierproductPage>() {
      public String name() {
        return "ViewSupplierproductPage";
      }

      public String toString() {
        return "ViewSupplierproductPage";
      }

      public String getURL() {
        return "/viewsupplierproduct";
      }

      public Class contentType() {
        return ViewSupplierproductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewSupplierproductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewSupplierproductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewSupplierproductPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewSupplierproductPage_Long_id(ViewSupplierproductPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewSupplierproductPage_Long_id(widget, null);
        } else {
          ViewSupplierproductPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewSupplierproductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewSupplierproductPage_Long_id(widget, null);
        } else {
          ViewSupplierproductPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewSupplierproductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewSupplierproductPage", viewSupplierproductPage);
    final PageNode viewPersonPage = new PageNode<ViewPersonPage>() {
      public String name() {
        return "ViewPersonPage";
      }

      public String toString() {
        return "ViewPersonPage";
      }

      public String getURL() {
        return "/viewperson";
      }

      public Class contentType() {
        return ViewPersonPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewPersonPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewPersonPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewPersonPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewPersonPage_Long_id(ViewPersonPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.person.ViewPersonPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewPersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPersonPage_Long_id(widget, null);
        } else {
          ViewPersonPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewPersonPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewPersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPersonPage_Long_id(widget, null);
        } else {
          ViewPersonPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewPersonPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewPersonPage", viewPersonPage);
    final PageNode listAccountingtransactionPage = new PageNode<ListAccountingtransactionPage>() {
      public String name() {
        return "ListAccountingtransactionPage";
      }

      public String toString() {
        return "ListAccountingtransactionPage";
      }

      public String getURL() {
        return "/listaccountingtransaction";
      }

      public Class contentType() {
        return ListAccountingtransactionPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListAccountingtransactionPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListAccountingtransactionPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListAccountingtransactionPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListAccountingtransactionPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListAccountingtransactionPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListAccountingtransactionPage", listAccountingtransactionPage);
    final PageNode createBillingaccountPage = new PageNode<CreateBillingaccountPage>() {
      public String name() {
        return "CreateBillingaccountPage";
      }

      public String toString() {
        return "CreateBillingaccountPage";
      }

      public String getURL() {
        return "/createbillingaccount";
      }

      public Class contentType() {
        return CreateBillingaccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateBillingaccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateBillingaccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateBillingaccountPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateBillingaccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateBillingaccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateBillingaccountPage", createBillingaccountPage);
    final PageNode createOrganizationglaccountbalancePage = new PageNode<CreateOrganizationglaccountbalancePage>() {
      public String name() {
        return "CreateOrganizationglaccountbalancePage";
      }

      public String toString() {
        return "CreateOrganizationglaccountbalancePage";
      }

      public String getURL() {
        return "/createorganizationglaccountbalance";
      }

      public Class contentType() {
        return CreateOrganizationglaccountbalancePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateOrganizationglaccountbalancePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateOrganizationglaccountbalancePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateOrganizationglaccountbalancePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateOrganizationglaccountbalancePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateOrganizationglaccountbalancePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateOrganizationglaccountbalancePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateOrganizationglaccountbalancePage", createOrganizationglaccountbalancePage);
    final PageNode editProducttypePage = new PageNode<EditProducttypePage>() {
      public String name() {
        return "EditProducttypePage";
      }

      public String toString() {
        return "EditProducttypePage";
      }

      public String getURL() {
        return "/editproducttype";
      }

      public Class contentType() {
        return EditProducttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditProducttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditProducttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditProducttypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditProducttypePage_int_id(EditProducttypePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.producttype.EditProducttypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProducttypePage_int_id(widget, (int) 0);
        } else {
          EditProducttypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditProducttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProducttypePage_int_id(widget, (int) 0);
        } else {
          EditProducttypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditProducttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditProducttypePage", editProducttypePage);
    final PageNode editSystemuserPage = new PageNode<EditSystemuserPage>() {
      public String name() {
        return "EditSystemuserPage";
      }

      public String toString() {
        return "EditSystemuserPage";
      }

      public String getURL() {
        return "/editsystemuser";
      }

      public Class contentType() {
        return EditSystemuserPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditSystemuserPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditSystemuserPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditSystemuserPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditSystemuserPage_int_id(EditSystemuserPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.systemuser.EditSystemuserPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditSystemuserPage_int_id(widget, (int) 0);
        } else {
          EditSystemuserPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditSystemuserPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditSystemuserPage_int_id(widget, (int) 0);
        } else {
          EditSystemuserPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditSystemuserPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditSystemuserPage", editSystemuserPage);
    final PageNode listPartycategoryPage = new PageNode<ListPartycategoryPage>() {
      public String name() {
        return "ListPartycategoryPage";
      }

      public String toString() {
        return "ListPartycategoryPage";
      }

      public String getURL() {
        return "/listpartycategory";
      }

      public Class contentType() {
        return ListPartycategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListPartycategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListPartycategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListPartycategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListPartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListPartycategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListPartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListPartycategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListPartycategoryPage", listPartycategoryPage);
    final PageNode editProductfeaturetypePage = new PageNode<EditProductfeaturetypePage>() {
      public String name() {
        return "EditProductfeaturetypePage";
      }

      public String toString() {
        return "EditProductfeaturetypePage";
      }

      public String getURL() {
        return "/editproductfeaturetype";
      }

      public Class contentType() {
        return EditProductfeaturetypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditProductfeaturetypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditProductfeaturetypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditProductfeaturetypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditProductfeaturetypePage_int_id(EditProductfeaturetypePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.productfeaturetype.EditProductfeaturetypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductfeaturetypePage_int_id(widget, (int) 0);
        } else {
          EditProductfeaturetypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditProductfeaturetypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductfeaturetypePage_int_id(widget, (int) 0);
        } else {
          EditProductfeaturetypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditProductfeaturetypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditProductfeaturetypePage", editProductfeaturetypePage);
    final PageNode createFacilitytypePage = new PageNode<CreateFacilitytypePage>() {
      public String name() {
        return "CreateFacilitytypePage";
      }

      public String toString() {
        return "CreateFacilitytypePage";
      }

      public String getURL() {
        return "/createfacilitytype";
      }

      public Class contentType() {
        return CreateFacilitytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateFacilitytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateFacilitytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateFacilitytypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateFacilitytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateFacilitytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateFacilitytypePage", createFacilitytypePage);
    final PageNode listProductcategoryPage = new PageNode<ListProductcategoryPage>() {
      public String name() {
        return "ListProductcategoryPage";
      }

      public String toString() {
        return "ListProductcategoryPage";
      }

      public String getURL() {
        return "/listproductcategory";
      }

      public Class contentType() {
        return ListProductcategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListProductcategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListProductcategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListProductcategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListProductcategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListProductcategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListProductcategoryPage", listProductcategoryPage);
    final PageNode listSupplierproductPage = new PageNode<ListSupplierproductPage>() {
      public String name() {
        return "ListSupplierproductPage";
      }

      public String toString() {
        return "ListSupplierproductPage";
      }

      public String getURL() {
        return "/listsupplierproduct";
      }

      public Class contentType() {
        return ListSupplierproductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListSupplierproductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListSupplierproductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListSupplierproductPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListSupplierproductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListSupplierproductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListSupplierproductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListSupplierproductPage", listSupplierproductPage);
    final PageNode editProductcategoryPage = new PageNode<EditProductcategoryPage>() {
      public String name() {
        return "EditProductcategoryPage";
      }

      public String toString() {
        return "EditProductcategoryPage";
      }

      public String getURL() {
        return "/editproductcategory";
      }

      public Class contentType() {
        return EditProductcategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditProductcategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditProductcategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditProductcategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditProductcategoryPage_int_id(EditProductcategoryPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.productcategory.EditProductcategoryPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductcategoryPage_int_id(widget, (int) 0);
        } else {
          EditProductcategoryPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditProductcategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditProductcategoryPage_int_id(widget, (int) 0);
        } else {
          EditProductcategoryPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditProductcategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditProductcategoryPage", editProductcategoryPage);
    final PageNode listPartyPage = new PageNode<ListPartyPage>() {
      public String name() {
        return "ListPartyPage";
      }

      public String toString() {
        return "ListPartyPage";
      }

      public String getURL() {
        return "/listparty";
      }

      public Class contentType() {
        return ListPartyPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListPartyPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListPartyPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListPartyPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListPartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListPartyPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListPartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListPartyPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListPartyPage", listPartyPage);
    final PageNode createAgreementPage = new PageNode<CreateAgreementPage>() {
      public String name() {
        return "CreateAgreementPage";
      }

      public String toString() {
        return "CreateAgreementPage";
      }

      public String getURL() {
        return "/createagreement";
      }

      public Class contentType() {
        return CreateAgreementPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateAgreementPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateAgreementPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateAgreementPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateAgreementPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateAgreementPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateAgreementPage", createAgreementPage);
    final PageNode viewPartycategoryPage = new PageNode<ViewPartycategoryPage>() {
      public String name() {
        return "ViewPartycategoryPage";
      }

      public String toString() {
        return "ViewPartycategoryPage";
      }

      public String getURL() {
        return "/viewpartycategory";
      }

      public Class contentType() {
        return ViewPartycategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewPartycategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewPartycategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewPartycategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewPartycategoryPage_Long_id(ViewPartycategoryPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewPartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartycategoryPage_Long_id(widget, null);
        } else {
          ViewPartycategoryPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewPartycategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewPartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartycategoryPage_Long_id(widget, null);
        } else {
          ViewPartycategoryPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewPartycategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewPartycategoryPage", viewPartycategoryPage);
    final PageNode listFacilityPage = new PageNode<ListFacilityPage>() {
      public String name() {
        return "ListFacilityPage";
      }

      public String toString() {
        return "ListFacilityPage";
      }

      public String getURL() {
        return "/listfacility";
      }

      public Class contentType() {
        return ListFacilityPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListFacilityPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListFacilityPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListFacilityPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListFacilityPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListFacilityPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListFacilityPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListFacilityPage", listFacilityPage);
    final PageNode createBudgetPage = new PageNode<CreateBudgetPage>() {
      public String name() {
        return "CreateBudgetPage";
      }

      public String toString() {
        return "CreateBudgetPage";
      }

      public String getURL() {
        return "/createbudget";
      }

      public Class contentType() {
        return CreateBudgetPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateBudgetPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateBudgetPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateBudgetPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateBudgetPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateBudgetPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateBudgetPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateBudgetPage", createBudgetPage);
    final PageNode passwordPage = new PageNode<PasswordPage>() {
      public String name() {
        return "PasswordPage";
      }

      public String toString() {
        return "PasswordPage";
      }

      public String getURL() {
        return "/password";
      }

      public Class contentType() {
        return PasswordPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(PasswordPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(PasswordPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(PasswordPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(PasswordPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("PasswordPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(PasswordPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(PasswordPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("PasswordPage", passwordPage);
    final PageNode viewGeneralledgeraccountPage = new PageNode<ViewGeneralledgeraccountPage>() {
      public String name() {
        return "ViewGeneralledgeraccountPage";
      }

      public String toString() {
        return "ViewGeneralledgeraccountPage";
      }

      public String getURL() {
        return "/viewgeneralledgeraccount";
      }

      public Class contentType() {
        return ViewGeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewGeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewGeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewGeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewGeneralledgeraccountPage_Long_id(ViewGeneralledgeraccountPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.generalledgeraccount.ViewGeneralledgeraccountPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewGeneralledgeraccountPage_Long_id(widget, null);
        } else {
          ViewGeneralledgeraccountPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewGeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewGeneralledgeraccountPage_Long_id(widget, null);
        } else {
          ViewGeneralledgeraccountPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewGeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewGeneralledgeraccountPage", viewGeneralledgeraccountPage);
    final PageNode editPartycategoryPage = new PageNode<EditPartycategoryPage>() {
      public String name() {
        return "EditPartycategoryPage";
      }

      public String toString() {
        return "EditPartycategoryPage";
      }

      public String getURL() {
        return "/editpartycategory";
      }

      public Class contentType() {
        return EditPartycategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditPartycategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditPartycategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditPartycategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditPartycategoryPage_int_id(EditPartycategoryPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.partycategory.EditPartycategoryPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditPartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartycategoryPage_int_id(widget, (int) 0);
        } else {
          EditPartycategoryPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditPartycategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditPartycategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartycategoryPage_int_id(widget, (int) 0);
        } else {
          EditPartycategoryPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditPartycategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditPartycategoryPage", editPartycategoryPage);
    final PageNode editAgreementPage = new PageNode<EditAgreementPage>() {
      public String name() {
        return "EditAgreementPage";
      }

      public String toString() {
        return "EditAgreementPage";
      }

      public String getURL() {
        return "/editagreement";
      }

      public Class contentType() {
        return EditAgreementPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditAgreementPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditAgreementPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditAgreementPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditAgreementPage_int_id(EditAgreementPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.agreement.EditAgreementPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditAgreementPage_int_id(widget, (int) 0);
        } else {
          EditAgreementPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditAgreementPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditAgreementPage_int_id(widget, (int) 0);
        } else {
          EditAgreementPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditAgreementPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditAgreementPage", editAgreementPage);
    final PageNode editPaymentPage = new PageNode<EditPaymentPage>() {
      public String name() {
        return "EditPaymentPage";
      }

      public String toString() {
        return "EditPaymentPage";
      }

      public String getURL() {
        return "/editpayment";
      }

      public Class contentType() {
        return EditPaymentPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditPaymentPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditPaymentPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditPaymentPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditPaymentPage_int_id(EditPaymentPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.payment.EditPaymentPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditPaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPaymentPage_int_id(widget, (int) 0);
        } else {
          EditPaymentPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditPaymentPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditPaymentPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPaymentPage_int_id(widget, (int) 0);
        } else {
          EditPaymentPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditPaymentPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditPaymentPage", editPaymentPage);
    final PageNode listFacilitytypePage = new PageNode<ListFacilitytypePage>() {
      public String name() {
        return "ListFacilitytypePage";
      }

      public String toString() {
        return "ListFacilitytypePage";
      }

      public String getURL() {
        return "/listfacilitytype";
      }

      public Class contentType() {
        return ListFacilitytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListFacilitytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListFacilitytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListFacilitytypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListFacilitytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListFacilitytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListFacilitytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListFacilitytypePage", listFacilitytypePage);
    final PageNode listAgreementPage = new PageNode<ListAgreementPage>() {
      public String name() {
        return "ListAgreementPage";
      }

      public String toString() {
        return "ListAgreementPage";
      }

      public String getURL() {
        return "/listagreement";
      }

      public Class contentType() {
        return ListAgreementPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListAgreementPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListAgreementPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListAgreementPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListAgreementPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListAgreementPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListAgreementPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListAgreementPage", listAgreementPage);
    final PageNode viewProductPage = new PageNode<ViewProductPage>() {
      public String name() {
        return "ViewProductPage";
      }

      public String toString() {
        return "ViewProductPage";
      }

      public String getURL() {
        return "/viewproduct";
      }

      public Class contentType() {
        return ViewProductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewProductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewProductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewProductPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewProductPage_Long_id(ViewProductPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.product.ViewProductPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductPage_Long_id(widget, null);
        } else {
          ViewProductPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewProductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductPage_Long_id(widget, null);
        } else {
          ViewProductPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewProductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewProductPage", viewProductPage);
    final PageNode createSystemuserPage = new PageNode<CreateSystemuserPage>() {
      public String name() {
        return "CreateSystemuserPage";
      }

      public String toString() {
        return "CreateSystemuserPage";
      }

      public String getURL() {
        return "/createsystemuser";
      }

      public Class contentType() {
        return CreateSystemuserPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateSystemuserPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateSystemuserPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateSystemuserPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateSystemuserPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateSystemuserPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateSystemuserPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateSystemuserPage", createSystemuserPage);
    final PageNode editPartyPage = new PageNode<EditPartyPage>() {
      public String name() {
        return "EditPartyPage";
      }

      public String toString() {
        return "EditPartyPage";
      }

      public String getURL() {
        return "/editparty";
      }

      public Class contentType() {
        return EditPartyPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditPartyPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditPartyPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditPartyPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditPartyPage_int_id(EditPartyPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.party.EditPartyPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditPartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartyPage_int_id(widget, (int) 0);
        } else {
          EditPartyPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditPartyPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditPartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartyPage_int_id(widget, (int) 0);
        } else {
          EditPartyPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditPartyPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditPartyPage", editPartyPage);
    final PageNode viewProductcategoryPage = new PageNode<ViewProductcategoryPage>() {
      public String name() {
        return "ViewProductcategoryPage";
      }

      public String toString() {
        return "ViewProductcategoryPage";
      }

      public String getURL() {
        return "/viewproductcategory";
      }

      public Class contentType() {
        return ViewProductcategoryPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewProductcategoryPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewProductcategoryPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewProductcategoryPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewProductcategoryPage_Long_id(ViewProductcategoryPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.productcategory.ViewProductcategoryPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductcategoryPage_Long_id(widget, null);
        } else {
          ViewProductcategoryPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewProductcategoryPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewProductcategoryPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewProductcategoryPage_Long_id(widget, null);
        } else {
          ViewProductcategoryPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewProductcategoryPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewProductcategoryPage", viewProductcategoryPage);
    final PageNode listProductPage = new PageNode<ListProductPage>() {
      public String name() {
        return "ListProductPage";
      }

      public String toString() {
        return "ListProductPage";
      }

      public String getURL() {
        return "/listproduct";
      }

      public Class contentType() {
        return ListProductPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListProductPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListProductPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListProductPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListProductPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListProductPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListProductPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListProductPage", listProductPage);
    final PageNode viewPartyPage = new PageNode<ViewPartyPage>() {
      public String name() {
        return "ViewPartyPage";
      }

      public String toString() {
        return "ViewPartyPage";
      }

      public String getURL() {
        return "/viewparty";
      }

      public Class contentType() {
        return ViewPartyPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewPartyPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewPartyPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewPartyPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewPartyPage_Long_id(ViewPartyPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.party.ViewPartyPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewPartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartyPage_Long_id(widget, null);
        } else {
          ViewPartyPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewPartyPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewPartyPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartyPage_Long_id(widget, null);
        } else {
          ViewPartyPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewPartyPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewPartyPage", viewPartyPage);
    final PageNode editOrganizationgeneralledgeraccountPage = new PageNode<EditOrganizationgeneralledgeraccountPage>() {
      public String name() {
        return "EditOrganizationgeneralledgeraccountPage";
      }

      public String toString() {
        return "EditOrganizationgeneralledgeraccountPage";
      }

      public String getURL() {
        return "/editorganizationgeneralledgeraccount";
      }

      public Class contentType() {
        return EditOrganizationgeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditOrganizationgeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditOrganizationgeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditOrganizationgeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditOrganizationgeneralledgeraccountPage_int_id(EditOrganizationgeneralledgeraccountPage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.organizationgeneralledgeraccount.EditOrganizationgeneralledgeraccountPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditOrganizationgeneralledgeraccountPage_int_id(widget, (int) 0);
        } else {
          EditOrganizationgeneralledgeraccountPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditOrganizationgeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditOrganizationgeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditOrganizationgeneralledgeraccountPage_int_id(widget, (int) 0);
        } else {
          EditOrganizationgeneralledgeraccountPage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditOrganizationgeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditOrganizationgeneralledgeraccountPage", editOrganizationgeneralledgeraccountPage);
    final PageNode listGeneralledgeraccountPage = new PageNode<ListGeneralledgeraccountPage>() {
      public String name() {
        return "ListGeneralledgeraccountPage";
      }

      public String toString() {
        return "ListGeneralledgeraccountPage";
      }

      public String getURL() {
        return "/listgeneralledgeraccount";
      }

      public Class contentType() {
        return ListGeneralledgeraccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListGeneralledgeraccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListGeneralledgeraccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListGeneralledgeraccountPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListGeneralledgeraccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListGeneralledgeraccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListGeneralledgeraccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListGeneralledgeraccountPage", listGeneralledgeraccountPage);
    final PageNode createProductfeaturetypePage = new PageNode<CreateProductfeaturetypePage>() {
      public String name() {
        return "CreateProductfeaturetypePage";
      }

      public String toString() {
        return "CreateProductfeaturetypePage";
      }

      public String getURL() {
        return "/createproductfeaturetype";
      }

      public Class contentType() {
        return CreateProductfeaturetypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateProductfeaturetypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateProductfeaturetypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateProductfeaturetypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateProductfeaturetypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateProductfeaturetypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateProductfeaturetypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateProductfeaturetypePage", createProductfeaturetypePage);
    final PageNode listUniversePage = new PageNode<ListUniversePage>() {
      public String name() {
        return "ListUniversePage";
      }

      public String toString() {
        return "ListUniversePage";
      }

      public String getURL() {
        return "/listuniverse";
      }

      public Class contentType() {
        return ListUniversePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListUniversePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListUniversePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListUniversePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListUniversePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListUniversePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListUniversePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListUniversePage", listUniversePage);
    final PageNode viewPartyrolePage = new PageNode<ViewPartyrolePage>() {
      public String name() {
        return "ViewPartyrolePage";
      }

      public String toString() {
        return "ViewPartyrolePage";
      }

      public String getURL() {
        return "/viewpartyrole";
      }

      public Class contentType() {
        return ViewPartyrolePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewPartyrolePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewPartyrolePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewPartyrolePage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewPartyrolePage_Long_id(ViewPartyrolePage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.partyrole.ViewPartyrolePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewPartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartyrolePage_Long_id(widget, null);
        } else {
          ViewPartyrolePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewPartyrolePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewPartyrolePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewPartyrolePage_Long_id(widget, null);
        } else {
          ViewPartyrolePage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewPartyrolePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewPartyrolePage", viewPartyrolePage);
    final PageNode createAccountingtransactionPage = new PageNode<CreateAccountingtransactionPage>() {
      public String name() {
        return "CreateAccountingtransactionPage";
      }

      public String toString() {
        return "CreateAccountingtransactionPage";
      }

      public String getURL() {
        return "/createaccountingtransaction";
      }

      public Class contentType() {
        return CreateAccountingtransactionPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateAccountingtransactionPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateAccountingtransactionPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateAccountingtransactionPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateAccountingtransactionPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateAccountingtransactionPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateAccountingtransactionPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateAccountingtransactionPage", createAccountingtransactionPage);
    final PageNode createPersonPage = new PageNode<CreatePersonPage>() {
      public String name() {
        return "CreatePersonPage";
      }

      public String toString() {
        return "CreatePersonPage";
      }

      public String getURL() {
        return "/createperson";
      }

      public Class contentType() {
        return CreatePersonPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreatePersonPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreatePersonPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreatePersonPage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreatePersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreatePersonPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreatePersonPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreatePersonPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreatePersonPage", createPersonPage);
    final PageNode viewBillingaccountPage = new PageNode<ViewBillingaccountPage>() {
      public String name() {
        return "ViewBillingaccountPage";
      }

      public String toString() {
        return "ViewBillingaccountPage";
      }

      public String getURL() {
        return "/viewbillingaccount";
      }

      public Class contentType() {
        return ViewBillingaccountPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewBillingaccountPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewBillingaccountPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewBillingaccountPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewBillingaccountPage_Long_id(ViewBillingaccountPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.billingaccount.ViewBillingaccountPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewBillingaccountPage_Long_id(widget, null);
        } else {
          ViewBillingaccountPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewBillingaccountPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewBillingaccountPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewBillingaccountPage_Long_id(widget, null);
        } else {
          ViewBillingaccountPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewBillingaccountPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewBillingaccountPage", viewBillingaccountPage);
    final PageNode createProducttypePage = new PageNode<CreateProducttypePage>() {
      public String name() {
        return "CreateProducttypePage";
      }

      public String toString() {
        return "CreateProducttypePage";
      }

      public String getURL() {
        return "/createproducttype";
      }

      public Class contentType() {
        return CreateProducttypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(CreateProducttypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(CreateProducttypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(CreateProducttypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(CreateProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("CreateProducttypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(CreateProducttypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(CreateProducttypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("CreateProducttypePage", createProducttypePage);
    final PageNode listPartytypePage = new PageNode<ListPartytypePage>() {
      public String name() {
        return "ListPartytypePage";
      }

      public String toString() {
        return "ListPartytypePage";
      }

      public String getURL() {
        return "/listpartytype";
      }

      public Class contentType() {
        return ListPartytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ListPartytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ListPartytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ListPartytypePage widget) {
        BasePage_pageHidden(widget);
      }

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ListPartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ListPartytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ListPartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        BasePage_pageShown(widget);
      }

      public void destroy(ListPartytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ListPartytypePage", listPartytypePage);
    final PageNode editPartytypePage = new PageNode<EditPartytypePage>() {
      public String name() {
        return "EditPartytypePage";
      }

      public String toString() {
        return "EditPartytypePage";
      }

      public String getURL() {
        return "/editpartytype";
      }

      public Class contentType() {
        return EditPartytypePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(EditPartytypePage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(EditPartytypePage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(EditPartytypePage widget) {
        BasePage_pageHidden(widget);
      }

      native void EditPartytypePage_int_id(EditPartytypePage instance, int value) /*-{
        instance.@com.cloderia.helion.client.local.partytype.EditPartytypePage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(EditPartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartytypePage_int_id(widget, (int) 0);
        } else {
          EditPartytypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("EditPartytypePage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(EditPartytypePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          EditPartytypePage_int_id(widget, (int) 0);
        } else {
          EditPartytypePage_int_id(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(EditPartytypePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("EditPartytypePage", editPartytypePage);
    final PageNode viewOrganizationPage = new PageNode<ViewOrganizationPage>() {
      public String name() {
        return "ViewOrganizationPage";
      }

      public String toString() {
        return "ViewOrganizationPage";
      }

      public String getURL() {
        return "/vieworganization";
      }

      public Class contentType() {
        return ViewOrganizationPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ViewOrganizationPage.class).getInstance(callback);
      }

      public native void BasePage_tearDown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::tearDown()();
      }-*/;

      public void pageHiding(ViewOrganizationPage widget, NavigationControl control) {
        BasePage_tearDown(widget);
        control.proceed();
      }

      public native void BasePage_pageHidden(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageHidden()();
      }-*/;

      public void pageHidden(ViewOrganizationPage widget) {
        BasePage_pageHidden(widget);
      }

      native void ViewOrganizationPage_Long_id(ViewOrganizationPage instance, Long value) /*-{
        instance.@com.cloderia.helion.client.local.organization.ViewOrganizationPage::id = value;
      }-*/;

      public native void BasePage_setup(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::setup()();
      }-*/;

      public void pageShowing(ViewOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewOrganizationPage_Long_id(widget, null);
        } else {
          ViewOrganizationPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("ViewOrganizationPage", pageState)));
        BasePage_setup(widget);
      }

      public native void BasePage_pageShown(BasePage instance) /*-{
        instance.@com.cloderia.helion.client.local.ui.BasePage::pageShown()();
      }-*/;

      public void pageShown(ViewOrganizationPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("id");
        if ((fv0 == null) || fv0.isEmpty()) {
          ViewOrganizationPage_Long_id(widget, null);
        } else {
          ViewOrganizationPage_Long_id(widget, Long.valueOf((String) fv0.iterator().next()));
          pageState.put("id", fv0.iterator().next());
        }
        BasePage_pageShown(widget);
      }

      public void destroy(ViewOrganizationPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ViewOrganizationPage", viewOrganizationPage);
  }

}
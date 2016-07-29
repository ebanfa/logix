package org.jboss.errai.ioc.client;

import com.cloderia.helion.client.local.AppSetup;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListWidget;
import com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter;
import com.cloderia.helion.client.local.accountingtransaction.BaseAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.CreateAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.EditAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.ListAccountingtransactionPage;
import com.cloderia.helion.client.local.accountingtransaction.ViewAccountingtransactionPage;
import com.cloderia.helion.client.local.agreement.AgreementDisplay;
import com.cloderia.helion.client.local.agreement.AgreementEditor;
import com.cloderia.helion.client.local.agreement.AgreementListItemDisplay;
import com.cloderia.helion.client.local.agreement.AgreementListWidget;
import com.cloderia.helion.client.local.agreement.AgreementPresenter;
import com.cloderia.helion.client.local.agreement.BaseAgreementPage;
import com.cloderia.helion.client.local.agreement.CreateAgreementPage;
import com.cloderia.helion.client.local.agreement.EditAgreementPage;
import com.cloderia.helion.client.local.agreement.ListAgreementPage;
import com.cloderia.helion.client.local.agreement.ViewAgreementPage;
import com.cloderia.helion.client.local.auth.LoginPage;
import com.cloderia.helion.client.local.auth.PasswordPage;
import com.cloderia.helion.client.local.auth.SignUpPage;
import com.cloderia.helion.client.local.billingaccount.BaseBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay;
import com.cloderia.helion.client.local.billingaccount.BillingaccountEditor;
import com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay;
import com.cloderia.helion.client.local.billingaccount.BillingaccountListWidget;
import com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter;
import com.cloderia.helion.client.local.billingaccount.CreateBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.EditBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.ListBillingaccountPage;
import com.cloderia.helion.client.local.billingaccount.ViewBillingaccountPage;
import com.cloderia.helion.client.local.budget.BaseBudgetPage;
import com.cloderia.helion.client.local.budget.BudgetDisplay;
import com.cloderia.helion.client.local.budget.BudgetEditor;
import com.cloderia.helion.client.local.budget.BudgetListItemDisplay;
import com.cloderia.helion.client.local.budget.BudgetListWidget;
import com.cloderia.helion.client.local.budget.BudgetPresenter;
import com.cloderia.helion.client.local.budget.CreateBudgetPage;
import com.cloderia.helion.client.local.budget.EditBudgetPage;
import com.cloderia.helion.client.local.budget.ListBudgetPage;
import com.cloderia.helion.client.local.budget.ViewBudgetPage;
import com.cloderia.helion.client.local.budgetitem.BaseBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay;
import com.cloderia.helion.client.local.budgetitem.BudgetitemEditor;
import com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay;
import com.cloderia.helion.client.local.budgetitem.BudgetitemListWidget;
import com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter;
import com.cloderia.helion.client.local.budgetitem.CreateBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.EditBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.ListBudgetitemPage;
import com.cloderia.helion.client.local.budgetitem.ViewBudgetitemPage;
import com.cloderia.helion.client.local.facility.BaseFacilityPage;
import com.cloderia.helion.client.local.facility.CreateFacilityPage;
import com.cloderia.helion.client.local.facility.EditFacilityPage;
import com.cloderia.helion.client.local.facility.FacilityDisplay;
import com.cloderia.helion.client.local.facility.FacilityEditor;
import com.cloderia.helion.client.local.facility.FacilityListItemDisplay;
import com.cloderia.helion.client.local.facility.FacilityListWidget;
import com.cloderia.helion.client.local.facility.FacilityPresenter;
import com.cloderia.helion.client.local.facility.ListFacilityPage;
import com.cloderia.helion.client.local.facility.ViewFacilityPage;
import com.cloderia.helion.client.local.facilitytype.BaseFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.CreateFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.EditFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay;
import com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor;
import com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay;
import com.cloderia.helion.client.local.facilitytype.FacilitytypeListWidget;
import com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter;
import com.cloderia.helion.client.local.facilitytype.ListFacilitytypePage;
import com.cloderia.helion.client.local.facilitytype.ViewFacilitytypePage;
import com.cloderia.helion.client.local.generalledgeraccount.BaseGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.CreateGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.EditGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListWidget;
import com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.generalledgeraccount.ListGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccount.ViewGeneralledgeraccountPage;
import com.cloderia.helion.client.local.generalledgeraccounttype.BaseGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.CreateGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.EditGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListWidget;
import com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter;
import com.cloderia.helion.client.local.generalledgeraccounttype.ListGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.generalledgeraccounttype.ViewGeneralledgeraccounttypePage;
import com.cloderia.helion.client.local.inventoryitem.BaseInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.CreateInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.EditInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemListWidget;
import com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter;
import com.cloderia.helion.client.local.inventoryitem.ListInventoryitemPage;
import com.cloderia.helion.client.local.inventoryitem.ViewInventoryitemPage;
import com.cloderia.helion.client.local.invoice.BaseInvoicePage;
import com.cloderia.helion.client.local.invoice.CreateInvoicePage;
import com.cloderia.helion.client.local.invoice.EditInvoicePage;
import com.cloderia.helion.client.local.invoice.InvoiceDisplay;
import com.cloderia.helion.client.local.invoice.InvoiceEditor;
import com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay;
import com.cloderia.helion.client.local.invoice.InvoiceListWidget;
import com.cloderia.helion.client.local.invoice.InvoicePresenter;
import com.cloderia.helion.client.local.invoice.ListInvoicePage;
import com.cloderia.helion.client.local.invoice.ViewInvoicePage;
import com.cloderia.helion.client.local.invoiceitem.BaseInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.CreateInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.EditInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemListWidget;
import com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter;
import com.cloderia.helion.client.local.invoiceitem.ListInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceitem.ViewInvoiceitemPage;
import com.cloderia.helion.client.local.invoiceterm.BaseInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.CreateInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.EditInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermListWidget;
import com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter;
import com.cloderia.helion.client.local.invoiceterm.ListInvoicetermPage;
import com.cloderia.helion.client.local.invoiceterm.ViewInvoicetermPage;
import com.cloderia.helion.client.local.organization.BaseOrganizationPage;
import com.cloderia.helion.client.local.organization.CreateOrganizationPage;
import com.cloderia.helion.client.local.organization.EditOrganizationPage;
import com.cloderia.helion.client.local.organization.ListOrganizationPage;
import com.cloderia.helion.client.local.organization.OrganizationDisplay;
import com.cloderia.helion.client.local.organization.OrganizationEditor;
import com.cloderia.helion.client.local.organization.OrganizationListItemDisplay;
import com.cloderia.helion.client.local.organization.OrganizationListWidget;
import com.cloderia.helion.client.local.organization.OrganizationPresenter;
import com.cloderia.helion.client.local.organization.ViewOrganizationPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.BaseOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.CreateOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.EditOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ListOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListWidget;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter;
import com.cloderia.helion.client.local.organizationgeneralledgeraccount.ViewOrganizationgeneralledgeraccountPage;
import com.cloderia.helion.client.local.organizationglaccountbalance.BaseOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.CreateOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.EditOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.ListOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListWidget;
import com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter;
import com.cloderia.helion.client.local.organizationglaccountbalance.ViewOrganizationglaccountbalancePage;
import com.cloderia.helion.client.local.party.BasePartyPage;
import com.cloderia.helion.client.local.party.CreatePartyPage;
import com.cloderia.helion.client.local.party.EditPartyPage;
import com.cloderia.helion.client.local.party.ListPartyPage;
import com.cloderia.helion.client.local.party.PartyDisplay;
import com.cloderia.helion.client.local.party.PartyEditor;
import com.cloderia.helion.client.local.party.PartyListItemDisplay;
import com.cloderia.helion.client.local.party.PartyListWidget;
import com.cloderia.helion.client.local.party.PartyPresenter;
import com.cloderia.helion.client.local.party.ViewPartyPage;
import com.cloderia.helion.client.local.partycategory.BasePartycategoryPage;
import com.cloderia.helion.client.local.partycategory.CreatePartycategoryPage;
import com.cloderia.helion.client.local.partycategory.EditPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.ListPartycategoryPage;
import com.cloderia.helion.client.local.partycategory.PartycategoryDisplay;
import com.cloderia.helion.client.local.partycategory.PartycategoryEditor;
import com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay;
import com.cloderia.helion.client.local.partycategory.PartycategoryListWidget;
import com.cloderia.helion.client.local.partycategory.PartycategoryPresenter;
import com.cloderia.helion.client.local.partycategory.ViewPartycategoryPage;
import com.cloderia.helion.client.local.partyrole.BasePartyrolePage;
import com.cloderia.helion.client.local.partyrole.CreatePartyrolePage;
import com.cloderia.helion.client.local.partyrole.EditPartyrolePage;
import com.cloderia.helion.client.local.partyrole.ListPartyrolePage;
import com.cloderia.helion.client.local.partyrole.PartyroleDisplay;
import com.cloderia.helion.client.local.partyrole.PartyroleEditor;
import com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay;
import com.cloderia.helion.client.local.partyrole.PartyroleListWidget;
import com.cloderia.helion.client.local.partyrole.PartyrolePresenter;
import com.cloderia.helion.client.local.partyrole.ViewPartyrolePage;
import com.cloderia.helion.client.local.partyroletype.BasePartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.CreatePartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.EditPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.ListPartyroletypePage;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay;
import com.cloderia.helion.client.local.partyroletype.PartyroletypeListWidget;
import com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter;
import com.cloderia.helion.client.local.partyroletype.ViewPartyroletypePage;
import com.cloderia.helion.client.local.partytype.BasePartytypePage;
import com.cloderia.helion.client.local.partytype.CreatePartytypePage;
import com.cloderia.helion.client.local.partytype.EditPartytypePage;
import com.cloderia.helion.client.local.partytype.ListPartytypePage;
import com.cloderia.helion.client.local.partytype.PartytypeDisplay;
import com.cloderia.helion.client.local.partytype.PartytypeEditor;
import com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay;
import com.cloderia.helion.client.local.partytype.PartytypeListWidget;
import com.cloderia.helion.client.local.partytype.PartytypePresenter;
import com.cloderia.helion.client.local.partytype.ViewPartytypePage;
import com.cloderia.helion.client.local.payment.BasePaymentPage;
import com.cloderia.helion.client.local.payment.CreatePaymentPage;
import com.cloderia.helion.client.local.payment.EditPaymentPage;
import com.cloderia.helion.client.local.payment.ListPaymentPage;
import com.cloderia.helion.client.local.payment.PaymentDisplay;
import com.cloderia.helion.client.local.payment.PaymentEditor;
import com.cloderia.helion.client.local.payment.PaymentListItemDisplay;
import com.cloderia.helion.client.local.payment.PaymentListWidget;
import com.cloderia.helion.client.local.payment.PaymentPresenter;
import com.cloderia.helion.client.local.payment.ViewPaymentPage;
import com.cloderia.helion.client.local.person.BasePersonPage;
import com.cloderia.helion.client.local.person.CreatePersonPage;
import com.cloderia.helion.client.local.person.EditPersonPage;
import com.cloderia.helion.client.local.person.ListPersonPage;
import com.cloderia.helion.client.local.person.PersonDisplay;
import com.cloderia.helion.client.local.person.PersonEditor;
import com.cloderia.helion.client.local.person.PersonListItemDisplay;
import com.cloderia.helion.client.local.person.PersonListWidget;
import com.cloderia.helion.client.local.person.PersonPresenter;
import com.cloderia.helion.client.local.person.ViewPersonPage;
import com.cloderia.helion.client.local.product.BaseProductPage;
import com.cloderia.helion.client.local.product.CreateProductPage;
import com.cloderia.helion.client.local.product.EditProductPage;
import com.cloderia.helion.client.local.product.ListProductPage;
import com.cloderia.helion.client.local.product.ProductDisplay;
import com.cloderia.helion.client.local.product.ProductEditor;
import com.cloderia.helion.client.local.product.ProductListItemDisplay;
import com.cloderia.helion.client.local.product.ProductListWidget;
import com.cloderia.helion.client.local.product.ProductPresenter;
import com.cloderia.helion.client.local.product.ViewProductPage;
import com.cloderia.helion.client.local.productcategory.BaseProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.CreateProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.EditProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ListProductcategoryPage;
import com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay;
import com.cloderia.helion.client.local.productcategory.ProductcategoryEditor;
import com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay;
import com.cloderia.helion.client.local.productcategory.ProductcategoryListWidget;
import com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter;
import com.cloderia.helion.client.local.productcategory.ViewProductcategoryPage;
import com.cloderia.helion.client.local.productfeature.BaseProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.CreateProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.EditProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ListProductfeaturePage;
import com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay;
import com.cloderia.helion.client.local.productfeature.ProductfeatureEditor;
import com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay;
import com.cloderia.helion.client.local.productfeature.ProductfeatureListWidget;
import com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter;
import com.cloderia.helion.client.local.productfeature.ViewProductfeaturePage;
import com.cloderia.helion.client.local.productfeaturetype.BaseProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.CreateProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.EditProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ListProductfeaturetypePage;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListWidget;
import com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter;
import com.cloderia.helion.client.local.productfeaturetype.ViewProductfeaturetypePage;
import com.cloderia.helion.client.local.producttype.BaseProducttypePage;
import com.cloderia.helion.client.local.producttype.CreateProducttypePage;
import com.cloderia.helion.client.local.producttype.EditProducttypePage;
import com.cloderia.helion.client.local.producttype.ListProducttypePage;
import com.cloderia.helion.client.local.producttype.ProducttypeDisplay;
import com.cloderia.helion.client.local.producttype.ProducttypeEditor;
import com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay;
import com.cloderia.helion.client.local.producttype.ProducttypeListWidget;
import com.cloderia.helion.client.local.producttype.ProducttypePresenter;
import com.cloderia.helion.client.local.producttype.ViewProducttypePage;
import com.cloderia.helion.client.local.supplierproduct.BaseSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.CreateSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.EditSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.ListSupplierproductPage;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductListWidget;
import com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter;
import com.cloderia.helion.client.local.supplierproduct.ViewSupplierproductPage;
import com.cloderia.helion.client.local.systemuser.BaseSystemuserPage;
import com.cloderia.helion.client.local.systemuser.CreateSystemuserPage;
import com.cloderia.helion.client.local.systemuser.EditSystemuserPage;
import com.cloderia.helion.client.local.systemuser.ListSystemuserPage;
import com.cloderia.helion.client.local.systemuser.SystemuserDisplay;
import com.cloderia.helion.client.local.systemuser.SystemuserEditor;
import com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay;
import com.cloderia.helion.client.local.systemuser.SystemuserListWidget;
import com.cloderia.helion.client.local.systemuser.SystemuserPresenter;
import com.cloderia.helion.client.local.systemuser.ViewSystemuserPage;
import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.Dashboard;
import com.cloderia.helion.client.local.ui.NavBar;
import com.cloderia.helion.client.local.ui.SideBar;
import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.local.universe.BaseUniversePage;
import com.cloderia.helion.client.local.universe.CreateUniversePage;
import com.cloderia.helion.client.local.universe.EditUniversePage;
import com.cloderia.helion.client.local.universe.ListUniversePage;
import com.cloderia.helion.client.local.universe.UniverseDisplay;
import com.cloderia.helion.client.local.universe.UniverseEditor;
import com.cloderia.helion.client.local.universe.UniverseListItemDisplay;
import com.cloderia.helion.client.local.universe.UniverseListWidget;
import com.cloderia.helion.client.local.universe.UniversePresenter;
import com.cloderia.helion.client.local.universe.ViewUniversePage;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Instance;
import javax.validation.Validator;
import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.common.client.api.BatchCaller;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.dom.TableRow;
import org.jboss.errai.databinding.client.DataBinderProvider;
import org.jboss.errai.databinding.client.DataBindingModuleBootstrapper;
import org.jboss.errai.databinding.client.ListComponentProvider;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.databinding.client.components.ListComponent;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.JsTypeEventObserver;
import org.jboss.errai.enterprise.client.cdi.WindowEventObservers;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.api.InitBallot;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.ManagedInstanceProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.container.ApplicationScopedContext;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.ContextManagerImpl;
import org.jboss.errai.ioc.client.container.DependentScopeContext;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.JsTypeProvider;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.jboss.errai.ioc.client.lifecycle.impl.AccessImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.CreationImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.DestructionImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleListenerRegistrarImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.StateChangeImpl;
import org.jboss.errai.ioc.support.bus.client.BatchCallerProvider;
import org.jboss.errai.ioc.support.bus.client.MessageBusProvider;
import org.jboss.errai.ioc.support.bus.client.RequestDispatcherProvider;
import org.jboss.errai.ioc.support.bus.client.Sender;
import org.jboss.errai.ioc.support.bus.client.SenderProvider;
import org.jboss.errai.jpa.client.local.ErraiEntityManager;
import org.jboss.errai.jpa.client.local.ErraiEntityManagerProducer;
import org.jboss.errai.jpa.sync.client.local.ClientSyncManager;
import org.jboss.errai.ui.client.local.producer.HTMLElementProvider;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.jboss.errai.ui.client.local.spi.TranslationServiceProvider;
import org.jboss.errai.ui.client.widget.ListWidget;
import org.jboss.errai.ui.client.widget.ListWidgetProvider;
import org.jboss.errai.ui.client.widget.LocaleListBox;
import org.jboss.errai.ui.client.widget.LocaleSelector;
import org.jboss.errai.ui.nav.client.local.HistoryTokenFactory;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.NavigationPanel;
import org.jboss.errai.ui.nav.client.local.NavigationPanelProvider;
import org.jboss.errai.ui.nav.client.local.PageTransitionProvider;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorFactory;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorFactoryProvider;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.nav.client.local.TransitionToRole;
import org.jboss.errai.ui.nav.client.local.TransitionToRoleProvider;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcher;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcherProvider;
import org.jboss.errai.ui.nav.client.local.spi.NavigationGraph;
import org.jboss.errai.ui.shared.ServerTemplateProvider;
import org.jboss.errai.validation.client.ValidatorProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BootstrapperImpl implements Bootstrapper {
  {
    addLookups_0();
    new CDI().initLookupTable(CDIEventTypeLookup.get());
    new DataBindingModuleBootstrapper().run();
  }

  private ContextManager contextManager = new ContextManagerImpl();
  private final WindowInjectionContext windowContext = WindowInjectionContextStorage.createOrGet();
  private static final Logger logger = LoggerFactory.getLogger(Bootstrapper.class);
  public abstract class Type_factory__c_c_h_c_l_i_ListInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInvoiceitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreateProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateProductfeaturetypePage> { }
  public abstract class Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationPanel> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal extends Factory<Caller> { }
  public abstract class Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientMessageBus> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchorFactory__quals__Universal extends Factory<TransitionAnchorFactory> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroleDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PaymentPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_u_UniverseListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalancePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalancePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_CreateInvoicetermPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateInvoicetermPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreateProductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateProductPage> { }
  public abstract class Type_factory__c_c_h_c_l_b_BillingaccountDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_o_EditOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditOrganizationglaccountbalancePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeaturetypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetitemEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemEditor> { }
  public abstract class Type_factory__c_c_h_c_l_b_BaseBillingaccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseBillingaccountPage> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<TableRow> { }
  public abstract class Type_factory__c_c_h_c_l_p_BaseProductfeaturePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseProductfeaturePage> { }
  public abstract class Type_factory__c_c_h_c_l_f_ViewFacilitytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewFacilitytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditProductcategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditProductcategoryPage> { }
  public abstract class Type_factory__c_c_h_c_l_b_ListBudgetPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBudgetPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_BasePaymentPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePaymentPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PersonDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditPersonPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPersonPage> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilityListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityListItemDisplay> { }
  public abstract class ContextualProvider_factory__j_e_e_Event__quals__Universal extends Factory<Event> { }
  public abstract class Type_factory__c_c_h_c_l_b_BillingaccountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountEditor> { }
  public abstract class Type_factory__c_c_h_c_l_i_BaseInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseInvoiceitemPage> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal extends Factory<InitBallot> { }
  public abstract class Type_factory__c_c_h_c_l_u_BaseUniversePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseUniversePage> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeatureListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_s_SupplierproductPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_g_EditGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditGeneralledgeraccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_a_CreateAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateAccountingtransactionPage> { }
  public abstract class Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCaller> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_o_CreateOrganizationPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateOrganizationPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_BasePersonPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePersonPage> { }
  public abstract class Type_factory__c_c_h_c_l_a_CreateAgreementPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateAgreementPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroletypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewPartytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPartytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewProducttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewProducttypePage> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal extends Factory<TransitionAnchor> { }
  public abstract class Type_factory__c_c_h_c_l_b_ViewBillingaccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewBillingaccountPage> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default extends Factory<Navigation> { }
  public abstract class Type_factory__c_c_h_c_l_u_UniversePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<UniversePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_a_AccountingtransactionEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionEditor> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCallerProvider> { }
  public abstract class Type_factory__c_c_h_c_l_s_ListSupplierproductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListSupplierproductPage> { }
  public abstract class Type_factory__c_c_h_c_l_b_BillingaccountListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_i_EditInvoicePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditInvoicePage> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionToRoleProvider> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartycategoryListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_o_CreateOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateOrganizationgeneralledgeraccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeaturetypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_u_BasePortalPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePortalPage> { }
  public abstract class Type_factory__c_c_h_c_l_b_EditBillingaccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditBillingaccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_s_BaseSystemuserPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseSystemuserPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceitemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_EditInvoicetermPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditInvoicetermPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreateProducttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateProducttypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeaturetypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeEditor> { }
  public abstract class Type_factory__c_c_h_c_l_b_BaseBudgetitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseBudgetitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_ListInventoryitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInventoryitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditProductfeaturetypePage> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AccessImpl> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewPersonPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPersonPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListProductfeaturePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProductfeaturePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_BasePartyrolePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePartyrolePage> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal extends Factory<TransitionTo> { }
  public abstract class Type_factory__c_c_h_c_l_a_ViewAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewAccountingtransactionPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProductfeaturetypePage> { }
  public abstract class Type_factory__c_c_h_c_l_f_BaseFacilityPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseFacilityPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_InventoryitemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListPartytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProducttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartytypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_a_AgreementListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_a_AccountingtransactionDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilityEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewProductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewProductPage> { }
  public abstract class Type_factory__c_c_h_c_l_f_ViewFacilityPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewFacilityPage> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreatePersonPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePersonPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartytypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypePresenter> { }
  public abstract class Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanel> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditProductfeaturePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditProductfeaturePage> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductcategoryEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_u_ViewUniversePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewUniversePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PersonListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_o_CreateOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateOrganizationglaccountbalancePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PaymentListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentListItemDisplay> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DestructionImpl> { }
  public abstract class Type_factory__c_c_h_c_l_b_ListBillingaccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBillingaccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewProductfeaturePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewProductfeaturePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductcategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroletypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_o_ViewOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewOrganizationglaccountbalancePage> { }
  public abstract class Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default extends Factory<NavBar> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreateProductfeaturePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateProductfeaturePage> { }
  public abstract class Type_factory__c_c_h_c_l_s_SupplierproductDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductDisplay> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<HistoryTokenFactory> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditPartytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPartytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_a_SignUpPage__quals__j_e_i_Any_j_e_i_Default extends Factory<SignUpPage> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InitBallotProvider> { }
  public abstract class Type_factory__c_c_h_c_l_b_CreateBudgetPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateBudgetPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroleEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_BasePartyPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePartyPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeaturetypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_g_ViewGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewGeneralledgeraccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewProductfeaturetypePage> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationDisplay> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleListBox> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceitemEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemEditor> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilitytypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_a_AgreementDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditProducttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditProducttypePage> { }
  public abstract class Type_factory__c_c_h_c_l_f_BaseFacilitytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseFacilitytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_i_EditInventoryitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditInventoryitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoicetermDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditPartyrolePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPartyrolePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroletypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_s_ListSystemuserPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListSystemuserPage> { }
  public abstract class Type_factory__c_c_h_c_l_u_ListUniversePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListUniversePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroleListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_a_AgreementListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceEditor> { }
  public abstract class JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal extends Factory<JsTypeProvider> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewPartyrolePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPartyrolePage> { }
  public abstract class Type_factory__c_c_h_c_l_s_SystemuserListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreatePartyPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePartyPage> { }
  public abstract class Type_factory__c_c_h_c_l_s_BaseSupplierproductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseSupplierproductPage> { }
  public abstract class Type_factory__c_c_h_c_l_b_CreateBillingaccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateBillingaccountPage> { }
  public abstract class Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<EventProvider> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceitemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_o_ViewOrganizationPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewOrganizationPage> { }
  public abstract class ContextualProvider_factory__j_e_i_Instance__quals__Universal extends Factory<Instance> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartytypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeDisplay> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Heading> { }
  public abstract class Type_factory__c_c_h_c_l_s_CreateSystemuserPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateSystemuserPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListProductcategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProductcategoryPage> { }
  public abstract class Type_factory__c_c_h_c_l_a_PasswordPage__quals__j_e_i_Any_j_e_i_Default extends Factory<PasswordPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartytypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeEditor> { }
  public abstract class Type_factory__c_c_h_c_l_s_ViewSystemuserPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewSystemuserPage> { }
  public abstract class Type_factory__c_c_h_c_l_g_ListGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListGeneralledgeraccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_o_BaseOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseOrganizationgeneralledgeraccountPage> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<CallerProvider> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewProductcategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewProductcategoryPage> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBox> { }
  public abstract class Type_factory__c_c_h_c_l_i_InventoryitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PersonListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonListWidget> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Span> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoicetermEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermEditor> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilitytypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypeDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetitemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_EditInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditInvoiceitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PaymentListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_a_BaseAgreementPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseAgreementPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PersonPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_f_ListFacilityPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListFacilityPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditPaymentPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPaymentPage> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleSelector> { }
  public abstract class Type_factory__c_c_h_c_l_u_UniverseListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseListWidget> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CreationImpl> { }
  public abstract class Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListComponentProvider> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_f_ListFacilitytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListFacilitytypePage> { }
  public abstract class JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__c_c_h_c_l_o_EditOrganizationPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditOrganizationPage> { }
  public abstract class Type_factory__c_c_h_c_l_g_CreateGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateGeneralledgeraccounttypePage> { }
  public abstract class Type_factory__c_c_h_c_l_g_ListGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListGeneralledgeraccounttypePage> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartycategoryDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryDisplay> { }
  public abstract class Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<URLPatternMatcher> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditPartyPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPartyPage> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LifecycleListenerRegistrarImpl> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceitemListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemListWidget> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal extends Factory<HTMLElement> { }
  public abstract class Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ErraiEntityManager> { }
  public abstract class Type_factory__c_c_h_c_l_g_ViewGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewGeneralledgeraccounttypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditPartycategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPartycategoryPage> { }
  public abstract class Type_factory__o_j_e_v_c_ValidatorProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ValidatorProvider> { }
  public abstract class Type_factory__c_c_h_c_l_g_CreateGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateGeneralledgeraccountPage> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal extends Factory<Disposer> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal extends Factory<ListComponent> { }
  public abstract class Type_factory__c_c_h_c_l_u_UniverseEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseEditor> { }
  public abstract class Type_factory__c_c_h_c_l_a_LoginPage__quals__j_e_i_Any_j_e_i_Default extends Factory<LoginPage> { }
  public abstract class Type_factory__c_c_h_c_l_b_BillingaccountPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListProductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProductPage> { }
  public abstract class Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseGeneralledgeraccounttypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_BasePartycategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePartycategoryPage> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionToRole__quals__Universal extends Factory<TransitionToRole> { }
  public abstract class Type_factory__c_c_h_c_l_i_CreateInventoryitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateInventoryitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeEditor> { }
  public abstract class Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default extends Factory<Document> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewPartyroletypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPartyroletypePage> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal extends Factory<ManagedInstance> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_i_ViewInvoicePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewInvoicePage> { }
  public abstract class Type_factory__c_c_h_c_l_b_ViewBudgetPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewBudgetPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyrolePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyrolePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilityDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartycategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_s_SupplierproductEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroleListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroleListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_PaymentDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartycategoryEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryEditor> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal extends Factory<DataBinder> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeatureListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_a_BaseAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseAccountingtransactionPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_InventoryitemEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemEditor> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_a_AccountingtransactionListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountListWidget> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanelProvider> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<TableCell> { }
  public abstract class Type_factory__c_c_h_c_l_s_SystemuserListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductcategoryListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryListWidget> { }
  public abstract class Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationGraph> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListProducttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListProducttypePage> { }
  public abstract class ExtensionProvided_factory__o_s_Logger__quals__Universal extends Factory<Logger> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccountListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountListWidget> { }
  public abstract class ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<AnchorElement> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreatePartyroletypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePartyroletypePage> { }
  public abstract class Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListWidgetProvider> { }
  public abstract class Type_factory__c_c_h_c_l_a_AgreementPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default extends Factory<SideBar> { }
  public abstract class Type_factory__c_c_h_c_l_i_ViewInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewInvoiceitemPage> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<URLPatternMatcherProvider> { }
  public abstract class Type_factory__c_c_h_c_l_o_EditOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditOrganizationgeneralledgeraccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_s_SupplierproductListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<TableHeaderWidget> { }
  public abstract class Type_factory__c_c_h_c_l_o_ListOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListOrganizationgeneralledgeraccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeatureDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_o_ListOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListOrganizationglaccountbalancePage> { }
  public abstract class Type_factory__c_c_h_c_l_s_SystemuserDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilityPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_u_EditUniversePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditUniversePage> { }
  public abstract class Provider_factory__j_v_Validator__quals__j_e_i_Any_j_e_i_Default extends Factory<Validator> { }
  public abstract class Type_factory__c_c_h_c_l_u_Dashboard__quals__j_e_i_Any_j_e_i_Default extends Factory<Dashboard> { }
  public abstract class Type_factory__c_c_h_c_l_p_BasePartyroletypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePartyroletypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroletypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeListItemDisplay> { }
  public abstract class Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ServerTemplateProvider> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<PartytypeListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_u_CreateUniversePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateUniversePage> { }
  public abstract class Type_factory__c_c_h_c_l_b_EditBudgetPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditBudgetPage> { }
  public abstract class Type_factory__c_c_h_c_l_a_AccountingtransactionPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_o_BaseOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseOrganizationglaccountbalancePage> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<IOCBeanManagerProvider> { }
  public abstract class Type_factory__c_c_h_c_l_a_ListAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListAccountingtransactionPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_CreateInvoicePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateInvoicePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreatePartyrolePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePartyrolePage> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoicetermPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoicetermListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_f_CreateFacilityPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateFacilityPage> { }
  public abstract class Type_factory__c_c_h_c_l_s_CreateSupplierproductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateSupplierproductPage> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationListWidget> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionAnchorFactoryProvider> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyroletypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyroletypeEditor> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetitemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditPartyroletypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditPartyroletypePage> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcherProvider> { }
  public abstract class Type_factory__c_c_h_c_l_s_EditSystemuserPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditSystemuserPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreatePaymentPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePaymentPage> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DisposerProvider> { }
  public abstract class Type_factory__c_c_h_c_l_a_ListAgreementPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListAgreementPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreatePartycategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePartycategoryPage> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<MessageBusProvider> { }
  public abstract class Type_factory__c_c_h_c_l_b_BaseBudgetPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseBudgetPage> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<SenderProvider> { }
  public abstract class Type_factory__c_c_h_c_l_a_ViewAgreementPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewAgreementPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreateProductcategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateProductcategoryPage> { }
  public abstract class Type_factory__c_c_h_c_l_a_AgreementEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<AgreementEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductEditor> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ManagedInstanceProvider> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductcategoryPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListPartycategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartycategoryPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_EditProductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditProductPage> { }
  public abstract class Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLElementProvider> { }
  public abstract class Type_factory__c_c_h_c_l_f_CreateFacilitytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateFacilitytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_a_EditAgreementPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditAgreementPage> { }
  public abstract class Type_factory__c_c_h_c_l_s_SystemuserPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_ListInvoicetermPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInvoicetermPage> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProducttypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductListWidget> { }
  public abstract class ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal extends Factory<ListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccounttypeListItemDisplay> { }
  public abstract class Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientSyncManager> { }
  public abstract class Type_factory__c_c_h_c_l_p_BaseProductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseProductPage> { }
  public abstract class Type_factory__c_c_h_c_l_AppSetup__quals__j_e_i_Any_j_e_i_Default extends Factory<AppSetup> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationEditor> { }
  public abstract class Type_factory__c_c_h_c_l_g_GeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<GeneralledgeraccountDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartyPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartyPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_CreateInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateInvoiceitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_ViewInventoryitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewInventoryitemPage> { }
  public abstract class Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InstanceProvider> { }
  public abstract class Type_factory__c_c_h_c_l_f_EditFacilitytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditFacilitytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilitytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypeListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListPaymentPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPaymentPage> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilitytypeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypeEditor> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProducttypePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoicePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicePresenter> { }
  public abstract class Type_factory__c_c_h_c_l_b_EditBudgetitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditBudgetitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_g_EditGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditGeneralledgeraccounttypePage> { }
  public abstract class JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_i_InventoryitemListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemListWidget> { }
  public abstract class ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal extends Factory<Sender> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_b_BudgetitemListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<BudgetitemListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewPartyPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPartyPage> { }
  public abstract class Type_factory__c_c_h_c_l_o_ListOrganizationPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListOrganizationPage> { }
  public abstract class Type_factory__c_c_h_c_l_a_AccountingtransactionListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<AccountingtransactionListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_i_ListInvoicePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListInvoicePage> { }
  public abstract class Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<ErraiEntityManagerProducer> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeatureEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeatureEditor> { }
  public abstract class Type_factory__c_c_h_c_l_i_InventoryitemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InventoryitemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListPartyPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartyPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PaymentEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PaymentEditor> { }
  public abstract class Type_factory__c_c_h_c_l_i_BaseInvoicetermPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseInvoicetermPage> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Div> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilityListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilityListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_s_SystemuserEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<SystemuserEditor> { }
  public abstract class Type_factory__c_c_h_c_l_u_UniverseDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<UniverseDisplay> { }
  public abstract class Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DataBinderProvider> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListPartyroletypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartyroletypePage> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_PageTransitionProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<PageTransitionProvider> { }
  public abstract class Type_factory__c_c_h_c_l_f_EditFacilityPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditFacilityPage> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationgeneralledgeraccountPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_s_SupplierproductListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<SupplierproductListWidget> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionAnchorProvider> { }
  public abstract class Type_factory__c_c_h_c_l_b_BillingaccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<BillingaccountListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_b_ViewBudgetitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewBudgetitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_ViewInvoicetermPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewInvoicetermPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewPaymentPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPaymentPage> { }
  public abstract class Type_factory__c_c_h_c_l_s_ViewSupplierproductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewSupplierproductPage> { }
  public abstract class Type_factory__c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewOrganizationgeneralledgeraccountPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ViewPartycategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ViewPartycategoryPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeaturePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturePresenter> { }
  public abstract class Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__c_c_h_c_l_p_BaseProductcategoryPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseProductcategoryPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_BaseInvoicePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseInvoicePage> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1 extends Factory<Heading> { }
  public abstract class Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseGeneralledgeraccountPage> { }
  public abstract class Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__c_c_h_c_l_p_PartycategoryPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartycategoryPresenter> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationPanelProvider> { }
  public abstract class Type_factory__c_c_h_c_l_b_CreateBudgetitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreateBudgetitemPage> { }
  public abstract class JsType_factory__o_j_e_i_c_JsArray__quals__Universal extends Factory<JsArray> { }
  public abstract class Type_factory__c_c_h_c_l_o_BaseOrganizationPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseOrganizationPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductPresenter> { }
  public abstract class Type_factory__c_c_h_c_l_p_BaseProducttypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseProducttypePage> { }
  public abstract class Type_factory__c_c_h_c_l_a_EditAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditAccountingtransactionPage> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoiceitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoiceitemListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListPartyrolePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPartyrolePage> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<StateChangeImpl> { }
  public abstract class Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcher> { }
  public abstract class Type_factory__c_c_h_c_l_p_BasePartytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BasePartytypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_PersonEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<PersonEditor> { }
  public abstract class Type_factory__c_c_h_c_l_s_EditSupplierproductPage__quals__j_e_i_Any_j_e_i_Default extends Factory<EditSupplierproductPage> { }
  public abstract class Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationServiceProvider> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductfeaturetypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductfeaturetypeListItemDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_b_ListBudgetitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBudgetitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProducttypeDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_p_BaseProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseProductfeaturetypePage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ListPersonPage__quals__j_e_i_Any_j_e_i_Default extends Factory<ListPersonPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_CreatePartytypePage__quals__j_e_i_Any_j_e_i_Default extends Factory<CreatePartytypePage> { }
  public abstract class Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default extends Factory<SyncBeanManager> { }
  public abstract class Type_factory__c_c_h_c_l_f_FacilitytypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<FacilitytypeListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_i_InvoicetermListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<InvoicetermListWidget> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProductcategoryDisplay__quals__j_e_i_Any_j_e_i_Default extends Factory<ProductcategoryDisplay> { }
  public abstract class Type_factory__c_c_h_c_l_i_BaseInventoryitemPage__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseInventoryitemPage> { }
  public abstract class Type_factory__c_c_h_c_l_p_ProducttypeListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<ProducttypeListWidget> { }
  public abstract class Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationService> { }
  public abstract class Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<OrganizationglaccountbalanceEditor> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default extends Factory<TextBox> { }
  private static void addLookups_0() {
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com.cloderia.helion.client.local.partytype.PartytypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com.cloderia.helion.client.local.party.PartyPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PersonOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PersonOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyEditor", "com.cloderia.helion.client.local.party.PartyPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com.cloderia.helion.client.local.systemuser.SystemuserPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com.cloderia.helion.client.local.systemuser.SystemuserPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.OrganizationOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.OrganizationOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InventoryitemOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InventoryitemOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.AgreementOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.AgreementOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.BudgetOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.BudgetOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonEditor", "com.cloderia.helion.client.local.person.PersonPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com.cloderia.helion.client.local.partytype.PartytypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com.cloderia.helion.client.local.organization.OrganizationPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.AccountingtransactionOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.UniverseOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.UniverseOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityEditor", "com.cloderia.helion.client.local.facility.FacilityPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com.cloderia.helion.client.local.systemuser.SystemuserPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.systemuser.SystemuserListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.FacilityOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.FacilityOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseDisplay", "com.cloderia.helion.client.local.universe.UniversePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PaymentOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PaymentOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartyroleOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartyroleOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductcategoryOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductcategoryOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com.cloderia.helion.client.local.partyrole.PartyrolePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.BudgetitemOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.BudgetitemOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com.cloderia.helion.client.local.partyrole.PartyrolePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentDisplay", "com.cloderia.helion.client.local.payment.PaymentPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityDisplay", "com.cloderia.helion.client.local.facility.FacilityPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseEditor", "com.cloderia.helion.client.local.universe.UniversePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductEditor", "com.cloderia.helion.client.local.product.ProductPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com.cloderia.helion.client.local.inventoryitem.InventoryitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.inventoryitem.InventoryitemListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com.cloderia.helion.client.local.partycategory.PartycategoryPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetEditor", "com.cloderia.helion.client.local.budget.BudgetPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com.cloderia.helion.client.local.organization.OrganizationPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.SystemuserOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.SystemuserOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com.cloderia.helion.client.local.agreement.AgreementPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementEditor", "com.cloderia.helion.client.local.agreement.AgreementPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccounttype.GeneralledgeraccounttypeEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartycategoryOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartycategoryOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com.cloderia.helion.client.local.producttype.ProducttypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com.cloderia.helion.client.local.payment.PaymentPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com.cloderia.helion.client.local.partyroletype.PartyroletypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyroletype.PartyroletypeDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com.cloderia.helion.client.local.producttype.ProducttypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProducttypeOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProducttypeOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductfeatureOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductfeatureOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartyOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartyOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com.cloderia.helion.client.local.invoiceterm.InvoicetermPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceterm.InvoicetermEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com.cloderia.helion.client.local.partyrole.PartyrolePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partyrole.PartyroleEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationgeneralledgeraccount.OrganizationgeneralledgeraccountEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com.cloderia.helion.client.local.invoice.InvoicePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentEditor", "com.cloderia.helion.client.local.payment.PaymentPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.payment.PaymentEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com.cloderia.helion.client.local.producttype.ProducttypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.producttype.ProducttypeDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InvoicetermOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InvoicetermOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com.cloderia.helion.client.local.partytype.PartytypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partytype.PartytypeDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com.cloderia.helion.client.local.partycategory.PartycategoryPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com.cloderia.helion.client.local.invoice.InvoicePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalancePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organizationglaccountbalance.OrganizationglaccountbalanceListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductDisplay", "com.cloderia.helion.client.local.product.ProductPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com.cloderia.helion.client.local.budgetitem.BudgetitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budgetitem.BudgetitemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.generalledgeraccount.GeneralledgeraccountDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com.cloderia.helion.client.local.invoiceitem.InvoiceitemPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoiceitem.InvoiceitemEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com.cloderia.helion.client.local.productfeature.ProductfeaturePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeature.ProductfeatureDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InvoiceOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InvoiceOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com.cloderia.helion.client.local.invoice.InvoicePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.invoice.InvoiceListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.FacilitytypeOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.FacilitytypeOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InvoiceitemOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.InvoiceitemOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationEditor", "com.cloderia.helion.client.local.organization.OrganizationPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.organization.OrganizationEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartyroletypeOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartyroletypeOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com.cloderia.helion.client.local.universe.UniversePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.universe.UniverseListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com.cloderia.helion.client.local.supplierproduct.SupplierproductPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.supplierproduct.SupplierproductListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com.cloderia.helion.client.local.billingaccount.BillingaccountPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.billingaccount.BillingaccountDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetDisplay", "com.cloderia.helion.client.local.budget.BudgetPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com.cloderia.helion.client.local.facility.FacilityPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facility.FacilityListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.accountingtransaction.AccountingtransactionListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com.cloderia.helion.client.local.productcategory.ProductcategoryPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productcategory.ProductcategoryDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyDisplay", "com.cloderia.helion.client.local.party.PartyPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.party.PartyDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.SupplierproductOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.SupplierproductOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com.cloderia.helion.client.local.facilitytype.FacilitytypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.facilitytype.FacilitytypeDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com.cloderia.helion.client.local.partycategory.PartycategoryPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.partycategory.PartycategoryEditor", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.BillingaccountOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.BillingaccountOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonDisplay", "com.cloderia.helion.client.local.person.PersonPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypePresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.productfeaturetype.ProductfeaturetypeListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com.cloderia.helion.client.local.product.ProductPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.product.ProductListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com.cloderia.helion.client.local.agreement.AgreementPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.agreement.AgreementListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com.cloderia.helion.client.local.person.PersonPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.person.PersonListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "org.jboss.errai.common.client.api.IsElement");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com.cloderia.helion.client.local.budget.BudgetPresenter");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "com.google.gwt.user.client.TakesValue");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.local.budget.BudgetListItemDisplay", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartytypeOperation", "com.cloderia.helion.client.shared.ops.BaseOperation");
    CDIEventTypeLookup.get().addLookup("com.cloderia.helion.client.shared.ops.PartytypeOperation", "java.lang.Object");
  }

  private void registerFactories0(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListInvoiceitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_ListInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateProductfeaturetypePage>) GWT.create(Type_factory__c_c_h_c_l_p_CreateProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavigationPanel>) GWT.create(Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Caller>) GWT.create(ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientMessageBus>) GWT.create(Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionAnchorFactory>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchorFactory__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroleDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroleDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PaymentPresenter>) GWT.create(Type_factory__c_c_h_c_l_p_PaymentPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UniverseListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_u_UniverseListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationglaccountbalancePresenter>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationglaccountbalancePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateInvoicetermPage>) GWT.create(Type_factory__c_c_h_c_l_i_CreateInvoicetermPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateProductPage>) GWT.create(Type_factory__c_c_h_c_l_p_CreateProductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BillingaccountDisplay>) GWT.create(Type_factory__c_c_h_c_l_b_BillingaccountDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditOrganizationglaccountbalancePage>) GWT.create(Type_factory__c_c_h_c_l_o_EditOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeaturetypeDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeaturetypeDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetitemEditor>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetitemEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseBillingaccountPage>) GWT.create(Type_factory__c_c_h_c_l_b_BaseBillingaccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableRow>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_TableRow__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseProductfeaturePage>) GWT.create(Type_factory__c_c_h_c_l_p_BaseProductfeaturePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewFacilitytypePage>) GWT.create(Type_factory__c_c_h_c_l_f_ViewFacilitytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditProductcategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_EditProductcategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListBudgetPage>) GWT.create(Type_factory__c_c_h_c_l_b_ListBudgetPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePaymentPage>) GWT.create(Type_factory__c_c_h_c_l_p_BasePaymentPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PersonDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PersonDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditPersonPage>) GWT.create(Type_factory__c_c_h_c_l_p_EditPersonPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilityListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_f_FacilityListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Event>) GWT.create(ContextualProvider_factory__j_e_e_Event__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BillingaccountEditor>) GWT.create(Type_factory__c_c_h_c_l_b_BillingaccountEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseInvoiceitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_BaseInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InitBallot>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseUniversePage>) GWT.create(Type_factory__c_c_h_c_l_u_BaseUniversePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationglaccountbalanceListWidget>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeatureListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeatureListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SupplierproductPresenter>) GWT.create(Type_factory__c_c_h_c_l_s_SupplierproductPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditGeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_g_EditGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateAccountingtransactionPage>) GWT.create(Type_factory__c_c_h_c_l_a_CreateAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BatchCaller>) GWT.create(Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyEditor>) GWT.create(Type_factory__c_c_h_c_l_p_PartyEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateOrganizationPage>) GWT.create(Type_factory__c_c_h_c_l_o_CreateOrganizationPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePersonPage>) GWT.create(Type_factory__c_c_h_c_l_p_BasePersonPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateAgreementPage>) GWT.create(Type_factory__c_c_h_c_l_a_CreateAgreementPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroletypePresenter>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroletypePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetEditor>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewPartytypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewPartytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewProducttypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewProducttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionAnchor>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewBillingaccountPage>) GWT.create(Type_factory__c_c_h_c_l_b_ViewBillingaccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Navigation>) GWT.create(Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UniversePresenter>) GWT.create(Type_factory__c_c_h_c_l_u_UniversePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccountingtransactionEditor>) GWT.create(Type_factory__c_c_h_c_l_a_AccountingtransactionEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<BatchCallerProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListSupplierproductPage>) GWT.create(Type_factory__c_c_h_c_l_s_ListSupplierproductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BillingaccountListWidget>) GWT.create(Type_factory__c_c_h_c_l_b_BillingaccountListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditInvoicePage>) GWT.create(Type_factory__c_c_h_c_l_i_EditInvoicePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TransitionToRoleProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartycategoryListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_PartycategoryListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateOrganizationgeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_o_CreateOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeaturetypePresenter>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeaturetypePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePortalPage>) GWT.create(Type_factory__c_c_h_c_l_u_BasePortalPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditBillingaccountPage>) GWT.create(Type_factory__c_c_h_c_l_b_EditBillingaccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseSystemuserPage>) GWT.create(Type_factory__c_c_h_c_l_s_BaseSystemuserPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceitemPresenter>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceitemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditInvoicetermPage>) GWT.create(Type_factory__c_c_h_c_l_i_EditInvoicetermPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateProducttypePage>) GWT.create(Type_factory__c_c_h_c_l_p_CreateProducttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeaturetypeEditor>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeaturetypeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseBudgetitemPage>) GWT.create(Type_factory__c_c_h_c_l_b_BaseBudgetitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListInventoryitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_ListInventoryitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationgeneralledgeraccountDisplay>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditProductfeaturetypePage>) GWT.create(Type_factory__c_c_h_c_l_p_EditProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccessImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewPersonPage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewPersonPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListProductfeaturePage>) GWT.create(Type_factory__c_c_h_c_l_p_ListProductfeaturePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePartyrolePage>) GWT.create(Type_factory__c_c_h_c_l_p_BasePartyrolePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionTo>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewAccountingtransactionPage>) GWT.create(Type_factory__c_c_h_c_l_a_ViewAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListProductfeaturetypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ListProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseFacilityPage>) GWT.create(Type_factory__c_c_h_c_l_f_BaseFacilityPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InventoryitemPresenter>) GWT.create(Type_factory__c_c_h_c_l_i_InventoryitemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListPartytypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ListPartytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProducttypeListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProducttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartytypeListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_PartytypeListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AgreementListWidget>) GWT.create(Type_factory__c_c_h_c_l_a_AgreementListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccountingtransactionDisplay>) GWT.create(Type_factory__c_c_h_c_l_a_AccountingtransactionDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilityEditor>) GWT.create(Type_factory__c_c_h_c_l_f_FacilityEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewProductPage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewProductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewFacilityPage>) GWT.create(Type_factory__c_c_h_c_l_f_ViewFacilityPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccountListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreatePersonPage>) GWT.create(Type_factory__c_c_h_c_l_p_CreatePersonPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartytypePresenter>) GWT.create(Type_factory__c_c_h_c_l_p_PartytypePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RootPanel>) GWT.create(Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditProductfeaturePage>) GWT.create(Type_factory__c_c_h_c_l_p_EditProductfeaturePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccounttypeDisplay>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductcategoryEditor>) GWT.create(Type_factory__c_c_h_c_l_p_ProductcategoryEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartyDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewUniversePage>) GWT.create(Type_factory__c_c_h_c_l_u_ViewUniversePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PersonListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PersonListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateOrganizationglaccountbalancePage>) GWT.create(Type_factory__c_c_h_c_l_o_CreateOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PaymentListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PaymentListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DestructionImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListBillingaccountPage>) GWT.create(Type_factory__c_c_h_c_l_b_ListBillingaccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetListWidget>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewProductfeaturePage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewProductfeaturePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductcategoryListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductcategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroletypeListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroletypeListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewOrganizationglaccountbalancePage>) GWT.create(Type_factory__c_c_h_c_l_o_ViewOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavBar>) GWT.create(Type_factory__c_c_h_c_l_u_NavBar__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateProductfeaturePage>) GWT.create(Type_factory__c_c_h_c_l_p_CreateProductfeaturePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SupplierproductDisplay>) GWT.create(Type_factory__c_c_h_c_l_s_SupplierproductDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<HistoryTokenFactory>) GWT.create(Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditPartytypePage>) GWT.create(Type_factory__c_c_h_c_l_p_EditPartytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationgeneralledgeraccountListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SignUpPage>) GWT.create(Type_factory__c_c_h_c_l_a_SignUpPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InitBallotProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateBudgetPage>) GWT.create(Type_factory__c_c_h_c_l_b_CreateBudgetPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroleEditor>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroleEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePartyPage>) GWT.create(Type_factory__c_c_h_c_l_p_BasePartyPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeaturetypeListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeaturetypeListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewGeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_g_ViewGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewProductfeaturetypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationDisplay>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LocaleListBox>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceitemEditor>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceitemEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilitytypePresenter>) GWT.create(Type_factory__c_c_h_c_l_f_FacilitytypePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AgreementDisplay>) GWT.create(Type_factory__c_c_h_c_l_a_AgreementDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditProducttypePage>) GWT.create(Type_factory__c_c_h_c_l_p_EditProducttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseFacilitytypePage>) GWT.create(Type_factory__c_c_h_c_l_f_BaseFacilitytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditInventoryitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_EditInventoryitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoicetermDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InvoicetermDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditPartyrolePage>) GWT.create(Type_factory__c_c_h_c_l_p_EditPartyrolePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroletypeDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroletypeDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListSystemuserPage>) GWT.create(Type_factory__c_c_h_c_l_s_ListSystemuserPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListUniversePage>) GWT.create(Type_factory__c_c_h_c_l_u_ListUniversePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroleListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroleListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AgreementListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_a_AgreementListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceEditor>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeProvider>) GWT.create(JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewPartyrolePage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewPartyrolePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SystemuserListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_s_SystemuserListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccountEditor>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreatePartyPage>) GWT.create(Type_factory__c_c_h_c_l_p_CreatePartyPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseSupplierproductPage>) GWT.create(Type_factory__c_c_h_c_l_s_BaseSupplierproductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateBillingaccountPage>) GWT.create(Type_factory__c_c_h_c_l_b_CreateBillingaccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EventProvider>) GWT.create(Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceitemDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceitemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewOrganizationPage>) GWT.create(Type_factory__c_c_h_c_l_o_ViewOrganizationPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Instance>) GWT.create(ContextualProvider_factory__j_e_i_Instance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartytypeDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartytypeDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Heading>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateSystemuserPage>) GWT.create(Type_factory__c_c_h_c_l_s_CreateSystemuserPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListProductcategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_ListProductcategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PasswordPage>) GWT.create(Type_factory__c_c_h_c_l_a_PasswordPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartytypeEditor>) GWT.create(Type_factory__c_c_h_c_l_p_PartytypeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewSystemuserPage>) GWT.create(Type_factory__c_c_h_c_l_s_ViewSystemuserPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListGeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_g_ListGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseOrganizationgeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_o_BaseOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CallerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewProductcategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewProductcategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListBox>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_ListBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InventoryitemListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InventoryitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PersonListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_PersonListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Span>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoicetermEditor>) GWT.create(Type_factory__c_c_h_c_l_i_InvoicetermEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilitytypeDisplay>) GWT.create(Type_factory__c_c_h_c_l_f_FacilitytypeDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetitemDisplay>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetitemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetPresenter>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditInvoiceitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_EditInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PaymentListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_PaymentListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseAgreementPage>) GWT.create(Type_factory__c_c_h_c_l_a_BaseAgreementPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PersonPresenter>) GWT.create(Type_factory__c_c_h_c_l_p_PersonPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListFacilityPage>) GWT.create(Type_factory__c_c_h_c_l_f_ListFacilityPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditPaymentPage>) GWT.create(Type_factory__c_c_h_c_l_p_EditPaymentPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LocaleSelector>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UniverseListWidget>) GWT.create(Type_factory__c_c_h_c_l_u_UniverseListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreationImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponentProvider>) GWT.create(Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_PartyListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListFacilitytypePage>) GWT.create(Type_factory__c_c_h_c_l_f_ListFacilitytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditOrganizationPage>) GWT.create(Type_factory__c_c_h_c_l_o_EditOrganizationPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateGeneralledgeraccounttypePage>) GWT.create(Type_factory__c_c_h_c_l_g_CreateGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListGeneralledgeraccounttypePage>) GWT.create(Type_factory__c_c_h_c_l_g_ListGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartycategoryDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartycategoryDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<URLPatternMatcher>) GWT.create(Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartyListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditPartyPage>) GWT.create(Type_factory__c_c_h_c_l_p_EditPartyPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LifecycleListenerRegistrarImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceitemListWidget>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceitemListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElement>) GWT.create(ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ErraiEntityManager>) GWT.create(Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewGeneralledgeraccounttypePage>) GWT.create(Type_factory__c_c_h_c_l_g_ViewGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditPartycategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_EditPartycategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ValidatorProvider>) GWT.create(Type_factory__o_j_e_v_c_ValidatorProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateGeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_g_CreateGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Disposer>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponent>) GWT.create(ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UniverseEditor>) GWT.create(Type_factory__c_c_h_c_l_u_UniverseEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LoginPage>) GWT.create(Type_factory__c_c_h_c_l_a_LoginPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BillingaccountPresenter>) GWT.create(Type_factory__c_c_h_c_l_b_BillingaccountPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListProductPage>) GWT.create(Type_factory__c_c_h_c_l_p_ListProductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseGeneralledgeraccounttypePage>) GWT.create(Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePartycategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_BasePartycategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionToRole>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionToRole__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateInventoryitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_CreateInventoryitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccounttypeEditor>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Document>) GWT.create(Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewPartyroletypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewPartyroletypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstance>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetitemListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewInvoicePage>) GWT.create(Type_factory__c_c_h_c_l_i_ViewInvoicePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewBudgetPage>) GWT.create(Type_factory__c_c_h_c_l_b_ViewBudgetPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyrolePresenter>) GWT.create(Type_factory__c_c_h_c_l_p_PartyrolePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilityDisplay>) GWT.create(Type_factory__c_c_h_c_l_f_FacilityDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartycategoryListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartycategoryListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SupplierproductEditor>) GWT.create(Type_factory__c_c_h_c_l_s_SupplierproductEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroleListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroleListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PaymentDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PaymentDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartycategoryEditor>) GWT.create(Type_factory__c_c_h_c_l_p_PartycategoryEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataBinder>) GWT.create(ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeatureListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeatureListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccounttypePresenter>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseAccountingtransactionPage>) GWT.create(Type_factory__c_c_h_c_l_a_BaseAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InventoryitemEditor>) GWT.create(Type_factory__c_c_h_c_l_i_InventoryitemEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetDisplay>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccountingtransactionListWidget>) GWT.create(Type_factory__c_c_h_c_l_a_AccountingtransactionListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationgeneralledgeraccountListWidget>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RootPanelProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableCell>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_TableCell__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SystemuserListWidget>) GWT.create(Type_factory__c_c_h_c_l_s_SystemuserListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductcategoryListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_ProductcategoryListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NavigationGraph>) GWT.create(Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListProducttypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ListProducttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Logger>) GWT.create(ExtensionProvided_factory__o_s_Logger__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccountListWidget>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccountListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AnchorElement>) GWT.create(ExtensionProvided_factory__c_g_g_d_c_AnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreatePartyroletypePage>) GWT.create(Type_factory__c_c_h_c_l_p_CreatePartyroletypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ListWidgetProvider>) GWT.create(Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AgreementPresenter>) GWT.create(Type_factory__c_c_h_c_l_a_AgreementPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SideBar>) GWT.create(Type_factory__c_c_h_c_l_u_SideBar__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewInvoiceitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_ViewInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<URLPatternMatcherProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditOrganizationgeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_o_EditOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SupplierproductListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_s_SupplierproductListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableHeaderWidget>) GWT.create(Type_factory__c_c_h_c_l_u_TableHeaderWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListOrganizationgeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_o_ListOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeatureDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeatureDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListOrganizationglaccountbalancePage>) GWT.create(Type_factory__c_c_h_c_l_o_ListOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SystemuserDisplay>) GWT.create(Type_factory__c_c_h_c_l_s_SystemuserDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilityPresenter>) GWT.create(Type_factory__c_c_h_c_l_f_FacilityPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditUniversePage>) GWT.create(Type_factory__c_c_h_c_l_u_EditUniversePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Validator>) GWT.create(Provider_factory__j_v_Validator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Dashboard>) GWT.create(Type_factory__c_c_h_c_l_u_Dashboard__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePartyroletypePage>) GWT.create(Type_factory__c_c_h_c_l_p_BasePartyroletypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroletypeListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroletypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ServerTemplateProvider>) GWT.create(Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationglaccountbalanceListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccounttypeListWidget>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartytypeListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_PartytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateUniversePage>) GWT.create(Type_factory__c_c_h_c_l_u_CreateUniversePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditBudgetPage>) GWT.create(Type_factory__c_c_h_c_l_b_EditBudgetPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccountingtransactionPresenter>) GWT.create(Type_factory__c_c_h_c_l_a_AccountingtransactionPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseOrganizationglaccountbalancePage>) GWT.create(Type_factory__c_c_h_c_l_o_BaseOrganizationglaccountbalancePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<IOCBeanManagerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListAccountingtransactionPage>) GWT.create(Type_factory__c_c_h_c_l_a_ListAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateInvoicePage>) GWT.create(Type_factory__c_c_h_c_l_i_CreateInvoicePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreatePartyrolePage>) GWT.create(Type_factory__c_c_h_c_l_p_CreatePartyrolePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoicetermPresenter>) GWT.create(Type_factory__c_c_h_c_l_i_InvoicetermPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoicetermListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InvoicetermListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateFacilityPage>) GWT.create(Type_factory__c_c_h_c_l_f_CreateFacilityPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateSupplierproductPage>) GWT.create(Type_factory__c_c_h_c_l_s_CreateSupplierproductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationListWidget>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TransitionAnchorFactoryProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceListWidget>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyroletypeEditor>) GWT.create(Type_factory__c_c_h_c_l_p_PartyroletypeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetitemPresenter>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetitemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditPartyroletypePage>) GWT.create(Type_factory__c_c_h_c_l_p_EditPartyroletypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RequestDispatcherProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditSystemuserPage>) GWT.create(Type_factory__c_c_h_c_l_s_EditSystemuserPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreatePaymentPage>) GWT.create(Type_factory__c_c_h_c_l_p_CreatePaymentPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisposerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListAgreementPage>) GWT.create(Type_factory__c_c_h_c_l_a_ListAgreementPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreatePartycategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_CreatePartycategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MessageBusProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseBudgetPage>) GWT.create(Type_factory__c_c_h_c_l_b_BaseBudgetPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SenderProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewAgreementPage>) GWT.create(Type_factory__c_c_h_c_l_a_ViewAgreementPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateProductcategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_CreateProductcategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AgreementEditor>) GWT.create(Type_factory__c_c_h_c_l_a_AgreementEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductEditor>) GWT.create(Type_factory__c_c_h_c_l_p_ProductEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstanceProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductcategoryPresenter>) GWT.create(Type_factory__c_c_h_c_l_p_ProductcategoryPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationgeneralledgeraccountEditor>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListPartycategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_ListPartycategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditProductPage>) GWT.create(Type_factory__c_c_h_c_l_p_EditProductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElementProvider>) GWT.create(Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateFacilitytypePage>) GWT.create(Type_factory__c_c_h_c_l_f_CreateFacilitytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditAgreementPage>) GWT.create(Type_factory__c_c_h_c_l_a_EditAgreementPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SystemuserPresenter>) GWT.create(Type_factory__c_c_h_c_l_s_SystemuserPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListInvoicetermPage>) GWT.create(Type_factory__c_c_h_c_l_i_ListInvoicetermPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccountPresenter>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProducttypeEditor>) GWT.create(Type_factory__c_c_h_c_l_p_ProducttypeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_ProductListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListWidget>) GWT.create(ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccounttypeListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccounttypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientSyncManager>) GWT.create(Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseProductPage>) GWT.create(Type_factory__c_c_h_c_l_p_BaseProductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<AppSetup>) GWT.create(Type_factory__c_c_h_c_l_AppSetup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationEditor>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GeneralledgeraccountDisplay>) GWT.create(Type_factory__c_c_h_c_l_g_GeneralledgeraccountDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartyPresenter>) GWT.create(Type_factory__c_c_h_c_l_p_PartyPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateInvoiceitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_CreateInvoiceitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewInventoryitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_ViewInventoryitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InstanceProvider>) GWT.create(Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditFacilitytypePage>) GWT.create(Type_factory__c_c_h_c_l_f_EditFacilitytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilitytypeListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_f_FacilitytypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListPaymentPage>) GWT.create(Type_factory__c_c_h_c_l_p_ListPaymentPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilitytypeEditor>) GWT.create(Type_factory__c_c_h_c_l_f_FacilitytypeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProducttypePresenter>) GWT.create(Type_factory__c_c_h_c_l_p_ProducttypePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoicePresenter>) GWT.create(Type_factory__c_c_h_c_l_i_InvoicePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditBudgetitemPage>) GWT.create(Type_factory__c_c_h_c_l_b_EditBudgetitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditGeneralledgeraccounttypePage>) GWT.create(Type_factory__c_c_h_c_l_g_EditGeneralledgeraccounttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationPresenter>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InventoryitemListWidget>) GWT.create(Type_factory__c_c_h_c_l_i_InventoryitemListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Sender>) GWT.create(ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationglaccountbalanceDisplay>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BudgetitemListWidget>) GWT.create(Type_factory__c_c_h_c_l_b_BudgetitemListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewPartyPage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewPartyPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListOrganizationPage>) GWT.create(Type_factory__c_c_h_c_l_o_ListOrganizationPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccountingtransactionListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_a_AccountingtransactionListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListInvoicePage>) GWT.create(Type_factory__c_c_h_c_l_i_ListInvoicePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ErraiEntityManagerProducer>) GWT.create(Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeatureEditor>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeatureEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InventoryitemDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InventoryitemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListPartyPage>) GWT.create(Type_factory__c_c_h_c_l_p_ListPartyPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PaymentEditor>) GWT.create(Type_factory__c_c_h_c_l_p_PaymentEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseInvoicetermPage>) GWT.create(Type_factory__c_c_h_c_l_i_BaseInvoicetermPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Div>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilityListWidget>) GWT.create(Type_factory__c_c_h_c_l_f_FacilityListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SystemuserEditor>) GWT.create(Type_factory__c_c_h_c_l_s_SystemuserEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UniverseDisplay>) GWT.create(Type_factory__c_c_h_c_l_u_UniverseDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DataBinderProvider>) GWT.create(Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListPartyroletypePage>) GWT.create(Type_factory__c_c_h_c_l_p_ListPartyroletypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PageTransitionProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_PageTransitionProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditFacilityPage>) GWT.create(Type_factory__c_c_h_c_l_f_EditFacilityPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationgeneralledgeraccountPresenter>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationgeneralledgeraccountPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SupplierproductListWidget>) GWT.create(Type_factory__c_c_h_c_l_s_SupplierproductListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TransitionAnchorProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BillingaccountListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_b_BillingaccountListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewBudgetitemPage>) GWT.create(Type_factory__c_c_h_c_l_b_ViewBudgetitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewInvoicetermPage>) GWT.create(Type_factory__c_c_h_c_l_i_ViewInvoicetermPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewPaymentPage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewPaymentPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewSupplierproductPage>) GWT.create(Type_factory__c_c_h_c_l_s_ViewSupplierproductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewOrganizationgeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_o_ViewOrganizationgeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ViewPartycategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_ViewPartycategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeaturePresenter>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeaturePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default.class));
    windowContext.addBeanProvider("org.jboss.errai.enterprise.client.cdi.JsTypeEventObserver", new JsTypeProvider<JsTypeEventObserver>() {
      public JsTypeEventObserver getInstance() {
        return (JsTypeEventObserver) contextManager.getInstance("Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default");
      }
      public String getName() {
        return null;
      }
      public String getFactoryName() {
        return "Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default";
      }
      public JsArray<String> getQualifiers() {
        return new JsArray<String>(new String[] { "javax.enterprise.inject.Any", "javax.enterprise.inject.Default" });
      }
    });
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseProductcategoryPage>) GWT.create(Type_factory__c_c_h_c_l_p_BaseProductcategoryPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseInvoicePage>) GWT.create(Type_factory__c_c_h_c_l_i_BaseInvoicePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Heading>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseGeneralledgeraccountPage>) GWT.create(Type_factory__c_c_h_c_l_g_BaseGeneralledgeraccountPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default.class));
    windowContext.addBeanProvider("org.jboss.errai.enterprise.client.cdi.WindowEventObservers", new JsTypeProvider<WindowEventObservers>() {
      public WindowEventObservers getInstance() {
        return (WindowEventObservers) contextManager.getInstance("Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default");
      }
      public String getName() {
        return null;
      }
      public String getFactoryName() {
        return "Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default";
      }
      public JsArray<String> getQualifiers() {
        return new JsArray<String>(new String[] { "javax.enterprise.inject.Any", "javax.enterprise.inject.Default" });
      }
    });
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartycategoryPresenter>) GWT.create(Type_factory__c_c_h_c_l_p_PartycategoryPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NavigationPanelProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreateBudgetitemPage>) GWT.create(Type_factory__c_c_h_c_l_b_CreateBudgetitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsArray>) GWT.create(JsType_factory__o_j_e_i_c_JsArray__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseOrganizationPage>) GWT.create(Type_factory__c_c_h_c_l_o_BaseOrganizationPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductPresenter>) GWT.create(Type_factory__c_c_h_c_l_p_ProductPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseProducttypePage>) GWT.create(Type_factory__c_c_h_c_l_p_BaseProducttypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditAccountingtransactionPage>) GWT.create(Type_factory__c_c_h_c_l_a_EditAccountingtransactionPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoiceitemListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_i_InvoiceitemListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListPartyrolePage>) GWT.create(Type_factory__c_c_h_c_l_p_ListPartyrolePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StateChangeImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RequestDispatcher>) GWT.create(Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasePartytypePage>) GWT.create(Type_factory__c_c_h_c_l_p_BasePartytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PersonEditor>) GWT.create(Type_factory__c_c_h_c_l_p_PersonEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditSupplierproductPage>) GWT.create(Type_factory__c_c_h_c_l_s_EditSupplierproductPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TranslationServiceProvider>) GWT.create(Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductfeaturetypeListItemDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductfeaturetypeListItemDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListBudgetitemPage>) GWT.create(Type_factory__c_c_h_c_l_b_ListBudgetitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProducttypeDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProducttypeDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseProductfeaturetypePage>) GWT.create(Type_factory__c_c_h_c_l_p_BaseProductfeaturetypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListPersonPage>) GWT.create(Type_factory__c_c_h_c_l_p_ListPersonPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreatePartytypePage>) GWT.create(Type_factory__c_c_h_c_l_p_CreatePartytypePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SyncBeanManager>) GWT.create(Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FacilitytypeListWidget>) GWT.create(Type_factory__c_c_h_c_l_f_FacilitytypeListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InvoicetermListWidget>) GWT.create(Type_factory__c_c_h_c_l_i_InvoicetermListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProductcategoryDisplay>) GWT.create(Type_factory__c_c_h_c_l_p_ProductcategoryDisplay__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BaseInventoryitemPage>) GWT.create(Type_factory__c_c_h_c_l_i_BaseInventoryitemPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProducttypeListWidget>) GWT.create(Type_factory__c_c_h_c_l_p_ProducttypeListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TranslationService>) GWT.create(Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrganizationglaccountbalanceEditor>) GWT.create(Type_factory__c_c_h_c_l_o_OrganizationglaccountbalanceEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextBox>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default.class));
  }

  private void registerFactories(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    registerFactories0(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
  }

  // The main IOC bootstrap method.
  public ContextManager bootstrapContainer() {
    final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context = new ApplicationScopedContext();
    final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context = new DependentScopeContext();
    logger.debug("Registering factories with contexts.");
    long start = System.currentTimeMillis();
    registerFactories(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Registered 398 factories in {}ms", System.currentTimeMillis() - start);
    logger.debug("Adding contexts to context manager...");
    start = System.currentTimeMillis();
    contextManager.addContext(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
    contextManager.addContext(org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Added 2 contexts in {}ms", System.currentTimeMillis() - start);
    logger.debug("Calling finishInit on ContextManager");
    start = System.currentTimeMillis();
    contextManager.finishInit();
    logger.debug("ContextManager#finishInit ran in {}ms", System.currentTimeMillis() - start);
    return contextManager;
  }
}
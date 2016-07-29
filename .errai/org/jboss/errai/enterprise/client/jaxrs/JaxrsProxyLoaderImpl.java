package org.jboss.errai.enterprise.client.jaxrs;

import com.cloderia.helion.client.shared.endpoint.AccountingperiodEndPoint;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactionEndPoint;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactiondetailEndPoint;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactiontypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementitemtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementroleEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementroletypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementtermEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.BillingaccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetitemtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetstatusEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetstatustypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgettypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismpurposetypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContainerEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContainertypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.DepreciationmethodEndPoint;
import com.cloderia.helion.client.shared.endpoint.DocumentEndPoint;
import com.cloderia.helion.client.shared.endpoint.DocumenttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.FacilityEndPoint;
import com.cloderia.helion.client.shared.endpoint.FacilitytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountroleEndPoint;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountroletypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.FinancialaccounttransactionEndPoint;
import com.cloderia.helion.client.shared.endpoint.FinancialaccounttransactiontypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.FinancialaccounttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.FixedassetEndPoint;
import com.cloderia.helion.client.shared.endpoint.FixedassetdepreciationmethodEndPoint;
import com.cloderia.helion.client.shared.endpoint.FixedassettypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccounttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.GeoboundryEndPoint;
import com.cloderia.helion.client.shared.endpoint.GeoboundrytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.GlbudgetxrefEndPoint;
import com.cloderia.helion.client.shared.endpoint.InventoryitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.InventoryitemstatusEndPoint;
import com.cloderia.helion.client.shared.endpoint.InventoryitemtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceroletypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoicestatusEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoicestatustypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoicetermEndPoint;
import com.cloderia.helion.client.shared.endpoint.LotEndPoint;
import com.cloderia.helion.client.shared.endpoint.OrganizationEndPoint;
import com.cloderia.helion.client.shared.endpoint.OrganizationgeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.OrganizationglaccountbalanceEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartycategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshipEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshipstatusEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshiptypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyroleEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyroletypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymentEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymentapplicationEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymentmethodtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymenttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PeriodtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PersonEndPoint;
import com.cloderia.helion.client.shared.endpoint.PreferencetypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductcategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductcategorytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductfeatureEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturecategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturetypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProducttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.RatingtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.StandardtimeperiodEndPoint;
import com.cloderia.helion.client.shared.endpoint.SupplierproductEndPoint;
import com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint;
import com.cloderia.helion.client.shared.endpoint.TerminationreasonEndPoint;
import com.cloderia.helion.client.shared.endpoint.TerminationtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.TermtypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.endpoint.UomEndPoint;
import com.cloderia.helion.client.shared.endpoint.UomconversionEndPoint;
import com.cloderia.helion.client.shared.model.Accountingperiod;
import com.cloderia.helion.client.shared.model.Accountingtransaction;
import com.cloderia.helion.client.shared.model.Accountingtransactiondetail;
import com.cloderia.helion.client.shared.model.Accountingtransactiontype;
import com.cloderia.helion.client.shared.model.Agreement;
import com.cloderia.helion.client.shared.model.Agreementitem;
import com.cloderia.helion.client.shared.model.Agreementitemtype;
import com.cloderia.helion.client.shared.model.Agreementrole;
import com.cloderia.helion.client.shared.model.Agreementroletype;
import com.cloderia.helion.client.shared.model.Agreementterm;
import com.cloderia.helion.client.shared.model.Agreementtype;
import com.cloderia.helion.client.shared.model.Billingaccount;
import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.model.Budgetitem;
import com.cloderia.helion.client.shared.model.Budgetitemtype;
import com.cloderia.helion.client.shared.model.Budgetstatus;
import com.cloderia.helion.client.shared.model.Budgetstatustype;
import com.cloderia.helion.client.shared.model.Budgettype;
import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.model.Contactmechanismpurposetype;
import com.cloderia.helion.client.shared.model.Contactmechanismtype;
import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.model.Containertype;
import com.cloderia.helion.client.shared.model.Depreciationmethod;
import com.cloderia.helion.client.shared.model.Document;
import com.cloderia.helion.client.shared.model.Documenttype;
import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.model.Facilitytype;
import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.model.Financialaccountrole;
import com.cloderia.helion.client.shared.model.Financialaccountroletype;
import com.cloderia.helion.client.shared.model.Financialaccounttransaction;
import com.cloderia.helion.client.shared.model.Financialaccounttransactiontype;
import com.cloderia.helion.client.shared.model.Financialaccounttype;
import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.model.Fixedassetdepreciationmethod;
import com.cloderia.helion.client.shared.model.Fixedassettype;
import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.cloderia.helion.client.shared.model.Geoboundry;
import com.cloderia.helion.client.shared.model.Geoboundrytype;
import com.cloderia.helion.client.shared.model.Glbudgetxref;
import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.model.Invoiceroletype;
import com.cloderia.helion.client.shared.model.Invoicestatus;
import com.cloderia.helion.client.shared.model.Invoicestatustype;
import com.cloderia.helion.client.shared.model.Invoiceterm;
import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.model.Organization;
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.cloderia.helion.client.shared.model.Organizationglaccountbalance;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Partycategory;
import com.cloderia.helion.client.shared.model.Partyrelationship;
import com.cloderia.helion.client.shared.model.Partyrelationshipstatus;
import com.cloderia.helion.client.shared.model.Partyrelationshiptype;
import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.model.Paymentapplication;
import com.cloderia.helion.client.shared.model.Paymentmethodtype;
import com.cloderia.helion.client.shared.model.Paymenttype;
import com.cloderia.helion.client.shared.model.Periodtype;
import com.cloderia.helion.client.shared.model.Person;
import com.cloderia.helion.client.shared.model.Preferencetype;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.model.Productcategory;
import com.cloderia.helion.client.shared.model.Productcategorytype;
import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.model.Productfeaturecategory;
import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.cloderia.helion.client.shared.model.Producttype;
import com.cloderia.helion.client.shared.model.Ratingtype;
import com.cloderia.helion.client.shared.model.Standardtimeperiod;
import com.cloderia.helion.client.shared.model.Supplierproduct;
import com.cloderia.helion.client.shared.model.Systemuser;
import com.cloderia.helion.client.shared.model.Terminationreason;
import com.cloderia.helion.client.shared.model.Terminationtype;
import com.cloderia.helion.client.shared.model.Termtype;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.model.Uomconversion;
import com.cloderia.helion.client.shared.ops.AccountingperiodOperation;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
import com.cloderia.helion.client.shared.ops.AccountingtransactiondetailOperation;
import com.cloderia.helion.client.shared.ops.AccountingtransactiontypeOperation;
import com.cloderia.helion.client.shared.ops.AgreementOperation;
import com.cloderia.helion.client.shared.ops.AgreementitemOperation;
import com.cloderia.helion.client.shared.ops.AgreementitemtypeOperation;
import com.cloderia.helion.client.shared.ops.AgreementroleOperation;
import com.cloderia.helion.client.shared.ops.AgreementroletypeOperation;
import com.cloderia.helion.client.shared.ops.AgreementtermOperation;
import com.cloderia.helion.client.shared.ops.AgreementtypeOperation;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;
import com.cloderia.helion.client.shared.ops.BudgetOperation;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
import com.cloderia.helion.client.shared.ops.BudgetitemtypeOperation;
import com.cloderia.helion.client.shared.ops.BudgetstatusOperation;
import com.cloderia.helion.client.shared.ops.BudgetstatustypeOperation;
import com.cloderia.helion.client.shared.ops.BudgettypeOperation;
import com.cloderia.helion.client.shared.ops.ContactmechanismOperation;
import com.cloderia.helion.client.shared.ops.ContactmechanismpurposetypeOperation;
import com.cloderia.helion.client.shared.ops.ContactmechanismtypeOperation;
import com.cloderia.helion.client.shared.ops.ContainerOperation;
import com.cloderia.helion.client.shared.ops.ContainertypeOperation;
import com.cloderia.helion.client.shared.ops.DepreciationmethodOperation;
import com.cloderia.helion.client.shared.ops.DocumentOperation;
import com.cloderia.helion.client.shared.ops.DocumenttypeOperation;
import com.cloderia.helion.client.shared.ops.FacilityOperation;
import com.cloderia.helion.client.shared.ops.FacilitytypeOperation;
import com.cloderia.helion.client.shared.ops.FinancialaccountOperation;
import com.cloderia.helion.client.shared.ops.FinancialaccountroleOperation;
import com.cloderia.helion.client.shared.ops.FinancialaccountroletypeOperation;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactionOperation;
import com.cloderia.helion.client.shared.ops.FinancialaccounttransactiontypeOperation;
import com.cloderia.helion.client.shared.ops.FinancialaccounttypeOperation;
import com.cloderia.helion.client.shared.ops.FixedassetOperation;
import com.cloderia.helion.client.shared.ops.FixedassetdepreciationmethodOperation;
import com.cloderia.helion.client.shared.ops.FixedassettypeOperation;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;
import com.cloderia.helion.client.shared.ops.GeoboundryOperation;
import com.cloderia.helion.client.shared.ops.GeoboundrytypeOperation;
import com.cloderia.helion.client.shared.ops.GlbudgetxrefOperation;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;
import com.cloderia.helion.client.shared.ops.InventoryitemstatusOperation;
import com.cloderia.helion.client.shared.ops.InventoryitemtypeOperation;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;
import com.cloderia.helion.client.shared.ops.InvoiceitemtypeOperation;
import com.cloderia.helion.client.shared.ops.InvoiceroletypeOperation;
import com.cloderia.helion.client.shared.ops.InvoicestatusOperation;
import com.cloderia.helion.client.shared.ops.InvoicestatustypeOperation;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;
import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.LotOperation;
import com.cloderia.helion.client.shared.ops.OrganizationOperation;
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
import com.cloderia.helion.client.shared.ops.PartyOperation;
import com.cloderia.helion.client.shared.ops.PartycategoryOperation;
import com.cloderia.helion.client.shared.ops.PartyrelationshipOperation;
import com.cloderia.helion.client.shared.ops.PartyrelationshipstatusOperation;
import com.cloderia.helion.client.shared.ops.PartyrelationshiptypeOperation;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;
import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;
import com.cloderia.helion.client.shared.ops.PaymentOperation;
import com.cloderia.helion.client.shared.ops.PaymentapplicationOperation;
import com.cloderia.helion.client.shared.ops.PaymentmethodtypeOperation;
import com.cloderia.helion.client.shared.ops.PaymenttypeOperation;
import com.cloderia.helion.client.shared.ops.PeriodtypeOperation;
import com.cloderia.helion.client.shared.ops.PersonOperation;
import com.cloderia.helion.client.shared.ops.PreferencetypeOperation;
import com.cloderia.helion.client.shared.ops.ProductOperation;
import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;
import com.cloderia.helion.client.shared.ops.ProductcategorytypeOperation;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;
import com.cloderia.helion.client.shared.ops.ProductfeaturecategoryOperation;
import com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation;
import com.cloderia.helion.client.shared.ops.ProducttypeOperation;
import com.cloderia.helion.client.shared.ops.RatingtypeOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.cloderia.helion.client.shared.ops.StandardtimeperiodOperation;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;
import com.cloderia.helion.client.shared.ops.TerminationreasonOperation;
import com.cloderia.helion.client.shared.ops.TerminationtypeOperation;
import com.cloderia.helion.client.shared.ops.TermtypeOperation;
import com.cloderia.helion.client.shared.ops.UniverseOperation;
import com.cloderia.helion.client.shared.ops.UomOperation;
import com.cloderia.helion.client.shared.ops.UomconversionOperation;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.URL;
import java.util.List;
import javax.ws.rs.core.Response;
import org.jboss.errai.common.client.api.ErrorCallback;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.common.client.framework.ProxyProvider;
import org.jboss.errai.common.client.framework.RemoteServiceProxyFactory;

public class JaxrsProxyLoaderImpl implements JaxrsProxyLoader { public void loadProxies() {
    class com_cloderia_helion_client_shared_endpoint_FinancialaccountEndPointImpl extends AbstractJaxrsProxy implements FinancialaccountEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FinancialaccountEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Financialaccount.class);
          }
        });
        return null;
      }

      public Financialaccount findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Financialaccount.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FinancialaccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FinancialaccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FinancialaccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FinancialaccountEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FinancialaccountEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ProductEndPointImpl extends AbstractJaxrsProxy implements ProductEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ProductEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("product");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Product.class);
          }
        });
        return null;
      }

      public Product findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("product/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Product.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ProductOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("product");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ProductOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("product");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("product/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ProductOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("product");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ProductEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ProductEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AgreementtermEndPointImpl extends AbstractJaxrsProxy implements AgreementtermEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AgreementtermEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Agreementterm.class);
          }
        });
        return null;
      }

      public Agreementterm findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementterm/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Agreementterm.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AgreementtermOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AgreementtermOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementterm/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AgreementtermOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AgreementtermEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AgreementtermEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_LotEndPointImpl extends AbstractJaxrsProxy implements LotEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_LotEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("lot");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Lot.class);
          }
        });
        return null;
      }

      public Lot findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("lot/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Lot.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final LotOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("lot");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final LotOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("lot");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("lot/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final LotOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("lot");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(LotEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_LotEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ContactmechanismEndPointImpl extends AbstractJaxrsProxy implements ContactmechanismEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ContactmechanismEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanism");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Contactmechanism.class);
          }
        });
        return null;
      }

      public Contactmechanism findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanism/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Contactmechanism.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ContactmechanismOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanism");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ContactmechanismOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanism");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanism/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ContactmechanismOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanism");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ContactmechanismEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ContactmechanismEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartyroleEndPointImpl extends AbstractJaxrsProxy implements PartyroleEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartyroleEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Partyrole.class);
          }
        });
        return null;
      }

      public Partyrole findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrole/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Partyrole.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartyroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartyroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrole/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartyroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartyroleEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartyroleEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartyroletypeEndPointImpl extends AbstractJaxrsProxy implements PartyroletypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartyroletypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Partyroletype.class);
          }
        });
        return null;
      }

      public Partyroletype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Partyroletype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartyroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartyroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartyroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartyroletypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartyroletypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_DocumenttypeEndPointImpl extends AbstractJaxrsProxy implements DocumenttypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_DocumenttypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("documenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Documenttype.class);
          }
        });
        return null;
      }

      public Documenttype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("documenttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Documenttype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final DocumenttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("documenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final DocumenttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("documenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("documenttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final DocumenttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("documenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DocumenttypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_DocumenttypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ContactmechanismpurposetypeEndPointImpl extends AbstractJaxrsProxy implements ContactmechanismpurposetypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ContactmechanismpurposetypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismpurposetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Contactmechanismpurposetype.class);
          }
        });
        return null;
      }

      public Contactmechanismpurposetype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismpurposetype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Contactmechanismpurposetype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ContactmechanismpurposetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismpurposetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ContactmechanismpurposetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismpurposetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismpurposetype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ContactmechanismpurposetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismpurposetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ContactmechanismpurposetypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ContactmechanismpurposetypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FixedassetdepreciationmethodEndPointImpl extends AbstractJaxrsProxy implements FixedassetdepreciationmethodEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FixedassetdepreciationmethodEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassetdepreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Fixedassetdepreciationmethod.class);
          }
        });
        return null;
      }

      public Fixedassetdepreciationmethod findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassetdepreciationmethod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Fixedassetdepreciationmethod.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FixedassetdepreciationmethodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassetdepreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FixedassetdepreciationmethodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassetdepreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassetdepreciationmethod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FixedassetdepreciationmethodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassetdepreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FixedassetdepreciationmethodEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FixedassetdepreciationmethodEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ContainertypeEndPointImpl extends AbstractJaxrsProxy implements ContainertypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ContainertypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("containertype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Containertype.class);
          }
        });
        return null;
      }

      public Containertype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("containertype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Containertype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ContainertypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("containertype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ContainertypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("containertype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("containertype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ContainertypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("containertype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ContainertypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ContainertypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_StandardtimeperiodEndPointImpl extends AbstractJaxrsProxy implements StandardtimeperiodEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_StandardtimeperiodEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("standardtimeperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Standardtimeperiod.class);
          }
        });
        return null;
      }

      public Standardtimeperiod findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("standardtimeperiod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Standardtimeperiod.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final StandardtimeperiodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("standardtimeperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final StandardtimeperiodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("standardtimeperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("standardtimeperiod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final StandardtimeperiodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("standardtimeperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(StandardtimeperiodEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_StandardtimeperiodEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InventoryitemEndPointImpl extends AbstractJaxrsProxy implements InventoryitemEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InventoryitemEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Inventoryitem.class);
          }
        });
        return null;
      }

      public Inventoryitem findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Inventoryitem.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InventoryitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InventoryitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InventoryitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InventoryitemEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InventoryitemEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_BudgetEndPointImpl extends AbstractJaxrsProxy implements BudgetEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_BudgetEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budget");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Budget.class);
          }
        });
        return null;
      }

      public Budget findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budget/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Budget.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final BudgetOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budget");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final BudgetOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budget");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budget/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final BudgetOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budget");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BudgetEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_BudgetEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartycategoryEndPointImpl extends AbstractJaxrsProxy implements PartycategoryEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartycategoryEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partycategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Partycategory.class);
          }
        });
        return null;
      }

      public Partycategory findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partycategory/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Partycategory.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartycategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partycategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartycategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partycategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partycategory/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartycategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partycategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartycategoryEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartycategoryEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PaymentmethodtypeEndPointImpl extends AbstractJaxrsProxy implements PaymentmethodtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PaymentmethodtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentmethodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Paymentmethodtype.class);
          }
        });
        return null;
      }

      public Paymentmethodtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentmethodtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Paymentmethodtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PaymentmethodtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentmethodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PaymentmethodtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentmethodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentmethodtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PaymentmethodtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentmethodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PaymentmethodtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PaymentmethodtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_TerminationreasonEndPointImpl extends AbstractJaxrsProxy implements TerminationreasonEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_TerminationreasonEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationreason");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Terminationreason.class);
          }
        });
        return null;
      }

      public Terminationreason findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationreason/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Terminationreason.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final TerminationreasonOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationreason");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final TerminationreasonOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationreason");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationreason/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final TerminationreasonOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationreason");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(TerminationreasonEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_TerminationreasonEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FixedassettypeEndPointImpl extends AbstractJaxrsProxy implements FixedassettypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FixedassettypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Fixedassettype.class);
          }
        });
        return null;
      }

      public Fixedassettype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassettype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Fixedassettype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FixedassettypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FixedassettypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassettype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FixedassettypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedassettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FixedassettypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FixedassettypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FinancialaccountroleEndPointImpl extends AbstractJaxrsProxy implements FinancialaccountroleEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FinancialaccountroleEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Financialaccountrole.class);
          }
        });
        return null;
      }

      public Financialaccountrole findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountrole/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Financialaccountrole.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FinancialaccountroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FinancialaccountroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountrole/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FinancialaccountroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FinancialaccountroleEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FinancialaccountroleEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_DocumentEndPointImpl extends AbstractJaxrsProxy implements DocumentEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_DocumentEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("document");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Document.class);
          }
        });
        return null;
      }

      public Document findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("document/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Document.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final DocumentOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("document");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final DocumentOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("document");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("document/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final DocumentOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("document");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DocumentEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_DocumentEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FacilitytypeEndPointImpl extends AbstractJaxrsProxy implements FacilitytypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FacilitytypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facilitytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Facilitytype.class);
          }
        });
        return null;
      }

      public Facilitytype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facilitytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Facilitytype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FacilitytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facilitytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FacilitytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facilitytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facilitytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FacilitytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facilitytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FacilitytypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FacilitytypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_BudgetstatusEndPointImpl extends AbstractJaxrsProxy implements BudgetstatusEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_BudgetstatusEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Budgetstatus.class);
          }
        });
        return null;
      }

      public Budgetstatus findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Budgetstatus.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final BudgetstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final BudgetstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final BudgetstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BudgetstatusEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_BudgetstatusEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AccountingtransactiontypeEndPointImpl extends AbstractJaxrsProxy implements AccountingtransactiontypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AccountingtransactiontypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Accountingtransactiontype.class);
          }
        });
        return null;
      }

      public Accountingtransactiontype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiontype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Accountingtransactiontype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AccountingtransactiontypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AccountingtransactiontypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiontype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AccountingtransactiontypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AccountingtransactiontypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AccountingtransactiontypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_UniverseEndPointImpl extends AbstractJaxrsProxy implements UniverseEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_UniverseEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("universe");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Universe.class);
          }
        });
        return null;
      }

      public Universe findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("universe/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Universe.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final UniverseOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("universe");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final UniverseOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("universe");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("universe/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final UniverseOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("universe");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(UniverseEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_UniverseEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ProductfeaturecategoryEndPointImpl extends AbstractJaxrsProxy implements ProductfeaturecategoryEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ProductfeaturecategoryEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturecategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Productfeaturecategory.class);
          }
        });
        return null;
      }

      public Productfeaturecategory findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturecategory/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Productfeaturecategory.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ProductfeaturecategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturecategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ProductfeaturecategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturecategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturecategory/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ProductfeaturecategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturecategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ProductfeaturecategoryEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ProductfeaturecategoryEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_OrganizationEndPointImpl extends AbstractJaxrsProxy implements OrganizationEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_OrganizationEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organization");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Organization.class);
          }
        });
        return null;
      }

      public Organization findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organization/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Organization.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final OrganizationOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organization");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final OrganizationOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organization");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organization/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final OrganizationOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organization");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(OrganizationEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_OrganizationEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FacilityEndPointImpl extends AbstractJaxrsProxy implements FacilityEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FacilityEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facility");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Facility.class);
          }
        });
        return null;
      }

      public Facility findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facility/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Facility.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FacilityOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facility");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FacilityOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facility");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facility/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FacilityOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("facility");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FacilityEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FacilityEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_BillingaccountEndPointImpl extends AbstractJaxrsProxy implements BillingaccountEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_BillingaccountEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("billingaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Billingaccount.class);
          }
        });
        return null;
      }

      public Billingaccount findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("billingaccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Billingaccount.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final BillingaccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("billingaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final BillingaccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("billingaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("billingaccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final BillingaccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("billingaccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BillingaccountEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_BillingaccountEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AgreementitemEndPointImpl extends AbstractJaxrsProxy implements AgreementitemEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AgreementitemEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Agreementitem.class);
          }
        });
        return null;
      }

      public Agreementitem findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Agreementitem.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AgreementitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AgreementitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AgreementitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AgreementitemEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AgreementitemEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PersonEndPointImpl extends AbstractJaxrsProxy implements PersonEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PersonEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("person");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Person.class);
          }
        });
        return null;
      }

      public Person findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("person/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Person.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PersonOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("person");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PersonOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("person");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("person/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PersonOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("person");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PersonEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PersonEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AgreementroleEndPointImpl extends AbstractJaxrsProxy implements AgreementroleEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AgreementroleEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Agreementrole.class);
          }
        });
        return null;
      }

      public Agreementrole findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementrole/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Agreementrole.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AgreementroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AgreementroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementrole/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AgreementroleOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementrole");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AgreementroleEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AgreementroleEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InvoiceitemEndPointImpl extends AbstractJaxrsProxy implements InvoiceitemEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InvoiceitemEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Invoiceitem.class);
          }
        });
        return null;
      }

      public Invoiceitem findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Invoiceitem.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InvoiceitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InvoiceitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InvoiceitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InvoiceitemEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InvoiceitemEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartyEndPointImpl extends AbstractJaxrsProxy implements PartyEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartyEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("party");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Party.class);
          }
        });
        return null;
      }

      public Party findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("party/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Party.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartyOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("party");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartyOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("party");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("party/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartyOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("party");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartyEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartyEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PreferencetypeEndPointImpl extends AbstractJaxrsProxy implements PreferencetypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PreferencetypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("preferencetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Preferencetype.class);
          }
        });
        return null;
      }

      public Preferencetype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("preferencetype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Preferencetype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PreferencetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("preferencetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PreferencetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("preferencetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("preferencetype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PreferencetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("preferencetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PreferencetypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PreferencetypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AccountingperiodEndPointImpl extends AbstractJaxrsProxy implements AccountingperiodEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AccountingperiodEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Accountingperiod.class);
          }
        });
        return null;
      }

      public Accountingperiod findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingperiod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Accountingperiod.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AccountingperiodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AccountingperiodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingperiod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AccountingperiodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingperiod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AccountingperiodEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AccountingperiodEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ProductcategorytypeEndPointImpl extends AbstractJaxrsProxy implements ProductcategorytypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ProductcategorytypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategorytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Productcategorytype.class);
          }
        });
        return null;
      }

      public Productcategorytype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategorytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Productcategorytype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ProductcategorytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategorytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ProductcategorytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategorytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategorytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ProductcategorytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategorytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ProductcategorytypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ProductcategorytypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ProductfeaturetypeEndPointImpl extends AbstractJaxrsProxy implements ProductfeaturetypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ProductfeaturetypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Productfeaturetype.class);
          }
        });
        return null;
      }

      public Productfeaturetype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturetype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Productfeaturetype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ProductfeaturetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ProductfeaturetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturetype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ProductfeaturetypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeaturetype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ProductfeaturetypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ProductfeaturetypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AccountingtransactiondetailEndPointImpl extends AbstractJaxrsProxy implements AccountingtransactiondetailEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AccountingtransactiondetailEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiondetail");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Accountingtransactiondetail.class);
          }
        });
        return null;
      }

      public Accountingtransactiondetail findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiondetail/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Accountingtransactiondetail.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AccountingtransactiondetailOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiondetail");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AccountingtransactiondetailOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiondetail");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiondetail/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AccountingtransactiondetailOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransactiondetail");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AccountingtransactiondetailEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AccountingtransactiondetailEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PaymenttypeEndPointImpl extends AbstractJaxrsProxy implements PaymenttypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PaymenttypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Paymenttype.class);
          }
        });
        return null;
      }

      public Paymenttype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymenttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Paymenttype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PaymenttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PaymenttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymenttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PaymenttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymenttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PaymenttypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PaymenttypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PaymentEndPointImpl extends AbstractJaxrsProxy implements PaymentEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PaymentEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("payment");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Payment.class);
          }
        });
        return null;
      }

      public Payment findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("payment/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Payment.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PaymentOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("payment");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PaymentOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("payment");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("payment/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PaymentOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("payment");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PaymentEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PaymentEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ProductcategoryEndPointImpl extends AbstractJaxrsProxy implements ProductcategoryEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ProductcategoryEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Productcategory.class);
          }
        });
        return null;
      }

      public Productcategory findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategory/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Productcategory.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ProductcategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ProductcategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategory/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ProductcategoryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productcategory");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ProductcategoryEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ProductcategoryEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InvoiceitemtypeEndPointImpl extends AbstractJaxrsProxy implements InvoiceitemtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InvoiceitemtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Invoiceitemtype.class);
          }
        });
        return null;
      }

      public Invoiceitemtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Invoiceitemtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InvoiceitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InvoiceitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InvoiceitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InvoiceitemtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InvoiceitemtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_GeoboundrytypeEndPointImpl extends AbstractJaxrsProxy implements GeoboundrytypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_GeoboundrytypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundrytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Geoboundrytype.class);
          }
        });
        return null;
      }

      public Geoboundrytype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundrytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Geoboundrytype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final GeoboundrytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundrytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final GeoboundrytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundrytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundrytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final GeoboundrytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundrytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(GeoboundrytypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_GeoboundrytypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_OrganizationglaccountbalanceEndPointImpl extends AbstractJaxrsProxy implements OrganizationglaccountbalanceEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_OrganizationglaccountbalanceEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationglaccountbalance");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Organizationglaccountbalance.class);
          }
        });
        return null;
      }

      public Organizationglaccountbalance findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationglaccountbalance/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Organizationglaccountbalance.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final OrganizationglaccountbalanceOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationglaccountbalance");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final OrganizationglaccountbalanceOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationglaccountbalance");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationglaccountbalance/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final OrganizationglaccountbalanceOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationglaccountbalance");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(OrganizationglaccountbalanceEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_OrganizationglaccountbalanceEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_UomEndPointImpl extends AbstractJaxrsProxy implements UomEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_UomEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uom");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Uom.class);
          }
        });
        return null;
      }

      public Uom findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uom/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Uom.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final UomOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uom");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final UomOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uom");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uom/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final UomOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uom");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(UomEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_UomEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_RatingtypeEndPointImpl extends AbstractJaxrsProxy implements RatingtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_RatingtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("ratingtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Ratingtype.class);
          }
        });
        return null;
      }

      public Ratingtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("ratingtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Ratingtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final RatingtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("ratingtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final RatingtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("ratingtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("ratingtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final RatingtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("ratingtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(RatingtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_RatingtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AccountingtransactionEndPointImpl extends AbstractJaxrsProxy implements AccountingtransactionEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AccountingtransactionEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Accountingtransaction.class);
          }
        });
        return null;
      }

      public Accountingtransaction findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransaction/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Accountingtransaction.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AccountingtransactionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AccountingtransactionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransaction/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AccountingtransactionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("accountingtransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AccountingtransactionEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AccountingtransactionEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartyrelationshipstatusEndPointImpl extends AbstractJaxrsProxy implements PartyrelationshipstatusEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartyrelationshipstatusEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshipstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Partyrelationshipstatus.class);
          }
        });
        return null;
      }

      public Partyrelationshipstatus findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshipstatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Partyrelationshipstatus.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartyrelationshipstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshipstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartyrelationshipstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshipstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshipstatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartyrelationshipstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshipstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartyrelationshipstatusEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartyrelationshipstatusEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ProductfeatureEndPointImpl extends AbstractJaxrsProxy implements ProductfeatureEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ProductfeatureEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeature");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Productfeature.class);
          }
        });
        return null;
      }

      public Productfeature findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeature/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Productfeature.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ProductfeatureOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeature");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ProductfeatureOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeature");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeature/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ProductfeatureOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("productfeature");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ProductfeatureEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ProductfeatureEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InvoicestatustypeEndPointImpl extends AbstractJaxrsProxy implements InvoicestatustypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InvoicestatustypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Invoicestatustype.class);
          }
        });
        return null;
      }

      public Invoicestatustype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatustype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Invoicestatustype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InvoicestatustypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InvoicestatustypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatustype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InvoicestatustypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InvoicestatustypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InvoicestatustypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FixedassetEndPointImpl extends AbstractJaxrsProxy implements FixedassetEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FixedassetEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedasset");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Fixedasset.class);
          }
        });
        return null;
      }

      public Fixedasset findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedasset/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Fixedasset.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FixedassetOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedasset");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FixedassetOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedasset");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedasset/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FixedassetOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("fixedasset");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FixedassetEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FixedassetEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FinancialaccounttransactiontypeEndPointImpl extends AbstractJaxrsProxy implements FinancialaccounttransactiontypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FinancialaccounttransactiontypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Financialaccounttransactiontype.class);
          }
        });
        return null;
      }

      public Financialaccounttransactiontype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransactiontype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Financialaccounttransactiontype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FinancialaccounttransactiontypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FinancialaccounttransactiontypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransactiontype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FinancialaccounttransactiontypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransactiontype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FinancialaccounttransactiontypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FinancialaccounttransactiontypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_BudgetitemtypeEndPointImpl extends AbstractJaxrsProxy implements BudgetitemtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_BudgetitemtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Budgetitemtype.class);
          }
        });
        return null;
      }

      public Budgetitemtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Budgetitemtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final BudgetitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final BudgetitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final BudgetitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BudgetitemtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_BudgetitemtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AgreementEndPointImpl extends AbstractJaxrsProxy implements AgreementEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AgreementEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreement");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Agreement.class);
          }
        });
        return null;
      }

      public Agreement findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreement/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Agreement.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AgreementOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreement");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AgreementOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreement");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreement/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AgreementOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreement");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AgreementEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AgreementEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_GeoboundryEndPointImpl extends AbstractJaxrsProxy implements GeoboundryEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_GeoboundryEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundry");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Geoboundry.class);
          }
        });
        return null;
      }

      public Geoboundry findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundry/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Geoboundry.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final GeoboundryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundry");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final GeoboundryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundry");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundry/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final GeoboundryOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("geoboundry");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(GeoboundryEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_GeoboundryEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AgreementitemtypeEndPointImpl extends AbstractJaxrsProxy implements AgreementitemtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AgreementitemtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Agreementitemtype.class);
          }
        });
        return null;
      }

      public Agreementitemtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Agreementitemtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AgreementitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AgreementitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AgreementitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AgreementitemtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AgreementitemtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ContactmechanismtypeEndPointImpl extends AbstractJaxrsProxy implements ContactmechanismtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ContactmechanismtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Contactmechanismtype.class);
          }
        });
        return null;
      }

      public Contactmechanismtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Contactmechanismtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ContactmechanismtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ContactmechanismtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ContactmechanismtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("contactmechanismtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ContactmechanismtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ContactmechanismtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_BudgetitemEndPointImpl extends AbstractJaxrsProxy implements BudgetitemEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_BudgetitemEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Budgetitem.class);
          }
        });
        return null;
      }

      public Budgetitem findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Budgetitem.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final BudgetitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final BudgetitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitem/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final BudgetitemOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetitem");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BudgetitemEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_BudgetitemEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InvoiceEndPointImpl extends AbstractJaxrsProxy implements InvoiceEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InvoiceEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoice");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Invoice.class);
          }
        });
        return null;
      }

      public Invoice findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoice/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Invoice.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InvoiceOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoice");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InvoiceOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoice");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoice/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InvoiceOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoice");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InvoiceEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InvoiceEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartyrelationshiptypeEndPointImpl extends AbstractJaxrsProxy implements PartyrelationshiptypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartyrelationshiptypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshiptype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Partyrelationshiptype.class);
          }
        });
        return null;
      }

      public Partyrelationshiptype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshiptype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Partyrelationshiptype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartyrelationshiptypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshiptype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartyrelationshiptypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshiptype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshiptype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartyrelationshiptypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationshiptype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartyrelationshiptypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartyrelationshiptypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartytypeEndPointImpl extends AbstractJaxrsProxy implements PartytypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartytypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Partytype.class);
          }
        });
        return null;
      }

      public Partytype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Partytype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partytype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartytypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partytype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartytypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartytypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_BudgettypeEndPointImpl extends AbstractJaxrsProxy implements BudgettypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_BudgettypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Budgettype.class);
          }
        });
        return null;
      }

      public Budgettype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgettype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Budgettype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final BudgettypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final BudgettypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgettype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final BudgettypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgettype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BudgettypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_BudgettypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_TermtypeEndPointImpl extends AbstractJaxrsProxy implements TermtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_TermtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("termtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Termtype.class);
          }
        });
        return null;
      }

      public Termtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("termtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Termtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final TermtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("termtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final TermtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("termtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("termtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final TermtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("termtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(TermtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_TermtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PeriodtypeEndPointImpl extends AbstractJaxrsProxy implements PeriodtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PeriodtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("periodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Periodtype.class);
          }
        });
        return null;
      }

      public Periodtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("periodtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Periodtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PeriodtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("periodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PeriodtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("periodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("periodtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PeriodtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("periodtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PeriodtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PeriodtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AgreementroletypeEndPointImpl extends AbstractJaxrsProxy implements AgreementroletypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AgreementroletypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Agreementroletype.class);
          }
        });
        return null;
      }

      public Agreementroletype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Agreementroletype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AgreementroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AgreementroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AgreementroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AgreementroletypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AgreementroletypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_UomconversionEndPointImpl extends AbstractJaxrsProxy implements UomconversionEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_UomconversionEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uomconversion");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Uomconversion.class);
          }
        });
        return null;
      }

      public Uomconversion findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uomconversion/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Uomconversion.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final UomconversionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uomconversion");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final UomconversionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uomconversion");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uomconversion/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final UomconversionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("uomconversion");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(UomconversionEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_UomconversionEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_SystemuserEndPointImpl extends AbstractJaxrsProxy implements SystemuserEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_SystemuserEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public Response login(final LoginOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser/signin");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response signUp(final SignUpOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser/signup");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Systemuser.class);
          }
        });
        return null;
      }

      public Systemuser findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Systemuser.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final SystemuserOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final SystemuserOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final SystemuserOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("systemuser");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(SystemuserEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_SystemuserEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ProducttypeEndPointImpl extends AbstractJaxrsProxy implements ProducttypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ProducttypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("producttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Producttype.class);
          }
        });
        return null;
      }

      public Producttype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("producttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Producttype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ProducttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("producttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ProducttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("producttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("producttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ProducttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("producttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ProducttypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ProducttypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_AgreementtypeEndPointImpl extends AbstractJaxrsProxy implements AgreementtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_AgreementtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Agreementtype.class);
          }
        });
        return null;
      }

      public Agreementtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Agreementtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final AgreementtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final AgreementtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final AgreementtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("agreementtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(AgreementtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_AgreementtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_DepreciationmethodEndPointImpl extends AbstractJaxrsProxy implements DepreciationmethodEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_DepreciationmethodEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("depreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Depreciationmethod.class);
          }
        });
        return null;
      }

      public Depreciationmethod findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("depreciationmethod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Depreciationmethod.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final DepreciationmethodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("depreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final DepreciationmethodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("depreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("depreciationmethod/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final DepreciationmethodOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("depreciationmethod");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(DepreciationmethodEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_DepreciationmethodEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_GeneralledgeraccountEndPointImpl extends AbstractJaxrsProxy implements GeneralledgeraccountEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_GeneralledgeraccountEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Generalledgeraccount.class);
          }
        });
        return null;
      }

      public Generalledgeraccount findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Generalledgeraccount.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final GeneralledgeraccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final GeneralledgeraccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final GeneralledgeraccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(GeneralledgeraccountEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_GeneralledgeraccountEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InvoicetermEndPointImpl extends AbstractJaxrsProxy implements InvoicetermEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InvoicetermEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Invoiceterm.class);
          }
        });
        return null;
      }

      public Invoiceterm findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceterm/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Invoiceterm.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InvoicetermOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InvoicetermOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceterm/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InvoicetermOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceterm");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InvoicetermEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InvoicetermEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InventoryitemtypeEndPointImpl extends AbstractJaxrsProxy implements InventoryitemtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InventoryitemtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Inventoryitemtype.class);
          }
        });
        return null;
      }

      public Inventoryitemtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Inventoryitemtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InventoryitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InventoryitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InventoryitemtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InventoryitemtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InventoryitemtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_SupplierproductEndPointImpl extends AbstractJaxrsProxy implements SupplierproductEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_SupplierproductEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("supplierproduct");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Supplierproduct.class);
          }
        });
        return null;
      }

      public Supplierproduct findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("supplierproduct/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Supplierproduct.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final SupplierproductOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("supplierproduct");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final SupplierproductOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("supplierproduct");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("supplierproduct/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final SupplierproductOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("supplierproduct");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(SupplierproductEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_SupplierproductEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FinancialaccounttypeEndPointImpl extends AbstractJaxrsProxy implements FinancialaccounttypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FinancialaccounttypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Financialaccounttype.class);
          }
        });
        return null;
      }

      public Financialaccounttype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Financialaccounttype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FinancialaccounttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FinancialaccounttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FinancialaccounttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FinancialaccounttypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FinancialaccounttypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InvoicestatusEndPointImpl extends AbstractJaxrsProxy implements InvoicestatusEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InvoicestatusEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Invoicestatus.class);
          }
        });
        return null;
      }

      public Invoicestatus findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Invoicestatus.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InvoicestatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InvoicestatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InvoicestatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoicestatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InvoicestatusEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InvoicestatusEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FinancialaccounttransactionEndPointImpl extends AbstractJaxrsProxy implements FinancialaccounttransactionEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FinancialaccounttransactionEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Financialaccounttransaction.class);
          }
        });
        return null;
      }

      public Financialaccounttransaction findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransaction/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Financialaccounttransaction.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FinancialaccounttransactionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FinancialaccounttransactionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransaction/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FinancialaccounttransactionOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccounttransaction");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FinancialaccounttransactionEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FinancialaccounttransactionEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_ContainerEndPointImpl extends AbstractJaxrsProxy implements ContainerEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_ContainerEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("container");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Container.class);
          }
        });
        return null;
      }

      public Container findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("container/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Container.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final ContainerOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("container");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final ContainerOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("container");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("container/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final ContainerOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("container");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(ContainerEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_ContainerEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_BudgetstatustypeEndPointImpl extends AbstractJaxrsProxy implements BudgetstatustypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_BudgetstatustypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Budgetstatustype.class);
          }
        });
        return null;
      }

      public Budgetstatustype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatustype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Budgetstatustype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final BudgetstatustypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final BudgetstatustypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatustype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final BudgetstatustypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("budgetstatustype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(BudgetstatustypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_BudgetstatustypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InvoiceroletypeEndPointImpl extends AbstractJaxrsProxy implements InvoiceroletypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InvoiceroletypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Invoiceroletype.class);
          }
        });
        return null;
      }

      public Invoiceroletype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Invoiceroletype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InvoiceroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InvoiceroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InvoiceroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("invoiceroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InvoiceroletypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InvoiceroletypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PaymentapplicationEndPointImpl extends AbstractJaxrsProxy implements PaymentapplicationEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PaymentapplicationEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentapplication");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Paymentapplication.class);
          }
        });
        return null;
      }

      public Paymentapplication findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentapplication/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Paymentapplication.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PaymentapplicationOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentapplication");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PaymentapplicationOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentapplication");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentapplication/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PaymentapplicationOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("paymentapplication");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PaymentapplicationEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PaymentapplicationEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_GeneralledgeraccounttypeEndPointImpl extends AbstractJaxrsProxy implements GeneralledgeraccounttypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_GeneralledgeraccounttypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Generalledgeraccounttype.class);
          }
        });
        return null;
      }

      public Generalledgeraccounttype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccounttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Generalledgeraccounttype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final GeneralledgeraccounttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final GeneralledgeraccounttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccounttype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final GeneralledgeraccounttypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("generalledgeraccounttype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(GeneralledgeraccounttypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_GeneralledgeraccounttypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_GlbudgetxrefEndPointImpl extends AbstractJaxrsProxy implements GlbudgetxrefEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_GlbudgetxrefEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("glbudgetxref");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Glbudgetxref.class);
          }
        });
        return null;
      }

      public Glbudgetxref findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("glbudgetxref/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Glbudgetxref.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final GlbudgetxrefOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("glbudgetxref");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final GlbudgetxrefOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("glbudgetxref");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("glbudgetxref/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final GlbudgetxrefOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("glbudgetxref");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(GlbudgetxrefEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_GlbudgetxrefEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_FinancialaccountroletypeEndPointImpl extends AbstractJaxrsProxy implements FinancialaccountroletypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_FinancialaccountroletypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Financialaccountroletype.class);
          }
        });
        return null;
      }

      public Financialaccountroletype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Financialaccountroletype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final FinancialaccountroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final FinancialaccountroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountroletype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final FinancialaccountroletypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("financialaccountroletype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(FinancialaccountroletypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_FinancialaccountroletypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_TerminationtypeEndPointImpl extends AbstractJaxrsProxy implements TerminationtypeEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_TerminationtypeEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Terminationtype.class);
          }
        });
        return null;
      }

      public Terminationtype findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Terminationtype.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final TerminationtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final TerminationtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationtype/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final TerminationtypeOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("terminationtype");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(TerminationtypeEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_TerminationtypeEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_OrganizationgeneralledgeraccountEndPointImpl extends AbstractJaxrsProxy implements OrganizationgeneralledgeraccountEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_OrganizationgeneralledgeraccountEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationgeneralledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Organizationgeneralledgeraccount.class);
          }
        });
        return null;
      }

      public Organizationgeneralledgeraccount findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationgeneralledgeraccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Organizationgeneralledgeraccount.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final OrganizationgeneralledgeraccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationgeneralledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final OrganizationgeneralledgeraccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationgeneralledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationgeneralledgeraccount/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final OrganizationgeneralledgeraccountOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("organizationgeneralledgeraccount");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(OrganizationgeneralledgeraccountEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_OrganizationgeneralledgeraccountEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_InventoryitemstatusEndPointImpl extends AbstractJaxrsProxy implements InventoryitemstatusEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_InventoryitemstatusEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Inventoryitemstatus.class);
          }
        });
        return null;
      }

      public Inventoryitemstatus findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemstatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Inventoryitemstatus.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final InventoryitemstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final InventoryitemstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemstatus/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final InventoryitemstatusOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("inventoryitemstatus");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(InventoryitemstatusEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_InventoryitemstatusEndPointImpl();
      }
    });
    class com_cloderia_helion_client_shared_endpoint_PartyrelationshipEndPointImpl extends AbstractJaxrsProxy implements PartyrelationshipEndPoint {
      private RemoteCallback remoteCallback;
      private ErrorCallback errorCallback;
      public com_cloderia_helion_client_shared_endpoint_PartyrelationshipEndPointImpl() {

      }

      public RemoteCallback getRemoteCallback() {
        return remoteCallback;
      }

      public void setRemoteCallback(RemoteCallback callback) {
        remoteCallback = callback;
      }

      public ErrorCallback getErrorCallback() {
        return errorCallback;
      }

      public void setErrorCallback(ErrorCallback callback) {
        errorCallback = callback;
      }

      public List findAll() {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationship");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, List.class, Partyrelationship.class);
          }
        });
        return null;
      }

      public Partyrelationship findById(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationship/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, url.toString());
        requestBuilder.setHeader("Accept", "application/json");
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Partyrelationship.class, null);
          }
        });
        return null;
      }

      public Response createOperation(final PartyrelationshipOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationship");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response updateOperation(final PartyrelationshipOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationship");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.PUT, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteEntity(final Long a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationship/{id:[0-9]+}".replace("{id:[0-9]+}", URL.encodePathSegment(a0 == null ? "" : a0.toString())));
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        sendRequest(requestBuilder, null, new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }

      public Response deleteOperation(final PartyrelationshipOperation a0) {
        StringBuilder url = new StringBuilder(getBaseUrl());
        url.append("partyrelationship");
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.DELETE, url.toString());
        requestBuilder.setHeader("Content-Type", "application/json");
        sendRequest(requestBuilder, MarshallingWrapper.toJSON(a0), new ResponseDemarshallingCallback() {
          public Object demarshallResponse(String response) {
            return MarshallingWrapper.fromJSON(response, Response.class, null);
          }
        });
        return null;
      }
    }
    RemoteServiceProxyFactory.addRemoteProxy(PartyrelationshipEndPoint.class, new ProxyProvider() {
      public Object getProxy() {
        return new com_cloderia_helion_client_shared_endpoint_PartyrelationshipEndPointImpl();
      }
    });
  }
}
package org.jboss.errai.marshalling.client.api;

import com.google.gwt.core.shared.GWT;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.enterprise.context.Dependent;
import org.jboss.errai.marshalling.client.marshallers.BigDecimalMarshaller;
import org.jboss.errai.marshalling.client.marshallers.BigIntegerMarshaller;
import org.jboss.errai.marshalling.client.marshallers.BooleanMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ByteMarshaller;
import org.jboss.errai.marshalling.client.marshallers.CharacterMarshaller;
import org.jboss.errai.marshalling.client.marshallers.DateMarshaller;
import org.jboss.errai.marshalling.client.marshallers.DoubleMarshaller;
import org.jboss.errai.marshalling.client.marshallers.FloatMarshaller;
import org.jboss.errai.marshalling.client.marshallers.IntegerMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LinkedHashSetMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LinkedListMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LinkedMapMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ListMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LongMarshaller;
import org.jboss.errai.marshalling.client.marshallers.MapMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.jboss.errai.marshalling.client.marshallers.PriorityQueueMarshaller;
import org.jboss.errai.marshalling.client.marshallers.QualifyingMarshallerWrapper;
import org.jboss.errai.marshalling.client.marshallers.QueueMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SQLDateMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SetMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ShortMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SortedMapMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SortedSetMarshaller;
import org.jboss.errai.marshalling.client.marshallers.StringBufferMarshaller;
import org.jboss.errai.marshalling.client.marshallers.StringBuilderMarshaller;
import org.jboss.errai.marshalling.client.marshallers.StringMarshaller;
import org.jboss.errai.marshalling.client.marshallers.TimeMarshaller;
import org.jboss.errai.marshalling.client.marshallers.TimestampMarshaller;
@Dependent public class MarshallerFactoryImpl implements MarshallerFactory {
  private Map<String, Marshaller> marshallers = new HashMap<String, Marshaller>();
  abstract class Marshaller_for_java_lang_Throwable implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_ArithmeticException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_io_IOException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_IllegalArgumentException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_util_EmptyStackException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_ArrayStoreException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_ClassCastException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_util_ConcurrentModificationException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_IndexOutOfBoundsException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_NegativeArraySizeException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_NullPointerException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_StringIndexOutOfBoundsException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_UnsupportedOperationException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_AssertionError implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_RuntimeException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_StackTraceElement implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Partytype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InventoryitemtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Contactmechanism implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Person implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Generalledgeraccount implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Terminationtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PersonOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Standardtimeperiod implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Document implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Budget implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_BudgettypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccountOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Facility implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_OrganizationOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_TerminationtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InventoryitemOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementitemtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Uomconversion implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Inventoryitem implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccountrole implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Generalledgeraccounttype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingtransactiontypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_LotOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Product implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingtransactionOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Fixedasset implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Budgettype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceitem implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_UniverseOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccounttype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Lot implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccount implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PaymenttypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingperiodOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_common_client_PageRequest implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Agreementtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FacilityOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_DeleteResponse implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Depreciationmethod implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Preferencetype implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_ConflictResponse implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Universe implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PaymentOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ContactmechanismtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartyroleOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Budgetstatustype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InventoryitemstatusOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_SyncRequestOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ProductcategoryOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Paymentmethodtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetstatustypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Invoice implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetitemOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Productfeaturecategory implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FixedassettypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceitemtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceitemtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_SyncRequestOperation_erraiD_Type implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PreferencetypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ContainertypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Party implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Termtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_RatingtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetstatusOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Geoboundry implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_NewRemoteEntityResponse implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_GlbudgetxrefOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_LoginOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Glbudgetxref implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_GeneralledgeraccounttypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_GeoboundryOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FixedassetOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Contactmechanismtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Accountingtransaction implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementtermOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_TermtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_UomOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccountroletypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_SystemuserOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Invoicestatustype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Agreementterm implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Uom implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Invoicestatus implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ProductOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Inventoryitemstatus implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Agreementrole implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartycategoryOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetitemtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InvoicestatusOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Agreementroletype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Agreement implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Partyrelationship implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Organizationglaccountbalance implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PaymentapplicationOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InvoicestatustypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Facilitytype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ContactmechanismpurposetypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Accountingtransactiontype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Billingaccount implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ProductfeaturecategoryOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Organization implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ProducttypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ContactmechanismOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Budgetitemtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ProductfeatureOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccounttypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartyOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_DepreciationmethodOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Productcategorytype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FixedassetdepreciationmethodOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Paymentapplication implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Payment implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InvoicetermOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Containertype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_GeneralledgeraccountOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_DocumentOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Accountingtransactiondetail implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PaymentmethodtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingtransactiondetailOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_UomconversionOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_OrganizationgeneralledgeraccountOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ContainerOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Inventoryitemtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccounttransaction implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Periodtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_OrganizationglaccountbalanceOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Producttype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Partyrelationshipstatus implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Ratingtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Contactmechanismpurposetype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_DocumenttypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FacilitytypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceitemOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Productfeature implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartyroletypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Agreementitemtype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceroletypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Partyrelationshiptype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Container implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_SyncableDataSet implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementitemOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Productfeaturetype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccountroletype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccounttransactiontype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ProductcategorytypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceterm implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccounttransactionOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Partyrole implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_SignUpOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_IdChangeResponse implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Geoboundrytype implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_jpa_sync_client_shared_UpdateResponse implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Paymenttype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Agreementitem implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccounttransactiontypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Budgetstatus implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Supplierproduct implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementroletypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_TerminationreasonOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_SupplierproductOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Accountingperiod implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_BillingaccountOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementroleOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartyrelationshipOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Terminationreason implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Fixedassettype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_StandardtimeperiodOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Productcategory implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartyrelationshipstatusOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Partycategory implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Systemuser implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Documenttype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccountroleOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_GeoboundrytypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceroletype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PeriodtypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Partyroletype implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_ProductfeaturetypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_model_Budgetitem implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartyrelationshiptypeOperation implements GeneratedMarshaller { }
  abstract class Marshaller_for_com_cloderia_helion_client_shared_ops_PartytypeOperation implements GeneratedMarshaller { }
  public MarshallerFactoryImpl() {
    final ObjectMarshaller java_lang_Object = new ObjectMarshaller();
    marshallers.put("java.lang.Object", java_lang_Object);
    final BigDecimalMarshaller java_math_BigDecimal = new BigDecimalMarshaller();
    marshallers.put("java.math.BigDecimal", java_math_BigDecimal);
    final QualifyingMarshallerWrapper<Map> java_util_Map = new QualifyingMarshallerWrapper(new MapMarshaller(), MapMarshaller.class);
    marshallers.put("java.util.Map", java_util_Map);
    marshallers.put("java.util.AbstractMap", java_util_Map);
    marshallers.put("java.util.HashMap", java_util_Map);
    marshallers.put("java.util.Collections$SynchronizedMap", java_util_Map);
    marshallers.put("java.util.Collections$EmptyMap", java_util_Map);
    marshallers.put("java.util.Collections$UnmodifiableMap", java_util_Map);
    marshallers.put("java.util.Collections$SingletonMap", java_util_Map);
    final QualifyingMarshallerWrapper<AbstractMap> java_util_AbstractMap = new QualifyingMarshallerWrapper(new MapMarshaller(), MapMarshaller.class);
    marshallers.put("java.util.AbstractMap", java_util_AbstractMap);
    final QualifyingMarshallerWrapper<HashMap> java_util_HashMap = new QualifyingMarshallerWrapper(new MapMarshaller(), MapMarshaller.class);
    marshallers.put("java.util.HashMap", java_util_HashMap);
    final BooleanMarshaller java_lang_Boolean = new BooleanMarshaller();
    marshallers.put("java.lang.Boolean", java_lang_Boolean);
    final DateMarshaller java_util_Date = new DateMarshaller();
    marshallers.put("java.util.Date", java_util_Date);
    final FloatMarshaller java_lang_Float = new FloatMarshaller();
    marshallers.put("java.lang.Float", java_lang_Float);
    final ByteMarshaller java_lang_Byte = new ByteMarshaller();
    marshallers.put("java.lang.Byte", java_lang_Byte);
    final QualifyingMarshallerWrapper<LinkedHashMap> java_util_LinkedHashMap = new QualifyingMarshallerWrapper(new LinkedMapMarshaller(), LinkedMapMarshaller.class);
    marshallers.put("java.util.LinkedHashMap", java_util_LinkedHashMap);
    final QualifyingMarshallerWrapper<SortedMap> java_util_SortedMap = new QualifyingMarshallerWrapper(new SortedMapMarshaller(), SortedMapMarshaller.class);
    marshallers.put("java.util.SortedMap", java_util_SortedMap);
    marshallers.put("java.util.TreeMap", java_util_SortedMap);
    marshallers.put("java.util.Collections$SynchronizedSortedMap", java_util_SortedMap);
    marshallers.put("java.util.Collections$UnmodifiableSortedMap", java_util_SortedMap);
    final QualifyingMarshallerWrapper<TreeMap> java_util_TreeMap = new QualifyingMarshallerWrapper(new SortedMapMarshaller(), SortedMapMarshaller.class);
    marshallers.put("java.util.TreeMap", java_util_TreeMap);
    final DoubleMarshaller java_lang_Double = new DoubleMarshaller();
    marshallers.put("java.lang.Double", java_lang_Double);
    final BigIntegerMarshaller java_math_BigInteger = new BigIntegerMarshaller();
    marshallers.put("java.math.BigInteger", java_math_BigInteger);
    final SQLDateMarshaller java_sql_Date = new SQLDateMarshaller();
    marshallers.put("java.sql.Date", java_sql_Date);
    final StringMarshaller java_lang_String = new StringMarshaller();
    marshallers.put("java.lang.String", java_lang_String);
    final LinkedHashSetMarshaller java_util_LinkedHashSet = new LinkedHashSetMarshaller();
    marshallers.put("java.util.LinkedHashSet", java_util_LinkedHashSet);
    final StringBuilderMarshaller java_lang_StringBuilder = new StringBuilderMarshaller();
    marshallers.put("java.lang.StringBuilder", java_lang_StringBuilder);
    final IntegerMarshaller java_lang_Integer = new IntegerMarshaller();
    marshallers.put("java.lang.Integer", java_lang_Integer);
    final TimestampMarshaller java_sql_Timestamp = new TimestampMarshaller();
    marshallers.put("java.sql.Timestamp", java_sql_Timestamp);
    final SetMarshaller java_util_Set = new SetMarshaller();
    marshallers.put("java.util.Set", java_util_Set);
    marshallers.put("java.util.AbstractSet", java_util_Set);
    marshallers.put("java.util.HashSet", java_util_Set);
    marshallers.put("java.util.Collections$SynchronizedSet", java_util_Set);
    marshallers.put("java.util.Collections$UnmodifiableSet", java_util_Set);
    marshallers.put("java.util.Collections$SingletonSet", java_util_Set);
    marshallers.put("java.util.Collections$EmptySet", java_util_Set);
    final SetMarshaller java_util_AbstractSet = new SetMarshaller();
    marshallers.put("java.util.AbstractSet", java_util_AbstractSet);
    final SetMarshaller java_util_HashSet = new SetMarshaller();
    marshallers.put("java.util.HashSet", java_util_HashSet);
    final LinkedListMarshaller java_util_LinkedList = new LinkedListMarshaller();
    marshallers.put("java.util.LinkedList", java_util_LinkedList);
    final LongMarshaller java_lang_Long = new LongMarshaller();
    marshallers.put("java.lang.Long", java_lang_Long);
    final ListMarshaller java_util_List = new ListMarshaller();
    marshallers.put("java.util.List", java_util_List);
    marshallers.put("java.util.AbstractList", java_util_List);
    marshallers.put("java.util.ArrayList", java_util_List);
    marshallers.put("java.util.Vector", java_util_List);
    marshallers.put("java.util.Stack", java_util_List);
    marshallers.put("java.util.Collections$SynchronizedRandomAccessList", java_util_List);
    marshallers.put("java.util.Collections$SynchronizedList", java_util_List);
    marshallers.put("java.util.Collections$SingletonList", java_util_List);
    marshallers.put("java.util.Collections$EmptyList", java_util_List);
    marshallers.put("java.util.Collections$UnmodifiableRandomAccessList", java_util_List);
    marshallers.put("java.util.Collections$UnmodifiableList", java_util_List);
    marshallers.put("java.util.Arrays$ArrayList", java_util_List);
    final ListMarshaller java_util_AbstractList = new ListMarshaller();
    marshallers.put("java.util.AbstractList", java_util_AbstractList);
    final ListMarshaller java_util_ArrayList = new ListMarshaller();
    marshallers.put("java.util.ArrayList", java_util_ArrayList);
    final ListMarshaller java_util_Vector = new ListMarshaller();
    marshallers.put("java.util.Vector", java_util_Vector);
    final ListMarshaller java_util_Stack = new ListMarshaller();
    marshallers.put("java.util.Stack", java_util_Stack);
    final QueueMarshaller java_util_Queue = new QueueMarshaller();
    marshallers.put("java.util.Queue", java_util_Queue);
    marshallers.put("java.util.AbstractQueue", java_util_Queue);
    final QueueMarshaller java_util_AbstractQueue = new QueueMarshaller();
    marshallers.put("java.util.AbstractQueue", java_util_AbstractQueue);
    final ShortMarshaller java_lang_Short = new ShortMarshaller();
    marshallers.put("java.lang.Short", java_lang_Short);
    final CharacterMarshaller java_lang_Character = new CharacterMarshaller();
    marshallers.put("java.lang.Character", java_lang_Character);
    final StringBufferMarshaller java_lang_StringBuffer = new StringBufferMarshaller();
    marshallers.put("java.lang.StringBuffer", java_lang_StringBuffer);
    final TimeMarshaller java_sql_Time = new TimeMarshaller();
    marshallers.put("java.sql.Time", java_sql_Time);
    final SortedSetMarshaller java_util_SortedSet = new SortedSetMarshaller();
    marshallers.put("java.util.SortedSet", java_util_SortedSet);
    marshallers.put("java.util.TreeSet", java_util_SortedSet);
    marshallers.put("java.util.Collections$UnmodifiableSortedSet", java_util_SortedSet);
    marshallers.put("java.util.Collections$SynchronizedSortedSet", java_util_SortedSet);
    final SortedSetMarshaller java_util_TreeSet = new SortedSetMarshaller();
    marshallers.put("java.util.TreeSet", java_util_TreeSet);
    final PriorityQueueMarshaller java_util_PriorityQueue = new PriorityQueueMarshaller();
    marshallers.put("java.util.PriorityQueue", java_util_PriorityQueue);
  }

  private boolean putIfNotNull(String fqcn, Marshaller m) {
    if (m != null) {
      marshallers.put(fqcn, m);
      return true;
    } else {
      return false;
    }
  }

  private boolean loadMarshaller0(String a0) {
    Marshaller m = null;
    if ("java.lang.Throwable".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_Throwable.class);
    } else if ("java.lang.ArithmeticException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_ArithmeticException.class);
    } else if ("java.io.IOException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_io_IOException.class);
    } else if ("java.lang.IllegalArgumentException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_IllegalArgumentException.class);
    } else if ("java.util.EmptyStackException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_util_EmptyStackException.class);
    } else if ("java.lang.ArrayStoreException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_ArrayStoreException.class);
    } else if ("java.lang.ClassCastException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_ClassCastException.class);
    } else if ("java.util.ConcurrentModificationException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_util_ConcurrentModificationException.class);
    } else if ("java.lang.IndexOutOfBoundsException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_IndexOutOfBoundsException.class);
    } else if ("java.lang.NegativeArraySizeException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_NegativeArraySizeException.class);
    } else if ("java.lang.NullPointerException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_NullPointerException.class);
    } else if ("java.lang.StringIndexOutOfBoundsException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_StringIndexOutOfBoundsException.class);
    } else if ("java.lang.UnsupportedOperationException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_UnsupportedOperationException.class);
    } else if ("java.lang.AssertionError".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_AssertionError.class);
    } else if ("java.lang.RuntimeException".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_RuntimeException.class);
    } else if ("java.lang.StackTraceElement".equals(a0)) {
      m = GWT.create(Marshaller_for_java_lang_StackTraceElement.class);
    } else if ("com.cloderia.helion.client.shared.model.Partytype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Partytype.class);
    } else if ("com.cloderia.helion.client.shared.ops.InventoryitemtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InventoryitemtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Contactmechanism".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Contactmechanism.class);
    } else if ("com.cloderia.helion.client.shared.model.Person".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Person.class);
    } else if ("com.cloderia.helion.client.shared.model.Generalledgeraccount".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Generalledgeraccount.class);
    } else if ("com.cloderia.helion.client.shared.model.Terminationtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Terminationtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.PersonOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PersonOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Standardtimeperiod".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Standardtimeperiod.class);
    } else if ("com.cloderia.helion.client.shared.model.Document".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Document.class);
    } else if ("com.cloderia.helion.client.shared.model.Budget".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Budget.class);
    } else if ("com.cloderia.helion.client.shared.ops.BudgettypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_BudgettypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.FinancialaccountOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccountOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Facility".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Facility.class);
    } else if ("com.cloderia.helion.client.shared.ops.OrganizationOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_OrganizationOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.TerminationtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_TerminationtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.InventoryitemOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InventoryitemOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.AgreementitemtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementitemtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.AgreementOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Uomconversion".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Uomconversion.class);
    } else if ("com.cloderia.helion.client.shared.model.Inventoryitem".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Inventoryitem.class);
    } else if ("com.cloderia.helion.client.shared.ops.BudgetOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Financialaccountrole".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccountrole.class);
    } else if ("com.cloderia.helion.client.shared.model.Generalledgeraccounttype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Generalledgeraccounttype.class);
    } else if ("com.cloderia.helion.client.shared.ops.AccountingtransactiontypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingtransactiontypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.LotOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_LotOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Product".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Product.class);
    } else if ("com.cloderia.helion.client.shared.ops.AccountingtransactionOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingtransactionOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Fixedasset".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Fixedasset.class);
    } else if ("com.cloderia.helion.client.shared.model.Budgettype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Budgettype.class);
    } else if ("com.cloderia.helion.client.shared.model.Invoiceitem".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceitem.class);
    } else if ("com.cloderia.helion.client.shared.ops.UniverseOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_UniverseOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Financialaccounttype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccounttype.class);
    } else if ("com.cloderia.helion.client.shared.model.Lot".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Lot.class);
    } else if ("com.cloderia.helion.client.shared.model.Financialaccount".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccount.class);
    } else if ("com.cloderia.helion.client.shared.ops.PaymenttypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PaymenttypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.AccountingperiodOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingperiodOperation.class);
    } else if ("org.jboss.errai.common.client.PageRequest".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_common_client_PageRequest.class);
    } else if ("com.cloderia.helion.client.shared.model.Agreementtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Agreementtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.FacilityOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FacilityOperation.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.DeleteResponse".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_DeleteResponse.class);
    } else if ("com.cloderia.helion.client.shared.model.Depreciationmethod".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Depreciationmethod.class);
    } else if ("com.cloderia.helion.client.shared.model.Preferencetype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Preferencetype.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.ConflictResponse".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_ConflictResponse.class);
    } else if ("com.cloderia.helion.client.shared.model.Universe".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Universe.class);
    } else if ("com.cloderia.helion.client.shared.ops.PaymentOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PaymentOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.ContactmechanismtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ContactmechanismtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartyroleOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartyroleOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Budgetstatustype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Budgetstatustype.class);
    } else if ("com.cloderia.helion.client.shared.ops.InventoryitemstatusOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InventoryitemstatusOperation.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_SyncRequestOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.ProductcategoryOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ProductcategoryOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Paymentmethodtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Paymentmethodtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.BudgetstatustypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetstatustypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Invoice".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Invoice.class);
    } else if ("com.cloderia.helion.client.shared.ops.BudgetitemOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetitemOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Productfeaturecategory".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Productfeaturecategory.class);
    } else if ("com.cloderia.helion.client.shared.ops.FixedassettypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FixedassettypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Invoiceitemtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceitemtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.InvoiceitemtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceitemtypeOperation.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.SyncRequestOperation$Type".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_SyncRequestOperation_erraiD_Type.class);
    } else if ("com.cloderia.helion.client.shared.ops.PreferencetypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PreferencetypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.ContainertypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ContainertypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Party".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Party.class);
    } else if ("com.cloderia.helion.client.shared.model.Termtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Termtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.RatingtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_RatingtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.BudgetstatusOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetstatusOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Geoboundry".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Geoboundry.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.NewRemoteEntityResponse".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_NewRemoteEntityResponse.class);
    } else if ("com.cloderia.helion.client.shared.ops.GlbudgetxrefOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_GlbudgetxrefOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.LoginOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_LoginOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Glbudgetxref".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Glbudgetxref.class);
    } else if ("com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_GeneralledgeraccounttypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.GeoboundryOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_GeoboundryOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.FixedassetOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FixedassetOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Contactmechanismtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Contactmechanismtype.class);
    } else if ("com.cloderia.helion.client.shared.model.Accountingtransaction".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Accountingtransaction.class);
    } else if ("com.cloderia.helion.client.shared.ops.AgreementtermOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementtermOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.AgreementtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.TermtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_TermtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.UomOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_UomOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.FinancialaccountroletypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccountroletypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.SystemuserOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_SystemuserOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Invoicestatustype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Invoicestatustype.class);
    } else if ("com.cloderia.helion.client.shared.model.Agreementterm".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Agreementterm.class);
    }
    return putIfNotNull(a0, m);
  }

  private boolean loadMarshaller1(String a0) {
    Marshaller m = null;
    if ("com.cloderia.helion.client.shared.model.Uom".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Uom.class);
    } else if ("com.cloderia.helion.client.shared.model.Invoicestatus".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Invoicestatus.class);
    } else if ("com.cloderia.helion.client.shared.ops.ProductOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ProductOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Inventoryitemstatus".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Inventoryitemstatus.class);
    } else if ("com.cloderia.helion.client.shared.model.Agreementrole".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Agreementrole.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartycategoryOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartycategoryOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.BudgetitemtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_BudgetitemtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.InvoicestatusOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InvoicestatusOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Agreementroletype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Agreementroletype.class);
    } else if ("com.cloderia.helion.client.shared.model.Agreement".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Agreement.class);
    } else if ("com.cloderia.helion.client.shared.model.Partyrelationship".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Partyrelationship.class);
    } else if ("com.cloderia.helion.client.shared.model.Organizationglaccountbalance".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Organizationglaccountbalance.class);
    } else if ("com.cloderia.helion.client.shared.ops.PaymentapplicationOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PaymentapplicationOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.InvoicestatustypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InvoicestatustypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Facilitytype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Facilitytype.class);
    } else if ("com.cloderia.helion.client.shared.ops.ContactmechanismpurposetypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ContactmechanismpurposetypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Accountingtransactiontype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Accountingtransactiontype.class);
    } else if ("com.cloderia.helion.client.shared.model.Billingaccount".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Billingaccount.class);
    } else if ("com.cloderia.helion.client.shared.ops.ProductfeaturecategoryOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ProductfeaturecategoryOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Organization".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Organization.class);
    } else if ("com.cloderia.helion.client.shared.ops.ProducttypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ProducttypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.ContactmechanismOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ContactmechanismOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Budgetitemtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Budgetitemtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.ProductfeatureOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ProductfeatureOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.FinancialaccounttypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccounttypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartyOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartyOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.DepreciationmethodOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_DepreciationmethodOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Productcategorytype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Productcategorytype.class);
    } else if ("com.cloderia.helion.client.shared.ops.FixedassetdepreciationmethodOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FixedassetdepreciationmethodOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Paymentapplication".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Paymentapplication.class);
    } else if ("com.cloderia.helion.client.shared.model.Payment".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Payment.class);
    } else if ("com.cloderia.helion.client.shared.ops.InvoicetermOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InvoicetermOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Containertype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Containertype.class);
    } else if ("com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_GeneralledgeraccountOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.DocumentOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_DocumentOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Accountingtransactiondetail".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Accountingtransactiondetail.class);
    } else if ("com.cloderia.helion.client.shared.ops.PaymentmethodtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PaymentmethodtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.AccountingtransactiondetailOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AccountingtransactiondetailOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.UomconversionOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_UomconversionOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_OrganizationgeneralledgeraccountOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.ContainerOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ContainerOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Inventoryitemtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Inventoryitemtype.class);
    } else if ("com.cloderia.helion.client.shared.model.Financialaccounttransaction".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccounttransaction.class);
    } else if ("com.cloderia.helion.client.shared.model.Periodtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Periodtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_OrganizationglaccountbalanceOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Producttype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Producttype.class);
    } else if ("com.cloderia.helion.client.shared.model.Partyrelationshipstatus".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Partyrelationshipstatus.class);
    } else if ("com.cloderia.helion.client.shared.ops.InvoiceOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Ratingtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Ratingtype.class);
    } else if ("com.cloderia.helion.client.shared.model.Contactmechanismpurposetype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Contactmechanismpurposetype.class);
    } else if ("com.cloderia.helion.client.shared.ops.DocumenttypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_DocumenttypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.FacilitytypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FacilitytypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.InvoiceitemOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceitemOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Productfeature".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Productfeature.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartyroletypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartyroletypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Agreementitemtype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Agreementitemtype.class);
    } else if ("com.cloderia.helion.client.shared.ops.InvoiceroletypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_InvoiceroletypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Partyrelationshiptype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Partyrelationshiptype.class);
    } else if ("com.cloderia.helion.client.shared.model.Container".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Container.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.SyncableDataSet".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_SyncableDataSet.class);
    } else if ("com.cloderia.helion.client.shared.ops.AgreementitemOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementitemOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Productfeaturetype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Productfeaturetype.class);
    } else if ("com.cloderia.helion.client.shared.model.Financialaccountroletype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccountroletype.class);
    } else if ("com.cloderia.helion.client.shared.model.Financialaccounttransactiontype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Financialaccounttransactiontype.class);
    } else if ("com.cloderia.helion.client.shared.ops.ProductcategorytypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ProductcategorytypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Invoiceterm".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceterm.class);
    } else if ("com.cloderia.helion.client.shared.ops.FinancialaccounttransactionOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccounttransactionOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Partyrole".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Partyrole.class);
    } else if ("com.cloderia.helion.client.shared.ops.SignUpOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_SignUpOperation.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.IdChangeResponse".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_IdChangeResponse.class);
    } else if ("com.cloderia.helion.client.shared.model.Geoboundrytype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Geoboundrytype.class);
    } else if ("org.jboss.errai.jpa.sync.client.shared.UpdateResponse".equals(a0)) {
      m = GWT.create(Marshaller_for_org_jboss_errai_jpa_sync_client_shared_UpdateResponse.class);
    } else if ("com.cloderia.helion.client.shared.model.Fixedassetdepreciationmethod".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Fixedassetdepreciationmethod.class);
    } else if ("com.cloderia.helion.client.shared.model.Paymenttype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Paymenttype.class);
    } else if ("com.cloderia.helion.client.shared.model.Agreementitem".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Agreementitem.class);
    } else if ("com.cloderia.helion.client.shared.ops.FinancialaccounttransactiontypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccounttransactiontypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Budgetstatus".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Budgetstatus.class);
    } else if ("com.cloderia.helion.client.shared.model.Supplierproduct".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Supplierproduct.class);
    } else if ("com.cloderia.helion.client.shared.ops.AgreementroletypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementroletypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.TerminationreasonOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_TerminationreasonOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.SupplierproductOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_SupplierproductOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Accountingperiod".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Accountingperiod.class);
    } else if ("com.cloderia.helion.client.shared.ops.BillingaccountOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_BillingaccountOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.AgreementroleOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_AgreementroleOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartyrelationshipOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartyrelationshipOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Terminationreason".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Terminationreason.class);
    } else if ("com.cloderia.helion.client.shared.model.Fixedassettype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Fixedassettype.class);
    } else if ("com.cloderia.helion.client.shared.ops.StandardtimeperiodOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_StandardtimeperiodOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Productcategory".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Productcategory.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartyrelationshipstatusOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartyrelationshipstatusOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Partycategory".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Partycategory.class);
    } else if ("com.cloderia.helion.client.shared.model.Systemuser".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Systemuser.class);
    } else if ("com.cloderia.helion.client.shared.model.Documenttype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Documenttype.class);
    } else if ("com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Organizationgeneralledgeraccount.class);
    } else if ("com.cloderia.helion.client.shared.ops.FinancialaccountroleOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_FinancialaccountroleOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.GeoboundrytypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_GeoboundrytypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Invoiceroletype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Invoiceroletype.class);
    } else if ("com.cloderia.helion.client.shared.ops.PeriodtypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PeriodtypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.model.Partyroletype".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Partyroletype.class);
    } else if ("com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_ProductfeaturetypeOperation.class);
    }
    return putIfNotNull(a0, m);
  }

  private boolean loadMarshaller2(String a0) {
    Marshaller m = null;
    if ("com.cloderia.helion.client.shared.model.Budgetitem".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_model_Budgetitem.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartyrelationshiptypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartyrelationshiptypeOperation.class);
    } else if ("com.cloderia.helion.client.shared.ops.PartytypeOperation".equals(a0)) {
      m = GWT.create(Marshaller_for_com_cloderia_helion_client_shared_ops_PartytypeOperation.class);
    }
    return putIfNotNull(a0, m);
  }

  public Marshaller getMarshaller(String a0) {
    if (a0 == null) {
      return null;
    }
    Marshaller m = marshallers.get(a0);
    if (m != null) {
      return m;
    } else if (loadMarshaller0(a0)) {
      return marshallers.get(a0);
    } else if (loadMarshaller1(a0)) {
      return marshallers.get(a0);
    } else if (loadMarshaller2(a0)) {
      return marshallers.get(a0);
    }
    return null;
  }

  public void registerMarshaller(String a0, Marshaller a1) {
    marshallers.put(a0, a1);
  }
}
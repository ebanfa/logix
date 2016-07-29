/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

import static com.cloderia.helion.client.shared.Operation.OperationType.CREATE;
import static com.cloderia.helion.client.shared.Operation.OperationType.UPDATE;
import static com.cloderia.helion.client.shared.Operation.OperationType.DELETE;

import java.util.List;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.enterprise.client.jaxrs.api.ResponseCallback;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.local.ui.BasePortalPage;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderDeleteView;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.cloderia.helion.client.local.ui.UIUtils;
import com.cloderia.helion.client.shared.Operation;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactionEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymentEndPoint;
import com.cloderia.helion.client.shared.model.Payment;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.endpoint.FixedassetEndPoint;
import com.cloderia.helion.client.shared.model.Fixedasset;
import com.cloderia.helion.client.shared.endpoint.PartyroleEndPoint;
import com.cloderia.helion.client.shared.model.Partyrole;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.AccountingtransactiontypeEndPoint;
import com.cloderia.helion.client.shared.model.Accountingtransactiontype;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-accountingtransaction-page.html#app-container")
public class BaseAccountingtransactionPage extends BasePortalPage {

	protected static final String VIEW_ACCOUNTINGTRANSACTION = "View Accountingtransaction";
	protected static final String CREATE_ACCOUNTINGTRANSACTION = "Create Accountingtransaction";
	protected static final String UPDATE_ACCOUNTINGTRANSACTION = "Update Accountingtransaction";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateAccountingtransactionPage> createAccountingtransactionPage;
	
	@Inject
	TransitionTo<EditAccountingtransactionPage> editAccountingtransactionPage;
	
	@Inject
	TransitionTo<ViewAccountingtransactionPage> viewAccountingtransactionPage;
	
	@Inject
	TransitionTo<ListAccountingtransactionPage> listAccountingtransactionsPage;
	
	@Inject
	protected Caller<AccountingtransactionEndPoint> accountingtransactionService;
	
	@DataField
	protected AnchorElement listAccountingtransactionsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<PaymentEndPoint> paymentService;
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<InvoiceEndPoint> invoiceService;
	@Inject
	protected Caller<FixedassetEndPoint> fixedassetService;
	@Inject
	protected Caller<PartyroleEndPoint> partyroleService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<AccountingtransactiontypeEndPoint> accountingtransactiontypeService;
		
	protected void loadPayments(AccountingtransactionEditor accountingtransactionEditor) {
		paymentService.call(new RemoteCallback<List<Payment>>() {
			@Override
			public void callback(List<Payment> entitiesList) {
				accountingtransactionEditor.loadPayments(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadFromPartys(AccountingtransactionEditor accountingtransactionEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				accountingtransactionEditor.loadFromPartys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadInvoices(AccountingtransactionEditor accountingtransactionEditor) {
		invoiceService.call(new RemoteCallback<List<Invoice>>() {
			@Override
			public void callback(List<Invoice> entitiesList) {
				accountingtransactionEditor.loadInvoices(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadFixedAssets(AccountingtransactionEditor accountingtransactionEditor) {
		fixedassetService.call(new RemoteCallback<List<Fixedasset>>() {
			@Override
			public void callback(List<Fixedasset> entitiesList) {
				accountingtransactionEditor.loadFixedAssets(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadPartyRoles(AccountingtransactionEditor accountingtransactionEditor) {
		partyroleService.call(new RemoteCallback<List<Partyrole>>() {
			@Override
			public void callback(List<Partyrole> entitiesList) {
				accountingtransactionEditor.loadPartyRoles(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(AccountingtransactionEditor accountingtransactionEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				accountingtransactionEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadTransactionTys(AccountingtransactionEditor accountingtransactionEditor) {
		accountingtransactiontypeService.call(new RemoteCallback<List<Accountingtransactiontype>>() {
			@Override
			public void callback(List<Accountingtransactiontype> entitiesList) {
				accountingtransactionEditor.loadTransactionTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listAccountingtransactionsPageLink")
	public void submit(ClickEvent e) { listAccountingtransactionsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param accountingtransactionOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) AccountingtransactionOperation accountingtransactionOperation) {
		viewAccountingtransactionPage.go(UIUtils.buildPageIdMap(accountingtransactionOperation.getAccountingtransaction().getId()));
	}

	/**
	 * @param accountingtransactionOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) AccountingtransactionOperation accountingtransactionOperation) {
		viewAccountingtransactionPage.go(UIUtils.buildPageIdMap(accountingtransactionOperation.getAccountingtransaction().getId()));
	}
	
	/**
	 * @param accountingtransactionOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) AccountingtransactionOperation accountingtransactionOperation) {
		listAccountingtransactionsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView AccountingtransactionDisplay component) {
		editAccountingtransactionPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView AccountingtransactionListItemDisplay component) {
		viewAccountingtransactionPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView AccountingtransactionListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView AccountingtransactionListItemDisplay component) {
		editAccountingtransactionPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity AccountingtransactionEditor editorComponent) {
		accountingtransactionService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getAccountingtransactionOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity AccountingtransactionEditor editorComponent) {
		accountingtransactionService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getAccountingtransactionOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity AccountingtransactionDisplay displayComponent) {
		accountingtransactionService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getAccountingtransactionOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity AccountingtransactionListItemDisplay displayComponent) {
		accountingtransactionService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getAccountingtransactionOps());
	}
}

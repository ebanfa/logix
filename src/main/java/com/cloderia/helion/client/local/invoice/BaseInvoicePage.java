/**
 * 
 */
package com.cloderia.helion.client.local.invoice;

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
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismEndPoint;
import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.BillingaccountEndPoint;
import com.cloderia.helion.client.shared.model.Billingaccount;
import com.cloderia.helion.client.shared.ops.InvoiceOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-invoice-page.html#app-container")
public class BaseInvoicePage extends BasePortalPage {

	protected static final String VIEW_INVOICE = "View Invoice";
	protected static final String CREATE_INVOICE = "Create Invoice";
	protected static final String UPDATE_INVOICE = "Update Invoice";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateInvoicePage> createInvoicePage;
	
	@Inject
	TransitionTo<EditInvoicePage> editInvoicePage;
	
	@Inject
	TransitionTo<ViewInvoicePage> viewInvoicePage;
	
	@Inject
	TransitionTo<ListInvoicePage> listInvoicesPage;
	
	@Inject
	protected Caller<InvoiceEndPoint> invoiceService;
	
	@DataField
	protected AnchorElement listInvoicesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<ContactmechanismEndPoint> contactmechanismService;
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<BillingaccountEndPoint> billingaccountService;
		
	protected void loadFromContMechs(InvoiceEditor invoiceEditor) {
		contactmechanismService.call(new RemoteCallback<List<Contactmechanism>>() {
			@Override
			public void callback(List<Contactmechanism> entitiesList) {
				invoiceEditor.loadFromContMechs(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadToPartys(InvoiceEditor invoiceEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				invoiceEditor.loadToPartys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(InvoiceEditor invoiceEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				invoiceEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadBillingAccts(InvoiceEditor invoiceEditor) {
		billingaccountService.call(new RemoteCallback<List<Billingaccount>>() {
			@Override
			public void callback(List<Billingaccount> entitiesList) {
				invoiceEditor.loadBillingAccts(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listInvoicesPageLink")
	public void submit(ClickEvent e) { listInvoicesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param invoiceOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) InvoiceOperation invoiceOperation) {
		viewInvoicePage.go(UIUtils.buildPageIdMap(invoiceOperation.getInvoice().getId()));
	}

	/**
	 * @param invoiceOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) InvoiceOperation invoiceOperation) {
		viewInvoicePage.go(UIUtils.buildPageIdMap(invoiceOperation.getInvoice().getId()));
	}
	
	/**
	 * @param invoiceOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) InvoiceOperation invoiceOperation) {
		listInvoicesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView InvoiceDisplay component) {
		editInvoicePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView InvoiceListItemDisplay component) {
		viewInvoicePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView InvoiceListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView InvoiceListItemDisplay component) {
		editInvoicePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity InvoiceEditor editorComponent) {
		invoiceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getInvoiceOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity InvoiceEditor editorComponent) {
		invoiceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getInvoiceOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity InvoiceDisplay displayComponent) {
		invoiceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInvoiceOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity InvoiceListItemDisplay displayComponent) {
		invoiceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInvoiceOps());
	}
}

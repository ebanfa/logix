/**
 * 
 */
package com.cloderia.helion.client.local.invoiceterm;

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
import com.cloderia.helion.client.shared.endpoint.InvoicetermEndPoint;
import com.cloderia.helion.client.shared.endpoint.TermtypeEndPoint;
import com.cloderia.helion.client.shared.model.Termtype;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemEndPoint;
import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.InvoicetermOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-invoiceterm-page.html#app-container")
public class BaseInvoicetermPage extends BasePortalPage {

	protected static final String VIEW_INVOICETERM = "View Invoiceterm";
	protected static final String CREATE_INVOICETERM = "Create Invoiceterm";
	protected static final String UPDATE_INVOICETERM = "Update Invoiceterm";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateInvoicetermPage> createInvoicetermPage;
	
	@Inject
	TransitionTo<EditInvoicetermPage> editInvoicetermPage;
	
	@Inject
	TransitionTo<ViewInvoicetermPage> viewInvoicetermPage;
	
	@Inject
	TransitionTo<ListInvoicetermPage> listInvoicetermsPage;
	
	@Inject
	protected Caller<InvoicetermEndPoint> invoicetermService;
	
	@DataField
	protected AnchorElement listInvoicetermsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<TermtypeEndPoint> termtypeService;
	@Inject
	protected Caller<InvoiceitemEndPoint> invoiceitemService;
	@Inject
	protected Caller<InvoiceEndPoint> invoiceService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadTermTys(InvoicetermEditor invoicetermEditor) {
		termtypeService.call(new RemoteCallback<List<Termtype>>() {
			@Override
			public void callback(List<Termtype> entitiesList) {
				invoicetermEditor.loadTermTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadInvoiceItems(InvoicetermEditor invoicetermEditor) {
		invoiceitemService.call(new RemoteCallback<List<Invoiceitem>>() {
			@Override
			public void callback(List<Invoiceitem> entitiesList) {
				invoicetermEditor.loadInvoiceItems(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadInvoices(InvoicetermEditor invoicetermEditor) {
		invoiceService.call(new RemoteCallback<List<Invoice>>() {
			@Override
			public void callback(List<Invoice> entitiesList) {
				invoicetermEditor.loadInvoices(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(InvoicetermEditor invoicetermEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				invoicetermEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listInvoicetermsPageLink")
	public void submit(ClickEvent e) { listInvoicetermsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param invoicetermOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) InvoicetermOperation invoicetermOperation) {
		viewInvoicetermPage.go(UIUtils.buildPageIdMap(invoicetermOperation.getInvoiceterm().getId()));
	}

	/**
	 * @param invoicetermOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) InvoicetermOperation invoicetermOperation) {
		viewInvoicetermPage.go(UIUtils.buildPageIdMap(invoicetermOperation.getInvoiceterm().getId()));
	}
	
	/**
	 * @param invoicetermOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) InvoicetermOperation invoicetermOperation) {
		listInvoicetermsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView InvoicetermDisplay component) {
		editInvoicetermPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView InvoicetermListItemDisplay component) {
		viewInvoicetermPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView InvoicetermListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView InvoicetermListItemDisplay component) {
		editInvoicetermPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity InvoicetermEditor editorComponent) {
		invoicetermService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getInvoicetermOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity InvoicetermEditor editorComponent) {
		invoicetermService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getInvoicetermOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity InvoicetermDisplay displayComponent) {
		invoicetermService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInvoicetermOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity InvoicetermListItemDisplay displayComponent) {
		invoicetermService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInvoicetermOps());
	}
}

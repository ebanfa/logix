/**
 * 
 */
package com.cloderia.helion.client.local.invoiceitem;

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
import com.cloderia.helion.client.shared.endpoint.InvoiceitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemtypeEndPoint;
import com.cloderia.helion.client.shared.model.Invoiceitemtype;
import com.cloderia.helion.client.shared.endpoint.ProductfeatureEndPoint;
import com.cloderia.helion.client.shared.model.Productfeature;
import com.cloderia.helion.client.shared.endpoint.InvoiceitemEndPoint;
import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.cloderia.helion.client.shared.endpoint.InvoiceEndPoint;
import com.cloderia.helion.client.shared.model.Invoice;
import com.cloderia.helion.client.shared.endpoint.InventoryitemEndPoint;
import com.cloderia.helion.client.shared.model.Inventoryitem;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-invoiceitem-page.html#app-container")
public class BaseInvoiceitemPage extends BasePortalPage {

	protected static final String VIEW_INVOICEITEM = "View Invoiceitem";
	protected static final String CREATE_INVOICEITEM = "Create Invoiceitem";
	protected static final String UPDATE_INVOICEITEM = "Update Invoiceitem";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateInvoiceitemPage> createInvoiceitemPage;
	
	@Inject
	TransitionTo<EditInvoiceitemPage> editInvoiceitemPage;
	
	@Inject
	TransitionTo<ViewInvoiceitemPage> viewInvoiceitemPage;
	
	@Inject
	TransitionTo<ListInvoiceitemPage> listInvoiceitemsPage;
	
	@Inject
	protected Caller<InvoiceitemEndPoint> invoiceitemService;
	
	@DataField
	protected AnchorElement listInvoiceitemsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<InvoiceitemtypeEndPoint> invoiceitemtypeService;
	@Inject
	protected Caller<ProductfeatureEndPoint> productfeatureService;
	@Inject
	protected Caller<InvoiceEndPoint> invoiceService;
	@Inject
	protected Caller<InventoryitemEndPoint> inventoryitemService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<ProductEndPoint> productService;
		
	protected void loadItemTys(InvoiceitemEditor invoiceitemEditor) {
		invoiceitemtypeService.call(new RemoteCallback<List<Invoiceitemtype>>() {
			@Override
			public void callback(List<Invoiceitemtype> entitiesList) {
				invoiceitemEditor.loadItemTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProdFeats(InvoiceitemEditor invoiceitemEditor) {
		productfeatureService.call(new RemoteCallback<List<Productfeature>>() {
			@Override
			public void callback(List<Productfeature> entitiesList) {
				invoiceitemEditor.loadProdFeats(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadSoldWithItems(InvoiceitemEditor invoiceitemEditor) {
		invoiceitemService.call(new RemoteCallback<List<Invoiceitem>>() {
			@Override
			public void callback(List<Invoiceitem> entitiesList) {
				invoiceitemEditor.loadSoldWithItems(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadInvoices(InvoiceitemEditor invoiceitemEditor) {
		invoiceService.call(new RemoteCallback<List<Invoice>>() {
			@Override
			public void callback(List<Invoice> entitiesList) {
				invoiceitemEditor.loadInvoices(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadInventoryItems(InvoiceitemEditor invoiceitemEditor) {
		inventoryitemService.call(new RemoteCallback<List<Inventoryitem>>() {
			@Override
			public void callback(List<Inventoryitem> entitiesList) {
				invoiceitemEditor.loadInventoryItems(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(InvoiceitemEditor invoiceitemEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				invoiceitemEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProds(InvoiceitemEditor invoiceitemEditor) {
		productService.call(new RemoteCallback<List<Product>>() {
			@Override
			public void callback(List<Product> entitiesList) {
				invoiceitemEditor.loadProds(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listInvoiceitemsPageLink")
	public void submit(ClickEvent e) { listInvoiceitemsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param invoiceitemOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) InvoiceitemOperation invoiceitemOperation) {
		viewInvoiceitemPage.go(UIUtils.buildPageIdMap(invoiceitemOperation.getInvoiceitem().getId()));
	}

	/**
	 * @param invoiceitemOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) InvoiceitemOperation invoiceitemOperation) {
		viewInvoiceitemPage.go(UIUtils.buildPageIdMap(invoiceitemOperation.getInvoiceitem().getId()));
	}
	
	/**
	 * @param invoiceitemOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) InvoiceitemOperation invoiceitemOperation) {
		listInvoiceitemsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView InvoiceitemDisplay component) {
		editInvoiceitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView InvoiceitemListItemDisplay component) {
		viewInvoiceitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView InvoiceitemListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView InvoiceitemListItemDisplay component) {
		editInvoiceitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity InvoiceitemEditor editorComponent) {
		invoiceitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getInvoiceitemOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity InvoiceitemEditor editorComponent) {
		invoiceitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getInvoiceitemOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity InvoiceitemDisplay displayComponent) {
		invoiceitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInvoiceitemOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity InvoiceitemListItemDisplay displayComponent) {
		invoiceitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInvoiceitemOps());
	}
}

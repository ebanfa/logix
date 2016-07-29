/**
 * 
 */
package com.cloderia.helion.client.local.inventoryitem;

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
import com.cloderia.helion.client.shared.endpoint.InventoryitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.LotEndPoint;
import com.cloderia.helion.client.shared.model.Lot;
import com.cloderia.helion.client.shared.endpoint.ContainerEndPoint;
import com.cloderia.helion.client.shared.model.Container;
import com.cloderia.helion.client.shared.endpoint.InventoryitemstatusEndPoint;
import com.cloderia.helion.client.shared.model.Inventoryitemstatus;
import com.cloderia.helion.client.shared.endpoint.InventoryitemtypeEndPoint;
import com.cloderia.helion.client.shared.model.Inventoryitemtype;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.endpoint.FacilityEndPoint;
import com.cloderia.helion.client.shared.model.Facility;
import com.cloderia.helion.client.shared.ops.InventoryitemOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-inventoryitem-page.html#app-container")
public class BaseInventoryitemPage extends BasePortalPage {

	protected static final String VIEW_INVENTORYITEM = "View Inventoryitem";
	protected static final String CREATE_INVENTORYITEM = "Create Inventoryitem";
	protected static final String UPDATE_INVENTORYITEM = "Update Inventoryitem";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateInventoryitemPage> createInventoryitemPage;
	
	@Inject
	TransitionTo<EditInventoryitemPage> editInventoryitemPage;
	
	@Inject
	TransitionTo<ViewInventoryitemPage> viewInventoryitemPage;
	
	@Inject
	TransitionTo<ListInventoryitemPage> listInventoryitemsPage;
	
	@Inject
	protected Caller<InventoryitemEndPoint> inventoryitemService;
	
	@DataField
	protected AnchorElement listInventoryitemsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<LotEndPoint> lotService;
	@Inject
	protected Caller<ContainerEndPoint> containerService;
	@Inject
	protected Caller<InventoryitemstatusEndPoint> inventoryitemstatusService;
	@Inject
	protected Caller<InventoryitemtypeEndPoint> inventoryitemtypeService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<ProductEndPoint> productService;
	@Inject
	protected Caller<FacilityEndPoint> facilityService;
		
	protected void loadLots(InventoryitemEditor inventoryitemEditor) {
		lotService.call(new RemoteCallback<List<Lot>>() {
			@Override
			public void callback(List<Lot> entitiesList) {
				inventoryitemEditor.loadLots(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadContainers(InventoryitemEditor inventoryitemEditor) {
		containerService.call(new RemoteCallback<List<Container>>() {
			@Override
			public void callback(List<Container> entitiesList) {
				inventoryitemEditor.loadContainers(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadStatuss(InventoryitemEditor inventoryitemEditor) {
		inventoryitemstatusService.call(new RemoteCallback<List<Inventoryitemstatus>>() {
			@Override
			public void callback(List<Inventoryitemstatus> entitiesList) {
				inventoryitemEditor.loadStatuss(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadItemTys(InventoryitemEditor inventoryitemEditor) {
		inventoryitemtypeService.call(new RemoteCallback<List<Inventoryitemtype>>() {
			@Override
			public void callback(List<Inventoryitemtype> entitiesList) {
				inventoryitemEditor.loadItemTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(InventoryitemEditor inventoryitemEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				inventoryitemEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProds(InventoryitemEditor inventoryitemEditor) {
		productService.call(new RemoteCallback<List<Product>>() {
			@Override
			public void callback(List<Product> entitiesList) {
				inventoryitemEditor.loadProds(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadFacilitys(InventoryitemEditor inventoryitemEditor) {
		facilityService.call(new RemoteCallback<List<Facility>>() {
			@Override
			public void callback(List<Facility> entitiesList) {
				inventoryitemEditor.loadFacilitys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listInventoryitemsPageLink")
	public void submit(ClickEvent e) { listInventoryitemsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param inventoryitemOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) InventoryitemOperation inventoryitemOperation) {
		viewInventoryitemPage.go(UIUtils.buildPageIdMap(inventoryitemOperation.getInventoryitem().getId()));
	}

	/**
	 * @param inventoryitemOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) InventoryitemOperation inventoryitemOperation) {
		viewInventoryitemPage.go(UIUtils.buildPageIdMap(inventoryitemOperation.getInventoryitem().getId()));
	}
	
	/**
	 * @param inventoryitemOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) InventoryitemOperation inventoryitemOperation) {
		listInventoryitemsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView InventoryitemDisplay component) {
		editInventoryitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView InventoryitemListItemDisplay component) {
		viewInventoryitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView InventoryitemListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView InventoryitemListItemDisplay component) {
		editInventoryitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity InventoryitemEditor editorComponent) {
		inventoryitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getInventoryitemOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity InventoryitemEditor editorComponent) {
		inventoryitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getInventoryitemOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity InventoryitemDisplay displayComponent) {
		inventoryitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInventoryitemOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity InventoryitemListItemDisplay displayComponent) {
		inventoryitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getInventoryitemOps());
	}
}

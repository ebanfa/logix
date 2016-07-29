/**
 * 
 */
package com.cloderia.helion.client.local.product;

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
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.endpoint.UomEndPoint;
import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.ProducttypeEndPoint;
import com.cloderia.helion.client.shared.model.Producttype;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.ProductOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-product-page.html#app-container")
public class BaseProductPage extends BasePortalPage {

	protected static final String VIEW_PRODUCT = "View Product";
	protected static final String CREATE_PRODUCT = "Create Product";
	protected static final String UPDATE_PRODUCT = "Update Product";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateProductPage> createProductPage;
	
	@Inject
	TransitionTo<EditProductPage> editProductPage;
	
	@Inject
	TransitionTo<ViewProductPage> viewProductPage;
	
	@Inject
	TransitionTo<ListProductPage> listProductsPage;
	
	@Inject
	protected Caller<ProductEndPoint> productService;
	
	@DataField
	protected AnchorElement listProductsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UomEndPoint> uomService;
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<ProducttypeEndPoint> producttypeService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadUoms(ProductEditor productEditor) {
		uomService.call(new RemoteCallback<List<Uom>>() {
			@Override
			public void callback(List<Uom> entitiesList) {
				productEditor.loadUoms(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadManufacturers(ProductEditor productEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				productEditor.loadManufacturers(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProdTys(ProductEditor productEditor) {
		producttypeService.call(new RemoteCallback<List<Producttype>>() {
			@Override
			public void callback(List<Producttype> entitiesList) {
				productEditor.loadProdTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(ProductEditor productEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				productEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listProductsPageLink")
	public void submit(ClickEvent e) { listProductsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param productOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) ProductOperation productOperation) {
		viewProductPage.go(UIUtils.buildPageIdMap(productOperation.getProduct().getId()));
	}

	/**
	 * @param productOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) ProductOperation productOperation) {
		viewProductPage.go(UIUtils.buildPageIdMap(productOperation.getProduct().getId()));
	}
	
	/**
	 * @param productOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) ProductOperation productOperation) {
		listProductsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView ProductDisplay component) {
		editProductPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView ProductListItemDisplay component) {
		viewProductPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView ProductListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView ProductListItemDisplay component) {
		editProductPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity ProductEditor editorComponent) {
		productService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getProductOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity ProductEditor editorComponent) {
		productService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getProductOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity ProductDisplay displayComponent) {
		productService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity ProductListItemDisplay displayComponent) {
		productService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductOps());
	}
}

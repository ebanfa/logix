/**
 * 
 */
package com.cloderia.helion.client.local.productfeature;

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
import com.cloderia.helion.client.shared.endpoint.ProductfeatureEndPoint;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturecategoryEndPoint;
import com.cloderia.helion.client.shared.model.Productfeaturecategory;
import com.cloderia.helion.client.shared.endpoint.UomEndPoint;
import com.cloderia.helion.client.shared.model.Uom;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.ProductfeaturetypeEndPoint;
import com.cloderia.helion.client.shared.model.Productfeaturetype;
import com.cloderia.helion.client.shared.ops.ProductfeatureOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-productfeature-page.html#app-container")
public class BaseProductfeaturePage extends BasePortalPage {

	protected static final String VIEW_PRODUCTFEATURE = "View Productfeature";
	protected static final String CREATE_PRODUCTFEATURE = "Create Productfeature";
	protected static final String UPDATE_PRODUCTFEATURE = "Update Productfeature";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateProductfeaturePage> createProductfeaturePage;
	
	@Inject
	TransitionTo<EditProductfeaturePage> editProductfeaturePage;
	
	@Inject
	TransitionTo<ViewProductfeaturePage> viewProductfeaturePage;
	
	@Inject
	TransitionTo<ListProductfeaturePage> listProductfeaturesPage;
	
	@Inject
	protected Caller<ProductfeatureEndPoint> productfeatureService;
	
	@DataField
	protected AnchorElement listProductfeaturesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<ProductfeaturecategoryEndPoint> productfeaturecategoryService;
	@Inject
	protected Caller<UomEndPoint> uomService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<ProductfeaturetypeEndPoint> productfeaturetypeService;
		
	protected void loadProdFeatCats(ProductfeatureEditor productfeatureEditor) {
		productfeaturecategoryService.call(new RemoteCallback<List<Productfeaturecategory>>() {
			@Override
			public void callback(List<Productfeaturecategory> entitiesList) {
				productfeatureEditor.loadProdFeatCats(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUoms(ProductfeatureEditor productfeatureEditor) {
		uomService.call(new RemoteCallback<List<Uom>>() {
			@Override
			public void callback(List<Uom> entitiesList) {
				productfeatureEditor.loadUoms(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(ProductfeatureEditor productfeatureEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				productfeatureEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProdFeatTys(ProductfeatureEditor productfeatureEditor) {
		productfeaturetypeService.call(new RemoteCallback<List<Productfeaturetype>>() {
			@Override
			public void callback(List<Productfeaturetype> entitiesList) {
				productfeatureEditor.loadProdFeatTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listProductfeaturesPageLink")
	public void submit(ClickEvent e) { listProductfeaturesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param productfeatureOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) ProductfeatureOperation productfeatureOperation) {
		viewProductfeaturePage.go(UIUtils.buildPageIdMap(productfeatureOperation.getProductfeature().getId()));
	}

	/**
	 * @param productfeatureOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) ProductfeatureOperation productfeatureOperation) {
		viewProductfeaturePage.go(UIUtils.buildPageIdMap(productfeatureOperation.getProductfeature().getId()));
	}
	
	/**
	 * @param productfeatureOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) ProductfeatureOperation productfeatureOperation) {
		listProductfeaturesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView ProductfeatureDisplay component) {
		editProductfeaturePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView ProductfeatureListItemDisplay component) {
		viewProductfeaturePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView ProductfeatureListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView ProductfeatureListItemDisplay component) {
		editProductfeaturePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity ProductfeatureEditor editorComponent) {
		productfeatureService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getProductfeatureOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity ProductfeatureEditor editorComponent) {
		productfeatureService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getProductfeatureOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity ProductfeatureDisplay displayComponent) {
		productfeatureService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductfeatureOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity ProductfeatureListItemDisplay displayComponent) {
		productfeatureService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductfeatureOps());
	}
}

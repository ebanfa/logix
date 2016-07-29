/**
 * 
 */
package com.cloderia.helion.client.local.productcategory;

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
import com.cloderia.helion.client.shared.endpoint.ProductcategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.ProductcategorytypeEndPoint;
import com.cloderia.helion.client.shared.model.Productcategorytype;
import com.cloderia.helion.client.shared.ops.ProductcategoryOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-productcategory-page.html#app-container")
public class BaseProductcategoryPage extends BasePortalPage {

	protected static final String VIEW_PRODUCTCATEGORY = "View Productcategory";
	protected static final String CREATE_PRODUCTCATEGORY = "Create Productcategory";
	protected static final String UPDATE_PRODUCTCATEGORY = "Update Productcategory";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateProductcategoryPage> createProductcategoryPage;
	
	@Inject
	TransitionTo<EditProductcategoryPage> editProductcategoryPage;
	
	@Inject
	TransitionTo<ViewProductcategoryPage> viewProductcategoryPage;
	
	@Inject
	TransitionTo<ListProductcategoryPage> listProductcategorysPage;
	
	@Inject
	protected Caller<ProductcategoryEndPoint> productcategoryService;
	
	@DataField
	protected AnchorElement listProductcategorysPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<ProductcategorytypeEndPoint> productcategorytypeService;
		
	protected void loadUniverses(ProductcategoryEditor productcategoryEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				productcategoryEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProdCatTys(ProductcategoryEditor productcategoryEditor) {
		productcategorytypeService.call(new RemoteCallback<List<Productcategorytype>>() {
			@Override
			public void callback(List<Productcategorytype> entitiesList) {
				productcategoryEditor.loadProdCatTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listProductcategorysPageLink")
	public void submit(ClickEvent e) { listProductcategorysPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param productcategoryOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) ProductcategoryOperation productcategoryOperation) {
		viewProductcategoryPage.go(UIUtils.buildPageIdMap(productcategoryOperation.getProductcategory().getId()));
	}

	/**
	 * @param productcategoryOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) ProductcategoryOperation productcategoryOperation) {
		viewProductcategoryPage.go(UIUtils.buildPageIdMap(productcategoryOperation.getProductcategory().getId()));
	}
	
	/**
	 * @param productcategoryOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) ProductcategoryOperation productcategoryOperation) {
		listProductcategorysPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView ProductcategoryDisplay component) {
		editProductcategoryPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView ProductcategoryListItemDisplay component) {
		viewProductcategoryPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView ProductcategoryListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView ProductcategoryListItemDisplay component) {
		editProductcategoryPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity ProductcategoryEditor editorComponent) {
		productcategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getProductcategoryOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity ProductcategoryEditor editorComponent) {
		productcategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getProductcategoryOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity ProductcategoryDisplay displayComponent) {
		productcategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductcategoryOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity ProductcategoryListItemDisplay displayComponent) {
		productcategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductcategoryOps());
	}
}

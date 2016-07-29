/**
 * 
 */
package com.cloderia.helion.client.local.producttype;

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
import com.cloderia.helion.client.shared.endpoint.ProducttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.ProducttypeOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-producttype-page.html#app-container")
public class BaseProducttypePage extends BasePortalPage {

	protected static final String VIEW_PRODUCTTYPE = "View Producttype";
	protected static final String CREATE_PRODUCTTYPE = "Create Producttype";
	protected static final String UPDATE_PRODUCTTYPE = "Update Producttype";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateProducttypePage> createProducttypePage;
	
	@Inject
	TransitionTo<EditProducttypePage> editProducttypePage;
	
	@Inject
	TransitionTo<ViewProducttypePage> viewProducttypePage;
	
	@Inject
	TransitionTo<ListProducttypePage> listProducttypesPage;
	
	@Inject
	protected Caller<ProducttypeEndPoint> producttypeService;
	
	@DataField
	protected AnchorElement listProducttypesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadUniverses(ProducttypeEditor producttypeEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				producttypeEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listProducttypesPageLink")
	public void submit(ClickEvent e) { listProducttypesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param producttypeOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) ProducttypeOperation producttypeOperation) {
		viewProducttypePage.go(UIUtils.buildPageIdMap(producttypeOperation.getProducttype().getId()));
	}

	/**
	 * @param producttypeOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) ProducttypeOperation producttypeOperation) {
		viewProducttypePage.go(UIUtils.buildPageIdMap(producttypeOperation.getProducttype().getId()));
	}
	
	/**
	 * @param producttypeOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) ProducttypeOperation producttypeOperation) {
		listProducttypesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView ProducttypeDisplay component) {
		editProducttypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView ProducttypeListItemDisplay component) {
		viewProducttypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView ProducttypeListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView ProducttypeListItemDisplay component) {
		editProducttypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity ProducttypeEditor editorComponent) {
		producttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getProducttypeOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity ProducttypeEditor editorComponent) {
		producttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getProducttypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity ProducttypeDisplay displayComponent) {
		producttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProducttypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity ProducttypeListItemDisplay displayComponent) {
		producttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProducttypeOps());
	}
}

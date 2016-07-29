/**
 * 
 */
package com.cloderia.helion.client.local.supplierproduct;

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
import com.cloderia.helion.client.shared.endpoint.SupplierproductEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.RatingtypeEndPoint;
import com.cloderia.helion.client.shared.model.Ratingtype;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.endpoint.PreferencetypeEndPoint;
import com.cloderia.helion.client.shared.model.Preferencetype;
import com.cloderia.helion.client.shared.ops.SupplierproductOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-supplierproduct-page.html#app-container")
public class BaseSupplierproductPage extends BasePortalPage {

	protected static final String VIEW_SUPPLIERPRODUCT = "View Supplierproduct";
	protected static final String CREATE_SUPPLIERPRODUCT = "Create Supplierproduct";
	protected static final String UPDATE_SUPPLIERPRODUCT = "Update Supplierproduct";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateSupplierproductPage> createSupplierproductPage;
	
	@Inject
	TransitionTo<EditSupplierproductPage> editSupplierproductPage;
	
	@Inject
	TransitionTo<ViewSupplierproductPage> viewSupplierproductPage;
	
	@Inject
	TransitionTo<ListSupplierproductPage> listSupplierproductsPage;
	
	@Inject
	protected Caller<SupplierproductEndPoint> supplierproductService;
	
	@DataField
	protected AnchorElement listSupplierproductsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<RatingtypeEndPoint> ratingtypeService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<ProductEndPoint> productService;
	@Inject
	protected Caller<PreferencetypeEndPoint> preferencetypeService;
		
	protected void loadSuppliers(SupplierproductEditor supplierproductEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				supplierproductEditor.loadSuppliers(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadRatings(SupplierproductEditor supplierproductEditor) {
		ratingtypeService.call(new RemoteCallback<List<Ratingtype>>() {
			@Override
			public void callback(List<Ratingtype> entitiesList) {
				supplierproductEditor.loadRatings(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(SupplierproductEditor supplierproductEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				supplierproductEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProds(SupplierproductEditor supplierproductEditor) {
		productService.call(new RemoteCallback<List<Product>>() {
			@Override
			public void callback(List<Product> entitiesList) {
				supplierproductEditor.loadProds(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadPrefs(SupplierproductEditor supplierproductEditor) {
		preferencetypeService.call(new RemoteCallback<List<Preferencetype>>() {
			@Override
			public void callback(List<Preferencetype> entitiesList) {
				supplierproductEditor.loadPrefs(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listSupplierproductsPageLink")
	public void submit(ClickEvent e) { listSupplierproductsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param supplierproductOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) SupplierproductOperation supplierproductOperation) {
		viewSupplierproductPage.go(UIUtils.buildPageIdMap(supplierproductOperation.getSupplierproduct().getId()));
	}

	/**
	 * @param supplierproductOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) SupplierproductOperation supplierproductOperation) {
		viewSupplierproductPage.go(UIUtils.buildPageIdMap(supplierproductOperation.getSupplierproduct().getId()));
	}
	
	/**
	 * @param supplierproductOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) SupplierproductOperation supplierproductOperation) {
		listSupplierproductsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView SupplierproductDisplay component) {
		editSupplierproductPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView SupplierproductListItemDisplay component) {
		viewSupplierproductPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView SupplierproductListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView SupplierproductListItemDisplay component) {
		editSupplierproductPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity SupplierproductEditor editorComponent) {
		supplierproductService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getSupplierproductOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity SupplierproductEditor editorComponent) {
		supplierproductService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getSupplierproductOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity SupplierproductDisplay displayComponent) {
		supplierproductService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getSupplierproductOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity SupplierproductListItemDisplay displayComponent) {
		supplierproductService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getSupplierproductOps());
	}
}

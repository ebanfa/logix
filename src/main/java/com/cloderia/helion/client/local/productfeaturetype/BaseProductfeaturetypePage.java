/**
 * 
 */
package com.cloderia.helion.client.local.productfeaturetype;

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
import com.cloderia.helion.client.shared.endpoint.ProductfeaturetypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.ProductfeaturetypeOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-productfeaturetype-page.html#app-container")
public class BaseProductfeaturetypePage extends BasePortalPage {

	protected static final String VIEW_PRODUCTFEATURETYPE = "View Productfeaturetype";
	protected static final String CREATE_PRODUCTFEATURETYPE = "Create Productfeaturetype";
	protected static final String UPDATE_PRODUCTFEATURETYPE = "Update Productfeaturetype";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateProductfeaturetypePage> createProductfeaturetypePage;
	
	@Inject
	TransitionTo<EditProductfeaturetypePage> editProductfeaturetypePage;
	
	@Inject
	TransitionTo<ViewProductfeaturetypePage> viewProductfeaturetypePage;
	
	@Inject
	TransitionTo<ListProductfeaturetypePage> listProductfeaturetypesPage;
	
	@Inject
	protected Caller<ProductfeaturetypeEndPoint> productfeaturetypeService;
	
	@DataField
	protected AnchorElement listProductfeaturetypesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadUniverses(ProductfeaturetypeEditor productfeaturetypeEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				productfeaturetypeEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listProductfeaturetypesPageLink")
	public void submit(ClickEvent e) { listProductfeaturetypesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param productfeaturetypeOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) ProductfeaturetypeOperation productfeaturetypeOperation) {
		viewProductfeaturetypePage.go(UIUtils.buildPageIdMap(productfeaturetypeOperation.getProductfeaturetype().getId()));
	}

	/**
	 * @param productfeaturetypeOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) ProductfeaturetypeOperation productfeaturetypeOperation) {
		viewProductfeaturetypePage.go(UIUtils.buildPageIdMap(productfeaturetypeOperation.getProductfeaturetype().getId()));
	}
	
	/**
	 * @param productfeaturetypeOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) ProductfeaturetypeOperation productfeaturetypeOperation) {
		listProductfeaturetypesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView ProductfeaturetypeDisplay component) {
		editProductfeaturetypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView ProductfeaturetypeListItemDisplay component) {
		viewProductfeaturetypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView ProductfeaturetypeListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView ProductfeaturetypeListItemDisplay component) {
		editProductfeaturetypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity ProductfeaturetypeEditor editorComponent) {
		productfeaturetypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getProductfeaturetypeOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity ProductfeaturetypeEditor editorComponent) {
		productfeaturetypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getProductfeaturetypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity ProductfeaturetypeDisplay displayComponent) {
		productfeaturetypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductfeaturetypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity ProductfeaturetypeListItemDisplay displayComponent) {
		productfeaturetypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getProductfeaturetypeOps());
	}
}

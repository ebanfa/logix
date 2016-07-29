/**
 * 
 */
package com.cloderia.helion.client.local.facility;

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
import com.cloderia.helion.client.shared.endpoint.FacilityEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.FacilitytypeEndPoint;
import com.cloderia.helion.client.shared.model.Facilitytype;
import com.cloderia.helion.client.shared.ops.FacilityOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-facility-page.html#app-container")
public class BaseFacilityPage extends BasePortalPage {

	protected static final String VIEW_FACILITY = "View Facility";
	protected static final String CREATE_FACILITY = "Create Facility";
	protected static final String UPDATE_FACILITY = "Update Facility";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateFacilityPage> createFacilityPage;
	
	@Inject
	TransitionTo<EditFacilityPage> editFacilityPage;
	
	@Inject
	TransitionTo<ViewFacilityPage> viewFacilityPage;
	
	@Inject
	TransitionTo<ListFacilityPage> listFacilitysPage;
	
	@Inject
	protected Caller<FacilityEndPoint> facilityService;
	
	@DataField
	protected AnchorElement listFacilitysPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<FacilitytypeEndPoint> facilitytypeService;
		
	protected void loadUniverses(FacilityEditor facilityEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				facilityEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadFacilityTys(FacilityEditor facilityEditor) {
		facilitytypeService.call(new RemoteCallback<List<Facilitytype>>() {
			@Override
			public void callback(List<Facilitytype> entitiesList) {
				facilityEditor.loadFacilityTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listFacilitysPageLink")
	public void submit(ClickEvent e) { listFacilitysPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param facilityOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) FacilityOperation facilityOperation) {
		viewFacilityPage.go(UIUtils.buildPageIdMap(facilityOperation.getFacility().getId()));
	}

	/**
	 * @param facilityOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) FacilityOperation facilityOperation) {
		viewFacilityPage.go(UIUtils.buildPageIdMap(facilityOperation.getFacility().getId()));
	}
	
	/**
	 * @param facilityOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) FacilityOperation facilityOperation) {
		listFacilitysPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView FacilityDisplay component) {
		editFacilityPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView FacilityListItemDisplay component) {
		viewFacilityPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView FacilityListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView FacilityListItemDisplay component) {
		editFacilityPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity FacilityEditor editorComponent) {
		facilityService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getFacilityOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity FacilityEditor editorComponent) {
		facilityService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getFacilityOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity FacilityDisplay displayComponent) {
		facilityService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getFacilityOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity FacilityListItemDisplay displayComponent) {
		facilityService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getFacilityOps());
	}
}

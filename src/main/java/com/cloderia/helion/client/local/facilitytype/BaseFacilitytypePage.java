/**
 * 
 */
package com.cloderia.helion.client.local.facilitytype;

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
import com.cloderia.helion.client.shared.endpoint.FacilitytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.FacilitytypeOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-facilitytype-page.html#app-container")
public class BaseFacilitytypePage extends BasePortalPage {

	protected static final String VIEW_FACILITYTYPE = "View Facilitytype";
	protected static final String CREATE_FACILITYTYPE = "Create Facilitytype";
	protected static final String UPDATE_FACILITYTYPE = "Update Facilitytype";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateFacilitytypePage> createFacilitytypePage;
	
	@Inject
	TransitionTo<EditFacilitytypePage> editFacilitytypePage;
	
	@Inject
	TransitionTo<ViewFacilitytypePage> viewFacilitytypePage;
	
	@Inject
	TransitionTo<ListFacilitytypePage> listFacilitytypesPage;
	
	@Inject
	protected Caller<FacilitytypeEndPoint> facilitytypeService;
	
	@DataField
	protected AnchorElement listFacilitytypesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadUniverses(FacilitytypeEditor facilitytypeEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				facilitytypeEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listFacilitytypesPageLink")
	public void submit(ClickEvent e) { listFacilitytypesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param facilitytypeOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) FacilitytypeOperation facilitytypeOperation) {
		viewFacilitytypePage.go(UIUtils.buildPageIdMap(facilitytypeOperation.getFacilitytype().getId()));
	}

	/**
	 * @param facilitytypeOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) FacilitytypeOperation facilitytypeOperation) {
		viewFacilitytypePage.go(UIUtils.buildPageIdMap(facilitytypeOperation.getFacilitytype().getId()));
	}
	
	/**
	 * @param facilitytypeOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) FacilitytypeOperation facilitytypeOperation) {
		listFacilitytypesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView FacilitytypeDisplay component) {
		editFacilitytypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView FacilitytypeListItemDisplay component) {
		viewFacilitytypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView FacilitytypeListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView FacilitytypeListItemDisplay component) {
		editFacilitytypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity FacilitytypeEditor editorComponent) {
		facilitytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getFacilitytypeOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity FacilitytypeEditor editorComponent) {
		facilitytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getFacilitytypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity FacilitytypeDisplay displayComponent) {
		facilitytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getFacilitytypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity FacilitytypeListItemDisplay displayComponent) {
		facilitytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getFacilitytypeOps());
	}
}

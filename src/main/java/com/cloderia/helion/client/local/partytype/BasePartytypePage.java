/**
 * 
 */
package com.cloderia.helion.client.local.partytype;

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
import com.cloderia.helion.client.shared.endpoint.PartytypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.PartytypeEndPoint;
import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.endpoint.PartycategoryEndPoint;
import com.cloderia.helion.client.shared.model.Partycategory;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-partytype-page.html#app-container")
public class BasePartytypePage extends BasePortalPage {

	protected static final String VIEW_PARTYTYPE = "View Partytype";
	protected static final String CREATE_PARTYTYPE = "Create Partytype";
	protected static final String UPDATE_PARTYTYPE = "Update Partytype";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreatePartytypePage> createPartytypePage;
	
	@Inject
	TransitionTo<EditPartytypePage> editPartytypePage;
	
	@Inject
	TransitionTo<ViewPartytypePage> viewPartytypePage;
	
	@Inject
	TransitionTo<ListPartytypePage> listPartytypesPage;
	
	@Inject
	protected Caller<PartytypeEndPoint> partytypeService;
	
	@DataField
	protected AnchorElement listPartytypesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<PartycategoryEndPoint> partycategoryService;
		
	protected void loadUniverses(PartytypeEditor partytypeEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				partytypeEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadParentTypes(PartytypeEditor partytypeEditor) {
		partytypeService.call(new RemoteCallback<List<Partytype>>() {
			@Override
			public void callback(List<Partytype> entitiesList) {
				partytypeEditor.loadParentTypes(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadParentCategorys(PartytypeEditor partytypeEditor) {
		partycategoryService.call(new RemoteCallback<List<Partycategory>>() {
			@Override
			public void callback(List<Partycategory> entitiesList) {
				partytypeEditor.loadParentCategorys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listPartytypesPageLink")
	public void submit(ClickEvent e) { listPartytypesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param partytypeOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) PartytypeOperation partytypeOperation) {
		viewPartytypePage.go(UIUtils.buildPageIdMap(partytypeOperation.getPartytype().getId()));
	}

	/**
	 * @param partytypeOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) PartytypeOperation partytypeOperation) {
		viewPartytypePage.go(UIUtils.buildPageIdMap(partytypeOperation.getPartytype().getId()));
	}
	
	/**
	 * @param partytypeOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) PartytypeOperation partytypeOperation) {
		listPartytypesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView PartytypeDisplay component) {
		editPartytypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView PartytypeListItemDisplay component) {
		viewPartytypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView PartytypeListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView PartytypeListItemDisplay component) {
		editPartytypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity PartytypeEditor editorComponent) {
		partytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getPartytypeOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity PartytypeEditor editorComponent) {
		partytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getPartytypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity PartytypeDisplay displayComponent) {
		partytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartytypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity PartytypeListItemDisplay displayComponent) {
		partytypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartytypeOps());
	}
}

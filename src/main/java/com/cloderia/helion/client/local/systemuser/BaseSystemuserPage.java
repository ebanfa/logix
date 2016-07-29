/**
 * 
 */
package com.cloderia.helion.client.local.systemuser;

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
import com.cloderia.helion.client.shared.endpoint.SystemuserEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-systemuser-page.html#app-container")
public class BaseSystemuserPage extends BasePortalPage {

	protected static final String VIEW_SYSTEMUSER = "View Systemuser";
	protected static final String CREATE_SYSTEMUSER = "Create Systemuser";
	protected static final String UPDATE_SYSTEMUSER = "Update Systemuser";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateSystemuserPage> createSystemuserPage;
	
	@Inject
	TransitionTo<EditSystemuserPage> editSystemuserPage;
	
	@Inject
	TransitionTo<ViewSystemuserPage> viewSystemuserPage;
	
	@Inject
	TransitionTo<ListSystemuserPage> listSystemusersPage;
	
	@Inject
	protected Caller<SystemuserEndPoint> systemuserService;
	
	@DataField
	protected AnchorElement listSystemusersPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadPartys(SystemuserEditor systemuserEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				systemuserEditor.loadPartys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(SystemuserEditor systemuserEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				systemuserEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listSystemusersPageLink")
	public void submit(ClickEvent e) { listSystemusersPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param systemuserOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) SystemuserOperation systemuserOperation) {
		viewSystemuserPage.go(UIUtils.buildPageIdMap(systemuserOperation.getSystemuser().getId()));
	}

	/**
	 * @param systemuserOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) SystemuserOperation systemuserOperation) {
		viewSystemuserPage.go(UIUtils.buildPageIdMap(systemuserOperation.getSystemuser().getId()));
	}
	
	/**
	 * @param systemuserOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) SystemuserOperation systemuserOperation) {
		listSystemusersPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView SystemuserDisplay component) {
		editSystemuserPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView SystemuserListItemDisplay component) {
		viewSystemuserPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView SystemuserListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView SystemuserListItemDisplay component) {
		editSystemuserPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity SystemuserEditor editorComponent) {
		systemuserService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getSystemuserOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity SystemuserEditor editorComponent) {
		systemuserService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getSystemuserOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity SystemuserDisplay displayComponent) {
		systemuserService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getSystemuserOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity SystemuserListItemDisplay displayComponent) {
		systemuserService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getSystemuserOps());
	}
}

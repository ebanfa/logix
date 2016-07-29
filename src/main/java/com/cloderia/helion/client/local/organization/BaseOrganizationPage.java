/**
 * 
 */
package com.cloderia.helion.client.local.organization;

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
import com.cloderia.helion.client.shared.endpoint.OrganizationEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.OrganizationOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-organization-page.html#app-container")
public class BaseOrganizationPage extends BasePortalPage {

	protected static final String VIEW_ORGANIZATION = "View Organization";
	protected static final String CREATE_ORGANIZATION = "Create Organization";
	protected static final String UPDATE_ORGANIZATION = "Update Organization";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateOrganizationPage> createOrganizationPage;
	
	@Inject
	TransitionTo<EditOrganizationPage> editOrganizationPage;
	
	@Inject
	TransitionTo<ViewOrganizationPage> viewOrganizationPage;
	
	@Inject
	TransitionTo<ListOrganizationPage> listOrganizationsPage;
	
	@Inject
	protected Caller<OrganizationEndPoint> organizationService;
	
	@DataField
	protected AnchorElement listOrganizationsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadPartys(OrganizationEditor organizationEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				organizationEditor.loadPartys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(OrganizationEditor organizationEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				organizationEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listOrganizationsPageLink")
	public void submit(ClickEvent e) { listOrganizationsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param organizationOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) OrganizationOperation organizationOperation) {
		viewOrganizationPage.go(UIUtils.buildPageIdMap(organizationOperation.getOrganization().getId()));
	}

	/**
	 * @param organizationOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) OrganizationOperation organizationOperation) {
		viewOrganizationPage.go(UIUtils.buildPageIdMap(organizationOperation.getOrganization().getId()));
	}
	
	/**
	 * @param organizationOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) OrganizationOperation organizationOperation) {
		listOrganizationsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView OrganizationDisplay component) {
		editOrganizationPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView OrganizationListItemDisplay component) {
		viewOrganizationPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView OrganizationListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView OrganizationListItemDisplay component) {
		editOrganizationPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity OrganizationEditor editorComponent) {
		organizationService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getOrganizationOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity OrganizationEditor editorComponent) {
		organizationService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getOrganizationOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity OrganizationDisplay displayComponent) {
		organizationService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getOrganizationOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity OrganizationListItemDisplay displayComponent) {
		organizationService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getOrganizationOps());
	}
}

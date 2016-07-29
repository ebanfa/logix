/**
 * 
 */
package com.cloderia.helion.client.local.partyrole;

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
import com.cloderia.helion.client.shared.endpoint.PartyroleEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.PartyroletypeEndPoint;
import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.PartyroleOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-partyrole-page.html#app-container")
public class BasePartyrolePage extends BasePortalPage {

	protected static final String VIEW_PARTYROLE = "View Partyrole";
	protected static final String CREATE_PARTYROLE = "Create Partyrole";
	protected static final String UPDATE_PARTYROLE = "Update Partyrole";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreatePartyrolePage> createPartyrolePage;
	
	@Inject
	TransitionTo<EditPartyrolePage> editPartyrolePage;
	
	@Inject
	TransitionTo<ViewPartyrolePage> viewPartyrolePage;
	
	@Inject
	TransitionTo<ListPartyrolePage> listPartyrolesPage;
	
	@Inject
	protected Caller<PartyroleEndPoint> partyroleService;
	
	@DataField
	protected AnchorElement listPartyrolesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<PartyroletypeEndPoint> partyroletypeService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadPartys(PartyroleEditor partyroleEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				partyroleEditor.loadPartys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadPartyRoleTys(PartyroleEditor partyroleEditor) {
		partyroletypeService.call(new RemoteCallback<List<Partyroletype>>() {
			@Override
			public void callback(List<Partyroletype> entitiesList) {
				partyroleEditor.loadPartyRoleTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(PartyroleEditor partyroleEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				partyroleEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listPartyrolesPageLink")
	public void submit(ClickEvent e) { listPartyrolesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param partyroleOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) PartyroleOperation partyroleOperation) {
		viewPartyrolePage.go(UIUtils.buildPageIdMap(partyroleOperation.getPartyrole().getId()));
	}

	/**
	 * @param partyroleOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) PartyroleOperation partyroleOperation) {
		viewPartyrolePage.go(UIUtils.buildPageIdMap(partyroleOperation.getPartyrole().getId()));
	}
	
	/**
	 * @param partyroleOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) PartyroleOperation partyroleOperation) {
		listPartyrolesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView PartyroleDisplay component) {
		editPartyrolePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView PartyroleListItemDisplay component) {
		viewPartyrolePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView PartyroleListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView PartyroleListItemDisplay component) {
		editPartyrolePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity PartyroleEditor editorComponent) {
		partyroleService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getPartyroleOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity PartyroleEditor editorComponent) {
		partyroleService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getPartyroleOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity PartyroleDisplay displayComponent) {
		partyroleService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartyroleOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity PartyroleListItemDisplay displayComponent) {
		partyroleService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartyroleOps());
	}
}

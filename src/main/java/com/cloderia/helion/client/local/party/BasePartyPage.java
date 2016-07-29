/**
 * 
 */
package com.cloderia.helion.client.local.party;

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
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.PartytypeEndPoint;
import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.ops.PartyOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-party-page.html#app-container")
public class BasePartyPage extends BasePortalPage {

	protected static final String VIEW_PARTY = "View Party";
	protected static final String CREATE_PARTY = "Create Party";
	protected static final String UPDATE_PARTY = "Update Party";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreatePartyPage> createPartyPage;
	
	@Inject
	TransitionTo<EditPartyPage> editPartyPage;
	
	@Inject
	TransitionTo<ViewPartyPage> viewPartyPage;
	
	@Inject
	TransitionTo<ListPartyPage> listPartysPage;
	
	@Inject
	protected Caller<PartyEndPoint> partyService;
	
	@DataField
	protected AnchorElement listPartysPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<PartytypeEndPoint> partytypeService;
		
	protected void loadUniverses(PartyEditor partyEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				partyEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadPartyTys(PartyEditor partyEditor) {
		partytypeService.call(new RemoteCallback<List<Partytype>>() {
			@Override
			public void callback(List<Partytype> entitiesList) {
				partyEditor.loadPartyTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listPartysPageLink")
	public void submit(ClickEvent e) { listPartysPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param partyOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) PartyOperation partyOperation) {
		viewPartyPage.go(UIUtils.buildPageIdMap(partyOperation.getParty().getId()));
	}

	/**
	 * @param partyOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) PartyOperation partyOperation) {
		viewPartyPage.go(UIUtils.buildPageIdMap(partyOperation.getParty().getId()));
	}
	
	/**
	 * @param partyOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) PartyOperation partyOperation) {
		listPartysPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView PartyDisplay component) {
		editPartyPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView PartyListItemDisplay component) {
		viewPartyPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView PartyListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView PartyListItemDisplay component) {
		editPartyPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity PartyEditor editorComponent) {
		partyService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getPartyOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity PartyEditor editorComponent) {
		partyService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getPartyOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity PartyDisplay displayComponent) {
		partyService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartyOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity PartyListItemDisplay displayComponent) {
		partyService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartyOps());
	}
}

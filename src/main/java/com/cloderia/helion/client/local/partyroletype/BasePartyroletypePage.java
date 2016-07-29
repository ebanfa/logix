/**
 * 
 */
package com.cloderia.helion.client.local.partyroletype;

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
import com.cloderia.helion.client.shared.endpoint.PartyroletypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyroletypeEndPoint;
import com.cloderia.helion.client.shared.model.Partyroletype;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-partyroletype-page.html#app-container")
public class BasePartyroletypePage extends BasePortalPage {

	protected static final String VIEW_PARTYROLETYPE = "View Partyroletype";
	protected static final String CREATE_PARTYROLETYPE = "Create Partyroletype";
	protected static final String UPDATE_PARTYROLETYPE = "Update Partyroletype";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreatePartyroletypePage> createPartyroletypePage;
	
	@Inject
	TransitionTo<EditPartyroletypePage> editPartyroletypePage;
	
	@Inject
	TransitionTo<ViewPartyroletypePage> viewPartyroletypePage;
	
	@Inject
	TransitionTo<ListPartyroletypePage> listPartyroletypesPage;
	
	@Inject
	protected Caller<PartyroletypeEndPoint> partyroletypeService;
	
	@DataField
	protected AnchorElement listPartyroletypesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadParentRoleTys(PartyroletypeEditor partyroletypeEditor) {
		partyroletypeService.call(new RemoteCallback<List<Partyroletype>>() {
			@Override
			public void callback(List<Partyroletype> entitiesList) {
				partyroletypeEditor.loadParentRoleTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(PartyroletypeEditor partyroletypeEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				partyroletypeEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listPartyroletypesPageLink")
	public void submit(ClickEvent e) { listPartyroletypesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param partyroletypeOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) PartyroletypeOperation partyroletypeOperation) {
		viewPartyroletypePage.go(UIUtils.buildPageIdMap(partyroletypeOperation.getPartyroletype().getId()));
	}

	/**
	 * @param partyroletypeOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) PartyroletypeOperation partyroletypeOperation) {
		viewPartyroletypePage.go(UIUtils.buildPageIdMap(partyroletypeOperation.getPartyroletype().getId()));
	}
	
	/**
	 * @param partyroletypeOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) PartyroletypeOperation partyroletypeOperation) {
		listPartyroletypesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView PartyroletypeDisplay component) {
		editPartyroletypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView PartyroletypeListItemDisplay component) {
		viewPartyroletypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView PartyroletypeListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView PartyroletypeListItemDisplay component) {
		editPartyroletypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity PartyroletypeEditor editorComponent) {
		partyroletypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getPartyroletypeOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity PartyroletypeEditor editorComponent) {
		partyroletypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getPartyroletypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity PartyroletypeDisplay displayComponent) {
		partyroletypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartyroletypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity PartyroletypeListItemDisplay displayComponent) {
		partyroletypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartyroletypeOps());
	}
}

/**
 * 
 */
package com.cloderia.helion.client.local.agreement;

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
import com.cloderia.helion.client.shared.endpoint.AgreementEndPoint;
import com.cloderia.helion.client.shared.endpoint.AgreementtypeEndPoint;
import com.cloderia.helion.client.shared.model.Agreementtype;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.PartyrelationshipEndPoint;
import com.cloderia.helion.client.shared.model.Partyrelationship;
import com.cloderia.helion.client.shared.ops.AgreementOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-agreement-page.html#app-container")
public class BaseAgreementPage extends BasePortalPage {

	protected static final String VIEW_AGREEMENT = "View Agreement";
	protected static final String CREATE_AGREEMENT = "Create Agreement";
	protected static final String UPDATE_AGREEMENT = "Update Agreement";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateAgreementPage> createAgreementPage;
	
	@Inject
	TransitionTo<EditAgreementPage> editAgreementPage;
	
	@Inject
	TransitionTo<ViewAgreementPage> viewAgreementPage;
	
	@Inject
	TransitionTo<ListAgreementPage> listAgreementsPage;
	
	@Inject
	protected Caller<AgreementEndPoint> agreementService;
	
	@DataField
	protected AnchorElement listAgreementsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<AgreementtypeEndPoint> agreementtypeService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<PartyrelationshipEndPoint> partyrelationshipService;
		
	protected void loadAgreementTys(AgreementEditor agreementEditor) {
		agreementtypeService.call(new RemoteCallback<List<Agreementtype>>() {
			@Override
			public void callback(List<Agreementtype> entitiesList) {
				agreementEditor.loadAgreementTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(AgreementEditor agreementEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				agreementEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadPartyRels(AgreementEditor agreementEditor) {
		partyrelationshipService.call(new RemoteCallback<List<Partyrelationship>>() {
			@Override
			public void callback(List<Partyrelationship> entitiesList) {
				agreementEditor.loadPartyRels(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listAgreementsPageLink")
	public void submit(ClickEvent e) { listAgreementsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param agreementOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) AgreementOperation agreementOperation) {
		viewAgreementPage.go(UIUtils.buildPageIdMap(agreementOperation.getAgreement().getId()));
	}

	/**
	 * @param agreementOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) AgreementOperation agreementOperation) {
		viewAgreementPage.go(UIUtils.buildPageIdMap(agreementOperation.getAgreement().getId()));
	}
	
	/**
	 * @param agreementOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) AgreementOperation agreementOperation) {
		listAgreementsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView AgreementDisplay component) {
		editAgreementPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView AgreementListItemDisplay component) {
		viewAgreementPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView AgreementListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView AgreementListItemDisplay component) {
		editAgreementPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity AgreementEditor editorComponent) {
		agreementService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getAgreementOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity AgreementEditor editorComponent) {
		agreementService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getAgreementOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity AgreementDisplay displayComponent) {
		agreementService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getAgreementOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity AgreementListItemDisplay displayComponent) {
		agreementService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getAgreementOps());
	}
}

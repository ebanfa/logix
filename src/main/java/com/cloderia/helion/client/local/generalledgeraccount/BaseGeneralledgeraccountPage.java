/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccount;

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
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccounttypeEndPoint;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccountOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-generalledgeraccount-page.html#app-container")
public class BaseGeneralledgeraccountPage extends BasePortalPage {

	protected static final String VIEW_GENERALLEDGERACCOUNT = "View Generalledgeraccount";
	protected static final String CREATE_GENERALLEDGERACCOUNT = "Create Generalledgeraccount";
	protected static final String UPDATE_GENERALLEDGERACCOUNT = "Update Generalledgeraccount";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateGeneralledgeraccountPage> createGeneralledgeraccountPage;
	
	@Inject
	TransitionTo<EditGeneralledgeraccountPage> editGeneralledgeraccountPage;
	
	@Inject
	TransitionTo<ViewGeneralledgeraccountPage> viewGeneralledgeraccountPage;
	
	@Inject
	TransitionTo<ListGeneralledgeraccountPage> listGeneralledgeraccountsPage;
	
	@Inject
	protected Caller<GeneralledgeraccountEndPoint> generalledgeraccountService;
	
	@DataField
	protected AnchorElement listGeneralledgeraccountsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<GeneralledgeraccounttypeEndPoint> generalledgeraccounttypeService;
		
	protected void loadUniverses(GeneralledgeraccountEditor generalledgeraccountEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				generalledgeraccountEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadGlAcctTys(GeneralledgeraccountEditor generalledgeraccountEditor) {
		generalledgeraccounttypeService.call(new RemoteCallback<List<Generalledgeraccounttype>>() {
			@Override
			public void callback(List<Generalledgeraccounttype> entitiesList) {
				generalledgeraccountEditor.loadGlAcctTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listGeneralledgeraccountsPageLink")
	public void submit(ClickEvent e) { listGeneralledgeraccountsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param generalledgeraccountOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) GeneralledgeraccountOperation generalledgeraccountOperation) {
		viewGeneralledgeraccountPage.go(UIUtils.buildPageIdMap(generalledgeraccountOperation.getGeneralledgeraccount().getId()));
	}

	/**
	 * @param generalledgeraccountOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) GeneralledgeraccountOperation generalledgeraccountOperation) {
		viewGeneralledgeraccountPage.go(UIUtils.buildPageIdMap(generalledgeraccountOperation.getGeneralledgeraccount().getId()));
	}
	
	/**
	 * @param generalledgeraccountOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) GeneralledgeraccountOperation generalledgeraccountOperation) {
		listGeneralledgeraccountsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView GeneralledgeraccountDisplay component) {
		editGeneralledgeraccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView GeneralledgeraccountListItemDisplay component) {
		viewGeneralledgeraccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView GeneralledgeraccountListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView GeneralledgeraccountListItemDisplay component) {
		editGeneralledgeraccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity GeneralledgeraccountEditor editorComponent) {
		generalledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getGeneralledgeraccountOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity GeneralledgeraccountEditor editorComponent) {
		generalledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getGeneralledgeraccountOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity GeneralledgeraccountDisplay displayComponent) {
		generalledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getGeneralledgeraccountOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity GeneralledgeraccountListItemDisplay displayComponent) {
		generalledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getGeneralledgeraccountOps());
	}
}

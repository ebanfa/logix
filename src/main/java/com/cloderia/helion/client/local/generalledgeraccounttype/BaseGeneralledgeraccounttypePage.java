/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;

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
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccounttypeEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-generalledgeraccounttype-page.html#app-container")
public class BaseGeneralledgeraccounttypePage extends BasePortalPage {

	protected static final String VIEW_GENERALLEDGERACCOUNTTYPE = "View Generalledgeraccounttype";
	protected static final String CREATE_GENERALLEDGERACCOUNTTYPE = "Create Generalledgeraccounttype";
	protected static final String UPDATE_GENERALLEDGERACCOUNTTYPE = "Update Generalledgeraccounttype";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateGeneralledgeraccounttypePage> createGeneralledgeraccounttypePage;
	
	@Inject
	TransitionTo<EditGeneralledgeraccounttypePage> editGeneralledgeraccounttypePage;
	
	@Inject
	TransitionTo<ViewGeneralledgeraccounttypePage> viewGeneralledgeraccounttypePage;
	
	@Inject
	TransitionTo<ListGeneralledgeraccounttypePage> listGeneralledgeraccounttypesPage;
	
	@Inject
	protected Caller<GeneralledgeraccounttypeEndPoint> generalledgeraccounttypeService;
	
	@DataField
	protected AnchorElement listGeneralledgeraccounttypesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadUniverses(GeneralledgeraccounttypeEditor generalledgeraccounttypeEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				generalledgeraccounttypeEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listGeneralledgeraccounttypesPageLink")
	public void submit(ClickEvent e) { listGeneralledgeraccounttypesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param generalledgeraccounttypeOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) GeneralledgeraccounttypeOperation generalledgeraccounttypeOperation) {
		viewGeneralledgeraccounttypePage.go(UIUtils.buildPageIdMap(generalledgeraccounttypeOperation.getGeneralledgeraccounttype().getId()));
	}

	/**
	 * @param generalledgeraccounttypeOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) GeneralledgeraccounttypeOperation generalledgeraccounttypeOperation) {
		viewGeneralledgeraccounttypePage.go(UIUtils.buildPageIdMap(generalledgeraccounttypeOperation.getGeneralledgeraccounttype().getId()));
	}
	
	/**
	 * @param generalledgeraccounttypeOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) GeneralledgeraccounttypeOperation generalledgeraccounttypeOperation) {
		listGeneralledgeraccounttypesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView GeneralledgeraccounttypeDisplay component) {
		editGeneralledgeraccounttypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView GeneralledgeraccounttypeListItemDisplay component) {
		viewGeneralledgeraccounttypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView GeneralledgeraccounttypeListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView GeneralledgeraccounttypeListItemDisplay component) {
		editGeneralledgeraccounttypePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity GeneralledgeraccounttypeEditor editorComponent) {
		generalledgeraccounttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getGeneralledgeraccounttypeOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity GeneralledgeraccounttypeEditor editorComponent) {
		generalledgeraccounttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getGeneralledgeraccounttypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity GeneralledgeraccounttypeDisplay displayComponent) {
		generalledgeraccounttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getGeneralledgeraccounttypeOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity GeneralledgeraccounttypeListItemDisplay displayComponent) {
		generalledgeraccounttypeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getGeneralledgeraccounttypeOps());
	}
}

/**
 * 
 */
package com.cloderia.helion.client.local.universe;

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
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.UniverseOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-universe-page.html#app-container")
public class BaseUniversePage extends BasePortalPage {

	protected static final String VIEW_UNIVERSE = "View Universe";
	protected static final String CREATE_UNIVERSE = "Create Universe";
	protected static final String UPDATE_UNIVERSE = "Update Universe";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateUniversePage> createUniversePage;
	
	@Inject
	TransitionTo<EditUniversePage> editUniversePage;
	
	@Inject
	TransitionTo<ViewUniversePage> viewUniversePage;
	
	@Inject
	TransitionTo<ListUniversePage> listUniversesPage;
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	
	@DataField
	protected AnchorElement listUniversesPageLink = DOM.createAnchor().cast();	
	
		
	protected void loadParentUniverses(UniverseEditor universeEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				universeEditor.loadParentUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listUniversesPageLink")
	public void submit(ClickEvent e) { listUniversesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param universeOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) UniverseOperation universeOperation) {
		viewUniversePage.go(UIUtils.buildPageIdMap(universeOperation.getUniverse().getId()));
	}

	/**
	 * @param universeOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) UniverseOperation universeOperation) {
		viewUniversePage.go(UIUtils.buildPageIdMap(universeOperation.getUniverse().getId()));
	}
	
	/**
	 * @param universeOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) UniverseOperation universeOperation) {
		listUniversesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView UniverseDisplay component) {
		editUniversePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView UniverseListItemDisplay component) {
		viewUniversePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView UniverseListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView UniverseListItemDisplay component) {
		editUniversePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity UniverseEditor editorComponent) {
		universeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getUniverseOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity UniverseEditor editorComponent) {
		universeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getUniverseOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity UniverseDisplay displayComponent) {
		universeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getUniverseOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity UniverseListItemDisplay displayComponent) {
		universeService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getUniverseOps());
	}
}

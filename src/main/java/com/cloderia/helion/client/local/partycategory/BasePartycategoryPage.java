/**
 * 
 */
package com.cloderia.helion.client.local.partycategory;

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
import com.cloderia.helion.client.shared.endpoint.PartycategoryEndPoint;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.PartycategoryOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-partycategory-page.html#app-container")
public class BasePartycategoryPage extends BasePortalPage {

	protected static final String VIEW_PARTYCATEGORY = "View Partycategory";
	protected static final String CREATE_PARTYCATEGORY = "Create Partycategory";
	protected static final String UPDATE_PARTYCATEGORY = "Update Partycategory";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreatePartycategoryPage> createPartycategoryPage;
	
	@Inject
	TransitionTo<EditPartycategoryPage> editPartycategoryPage;
	
	@Inject
	TransitionTo<ViewPartycategoryPage> viewPartycategoryPage;
	
	@Inject
	TransitionTo<ListPartycategoryPage> listPartycategorysPage;
	
	@Inject
	protected Caller<PartycategoryEndPoint> partycategoryService;
	
	@DataField
	protected AnchorElement listPartycategorysPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadUniverses(PartycategoryEditor partycategoryEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				partycategoryEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listPartycategorysPageLink")
	public void submit(ClickEvent e) { listPartycategorysPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param partycategoryOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) PartycategoryOperation partycategoryOperation) {
		viewPartycategoryPage.go(UIUtils.buildPageIdMap(partycategoryOperation.getPartycategory().getId()));
	}

	/**
	 * @param partycategoryOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) PartycategoryOperation partycategoryOperation) {
		viewPartycategoryPage.go(UIUtils.buildPageIdMap(partycategoryOperation.getPartycategory().getId()));
	}
	
	/**
	 * @param partycategoryOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) PartycategoryOperation partycategoryOperation) {
		listPartycategorysPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView PartycategoryDisplay component) {
		editPartycategoryPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView PartycategoryListItemDisplay component) {
		viewPartycategoryPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView PartycategoryListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView PartycategoryListItemDisplay component) {
		editPartycategoryPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity PartycategoryEditor editorComponent) {
		partycategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getPartycategoryOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity PartycategoryEditor editorComponent) {
		partycategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getPartycategoryOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity PartycategoryDisplay displayComponent) {
		partycategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartycategoryOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity PartycategoryListItemDisplay displayComponent) {
		partycategoryService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPartycategoryOps());
	}
}

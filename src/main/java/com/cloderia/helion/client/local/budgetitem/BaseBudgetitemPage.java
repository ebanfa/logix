/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

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
import com.cloderia.helion.client.shared.endpoint.BudgetitemEndPoint;
import com.cloderia.helion.client.shared.endpoint.BudgetitemtypeEndPoint;
import com.cloderia.helion.client.shared.model.Budgetitemtype;
import com.cloderia.helion.client.shared.endpoint.BudgetitemEndPoint;
import com.cloderia.helion.client.shared.model.Budgetitem;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.BudgetEndPoint;
import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-budgetitem-page.html#app-container")
public class BaseBudgetitemPage extends BasePortalPage {

	protected static final String VIEW_BUDGETITEM = "View Budgetitem";
	protected static final String CREATE_BUDGETITEM = "Create Budgetitem";
	protected static final String UPDATE_BUDGETITEM = "Update Budgetitem";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateBudgetitemPage> createBudgetitemPage;
	
	@Inject
	TransitionTo<EditBudgetitemPage> editBudgetitemPage;
	
	@Inject
	TransitionTo<ViewBudgetitemPage> viewBudgetitemPage;
	
	@Inject
	TransitionTo<ListBudgetitemPage> listBudgetitemsPage;
	
	@Inject
	protected Caller<BudgetitemEndPoint> budgetitemService;
	
	@DataField
	protected AnchorElement listBudgetitemsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<BudgetitemtypeEndPoint> budgetitemtypeService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<BudgetEndPoint> budgetService;
		
	protected void loadItemTys(BudgetitemEditor budgetitemEditor) {
		budgetitemtypeService.call(new RemoteCallback<List<Budgetitemtype>>() {
			@Override
			public void callback(List<Budgetitemtype> entitiesList) {
				budgetitemEditor.loadItemTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadParentItems(BudgetitemEditor budgetitemEditor) {
		budgetitemService.call(new RemoteCallback<List<Budgetitem>>() {
			@Override
			public void callback(List<Budgetitem> entitiesList) {
				budgetitemEditor.loadParentItems(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(BudgetitemEditor budgetitemEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				budgetitemEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadBudgets(BudgetitemEditor budgetitemEditor) {
		budgetService.call(new RemoteCallback<List<Budget>>() {
			@Override
			public void callback(List<Budget> entitiesList) {
				budgetitemEditor.loadBudgets(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listBudgetitemsPageLink")
	public void submit(ClickEvent e) { listBudgetitemsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param budgetitemOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) BudgetitemOperation budgetitemOperation) {
		viewBudgetitemPage.go(UIUtils.buildPageIdMap(budgetitemOperation.getBudgetitem().getId()));
	}

	/**
	 * @param budgetitemOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) BudgetitemOperation budgetitemOperation) {
		viewBudgetitemPage.go(UIUtils.buildPageIdMap(budgetitemOperation.getBudgetitem().getId()));
	}
	
	/**
	 * @param budgetitemOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) BudgetitemOperation budgetitemOperation) {
		listBudgetitemsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView BudgetitemDisplay component) {
		editBudgetitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView BudgetitemListItemDisplay component) {
		viewBudgetitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView BudgetitemListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView BudgetitemListItemDisplay component) {
		editBudgetitemPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity BudgetitemEditor editorComponent) {
		budgetitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getBudgetitemOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity BudgetitemEditor editorComponent) {
		budgetitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getBudgetitemOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity BudgetitemDisplay displayComponent) {
		budgetitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getBudgetitemOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity BudgetitemListItemDisplay displayComponent) {
		budgetitemService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getBudgetitemOps());
	}
}

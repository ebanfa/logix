/**
 * 
 */
package com.cloderia.helion.client.local.budget;

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
import com.cloderia.helion.client.shared.endpoint.BudgetEndPoint;
import com.cloderia.helion.client.shared.endpoint.StandardtimeperiodEndPoint;
import com.cloderia.helion.client.shared.model.Standardtimeperiod;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.BudgetOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-budget-page.html#app-container")
public class BaseBudgetPage extends BasePortalPage {

	protected static final String VIEW_BUDGET = "View Budget";
	protected static final String CREATE_BUDGET = "Create Budget";
	protected static final String UPDATE_BUDGET = "Update Budget";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateBudgetPage> createBudgetPage;
	
	@Inject
	TransitionTo<EditBudgetPage> editBudgetPage;
	
	@Inject
	TransitionTo<ViewBudgetPage> viewBudgetPage;
	
	@Inject
	TransitionTo<ListBudgetPage> listBudgetsPage;
	
	@Inject
	protected Caller<BudgetEndPoint> budgetService;
	
	@DataField
	protected AnchorElement listBudgetsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<StandardtimeperiodEndPoint> standardtimeperiodService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadPeriods(BudgetEditor budgetEditor) {
		standardtimeperiodService.call(new RemoteCallback<List<Standardtimeperiod>>() {
			@Override
			public void callback(List<Standardtimeperiod> entitiesList) {
				budgetEditor.loadPeriods(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(BudgetEditor budgetEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				budgetEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listBudgetsPageLink")
	public void submit(ClickEvent e) { listBudgetsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param budgetOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) BudgetOperation budgetOperation) {
		viewBudgetPage.go(UIUtils.buildPageIdMap(budgetOperation.getBudget().getId()));
	}

	/**
	 * @param budgetOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) BudgetOperation budgetOperation) {
		viewBudgetPage.go(UIUtils.buildPageIdMap(budgetOperation.getBudget().getId()));
	}
	
	/**
	 * @param budgetOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) BudgetOperation budgetOperation) {
		listBudgetsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView BudgetDisplay component) {
		editBudgetPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView BudgetListItemDisplay component) {
		viewBudgetPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView BudgetListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView BudgetListItemDisplay component) {
		editBudgetPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity BudgetEditor editorComponent) {
		budgetService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getBudgetOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity BudgetEditor editorComponent) {
		budgetService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getBudgetOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity BudgetDisplay displayComponent) {
		budgetService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getBudgetOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity BudgetListItemDisplay displayComponent) {
		budgetService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getBudgetOps());
	}
}

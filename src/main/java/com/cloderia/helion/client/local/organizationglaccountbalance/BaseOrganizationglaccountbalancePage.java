/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;

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
import com.cloderia.helion.client.shared.endpoint.OrganizationglaccountbalanceEndPoint;
import com.cloderia.helion.client.shared.endpoint.OrganizationgeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.model.Organizationgeneralledgeraccount;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.AccountingperiodEndPoint;
import com.cloderia.helion.client.shared.model.Accountingperiod;
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-organizationglaccountbalance-page.html#app-container")
public class BaseOrganizationglaccountbalancePage extends BasePortalPage {

	protected static final String VIEW_ORGANIZATIONGLACCOUNTBALANCE = "View Organizationglaccountbalance";
	protected static final String CREATE_ORGANIZATIONGLACCOUNTBALANCE = "Create Organizationglaccountbalance";
	protected static final String UPDATE_ORGANIZATIONGLACCOUNTBALANCE = "Update Organizationglaccountbalance";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateOrganizationglaccountbalancePage> createOrganizationglaccountbalancePage;
	
	@Inject
	TransitionTo<EditOrganizationglaccountbalancePage> editOrganizationglaccountbalancePage;
	
	@Inject
	TransitionTo<ViewOrganizationglaccountbalancePage> viewOrganizationglaccountbalancePage;
	
	@Inject
	TransitionTo<ListOrganizationglaccountbalancePage> listOrganizationglaccountbalancesPage;
	
	@Inject
	protected Caller<OrganizationglaccountbalanceEndPoint> organizationglaccountbalanceService;
	
	@DataField
	protected AnchorElement listOrganizationglaccountbalancesPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<OrganizationgeneralledgeraccountEndPoint> organizationgeneralledgeraccountService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<AccountingperiodEndPoint> accountingperiodService;
		
	protected void loadGlAccounts(OrganizationglaccountbalanceEditor organizationglaccountbalanceEditor) {
		organizationgeneralledgeraccountService.call(new RemoteCallback<List<Organizationgeneralledgeraccount>>() {
			@Override
			public void callback(List<Organizationgeneralledgeraccount> entitiesList) {
				organizationglaccountbalanceEditor.loadGlAccounts(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(OrganizationglaccountbalanceEditor organizationglaccountbalanceEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				organizationglaccountbalanceEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadAccountingPeriods(OrganizationglaccountbalanceEditor organizationglaccountbalanceEditor) {
		accountingperiodService.call(new RemoteCallback<List<Accountingperiod>>() {
			@Override
			public void callback(List<Accountingperiod> entitiesList) {
				organizationglaccountbalanceEditor.loadAccountingPeriods(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listOrganizationglaccountbalancesPageLink")
	public void submit(ClickEvent e) { listOrganizationglaccountbalancesPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param organizationglaccountbalanceOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) OrganizationglaccountbalanceOperation organizationglaccountbalanceOperation) {
		viewOrganizationglaccountbalancePage.go(UIUtils.buildPageIdMap(organizationglaccountbalanceOperation.getOrganizationglaccountbalance().getId()));
	}

	/**
	 * @param organizationglaccountbalanceOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) OrganizationglaccountbalanceOperation organizationglaccountbalanceOperation) {
		viewOrganizationglaccountbalancePage.go(UIUtils.buildPageIdMap(organizationglaccountbalanceOperation.getOrganizationglaccountbalance().getId()));
	}
	
	/**
	 * @param organizationglaccountbalanceOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) OrganizationglaccountbalanceOperation organizationglaccountbalanceOperation) {
		listOrganizationglaccountbalancesPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView OrganizationglaccountbalanceDisplay component) {
		editOrganizationglaccountbalancePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView OrganizationglaccountbalanceListItemDisplay component) {
		viewOrganizationglaccountbalancePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView OrganizationglaccountbalanceListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView OrganizationglaccountbalanceListItemDisplay component) {
		editOrganizationglaccountbalancePage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity OrganizationglaccountbalanceEditor editorComponent) {
		organizationglaccountbalanceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getOrganizationglaccountbalanceOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity OrganizationglaccountbalanceEditor editorComponent) {
		organizationglaccountbalanceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getOrganizationglaccountbalanceOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity OrganizationglaccountbalanceDisplay displayComponent) {
		organizationglaccountbalanceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getOrganizationglaccountbalanceOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity OrganizationglaccountbalanceListItemDisplay displayComponent) {
		organizationglaccountbalanceService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getOrganizationglaccountbalanceOps());
	}
}

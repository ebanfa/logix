/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;

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
import com.cloderia.helion.client.shared.endpoint.OrganizationgeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.PartyEndPoint;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.endpoint.ProductcategoryEndPoint;
import com.cloderia.helion.client.shared.model.Productcategory;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.ProductEndPoint;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.endpoint.GeneralledgeraccountEndPoint;
import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-organizationgeneralledgeraccount-page.html#app-container")
public class BaseOrganizationgeneralledgeraccountPage extends BasePortalPage {

	protected static final String VIEW_ORGANIZATIONGENERALLEDGERACCOUNT = "View Organizationgeneralledgeraccount";
	protected static final String CREATE_ORGANIZATIONGENERALLEDGERACCOUNT = "Create Organizationgeneralledgeraccount";
	protected static final String UPDATE_ORGANIZATIONGENERALLEDGERACCOUNT = "Update Organizationgeneralledgeraccount";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateOrganizationgeneralledgeraccountPage> createOrganizationgeneralledgeraccountPage;
	
	@Inject
	TransitionTo<EditOrganizationgeneralledgeraccountPage> editOrganizationgeneralledgeraccountPage;
	
	@Inject
	TransitionTo<ViewOrganizationgeneralledgeraccountPage> viewOrganizationgeneralledgeraccountPage;
	
	@Inject
	TransitionTo<ListOrganizationgeneralledgeraccountPage> listOrganizationgeneralledgeraccountsPage;
	
	@Inject
	protected Caller<OrganizationgeneralledgeraccountEndPoint> organizationgeneralledgeraccountService;
	
	@DataField
	protected AnchorElement listOrganizationgeneralledgeraccountsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<PartyEndPoint> partyService;
	@Inject
	protected Caller<ProductcategoryEndPoint> productcategoryService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<ProductEndPoint> productService;
	@Inject
	protected Caller<GeneralledgeraccountEndPoint> generalledgeraccountService;
		
	protected void loadOrganizations(OrganizationgeneralledgeraccountEditor organizationgeneralledgeraccountEditor) {
		partyService.call(new RemoteCallback<List<Party>>() {
			@Override
			public void callback(List<Party> entitiesList) {
				organizationgeneralledgeraccountEditor.loadOrganizations(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProductCats(OrganizationgeneralledgeraccountEditor organizationgeneralledgeraccountEditor) {
		productcategoryService.call(new RemoteCallback<List<Productcategory>>() {
			@Override
			public void callback(List<Productcategory> entitiesList) {
				organizationgeneralledgeraccountEditor.loadProductCats(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(OrganizationgeneralledgeraccountEditor organizationgeneralledgeraccountEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				organizationgeneralledgeraccountEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadProducts(OrganizationgeneralledgeraccountEditor organizationgeneralledgeraccountEditor) {
		productService.call(new RemoteCallback<List<Product>>() {
			@Override
			public void callback(List<Product> entitiesList) {
				organizationgeneralledgeraccountEditor.loadProducts(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadGlAccounts(OrganizationgeneralledgeraccountEditor organizationgeneralledgeraccountEditor) {
		generalledgeraccountService.call(new RemoteCallback<List<Generalledgeraccount>>() {
			@Override
			public void callback(List<Generalledgeraccount> entitiesList) {
				organizationgeneralledgeraccountEditor.loadGlAccounts(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listOrganizationgeneralledgeraccountsPageLink")
	public void submit(ClickEvent e) { listOrganizationgeneralledgeraccountsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param organizationgeneralledgeraccountOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOperation) {
		viewOrganizationgeneralledgeraccountPage.go(UIUtils.buildPageIdMap(organizationgeneralledgeraccountOperation.getOrganizationgeneralledgeraccount().getId()));
	}

	/**
	 * @param organizationgeneralledgeraccountOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOperation) {
		viewOrganizationgeneralledgeraccountPage.go(UIUtils.buildPageIdMap(organizationgeneralledgeraccountOperation.getOrganizationgeneralledgeraccount().getId()));
	}
	
	/**
	 * @param organizationgeneralledgeraccountOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOperation) {
		listOrganizationgeneralledgeraccountsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView OrganizationgeneralledgeraccountDisplay component) {
		editOrganizationgeneralledgeraccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView OrganizationgeneralledgeraccountListItemDisplay component) {
		viewOrganizationgeneralledgeraccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView OrganizationgeneralledgeraccountListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView OrganizationgeneralledgeraccountListItemDisplay component) {
		editOrganizationgeneralledgeraccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity OrganizationgeneralledgeraccountEditor editorComponent) {
		organizationgeneralledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getOrganizationgeneralledgeraccountOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity OrganizationgeneralledgeraccountEditor editorComponent) {
		organizationgeneralledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getOrganizationgeneralledgeraccountOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity OrganizationgeneralledgeraccountDisplay displayComponent) {
		organizationgeneralledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getOrganizationgeneralledgeraccountOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity OrganizationgeneralledgeraccountListItemDisplay displayComponent) {
		organizationgeneralledgeraccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getOrganizationgeneralledgeraccountOps());
	}
}

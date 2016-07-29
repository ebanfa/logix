/**
 * 
 */
package com.cloderia.helion.client.local.billingaccount;

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
import com.cloderia.helion.client.shared.endpoint.BillingaccountEndPoint;
import com.cloderia.helion.client.shared.endpoint.ContactmechanismEndPoint;
import com.cloderia.helion.client.shared.model.Contactmechanism;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.ops.BillingaccountOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-billingaccount-page.html#app-container")
public class BaseBillingaccountPage extends BasePortalPage {

	protected static final String VIEW_BILLINGACCOUNT = "View Billingaccount";
	protected static final String CREATE_BILLINGACCOUNT = "Create Billingaccount";
	protected static final String UPDATE_BILLINGACCOUNT = "Update Billingaccount";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreateBillingaccountPage> createBillingaccountPage;
	
	@Inject
	TransitionTo<EditBillingaccountPage> editBillingaccountPage;
	
	@Inject
	TransitionTo<ViewBillingaccountPage> viewBillingaccountPage;
	
	@Inject
	TransitionTo<ListBillingaccountPage> listBillingaccountsPage;
	
	@Inject
	protected Caller<BillingaccountEndPoint> billingaccountService;
	
	@DataField
	protected AnchorElement listBillingaccountsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<ContactmechanismEndPoint> contactmechanismService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
		
	protected void loadToContMechs(BillingaccountEditor billingaccountEditor) {
		contactmechanismService.call(new RemoteCallback<List<Contactmechanism>>() {
			@Override
			public void callback(List<Contactmechanism> entitiesList) {
				billingaccountEditor.loadToContMechs(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(BillingaccountEditor billingaccountEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				billingaccountEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listBillingaccountsPageLink")
	public void submit(ClickEvent e) { listBillingaccountsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param billingaccountOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) BillingaccountOperation billingaccountOperation) {
		viewBillingaccountPage.go(UIUtils.buildPageIdMap(billingaccountOperation.getBillingaccount().getId()));
	}

	/**
	 * @param billingaccountOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) BillingaccountOperation billingaccountOperation) {
		viewBillingaccountPage.go(UIUtils.buildPageIdMap(billingaccountOperation.getBillingaccount().getId()));
	}
	
	/**
	 * @param billingaccountOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) BillingaccountOperation billingaccountOperation) {
		listBillingaccountsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView BillingaccountDisplay component) {
		editBillingaccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView BillingaccountListItemDisplay component) {
		viewBillingaccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView BillingaccountListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView BillingaccountListItemDisplay component) {
		editBillingaccountPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity BillingaccountEditor editorComponent) {
		billingaccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getBillingaccountOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity BillingaccountEditor editorComponent) {
		billingaccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getBillingaccountOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity BillingaccountDisplay displayComponent) {
		billingaccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getBillingaccountOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity BillingaccountListItemDisplay displayComponent) {
		billingaccountService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getBillingaccountOps());
	}
}

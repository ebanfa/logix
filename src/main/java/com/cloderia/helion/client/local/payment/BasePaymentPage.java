/**
 * 
 */
package com.cloderia.helion.client.local.payment;

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
import com.cloderia.helion.client.shared.endpoint.PaymentEndPoint;
import com.cloderia.helion.client.shared.endpoint.PaymenttypeEndPoint;
import com.cloderia.helion.client.shared.model.Paymenttype;
import com.cloderia.helion.client.shared.endpoint.UniverseEndPoint;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.endpoint.PaymentmethodtypeEndPoint;
import com.cloderia.helion.client.shared.model.Paymentmethodtype;
import com.cloderia.helion.client.shared.endpoint.FinancialaccountEndPoint;
import com.cloderia.helion.client.shared.model.Financialaccount;
import com.cloderia.helion.client.shared.ops.PaymentOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.DOM;

/**
 * @author adrian
 *
 */
@Templated(value = "edit-payment-page.html#app-container")
public class BasePaymentPage extends BasePortalPage {

	protected static final String VIEW_PAYMENT = "View Payment";
	protected static final String CREATE_PAYMENT = "Create Payment";
	protected static final String UPDATE_PAYMENT = "Update Payment";
	
	@Inject @Named("h2")
	@DataField
	protected Heading viewTitle;
	
	@Inject
	TransitionTo<CreatePaymentPage> createPaymentPage;
	
	@Inject
	TransitionTo<EditPaymentPage> editPaymentPage;
	
	@Inject
	TransitionTo<ViewPaymentPage> viewPaymentPage;
	
	@Inject
	TransitionTo<ListPaymentPage> listPaymentsPage;
	
	@Inject
	protected Caller<PaymentEndPoint> paymentService;
	
	@DataField
	protected AnchorElement listPaymentsPageLink = DOM.createAnchor().cast();	
	
	@Inject
	protected Caller<PaymenttypeEndPoint> paymenttypeService;
	@Inject
	protected Caller<UniverseEndPoint> universeService;
	@Inject
	protected Caller<PaymentmethodtypeEndPoint> paymentmethodtypeService;
	@Inject
	protected Caller<FinancialaccountEndPoint> financialaccountService;
		
	protected void loadPaymentTys(PaymentEditor paymentEditor) {
		paymenttypeService.call(new RemoteCallback<List<Paymenttype>>() {
			@Override
			public void callback(List<Paymenttype> entitiesList) {
				paymentEditor.loadPaymentTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadUniverses(PaymentEditor paymentEditor) {
		universeService.call(new RemoteCallback<List<Universe>>() {
			@Override
			public void callback(List<Universe> entitiesList) {
				paymentEditor.loadUniverses(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadMethodTys(PaymentEditor paymentEditor) {
		paymentmethodtypeService.call(new RemoteCallback<List<Paymentmethodtype>>() {
			@Override
			public void callback(List<Paymentmethodtype> entitiesList) {
				paymentEditor.loadMethodTys(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}
	protected void loadFinAccts(PaymentEditor paymentEditor) {
		financialaccountService.call(new RemoteCallback<List<Financialaccount>>() {
			@Override
			public void callback(List<Financialaccount> entitiesList) {
				paymentEditor.loadFinAccts(entitiesList);
				refreshWidgets() ;
			}
		}).findAll();
	}

    /**
	 * @param e
	 */
	@EventHandler("listPaymentsPageLink")
	public void submit(ClickEvent e) { listPaymentsPage.go();	}
	

	protected void setViewTitle(String title, String description){ 
		viewTitle.setTextContent(title);
	}

	/**
	 * @param paymentOperation
	 */
	public void onRemoteEntityCreated(final @Observes @Operation(CREATE) PaymentOperation paymentOperation) {
		viewPaymentPage.go(UIUtils.buildPageIdMap(paymentOperation.getPayment().getId()));
	}

	/**
	 * @param paymentOperation
	 */
	public void onRemoteEntityEdited(final @Observes @Operation(UPDATE) PaymentOperation paymentOperation) {
		viewPaymentPage.go(UIUtils.buildPageIdMap(paymentOperation.getPayment().getId()));
	}
	
	/**
	 * @param paymentOperation
	 */
	public void onRemoteEntityDeleted(final @Observes @Operation(DELETE) PaymentOperation paymentOperation) {
		listPaymentsPage.go();
	}

	/**
	 * @param component
	 */
	public void doRenderEditView(final @Observes @RenderEditView PaymentDisplay component) {
		editPaymentPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderSingleView(final @Observes @RenderSingleView PaymentListItemDisplay component) {
		viewPaymentPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	
	/**
	 * 
	 */
	public void doRenderDeleteView(final @Observes @RenderDeleteView PaymentListItemDisplay component) {
		
	}
	
	/**
	 * 
	 */
	public void renderEditView(final @Observes @RenderEditView PaymentListItemDisplay component) {
		editPaymentPage.go(UIUtils.buildPageIdMap(component.getValue().getId()));
	}
	

	/**
	 * @param component
	 */
	public void doCreateEntity(final @Observes @CreateEntity PaymentEditor editorComponent) {
		paymentService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).createOperation(editorComponent.getPaymentOps());
	}

	/**
	 * @param editorComponent
	 */
	public void doEditEntity(final @Observes @EditEntity PaymentEditor editorComponent) {
		paymentService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).updateOperation(editorComponent.getPaymentOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntity(final @Observes @DeleteEntity PaymentDisplay displayComponent) {
		paymentService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPaymentOps());
	}
	
	/**
	 * @param editorComponent
	 */
	public void doDeleteEntityListItem(final @Observes @DeleteEntity PaymentListItemDisplay displayComponent) {
		paymentService.call(new ResponseCallback() {
			@Override
			public void callback(Response response) {
			}
		}).deleteOperation(displayComponent.getPaymentOps());
	}
}

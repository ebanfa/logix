/**
 * 
 */
package com.cloderia.helion.client.local.payment;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Payment;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editpayment")
@Templated(value = "edit-payment-page.html#app-container")
public class EditPaymentPage extends BasePaymentPage {
	
	@Inject
	@DataField
	protected PaymentEditor paymentEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadPaymentTys(paymentEditor);
		loadUniverses(paymentEditor);
		loadMethodTys(paymentEditor);
		loadFinAccts(paymentEditor);
		paymentEditor.setEditMode(true);
		setViewTitle(BasePaymentPage.UPDATE_PAYMENT, "");
		
		paymentService.call(new RemoteCallback<Payment>() {
			@Override
			public void callback(Payment payment) {
				paymentEditor.setValue(payment);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}

/**
 * 
 */
package com.cloderia.helion.client.local.payment;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Page(path = "/createpayment")
@Templated(value = "edit-payment-page.html#app-container")
public class CreatePaymentPage extends BasePaymentPage {

	@Inject
	@DataField
	protected PaymentEditor paymentEditor;
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.party.BasePartyPage#doSetup()
	 */
	@Override
	protected void doSetup() {

		loadPaymentTys(paymentEditor);
		loadPaymentTys(paymentEditor);
		loadUniverses(paymentEditor);
		loadUniverses(paymentEditor);
		loadMethodTys(paymentEditor);
		loadMethodTys(paymentEditor);
		loadFinAccts(paymentEditor);
		loadFinAccts(paymentEditor);
		setViewTitle(BasePaymentPage.CREATE_PAYMENT, "");
		super.doSetup();
	}
}

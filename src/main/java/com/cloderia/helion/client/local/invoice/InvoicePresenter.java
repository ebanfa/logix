/**
 * 
 */
package com.cloderia.helion.client.local.invoice;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Invoice;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.InvoiceOperation;

/**
 * @author adrian
 *
 */
public class InvoicePresenter implements TakesValue<Invoice> {

	@Inject
	@AutoBound
	protected DataBinder<Invoice> binder;

	private InvoiceOperation invoiceOps;

	@Override
	public Invoice getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Invoice model) {
		binder.setModel(model);
	}

	/**
	 * @return the invoiceOps
	 */
	public InvoiceOperation getInvoiceOps() {
		return invoiceOps;
	}

	/**
	 * @param invoiceOps
	 *            the invoiceOps to set
	 */
	public void setInvoiceOps(InvoiceOperation invoiceOps) {
		this.invoiceOps = invoiceOps;
	}
	
	/**
	 * 
	 */
	protected InvoiceOperation initOps() {
		InvoiceOperation invoiceOperation = new InvoiceOperation(this.getValue());
		this.setInvoiceOps(invoiceOperation);
		return invoiceOperation;
	}

}

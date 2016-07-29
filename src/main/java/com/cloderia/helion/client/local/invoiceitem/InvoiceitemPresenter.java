/**
 * 
 */
package com.cloderia.helion.client.local.invoiceitem;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Invoiceitem;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.InvoiceitemOperation;

/**
 * @author adrian
 *
 */
public class InvoiceitemPresenter implements TakesValue<Invoiceitem> {

	@Inject
	@AutoBound
	protected DataBinder<Invoiceitem> binder;

	private InvoiceitemOperation invoiceitemOps;

	@Override
	public Invoiceitem getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Invoiceitem model) {
		binder.setModel(model);
	}

	/**
	 * @return the invoiceitemOps
	 */
	public InvoiceitemOperation getInvoiceitemOps() {
		return invoiceitemOps;
	}

	/**
	 * @param invoiceitemOps
	 *            the invoiceitemOps to set
	 */
	public void setInvoiceitemOps(InvoiceitemOperation invoiceitemOps) {
		this.invoiceitemOps = invoiceitemOps;
	}
	
	/**
	 * 
	 */
	protected InvoiceitemOperation initOps() {
		InvoiceitemOperation invoiceitemOperation = new InvoiceitemOperation(this.getValue());
		this.setInvoiceitemOps(invoiceitemOperation);
		return invoiceitemOperation;
	}

}

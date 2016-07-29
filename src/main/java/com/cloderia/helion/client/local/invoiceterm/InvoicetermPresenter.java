/**
 * 
 */
package com.cloderia.helion.client.local.invoiceterm;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Invoiceterm;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.InvoicetermOperation;

/**
 * @author adrian
 *
 */
public class InvoicetermPresenter implements TakesValue<Invoiceterm> {

	@Inject
	@AutoBound
	protected DataBinder<Invoiceterm> binder;

	private InvoicetermOperation invoicetermOps;

	@Override
	public Invoiceterm getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Invoiceterm model) {
		binder.setModel(model);
	}

	/**
	 * @return the invoicetermOps
	 */
	public InvoicetermOperation getInvoicetermOps() {
		return invoicetermOps;
	}

	/**
	 * @param invoicetermOps
	 *            the invoicetermOps to set
	 */
	public void setInvoicetermOps(InvoicetermOperation invoicetermOps) {
		this.invoicetermOps = invoicetermOps;
	}
	
	/**
	 * 
	 */
	protected InvoicetermOperation initOps() {
		InvoicetermOperation invoicetermOperation = new InvoicetermOperation(this.getValue());
		this.setInvoicetermOps(invoicetermOperation);
		return invoicetermOperation;
	}

}

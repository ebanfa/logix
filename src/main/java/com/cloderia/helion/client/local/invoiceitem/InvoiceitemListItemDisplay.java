/**
 * 
 */
package com.cloderia.helion.client.local.invoiceitem;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.common.client.dom.TableRow;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderSingleView;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Templated(value = "list-invoiceitem-page.html#invoiceitemItem")
public class InvoiceitemListItemDisplay extends InvoiceitemPresenter implements IsElement {

	/**
	 * This element is the root element of this component (as declared in the
	 * {@code #orderItem} fragment of the {@link Templated#value()} above).
	 */
	@Inject
	@DataField
	private TableRow invoiceitemItem = DOM.createTR().cast();
	
	@Inject
	@Named("td")
	@Bound(property="itemTy.name")
	@DataField
	private TableCell itemTy = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="prodFeat.name")
	@DataField
	private TableCell prodFeat = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="soldWithItem.name")
	@DataField
	private TableCell soldWithItem = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="invoice.name")
	@DataField
	private TableCell invoice = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="inventoryItem.name")
	@DataField
	private TableCell inventoryItem = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="prod.name")
	@DataField
	private TableCell prod = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell entityCode = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell name = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell itemDescription = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell taxableFg = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell quantity = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell amount = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell unitPrice = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell effectiveDt = DOM.createTD().cast();

	@Inject
	@DataField
	private AnchorElement editEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@DataField
	private AnchorElement deleteEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@RenderSingleView
	private Event<InvoiceitemListItemDisplay> renderSingleViewEvent;

	@Inject
	@RenderEditView
	private Event<InvoiceitemListItemDisplay> renderEditViewEvent;

	@Inject
	@DeleteEntity
	private Event<InvoiceitemListItemDisplay> deleteEntityEvent;
		
	/**
	 * 
	 */
	@EventHandler("editEntityListItemBtn")
	public void renderEditView(final ClickEvent event) {
		initOps();
		renderEditViewEvent.fire(this);
	}
	
	/**
	 * 
	 */
	@EventHandler("deleteEntityListItemBtn")
	public void renderDeleteView(final ClickEvent event) {
		initOps();
		deleteEntityEvent.fire(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {
		return invoiceitemItem;
	}

}

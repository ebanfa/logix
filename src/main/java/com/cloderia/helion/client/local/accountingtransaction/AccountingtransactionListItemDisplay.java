/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

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
@Templated(value = "list-accountingtransaction-page.html#accountingtransactionItem")
public class AccountingtransactionListItemDisplay extends AccountingtransactionPresenter implements IsElement {

	/**
	 * This element is the root element of this component (as declared in the
	 * {@code #orderItem} fragment of the {@link Templated#value()} above).
	 */
	@Inject
	@DataField
	private TableRow accountingtransactionItem = DOM.createTR().cast();
	
	@Inject
	@Named("td")
	@Bound(property="payment.name")
	@DataField
	private TableCell payment = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="fromParty.name")
	@DataField
	private TableCell fromParty = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="invoice.name")
	@DataField
	private TableCell invoice = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="fixedAsset.name")
	@DataField
	private TableCell fixedAsset = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="partyRole.name")
	@DataField
	private TableCell partyRole = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="transactionTy.name")
	@DataField
	private TableCell transactionTy = DOM.createTD().cast();
    	
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
	private TableCell description = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell transactionDt = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell entryDt = DOM.createTD().cast();

	@Inject
	@DataField
	private AnchorElement editEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@DataField
	private AnchorElement deleteEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@RenderSingleView
	private Event<AccountingtransactionListItemDisplay> renderSingleViewEvent;

	@Inject
	@RenderEditView
	private Event<AccountingtransactionListItemDisplay> renderEditViewEvent;

	@Inject
	@DeleteEntity
	private Event<AccountingtransactionListItemDisplay> deleteEntityEvent;
		
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
		return accountingtransactionItem;
	}

}

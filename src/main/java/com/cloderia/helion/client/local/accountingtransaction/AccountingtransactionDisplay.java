/**
 * 
 */
package com.cloderia.helion.client.local.accountingtransaction;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.dom.TableCell;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.DeleteEntity;
import com.cloderia.helion.client.local.ui.RenderEditView;
import com.cloderia.helion.client.local.ui.RenderDeleteView;
import com.cloderia.helion.client.shared.ops.AccountingtransactionOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Label;

/**
 * @author adrian
 *
 */
@Templated(value = "view-accountingtransaction-page.html#entityDisplayComponent")
public class AccountingtransactionDisplay extends AccountingtransactionPresenter implements IsElement {
	
	/**
	 * This element is the root element of this component (as declared in the
	 * {@code #orderItem} fragment of the {@link Templated#value()} above).
	 */
	@Inject
	@DataField
	private Div entityDisplayComponent;
	
  	@Inject 
  	@DataField
  	@Named("h4")
  	@Bound(property="entityCode")
  	private Heading code;
	
  	@Inject 
  	@Bound(converter = DateConverter.class)
  	@DataField
  	private Span createdDt;
	
  	@Inject 
  	@Bound(converter = DateConverter.class) 
  	@DataField
  	private Span lastModifiedDt;
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
	@Bound(property="universe.name")
	@DataField
	private TableCell universe = DOM.createTD().cast();
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
	TransitionTo<ListAccountingtransactionPage> listAccountingtransactionsPage;
	
	@Inject
	@RenderEditView
	private Event<AccountingtransactionDisplay> renderEditViewEvent;
	
	@Inject
	@DeleteEntity
	private Event<AccountingtransactionDisplay> deleteEntityEvent;
	
	@DataField
	private AnchorElement editAccountingtransactionBtn = DOM.createAnchor().cast();
	
	@DataField
	private AnchorElement deleteAccountingtransactionBtn = DOM.createAnchor().cast();
	
	@DataField
	protected AnchorElement listAccountingtransactionsPageLink = DOM.createAnchor().cast();
		
	
	@EventHandler("editAccountingtransactionBtn")
	public void onEditAccountingtransactionBtnClicked(ClickEvent e) {	
		initOps();
		renderEditViewEvent.fire(this);	
	}	
	
	@EventHandler("deleteAccountingtransactionBtn")
	public void onDeleteAccountingtransactionBtnClicked(ClickEvent e) { 
		initOps();
		deleteEntityEvent.fire(this);	
	}
		
    /**
	 * @param e
	 */
	@EventHandler("listAccountingtransactionsPageLink")
	public void onClickViewAllBtn(ClickEvent e) { listAccountingtransactionsPage.go();	}
	
	
	/* (non-Javadoc)
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {return entityDisplayComponent;	}

}

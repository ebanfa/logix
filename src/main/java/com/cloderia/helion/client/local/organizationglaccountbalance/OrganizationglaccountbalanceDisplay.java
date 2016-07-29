/**
 * 
 */
package com.cloderia.helion.client.local.organizationglaccountbalance;

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
import com.cloderia.helion.client.shared.ops.OrganizationglaccountbalanceOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Label;

/**
 * @author adrian
 *
 */
@Templated(value = "view-organizationglaccountbalance-page.html#entityDisplayComponent")
public class OrganizationglaccountbalanceDisplay extends OrganizationglaccountbalancePresenter implements IsElement {
	
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
	@Bound(property="glAccount.name")
	@DataField
	private TableCell glAccount = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="universe.name")
	@DataField
	private TableCell universe = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="accountingPeriod.name")
	@DataField
	private TableCell accountingPeriod = DOM.createTD().cast();

    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell entityCode = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell amount = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell effectiveDt = DOM.createTD().cast();
	
	@Inject
	TransitionTo<ListOrganizationglaccountbalancePage> listOrganizationglaccountbalancesPage;
	
	@Inject
	@RenderEditView
	private Event<OrganizationglaccountbalanceDisplay> renderEditViewEvent;
	
	@Inject
	@DeleteEntity
	private Event<OrganizationglaccountbalanceDisplay> deleteEntityEvent;
	
	@DataField
	private AnchorElement editOrganizationglaccountbalanceBtn = DOM.createAnchor().cast();
	
	@DataField
	private AnchorElement deleteOrganizationglaccountbalanceBtn = DOM.createAnchor().cast();
	
	@DataField
	protected AnchorElement listOrganizationglaccountbalancesPageLink = DOM.createAnchor().cast();
		
	
	@EventHandler("editOrganizationglaccountbalanceBtn")
	public void onEditOrganizationglaccountbalanceBtnClicked(ClickEvent e) {	
		initOps();
		renderEditViewEvent.fire(this);	
	}	
	
	@EventHandler("deleteOrganizationglaccountbalanceBtn")
	public void onDeleteOrganizationglaccountbalanceBtnClicked(ClickEvent e) { 
		initOps();
		deleteEntityEvent.fire(this);	
	}
		
    /**
	 * @param e
	 */
	@EventHandler("listOrganizationglaccountbalancesPageLink")
	public void onClickViewAllBtn(ClickEvent e) { listOrganizationglaccountbalancesPage.go();	}
	
	
	/* (non-Javadoc)
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {return entityDisplayComponent;	}

}

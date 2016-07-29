/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;

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
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Label;

/**
 * @author adrian
 *
 */
@Templated(value = "view-organizationgeneralledgeraccount-page.html#entityDisplayComponent")
public class OrganizationgeneralledgeraccountDisplay extends OrganizationgeneralledgeraccountPresenter implements IsElement {
	
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
	@Bound(property="organization.name")
	@DataField
	private TableCell organization = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="productCat.name")
	@DataField
	private TableCell productCat = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="universe.name")
	@DataField
	private TableCell universe = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="product.name")
	@DataField
	private TableCell product = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="glAccount.name")
	@DataField
	private TableCell glAccount = DOM.createTD().cast();

    	
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
	private TableCell fromDt = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell toDt = DOM.createTD().cast();
	
	@Inject
	TransitionTo<ListOrganizationgeneralledgeraccountPage> listOrganizationgeneralledgeraccountsPage;
	
	@Inject
	@RenderEditView
	private Event<OrganizationgeneralledgeraccountDisplay> renderEditViewEvent;
	
	@Inject
	@DeleteEntity
	private Event<OrganizationgeneralledgeraccountDisplay> deleteEntityEvent;
	
	@DataField
	private AnchorElement editOrganizationgeneralledgeraccountBtn = DOM.createAnchor().cast();
	
	@DataField
	private AnchorElement deleteOrganizationgeneralledgeraccountBtn = DOM.createAnchor().cast();
	
	@DataField
	protected AnchorElement listOrganizationgeneralledgeraccountsPageLink = DOM.createAnchor().cast();
		
	
	@EventHandler("editOrganizationgeneralledgeraccountBtn")
	public void onEditOrganizationgeneralledgeraccountBtnClicked(ClickEvent e) {	
		initOps();
		renderEditViewEvent.fire(this);	
	}	
	
	@EventHandler("deleteOrganizationgeneralledgeraccountBtn")
	public void onDeleteOrganizationgeneralledgeraccountBtnClicked(ClickEvent e) { 
		initOps();
		deleteEntityEvent.fire(this);	
	}
		
    /**
	 * @param e
	 */
	@EventHandler("listOrganizationgeneralledgeraccountsPageLink")
	public void onClickViewAllBtn(ClickEvent e) { listOrganizationgeneralledgeraccountsPage.go();	}
	
	
	/* (non-Javadoc)
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {return entityDisplayComponent;	}

}

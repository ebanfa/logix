/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

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
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Label;

/**
 * @author adrian
 *
 */
@Templated(value = "view-budgetitem-page.html#entityDisplayComponent")
public class BudgetitemDisplay extends BudgetitemPresenter implements IsElement {
	
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
	@Bound(property="itemTy.name")
	@DataField
	private TableCell itemTy = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="parentItem.name")
	@DataField
	private TableCell parentItem = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="universe.name")
	@DataField
	private TableCell universe = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="budget.name")
	@DataField
	private TableCell budget = DOM.createTD().cast();

    	
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
	private TableCell amount = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell justification = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell purpose = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell effectiveDt = DOM.createTD().cast();
	
	@Inject
	TransitionTo<ListBudgetitemPage> listBudgetitemsPage;
	
	@Inject
	@RenderEditView
	private Event<BudgetitemDisplay> renderEditViewEvent;
	
	@Inject
	@DeleteEntity
	private Event<BudgetitemDisplay> deleteEntityEvent;
	
	@DataField
	private AnchorElement editBudgetitemBtn = DOM.createAnchor().cast();
	
	@DataField
	private AnchorElement deleteBudgetitemBtn = DOM.createAnchor().cast();
	
	@DataField
	protected AnchorElement listBudgetitemsPageLink = DOM.createAnchor().cast();
		
	
	@EventHandler("editBudgetitemBtn")
	public void onEditBudgetitemBtnClicked(ClickEvent e) {	
		initOps();
		renderEditViewEvent.fire(this);	
	}	
	
	@EventHandler("deleteBudgetitemBtn")
	public void onDeleteBudgetitemBtnClicked(ClickEvent e) { 
		initOps();
		deleteEntityEvent.fire(this);	
	}
		
    /**
	 * @param e
	 */
	@EventHandler("listBudgetitemsPageLink")
	public void onClickViewAllBtn(ClickEvent e) { listBudgetitemsPage.go();	}
	
	
	/* (non-Javadoc)
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {return entityDisplayComponent;	}

}

/**
 * 
 */
package com.cloderia.helion.client.local.agreement;

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
@Templated(value = "list-agreement-page.html#agreementItem")
public class AgreementListItemDisplay extends AgreementPresenter implements IsElement {

	/**
	 * This element is the root element of this component (as declared in the
	 * {@code #orderItem} fragment of the {@link Templated#value()} above).
	 */
	@Inject
	@DataField
	private TableRow agreementItem = DOM.createTR().cast();
	
	@Inject
	@Named("td")
	@Bound(property="agreementTy.name")
	@DataField
	private TableCell agreementTy = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="partyRel.name")
	@DataField
	private TableCell partyRel = DOM.createTD().cast();
    	
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
	@Bound
	@DataField
	private TableCell text = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell agreementDt = DOM.createTD().cast();
    	
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
	@DataField
	private AnchorElement editEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@DataField
	private AnchorElement deleteEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@RenderSingleView
	private Event<AgreementListItemDisplay> renderSingleViewEvent;

	@Inject
	@RenderEditView
	private Event<AgreementListItemDisplay> renderEditViewEvent;

	@Inject
	@DeleteEntity
	private Event<AgreementListItemDisplay> deleteEntityEvent;
		
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
		return agreementItem;
	}

}

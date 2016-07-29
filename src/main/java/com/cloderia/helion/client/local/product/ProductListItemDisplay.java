/**
 * 
 */
package com.cloderia.helion.client.local.product;

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
@Templated(value = "list-product-page.html#productItem")
public class ProductListItemDisplay extends ProductPresenter implements IsElement {

	/**
	 * This element is the root element of this component (as declared in the
	 * {@code #orderItem} fragment of the {@link Templated#value()} above).
	 */
	@Inject
	@DataField
	private TableRow productItem = DOM.createTR().cast();
	
	@Inject
	@Named("td")
	@Bound(property="uom.name")
	@DataField
	private TableCell uom = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="manufacturer.name")
	@DataField
	private TableCell manufacturer = DOM.createTD().cast();
	@Inject
	@Named("td")
	@Bound(property="prodTy.name")
	@DataField
	private TableCell prodTy = DOM.createTD().cast();
    	
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
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell introductionDt = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell salesDiscDt = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound(converter = DateConverter.class)
	@DataField
	private TableCell supportDiscDt = DOM.createTD().cast();
    	
	@Inject
	@Named("td")
	@Bound
	@DataField
	private TableCell remarks = DOM.createTD().cast();

	@Inject
	@DataField
	private AnchorElement editEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@DataField
	private AnchorElement deleteEntityListItemBtn = DOM.createAnchor().cast();

	@Inject
	@RenderSingleView
	private Event<ProductListItemDisplay> renderSingleViewEvent;

	@Inject
	@RenderEditView
	private Event<ProductListItemDisplay> renderEditViewEvent;

	@Inject
	@DeleteEntity
	private Event<ProductListItemDisplay> deleteEntityEvent;
		
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
		return productItem;
	}

}

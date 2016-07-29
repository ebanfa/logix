/**
 * 
 */
package com.cloderia.helion.client.local.product;

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
import com.cloderia.helion.client.shared.ops.ProductOperation;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Label;

/**
 * @author adrian
 *
 */
@Templated(value = "view-product-page.html#entityDisplayComponent")
public class ProductDisplay extends ProductPresenter implements IsElement {
	
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
	@Bound(property="universe.name")
	@DataField
	private TableCell universe = DOM.createTD().cast();

    	
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
	TransitionTo<ListProductPage> listProductsPage;
	
	@Inject
	@RenderEditView
	private Event<ProductDisplay> renderEditViewEvent;
	
	@Inject
	@DeleteEntity
	private Event<ProductDisplay> deleteEntityEvent;
	
	@DataField
	private AnchorElement editProductBtn = DOM.createAnchor().cast();
	
	@DataField
	private AnchorElement deleteProductBtn = DOM.createAnchor().cast();
	
	@DataField
	protected AnchorElement listProductsPageLink = DOM.createAnchor().cast();
		
	
	@EventHandler("editProductBtn")
	public void onEditProductBtnClicked(ClickEvent e) {	
		initOps();
		renderEditViewEvent.fire(this);	
	}	
	
	@EventHandler("deleteProductBtn")
	public void onDeleteProductBtnClicked(ClickEvent e) { 
		initOps();
		deleteEntityEvent.fire(this);	
	}
		
    /**
	 * @param e
	 */
	@EventHandler("listProductsPageLink")
	public void onClickViewAllBtn(ClickEvent e) { listProductsPage.go();	}
	
	
	/* (non-Javadoc)
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {return entityDisplayComponent;	}

}

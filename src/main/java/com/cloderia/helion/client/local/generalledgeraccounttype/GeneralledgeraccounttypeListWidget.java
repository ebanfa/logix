/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.common.client.dom.DOMUtil;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.databinding.client.components.ListComponent;
import org.jboss.errai.databinding.client.components.ListContainer;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.local.ui.TableHeaderWidget;
import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;

/**
 * @author Edward Banfa
 *
 */
@Templated(value = "list-generalledgeraccounttype-page.html#listWidget")
public class GeneralledgeraccounttypeListWidget extends Composite {
	
	@Inject
	@Named("tbody")
	@DataField
	private  HTMLElement emptyList = DOM.createTBody().cast();
	
	@Inject
	@AutoBound
	private DataBinder<List<Generalledgeraccounttype>> binder;
	
	@Inject
	@DataField
	private TableHeaderWidget tableHeaderWidget;

	@Inject
	@Bound
	@DataField
	@ListContainer(value = "tbody")
	private ListComponent<Generalledgeraccounttype, GeneralledgeraccounttypeListItemDisplay> entityList;

	public void setItems(List<Generalledgeraccounttype> entities){
		DOMUtil.removeAllElementChildren(entityList.getElement());
		if (!entities.isEmpty()) {
			binder.getModel().addAll(entities);
		} else {
			DOMUtil.removeCSSClass(emptyList, "hide");
		}
	}
}

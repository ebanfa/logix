/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

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
import com.cloderia.helion.client.shared.model.Budgetitem;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;

/**
 * @author Edward Banfa
 *
 */
@Templated(value = "list-budgetitem-page.html#listWidget")
public class BudgetitemListWidget extends Composite {
	
	@Inject
	@Named("tbody")
	@DataField
	private  HTMLElement emptyList = DOM.createTBody().cast();
	
	@Inject
	@AutoBound
	private DataBinder<List<Budgetitem>> binder;
	
	@Inject
	@DataField
	private TableHeaderWidget tableHeaderWidget;

	@Inject
	@Bound
	@DataField
	@ListContainer(value = "tbody")
	private ListComponent<Budgetitem, BudgetitemListItemDisplay> entityList;

	public void setItems(List<Budgetitem> entities){
		DOMUtil.removeAllElementChildren(entityList.getElement());
		if (!entities.isEmpty()) {
			binder.getModel().addAll(entities);
		} else {
			DOMUtil.removeCSSClass(emptyList, "hide");
		}
	}
}

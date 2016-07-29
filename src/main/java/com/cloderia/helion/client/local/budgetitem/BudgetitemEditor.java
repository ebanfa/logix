/**
 * 
 */
package com.cloderia.helion.client.local.budgetitem;

import java.util.List;
import java.util.Date;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.DateInput;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.jboss.errai.ui.nav.client.local.TransitionTo;

import com.cloderia.helion.client.local.ui.DateConverter;
import com.cloderia.helion.client.local.ui.CreateEntity;
import com.cloderia.helion.client.local.ui.EditEntity;
import com.cloderia.helion.client.shared.model.Budgetitemtype;
import com.cloderia.helion.client.shared.model.Budgetitem;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Budget;
import com.cloderia.helion.client.shared.ops.BudgetitemOperation;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.user.client.DOM;
import com.google.gwt.core.client.JsDate;

/**
 * @author Edward Banfa
 *
 */
@Templated(value = "edit-budgetitem-page.html#budgetitemEditor")
public class BudgetitemEditor extends BudgetitemPresenter implements IsElement {

	@Inject
	@DataField
	private Div budgetitemEditor;
	
	@Inject
	@DataField
	private ListBox itemTy;
	@Inject
	@DataField
	private ListBox parentItem;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox budget;

	@Inject
	@Bound
	@DataField
	private TextBox entityCode;
	@Inject
	@Bound
	@DataField
	private TextBox name;
	@Inject
	@Bound
	@DataField
	private TextBox amount;
	@Inject
	@Bound
	@DataField
	private TextBox justification;
	@Inject
	@Bound
	@DataField
	private TextBox purpose;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editBudgetitemBtn = new Button();

	@Inject
	@EditEntity
	private Event<BudgetitemEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<BudgetitemEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListBudgetitemPage> listBudgetitemsPage;
	
	@DataField
	protected AnchorElement listBudgetitemsPageLink = DOM.createAnchor().cast();

	@EventHandler("editBudgetitemBtn")
	public void editBudgetitem(ClickEvent e) {
	Long itemTyId = Long.valueOf(itemTy.getSelectedValue());
	Long parentItemId = Long.valueOf(parentItem.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long budgetId = Long.valueOf(budget.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		BudgetitemOperation budgetitemOperation = initOps();
	    budgetitemOperation.setItemTyId(itemTyId);
	    budgetitemOperation.setParentItemId(parentItemId);
	    budgetitemOperation.setUniverseId(universeId);
	    budgetitemOperation.setBudgetId(budgetId);
		if (getEditMode())
			editEntityEvent.fire(this);
		else
			createEntityEvent.fire(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jboss.errai.common.client.api.IsElement#getElement()
	 */
	@Override
	public HTMLElement getElement() {
		return budgetitemEditor;
	}

	/**
	 * @return the editMode
	 */
	public Boolean getEditMode() {
		return editMode;
	}

	/**
	 * @param editMode
	 *            the editMode to set
	 */
	public void setEditMode(Boolean editMode) {
		this.editMode = editMode;
	}
	public void loadItemTys(List<Budgetitemtype> itemTys) {
		itemTy.addItem("", "Select Budgetitemtype");
		for (Budgetitemtype itemTyEntity : itemTys) {
			itemTy.addItem(itemTyEntity.getName(), itemTyEntity.getId().toString());
		}
	}
	public void loadParentItems(List<Budgetitem> parentItems) {
		parentItem.addItem("", "Select Budgetitem");
		for (Budgetitem parentItemEntity : parentItems) {
			parentItem.addItem(parentItemEntity.getName(), parentItemEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadBudgets(List<Budget> budgets) {
		budget.addItem("", "Select Budget");
		for (Budget budgetEntity : budgets) {
			budget.addItem(budgetEntity.getName(), budgetEntity.getId().toString());
		}
	}

	@EventHandler("listBudgetitemsPageLink")
	public void submit(ClickEvent e) {
		listBudgetitemsPage.go();
	}

}

/**
 * 
 */
package com.cloderia.helion.client.local.partytype;

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
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Partytype;
import com.cloderia.helion.client.shared.model.Partycategory;
import com.cloderia.helion.client.shared.ops.PartytypeOperation;
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
@Templated(value = "edit-partytype-page.html#partytypeEditor")
public class PartytypeEditor extends PartytypePresenter implements IsElement {

	@Inject
	@DataField
	private Div partytypeEditor;
	
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox parentType;
	@Inject
	@DataField
	private ListBox parentCategory;

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
	private TextBox description;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox effectiveDt;
	@DataField
	private Button editPartytypeBtn = new Button();

	@Inject
	@EditEntity
	private Event<PartytypeEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<PartytypeEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListPartytypePage> listPartytypesPage;
	
	@DataField
	protected AnchorElement listPartytypesPageLink = DOM.createAnchor().cast();

	@EventHandler("editPartytypeBtn")
	public void editPartytype(ClickEvent e) {
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long parentTypeId = Long.valueOf(parentType.getSelectedValue());
	Long parentCategoryId = Long.valueOf(parentCategory.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		PartytypeOperation partytypeOperation = initOps();
	    partytypeOperation.setUniverseId(universeId);
	    partytypeOperation.setParentTypeId(parentTypeId);
	    partytypeOperation.setParentCategoryId(parentCategoryId);
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
		return partytypeEditor;
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
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadParentTypes(List<Partytype> parentTypes) {
		parentType.addItem("", "Select Partytype");
		for (Partytype parentTypeEntity : parentTypes) {
			parentType.addItem(parentTypeEntity.getName(), parentTypeEntity.getId().toString());
		}
	}
	public void loadParentCategorys(List<Partycategory> parentCategorys) {
		parentCategory.addItem("", "Select Partycategory");
		for (Partycategory parentCategoryEntity : parentCategorys) {
			parentCategory.addItem(parentCategoryEntity.getName(), parentCategoryEntity.getId().toString());
		}
	}

	@EventHandler("listPartytypesPageLink")
	public void submit(ClickEvent e) {
		listPartytypesPage.go();
	}

}

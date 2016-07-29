/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;

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
import com.cloderia.helion.client.shared.ops.GeneralledgeraccounttypeOperation;
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
@Templated(value = "edit-generalledgeraccounttype-page.html#generalledgeraccounttypeEditor")
public class GeneralledgeraccounttypeEditor extends GeneralledgeraccounttypePresenter implements IsElement {

	@Inject
	@DataField
	private Div generalledgeraccounttypeEditor;
	
	@Inject
	@DataField
	private ListBox universe;

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
	private Button editGeneralledgeraccounttypeBtn = new Button();

	@Inject
	@EditEntity
	private Event<GeneralledgeraccounttypeEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<GeneralledgeraccounttypeEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListGeneralledgeraccounttypePage> listGeneralledgeraccounttypesPage;
	
	@DataField
	protected AnchorElement listGeneralledgeraccounttypesPageLink = DOM.createAnchor().cast();

	@EventHandler("editGeneralledgeraccounttypeBtn")
	public void editGeneralledgeraccounttype(ClickEvent e) {
	Long universeId = Long.valueOf(universe.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		GeneralledgeraccounttypeOperation generalledgeraccounttypeOperation = initOps();
	    generalledgeraccounttypeOperation.setUniverseId(universeId);
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
		return generalledgeraccounttypeEditor;
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

	@EventHandler("listGeneralledgeraccounttypesPageLink")
	public void submit(ClickEvent e) {
		listGeneralledgeraccounttypesPage.go();
	}

}

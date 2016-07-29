/**
 * 
 */
package com.cloderia.helion.client.local.universe;

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
import com.cloderia.helion.client.shared.ops.UniverseOperation;
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
@Templated(value = "edit-universe-page.html#universeEditor")
public class UniverseEditor extends UniversePresenter implements IsElement {

	@Inject
	@DataField
	private Div universeEditor;
	
	@Inject
	@DataField
	private ListBox parentUniverse;

	@Inject
	@Bound
	@DataField
	private TextBox entityCode;
	@Inject
	@Bound
	@DataField
	private TextBox businessNo;
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
	@Inject
	@Bound
	@DataField
	private TextBox universeTyCd;
	@DataField
	private Button editUniverseBtn = new Button();

	@Inject
	@EditEntity
	private Event<UniverseEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<UniverseEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListUniversePage> listUniversesPage;
	
	@DataField
	protected AnchorElement listUniversesPageLink = DOM.createAnchor().cast();

	@EventHandler("editUniverseBtn")
	public void editUniverse(ClickEvent e) {
	Long parentUniverseId = Long.valueOf(parentUniverse.getSelectedValue());
       	final JsDate effectiveDtDate = JsDate.create(effectiveDt.getValue());
       	this.getValue().setEffectiveDt(new Date((long) effectiveDtDate.getTime()));
       	
		UniverseOperation universeOperation = initOps();
	    universeOperation.setParentUniverseId(parentUniverseId);
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
		return universeEditor;
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
	public void loadParentUniverses(List<Universe> parentUniverses) {
		parentUniverse.addItem("", "Select Universe");
		for (Universe parentUniverseEntity : parentUniverses) {
			parentUniverse.addItem(parentUniverseEntity.getName(), parentUniverseEntity.getId().toString());
		}
	}

	@EventHandler("listUniversesPageLink")
	public void submit(ClickEvent e) {
		listUniversesPage.go();
	}

}

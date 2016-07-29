/**
 * 
 */
package com.cloderia.helion.client.local.organizationgeneralledgeraccount;

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
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.model.Productcategory;
import com.cloderia.helion.client.shared.model.Universe;
import com.cloderia.helion.client.shared.model.Product;
import com.cloderia.helion.client.shared.model.Generalledgeraccount;
import com.cloderia.helion.client.shared.ops.OrganizationgeneralledgeraccountOperation;
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
@Templated(value = "edit-organizationgeneralledgeraccount-page.html#organizationgeneralledgeraccountEditor")
public class OrganizationgeneralledgeraccountEditor extends OrganizationgeneralledgeraccountPresenter implements IsElement {

	@Inject
	@DataField
	private Div organizationgeneralledgeraccountEditor;
	
	@Inject
	@DataField
	private ListBox organization;
	@Inject
	@DataField
	private ListBox productCat;
	@Inject
	@DataField
	private ListBox universe;
	@Inject
	@DataField
	private ListBox product;
	@Inject
	@DataField
	private ListBox glAccount;

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
	private TextBox fromDt;
	@Inject
	@Bound(converter = DateConverter.class)
	@DataField
	private TextBox toDt;
	@DataField
	private Button editOrganizationgeneralledgeraccountBtn = new Button();

	@Inject
	@EditEntity
	private Event<OrganizationgeneralledgeraccountEditor> editEntityEvent;

	@Inject
	@CreateEntity
	private Event<OrganizationgeneralledgeraccountEditor> createEntityEvent;

	private Boolean editMode = false;
	
	@Inject
	TransitionTo<ListOrganizationgeneralledgeraccountPage> listOrganizationgeneralledgeraccountsPage;
	
	@DataField
	protected AnchorElement listOrganizationgeneralledgeraccountsPageLink = DOM.createAnchor().cast();

	@EventHandler("editOrganizationgeneralledgeraccountBtn")
	public void editOrganizationgeneralledgeraccount(ClickEvent e) {
	Long organizationId = Long.valueOf(organization.getSelectedValue());
	Long productCatId = Long.valueOf(productCat.getSelectedValue());
	Long universeId = Long.valueOf(universe.getSelectedValue());
	Long productId = Long.valueOf(product.getSelectedValue());
	Long glAccountId = Long.valueOf(glAccount.getSelectedValue());
       	final JsDate fromDtDate = JsDate.create(fromDt.getValue());
       	this.getValue().setFromDt(new Date((long) fromDtDate.getTime()));
       	final JsDate toDtDate = JsDate.create(toDt.getValue());
       	this.getValue().setToDt(new Date((long) toDtDate.getTime()));
       	
		OrganizationgeneralledgeraccountOperation organizationgeneralledgeraccountOperation = initOps();
	    organizationgeneralledgeraccountOperation.setOrganizationId(organizationId);
	    organizationgeneralledgeraccountOperation.setProductCatId(productCatId);
	    organizationgeneralledgeraccountOperation.setUniverseId(universeId);
	    organizationgeneralledgeraccountOperation.setProductId(productId);
	    organizationgeneralledgeraccountOperation.setGlAccountId(glAccountId);
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
		return organizationgeneralledgeraccountEditor;
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
	public void loadOrganizations(List<Party> organizations) {
		organization.addItem("", "Select Party");
		for (Party organizationEntity : organizations) {
			organization.addItem(organizationEntity.getName(), organizationEntity.getId().toString());
		}
	}
	public void loadProductCats(List<Productcategory> productCats) {
		productCat.addItem("", "Select Productcategory");
		for (Productcategory productCatEntity : productCats) {
			productCat.addItem(productCatEntity.getName(), productCatEntity.getId().toString());
		}
	}
	public void loadUniverses(List<Universe> universes) {
		universe.addItem("", "Select Universe");
		for (Universe universeEntity : universes) {
			universe.addItem(universeEntity.getName(), universeEntity.getId().toString());
		}
	}
	public void loadProducts(List<Product> products) {
		product.addItem("", "Select Product");
		for (Product productEntity : products) {
			product.addItem(productEntity.getName(), productEntity.getId().toString());
		}
	}
	public void loadGlAccounts(List<Generalledgeraccount> glAccounts) {
		glAccount.addItem("", "Select Generalledgeraccount");
		for (Generalledgeraccount glAccountEntity : glAccounts) {
			glAccount.addItem(glAccountEntity.getName(), glAccountEntity.getId().toString());
		}
	}

	@EventHandler("listOrganizationgeneralledgeraccountsPageLink")
	public void submit(ClickEvent e) {
		listOrganizationgeneralledgeraccountsPage.go();
	}

}

/**
 * 
 */
package com.cloderia.helion.client.local.partyroletype;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Partyroletype;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.PartyroletypeOperation;

/**
 * @author adrian
 *
 */
public class PartyroletypePresenter implements TakesValue<Partyroletype> {

	@Inject
	@AutoBound
	protected DataBinder<Partyroletype> binder;

	private PartyroletypeOperation partyroletypeOps;

	@Override
	public Partyroletype getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Partyroletype model) {
		binder.setModel(model);
	}

	/**
	 * @return the partyroletypeOps
	 */
	public PartyroletypeOperation getPartyroletypeOps() {
		return partyroletypeOps;
	}

	/**
	 * @param partyroletypeOps
	 *            the partyroletypeOps to set
	 */
	public void setPartyroletypeOps(PartyroletypeOperation partyroletypeOps) {
		this.partyroletypeOps = partyroletypeOps;
	}
	
	/**
	 * 
	 */
	protected PartyroletypeOperation initOps() {
		PartyroletypeOperation partyroletypeOperation = new PartyroletypeOperation(this.getValue());
		this.setPartyroletypeOps(partyroletypeOperation);
		return partyroletypeOperation;
	}

}

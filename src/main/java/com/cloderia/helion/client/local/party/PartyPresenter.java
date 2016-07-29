/**
 * 
 */
package com.cloderia.helion.client.local.party;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Party;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.PartyOperation;

/**
 * @author adrian
 *
 */
public class PartyPresenter implements TakesValue<Party> {

	@Inject
	@AutoBound
	protected DataBinder<Party> binder;

	private PartyOperation partyOps;

	@Override
	public Party getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Party model) {
		binder.setModel(model);
	}

	/**
	 * @return the partyOps
	 */
	public PartyOperation getPartyOps() {
		return partyOps;
	}

	/**
	 * @param partyOps
	 *            the partyOps to set
	 */
	public void setPartyOps(PartyOperation partyOps) {
		this.partyOps = partyOps;
	}
	
	/**
	 * 
	 */
	protected PartyOperation initOps() {
		PartyOperation partyOperation = new PartyOperation(this.getValue());
		this.setPartyOps(partyOperation);
		return partyOperation;
	}

}

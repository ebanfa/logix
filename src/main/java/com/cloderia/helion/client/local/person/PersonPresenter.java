/**
 * 
 */
package com.cloderia.helion.client.local.person;

import javax.inject.Inject;

import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;

import com.cloderia.helion.client.shared.model.Person;
import com.google.gwt.user.client.TakesValue;

import com.cloderia.helion.client.shared.ops.PersonOperation;

/**
 * @author adrian
 *
 */
public class PersonPresenter implements TakesValue<Person> {

	@Inject
	@AutoBound
	protected DataBinder<Person> binder;

	private PersonOperation personOps;

	@Override
	public Person getValue() {
		return binder.getModel();
	}

	@Override
	public void setValue(final Person model) {
		binder.setModel(model);
	}

	/**
	 * @return the personOps
	 */
	public PersonOperation getPersonOps() {
		return personOps;
	}

	/**
	 * @param personOps
	 *            the personOps to set
	 */
	public void setPersonOps(PersonOperation personOps) {
		this.personOps = personOps;
	}
	
	/**
	 * 
	 */
	protected PersonOperation initOps() {
		PersonOperation personOperation = new PersonOperation(this.getValue());
		this.setPersonOps(personOperation);
		return personOperation;
	}

}

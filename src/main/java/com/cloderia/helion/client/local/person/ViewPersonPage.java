/**
 * 
 */
package com.cloderia.helion.client.local.person;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Person;

/**
 * @author adrian
 *
 */
@Page(path = "/viewperson")
@Templated(value = "view-person-page.html#app-container")
public class ViewPersonPage extends BasePersonPage {

	@PageState
	private Long id;

	@Inject
	@AutoBound
	private DataBinder<Person> binder;

	@Inject
	@DataField
	private PersonDisplay entityDisplayComponent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		this.setViewTitle(BasePersonPage.VIEW_PERSON, "");
		personService.call(new RemoteCallback<Person>() {
			@Override
			public void callback(Person person) {
				binder.setModel(person);
				entityDisplayComponent.setValue(person);
			}
		}).findById(new Long(id));
	}
}

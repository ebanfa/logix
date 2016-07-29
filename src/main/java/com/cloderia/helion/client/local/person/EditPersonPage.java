/**
 * 
 */
package com.cloderia.helion.client.local.person;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Person;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/editperson")
@Templated(value = "edit-person-page.html#app-container")
public class EditPersonPage extends BasePersonPage {
	
	@Inject
	@DataField
	protected PersonEditor personEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadPartys(personEditor);
		loadUniverses(personEditor);
		personEditor.setEditMode(true);
		setViewTitle(BasePersonPage.UPDATE_PERSON, "");
		
		personService.call(new RemoteCallback<Person>() {
			@Override
			public void callback(Person person) {
				personEditor.setValue(person);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}

/**
 * 
 */
package com.cloderia.helion.client.local.person;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Person;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listperson")
@Templated(value = "list-person-page.html#app-container")
public class ListPersonPage extends BasePersonPage {

	@Inject
	@DataField
	private PersonListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewPersonLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewPersonLink")
	public void submit(ClickEvent e) { createPersonPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		personService.call(new RemoteCallback<List<Person>>() {
			@Override
			public void callback(List<Person> persons) {
				if (!persons.isEmpty()) listWidget.setItems(persons);
			}
		}).findAll();
	}
}

/**
 * 
 */
package com.cloderia.helion.client.local.systemuser;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Systemuser;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listsystemuser")
@Templated(value = "list-systemuser-page.html#app-container")
public class ListSystemuserPage extends BaseSystemuserPage {

	@Inject
	@DataField
	private SystemuserListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewSystemuserLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewSystemuserLink")
	public void submit(ClickEvent e) { createSystemuserPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		systemuserService.call(new RemoteCallback<List<Systemuser>>() {
			@Override
			public void callback(List<Systemuser> systemusers) {
				if (!systemusers.isEmpty()) listWidget.setItems(systemusers);
			}
		}).findAll();
	}
}

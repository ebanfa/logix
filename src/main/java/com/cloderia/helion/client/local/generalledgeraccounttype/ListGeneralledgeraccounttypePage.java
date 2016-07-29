/**
 * 
 */
package com.cloderia.helion.client.local.generalledgeraccounttype;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Generalledgeraccounttype;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listgeneralledgeraccounttype")
@Templated(value = "list-generalledgeraccounttype-page.html#app-container")
public class ListGeneralledgeraccounttypePage extends BaseGeneralledgeraccounttypePage {

	@Inject
	@DataField
	private GeneralledgeraccounttypeListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewGeneralledgeraccounttypeLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewGeneralledgeraccounttypeLink")
	public void submit(ClickEvent e) { createGeneralledgeraccounttypePage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		generalledgeraccounttypeService.call(new RemoteCallback<List<Generalledgeraccounttype>>() {
			@Override
			public void callback(List<Generalledgeraccounttype> generalledgeraccounttypes) {
				if (!generalledgeraccounttypes.isEmpty()) listWidget.setItems(generalledgeraccounttypes);
			}
		}).findAll();
	}
}

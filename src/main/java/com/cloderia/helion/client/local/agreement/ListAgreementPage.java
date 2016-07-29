/**
 * 
 */
package com.cloderia.helion.client.local.agreement;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Agreement;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listagreement")
@Templated(value = "list-agreement-page.html#app-container")
public class ListAgreementPage extends BaseAgreementPage {

	@Inject
	@DataField
	private AgreementListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewAgreementLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewAgreementLink")
	public void submit(ClickEvent e) { createAgreementPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		agreementService.call(new RemoteCallback<List<Agreement>>() {
			@Override
			public void callback(List<Agreement> agreements) {
				if (!agreements.isEmpty()) listWidget.setItems(agreements);
			}
		}).findAll();
	}
}

/**
 * 
 */
package com.cloderia.helion.client.local.partycategory;

import java.util.List;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Partycategory;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.DOM;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/listpartycategory")
@Templated(value = "list-partycategory-page.html#app-container")
public class ListPartycategoryPage extends BasePartycategoryPage {

	@Inject
	@DataField
	private PartycategoryListWidget listWidget;

	
	@DataField
	protected AnchorElement createNewPartycategoryLink = DOM.createAnchor().cast();
	

    /**
	 * @param e
	 */
	@EventHandler("createNewPartycategoryLink")
	public void submit(ClickEvent e) { createPartycategoryPage.go();	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		partycategoryService.call(new RemoteCallback<List<Partycategory>>() {
			@Override
			public void callback(List<Partycategory> partycategorys) {
				if (!partycategorys.isEmpty()) listWidget.setItems(partycategorys);
			}
		}).findAll();
	}
}

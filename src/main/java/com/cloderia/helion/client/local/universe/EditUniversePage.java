/**
 * 
 */
package com.cloderia.helion.client.local.universe;

import javax.inject.Inject;

import org.jboss.errai.common.client.api.RemoteCallback;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.cloderia.helion.client.shared.model.Universe;

/**
 * @author Edward Banfa
 *
 */
@Page(path = "/edituniverse")
@Templated(value = "edit-universe-page.html#app-container")
public class EditUniversePage extends BaseUniversePage {
	
	@Inject
	@DataField
	protected UniverseEditor universeEditor;
	
	@PageState
	private int id;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePortalPage#doSetup()
	 */
	@Override
	protected void doSetup() {
		loadParentUniverses(universeEditor);
		universeEditor.setEditMode(true);
		setViewTitle(BaseUniversePage.UPDATE_UNIVERSE, "");
		
		universeService.call(new RemoteCallback<Universe>() {
			@Override
			public void callback(Universe universe) {
				universeEditor.setValue(universe);
			}
		}).findById(new Long(id));
		super.doSetup();
	}
	
}

/**
 * 
 */
package com.cloderia.helion.client.local.ui;

import javax.inject.Inject;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

/**
 * @author adrian
 *
 */
@Templated(value = "index.html#app-container")
public class BasePortalPage extends BasePage {
	
	@Inject
	@DataField
	private NavBar header;
	
	@Inject
	@DataField
	private SideBar sidebar;

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePage#doSetup()
	 */
	@Override
	protected void doSetup() { 
		removeLoginPageTheme();
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.BasePage#doPageShown()
	 */
	@Override
	protected void doPageShown() {
		doDatePicker();
		doSelectPicker() ;
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.ui.BasePage#doTearDown()
	 */
	@Override
	protected void doTearDown() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.local.ui.BasePage#doPageHidden()
	 */
	@Override
	protected void doPageHidden() {
		// TODO Auto-generated method stub
		
	}
	
	protected void refreshWidgets() {
		refreshSelectPicker();
	}
	
	native double doDatePicker() /*-{
	   	if ($wnd.$('.date-time-picker')[0]) {
			$wnd.$('.date-time-picker').datetimepicker();
		}
		if ($wnd.$('.selectpicker')[0]) {
			$wnd.$('.selectpicker').selectpicker({
			  size: 4
			});
		}
	 }-*/;
	
	native double doSelectPicker() /*-{
		if ($wnd.$('.selectpicker')[0]) {
			$wnd.$('.selectpicker').selectpicker({
			  size: 4
			});
		}
	 }-*/;
	
	native void refreshSelectPicker() /*-{
		if ($wnd.$('.selectpicker')[0]) {
			$wnd.$('.selectpicker').selectpicker('refresh');
		}
	 }-*/;
}

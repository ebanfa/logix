/**
 * 
 */
package com.cloderia.helion.client.local.ui;

import java.util.HashMap;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

/**
 * @author adrian
 *
 */
public class UIUtils {
	
	/**
	 * @param component
	 * @return
	 */
	public static Multimap<String, String> buildPageIdMap(Long id) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id",id.toString());
		Multimap<String, String> multimap = Multimaps.forMap(map);
		return multimap;
	}

}

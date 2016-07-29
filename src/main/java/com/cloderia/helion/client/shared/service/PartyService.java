/**
 * 
 */
package com.cloderia.helion.client.shared.service;

import com.cloderia.helion.client.shared.ApplicationException;
import com.cloderia.helion.client.shared.model.Party;
import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.cloderia.helion.client.shared.ops.PartyOperation;

/**
 * @author Edward Banfa
 *
 */
public interface PartyService extends BaseEntityService<Party, PartyOperation> {

	
	public static final String INDIVIDUAL_PARTY_TYPE_CODE = "INDIVIDUAL";
	
	/**
	 * @param code
	 * @param name
	 * @param description
	 * @return
	 */
	public Party createIndividualTypeParty(String code, String name, String description) throws ApplicationException;
	
	/**
	 * @param code
	 * @param name
	 * @param description
	 * @return
	 */
	public Party createOrganizationTypeParty(String code, String name, String description) throws ApplicationException;

}

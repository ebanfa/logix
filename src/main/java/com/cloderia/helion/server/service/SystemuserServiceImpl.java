
/**
 * 
 */
package com.cloderia.helion.server.service;

import static com.cloderia.helion.client.shared.Operation.OperationType.CREATE;
import static com.cloderia.helion.client.shared.Operation.OperationType.UPDATE;

import java.util.Date;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.cloderia.helion.client.shared.ops.LoginOperation;
import com.cloderia.helion.client.shared.ops.SignUpOperation;
import com.cloderia.helion.client.shared.ApplicationException;
import com.cloderia.helion.client.shared.model.Systemuser;
import com.cloderia.helion.client.shared.ops.SystemuserOperation;
import com.cloderia.helion.client.shared.service.PartyService;
import com.cloderia.helion.client.shared.service.SystemuserService;
import com.cloderia.helion.client.shared.service.UniverseService;

/**
 * @author Edward Banfa
 *
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class SystemuserServiceImpl extends BaseEntityServiceImpl<Systemuser, SystemuserOperation> implements
		SystemuserService {

	@Inject
	PartyService partyService;

	@Inject
	UniverseService universeService;

	/**
	 * 
	 */
	public SystemuserServiceImpl() {
		super(Systemuser.class);
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getAllEntitesQuery() {
		return Systemuser.ALL_SYSTEMUSER_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.server.service.BaseEntityServiceImpl#getAllEntitesQueries()
	 */
	@Override
	public String getFindByCodeQuery() {
		return Systemuser.FIND_SYSTEMUSER_BY_CODE_QUERY;
	}
	
	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.shared.service.SystemuserService#login(com.cloderia.helion.client.shared.ops.LoginOperation)
	 */
	@Override
	public Systemuser login(LoginOperation loginPojo) throws ApplicationException {
		// Check if we already have a user enrolled with the same username
		Systemuser entity = findByCode(loginPojo.getUserName());
		if(entity == null) throw new ApplicationException("Invalid username or password");
		if(!entity.getPassword().equals(loginPojo.getPassword())) throw new ApplicationException("Invalid username or password");
		return entity;
	}

	/* (non-Javadoc)
	 * @see com.cloderia.helion.client.shared.service.SystemuserService#signUp(com.cloderia.helion.client.shared.ops.SignUpOperation)
	 */
	@Override
	public Systemuser signUp(SignUpOperation signUpPojo) throws ApplicationException {
		// Check if we already have a user enrolled with the same username
		if(findByCode(signUpPojo.getEmailAddress()) != null) throw new ApplicationException("Username already exist");
		
		Systemuser entity = setTextProperties(
				initDefaultProperties(new Systemuser()), 
				signUpPojo.getEmailAddress(), signUpPojo.getEmailAddress());
		
		entity.setPassword(signUpPojo.getPassword());
		entity.setUserNm(signUpPojo.getEmailAddress());
		entity.setLockedFg("Y");
		// Create and set the party for the new user we will be creating
		entity.setParty(partyService.createIndividualTypeParty(
				entity.getEntityCode(), entity.getName(), entity.getName()));
		
		return createOperation(new SystemuserOperation(entity));
	}

	@Override
	public Systemuser createOperation(SystemuserOperation systemuserOperation) {
		return super.createOperation(systemuserOperation);
	}
	
	@Override
	public Systemuser updateOperation(SystemuserOperation systemuserOperation) {
		Systemuser systemuser = systemuserOperation.getSystemuser();
		systemuser.setUniverse(universeService.findById(systemuserOperation.getUniverseId()));
		systemuser.setParty(partyService.findById(systemuserOperation.getPartyId()));
		systemuser.setLastModifiedDt(new Date());
		systemuser.setRecSt(ENTITY_STATUS_ACTIVE);
		systemuser.setLastModifiedUsr(DEFAULT_USER);
		systemuser = super.updateOperation(systemuserOperation);
		return systemuser;
	}
}
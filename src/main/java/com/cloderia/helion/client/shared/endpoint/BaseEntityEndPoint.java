/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.jboss.errai.bus.client.api.ClientMessageBus;

import com.cloderia.helion.client.shared.model.BaseEntity;
import com.cloderia.helion.client.shared.ops.BaseOperation;
import com.googlecode.gwtphonegap.client.contacts.Contact;

/**
 * @author adrian
 *
 */
public interface BaseEntityEndPoint<T extends BaseEntity, O extends BaseOperation<T>> {
	  /**
	   * @return A list of all entities in this service.
	   */
	  @GET
	  @Produces("application/json")
	  List<T> findAll();
	  
	  /**
	   * @param id
	   *          The id number of an existing {@link Contact} to be found.
	   * @return A {@link Response} with status 204 if successful. Otherwise a {@link Response} with an appropriate error
	   *         status.
	   */
	  @GET
	  @Path("/{id:[0-9]+}")
	  @Produces("application/json")
	  T findById(@PathParam("id") Long id);
	  
	  /**
	   * An HTTP endpoint for creating a new {@link T}.
	   *
	   * @param entity
	   *          Contains the {@link T} to be created and the {@link ClientMessageBus#getSessionId() queue session
	   *          id} of the client creating this contact.
	   * @return A {@link Response} with status 201 and a {@code Location} header with the URL for the created entity, if
	   *         successful. Otherwise a {@link Response} with an appropriate error status.
	   */
	  @POST
	  @Consumes("application/json")
	  Response createOperation(O entityOperation);

	  /**
	   * An HTTP endpoint for updating an existing {@link Contact}.
	   *
	   * @param entity
	   *          Contains the {@link T} to be updated and the {@link ClientMessageBus#getSessionId() queue session
	   *          id} of the client creating this contact. The id of the contained contact must match an existing contact
	   *          from this service.
	   * @return A {@link Response} with status 204 if successful. Otherwise a {@link Response} with an appropriate error
	   *         status.
	   */
	  @PUT
	  @Consumes("application/json")
	  Response updateOperation(O entityOperation);

	  /**
	   * @param id
	   *          The id number of an existing {@link Contact} to be deleted.
	   * @return A {@link Response} with status 204 if successful. Otherwise a {@link Response} with an appropriate error
	   *         status.
	   */
	  @DELETE
	  @Path("/{id:[0-9]+}")
	  Response deleteEntity(@PathParam("id") Long id);

	  /**
	   * @return A {@link Response} with status 204 if successful. Otherwise a {@link Response} with an appropriate error
	   *         status.
	   */
	  @DELETE
	  @Consumes("application/json")
	  Response deleteOperation(O entityOperation);
}

/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Uomconversion;
import com.cloderia.helion.client.shared.ops.UomconversionOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/uomconversion")
public interface UomconversionEndPoint extends BaseEntityEndPoint<Uomconversion, UomconversionOperation> {


}

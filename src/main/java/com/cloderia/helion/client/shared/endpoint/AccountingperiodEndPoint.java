/**
 * 
 */
package com.cloderia.helion.client.shared.endpoint;

import javax.ws.rs.Path;

import com.cloderia.helion.client.shared.model.Accountingperiod;
import com.cloderia.helion.client.shared.ops.AccountingperiodOperation;

/**
 * @author Edward Banfa
 *
 */
@Path("/accountingperiod")
public interface AccountingperiodEndPoint extends BaseEntityEndPoint<Accountingperiod, AccountingperiodOperation> {


}

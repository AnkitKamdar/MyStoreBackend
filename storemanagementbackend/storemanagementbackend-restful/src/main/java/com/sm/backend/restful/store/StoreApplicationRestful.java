/**
 * 
 */
package com.sm.backend.restful.store;

import javax.ws.rs.core.Response;

/**
 * @author user
 *
 */
public interface StoreApplicationRestful {

	/**
	 * This method is used to get all the stores .
	 * @return 
	 */
	Response getStore();
}

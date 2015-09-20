/**
 * 
 */
package com.sm.backend.restful.store;

import javax.ws.rs.core.Response;

import com.sm.backend.dto.StoreDto;

/**
 * @author user
 *
 */
public interface StoreApplicationRestful {

	/**
	 * This method is used to get all the stores .
	 * @return Response
	 */
	Response getStore();
	
	
	/**
	 * This method is used to create a store 
	 * @param _store
	 * @return Response
	 */
	Response createStore(final StoreDto _store);
}

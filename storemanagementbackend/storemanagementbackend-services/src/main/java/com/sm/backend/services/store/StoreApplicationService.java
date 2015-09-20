/**
 * 
 */
package com.sm.backend.services.store;

import java.util.List;

import com.sm.backend.dto.StoreDto;


/**
 * @author user
 *
 */
public interface StoreApplicationService {
	
	/**
	 * This method is used to get the stores
	 * @return List<StoreDto>
	 */
	List<StoreDto> getStore();
	
	
	/**
	 * This method is user to create a store
	 * @param _store
	 * @return String
	 */
	String createStore(final StoreDto _store);

}

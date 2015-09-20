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
	 * This method is used to get the stores .
	 */
	public List<StoreDto> getStore();

}

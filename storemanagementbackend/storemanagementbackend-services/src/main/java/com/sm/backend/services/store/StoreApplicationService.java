/**
 * 
 */
package com.sm.backend.services.store;

import java.util.List;

import com.sm.svc.domains.Store;


/**
 * @author user
 *
 */
public interface StoreApplicationService {
	
	/**
	 * This method is used to get the stores .
	 */
	public List<Store> getStore();

}

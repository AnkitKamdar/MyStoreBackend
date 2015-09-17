/**
 * 
 */
package com.sm.backend.integration.store;

import java.util.List;

import com.sm.svc.domains.Store;

/**
 * @author user
 *
 */
public interface StoreApplicationIntegration {
	
	/**
	 * This method is used to get the stores .
	 */
	public List<Store> getStore();

}

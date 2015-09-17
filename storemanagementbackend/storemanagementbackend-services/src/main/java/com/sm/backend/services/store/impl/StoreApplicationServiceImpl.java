/**
 * 
 */
package com.sm.backend.services.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.backend.integration.store.StoreApplicationIntegration;
import com.sm.backend.services.store.StoreApplicationService;
import com.sm.svc.domains.Store;

/**
 * @author user
 *
 */
@Service
public class StoreApplicationServiceImpl implements StoreApplicationService{
	
	@Autowired
	private StoreApplicationIntegration storeApplicationIntegration;
	
	public List<Store> getStore(){
		List<Store> stores = storeApplicationIntegration.getStore();
		return stores;
	}

}

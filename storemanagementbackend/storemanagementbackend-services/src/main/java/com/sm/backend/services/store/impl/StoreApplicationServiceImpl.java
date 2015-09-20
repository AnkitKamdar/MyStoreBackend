/**
 * 
 */
package com.sm.backend.services.store.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.backend.assembler.StoreAssembler;
import com.sm.backend.dto.StoreDto;
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
	
	public List<StoreDto> getStore(){
		List<Store> stores = storeApplicationIntegration.getStore();
		List<StoreDto> storeLst = new ArrayList<StoreDto>();
		for(Store store : stores){
			StoreDto storeDto = new StoreDto();
			storeDto = StoreAssembler.getStoreDto(store);
			storeLst.add(storeDto);
		}
		return storeLst;
	}

}

/**
 * 
 */
package com.sm.backend.assembler;

import com.sm.backend.dto.StoreDto;
import com.sm.svc.domains.Store;

/**
 * @author user
 *
 */
public class StoreAssembler {
	
	
	/**
	 * This method is used to convert StoreDto to Store Domain 
	 * @param _store
	 * @return Store
	 */
	public static Store getStore(final StoreDto _store){
		Store store = new Store();
		store.setStoreAddress(_store.getStoreAddress());
		store.setStoreCity(Integer.parseInt(_store.getStoreCity()));
		store.setStoreId(_store.getStoreId());
		store.setStoreLocality(Integer.parseInt(_store.getStoreLocality()));
		store.setStoreMobNo(Integer.parseInt(_store.getStoreMobNo()));
		store.setStoreName(_store.getStoreName());
		store.setStoreType(Integer.parseInt(_store.getStoreType()));
		return store;
	}
	
	/**
	 * This method is used to convert Store Domain to StoreDto  
	 * @param _store
	 * @return
	 */
	public static StoreDto getStoreDto(final Store _store){
		StoreDto store = new StoreDto();
		store.setStoreAddress(_store.getStoreAddress());
		store.setStoreCity(_store.getStoreCity().toString());
		store.setStoreId(_store.getStoreId());
		store.setStoreLocality(_store.getStoreLocality().toString());
		store.setStoreMobNo(_store.getStoreMobNo().toString());
		store.setStoreName(_store.getStoreName());
		store.setStoreType(_store.getStoreType().toString());
		return store;
	}

}

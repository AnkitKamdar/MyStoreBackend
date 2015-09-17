/**
 * 
 */
package com.sm.backend.restful.store.impl;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sm.backend.restful.store.StoreApplicationRestful;
import com.sm.backend.services.store.StoreApplicationService;
import com.sm.svc.domains.Store;


/**
 * @author user
 *
 */
@Component
@Path("/store")
public class StoreApplicationRestfulImpl  implements StoreApplicationRestful{
	
	@Autowired
	private StoreApplicationService storeApplicationService;
	
	@GET
	@Path("/getStore")
	//@Produces("application/json")
	public Response getStore(){
		//List<Store> result = storeService.getStore();
		List<Store> stores = storeApplicationService.getStore();
		return Response.status(200).entity(stores).build();
	}

}

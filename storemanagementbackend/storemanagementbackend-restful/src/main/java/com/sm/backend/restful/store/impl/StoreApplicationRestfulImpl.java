/**
 * 
 */
package com.sm.backend.restful.store.impl;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
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
	@Produces(MediaType.APPLICATION_XML)
	public Response getStore(){
		List<Store> stores = storeApplicationService.getStore();
		GenericEntity<List<Store>> storeList = new GenericEntity<List<Store>>(stores){};
		return Response.status(200).entity(storeList).build();
	}

}

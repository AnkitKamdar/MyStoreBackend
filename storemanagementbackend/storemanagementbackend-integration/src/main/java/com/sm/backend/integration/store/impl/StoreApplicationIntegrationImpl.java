/**
 * 
 */
package com.sm.backend.integration.store.impl;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.sm.backend.integration.store.StoreApplicationIntegration;
import com.sm.svc.domains.Store;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author user
 *
 */
@Component
public class StoreApplicationIntegrationImpl implements StoreApplicationIntegration{
	
	public List<Store> getStore(){
		List<Store> output = null;
		try {
			/*ClientConfig config = new DefaultClientConfig();
			config.getClasses().add(MyObjectMapper.class);*/
			/*Client client = Client.create();

			Builder resource = client.resource("http://localhost:8080/storemanagement/SM/store").path("getStore").type(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE);

			return resource.get(new GenericType<List<Store>>(){});*/
			WebResource resource = Client.create().resource("http://localhost:8080/storemanagement/SM/store");
		    ClientResponse clientResponse =
		        resource.path("getStore")
		        .type(MediaType.APPLICATION_JSON)
		        .get(ClientResponse.class);
		     System.out.println(clientResponse.getEntity(String.class));
		     //return null;
		    return clientResponse.getEntity(new GenericType<List<Store>>() {
		    });

			/*WebResource webResource = client
			   .resource("http://localhost:8080/storemanagement/SM/store/getStore");

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			output = response.getEntity(new GenericType<List<Store>>(){});
			
*/
		//	System.out.println("Output from Server .... \n");
		//	System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }
		return output;
	}
   
}

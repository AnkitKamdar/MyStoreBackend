/**
 * 
 */
package com.sm.backend.integration.common;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * @author user
 *
 */
@Component
public abstract class ApplicationIntegration {
	
	@Value("${sm.svc.rest.uri}")
	private String servicesRestUrl;
	
	/**
	 * This method gives the common Resource object to call Store management services
	 * @return
	 */
	public WebResource getResource(){
		Client client = Client.create();
		WebResource webResource = client
		   .resource(servicesRestUrl);
		 webResource.accept(MediaType.APPLICATION_XML);
		 return webResource;
	}

}

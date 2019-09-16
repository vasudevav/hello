package com.nt.rest.resources;

/*import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserService {

	@GET
	@Path("/get")
	public Response addUser(@HeaderParam("user-agent") String userAgent) {

		return Response.status(200)
			.entity("addUser is called, userAgent : " + userAgent)
			.build();

	}

}*/
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserService {

	@GET
	@Path("/get")
	public Response addUser(@Context HttpHeaders vasanth) {
		for(String header : vasanth.getRequestHeaders().keySet()){
			System.out.println(header);
		
	
	}
		return Response.status(200)
				.entity("addUser is called, userAgent : " + vasanth)
				.build();


}
}
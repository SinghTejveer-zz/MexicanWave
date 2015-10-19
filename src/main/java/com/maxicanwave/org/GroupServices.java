package com.maxicanwave.org;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("group")
public class GroupServices {


@Path("all")
@GET
@Produces(MediaType.TEXT_HTML)
public String getAllGroup()
{
	return "All Groups";
}

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_HTML)
public String joinGroup()
{
	return "Joined";
}


}

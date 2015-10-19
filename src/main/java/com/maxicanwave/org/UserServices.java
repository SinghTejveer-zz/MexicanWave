package com.maxicanwave.org;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.maxicanwave.manager.UserManage;
import com.maxicanwave.modal.Response;
import com.maxicanwave.modal.User;
import com.maxicanwave.utill.DBManager;

@Path("user")
public class UserServices {
	
	DBManager dbmanager = new  DBManager();
	UserManage userManger = new UserManage();
	Response reponse = new Response();
	@POST
	@Path("reg")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registerUser(User user)
	{

		int status= userManger.registerUser(user);
		if(status>0)
		{
			reponse.setStatus("Success");
			reponse.setMsg("User Registered");
		}
		else
		{
			reponse.setStatus("Failed");
			reponse.setMsg("User Not Register");
		}
		return reponse;
	}

	@POST
	@Path("login")
	public Response loginUser(User user)
	{
		int status = userManger.loginUser(user);
		if(status>0)
		{
			reponse.setStatus("Success");
			reponse.setMsg("User Authorized");
		}
		else
		{
			reponse.setStatus("Failed");
			reponse.setMsg("User Not Authorized");
		
		}
		return reponse;
	}
}

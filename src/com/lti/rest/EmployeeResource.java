package com.lti.rest;
import javax.ws.rs.*;


@Path("employee")
public class EmployeeResource {
	@GET
	@Path("{empno}")
	@Produces("application/json")
	public String getJson(@PathParam("empno") int empno)
	{
		switch(empno)
		{
		case 1 :return "{'name':'NameBeauty','age':60}";
		
		case 2 :return "{'name':'Yerra','age':28}";
		
		default :return "{'name':'Pikachu','age':28}";
		}
		
	}

}

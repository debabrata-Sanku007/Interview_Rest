package com.debu.test.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

import com.debu.test.Responses;
import com.debu.test.dao.TestDao;
import com.debu.test.exception.StringNotFoundException;


@Path("/testService")
public class TestService {
	TestDao testdao = new TestDao();

	@POST
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Responses getMap(@PathParam("id") String id){
		System.out.println("Successful");
		Responses rep = testdao.getMapResponse().get(id);
		if (rep == null){
			
		}
			//throw new StringNotFoundException("[" + id + "] is not Implemented..");

		return rep;
	}
}

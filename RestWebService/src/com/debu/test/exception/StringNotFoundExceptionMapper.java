package com.debu.test.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


public class StringNotFoundExceptionMapper implements ExceptionMapper<StringNotFoundException>{

	@Override
	public Response toResponse(StringNotFoundException ex) {
		ErrorMessage message=new ErrorMessage(ex.getMessage(), 500, "Inputed String not implemented in Map");
		return Response.status(Status.NOT_IMPLEMENTED).entity(message).build();
	}

}

package cl.forum.arq.bts.controller;

import javax.inject.Inject;
import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.forum.arq.bts.exception.ErrorMessage;
import cl.forum.arq.bts.service.OperationQuotationService;
import cl.forum.arq.bts.util.Validate;
import org.jboss.logging.Logger;

/**
* The ResourceController Class contains  samples of rest service that
* simply displays credit line detail,channel bifurcation and "Hello RESTEasy!" to the standard output.
*
* @author  Arquitectura
* @version 1.0
* @since   2022-06-15
*/
@Path("/")
public class ResourceController {
	@Inject
	Logger log;

	@Inject
	OperationQuotationService quotationService;
	private static final String ERRORHEADER = "Faltan valores en el header";

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/operation/quotation/v1/{data}")
	public Response getComunas(@HeaderParam("Token") String token, @HeaderParam("Canal") String canal, @HeaderParam("Usuario") String usuario,
							   @HeaderParam("Device") int device, @HeaderParam("Requerimiento") int requerimiento, @PathParam("data") int data){
		if(!Validate.isNullOrEmpty(token) && !Validate.isNullOrEmpty(canal) && !Validate.isNullOrEmpty(usuario) && !Validate.isNullOrEmpty(device) &&
		!Validate.isNullOrEmpty(requerimiento)){
			return quotationService.getOperationQuotation(token, canal, usuario, device, requerimiento, data);
		} else {
			ErrorMessage error = new ErrorMessage();
			error.setStatus(false);
			error.setMessage(ERRORHEADER);
			return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
		}

	}

}

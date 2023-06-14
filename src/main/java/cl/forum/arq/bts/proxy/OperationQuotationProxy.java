package cl.forum.arq.bts.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey ="getQuotation")
public interface OperationQuotationProxy {
    @GET
    @Path("{data}")
    @Produces(MediaType.APPLICATION_JSON)
    Response callGetOperationQuotation(@HeaderParam("Token") String token, @HeaderParam("Canal") String canal, @HeaderParam("Usuario") String usuario,
                            @HeaderParam("Device") int device, @HeaderParam("Requerimiento") int requerimiento, @PathParam("data") int data);
}

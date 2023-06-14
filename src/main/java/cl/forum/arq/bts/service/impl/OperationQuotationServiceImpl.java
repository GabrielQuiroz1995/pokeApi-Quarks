package cl.forum.arq.bts.service.impl;
import cl.forum.arq.bts.proxy.OperationQuotationProxy;
import cl.forum.arq.bts.service.OperationQuotationService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.core.Response;

@Singleton
public class OperationQuotationServiceImpl implements OperationQuotationService {
    @Inject
    Logger log;
    @RestClient
    OperationQuotationProxy quotationProxy;
    @Override
    public Response getOperationQuotation(String token, String canal, String usuario, int device, int requerimiento, int data) {
        Response respuesta = quotationProxy.callGetOperationQuotation(token, canal,usuario, device, requerimiento, data);
        return respuesta;
    }
}

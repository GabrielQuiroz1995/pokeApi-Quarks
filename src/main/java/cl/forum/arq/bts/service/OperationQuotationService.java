package cl.forum.arq.bts.service;

import javax.ws.rs.core.Response;

public interface OperationQuotationService {
    Response getOperationQuotation(String token, String canal, String usuario, int device, int requerimiento, int data);
}

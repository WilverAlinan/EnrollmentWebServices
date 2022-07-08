package edu.kalum.enrollment.core.beans;

import edu.kalum.enrollment.models.domain.Aspirante;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IAspiranteService {
    @WebMethod
    public Aspirante listarAspirante(String noExpediente);

}

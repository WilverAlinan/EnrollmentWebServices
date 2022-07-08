package edu.kalum.enrollment.core.beans;

import edu.kalum.enrollment.models.dao.IAspiranteDao;
import edu.kalum.enrollment.models.domain.Aspirante;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "edu.kalum.enrollment.core.beans.IAspiranteService")
public class AspiranteServiceImpl implements IAspiranteService{
    @Inject
    private IAspiranteDao aspiranteDao;
    @Override
    public Aspirante listarAspirante(String noExpediente) {
        return aspiranteDao.findById(noExpediente);
    }
}

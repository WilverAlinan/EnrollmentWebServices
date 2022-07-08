package edu.kalum.enrollment.core.beans;

import edu.kalum.enrollment.models.dao.IAspiranteDao;
import edu.kalum.enrollment.models.dao.ICarreraTecnicaDao;
import edu.kalum.enrollment.models.domain.CarreraTecnica;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import java.util.List;


@Stateless
@WebService(endpointInterface = "edu.kalum.enrollment.core.beans.ICarreraTecnicaService")
public class CarreraTecnicaServiceImpl implements ICarreraTecnicaService{


    @Inject
    private ICarreraTecnicaDao carreraTecnicaDao;

    @Override
    public List<CarreraTecnica> listarCarrerasTecnicas() {
        return carreraTecnicaDao.findAll();
    }

    @Override
    public CarreraTecnica listarCarreraTecnica(String carreraTecnicaId) {
         return carreraTecnicaDao.findById(carreraTecnicaId);
    }

    @Override
    public void insertarCarreratecnica(CarreraTecnica carreraTecnica) {
        carreraTecnicaDao.save(carreraTecnica);
    }

    @Override
    public void actualizarCarreraTecnica(CarreraTecnica carreraTecnica) {
       carreraTecnicaDao.update(carreraTecnica);
    }

    @Override
    public void eliminarCarreraTecnica(CarreraTecnica carreraTecnica) {
        carreraTecnicaDao.delete(carreraTecnica);

    }


}

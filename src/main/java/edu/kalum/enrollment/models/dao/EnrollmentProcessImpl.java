package edu.kalum.enrollment.models.dao;

import edu.kalum.enrollment.models.entities.EnrollmentRequest;
import edu.kalum.enrollment.models.entities.StatusEnrollmentProcess;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

@Stateless
public class EnrollmentProcessImpl implements IEnrollmentProcessDao{
    @PersistenceContext(unitName = "KALUM-DEV-PU")
    private EntityManager entityManager;

    @Override
    public StatusEnrollmentProcess executeEnrollmentProcess(EnrollmentRequest request) {
        StoredProcedureQuery enrrollmentProcess = entityManager.createStoredProcedureQuery("sp_enrollment_process")
                .registerStoredProcedureParameter("_no_expediente",String.class, ParameterMode.IN)
                .registerStoredProcedureParameter("_ciclo",String.class,ParameterMode.IN)
                .registerStoredProcedureParameter("_mes_inicio_pago", Integer.class, ParameterMode.IN)
                .registerStoredProcedureParameter("_carrera_id", String.class,ParameterMode.IN);
        enrrollmentProcess.setParameter("_no_expediente",request.getNoExpediente());
        enrrollmentProcess.setParameter("_ciclo",request.getCiclo());
        enrrollmentProcess.setParameter("_mes_inicio_pago",request.getMesInicioPago());
        enrrollmentProcess.setParameter("_carrera_id", request.getCarreraId());
        enrrollmentProcess.execute();
        Object[] resultado = (Object[]) enrrollmentProcess.getSingleResult();
        StatusEnrollmentProcess status = new StatusEnrollmentProcess(resultado[0].toString());
        return status;
    }
}

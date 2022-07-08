package edu.kalum.enrollment.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

//Implementa de Manera Logica.
//Getter y Setter.
@Data
//Constructor Nulo.
@NoArgsConstructor
//Constructor que Recibe Parametros.
@AllArgsConstructor

public class EnrollmentResponse implements Serializable {
    private int statusCode;
    private String description;

}

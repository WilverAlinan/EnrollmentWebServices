package edu.kalum.enrollment.models.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "jornada")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({@NamedQuery(name ="Jornada.findAll", query = "select j from Jornada j order by j.jornada")})
public class Jornada implements Serializable {

    @Id
    @Column(name = "jornada_id")
    private String jornadaId;
    @Column(name = "jornada")
    private String jornada;
    @Column(name = "descripcion")
    private String descripcion;

}

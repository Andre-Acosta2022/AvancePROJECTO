package Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Supervisoracademico")
public class SupervisorAcademico {
	@Id
	@Column(name = "id_persona", length = 18, nullable = false)
	 private int idSupervisorAcademico;
	@Column(name = "fechainicio")
	    private Date fechaInicio;
	@Column(name = "fechafin")
	    private Date fechaFin;
}

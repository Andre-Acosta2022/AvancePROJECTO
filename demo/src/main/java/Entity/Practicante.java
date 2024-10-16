package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "practicante")
public class Practicante {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_postulante", nullable = false)
	private Long idPostulante;

	@Column(name = "horas_acumuladas", nullable = false)
	private Integer horasAcumuladas;

	@Column(name = "horas_PS", length = 18)
	private String horasPS;

	@ManyToOne
	@JoinColumn(name = "id_persona", nullable = false)
	private Persona persona;

	
}

package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class SupervisorEmpresarial {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_SupervisorEmpresarial", nullable = false)
	private Long idsupervisorempresarial;

	@Column(name = "Estado", nullable = false)
	private char estado;


	@ManyToOne
	@JoinColumn(name = "id_persona", nullable = false)
	private Persona persona;

}

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
@Table(name="")
public class Solicitud {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_solicitud", nullable = false)
	private Long idsolicitud;

	@Column(name = "fecha Creación", nullable = false)
	private Integer Fecha_cracion;

	@Column(name = "Fecha Envio", length = 18)
	private String fecha_envio;

	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa empresa;

	
@ManyToOne
@JoinColumn(name = "id_estado", nullable = false)
private Estado estado;

}

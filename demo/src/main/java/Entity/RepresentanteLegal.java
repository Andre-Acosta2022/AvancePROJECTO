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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="representante Legal")
public class RepresentanteLegal {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_RepresentanteLegal", nullable = false)
	private Long idRepresentanteLeLong;

	@Column(name = "Cargo", nullable = false)
	private String cargo;

	@Column(name = "Estado", length = 18)
	private String estado;

	@ManyToOne
	@JoinColumn(name = "id_persona", nullable = false)
	private Persona persona;
}

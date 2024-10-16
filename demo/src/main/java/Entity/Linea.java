package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "linea")
public class Linea {
		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id Linea", nullable = false)
		private Long idlinea;

		@Column(name = "nombre", nullable = false)
		private Integer nombre;

		@Column(name = "Estado", length = 18)
		private String estado;

}

package Entity;

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
@Table(name="persona")
public class Persona {
	@Id
    @Column(name = "id_persona", length = 18, nullable = false)
    private Long idPersona;

    @Column(name = "nombre", length = 18)
    private String nombre;

    @Column(name = "apellido", length = 18)
    private String apellido;

    @Column(name = "email", length = 18)
    private String email;

    @Column(name = "telefono", length = 18)
    private Number telefono;

    @Column(name = "codigo", length = 18)
    private String codigo;

    @Column(name = "dni", length = 18)
    private char dni;
}

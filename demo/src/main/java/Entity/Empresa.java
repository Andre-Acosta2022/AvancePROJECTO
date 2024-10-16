package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Empresa {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empresa", nullable = false)
	private Long idempresa;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "ruc", length = 18)
	private String ruc;
	@Column(name = "Correo Electronico", nullable = false)
	private String correo_electronico;

	@Column(name = "telefono", length = 18)
	private String telefono;
	
	
	@Column(name = "Direccion", nullable = false)
	private String direccion;
	
	//*
	@ManyToOne
	@JoinColumn(name = "id_ubigeo", nullable = false)
	private Ubigeo ubigeo;
	
	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)
	private Estado estado;
	//*
}

package mx.com.gruposalinas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidad Clientes.
 * 
 * @author Omar Balbuena
 *
 */
@Entity
public class ClienteEntity {

	/**
	 * Identificador.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente", nullable = false)
	private Long id;

	/**
	 * Nombre del cliente.
	 */
	@Column(name = "nombr", nullable = false)
	private String nombre;

	/**
	 * Correo.
	 */
	@Column(name = "correo", nullable = false)
	private String correo;

	/**
	 * @param id
	 * @param nombre
	 * @param correo
	 */
	public ClienteEntity(Long id, String nombre, String correo) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
	}

	/**
	 * 
	 */
	public ClienteEntity() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

}

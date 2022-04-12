package mx.com.gruposalinas.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Representación Cliente.
 * 
 * @author Omar Balbuena
 *
 */
public class ClienteDetalleDTO {

	/**
	 * Identificador.
	 */
	@ApiModelProperty(value = "Identificador del cliente")
	private Long id;

	/**
	 * Nombre del cliente.
	 */
	@ApiModelProperty(value = "Nombre(s)", required = true)
	private String nombre;

	/**
	 * Correo.
	 */
	@ApiModelProperty(value = "Correo", required = true)
	private String correo;

	/**
	 * @param id
	 * @param nombre
	 * @param correo
	 */
	public ClienteDetalleDTO(Long id, String nombre, String correo) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
	}

	/**
	 * 
	 */
	public ClienteDetalleDTO() {
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

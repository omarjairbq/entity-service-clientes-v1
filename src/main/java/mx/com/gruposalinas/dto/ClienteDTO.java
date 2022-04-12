package mx.com.gruposalinas.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Representación Cliente.
 * 
 * @author Omar Balbuena
 *
 */
public class ClienteDTO {

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
	 * Constructor.
	 * 
	 * @param nombre
	 * @param correo
	 */
	public ClienteDTO(String nombre, String correo) {
		this.nombre = nombre;
		this.correo = correo;
	}

	/**
	 * Constructor.
	 */
	public ClienteDTO() {
		super();
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

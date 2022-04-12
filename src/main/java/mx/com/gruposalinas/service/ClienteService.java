package mx.com.gruposalinas.service;

import java.util.List;

import mx.com.gruposalinas.dto.ClienteDTO;
import mx.com.gruposalinas.dto.ClienteDetalleDTO;

/**
 * Interfaz servicio clientes.
 * 
 * @author Omar Balbuena
 *
 */
public interface ClienteService {

	/**
	 * Consulta de los clientes.
	 * 
	 * @return
	 */
	List<ClienteDetalleDTO> consultarClientes();

	/**
	 * Consulta del clientes.
	 * 
	 * @return
	 */
	ClienteDetalleDTO consultarCliente(Long id);

	/**
	 * Crear cliente.
	 * 
	 * @return
	 */
	ClienteDetalleDTO crearCliente(ClienteDTO requestCliente);

	/**
	 * Actualizar cliente.
	 * 
	 * @param id
	 * @param requestCliente
	 */
	void actualizarCliente(Long id, ClienteDTO requestCliente);

	/**
	 * Eliminar cliente.
	 * 
	 * @param id
	 */
	void eliminarCliente(Long id);
}

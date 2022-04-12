package mx.com.gruposalinas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import mx.com.gruposalinas.constantes.HttpStatus;
import mx.com.gruposalinas.dto.Cliente;
import mx.com.gruposalinas.dto.ClienteDetalle;

/**
 * Controlador operaciones clientes.
 * 
 * @author Omar Balbuena
 *
 */
@RestController
@Api(tags = "Clientes")
public class ClientesController {

	/**
	 * Consulta todos los clientes.
	 * 
	 * @return
	 */
	@GetMapping(path = "/clientes")
	@ApiOperation(code = HttpStatus.OK, value = "Consultar todos los clientes")
	@ApiResponses(value = { @ApiResponse(code = HttpStatus.OK, message = "Ejecución exitosa"),
			@ApiResponse(code = HttpStatus.UNEXPECTED_ERROR, message = "Error inesperado durante la ejecucion de la solicitud") })
	@ResponseStatus(org.springframework.http.HttpStatus.OK)
	public List<ClienteDetalle> obtenerClientes() {
		return new ArrayList<>();
	}

	/**
	 * Consulta detalle del cliente.
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(path = "/clientes/{id}")
	@ApiOperation(code = HttpStatus.OK, value = "Consultar cliente")
	@ApiResponses(value = { @ApiResponse(code = HttpStatus.OK, message = "Ejecución exitosa"),
			@ApiResponse(code = HttpStatus.NOT_FOUND, message = "Recurso no encontrado"),
			@ApiResponse(code = HttpStatus.UNEXPECTED_ERROR, message = "Error inesperado durante la ejecucion de la solicitud") })
	@ResponseStatus(org.springframework.http.HttpStatus.OK)
	public ClienteDetalle obtenerDetalleCliente(
			@ApiParam(required = true, name = "id", value = "Identificador del cliente") @PathVariable("id") final String id) {
		return new ClienteDetalle();
	}

	/**
	 * Creación del cliente.
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping(path = "/clientes")
	@ApiOperation(code = HttpStatus.OK, value = "Crear un cliente")
	@ApiResponses(value = { @ApiResponse(code = HttpStatus.OK, message = "Ejecución exitosa"),
			@ApiResponse(code = HttpStatus.BAD_REQUEST, message = "Solicitud Invalida"),
			@ApiResponse(code = HttpStatus.UNEXPECTED_ERROR, message = "Error inesperado durante la ejecucion de la solicitud") })
	@ResponseStatus(org.springframework.http.HttpStatus.OK)
	public ClienteDetalle crearCliente(
			@ApiParam(required = true, name = "requestCliente", value = "Cliente") @RequestBody final Cliente requestCliente) {
		return new ClienteDetalle();
	}

	/**
	 * Actualizar el cliente.
	 * 
	 * @param id
	 * @return
	 */
	@PutMapping(path = "/clientes/{id}")
	@ApiOperation(code = HttpStatus.NO_CONTENT, value = "Actualizar un Cliente")
	@ApiResponses(value = { @ApiResponse(code = HttpStatus.NO_CONTENT, message = "Actualización exitosa"),
			@ApiResponse(code = HttpStatus.NOT_FOUND, message = "Recurso no encontrado"),
			@ApiResponse(code = HttpStatus.BAD_REQUEST, message = "Solicitud Invalida"),
			@ApiResponse(code = HttpStatus.UNEXPECTED_ERROR, message = "Error inesperado durante la ejecucion de la solicitud") })
	@ResponseStatus(org.springframework.http.HttpStatus.NO_CONTENT)
	public void actualizarCliente(
			@ApiParam(required = true, name = "id", value = "Identificador del cliente") @PathVariable("id") final String id,
			@ApiParam(required = true, name = "requestCliente", value = "Cliente") @RequestBody final Cliente requestCliente) {

	}

	/**
	 * Eliminación cliente.
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping(path = "/clientes/{id}")
	@ApiOperation(code = HttpStatus.NO_CONTENT, value = "Eliminar un Cliente")
	@ApiResponses(value = { @ApiResponse(code = HttpStatus.NO_CONTENT, message = "Eliminación exitosa"),
			@ApiResponse(code = HttpStatus.NOT_FOUND, message = "Recurso no encontrado"),
			@ApiResponse(code = HttpStatus.UNEXPECTED_ERROR, message = "Error inesperado durante la ejecucion de la solicitud") })
	@ResponseStatus(org.springframework.http.HttpStatus.NO_CONTENT)
	public void eliminarCliente(
			@ApiParam(required = true, name = "id", value = "Identificador del cliente") @PathVariable("id") final String id) {

	}

}

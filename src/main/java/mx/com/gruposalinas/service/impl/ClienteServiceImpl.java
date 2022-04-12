package mx.com.gruposalinas.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import mx.com.gruposalinas.dto.ClienteDTO;
import mx.com.gruposalinas.dto.ClienteDetalleDTO;
import mx.com.gruposalinas.model.ClienteEntity;
import mx.com.gruposalinas.repository.ClienteRepository;
import mx.com.gruposalinas.service.ClienteService;

/**
 * Implementación servicio.
 * 
 * @author Omar Balbuena
 *
 */
@Service
public class ClienteServiceImpl implements ClienteService {

	/**
	 * Repositorio de clientes.
	 */
	private ClienteRepository repository;

	/**
	 * Objeto Dozer para mapear.
	 */
	private Mapper dozerMapper;

	/**
	 * @param repository
	 */
	public ClienteServiceImpl(ClienteRepository repository, Mapper dozerMapper) {
		this.repository = repository;
		this.dozerMapper = dozerMapper;
	}

	@Override
	public List<ClienteDetalleDTO> consultarClientes() {
		List<ClienteEntity> clienteList = this.repository.findAll();

		return clienteList.stream().map(cliente -> this.dozerMapper.map(cliente, ClienteDetalleDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public ClienteDetalleDTO consultarCliente(Long id) {
		ClienteEntity clienteOptional = this.consultarClienteById(id);

		return this.dozerMapper.map(clienteOptional, ClienteDetalleDTO.class);
	}

	@Override
	public ClienteDetalleDTO crearCliente(ClienteDTO requestCliente) {
		ClienteEntity entity = this.dozerMapper.map(requestCliente, ClienteEntity.class);

		ClienteEntity clienteNuevo = this.repository.save(entity);
		return this.dozerMapper.map(clienteNuevo, ClienteDetalleDTO.class);
	}

	@Override
	public void actualizarCliente(Long id, ClienteDTO requestCliente) {
		ClienteEntity clienteEntity = this.consultarClienteById(id);

		clienteEntity.setCorreo(requestCliente.getCorreo());
		clienteEntity.setNombre(requestCliente.getNombre());

		this.repository.save(clienteEntity);
	}

	@Override
	public void eliminarCliente(Long id) {
		ClienteEntity clienteEntity = this.consultarClienteById(id);

		this.repository.delete(clienteEntity);
	}

	private ClienteEntity consultarClienteById(Long id) {
		Optional<ClienteEntity> clienteOptional = this.repository.findById(id);

		if (!clienteOptional.isPresent()) {
			throw new EntityNotFoundException(id.toString());
		}

		return clienteOptional.get();
	}

}

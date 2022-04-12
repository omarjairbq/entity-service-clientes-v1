package mx.com.gruposalinas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.gruposalinas.model.ClienteEntity;

/**
 * Repositorio clientes.
 * 
 * @author Omar Balbuena
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

}

package br.com.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.store.entities.ClientesEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClientesEntity, Long> {

}
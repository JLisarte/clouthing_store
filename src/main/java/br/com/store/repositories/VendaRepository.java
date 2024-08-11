package br.com.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.store.entities.VendasEntity;

@Repository
public interface VendaRepository extends JpaRepository<VendasEntity, Long> {

}
package br.com.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.store.entities.FuncionariosEntity;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionariosEntity, Long> {

}
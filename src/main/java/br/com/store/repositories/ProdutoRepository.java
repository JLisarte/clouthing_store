package br.com.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.store.entities.ProdutosEntity;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutosEntity, Long> {

}
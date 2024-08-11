package br.com.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.store.entities.ProdutosEntity;
import br.com.store.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public ProdutosEntity getProdutoById(Long id) { 
		return produtoRepository.findById(id).get(); 
	}
	
	public ProdutosEntity saveProdutos(ProdutosEntity produtosEntity){
        return produtoRepository.save(produtosEntity);
    }
	
	public List<ProdutosEntity> findAllProdutos() {
		return produtoRepository.findAll();
	}
}
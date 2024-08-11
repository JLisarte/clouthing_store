package br.com.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.store.entities.ProdutosEntity;
import br.com.store.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping
	public ProdutosEntity saveProduto(@RequestBody ProdutosEntity produtosEntity) {		
		return produtoService.saveProdutos(produtosEntity);		
	}
	
	@GetMapping("findbyid/{id}")
    public ProdutosEntity findById(@PathVariable Long id){
        return produtoService.getProdutoById(id);
    }
	
	@GetMapping("/findall")
	public List<ProdutosEntity> findall() {
		return produtoService.findAllProdutos();
	}
	
	@GetMapping("/teste")
	public String testEndpoint() {
		return "Funcionando";
	}
}
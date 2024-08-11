package br.com.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.store.entities.FuncionariosEntity;
import br.com.store.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@PostMapping
	public FuncionariosEntity saveFuncionario(@RequestBody FuncionariosEntity funcionariosEntity) {		
		return funcionarioService.saveFuncionarios(funcionariosEntity);		
	}
	
	@GetMapping("findbyid/{id}")
    public FuncionariosEntity findById(@PathVariable Long id){
        return funcionarioService.getFuncionarioById(id);
    }
	
	@GetMapping("/findall")
	public List<FuncionariosEntity> findall() {
		return funcionarioService.findAllFuncionarios();
	}
	
	@GetMapping("/teste")
	public String testEndpoint() {
		return "Funcionando";
	}
}
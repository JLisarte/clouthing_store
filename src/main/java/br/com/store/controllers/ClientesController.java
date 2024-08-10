package br.com.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.store.entities.ClientesEntity;
import br.com.store.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ClientesEntity saveCliente(@RequestBody ClientesEntity clientesEntity) {		
		return clienteService.saveClientes(clientesEntity);		
	}
	
	@GetMapping("findbyid/{id}")
    public ClientesEntity findById(@PathVariable Long id){
        return clienteService.getClienteById(id);
    }
	
	@GetMapping("/findall")
	public List<ClientesEntity> findall() {
		return clienteService.findAllClientes();
	}
	
	@GetMapping("/teste")
	public String testEndpoint() {
		return "Funcionando";
	}
}
package br.com.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.store.entities.VendasEntity;
import br.com.store.services.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendasController {
	
	@Autowired
	private VendaService vendaService;
	
	@PostMapping
	public VendasEntity saveVenda(@RequestBody VendasEntity vendaEntity) {		
		return vendaService.saveVendas(vendaEntity);		
	}
	
	@GetMapping("findbyid/{id}")
    public VendasEntity findById(@PathVariable Long id){
        return vendaService.getVendaById(id);
    }
	
	@GetMapping("/findall")
	public List<VendasEntity> findall() {
		return vendaService.findAllVendas();
	}
	
	@GetMapping("/teste")
	public String testEndpoint() {
		return "Funcionando";
	}
}
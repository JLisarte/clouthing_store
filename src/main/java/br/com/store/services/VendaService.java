package br.com.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.store.entities.VendasEntity;
import br.com.store.repositories.VendaRepository;

@Service
public class VendaService {
	
	
	@Autowired
	private VendaRepository vendaRepository;
	
	public VendasEntity getVendaById(Long id) { 
		return vendaRepository.findById(id).get(); 
	}
	
	public VendasEntity saveVendas(VendasEntity vendasEntity){
        return vendaRepository.save(vendasEntity);
    }
	
	public List<VendasEntity> findAllVendas() {
		return vendaRepository.findAll();
	}
}
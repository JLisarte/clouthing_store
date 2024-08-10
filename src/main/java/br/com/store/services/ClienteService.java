package br.com.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.store.entities.ClientesEntity;
import br.com.store.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClientesEntity getClienteById(Long id) { 
		return clienteRepository.findById(id).get(); 
	}
	
	public ClientesEntity saveClientes(ClientesEntity clientesEntity){
        return clienteRepository.save(clientesEntity);
    }
	
	public List<ClientesEntity> findAllClientes() {
		return clienteRepository.findAll();
	}
}
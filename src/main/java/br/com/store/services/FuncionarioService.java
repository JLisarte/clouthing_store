package br.com.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.store.entities.FuncionariosEntity;
import br.com.store.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public FuncionariosEntity getFuncionarioById(Long id) { 
		return funcionarioRepository.findById(id).get(); 
	}
	
	public FuncionariosEntity saveFuncionarios(FuncionariosEntity funcionarioEntity){
        return funcionarioRepository.save(funcionarioEntity);
    }
	
	public List<FuncionariosEntity> findAllFuncionarios() {
		return funcionarioRepository.findAll();
	}
}
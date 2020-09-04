package com.fabioprudencio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabioprudencio.cursomc.domain.Estado;
import com.fabioprudencio.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado buscar(Integer id) {
		Optional<Estado> obj = repo.findById(id);    
		return obj.orElse(null);
	}

}

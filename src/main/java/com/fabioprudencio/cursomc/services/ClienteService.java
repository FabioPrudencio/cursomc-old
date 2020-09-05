package com.fabioprudencio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabioprudencio.cursomc.domain.Cliente;
import com.fabioprudencio.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {	
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElse(null);
	}

}

package com.nubelity.projectv2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubelity.projectv2.model.Profesor;
import com.nubelity.projectv2.repository.ProfesorRepository;

@Service
public class ProfesorService {
	@Autowired
    public ProfesorRepository profesorRepository;

	public List<Profesor> getAllUsers()
	{
		return profesorRepository.findAll();
	}
	
	public Profesor crearUsuario(Profesor usuario) {
        return profesorRepository.save(usuario);
    }
}

package com.nubelity.projectv2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubelity.projectv2.model.Materia;
import com.nubelity.projectv2.repository.MateriaRepository;

@Service
public class MateriaService {
	
	@Autowired
    public MateriaRepository materiaRepository;

	public List<Materia> buscarPorNombre(String materia) {
		return materiaRepository.findByMateria(materia);
	}

	public List<Materia> obtenerMaterias() {
		return materiaRepository.findAll();
	}

	public Materia insertarMaterias(Materia materia) {
		return materiaRepository.save(materia);
	}
	
	public boolean eliminarMateria(Long id) {

		if (materiaRepository.existsById(id)) {
			materiaRepository.deleteById(id);
			return true;
		} else {
			return false;
		}

	}
	
}



package com.nubelity.projectv2.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubelity.projectv2.model.Alumno;
import com.nubelity.projectv2.model.Materia;
import com.nubelity.projectv2.repository.AlumnoRepository;
import com.nubelity.projectv2.utils.Constants;

@Service
public class AlumnoService {

	@Autowired
	public AlumnoRepository alumnoRepository;

	public List<Alumno> buscarPorNombre(String nombre) {
		return alumnoRepository.findByNombre(nombre);
	}

	public List<Alumno> obtenerAlumnos() {
		return alumnoRepository.findAll();
	}

	public Alumno actualizarAlumno(Long id, String email) {

		Alumno alumno = alumnoRepository.findById(id).orElseThrow(() -> 
		new RuntimeException(Constants.ALUMNO_NO_ENCONTRADO));
		alumno.setEmail(email);

		return alumnoRepository.save(alumno);
	}

	public Alumno insertarAlumnos(Alumno alumno) {
		
		Alumno alumnoNew = new Alumno();
		alumnoNew.setNombre(alumno.getNombre());
		
        Set<Materia> materias = alumno.getMateria();
        
        alumnoNew.setMateria(materias);
        alumnoNew.setApellidoMaterno(alumno.getApellidoMaterno());
        alumnoNew.setApellidoPaterno(alumno.getApellidoPaterno());
        alumnoNew.setEmail(alumno.getEmail());
        alumnoNew.setNumeroMovil(alumno.getNumeroMovil());
        
		return alumnoRepository.save(alumnoNew);
	}

	public boolean eliminarAlumnos(Long id) {

		if (alumnoRepository.existsById(id)) {
			alumnoRepository.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

}

package com.nubelity.projectv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubelity.projectv2.model.Materia;
import com.nubelity.projectv2.service.MateriaService;

@RestController
@Validated
@RequestMapping("/api/materias")
public class MateriaController {

	@Autowired
	private MateriaService materiaservice;

	@GetMapping("/getMaterias")
	public List<Materia> listMaterias() {
		List<Materia> materias = materiaservice.obtenerMaterias();
		return materias;
	}

	@PostMapping("/save")
	public Materia saveAlumno(@RequestBody Materia materia) {
		return materiaservice.insertarMaterias(materia);
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteAlumno(@PathVariable Long id) {
		return materiaservice.eliminarMateria(id);

	}


}

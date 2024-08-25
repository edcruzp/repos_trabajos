package com.nubelity.projectv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubelity.projectv2.model.Alumno;
import com.nubelity.projectv2.service.AlumnoService;

@RestController
@Validated
@RequestMapping("/api/alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;

	@GetMapping("/getAlumnos")
	public List<Alumno> listAlumnos() {
		List<Alumno> alumnos = alumnoService.obtenerAlumnos();
		return alumnos;
	}

	@PostMapping("/save")
	public Alumno saveAlumno(@RequestBody Alumno alumno) {
		return alumnoService.insertarAlumnos(alumno);
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteAlumno(@PathVariable Long id) {
		return alumnoService.eliminarAlumnos(id);

	}

	@PutMapping("/update/email/{id}")
	public Alumno actualizarAlumno(@PathVariable Long id, @RequestBody Alumno alumnoActualizado) {
		return alumnoService.actualizarAlumno(id, alumnoActualizado.getEmail());
	}

}

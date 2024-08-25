package com.nubelity.projectv2.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public class Alumno {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)	
	public Long id;
	
	public String nombre;

	@OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
	public Set<Materia> materia;
	
	public String apellidoPaterno;

	public String apellidoMaterno;

	public String email;

	public Long numeroMovil;


	

}

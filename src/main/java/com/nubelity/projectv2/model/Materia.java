package com.nubelity.projectv2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Materia {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	public String nombre;
	
	@ManyToOne
    @JoinColumn(name = "alumno_id")
	public Alumno alumno;
	
	@OneToOne
    @JoinColumn(name = "profesor_id")
	public Profesor profesor;
	
}

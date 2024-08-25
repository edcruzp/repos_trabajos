package com.nubelity.projectv2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nubelity.projectv2.model.Alumno;
import com.nubelity.projectv2.utils.Constants;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

	
	@Query(Constants.QUERY_FINDBYNAME)
    List<Alumno> findByNombre(@Param(Constants.NOMBRE) String nombre);
	
}

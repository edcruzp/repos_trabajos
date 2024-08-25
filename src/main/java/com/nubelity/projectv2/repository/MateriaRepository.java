package com.nubelity.projectv2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nubelity.projectv2.model.Materia;
import com.nubelity.projectv2.utils.Constants;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
	
		@Query(Constants.QUERY_FINDBYMATERIA)
	    List<Materia> findByMateria(@Param(Constants.NOMBRE) String materia);
		
}

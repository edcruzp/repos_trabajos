package com.nubelity.projectv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nubelity.projectv2.model.Profesor;


@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

}

package com.nubelity.projectv2.repository.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.nubelity.projectv2.model.Alumno;
import com.nubelity.projectv2.model.Materia;
import com.nubelity.projectv2.repository.AlumnoRepository;
import com.nubelity.projectv2.service.AlumnoService;

public class AlumnoRepositoryTests {
	
	 @Mock
	 private AlumnoRepository alumnoRepository;
	 
	 @InjectMocks
	    private AlumnoService alumnoService;
	 
	 
	 @BeforeEach
	    void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }
	 
	 
	 @Test
	    void testActualizarAlumnoExitoso() {
	        // Configura el comportamiento esperado del mock
	        Alumno alumnoExistente = new Alumno();
	        alumnoExistente.setId(1L);
	        alumnoExistente.setEmail("antiguo@ejemplo.com");

	        when(alumnoRepository.findById(1L)).thenReturn(Optional.of(alumnoExistente));
	        when(alumnoRepository.save(any(Alumno.class))).thenReturn(alumnoExistente);

	        // Llama al método que quieres probar
	        Alumno alumnoActualizado = alumnoService.actualizarAlumno(1L, "nuevo@ejemplo.com");

	        // Verifica el resultado esperado
	        assertEquals("nuevo@ejemplo.com", alumnoActualizado.getEmail());
	        verify(alumnoRepository).findById(1L);
	        verify(alumnoRepository).save(alumnoExistente);
	    }
	 
	 @Test
	    void testinsertAlumno() {
	        // Configura el comportamiento esperado del mock
	        Alumno alumnoExistente = new Alumno();
	        alumnoExistente.setNombre("Eduardo");
	        
	        Materia matematica = new Materia();
	        Materia fisica = new Materia();
	        fisica.setNombre("fisica");
	        matematica.setNombre("matematicas");
	        
	        Set<Materia> materias = new HashSet<>();
	        materias.add(matematica);
	        materias.add(fisica);
	        
	        alumnoExistente.setMateria(materias);
	        alumnoExistente.setApellidoMaterno("materno");
	        alumnoExistente.setApellidoPaterno("paterno");
	        alumnoExistente.setEmail("aioshfioa@ahotm.com");

	        when(alumnoRepository.save(any(Alumno.class))).thenReturn(alumnoExistente);

	        // Llama al método que quieres probar
	        Alumno alumnoActualizado = alumnoService.insertarAlumnos(alumnoExistente);

	        // Verifica el resultado esperado
	        assertEquals("Eduardo", alumnoActualizado.getNombre());
	        verify(alumnoRepository).save(alumnoExistente);
	    }
	 
	 
	 @Test
	    public void testEliminarAlumnos_ExistenAlumnos() {
	        // Configura el comportamiento del mock
	        Long id = 1L;
	        when(alumnoRepository.existsById(id)).thenReturn(true);

	        // Llama al método que se está probando
	        boolean resultado = alumnoService.eliminarAlumnos(id);

	        // Verifica el resultado
	        assertTrue(resultado);

	        // Verifica las interacciones con el mock
	        verify(alumnoRepository).existsById(id);
	        verify(alumnoRepository).deleteById(id);
	    }
	 
	 
	 
	 @Test
	    public void testEliminarAlumnos_NoExistenAlumnos() {
	        // Configura el comportamiento del mock
	        Long id = 2L;
	        when(alumnoRepository.existsById(id)).thenReturn(false);

	        // Llama al método que se está probando
	        boolean resultado = alumnoService.eliminarAlumnos(id);

	        // Verifica el resultado
	        assertFalse(resultado);

	        // Verifica que deleteById no se ha llamado
	        verify(alumnoRepository).existsById(id);
	        verify(alumnoRepository, never()).deleteById(id);
	    }


}

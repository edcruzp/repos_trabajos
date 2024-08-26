package com.nubelity.projectv2.controller.test;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.nubelity.projectv2.controller.AlumnoController;
import com.nubelity.projectv2.service.AlumnoService;

public class AlumnoControllerTests {
	
	
	@Mock
    private AlumnoService alumnoService;
	
	@InjectMocks
    private AlumnoController alumnoController;
	
	
	 @BeforeEach
	    void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

}

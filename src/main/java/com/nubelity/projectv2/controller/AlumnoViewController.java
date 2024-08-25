//package com.nubelity.projectv2.controller;
//
//import java.util.Iterator;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.nubelity.projectv2.model.Alumno;
//import com.nubelity.projectv2.service.AlumnoService;
//
//@Controller
//@Validated
//@RequestMapping("/vista")
//public class AlumnoViewController {
//
//	@Autowired
//    private AlumnoService alumnoService;
//
////	@GetMapping("/alummnos")
////    public String hello(Model model) {
////		List<Alumno> alumnos = alumnoService.;
////        return new ResponseEntity<>(alumnos, HttpStatus.OK);
////    }
//	
//	@GetMapping("/alumnos")
//    public String listAlumnos(Model model) {
//		
//		List<Alumno> alumnos = alumnoService.buscarPorNombre("Juan");
//		
//		for (Iterator iterator = alumnos.iterator(); iterator.hasNext();) {
//			Alumno alumno = (Alumno) iterator.next();
//			
//			System.out.println("Alumno:" + alumno);
//			
//		}
//
//		model.addAttribute("alumnos", alumnos);
//
//        return "alumnos";
//    }
//
//    @GetMapping("/new")
//    public String showForm(Model model) {
//        model.addAttribute("alumno", new Alumno());
//        return "alumnos/form";
//    }
//
////    @PostMapping("/save")
////    public String saveAlumno(Model model) {
////        alumnoService.getAllUsers();
////        return "redirect:/alumnos";
////    }
//
//}

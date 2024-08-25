package com.nubelity.projectv2.utils;

public class Constants {
	
	public static final String QUERY_FINDBYNAME = "SELECT a FROM Alumno a WHERE a.nombre = :nombre";
	public static final String QUERY_FINDBYMATERIA = "SELECT a FROM Materia a WHERE a.nombre = :nombre";
	public static final String NOMBRE = "nombre";
	public static final String MATERIA = "materia";
	public static final String ALUMNO_NO_ENCONTRADO= "Alumno no encontrado";
}

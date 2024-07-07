package com.keepcoding.app.web.service;

import java.util.List;



import com.keepcoding.app.web.entity.Alumno;


public interface AlumnoService {

	public List<Alumno> mostrarAlumnos();
	
	public Alumno registrarAlumno(Alumno alumno);
	
	public Alumno actualizarAlumno(Alumno alumno);
	
	public void eliminarAlumno(Long id);
	
	public Alumno obtenerAlumno(Long id);
}

package com.keepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.app.web.entity.Alumno;
import com.keepcoding.app.web.service.AlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping("/listaAlumnos")
	public String listaAlumnos(Model modelo) {
		modelo.addAttribute("alumnos", alumnoService.mostrarAlumnos());
		return "alumno";
	}
	
	@GetMapping("/registrarAlumno")
	public String registrarAlumno(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "crear_alumno";
	}
	
	@PostMapping("/alumnoSave")
	public String saveAlumno(@ModelAttribute("alumno") Alumno alumno) {
		alumnoService.registrarAlumno(alumno);
		return "redirect:/listaAlumnos";
	}

	@GetMapping("/alumno/update/{id}")
	public String updateAlumnoForm(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("alumno_update", alumnoService.obtenerAlumno(id));
		return "editar_alumno";
	}
	
	@PostMapping("/alumno/{id}")
	public String updateAlumno(@PathVariable Long id,@ModelAttribute("alumno_update") Alumno alumno) {
		Alumno alumnoE = new Alumno();
		alumnoE.setId(id);
		alumnoE.setNombre(alumno.getNombre());
		alumnoE.setApellido(alumno.getApellido());
		alumnoE.setTelefono(alumno.getTelefono());
		alumnoE.setEmail(alumno.getEmail());
		alumnoE.setDni(alumno.getDni());
		alumnoE.setFecha_nac(alumno.getFecha_nac());
		alumnoService.actualizarAlumno(alumnoE);
		return "redirect:/listaAlumnos";
	}
	
	@GetMapping("/alumno/delete/{id}")
	public String deleteAlumno(@PathVariable Long id) {
		alumnoService.eliminarAlumno(id);
		return "redirect:/listaAlumnos";
	}
	
}

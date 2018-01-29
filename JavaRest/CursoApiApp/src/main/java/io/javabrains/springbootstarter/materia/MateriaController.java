package io.javabrains.springbootstarter.materia;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriaController {
	
	@Autowired
	private MateriaService materiaService;
	
	@RequestMapping("/materias")
	public List<Materia> getAllMaterias() {
		return materiaService.getAllMaterias();
	}
	
	@RequestMapping("/materias/{id}")
	public Materia getMateria(@PathVariable String id) {
		return materiaService.getMateria(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/materias")
	public void postMateria(@RequestBody Materia materia) {
		materiaService.addMateria(materia);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/materias/{id}")
	public void putMateria(@RequestBody Materia materia, @PathVariable String id) {
		materiaService.updateMateria(id, materia);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/materias/{id}")
	public void deleteMateria(@PathVariable String id) {
		materiaService.deleteMateria(id);
	}
}

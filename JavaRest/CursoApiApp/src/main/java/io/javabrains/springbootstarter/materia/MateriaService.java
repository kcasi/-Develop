package io.javabrains.springbootstarter.materia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {
	
	@Autowired
	private MateriaRepository materiaRepository;
	
	private List<Materia> materias = new ArrayList<>(Arrays.asList(
			new Materia("5","Spring Framework","Piccolo"),
			new Materia("6","Postgres","Goten"),
			new Materia("7","Git e GitHub","Gohan"),
			new Materia("8","CSharp","Goku")
		));
	
	public List<Materia> getAllMaterias(){
		// return materias;
		List<Materia> materias = new ArrayList<>();
		materiaRepository.findAll()
		.forEach(materias::add);
		return materias;
	}
	
	public Materia getMateria(String id) {
		return materias.stream().filter(m -> m.getId().equals(id)).findFirst().get();
	}

	public void addMateria(Materia materia) {
		//materias.add(materia);
		materiaRepository.save(materia);
	}

	public void updateMateria(String id, Materia materia) {
		for (int i=0; i<materias.size(); i++) {
			Materia m = materias.get(i);
			if (m.getId().equals(id)) {
				materias.set(i, materia);
				return;
			}
		}
	}

	public void deleteMateria(String id) {
		materias.removeIf(m -> m.getId().equals(id));
	}
	
}

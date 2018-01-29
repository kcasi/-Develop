package io.javabrains.springbootstarter.materia;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Materia {

	@Id
	private String id;
	private String materia;
	private String professor;
	
	public Materia() {

	}
	
	public Materia(String id, String materia, String professor) {
		super();
		this.id = id;
		this.materia = materia;
		this.professor = professor;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
}

package com.example.aula;

//import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matter {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	private String materia;
	private int sala;
	private String professor;
	
	public Long getId() { 
		return id;
	} 
	public void setId(Long id) { 
		this.id = id;
	} 
	public String getMateria() { 
		return materia;
	}
	public void setMateria(String materia) { 
		this.materia = materia;
	}
	public int getSala() { 
		return sala;
	} 
	public void setSala(int sala) { 
		this.sala = sala;
	}
	public String getProfessor() { 
		return professor;
	}
	public void setProfessor(String professor) { 
		this.professor = professor;
	}
	
}

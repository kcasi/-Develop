package com.example.aula;

import java.util.List;

import javax.persistence.Entity; 
import javax.persistence.FetchType; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.JoinColumn; 
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long matricula;
	private String nome;
	private String telefone;
	
	@OneToMany(targetEntity=Matter.class, fetch=FetchType.EAGER) 
	@JoinColumn(name="stud_id") 
	
	private List<Matter> matters;
	public Long getMatricula() { 
		return matricula;
	}
	public void setMatricula(Long matricula) { 
		this.matricula = matricula;
	}
	public String getNome() { 
		return nome;
	}
	public void setNome(String nome) { 
		this.nome = nome;
	}
	public String getTelefone() { 
		return telefone;
	}
	public void setTelefone(String telefone) { 
		this.telefone = telefone;
	}
	/*public List<Matter> getMatters() { 
		return matters;
	}
	public void setStorys(List<Matter> matters) { 
		this.matters = matters;
	}*/
}

package com.example.aula;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Student", path = "aulas")
public interface AulaRepository {
	/**
	 * Metodo que retorna lista de estudante com base no nome. * 
	 * @param nome 
	 * @return lista de estudantes 
	 */ 
	List<Student> findByName(@Param("nome") String nome);
	
	/**
	 * Metodo que retorna estudante com base na matricula. * 
	 * @param matricula 
	 * @return estudante. 
	 */ 
	@Query("SELECT a.name FROM Aluno a WHERE a.Matricula = :matricula") 
	Student findNameById(@Param("matricula") Long matricula);
	
	/** 
	 * Metodo que retorna lista de estudantes pesquisando por nome e ordenando pelo mesmo. * 
	 * @param nome 
	 * @return list of clients 
	 */ 
	List<Student> findByNameOrderByName(@Param("nome") String nome);

	/**
	 * Metodo que retorna todos os estudantes* 
	 * @return todos estudantes. 
	 */ 
	@Query("SELECT a.matricula, a.name, a.telefone FROM Aluno a") 
	List<Student> allStudents();
}


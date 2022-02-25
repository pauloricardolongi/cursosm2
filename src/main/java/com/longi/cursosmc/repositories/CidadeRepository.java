package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {
	

}

package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
	

}

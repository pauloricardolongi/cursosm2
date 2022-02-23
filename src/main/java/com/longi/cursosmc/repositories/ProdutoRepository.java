package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
	

}

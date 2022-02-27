package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
	

}

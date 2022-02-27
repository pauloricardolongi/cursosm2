package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
	

}

package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
	

}

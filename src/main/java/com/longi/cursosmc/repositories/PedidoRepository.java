package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {
	

}

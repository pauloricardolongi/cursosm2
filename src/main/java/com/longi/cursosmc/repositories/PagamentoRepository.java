package com.longi.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.longi.cursosmc.dominio.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {
	

}

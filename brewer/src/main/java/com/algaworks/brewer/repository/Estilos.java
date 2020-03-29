package com.algaworks.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Estilo;

/**
 * 
 * @author JGaray
 *
 */
@Repository
public interface Estilos extends JpaRepository<Estilo, Long> {

}

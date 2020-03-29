package com.algaworks.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Cerveja;

/**
 * 
 * @author JGaray
 *
 */
@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long> {

}
package com.cronicos.repository;

import com.cronicos.modelo.PersonaModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<PersonaModelo, Integer> {
    
}
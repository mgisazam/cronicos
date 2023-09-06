/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cronicos.interfaces;

import com.cronicos.modelo.PersonaModelo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mgisazam
 */
public interface iPersona extends CrudRepository<PersonaModelo, Integer>{
    
}

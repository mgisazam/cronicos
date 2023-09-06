/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cronicos.services;

import com.cronicos.interfaceService.iPersonaService;
import com.cronicos.interfaces.iPersona;
import com.cronicos.modelo.PersonaModelo;
import java.util.List;
import java.util.Optional;

import com.cronicos.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mgisazam
 */

@Service
public class PersonaService implements iPersonaService{

    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<PersonaModelo> listar() {
       return personaRepository.findAll();
    }

    @Override
    public Optional<PersonaModelo> listarId(int id) {
       return personaRepository.findById(id);
    }

    @Override
    public int save(PersonaModelo p) {
        return personaRepository.save(p).getId();
    }

    @Override
    public void delete(int id) {
         personaRepository.deleteById(id);
    }

}

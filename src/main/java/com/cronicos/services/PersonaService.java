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
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mgisazam
 */
public class PersonaService implements iPersonaService{
    @Autowired
    private iPersona data;
    
    @Override
    public List<PersonaModelo> listar() {
       return(List<PersonaModelo>) data.findAll();
    }

    @Override
    public Optional<PersonaModelo> listarId(int id) {
       return null;
    }

    @Override
    public int save(PersonaModelo p) {
        return 0;
    }

    @Override
    public void delete(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

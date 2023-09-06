/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cronicos.interfaceService;

import com.cronicos.interfaces.iPersona;
import com.cronicos.modelo.PersonaModelo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author mgisazam
 */
public interface iPersonaService {
    public List<PersonaModelo>listar();
    public Optional<PersonaModelo>listarId(int id);
    public int save (PersonaModelo p);
    public void delete (int i);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cronicos.controller;

import ch.qos.logback.core.model.Model;
import com.cronicos.interfaceService.iPersonaService;
import com.cronicos.modelo.PersonaModelo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mgisazam
 */
@Controller
@RequestMapping
public class PersonaController {
    @Autowired
    private iPersonaService service;
    
    @GetMapping("/listar")
    public String listar(Model model) {
        List<PersonaModelo>personas=service.listar();
        return "index";        
    }
    
}

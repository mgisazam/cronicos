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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<PersonaModelo>> listar() {
        List<PersonaModelo> personas = service.listar();
         return  ResponseEntity.ok(personas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonaModelo> buscarPorId(@PathVariable("id") Integer id){
      var persona = service.listarId(id);
      if (persona.isPresent()){
       return ResponseEntity.ok(persona.get());
      }
     return new ResponseEntity(null, HttpStatus.NOT_FOUND);
    }
 
    @PostMapping("/")
    public ResponseEntity<Integer> guardar(@RequestBody PersonaModelo persona){
     return new ResponseEntity<>(service.save(persona), HttpStatus.OK);
    }
 
   @PutMapping("/")
   public ResponseEntity<Integer> actualizar(@RequestBody PersonaModelo persona){
     return new ResponseEntity<>(service.save(persona), HttpStatus.OK);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cronicos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.logging.Logger;

/**
 *
 * @author mgisazam
 */

@Table(name = "persona")
@Entity

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class PersonaModelo {
    private int id;
    private int regimen;
    private int tipoDocumento;
    private String numeroDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private int sexo;
    private int municipio;
    private String direccion;
    private String telefono;
}

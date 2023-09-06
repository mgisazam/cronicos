/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cronicos.modelo;

import jakarta.persistence.Entity;
import java.util.logging.Logger;

/**
 *
 * @author mgisazam
 */

public class PersonaModelo {
    private int idPersona;
    private int regimen;
    private int tDocPersona;
    private String docPersona;
    private String nom1Persona;
    private String nom2Persona;
    private String ape1Persona;
    private String ape2Persona;
    private String fechaNto;
    private int Sexo;
    private int muni;
    private String direccion;
    private String telefono;

    public PersonaModelo() {
    }

    public PersonaModelo(int idPersona, int regimen, int tDocPersona, String docPersona, String nom1Persona, String nom2Persona, String ape1Persona, String ape2Persona, String fechaNto, int Sexo, int muni, String direccion, String telefono) {
        super();
        this.idPersona = idPersona;
        this.regimen = regimen;
        this.tDocPersona = tDocPersona;
        this.docPersona = docPersona;
        this.nom1Persona = nom1Persona;
        this.nom2Persona = nom2Persona;
        this.ape1Persona = ape1Persona;
        this.ape2Persona = ape2Persona;
        this.fechaNto = fechaNto;
        this.Sexo = Sexo;
        this.muni = muni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public int getRegimen() {
        return regimen;
    }

    public int gettDocPersona() {
        return tDocPersona;
    }

    public String getDocPersona() {
        return docPersona;
    }

    public String getNom1Persona() {
        return nom1Persona;
    }

    public String getNom2Persona() {
        return nom2Persona;
    }

    public String getApe1Persona() {
        return ape1Persona;
    }

    public String getApe2Persona() {
        return ape2Persona;
    }

    public String getFechaNto() {
        return fechaNto;
    }

    public int getSexo() {
        return Sexo;
    }

    public int getMuni() {
        return muni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setRegimen(int regimen) {
        this.regimen = regimen;
    }

    public void settDocPersona(int tDocPersona) {
        this.tDocPersona = tDocPersona;
    }

    public void setDocPersona(String docPersona) {
        this.docPersona = docPersona;
    }

    public void setNom1Persona(String nom1Persona) {
        this.nom1Persona = nom1Persona;
    }

    public void setNom2Persona(String nom2Persona) {
        this.nom2Persona = nom2Persona;
    }

    public void setApe1Persona(String ape1Persona) {
        this.ape1Persona = ape1Persona;
    }

    public void setApe2Persona(String ape2Persona) {
        this.ape2Persona = ape2Persona;
    }

    public void setFechaNto(String fechaNto) {
        this.fechaNto = fechaNto;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

    public void setMuni(int muni) {
        this.muni = muni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

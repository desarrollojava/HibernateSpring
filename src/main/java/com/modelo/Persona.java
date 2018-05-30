/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @Column(name = "idPersona", unique = true, nullable = false)
    private int idPersona;
    @Column(name = "nombres", unique = true, nullable = false)
    private String nombres;
    @Column(name = "apellidos", unique = true, nullable = false)
    private String apellidos;
    @Column(name = "direccionDomicilio", unique = true, nullable = false)
    private String direccionDomicilio;
    
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="idPersona")
//    @Column(name="idx")
    private List<Libro> libros;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

  

}

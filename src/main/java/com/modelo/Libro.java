/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    @Id
    @Column(name = "idLibro", unique = true, nullable = false)
    private int idLibro;
    @Column(name = "nombres", unique = true, nullable = false)
    private String nombres;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Libro(int idLibro, String nombres, Persona persona) {
        this.idLibro = idLibro;
        this.nombres = nombres;
        this.persona = persona;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Libro;
import com.modelo.Persona;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IPersonaDao {
    public void agregarPersona(Persona persona);

    public void actualizarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

    public void buscarPersonaPorId(int idPersona);

    public List<Persona> buscarTodo();

    public int contarPersonasPorNombre(Persona persona);

    public int contadorPersonas(); 
}

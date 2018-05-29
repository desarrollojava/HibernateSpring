/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Libro;
import com.modelo.Persona;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class IPersonaDaoImpl implements IPersonaDao {
    private static Log logger = LogFactory.getLog(IPersonaDaoImpl.class);

    private SessionFactory sessionFactory;

    @Autowired
    public IPersonaDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void agregarPersona(Persona persona) {
        try {
        currentSession().saveOrUpdate(persona);
        } catch (Exception ex) {
            logger.error(ex.getCause());
        }
    }

    @Override
    public void actualizarPersona(Persona persona) {
        currentSession().update(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarPersonaPorId(int idPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public List<Persona> buscarTodo() {
        try {
            return currentSession().createQuery("from Persona").list();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public int contarPersonasPorNombre(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contadorPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

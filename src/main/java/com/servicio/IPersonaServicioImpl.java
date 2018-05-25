/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.dao.IPersonaDao;
import com.modelo.Persona;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IPersonaServicioImpl implements IPersonaServicio {
    
    private static Log LOGGER = LogFactory.getLog(IPersonaServicioImpl.class);
    
    @Autowired
    IPersonaDao iPersonaDao;
    
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public void agregarPersona(Persona persona) {
        try {
            iPersonaDao.agregarPersona(persona);
        } catch (Exception ex) {
            LOGGER.error(ex.getCause());
        }
        
    }
    
    @Override
    public void actualizarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<Persona> buscarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

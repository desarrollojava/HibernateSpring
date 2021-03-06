
import com.dao.IPersonaDao;
import com.modelo.Libro;
import com.modelo.Persona;
import com.servicio.IPersonaServicio;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/com/configuracion/dataSource-test.xml", "classpath:/com/configuracion/applicationContext.xml"})
public class TestCrud {

    private static Log logger = LogFactory.getLog(TestCrud.class);

    @Autowired
    private IPersonaDao iPersonaDao;

    @Autowired
    private IPersonaServicio iPersonaServicio;

    @Test
//    @Transactional
    public void Test() {
        try {
//            Libro libro = new Libro();
//            libro.setNombres("Informatica");
            List<Libro> listaLibro = new ArrayList<>();
//            listaLibro.add(libro);

            Persona persona = new Persona();
            persona.setIdPersona(2);
            persona.setApellidos("Pedro1");
            persona.setNombres("Diego1");
            persona.setDireccionDomicilio("Quito1");
            
            listaLibro.add(new Libro(2, "fisica1",persona));
            persona.setLibros(listaLibro);

            iPersonaServicio.agregarPersona(persona);
//            List<Persona> lista = iPersonaDao.buscarTodo();
//            for (Persona obj : lista) {
//                logger.info("persona:-->" + obj.getApellidos());
//            }
        } catch (Exception ex) {
            logger.error("error:-->" + ex.getMessage());
        }

    }

}

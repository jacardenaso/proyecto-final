/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.fin;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jr.Armando
 */

@RestController
@CrossOrigin
public class ControladorUsuario {
    
    @Autowired RepositorioUsuario repoU;
    @RequestMapping(value="/usuario",method=RequestMethod.GET, headers = {"Accept=Appication/jason"})
    public String guardarUsuario(){
    
    Direccion d=new Direccion("Juan","rara",21321);
    Usuario u=new Usuario("s213ed","armando","ja@com",d);
    
    repoU.save(u);
    return "Usuario guardado";
    
    }
     
    @RequestMapping(value="/usuario", method=RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizar(@RequestBody String json)throws Exception{
        Estatus e=new Estatus();
        e.setSuccess(true);
                 ObjectMapper  maper=new ObjectMapper();
         Usuario mensa=        maper.readValue(json, Usuario.class);
         repoU.save(mensa);
         System.out.println("El nombre es: "+mensa.getNombre()+ " el email es:"+mensa.getEmail()+"El RFC"+mensa.getRfc());
        return e;
    }
    
            
//    @RequestMapping(value="/usuario", method = RequestMethod.GET, headers = {"Accept=application/json"})
//    public ArrayList<Usuario> getTodos(){
//         
//        return (ArrayList<Usuario>) repoU.findAll();
//    }
    
    
    
    
}

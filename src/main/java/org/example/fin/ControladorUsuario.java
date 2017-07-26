/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.fin;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
//    @RequestMapping(value="/usuario",method=RequestMethod.GET, headers = {"Accept=Appication/jason"})
//    public String guardarUsuario(){
//    
//    Direccion d=new Direccion("Juan","rara",21321);
//    Usuario u=new Usuario("s213ed","armando","ja@com",d);
//    
//    repoU.save(u);
//    return "Usuario guardado";
//    
//    }
    
            
    @RequestMapping(value="/usuario", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Usuario> getTodos(){
         
        return (ArrayList<Usuario>) repoU.findAll();
    }
    
    
}

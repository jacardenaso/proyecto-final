/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.fin;

import org.hibernate.validator.constraints.br.TituloEleitoral;
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
public class ControladorMensaje {
       @Autowired RepositorioMensaje rm;
       
    @RequestMapping(value="/guardar-mensaje",method=RequestMethod.GET,headers = {"Accept=text/html"})

    public String guardarMensaje(){
    
    
    rm.save(new Mensaje("Mi primir registroi en mongo"));
    return "Mensaje guardado";
    }
    
}

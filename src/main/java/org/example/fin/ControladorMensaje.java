/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.fin;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
   public class ControladorMensaje {
    
     @Autowired RepositorioMensaje repoMensaje;
    
    //caso post
    @RequestMapping(value="/mensaje",method=RequestMethod.POST,headers = {"Accept=application/json"})
            public Estatus guardar(@RequestBody String json){
            
            System.out.println(json);
            Estatus e=new Estatus();
            e.setSucces(true);
            return e;
            }
            
    @RequestMapping(value="/mensaje", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Mensaje> getTodos(){
         
        return (ArrayList<Mensaje>) repoMensaje.findAll();
    }
    
    
    
    @RequestMapping(value="/mensaje", method=RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizar(@RequestBody String json)throws Exception{
        Estatus e=new Estatus();
        e.setSuccess(true);
                 ObjectMapper  maper=new ObjectMapper();
         Mensaje mensa=        maper.readValue(json, Mensaje.class);
         repoMensaje.save(mensa);
         System.out.println("El titulo es: "+mensa.getTitulo()+ " el cuerpo es:"+mensa.getCuerpo());
        return e;
    }
    
    @RequestMapping(value="/mensaje/{id}", method=RequestMethod.DELETE, headers = {"Accept=application/json"})
    public Estatus borrar(@PathVariable String id){
        System.out.println("Llego con un id "+id);
        Estatus e=new Estatus();
        repoMensaje.delete(id);
        if(repoMensaje.findOne(id)==null) e.setSuccess(true);
        else e.setSuccess(false);
       
        return e;
    }
    
            }
    
    
    
    
    
    
    
    
//    @Autowired RepositorioMensaje rm;
//
//        @RequestMapping(value="/guardar-mensaje",method=RequestMethod.GET,headers = {"Accept=text/html"})
//
//        public String guardarMensaje(){
//
//
//        rm.save(new Mensaje("Mi primir registroi en mongo"));
//        return "Mensaje guardado";
//        }
    

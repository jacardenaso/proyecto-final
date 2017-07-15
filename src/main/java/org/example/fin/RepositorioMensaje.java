/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.fin;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Jr.Armando
 */
public interface RepositorioMensaje extends MongoRepository<Mensaje, String>{
    
    
    
}

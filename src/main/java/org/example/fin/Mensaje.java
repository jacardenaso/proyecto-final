/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.fin;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Jr.Armando
 */
public class Mensaje {
    
   
    
    
    
    @Id
    private String id;

    public Mensaje() {
    }
    
    private String cuerpo;
    private String titulo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Mensaje(String id, String titulo,String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo=cuerpo;
    }

    public Mensaje(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", titulo=" + titulo +"cuerpo=" + cuerpo+ '}';
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.fin;

/**
 *
 * @author Jr.Armando
 */
public class Estatus {
  private boolean succes;  

    public Estatus() {
    }

    public Estatus(boolean succes) {
        this.succes = succes;
    }

    public boolean isSucces() {
        return succes;
    }

    public void setSucces(boolean succes) {
        this.succes = succes;
    }

    void setSuccess(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

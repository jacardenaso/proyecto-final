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
class Direccion {
  private String calle;
private String colonia;
private long cp;

    public Direccion() {
    }

    public Direccion(String calle, String colonia, long cp) {
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
}

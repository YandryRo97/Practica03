/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PC-MATIC
 */
public class Casa {
    private int predio;
    private double longitud;
    private double anchura;

    public Casa(int predio, double longitud, double anchura) {
        this.predio = predio;
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public int getPredio() {
        return predio;
    }

    public void setPredio(int predio) {
        this.predio = predio;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "Casa{" + "predio=" + predio + ", longitud=" + longitud + ", anchura=" + anchura + '}';
    }
    
}

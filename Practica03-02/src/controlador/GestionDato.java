/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Hashtable;
import java.util.List;
import modelo.Casa;
import modelo.Propietario;
import libreria.Diccionario;
import Listar.Lista;
import Listar.Nodo;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author PC-MATIC
 */
public class GestionDato {
   private List<Casa> casaList;
   private Map<String, Propietario> hasPropietario;

   
    public GestionDato(List<Casa> casaList, Map<String, Propietario> hasPropietario) {
        this.casaList = casaList;
        this.hasPropietario = hasPropietario;
    }

    

    

    public List<Casa> getCasaList() {
        return casaList;
    }

    public void setCasaList(List<Casa> casaList) {
        this.casaList = casaList;
    }

    public Map<String, Propietario> getHasPropietario() {
        return hasPropietario;
    }

    public void setHasPropietario(Map<String, Propietario> hasPropietario) {
        this.hasPropietario = hasPropietario;
    }

    

    
   
   
}

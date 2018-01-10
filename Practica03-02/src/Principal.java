
import Listar.Lista;
import controlador.GestionDato;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import modelo.Casa;
import modelo.Propietario;
import libreria.Diccionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-MATIC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String, Propietario> dato = new HashMap<String, Propietario>();
        Casa c1 = new Casa(123,10.25,10.25);
        Casa c2 = new Casa(125,12.25,12.25);
        List<Casa> cL = new ArrayList();
        cL.add(c1);
        cL.add(c2);
        GestionDato gD = new GestionDato(cL,dato);
        Propietario p1 = new Propietario(0705744233,"Yandry", "Romero");
        Propietario p2 = new Propietario(0105744244,"Javier","Yunga");
        Diccionario d = new Diccionario(new HashMap<String, Propietario>());
        d.agregarElemento("0705744233", p1);
        d.agregarElemento("0105744244", p2);
        d.recuperarElementos();
        System.out.println("");
        System.out.println(d.eliminarElemento("0105744244"));
    }
    
}

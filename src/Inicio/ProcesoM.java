/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class ProcesoM {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public ProcesoM(){}
    
    public ProcesoM(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Modulo p){
        this.a.add(p);
    }

    public void modificarRegistro(int i, Modulo p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public Modulo obtenerRegistro(int i){
        return (Modulo)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
    public int buscaCodigo(int piezas_vendidas){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(piezas_vendidas == obtenerRegistro(i).getpiezas_vendidas())return i;
        }
        return -1;
    }

   
    
}

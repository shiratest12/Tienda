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
public class Proceso2 {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso2(){}
    
    public Proceso2(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Venta p){
        this.a.add(p);
    }

    public void modificarRegistro(int i, Venta p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public Venta obtenerRegistro(int i){
        return (Venta)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
    public int buscaCodigo(int codigo2){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(codigo2 == obtenerRegistro(i).getCodigo2())return i;
        }
        return -1;
    }

   
    
}

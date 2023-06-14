/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

/**
 *
 * @author Viri
 */
public class Clientes {
    
    //clientes
    private int codigo;
    private String nombre;
    
     public Clientes(){}
     
      public Clientes(int codigo,String nombre){
        //codigo
        this.codigo = codigo;
        this.nombre = nombre; 
        }
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

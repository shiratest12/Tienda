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
public class Proceso1 {
	
	private ArrayList<Object> a = new ArrayList<Object>();
	
	public Proceso1(){}
	
	public Proceso1(ArrayList<Object> a){
		this.a = a;
	}
		
		public void agregarRegistro(Articulo p){
			this.a.add(p);
		}
			
			public void modificarRegistro(int i, Articulo p){
				this.a.set(i, p);
			}
				
				public void eliminarRegistro(int i){
					this.a.remove(i);
				}
					
					public Articulo obtenerRegistro(int i){
						return (Articulo)a.get(i);
					}
						
						public int cantidadRegistro(){
							return this.a.size();
						}
							
							public int buscaCodigo(int codigo1){
								for(int i = 0; i < cantidadRegistro(); i++){
									if(codigo1 == obtenerRegistro(i).getCodigo1())return i;
								}
								return -1;
							}
								
								
								
}

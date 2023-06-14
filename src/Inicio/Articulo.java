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
public class Articulo {
    //articulo
	private int codigo1;
	private String nombre1;
	private double precio;//costo
	private String venta;
        
        
	public Articulo(){}
	
	public Articulo(//clientes
					
					//articulo
					int codigo1,
					String nombre1,
					double precio,
					String venta){
            //articulo
		this.codigo1 = codigo1;
		this.nombre1 = nombre1;
		this.precio = precio;
		this.venta = venta;
        }
        //articulo
		public int getCodigo1() {
			return codigo1;
		}
		
		
		public void setCodigo1(int codigo1) {
			this.codigo1 = codigo1;
		}
		
		
		public String getNombre1() {
			return nombre1;
		}
		
		
		public void setNombre1(String nombre1) {
			this.nombre1 = nombre1;
		}
		
		
		
		public double getPrecio() {
			return precio;
		}
		
		
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		public String getventa() {
			return venta;
		}
		
		public void setventa(String venta) {
			this.venta = venta;
		}

    
		
}

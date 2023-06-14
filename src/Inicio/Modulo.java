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
public class Modulo {
    //modulo
	private String articulo;
	private int piezas_vendidas;
	private double precio2;//costo
	private String venta3;
	private int costo_total;
	private double venta_total;//costo  
	private String descripcion;//grado de satisfaccion
	private double utilidades;
	
      public Modulo(){}
	
	public Modulo(String articulo,int piezas_vendidas,double precio2,String venta3,int costo_total,double venta_total,String descripcion){

					
	
		//modulo
		this.articulo = articulo;
		this. piezas_vendidas =  piezas_vendidas;
		this.precio2= precio2;
		this.venta3= venta3;
		this.costo_total=costo_total;
		this.venta_total = venta_total; 
		this.descripcion = descripcion;
	
	}

   
		
		//modulo
		
		public String getarticulo() {
			return articulo;
		}
		
		
		public void setarticulo(String articulo) {
			this.articulo = articulo;
		}
		
		public int getpiezas_vendidas() {
			return piezas_vendidas;
		}
		
		
		public void setpiezas_vendidas(int piezas_vendidas) {
			this.piezas_vendidas = piezas_vendidas;
		}
		
		public double getPrecio2() {
			return precio2;
		}
		
		
		public void setPrecio2(double precio2) {
			this.precio2 = precio2;
		}
		
		public String getventa3() {
			return venta3;
		}
		
		
		public void setventa3(String venta3) {
			this.venta3 = venta3;
		}
		
		
		public int getcosto_total() {
			return costo_total;
		}
		
		
		public void setcosto_total(int costo_total) {
			this.costo_total = costo_total;
		}
		
		
		public String getDescripcion() {
			return (String) descripcion;
		}
		
		//grado de satisfaccion
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		public double getutilidades() {
			return utilidades;
		}
		
		
		public void setutilidades(double utilidades) {
			this.utilidades=(venta_total-costo_total);
		}
		
		public double getventa_total() {
			return venta_total;
		}
		
		
		public void setventa_total(double venta_total) {
			this.venta_total = venta_total;
		}
		
			
}
  


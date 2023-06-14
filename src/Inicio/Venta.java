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

     
     
public class Venta {
   private int codigo2;
	private String fecha;
	private int idcliente;
	private int idarticulo;
	private double precio1;//costo
	private String venta1;
        public Venta(){}
	
	public Venta(int codigo2,String fecha,int idcliente,int idarticulo,double precio1, String venta1){//venta 
		this.codigo2  = codigo2;
		this.fecha = fecha;
		this.idcliente = idcliente;
		this.idarticulo = idarticulo;
		this.precio1 =precio1;
		this.venta1 = venta1;}

 
                
 //venta
		public int getCodigo2() {
			return codigo2; }
		
		public void setCodigo2(int codigo2) {
			this.codigo2 = codigo2 ;}
		
		public String getfecha() {
			return fecha;   }
		
		
		public void setfecha(String fecha) {
			this.fecha = fecha;  }
		
		public int getidcliente() {
			return idcliente; }
		
		public void setidcliente(int idcliente) {
			this.idcliente = idcliente ;}
		
		public int getidarticulo() {
			return idarticulo; }
		
		public void setidarticulo(int idarticulo) {
			this.idarticulo = idarticulo ;}
		
		public double getPrecio1() {
			return precio1;
		}
		
		
		public void setPrecio1(double precio1) {
			this.precio1 = precio1;
		}
		
		
		public String getventa1() {
			return venta1;
		}
		
		
		public void setventa1(String venta1) {
			this.venta1 = venta1;
		}               
}

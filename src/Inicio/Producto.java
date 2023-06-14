/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import java.io.Serializable;

/**
 *
 * @author viri
 */
public class Producto {
    //clientes
    private int codigo;
    private String nombre;
    //articulo
    private int codigo1;
    private String nombre1;
    private double precio;//costo
    private String venta;
    //venta 
     private int codigo2;
    private String fecha;
    private int idcliente;
    private int idarticulo;
    private double precio1;//costo
    private String venta1;
    //modulo
      private String articulo;
      private int piezas_vendidas;
    private double precio2;//costo
    private String venta3;
    private int costo_total;
    private double venta_total;//costo  
    private String descripcion;//grado de satisfaccion
private double utilidades;
               
    public Producto(){}
    
    public Producto(//clientes
     int codigo,
     String nombre,
    //articulo
     int codigo1,
   String nombre1,
     double precio,
     String venta,
    //venta 
      int codigo2,
     String fecha,
     int idcliente,
     int idarticulo,
    double precio1,
     String venta1,
    //modulo
      String articulo,
       int piezas_vendidas,
     double precio2,
     String venta3,
    int costo_total,
     double venta_total, double utilidades,
    String descripcion){
        //codigo
        this.codigo = codigo;
        this.nombre = nombre; 
            //articulo
    this.codigo1 = codigo1;
  this.nombre1 = nombre1;
    this.precio = precio;
    this.venta = venta;
    //venta 
    this.codigo2  = codigo2;
    this.fecha = fecha;
    this.idcliente = idcliente;
    this.idarticulo = idarticulo;
    this.precio1 =precio1;
    this.venta1 = venta1;
    //modulo
    this.articulo = articulo;
    this. piezas_vendidas =  piezas_vendidas;
    this.precio2= precio2;
    this.venta3= venta3;
    this.costo_total=costo_total;
    this.venta_total = venta_total; 
     this.descripcion = descripcion;
     this.utilidades=utilidades;
    }
  //clientes

  

 /**
     * @return the codigo
     */
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
